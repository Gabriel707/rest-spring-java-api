package br.com.myrestapi.rest_spring_java_api.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    // http://localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{firstNumber}/{secondNumber}")
    public Double sum(
            @PathVariable("firstNumber") String firstNumber,
            @PathVariable("secondNumber") String secondNumber
    ) throws Exception {
        if(!isNumeric(firstNumber) || !isNumeric(secondNumber)) throw new IllegalArgumentException();
        return convertToDouble(firstNumber) + convertToDouble(secondNumber);
    }

    private Double convertToDouble(String secondNumber) {
        return 1D;
    }

    private boolean isNumeric(String number) {
        return false;
    }

    // http://localhost:8080/math/subtraction/3/5
    // http://localhost:8080/math/division/3/5
    // http://localhost:8080/math/multiplication/3/5


}
