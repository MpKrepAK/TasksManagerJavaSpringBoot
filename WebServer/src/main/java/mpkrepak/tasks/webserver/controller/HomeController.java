package mpkrepak.tasks.webserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(name = "/")
public class HomeController {

    @GetMapping
    public String home() {
        return "home";
    }
}
