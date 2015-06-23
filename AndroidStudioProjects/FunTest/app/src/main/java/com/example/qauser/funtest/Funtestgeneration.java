package com.example.qauser.funtest;

import java.util.Random;

/**
 * Created by qa.user on 2015-06-23.
 */
public class Funtestgeneration {
    private  String newtxt[] = {"You need two days to write test cases!? You already have the requirements specification. Just copy and paste from it.",

            "You don't have the latest requirements!? I am positive that we communicated the latest changes to all developers.",

            "Remember that we are using the Agile methodology. Time is critical. Do not waste it by creating any test cases or bug reports. Just test and discuss the bugs directly with the concerned developer.",

            "Note that the build you are testing can change any time. Even if you notice that the build has changed, just continue your testing as if nothing has happened.",

            "There is no need to test the xxxx module. I have already had a [senior] developer test it and he said it is working fine.",

            "You are new to the project. We will have another [senior] tester repeat your tests and compare both your results.",

            "I want to be aware of each bug as it is found. In addition to logging the bug report, call me/ mail me as soon as you find a bug.",

            "You have found a bug? Are you sure that you have tested the latest build [implying a very recent untested build]?",

            "What bug did you say you have found? Please confirm each bug with the developer before raising/ logging it.",

            "Why doesn't your bug report have a test case ID? Note that no bug will be accepted without an existing test case ID."
    };
    public String funTest(){

        //Random number will be selected
        Random myrandom = new Random();
        int itrandom = myrandom.nextInt(newtxt.length);

        String fun =  newtxt[itrandom];
        return fun;

    }
}
