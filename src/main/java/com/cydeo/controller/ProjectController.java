package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
public class ProjectController {


    @GetMapping("/show")
    public String getProjectCreatePage(Model model){
        //project object
        model.addAttribute("project", );
        //assignedManager
        model.addAttribute("managers",);
        //projectList
        model.addAttribute("projects", );


        return "/project/create";
    }



}