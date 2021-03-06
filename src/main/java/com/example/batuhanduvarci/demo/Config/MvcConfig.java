package com.example.batuhanduvarci.demo.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/hr/jobs").setViewName("list");
        registry.addViewController("/hr/jobs/list").setViewName("list");
        registry.addViewController("/hr/jobs/add").setViewName("add");
        registry.addViewController("/appliance").setViewName("appliance");
        registry.addViewController("/apply").setViewName("apply");
        registry.addViewController("/hr/jobs/applicants").setViewName("applicants");
    }
}
