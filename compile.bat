@echo off
if not exist target\classes mkdir target\classes
javac -classpath .;target\classes;target\dependency\* -d target\classes src\main\java\*.java src\test\java\*.java
