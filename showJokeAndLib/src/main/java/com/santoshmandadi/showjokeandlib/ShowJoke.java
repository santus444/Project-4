package com.santoshmandadi.showjokeandlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ShowJoke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_joke);
        TextView textView = (TextView) findViewById(R.id.joke_text);
        textView.setText(getIntent().getStringExtra(Intent.EXTRA_TEXT));

    }


}
