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
	"fmt"
	"log"

	"github.com/rmoff/ksqldb-go"
	"github.com/spf13/cobra"
	"github.com/spf13/viper"
)

// serverhealthCmd represents the serverhealth command
var serverhealthCmd = &cobra.Command{
	Use:   "serverhealth",
	Short: "serverhealts of your servers",
}

func init() {
	serverhealthCmd.Run = serverhealth
	rootCmd.AddCommand(serverhealthCmd)
}

func serverhealth(cmd *cobra.Command, args []string) {
	host := viper.GetString("host")
	user := viper.GetString("username")
	password := viper.GetString("password")

	client := ksqldb.NewClient(host, user, password)

	health, err := client.Healthcheck()
	if err != nil {
		log.Fatal(err)
	}

	fmt.Println(fmt.Sprintf("Overall healthiness   : %v", GoodOrBad(*health.IsHealthy)))
	fmt.Println(fmt.Sprintf("Kafka healthiness     : %v", GoodOrBad(*health.Details.Kafka.IsHealthy)))
	fmt.Println(fmt.Sprintf("Metastore healthiness : %v", GoodOrBad(*health.Details.Metastore.IsHealthy)))
}

func GoodOrBad(healthiness bool) string {
	if healthiness {
		return "healthy"
	}
	return "unhealthy"
}
