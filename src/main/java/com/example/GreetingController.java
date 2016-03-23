package com.example;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public GreetingModel greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new GreetingModel(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/insult")
    public InsultModel insult(@RequestParam(value="insult", defaultValue="Pleb") String insult){
        return new InsultModel(insult, "joost");
    }

    Random r = new Random();

}