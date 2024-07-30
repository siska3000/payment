package adm.papka_com.exceptions;

import java.io.IOException;
import java.util.Optional;

public class UserDAO {

    private DataBase db = new DataBase();

    public Optional<String> getUserName(){

        try {
            return Optional.of(db.getUserName());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }

    public String getUserNameById(String id) {

        return db.getUserNameById(id);
    }
    
}
