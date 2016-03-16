package com.example.controler;

/**
 * Created by bilalturk on 11.03.2016.
 */
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import com.example.repository.MovieRepository;

@Controller
public class MovieController {
    @Autowired
    private MovieRepository personRepository;

    @RequestMapping("/asd")
    public String test() {

        return "hello";
    }

}
