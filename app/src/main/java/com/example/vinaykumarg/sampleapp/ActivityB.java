package com.example.vinaykumarg.sampleapp;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityB extends Fragment {

    private EditText editTextA;
    private EditText editTextB;
    private int result = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.activity_b, container, false);
        editTextA = (EditText) view.findViewById(R.id.a);
        editTextB = (EditText) view.findViewById(R.id.b);
        Button buttonAdd = (Button) view.findViewById(R.id.add);
        Button buttonA = (Button) view.findViewById(R.id.A);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=0,b=0;
                if (!(editTextA.getText().toString().isEmpty())){
                    a = Integer.parseInt(editTextA.getText().toString());
                }else {
                    Toast.makeText(view.getContext(),"enter a value", Toast.LENGTH_SHORT).show();
                }
                if (!(editTextB.getText().toString().isEmpty())) {
                    b = Integer.parseInt(editTextB.getText().toString());
                } else {
                    Toast.makeText(view.getContext(), "enter b value" , Toast.LENGTH_SHORT).show();
                }

                result = a+b;
                Log.d("result",result+"");
                Toast.makeText(view.getContext(), result+"" , Toast.LENGTH_SHORT).show();

            }
        });
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new activityA();
                FragmentManager fm= getFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, fragment);
                fragmentTransaction.commit();
            }
        });

        return view;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

}
