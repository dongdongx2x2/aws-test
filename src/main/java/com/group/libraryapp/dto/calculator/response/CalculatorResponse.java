package com.group.libraryapp.dto.calculator.response;

import com.group.libraryapp.dto.calculator.request.CalculatorRequest;

public class CalculatorResponse {
    private final int add;
    private final int minus;
    private final int multiply;

    public CalculatorResponse(CalculatorRequest request) {
        this.add = request.getNum1() + request.getNum2();
        this.minus = request.getNum1() - request.getNum2();
        this.multiply = request.getNum1() * request.getNum2();
    }

    public int getAdd() {
        return add;
    }

    public int getMinus() {
        return minus;
    }

    public int getMultiply() {
        return multiply;
    }
}
