package pl.sdacademy.adsense_web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class ExampleController {
    @GetMapping("/jakis-przyklad")
    public String jakisPrzyklad(ModelMap modelMap) {
        modelMap.addAttribute("dane1", "AAAAAAAAAAAAAAAA");
        modelMap.addAttribute("dane2", Arrays.asList("a", "b", "c"));
        return "moj-szablon";
    }
}