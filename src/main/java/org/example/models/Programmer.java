package org.example.models;

import java.time.LocalDate;

public class Programmer extends Person{
    private String role;

    public Programmer(String name, LocalDate birthday, String role){
        this.setName(name);
        this.setBirthday(birthday);
        this.setRole(role);
    }

    public String getRole(){
        return this.role;
    }

    public void setRole(String role){
        this.role = role;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + this.getName() + "'\n" +
                "birthday=" + this.getBirthday() + '\n'+
                "role='" + role + '\'' +
                '}';
    }
}
