package com.amod.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class Fragment_One extends Fragment {
    IupdateData callMethod;
    EditText editText;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        callMethod=(IupdateData)context;//registers the activity while attaching the fragment and assigning the reference to object of interface
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_one, container, false);
        editText=view.findViewById(R.id.editText);
        view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callMethod.sendMessageToB(editText.getText().toString());//this method will be called inside the activity on click from fragment since the activity implements this interface
            }
        });

        return view;
    }
    interface IupdateData {
        void sendMessageToB(String msg);
    }

}
