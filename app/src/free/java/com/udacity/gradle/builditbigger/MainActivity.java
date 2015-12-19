package com.udacity.gradle.builditbigger;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.Jokes;
import com.example.santosh.myapplication.backend.myApi.MyApi;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.santoshmandadi.showjokeandlib.ShowJoke;


public class MainActivity extends ActionBarActivity {
    private static MyApi myApiService = null;
    InterstitialAd mInterstitialAd;
    private String jokeFromServer;
    private Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
                showJokeActivity();
            }
        });
        requestNewInterstitial();


    }

    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("SEE_YOUR_LOGCAT_TO_GET_YOUR_DEVICE_ID")
                .build();

        mInterstitialAd.loadAd(adRequest);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view){

        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            showJokeActivity();
        }
    }

    private void showJokeActivity() {
        new EndpointsAsyncTask().execute(new Pair<Context, String>(this, "Manfred"));
    }

    private class EndpointsAsyncTask extends AsyncTask<Pair<Context, String>, Void, String> {
        private ProgressDialog progressDialog;


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressDialog = ProgressDialog.show(mContext, "Wait", "Loading Joke.....");

        }

        @Override
        protected String doInBackground(Pair<Context, String>... params) {
            return new Jokes().getJoke();
        }

        @Override
        protected void onPostExecute(String result) {

            jokeFromServer = result;
            progressDialog.dismiss();
            Intent showJokeIntent = new Intent(mContext, ShowJoke.class);
            showJokeIntent.putExtra(Intent.EXTRA_TEXT, jokeFromServer);
            startActivity(showJokeIntent);


        }
    }

}