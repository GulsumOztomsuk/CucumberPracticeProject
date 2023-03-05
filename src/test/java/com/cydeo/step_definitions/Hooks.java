package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

/*
In the class we will be able to pass pre- & post- conditions to each scenerio and each step
 */

public class Hooks {
    //import from io.cucumber.java not from junit
    @Before
    public void setupScenerio(){
        System.out.println("===Setting up browser using cucumber @Before");
    }

    @Before ("@login")  //only use login anotation
    public void setupScenerioForLogins(){
        System.out.println("===this will only apply to scenerios with @login tag");
    }
    @Before ("@db")  //only use login anotation
    public void setupForDataBaseScenerio(){
        System.out.println("===this will only apply to scenerios with @login tag");
    }
    @After
    public void teardownScenerio(){
        System.out.println(" ===Closing browser using cucumber @After");
        System.out.println("===Scenerio ended/ Take screenshot if failed!");
    }

    @BeforeStep
    public void setup(){
        System.out.println("-----Applying setup using @BeforeStep");

    }

    @AfterStep
    public void afterStep(){
        System.out.println("------Applying teardown  using @AfterStep");
    }
}
