package sana.programming.OthersClass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import sana.programming.MainActivity;
import sana.programming.R;

public class DeletionHistory extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deletion_history);

        ((Button)findViewById(R.id.homeD)).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intentMain = new Intent(getApplication(), MainActivity.class);
        intentMain.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intentMain);
    }

}