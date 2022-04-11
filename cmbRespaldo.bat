rem @echo off
    for /f "tokens=2-4 delims=/ " %%l in ("%date%") do (
	set day=%%l
	set month=%%j
	set year=%%k
    )
   set datestr=%year%_%month%_%day%

   set BACKUP_FILE="C:/pgBackup/Bkp%datestr%.backup"
   echo backup file name is %BACKUP_FILE%
   SET PGUSER=postgres
   SET PGPASSWORD=admin

echo on
cls 

"C:\Program Files\PostgreSQL\11\bin\pg_dump" -h localhost -p 5432 -U %PGUSER% -S %PGPASSWORD% -F c -b -v -f %BACKUP_FILE% dbstock

