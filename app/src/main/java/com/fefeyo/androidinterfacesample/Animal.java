package com.fefeyo.androidinterfacesample;

import android.os.Handler;
import android.util.Log;
import android.view.View;

/**
 * Created by fefe on 2017/03/01.
 */

public class Animal implements AnimalBehavior {
    private String name;
    boolean isWalking;
    private OnFinishListerner mListener;

    interface OnFinishListerner {
        void finish();
    }

    public void setOnFinishListener(OnFinishListerner listener) {
        this.mListener = listener;
    }

    public Animal(String name) {
        this.name = name;
        isWalking = false;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void say() {
        Log.d("say", name);
    }

    @Override
    public void walk() {
        Log.d("walk", "start");
        isWalking = true;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                isWalking = false;
                Log.d("walk", "end");

                mListener.finish();
             }
        }, 3000);
    }

    @Override
    public void jump() {
        if(isWalking) {
            Log.d("歩いています！", "ジャンプできません");
        } else {
            Log.d("ジャンプ！", "ジャンプしました");
        }
    }
}
