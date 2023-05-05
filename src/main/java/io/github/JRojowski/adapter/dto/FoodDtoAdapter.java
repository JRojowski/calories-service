package io.github.JRojowski.adapter.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FoodDtoAdapter {
    private Integer id;
    private String name;
    private String producer;
    private Double price;
    private Integer portion;
    private Integer kcal;
    private Double protein;
    private Double fat;
    private Double carbs;
    private List<String> mealList;
    private String environment;
}
