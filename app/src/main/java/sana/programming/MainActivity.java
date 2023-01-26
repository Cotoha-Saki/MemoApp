package sana.programming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import sana.programming.activity.DeletionHistory;
import sana.programming.activity.MemoList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.title);

        ((Button)findViewById(R.id.start)).setOnClickListener(this);
        ((Button)findViewById(R.id.DeletionHistory)).setOnClickListener(this);
        ((Button)findViewById(R.id.notice)).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case(R.id.start):
                Intent intentList = new Intent(getApplication(), MemoList.class);
                startActivity(intentList);
                break;

            case(R.id.DeletionHistory):
                Intent intentDeletionHistory = new Intent(getApplication(), DeletionHistory.class);
                startActivity(intentDeletionHistory);
                break;

            case(R.id.notice):
                Intent intentnotice = new Intent(getApplication(),DeletionHistory.class);
                startActivity(intentnotice);
                break;
        }
    }
}

