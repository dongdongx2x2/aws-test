package com.group.libraryapp.controller.calculator;

import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import com.group.libraryapp.dto.calculator.request.CalculatorMultiplyRequest;
import com.group.libraryapp.dto.calculator.request.CalculatorRequest;
import com.group.libraryapp.dto.calculator.request.NumRequest;
import com.group.libraryapp.dto.calculator.response.CalculatorResponse;
import com.group.libraryapp.dto.day.response.DayResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/add") // Get /add
    public int addTwoNumbers(CalculatorAddRequest request) {
        return request.getNumber1() + request.getNumber2();
    }

    @PostMapping("/multiply")
    public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request) {
        return request.getNumber1() * request.getNumber2();
    }

    @GetMapping("/api/v1/calc")
    public CalculatorResponse calc(CalculatorRequest request){
        return new CalculatorResponse(request);
    }

    @GetMapping("/api/v1/day-of-the-week")
    public DayResponse dayOfTheWeek(@RequestParam String day){
        return new DayResponse(day);
    }

    @PostMapping("/api/v1/sum")
    public int sumNum(@RequestBody NumRequest request) {
        int sum = 0;
        for (int num : request.getNumbers()) {
            sum += num;
        }
        return sum;
    }
}
