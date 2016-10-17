package com.example.saulo.saveitnologin;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SliceActivity extends AppCompatActivity {

    private EditText percent, salary;
    private Button btn;
    private TextView sliceDisplay;

    int percentNum;
    double salaryNum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slice);

        percent = (EditText) findViewById(R.id.percentId);
        salary = (EditText) findViewById(R.id.salaryId);
        btn = (Button) findViewById(R.id.btnId);
        sliceDisplay = (TextView) findViewById(R.id.sliceDisplayId);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                percentNum = Integer.parseInt(percent.getText().toString());
                salaryNum = Double.parseDouble(salary.getText().toString());

                sliceDisplay.setText("You will save $" + (salaryNum / percentNum));

            }
        });


    }
}
