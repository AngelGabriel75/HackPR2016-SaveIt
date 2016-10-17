package com.example.saulo.saveitnologin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TipMyselfActivity extends AppCompatActivity {

    private EditText tip;
    private Button btn;
    private TextView tipjar;

    int tipAmount = 0;
    int tipJarTotal = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_myself);

        tip = (EditText) findViewById(R.id.tipId);
        btn = (Button) findViewById(R.id.btnId);
        tipjar= (TextView) findViewById(R.id.tipjarId);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tipAmount = Integer.parseInt(tip.getText().toString());
                tipJarTotal += tipAmount;

                tipjar.setText("$" + tipJarTotal);
            }
        });
    }
}