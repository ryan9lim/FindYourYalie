package com.dailygummies.findyouryalie;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // Constants
    // The authority for the sync adapter's content provider
    public static final String AUTHORITY = "com.example.android.datasync.provider";
    // An account type, in the form of a domain name
    public static final String ACCOUNT_TYPE = "example.com";
    // The account name
    public static final String ACCOUNT = "dummyaccount";

    // User Session
    private UserSession mUserSession;
    // Instance fields
    Account mAccount;


    //    /**
//     * Used to update User Session Information
//     */
//    private UserSession mUserSession;
//    https://developer.android.com/training/sync-adapters/running-sync-adapter.html
//    https://developers.google.com/identity/sign-in/android/sign-in
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUserSession = new UserSession(this);
        checkUserLoggedIn();

//        mAccount = CreateSyncAccount(this);

        // Set up User Session
//        AccountManager am = AccountManager.get(this);
//        Bundle options = new Bundle();

//        am.getAuthToken(
//                myAccount_,                     // Account retrieved using getAccountsByType()
//                "Manage your tasks",            // Auth scope
//                options,                        // Authenticator-specific options
//                this,                           // Your activity
//                new OnTokenAcquired(),          // Callback called when a token is successfully acquired
//                new Handler(new OnError()));    // Callback called if an error occurs
//        mUserSession =  new UserSession(getApplicationContext());
//        mUserSession.checkLogin();

    }

    /**
     *  Sign in
     */
    private void checkUserLoggedIn() {
        if(!mUserSession.isUserLoggedIn()){
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
    }
//
//    /**
//     * Create a new dummy account for the sync adapter
//     *
//     * @param context The application context
//     */
//    public static Account CreateSyncAccount(Context context) {
//        // Create the account type and default account
//        Account newAccount = new Account(
//                ACCOUNT, ACCOUNT_TYPE);
//        // Get an instance of the Android account manager
//        AccountManager accountManager =
//                (AccountManager) context.getSystemService(
//                        ACCOUNT_SERVICE);
//        /*
//         * Add the account and account type, no password or user data
//         * If successful, return the Account object, otherwise report an error.
//         */
//        if (accountManager.addAccountExplicitly(newAccount, null, null)) {
//            /*
//             * If you don't set android:syncable="true" in
//             * in your <provider> element in the manifest,
//             * then call context.setIsSyncable(account, AUTHORITY, 1)
//             * here.
//             */
//        } else {
//            /*
//             * The account exists or some other error occurred. Log this, report it,
//             * or handle it internally.
//             */
//        }
//    }
}
