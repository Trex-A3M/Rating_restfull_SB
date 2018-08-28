package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
    public class GreetingController {

        private static final String template = "Hello, %s!";
        private static final String tmep2 = "Trex is %s.";
        private static final String temp3 = "trex %s.";
        private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
        public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name ,
                                 @RequestParam(value = "fname", defaultValue = "running") String fname ,
                                 @RequestParam(value = "attribute", defaultValue = "is my champion") String atr)
        {
            return new Greeting(counter.incrementAndGet(), String.format(template, name) , String.format(tmep2 , fname) , String.format(temp3, atr));
        }
    }

