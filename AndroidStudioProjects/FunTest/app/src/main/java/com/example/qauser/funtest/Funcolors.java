package com.example.qauser.funtest;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by qa.user on 2015-06-23.
 */
public class Funcolors {
    private  String mTriplecolors[] = {"#008000", "#00FF00", "#008080", "#00FFFF", "#000080", "#800080",
    "#FF00FF", "C0C0C0", "#000000", "#FF00FF"};

    public int getColors(){
        String color = "";
        //Random number will be selected
        Random myrandom = new Random();
        int itrandom = myrandom.nextInt(mTriplecolors.length);

        color  = mTriplecolors[itrandom];
        int colorAsaInt = Color.parseColor(color);
        return colorAsaInt;

    }
}
