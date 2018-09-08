@ECHO OFF

SET "CURRENT_DIR=%cd%"
SET "ANALYZER_LIB=%CURRENT_DIR%\analyzer"
call java -jar %ANALYZER_LIB%\diagnosis-analyzer.jar