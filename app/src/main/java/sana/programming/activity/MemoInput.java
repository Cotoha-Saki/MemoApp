package sana.programming.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import sana.programming.MainActivity;
import sana.programming.R;

public class MemoInput extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo_input);

        ((Button)findViewById(R.id.save)).setOnClickListener(this);
        ((Button)findViewById(R.id.memolist)).setOnClickListener(this);

        TextView textView = (TextView)findViewById(R.id.text);
            textView.setText("メモを入力して下さい");

        TextView textView1 = (TextView) findViewById(R.id.minitext);
            textView1.setText("※必ず保存を押してください※");

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.newmemo):
                Intent intentNewmemo = new Intent(getApplication(), MemoInput.class);
                intentNewmemo.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intentNewmemo);
                break;
            case (R.id.memolist):
                Intent intentMemoList = new Intent(getApplication(), MainActivity.class);
                intentMemoList.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intentMemoList);
                break;
        }
    }
}