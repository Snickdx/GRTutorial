#!/bin/bash
set -e
mkdir -p target/dependency
mvn dependency:copy-dependencies -DoutputDirectory=target/dependency
