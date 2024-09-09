package com.madeby.fun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main
{
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main( String[] args )
    {
        for ( int i = 1; i <= 5; i++ ) {
            logger.info("i value = {}", i);
        }
    }
}

