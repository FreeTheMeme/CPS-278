package edu.wccnet.aurewhite.DI_JavaConfig_demo;

public class Scholarships implements FinaidService{
    @Override
    public String getFinaidtype() {
        return "Scholarships";
    }
}
