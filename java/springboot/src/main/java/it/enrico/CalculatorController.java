package it.enrico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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

    @RequestMapping(method = RequestMethod.POST, value="/equation")
    public ResponseEntity<?> equation(@ModelAttribute @Valid Equation equation, BindingResult errors) {
        if(errors.hasErrors()) {
            return ResponseEntity.badRequest().body(errors.getFieldErrors());
        }
        return ResponseEntity.ok(calculator.equation(equation.getA(),equation.getB(),equation.getC()));
    }

    @RequestMapping(method = RequestMethod.GET, value="/error")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void error() {
    }
}

