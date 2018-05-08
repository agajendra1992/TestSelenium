@echo off
echo Hello this a test batch file
@echo off
SET DEVELOPMENT_HOME=C:\Users\user\git\TestSelenium

cd %DEVELOPMENT_HOME%\TestSelenium\
call mvn install

