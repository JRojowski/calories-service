package io.github.JRojowski.adapter;

import io.github.JRojowski.adapter.dto.FoodDtoAdapter;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="food-service")
public interface FoodServiceProxy {

    @GetMapping("/foods/{id}")
    ResponseEntity<FoodDtoAdapter> getFoodById(@PathVariable int id);

}
