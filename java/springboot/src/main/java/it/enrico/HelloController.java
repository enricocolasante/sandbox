package it.enrico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloEntryPoint helloEntryPoint;

    @RequestMapping("/")
    public String index() {
        return helloEntryPoint.index();
    }

    @RequestMapping(method = RequestMethod.GET, value="/sum")
    public String sum(@RequestParam String val1, @RequestParam String val2) {
        return helloEntryPoint.sum(val1,val2);
    }

    @RequestMapping(method = RequestMethod.GET, value="/error")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void error() {
    }

    public void setHelloEntryPoint(HelloEntryPoint helloEntryPoint) {
        this.helloEntryPoint = helloEntryPoint;
    }
}

