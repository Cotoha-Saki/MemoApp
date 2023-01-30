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

public class Notice extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        ((Button)findViewById(R.id.homeN)).setOnClickListener(this);

        //ListViewに表示するリスト項目をArrayListで準備する
        ArrayList notice = new ArrayList<>();
        notice.add("【1/30更新】現在、メモ機能を開発中です。完成まで今しばらくお待ちください。");


        //リスト項目とListViewを対応付けるArrayAdapterを用意する
        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, notice);

        //ListViewにArrayAdapterを設定する
        ListView listView = (ListView)findViewById(R.id.notice);
        listView.setAdapter(adapter);

        TextView textView = (TextView)findViewById(R.id.text);
        if (notice.isEmpty()) {
            textView.setText("お知らせはありません");
        }else{
            textView.setText(null);
        }
    }

    @Override
    public void onClick(View view) {
        Intent intentMain = new Intent(getApplication(), MainActivity.class);
        intentMain.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intentMain);
    }

}