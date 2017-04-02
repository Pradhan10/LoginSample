package com.pradhanrishisharma.www.loginsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DescAndEligibility extends AppCompatActivity {

    private TextView mDesc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Catching intent and showing revelant info

        Intent intent = getIntent();
        Integer id = intent.getIntExtra("mDescID", 1);

        //TODO : Implement yojna eligibility according to criteria . Check multiple parameters and return True or False.
        setContentView(R.layout.activity_desc_and_eligibility);
        mDesc = (TextView) findViewById(R.id.yojnaDesc);
        switch (id) {
            case 1:
                mDesc.setText(R.string.ddu_gky);
                break;

            case 2:
                mDesc.setText(R.string.mgnrega);
                break;

            case 3:
                mDesc.setText(R.string.nrum);
                break;

            case 4:
                mDesc.setText(R.string.pmay);
                break;

            case 5:
                mDesc.setText(R.string.pmgsy);
                break;

            case 6:
                mDesc.setText(R.string.nsap);
                break;

            case 7:
                mDesc.setText(R.string.saanjhi);
                break;

            case 8:
                mDesc.setText("Description Not Available");
                break;

            case 9:
                mDesc.setText(R.string.day_nrlm);
                break;

            case 10:
                mDesc.setText(R.string.ddp);
                break;

            case 11:
                mDesc.setText("Description Not Available");
                break;

            case 12:
                mDesc.setText(R.string.hariyali);
                break;

            case 13:
                mDesc.setText(R.string.gwd);
                break;

            case 14:
                mDesc.setText(R.string.ips);
                break;

            case 15:
                mDesc.setText(R.string.tdet);
                break;


        }

    }
}
