package guru.springframework.joke.controllers;

import guru.springframework.joke.services.ChuckNorrisService;
import guru.springframework.joke.services.ChuckNorrisServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    @RequestMapping("/")
    public String getJoke(Model model) {
        ChuckNorrisService service = new ChuckNorrisServiceImpl();
        model.addAttribute("joke", service.getRandomQuote());
        return "chucknorris";
    }
}
