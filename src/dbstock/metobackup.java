/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstock;

import java.io.File;

/**
 *
 * @author Derlis
 */
public class metobackup {
    


public class BaseDatos {

    private Process proceso;
    private ProcessBuilder constructor;

    private final String host = "localhost";
    private final String puerto="5432";
    private final String usuario = "postgres";
    private final String clave = "admin";
    private final String bd="dbstock";
    private final String formato="custom";

    public boolean BD_backup(String path){
        boolean hecho=false;
        try{
            File pgdump= new File("\"C:\\Program Files\\PostgreSQL\\10\\bin\\pg_dump.exe\"");
            
            if(pgdump.exists()){
                if(!path.equalsIgnoreCase("")) {
                    //constructor = new ProcessBuilder("C:/Program Files/PostgreSQL/9.4/bin\\pg_dump.exe", "--verbose", "--format", formato, "-f", path);
                    constructor = new ProcessBuilder("'"+pgdump+"' -i -h '"+host+"' -p '"+puerto+"' -U '"+usuario+"' -F c -b -v -f  '"+bd+"'"); 
                    
                } else {                             
                    constructor = new ProcessBuilder("C:/Program Files/PostgreSQL/9.4/bin\\pg_dump.exe", "--verbose", "--inserts", "--column-inserts", "-f", path);
                    System.out.println("ERROR");
                }
                constructor.environment().put("PGHOST", host);
                constructor.environment().put("PGPORT", puerto);
                constructor.environment().put("PGUSER", usuario);
                constructor.environment().put("PGPASSWORD", clave);
                constructor.environment().put("PGDATABASE", bd);
                constructor.redirectErrorStream(true);
                proceso= constructor.start();
            //    escribirProcess(proceso);
                System.out.println("terminado backup " + path);
                hecho=true;
            }else{
                if(!path.equalsIgnoreCase("")) {
                    constructor = new ProcessBuilder("/opt/PostgreSQL/9.4/bin/pg_dump", "--verbose", "--format", formato, "-f", path);
                } else {                             
                    constructor = new ProcessBuilder("/opt/PostgreSQL/9.4/bin/pg_dump", "--verbose", "--inserts", "--column-inserts", "-f", path);
                    System.out.println("ERROR");
                }
                constructor.environment().put("PGHOST", host);
                constructor.environment().put("PGPORT", puerto);
                constructor.environment().put("PGUSER", usuario);
                constructor.environment().put("PGPASSWORD", clave);
                constructor.environment().put("PGDATABASE", bd);
                constructor.redirectErrorStream(true);
                proceso= constructor.start();
           //     escribirProcess(proceso);
                System.out.println("terminado backup " + path);
                hecho=true;
            }
        }catch(Exception ex){
            System.err.println(ex.getMessage()+ "Error de backup");
            hecho=false;
        }
        return hecho;
    }


    public boolean restaurarBackup(String path) {
        boolean hecho=false;
        try {
            File pgrestore = new File("C:/Program Files/PostgreSQL/9.4/bin\\pg_restore.exe");
            if(pgrestore.exists()){
                constructor = new ProcessBuilder("C:/Program Files/PostgreSQL/9.4/bin\\pg_restore.exe", "-i", "-h", host, "-p", puerto, "-U", usuario, "-d", bd, "-v", path);
                constructor.environment().put("PGPASSWORD", clave);
                constructor.redirectErrorStream(true);
                proceso=constructor.start();
           //     escribirProcess(proceso);
                hecho=true;
            }else{
                constructor = new ProcessBuilder("/opt/PostgreSQL/9.4/bin/pg_restore", "-i", "-h", host, "-p", puerto, "-U", usuario, "-d", bd, "-v", path);
                constructor.environment().put("PGPASSWORD", clave);
                constructor.redirectErrorStream(true);
                proceso=constructor.start();
        //        escribirProcess(proceso);
                hecho=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            hecho=false;
        }
        return hecho;
    }
}
    

    
}
