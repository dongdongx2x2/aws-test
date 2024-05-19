package com.group.libraryapp.controller.fruit;

import com.group.libraryapp.dto.fruit.request.FruitRequest;
import com.group.libraryapp.dto.fruit.response.FruitResponse;
import com.group.libraryapp.service.fruit.FruitService;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitController {

    private final FruitService fruitMySqlService;

    public FruitController(FruitService fruitMySqlService) {
        this.fruitMySqlService = fruitMySqlService;
    }

    @PostMapping("/api/v1/fruit")
    public void saveFruit(@RequestBody FruitRequest request) {
        fruitMySqlService.saveFruit(request);
    }

    @PutMapping("/api/v1/fruit")
    public void updateFruit(@RequestBody FruitRequest request) {
        fruitMySqlService.updateFruit(request);
    }

    @GetMapping("/api/v1/fruit/stat")
    public FruitResponse getFruitAmount(@RequestParam String name) {
        System.out.println("여긴통과");
        return fruitMySqlService.getFruitAmount(name);

    }
}
