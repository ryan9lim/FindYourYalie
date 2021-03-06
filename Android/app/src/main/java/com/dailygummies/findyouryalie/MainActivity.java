package com.dailygummies.findyouryalie;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // User Session
    private UserSession mUserSession;
    // Instance fields
    Account mAccount;

//    https://developer.android.com/training/sync-adapters/running-sync-adapter.html
//    https://developers.google.com/identity/sign-in/android/sign-in
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Check User Session
        mUserSession = new UserSession(this);
        mUserSession.checkLogin();

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
