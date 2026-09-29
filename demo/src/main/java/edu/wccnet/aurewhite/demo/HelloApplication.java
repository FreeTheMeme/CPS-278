package edu.wccnet.aurewhite.demo;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("http://localhost:8080/demo_war_exploded/api/hello-world")
public class HelloApplication extends Application {

}