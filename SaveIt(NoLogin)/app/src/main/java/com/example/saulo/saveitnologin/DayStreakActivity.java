package com.example.saulo.saveitnologin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DayStreakActivity extends AppCompatActivity {

    private EditText spend, daysEditText;
    private Button calculateBtn;
    private TextView savingTotaltxtView;
    private List<Integer> savingsPerDayList ;
    private ListView listview;
    int spendNum, daysNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_streak);

        spend = (EditText) findViewById(R.id.spend);
        daysEditText = (EditText) findViewById(R.id.DaysId);
        calculateBtn = (Button) findViewById(R.id.calculateBtn);
        savingTotaltxtView = (TextView) findViewById(R.id.savingTotalId);
        listview = (ListView) findViewById(R.id.desglose);

        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spendNum = Integer.parseInt(spend.getText().toString());
                daysNum = Integer.parseInt(daysEditText.getText().toString());
                savingTotaltxtView.setText("You will save $" + calculateDaystreak(spendNum, daysNum) + " in " + daysNum + " days.");

                savingsPerDayList = calculatePerDay(daysNum, spendNum);
               //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, savingsPerDayList);
            }
        });
    }

    public int calculateDaystreak(int spendNum, int daysNum) {
        int savingTotal = 0, cycleCount = 0;

        for (int i = 0; i < daysNum; i++) {
            cycleCount++;
            savingTotal += cycleCount;

            if (cycleCount == spendNum)
                cycleCount = 0;
        }
        return savingTotal;
    }

    public ArrayList<Integer> calculatePerDay(int daysNum, int spendNum) {
        ArrayList<Integer> savingsPerDay = new ArrayList<>(daysNum);
        int spendCount = 0;
        for (int i = 0; i < daysNum; i++) {
            spendCount++;
            savingsPerDay.add(spendCount);
            if (spendCount == spendNum)
                spendCount = 0;
        }
        return savingsPerDay;
    }
}