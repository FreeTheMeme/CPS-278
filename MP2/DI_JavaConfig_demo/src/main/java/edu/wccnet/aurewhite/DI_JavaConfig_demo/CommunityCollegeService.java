package edu.wccnet.aurewhite.DI_JavaConfig_demo;

import org.springframework.stereotype.Component;

@Component
public class CommunityCollegeService implements CollegeService {

    @Override
    public String getservice(String collegeName) {
        return collegeName + " is a 2 year community college.";
    }
}
