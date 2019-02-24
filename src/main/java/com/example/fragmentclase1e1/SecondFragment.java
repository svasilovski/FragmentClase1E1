package com.example.fragmentclase1e1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondFragment extends Fragment {
    TextView firstTextView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_fragment, container, false);
        firstTextView = view.findViewById(R.id.tv_second_fragment);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).onClickSecondFragment();
            }
        });
    }

    public void onSelected(boolean selected){
        if(selected){
            firstTextView.setText("Seleccionado");
        }
        else{
            firstTextView.setText("No Seleccionado");
        }
    }
}
