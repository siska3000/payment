public class courses1 {
    

    
    //Immutable Незмінний хіба створювати новий об'єкт or use StringBuffer
    private String name;
    //Mutable Змінний об'єкт
    private Integer[] ipAdress;

    private Integer age;


    public courses1(){

        name = "Andriy";

        ipAdress = new Integer[]{2142, 12343};

        age = 18;

        name = "Sasha";

        name = name.replace("Andriy", "Sasha");

        age += 10;
    }
}
