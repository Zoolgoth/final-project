package pl.sdacademy.adsense_web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/ads")
    public String ex() {
        return "user/my-view";
    }

    @GetMapping("/nervarien")
    public String nervarien() {
        return "user/nervarien";
    }

    @GetMapping("/xayoo")
    public String xayoo() {
        return "user/xayoo";
    }

    @GetMapping("/randomBruce")
    public String randomBruce() {
        return "user/randomBruce";
    }
    @GetMapping("/ewroon")
    public String ewroon() {
        return "user/ewroon";
    }

    @GetMapping("/contact")
    public String contact() {
        return "user/contact";
    }


}