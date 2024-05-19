package com.group.libraryapp.repository.fruit;

import java.time.LocalDate;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
//@Primary
public class FruitMemoryRepository implements FruitRepository {
    @Override
    public void save(String name, LocalDate warehousingDate, long price) {
        System.out.println("FruitMemoryRepository");
    }

    @Override
    public void updateSoldStatus(Long id) {
        System.out.println("FruitMemoryRepository");
    }

    @Override
    public long getSalesAmount(String name) {
        return 0;
    }

    @Override
    public long getNotSalesAmount(String name) {
        return 0;
    }
}
