package com.rz.jcenterbintrayone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rz.jcenterbintray.Echo;

public class ActMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        Echo.printLn("Hi Test");
    }
}
