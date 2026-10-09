package edu.wccnet.aurewhite.DI_JavaConfig_demo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DIDemoJavaConfig {
    @Bean
    public College college() {
        College myCollege = new College("wcc",1965);
        myCollege.setCollegeService(communityCollegeService());
        return myCollege;
    }
    @Bean
    public CommunityCollegeService communityCollegeService(){
        return new CommunityCollegeService();
    }
    @Bean
    public Finaid finaid(FinaidService finaidService){
        Finaid finaid = new Finaid(college(),scholarships());
        return finaid;
    }
    @Bean
    public Scholarships scholarships(){
        return new Scholarships();
    }
}

