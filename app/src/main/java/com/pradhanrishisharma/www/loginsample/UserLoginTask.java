package com.pradhanrishisharma.www.loginsample;

import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;

import static android.content.ContentValues.TAG;
import static com.pradhanrishisharma.www.loginsample.FirebaseReferences.mAuth;
import static com.pradhanrishisharma.www.loginsample.MybaseUIRef.DUMMY_CREDENTIALS;

/**
 * Asynctask to do firebase user login
 * Author: Pradhan Rishi Sharma<pradhanrishi10@gmail.com></pradhanrishi10@gmail.com>
 */

public class UserLoginTask extends AsyncTask<Void, Void, Boolean> {

    private final String mEmail;
    private final String mPassword;

    UserLoginTask(String email, String password) {
        mEmail = email;
        mPassword = password;
    }

    @Override
    protected Boolean doInBackground(Void... params) {
        // TODO: attempt authentication against a network service.

        try {

            mAuth.signInWithEmailAndPassword(mEmail, mPassword)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            Log.d(TAG, "signInWithEmail:onComplete:" + task.isSuccessful());

                            // If sign in fails, display a message to the user. If sign in succeeds
                            // the auth state listener will be notified and logic to handle the
                            // signed in user can be handled in the listener.
                            if (!task.isSuccessful()) {
                                Log.w(TAG, "signInWithEmail:failed", task.getException());
                                //Toast.makeText(this, R.string.auth_failed, Toast.LENGTH_SHORT).show();
                            }

                            // ...
                        }
                    });


        } catch (Exception e) {
            return false;
        }

        for (String credential : DUMMY_CREDENTIALS) {
            String[] pieces = credential.split(":");
            if (pieces[0].equals(mEmail)) {
                // Account exists, return true if the password matches.
                return pieces[1].equals(mPassword);
            }
        }

        // TODO: register the new account here.
        return true;
    }

    @Override
    protected void onPostExecute(final Boolean success) {

        LoginActivity.AsyncRes = success;
        /**
         * Checking resut on main UI thread and displaying revelant message
         */

    }

    @Override
    protected void onCancelled() {
        LoginActivity.AsyncCancelled = true;

    }

}