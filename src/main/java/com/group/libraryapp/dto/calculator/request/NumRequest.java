package com.group.libraryapp.dto.calculator.request;

import java.util.List;

public class NumRequest {
    private List<Integer> numbers;

    public NumRequest(){

    }
    public NumRequest(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
