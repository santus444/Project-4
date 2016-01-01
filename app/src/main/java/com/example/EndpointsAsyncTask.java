package com.example;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import com.santoshmandadi.showjokeandlib.ShowJoke;

/**
 * Created by santosh on 12/30/15.
 */
public class EndpointsAsyncTask extends AsyncTask<Void, Void, String> {
    private final Context mContext;
    private ProgressDialog progressDialog;
    private String jokeFromServer;
    private boolean mIsTest;


    public EndpointsAsyncTask(Context context, boolean isTest) {
        mContext = context;
        mIsTest = isTest;
    }

    @Override
    protected String doInBackground(Void... params) {
        return new Jokes().getJoke();
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        if (!mIsTest)
            progressDialog = ProgressDialog.show(mContext, "Wait", "Loading Joke.....");

    }

    @Override
    protected void onPostExecute(String result) {

        jokeFromServer = result;
        if (!mIsTest) {
            progressDialog.dismiss();

            Intent showJokeIntent = new Intent(mContext, ShowJoke.class);
            showJokeIntent.putExtra(Intent.EXTRA_TEXT, jokeFromServer);
            mContext.startActivity(showJokeIntent);
        }


    }
}