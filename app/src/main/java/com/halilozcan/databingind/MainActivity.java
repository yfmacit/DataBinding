package com.halilozcan.databingind;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.halilozcan.databingind.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //ActivityMainBinding activityMainBinding1 = ActivityMainBinding.inflate(getLayoutInflater());
        List<String> personNameList = new ArrayList<>();
        Person person1 = new Person("Halil", "1");
        Person person2 = new Person("Murat", "2");
        Person person3 = new Person("Berk", "3");
        Person person4 = new Person("Ridvan", "4");

        personNameList.add(person1.name);
        personNameList.add(person2.name);
        personNameList.add(person3.name);
        personNameList.add(person4.name);


    }
}
