package com.pradhanrishisharma.www.loginsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.pradhanrishisharma.www.loginsample.NetwrokCheckModule.YojnaActivity;


public class HomePage extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.imgButton1).setOnClickListener(this);
        findViewById(R.id.imgButton2).setOnClickListener(this);
        findViewById(R.id.imgButton3).setOnClickListener(this);
        findViewById(R.id.imgButton4).setOnClickListener(this);
        findViewById(R.id.imgButton5).setOnClickListener(this);
        findViewById(R.id.imgButton6).setOnClickListener(this);
        findViewById(R.id.imgButton7).setOnClickListener(this);
        findViewById(R.id.imgButton8).setOnClickListener(this);
        findViewById(R.id.imgButton9).setOnClickListener(this);
        findViewById(R.id.imgButton10).setOnClickListener(this);
        findViewById(R.id.imgButton11).setOnClickListener(this);
        findViewById(R.id.imgButton12).setOnClickListener(this);
        findViewById(R.id.imgButton13).setOnClickListener(this);
        findViewById(R.id.imgButton14).setOnClickListener(this);
        findViewById(R.id.imgButton15).setOnClickListener(this);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater myInflater = getMenuInflater();
        myInflater.inflate(R.menu.menu, menu);
        Log.e("Activity_home:", "onCreateOptionsMenu called");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.signOut:
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(this, LoginActivity.class));
                finish();
                //Intent Login = new Intent(HomePage.this,LoginActivity.class);
                //startActivity(Login);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        int i = v.getId();
        Log.e("Activity_home:", "onClick called");
        switch (i) {

            case R.id.imgButton1:
                YojnaActivity.mYojnaId = 1;
                break;

            case R.id.imgButton2:
                YojnaActivity.mYojnaId = 2;
                break;

            case R.id.imgButton3:
                YojnaActivity.mYojnaId = 3;
                break;

            case R.id.imgButton4:
                YojnaActivity.mYojnaId = 4;
                break;

            case R.id.imgButton5:
                YojnaActivity.mYojnaId = 5;
                break;

            case R.id.imgButton6:
                YojnaActivity.mYojnaId = 6;
                break;

            case R.id.imgButton7:
                YojnaActivity.mYojnaId = 7;
                break;

            case R.id.imgButton8:
                YojnaActivity.mYojnaId = 8;
                break;

            case R.id.imgButton9:
                YojnaActivity.mYojnaId = 9;
                break;

            case R.id.imgButton10:
                YojnaActivity.mYojnaId = 10;
                break;

            case R.id.imgButton11:
                YojnaActivity.mYojnaId = 11;
                break;

            case R.id.imgButton12:
                YojnaActivity.mYojnaId = 12;
                break;

            case R.id.imgButton13:
                YojnaActivity.mYojnaId = 13;
                break;

            case R.id.imgButton14:
                YojnaActivity.mYojnaId = 14;
                break;

            case R.id.imgButton15:
                YojnaActivity.mYojnaId = 15;
                break;

        }
        Intent yojna = new Intent(HomePage.this, YojnaActivity.class);
        yojna.putExtra("mYojnaId", YojnaActivity.mYojnaId);
        startActivity(yojna);


    }
}
