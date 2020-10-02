package com.gopal.JokesApp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import sun.net.www.http.ChunkedInputStream;


@Service
public class JokesServiceImpl implements  JokesService{


    private final ChuckNorrisQuotes chuckNorrisQuotes;

    @Autowired
    public JokesServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        System.out.println("Joke services created in service....");
        this.chuckNorrisQuotes=chuckNorrisQuotes;
    }

    @Override
    public java.lang.String getJokes() {
        String randomQuotes = chuckNorrisQuotes.getRandomQuote();
        System.out.println("Random Quotes:"+randomQuotes);
        return randomQuotes;
    }
   /* @Override
    public java.lang.String getJokes() {
        return "test";
    }*/
}
