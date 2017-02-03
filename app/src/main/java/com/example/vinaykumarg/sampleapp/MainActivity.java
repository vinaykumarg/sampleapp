package com.example.vinaykumarg.sampleapp;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("oncreate","called");
        Button btnA = (Button) findViewById(R.id.button1);
        Button btnB = (Button) findViewById(R.id.button2);
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new FragmentA();
                FragmentManager fm= getFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, fragment);
                fragmentTransaction.commit();
            }
        });
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new FragmentB();
                FragmentManager fm= getFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, fragment);
                fragmentTransaction.commit();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart","called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume","called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause","called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onStop","called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy","called");
    }
}
