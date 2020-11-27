package com.amod.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Fragment_Two extends Fragment {

    TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_two, container, false);
        // Inflate the layout for this fragment
        textView=view.findViewById(R.id.data);
        return view;
    }

    public void showMessageInB(String msg)
    {
        textView.setText(msg);
    }
}
