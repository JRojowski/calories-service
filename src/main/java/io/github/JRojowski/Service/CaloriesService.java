package io.github.JRojowski.Service;

import io.github.JRojowski.adapter.FoodServiceProxy;
import io.github.JRojowski.adapter.dto.FoodDtoAdapter;
import io.github.JRojowski.entity.dto.CaloriesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.lang.Math.*;
import static java.lang.Math.multiplyExact;

@Service
public class CaloriesService {

    @Autowired
    private FoodServiceProxy proxy;

    public CaloriesDto calculateFoodCalories(int id, int grams) {
        FoodDtoAdapter food = proxy.getFoodById(id).getBody();
        return CaloriesDto.builder()
                .name(food.getName())
                .producer(food.getProducer())
                .grams(grams)
                .kcal(multiplyExact(food.getKcal(), floorDiv(grams, 100)))
                .protein(food.getProtein() * floorDiv(grams, 100))
                .fat(food.getFat() * floorDiv(grams, 100))
                .carbs(food.getCarbs() * floorDiv(grams, 100))
                .environment(food.getEnvironment())
                .build();
    }
}
