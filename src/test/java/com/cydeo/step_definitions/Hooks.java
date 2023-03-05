package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

/*
In the class we will be able to pass pre- & post- conditions to each scenerio and each step
 */

public class Hooks {
    //import from io.cucumber.java not from junit
    @Before
    public void setup(){
        System.out.println("Before Scenario is running");
    }
    @After
    public void teardown(){
        System.out.println("After Scenario is running");
    }
}
