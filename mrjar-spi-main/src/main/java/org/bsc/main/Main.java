package org.bsc.main;

import org.bsc.service.MyService;

import java.util.ServiceLoader;

public class Main {

    public static void main( String args[] ) {


        ServiceLoader<MyService> loader = ServiceLoader.load( MyService.class );


        System.out.println( loader.iterator().next().getName() );
    }
}
