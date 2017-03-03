package com.fefeyo.androidinterfacesample;

import android.util.Log;

/**
 * Created by fefe on 2017/03/01.
 */

public class Friends extends Animal implements AnimalBehavior{

    public Friends(String name) {
        super(name);
    }

    @Override
    public void say() {
        super.say();
    }

    @Override
    public void walk() {
        super.walk();
    }
}
