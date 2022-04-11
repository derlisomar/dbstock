rem @echo off
    for /f "tokens=2-4 delims=/ " %%l in ("%date%") do (
	set day=%%l
	set month=%%j
	set year=%%k
    )
   set datestr=%year%_%month%_%day%

   set BACKUP_FILE="C:/Sistema/dbstock/Backup/backup"
   echo backup file name is %BACKUP_FILE%
   SET PGUSER=postgres
   SET PGPASSWORD=admin

echo on
cls 

"C:\Program Files\PostgreSQL\10\bin\pg_dump" -h 192.168.0.10 -p 5432 -U %PGUSER% -S %PGPASSWORD% -F c -b -v -f %BACKUP_FILE% dbstock


