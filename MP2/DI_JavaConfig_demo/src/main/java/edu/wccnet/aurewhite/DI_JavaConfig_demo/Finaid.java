package edu.wccnet.aurewhite.DI_JavaConfig_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("finaid")
public class Finaid {
    @Autowired
    private College college;
    @Autowired
    private FinaidService finaidService;


    public void displayFinaid(){
        System.out.println("You received "+ finaidService.getFinaidtype()+" from "+college.getCollageName());
    }
}
