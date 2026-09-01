@echo off
if not exist target\dependency mkdir target\dependency
mvn dependency:copy-dependencies -DoutputDirectory=target\dependency
