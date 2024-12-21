package springboot.learn_spring_boot;

// localhost:8080/courses
// couses: id, name, author

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retriedAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "In28Mins"),
                new Course(2, "LearnDevOps", "In28Mins"),

                new Course(3, "Learn Azure", "In28Mins"),
                new Course(4, "Learn R", "In28Mins")

        );
    }

}
