package sana.programming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MemoList extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo_list);

        ((Button)findViewById(R.id.newmemo)).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}