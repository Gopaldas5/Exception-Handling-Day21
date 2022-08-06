package com.bridegeLabz;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class MoodAnalyserTest {
    @Test
    public void givenMsgWhenSadReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am sad");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        }catch (MoodAnalysisException e){

        }
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public void givenMsgWhenNotSadReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am happy");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        }catch (MoodAnalysisException e){

        }
        Assert.assertEquals("HAPPY", mood);
    }

}