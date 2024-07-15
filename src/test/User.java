package com.test.objects;

public class User {

    private String name;
    private String setLastName;
    private int age;


    public void setName (String nameAng) {
        name = nameAng;
    }

    public String getName () {
        return name;
    }

    public void setLastName (String lastname) {
        this.setLastName = lastname;
    }

    public String getLastname () {
        return setLastName;
    }

    public void  setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof User){

            User thatUser = (User) obj;

            return this.name.equals(thatUser.getName()) && this.setLastName.equals(thatUser.getLastname()) && this.age == thatUser.getAge();
        }

        return false;
    }


        @Override
        public String toString() {

               return this.name + " " + this.setLastName + " " + this.age;
        }

}

