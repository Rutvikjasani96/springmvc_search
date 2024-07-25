package com.springmvc_search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
    @RequestMapping("/home")
    public String home(){
        System.out.println("Home Calling...");
        return "home";
    }

    @RequestMapping("/searched")
    public RedirectView searched(@RequestParam("querybox") String query){
        System.out.println("Searched Calling...");
        if(query.isBlank()){
            return new RedirectView("home");
        }
        RedirectView redirectView = new RedirectView();
        String url = "https://www.google.com/search?q="+query;
        redirectView.setUrl(url);
        return redirectView;
    }

    @RequestMapping("/user/{userId}/{userName}")
    public String getUserDetails(@PathVariable("userId") String userId,@PathVariable("userName") String userName){
        System.out.println(userId);
        System.out.println(userName);
        return "home";
    }

}
