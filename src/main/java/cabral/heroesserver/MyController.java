package cabral.heroesserver;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MyController {

    MyController() {
    }

    @CrossOrigin
    @GetMapping("/api/heroes")
    public List<String> getAllHeroes() {
        return Arrays.asList("Andre", "Gab", "Kev");
    }
}
