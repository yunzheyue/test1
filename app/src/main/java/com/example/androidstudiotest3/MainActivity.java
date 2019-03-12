package com.example.androidstudiotest3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student student = new Student();

        student.setName("嗯嗯");
        student.getName();


        Person person = new Person();

        Person1 person1 = new Person1();



    }
}
