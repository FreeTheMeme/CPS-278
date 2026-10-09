package edu.wccnet.aurewhite.DI_JavaConfig_demo;

import org.springframework.stereotype.Component;

public class UniversityService implements CollegeService{
    @Override
    public String getservice(String collegeName) {
        return collegeName + " is a 4 year university.";
    }
}
