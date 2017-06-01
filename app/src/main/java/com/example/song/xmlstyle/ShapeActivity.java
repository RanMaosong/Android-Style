package com.example.song.xmlstyle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ShapeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape);
    }

    public void rectangle(View view) {
        Intent intent = new Intent(this, ShapeRectangle.class);
        startActivity(intent);
    }

    public void oval(View vIew) {
        Intent intent = new Intent(this, ShapeOval.class);
        startActivity(intent);
    }

    public void line(View view) {
        Intent intent = new Intent(this, ShapeLine.class);
        startActivity(intent);
    }

    public void ring(View view) {
        Intent intent = new Intent(this, ShapeRing.class);
        startActivity(intent);
    }
}
