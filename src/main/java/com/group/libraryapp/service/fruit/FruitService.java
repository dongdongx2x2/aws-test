package com.group.libraryapp.service.fruit;

import com.group.libraryapp.domain.fruit.Fruit;
import com.group.libraryapp.domain.fruit.FruitRepository;
import com.group.libraryapp.dto.fruit.request.FruitRequest;
import com.group.libraryapp.dto.fruit.response.FruitResponse;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FruitService {

    private final FruitRepository fruitRepository;

    public FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Transactional
    public void saveFruit(FruitRequest request) {
        Fruit fruit = new Fruit(request.getId(), request.getName(), request.getWarehousingDate(), request.getPrice());
        fruitRepository.save(fruit);
    }

    @Transactional
    public void updateFruit(FruitRequest request) {
        Fruit fruit = fruitRepository.findById(request.getId())
                .orElseThrow(IllegalArgumentException::new);
        fruit.setSold(true);
        fruitRepository.save(fruit);
    }

    public FruitResponse getFruitAmount(String name) {
        System.out.println("여긴통과한다");
        List<Fruit> soldFruits = fruitRepository.findByNameAndIsSold(name, true);
        List<Fruit> notSoldFruits = fruitRepository.findByNameAndIsSold(name, false);
        System.out.println("여기야1");
        long salesAmount = soldFruits.stream().mapToLong(Fruit::getPrice).sum();
        long notSalesAmount = notSoldFruits.stream().mapToLong(Fruit::getPrice).sum();
        System.out.println("여기야2");

        return new FruitResponse(salesAmount, notSalesAmount);
    }
}
