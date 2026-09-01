@echo off
call compile.bat
java -classpath target\classes;target\dependency\* TestRunner
