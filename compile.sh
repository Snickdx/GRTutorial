#!/bin/bash
set -e
mkdir -p target/classes
javac -classpath ".:target/classes:target/dependency/*" -d target/classes $(find src -name "*.java")
