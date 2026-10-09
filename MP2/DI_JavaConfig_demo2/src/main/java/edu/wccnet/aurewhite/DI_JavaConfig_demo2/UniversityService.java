package edu.wccnet.aurewhite.DI_JavaConfig_demo2;

public class UniversityService implements CollegeService{
    @Override
    public String getservice(String collegeName) {
        return collegeName + " is a 4 year university.";
    }
}
