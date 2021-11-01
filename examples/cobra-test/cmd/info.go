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

// infoCmd represents the info command
var infoCmd = &cobra.Command{
	Use:   "info",
	Short: "Displays your server infos",
}

func init() {
	infoCmd.Run = info
	rootCmd.AddCommand(infoCmd)
}

func info(cmd *cobra.Command, args []string) {
	host := viper.GetString("host")
	user := viper.GetString("username")
	password := viper.GetString("password")

	client := ksqldb.NewClient(host, user, password).Debug()

	info, err := client.ServerInfo()
	if err != nil {
		log.Fatal(err)
	}
	fmt.Println(fmt.Sprintf("Version        : %v", info.Version))
	fmt.Println(fmt.Sprintf("KSQLServiceID  : %v", info.KSQLServiceID))
	fmt.Println(fmt.Sprintf("KafkaClusterID : %v", info.KafkaClusterID))
}
