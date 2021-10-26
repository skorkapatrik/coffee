package hu.uzonyinoemi.coffee.model;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Coffee {

    private Long id;
    private String title;
    private String description;
    private List<String> ingredients;

}
