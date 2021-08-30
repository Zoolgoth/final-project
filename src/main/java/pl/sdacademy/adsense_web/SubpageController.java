package pl.sdacademy.adsense_web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/subpage")
public class SubpageController {
private SubpageRepository subpageRepository;

    public SubpageController(SubpageRepository subpageRepository) {
        this.subpageRepository = subpageRepository;
    }

    @GetMapping
    public String list(ModelMap modelMap) {
        List<Subpage> subpages = subpageRepository.findAll();
        modelMap.addAttribute("subpages", subpages);
        return "user/list";
    }

    @GetMapping("/add")
    public String addForm(@ModelAttribute("subpage") Subpage subpage) {
        return "user/form";
    }

    @PostMapping("/add")
    public String addResult(Subpage subpage) {
        subpageRepository.save(subpage);
        return "redirect:/subpage";
    }

    @GetMapping("/{name}")
    public String viewSubpage (@PathVariable String name, ModelMap modelMap) {
        modelMap.addAttribute("subpage", subpageRepository.findByName(name));
        return "subpage";
    }

    @GetMapping("/test")
    public String test1 () {
        return "user/index";
    }

}