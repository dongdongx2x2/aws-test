package com.group.libraryapp.repository.fruit;

import java.time.LocalDate;

public interface FruitRepository {

    void save(String name, LocalDate warehousingDate, long price);

    void updateSoldStatus(Long id);

    long getSalesAmount(String name);

    long getNotSalesAmount(String name);
}
