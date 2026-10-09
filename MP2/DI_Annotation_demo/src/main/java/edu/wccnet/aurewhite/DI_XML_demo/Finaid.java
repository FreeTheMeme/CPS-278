package edu.wccnet.aurewhite.DI_XML_demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Finaid {
    @Autowired
    private College college;
    @Autowired
    private FinaidService finaidService;

//    public Finaid(College college, FinaidService finaidService) {
//        this.college = college;
//        this.finaidService = finaidService;
//    }
    public void displayFinaid(){
        System.out.println("You received "+ finaidService.getFinaidtype()+" from "+college.getCollageName());
    }
}
