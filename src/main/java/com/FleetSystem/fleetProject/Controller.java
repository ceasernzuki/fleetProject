package com.FleetSystem.fleetProject;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/index")
    public String home() {
        return "index";
    }

    @GetMapping("/_layout")
    public String widgets(){
        return "_layout";

    }

}
