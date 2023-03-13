package org.example.models;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Person implements Node, Comparable<Person>{

     private String name;

     private LocalDate birthday;

     private Map<Node, String> relationships = new HashMap<>();

     public Person(){
         this.name = "";
         this.birthday =  LocalDate.of(1970,1,1);
     }

     public Person(String name, LocalDate birthday){
         this.name = name;
         this.birthday = birthday;
     }

     public void addRelationship(Node node, String value){
         relationships.put(node, value);
     }

    public Map<Node, String> getRelationships() {
        return relationships;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public LocalDate getBirthday(){
         return this.birthday;
    }

    public void setName(String name){
         this.name = name;
    }

    public void setBirthday(LocalDate birthday){
         this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int getImportance(){
         return this.relationships.size();
    }

}
