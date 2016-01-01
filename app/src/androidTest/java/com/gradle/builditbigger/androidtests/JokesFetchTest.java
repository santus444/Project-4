package com.gradle.builditbigger.androidtests;

import android.test.AndroidTestCase;
import android.util.Log;

import com.example.EndpointsAsyncTask;

import java.util.concurrent.ExecutionException;

/**
 * Created by santosh on 12/13/15.
 */
public class JokesFetchTest extends AndroidTestCase {
    public void testFetch() {
//        String result = new Jokes().getJoke();
//        //assertEquals(0, result.length());
//        assertTrue(0 != result.length());
        String te = null;
        try {
            te = new EndpointsAsyncTask(getContext(), true).execute().get();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        Log.e("Load", te);
    }
}
