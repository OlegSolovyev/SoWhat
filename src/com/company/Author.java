package com.company;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public Author(String fullName){
        String[] str=fullName.split(" ");
        lastName=str[str.length-1];
        firstName=str[0];
        }



    public String toString(){
        return firstName+" " +lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
}
