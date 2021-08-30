package pl.sdacademy.adsense_web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MainController {
    @GetMapping
    public String mainPage(@ModelAttribute("subpage") Subpage subpage) {
        return "main-page";
    }
}
