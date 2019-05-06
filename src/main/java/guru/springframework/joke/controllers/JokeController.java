package guru.springframework.joke.controllers;

import guru.springframework.joke.services.JokeService;
import guru.springframework.joke.services.JokeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    @RequestMapping("/")
    public String getJoke(Model model) {
        JokeService service = new JokeServiceImpl();
        model.addAttribute("joke", service.getRandomQuote());
        return "chucknorris";
    }
}
