package edu.wccnet.aurewhite.hellowebapp;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("http://localhost:8080/HelloWorldApp_war_exploded/api/hello-world")
public class HelloApplication extends Application {

}