package it.enrico;


import org.springframework.stereotype.Component;

@Component
public class HelloEntryPoint {

    public String index() {
        return "Greetings from Spring Boot!";
    }

    public String sum(String val1, String val2) {
        int i = Integer.valueOf(val1).intValue() + Integer.valueOf(val2).intValue();
        return "Result = " + i;
    }
}
