package sana.programming.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

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


        //リスト項目とListViewを対応付けるArrayAdapterを用意する
        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);

        //ListViewにArrayAdapterを設定する
        ListView listView = (ListView)findViewById(R.id.memolist);
        listView.setAdapter(adapter);

        //メモがないときはTextViewを表示してメモがあるときは非表示にさせる
        TextView textView = (TextView)findViewById(R.id.no_notes);
        if (data.isEmpty()) {
            textView.setText("メモがありません");
        }else{
            textView.setText(null);
        }

        TextView textView1 = (TextView) findViewById(R.id.supplement);
        textView1.setText("新規をタップしてメモを作成してください");
    }

    @Override
    public void onClick(View view) {
        //新たなメモを作成 or メイン画面に戻る
        switch (view.getId()) {
            case (R.id.newmemo):
                Intent intentNewmemo = new Intent(getApplication(),MemoList.class);
                intentNewmemo.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);

                startActivity(intentNewmemo);
                break;
            case (R.id.home):
                Intent intentHome = new Intent(getApplication(), MainActivity.class);
                intentHome.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intentHome);
                break;
        }
    }
}