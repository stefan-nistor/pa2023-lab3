package org.example.models;

import java.time.LocalDate;

public class Designer extends Person{
    private Float rating;

    public Designer(String name, LocalDate birthday, Float rating) {
        this.setName(name);
        this.setBirthday(birthday);
        this.setRating(rating);
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Float getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Designer{" +
                "name='" + this.getName() + "'\n" +
                "birthday=" + this.getBirthday() + '\n'+
                "rating=" + rating +
                '}';
    }
}
