package sana.programming.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import sana.programming.R;

public class Notice extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        ((Button)findViewById(R.id.notice)).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}