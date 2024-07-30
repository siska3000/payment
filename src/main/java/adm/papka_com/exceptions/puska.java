package adm.papka_com.exceptions;

public class puska {


    public static void main(String[] args) {

  
        UserDAO userDao = new UserDAO();

        // Thread - нитка
        System.out.println("--------------------");
        System.out.println(userDao.getUserName().orElse("Null data"));

        userDao.getUserNameById(null);



        
    }


   
}
