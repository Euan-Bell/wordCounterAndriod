package com.example.euan.wordcounterhomework;

import org.junit.Before;

public class WordCounterTest {

    WordCounter wordCounter;
    Answer answer;

    @Before
    public void before(){
        answer = new Answer();
        wordCounter = new WordCounter();
    }
}
