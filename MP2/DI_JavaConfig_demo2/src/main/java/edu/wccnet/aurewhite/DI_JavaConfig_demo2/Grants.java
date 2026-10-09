package edu.wccnet.aurewhite.DI_JavaConfig_demo2;


public class Grants implements FinaidService{
    @Override
    public String getFinaidtype() {
        return "Grants";
    }
}
