package sana.programming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView title = findViewById(R.id.title);

        Button start = findViewById(R.id.start);
        ((Button)findViewById(R.id.DeletionHistory)).setOnClickListener(this);  //width,heightの数値を書いたらこれを書く
    }

    @Override
    public void //動画を見て続きを書く
}

