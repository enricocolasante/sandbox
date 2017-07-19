package it.enrico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private Calculator calculator;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(method = RequestMethod.GET, value="/equation")
    public EquationResult equation(@RequestParam Double a, @RequestParam Double b, @RequestParam Double c) {
        return calculator.equation(a,b,c);
    }

    @RequestMapping(method = RequestMethod.GET, value="/error")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void error() {
    }
}

