package com.example.myOwnProject.allTheThigs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    VomitService vomitService;

    @Autowired
    public Controller(VomitService vomitService) {
        this.vomitService = vomitService;
    }

    @GetMapping
    public String vomit(){
        return vomitService.vomit();
    }

}
