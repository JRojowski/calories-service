package io.github.JRojowski.controller;

import io.github.JRojowski.Service.CaloriesService;
import io.github.JRojowski.entity.dto.CaloriesDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CaloriesController {

    private CaloriesService caloriesService;

    @GetMapping("/calories/foods/{id}")
    public ResponseEntity<CaloriesDto> calculateFoodCalories(@PathVariable int id, @RequestParam int grams) {
        return ResponseEntity.ok(caloriesService.calculateFoodCalories(id, grams));
    }

}

