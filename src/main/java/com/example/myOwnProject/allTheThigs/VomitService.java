package com.example.myOwnProject.allTheThigs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VomitService {

    @Autowired Vomit vomit;

    public String vomit(){
        return vomit.vomit();
    }

}
