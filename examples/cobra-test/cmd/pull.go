/*
Copyright © 2021 Thomas Meitz <thme219@gmail.com>

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package cmd

import (
	"context"
	"fmt"
	"log"
	"time"

	"github.com/rmoff/ksqldb-go"
	"github.com/spf13/cobra"
	"github.com/spf13/viper"
)

// pullCmd represents the pull command
var pullCmd = &cobra.Command{
	Use:   "pull",
	Short: "print the dog stats",
}

func init() {
	pullCmd.Run = dogstats
	rootCmd.AddCommand(pullCmd)

	pullCmd.Flags().StringP("dogsize", "d", "medium", "dogsizes are small|medium|large")
	if err := viper.BindPFlag("dogsize", pullCmd.Flags().Lookup("dogsize")); err != nil {
		log.Fatal(err)
	}
}

func dogstats(cmd *cobra.Command, args []string) {
	host := viper.GetString("host")
	user := viper.GetString("username")
	password := viper.GetString("password")
	s := viper.GetString("dogsize")

	client := ksqldb.NewClient(host, user, password).Debug()

	k := "SELECT TIMESTAMPTOSTRING(WINDOWSTART,'yyyy-MM-dd HH:mm:ss','Europe/London') AS WINDOW_START, TIMESTAMPTOSTRING(WINDOWEND,'HH:mm:ss','Europe/London') AS WINDOW_END, DOG_SIZE, DOGS_CT FROM DOGS_BY_SIZE WHERE DOG_SIZE='" + s + "';"

	ctx, cancel := context.WithTimeout(context.TODO(), 10*time.Second)
	defer cancel()
	_, r, err := client.Pull(ctx, k, true)
	if err != nil {
		log.Fatal(err)
	}

	var WINDOW_START string
	var WINDOW_END string
	var DOG_SIZE string
	var DOGS_CT float64
	for _, row := range r {

		if row != nil {
			// Should do some type assertions here
			WINDOW_START = row[0].(string)
			WINDOW_END = row[1].(string)
			DOG_SIZE = row[2].(string)
			DOGS_CT = row[3].(float64)
			dogs := fmt.Sprintf("🐶 There are %v dogs size %v between %v and %v", DOGS_CT, DOG_SIZE, WINDOW_START, WINDOW_END)
			fmt.Println(dogs)
		}
	}

}
