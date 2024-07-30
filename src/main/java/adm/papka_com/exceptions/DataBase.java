package adm.papka_com.exceptions;

import java.io.IOException;

public class DataBase {

    public String getUserName () throws IOException {

       throw new IOException()  ;
    }

    public String getUserNameById(String id)  {

        int idInt = Integer.valueOf(id);

        return "Mark Zuks";
    }
    
}
