package com.example.fragmentclase1e1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private FirstFragment firstFragment;
    private SecondFragment secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstFragment = (FirstFragment)getSupportFragmentManager().findFragmentById(R.id.first_fragment);
        secondFragment = (SecondFragment)getSupportFragmentManager().findFragmentById(R.id.second_fragment);
    }

    public void onClickFirstFragment(){
        firstFragment.onSelected(true);
        secondFragment.onSelected(false);
    }

    public void onClickSecondFragment(){
        firstFragment.onSelected(false);
        secondFragment.onSelected(true);
    }
}
