#!/bin/bash
set -e
./compile.sh
java -classpath "target/classes:target/dependency/*" TestRunner "$@"
