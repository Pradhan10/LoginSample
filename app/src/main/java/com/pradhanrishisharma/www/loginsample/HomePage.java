package com.pradhanrishisharma.www.loginsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.firebase.auth.FirebaseAuth;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

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
                finish();
                //Intent Login = new Intent(HomePage.this,LoginActivity.class);
                //startActivity(Login);
        }
        return super.onOptionsItemSelected(item);
    }

}
