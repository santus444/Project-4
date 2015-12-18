package com.udacity.gradle.builditbigger.testing;

import com.example.Jokes;

import org.junit.Test;

/**
 * Created by santosh on 12/13/15.
 */
public class JokesFetchTest {
    @Test
    public void fetchTest(){
        String result = new Jokes().getJoke();
        assert result.length()!=0;
    }
}
