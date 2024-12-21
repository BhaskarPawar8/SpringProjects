package springboot.learn_spring_boot;

// localhost:8080/courses
// couses: id, name, author

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyController {

    @Autowired
    CurrencyConfiguration configuration;

    @RequestMapping("/currency-config")
    public CurrencyConfiguration retriedAllCourses(){
            return configuration;
    }

}
