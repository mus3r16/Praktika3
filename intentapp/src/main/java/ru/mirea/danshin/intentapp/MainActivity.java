package ru.mirea.danshin.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Date currentDate = new Date();
    DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
    String timeText = timeFormat.format(currentDate);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("time", timeText);
        startActivity(intent);
    }
}

