package com.example.admin.w2d4savefile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void downloadSave(View view) {
        new SaveFileTask().execute("https://code.jquery.com/jquery-3.1.1.js");
    }
}
