package com.amod.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements Fragment_One.IupdateData {
    Fragment_Two fragmentB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //replacing container with fragments
        fragmentTransaction.replace(R.id.fragA, new Fragment_One());
        fragmentB=new Fragment_Two();
        fragmentTransaction.replace(R.id.fragB,fragmentB);
        fragmentTransaction.commit();
    }

    @Override
    public void sendMessageToB(String msg) {
    //callback from fragment A
    fragmentB.showMessageInB(msg);//method of fragment B
    }

}
