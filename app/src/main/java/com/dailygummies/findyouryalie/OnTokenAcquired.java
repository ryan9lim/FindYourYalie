package com.dailygummies.findyouryalie;

import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.content.Intent;
import android.os.Bundle;

/**
 * https://developer.android.com/training/id-auth/authenticate.html
 * http://blog.udinic.com/2013/04/24/write-your-own-android-authenticator/
 * https://developer.android.com/training/id-auth/custom_auth.html ???
 * http://www.oclc.org/developer/develop/solution-guides/android-authentication-tutorial-sample-app.en.html
 * Callback called when a token is successfully acquired
 * https://developer.android.com/reference/android/accounts/AccountManager.html
 * Created by Limmy on 10/28/2016.
 */
public class OnTokenAcquired implements AccountManagerCallback<Bundle> {
    @Override
    public void run(AccountManagerFuture<Bundle> result) {
        /*
        // Get the result of the operation from the AccountManagerFuture.
        Bundle bundle = result.getResult();

        // The token is a named value in the bundle. The name of the value
        // is stored in the constant AccountManager.KEY_AUTHTOKEN.
        token = bundle.getString(AccountManager.KEY_AUTHTOKEN);


        Intent launch = (Intent) result.getResult().get(AccountManager.KEY_INTENT);
        if (launch != null) {
            startActivityForResult(launch, 0);
            return;
        }
*/
    }
}