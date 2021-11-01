#!/bin/bash

java -jar $PWD/antlr/antlr-4.9.2-complete.jar -Dlanguage=Go -o parser SqlBase.g4 