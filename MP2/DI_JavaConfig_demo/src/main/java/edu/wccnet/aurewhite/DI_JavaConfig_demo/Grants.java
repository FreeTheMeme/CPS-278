package edu.wccnet.aurewhite.DI_JavaConfig_demo;

import org.springframework.stereotype.Component;

@Component
public class Grants implements FinaidService{
    @Override
    public String getFinaidtype() {
        return "Grants";
    }
}
