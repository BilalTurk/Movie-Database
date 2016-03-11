package example.controler;

/**
 * Created by bilalturk on 11.03.2016.
 */
        import example.domain.movie;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.ResponseBody;
        import example.repository.MovieRepository;

@Controller
public class MovieController {
    @Autowired
    private MovieRepository personRepository;

    @RequestMapping("/asd")
    public String test() {
    System.out.print("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        return "hello";
    }

}
