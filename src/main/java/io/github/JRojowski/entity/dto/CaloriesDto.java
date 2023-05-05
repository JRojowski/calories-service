package io.github.JRojowski.entity.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CaloriesDto {
    private String name;
    private String producer;
    private Integer grams;
    private Integer kcal;
    private Double protein;
    private Double fat;
    private Double carbs;
    private String environment;
}
