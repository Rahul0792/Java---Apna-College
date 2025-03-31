package _1_Method.Constructor;

import lombok.*;


@NoArgsConstructor
@ToString
@Getter
@Setter
@Data


public  class Movie {
    String Title;
    String Description;
    int Rating;


    public Movie(String title, String description, int rating) {
        Title = title;
        Description = description;
        Rating = rating;
    }
}

