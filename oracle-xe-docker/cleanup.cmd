@echo off
set DB_USER=HOME
set DB_PASS=HOME
set DB_CONN=localhost:5050/XEPDB1
set SQL_DIR=cleanup-scripts

for %%f in (%SQL_DIR%\*.sql) do (
    echo Futtatom: %%f
    sqlplus -S %DB_USER%/%DB_PASS%@%DB_CONN% @"%%f"
)
pause