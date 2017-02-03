package com.example.vinaykumarg.sampleapp;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class activityA extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_a, container, false);
        TextView textView1 = (TextView) view.findViewById(R.id.tv1);
        TextView textView2 = (TextView) view.findViewById(R.id.tv2);
        textView1.setText("Android (stylized as android) " +
                "is a mobile operating system developed by" +
                " Google, based on the Linux kernel and " +
                "designed primarily for touchscreen mobile" +
                " devices such as smartphones and tablets. ");
        Button buttonB = (Button) view.findViewById(R.id.B);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new ActivityB();
                FragmentManager fm= getFragmentManager();
                if (fm != null) {
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.replace(R.id.fragment, fragment);
                    ft.commit();
                }
            }
        });

        return view;
    }

}
