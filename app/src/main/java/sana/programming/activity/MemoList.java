package sana.programming.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import sana.programming.MainActivity;
import sana.programming.R;

public class MemoList extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo_list);

        ((Button)findViewById(R.id.newmemo)).setOnClickListener(this);
        ((Button)findViewById(R.id.home)).setOnClickListener(this);

        //ListViewに表示するリスト項目をArrayListで準備する
        ArrayList data = new ArrayList<>();
        data.add("テスト");
        data.add("テスト");
        data.add("テスト");
        data.add("テスト");
        data.add("テスト");
        data.add("テスト");
        data.add("テスト");
        data.add("テスト");

        //リスト項目とListViewを対応付けるArrayAdapterを用意する
        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);

        //ListViewにArrayAdapterを設定する
        ListView listView = (ListView)findViewById(R.id.memolist);
        listView.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.newmemo):
                Intent intentNewmemo = new Intent(getApplication(),MemoList.class);
                startActivity(intentNewmemo);
                break;
            case (R.id.home):
                Intent intentHome = new Intent(getApplication(), MainActivity.class);
                startActivity(intentHome);
                break;
        }
    }
}