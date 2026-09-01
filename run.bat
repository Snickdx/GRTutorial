@echo off
call compile.bat
java -classpath .;target\dependency\* Main
