package com.fefeyo.androidinterfacesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements Animal.OnFinishListerner{

    Animal animal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animal = new Animal("サーバルちゃん");
        animal.setOnFinishListener(this);
    }

    public void say(View v) {
        animal.say();
    }

    public void walk(View v) {
        animal.walk();
        findViewById(R.id.jump).setEnabled(false);
    }

    public void jump(View v) {
        animal.jump();
    }

    @Override
    public void finish() {
        findViewById(R.id.jump).setEnabled(true);
        Log.d("ジャンプ", "できるようになりました");
    }

}
