package com.group.libraryapp.dto.fruit.request;

import java.time.LocalDate;

public class FruitRequest {
    private Long id;
    private String name;
    private LocalDate warehousingDate;
    private Long price;

    public FruitRequest(Long id, String name, LocalDate warehousingDate, Long price) {
        this.id = id;
        this.name = name;
        this.warehousingDate = warehousingDate;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getWarehousingDate() {
        return warehousingDate;
    }

    public Long getPrice() {
        return price;
    }
}
