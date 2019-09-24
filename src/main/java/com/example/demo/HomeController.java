package com.example.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(){
        return "index";
    }

    @RequestMapping("/performance")
    public String performancePage(){
        return "performance";
    }

    @RequestMapping("/members")
    public String memberPage(){
        return "members";
    }

    @RequestMapping("/about")
    public String aboutPage(){
        return "about";
    }

    @RequestMapping("/videos")
    public String videoPage(){
        return "videos";
    }

    @RequestMapping("/timeline")
    public String timelinePage(){
        return "timeline";
    }



}
