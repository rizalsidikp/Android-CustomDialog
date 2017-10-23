package com.app.example.customdialog;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button satu, dua, tiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        satu = (Button) findViewById(R.id.satu);
        dua = (Button) findViewById(R.id.dua);
        tiga = (Button) findViewById(R.id.tiga);

        satu.setOnClickListener(this);
        dua.setOnClickListener(this);
        tiga.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        final Dialog dialog = new Dialog(MainActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.customdialog);
        TextView teks = (TextView) dialog.findViewById(R.id.teks);
        switch (view.getId()){
            case R.id.satu:
                teks.setText(R.string.satu);
                break;
            case R.id.dua:
                teks.setText(R.string.dua);
                break;
            case R.id.tiga:
                teks.setText(R.string.tiga);
                break;
            default:
                break;
        }
        dialog.show();

    }
}
