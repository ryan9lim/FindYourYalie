package com.dailygummies.findyouryalie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /**
     * Used to update User Session Information
     */
    private UserSession mUserSession;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Set up User Session
        mUserSession =  new UserSession(getApplicationContext());
        mUserSession.checkLogin();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
