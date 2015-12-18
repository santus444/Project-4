package com.gradle.builditbigger.androidtests;

import android.test.AndroidTestCase;

import com.example.Jokes;

/**
 * Created by santosh on 12/13/15.
 */
public class JokesFetchTest extends AndroidTestCase {
    public void testFetch() {
        String result = new Jokes().getJoke();
        //assertEquals(0, result.length());
        assertTrue(0 != result.length());
    }
}
