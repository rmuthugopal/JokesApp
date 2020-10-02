package com.gopal.JokesApp.controller;

import com.gopal.JokesApp.service.JokesService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {


    private final JokesService jokesService;
    @Autowired
    public WebController(JokesService jokesService) {
        System.out.println("Joke services created....");
        this.jokesService=jokesService;
    }


    @GetMapping({"/", ""})
    public String getJokes(Model model, @RequestParam(value="joke", required=false, defaultValue="joke test") String joke) {
        joke = jokesService.getJokes();
        System.out.println("joke:"+joke);
        model.addAttribute("joke", joke);
        return "chucknorris";
    }
    @GetMapping({"/", "/test"})
    public String getJokes1(Model model, String joke) {
        joke = jokesService.getJokes();
        System.out.println("joke:"+joke);
        model.addAttribute("joke", joke);
        return "chucknorris";
    }



}
