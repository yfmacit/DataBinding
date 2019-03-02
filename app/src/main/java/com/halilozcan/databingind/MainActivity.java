package com.halilozcan.databingind;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.halilozcan.databingind.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //ActivityMainBinding activityMainBinding1 = ActivityMainBinding.inflate(getLayoutInflater());

        textView = findViewById(R.id.nameTextView);

        List<String> personNameList = new ArrayList<>();
        Person person1 = new Person("Halil", "1", false);
        Person person2 = new Person("Murat", "2", true);
        Person person3 = new Person("Berk", "3", false);
        Person person4 = new Person("Ridvan", "4", true);

        personNameList.add(person1.name);
        personNameList.add(person2.name);
        personNameList.add(person3.name);
        personNameList.add(person4.name);

        //activityMainBinding.setList(personNameList);

        Map<String, String> map = new HashMap<>();

        map.put("Halil", "1");

        //activityMainBinding.setMap(map);

        activityMainBinding.setUser(person1);
        //activityMainBinding.setHandlers(new EventHandler());
        activityMainBinding.setPresenter(new Presenter());

        Toast.makeText(this, "Is Name Text Visible:" +
                Boolean.parseBoolean(String.valueOf(textView.getVisibility())), Toast.LENGTH_SHORT).show();


    }
}
