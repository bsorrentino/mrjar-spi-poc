package org.bsc.impl;

import org.bsc.service.MyService;
import org.kohsuke.MetaInfServices;

@MetaInfServices(MyService.class)
public class MyServiceImpl implements MyService {
    @Override
    public String getName() {
        return "HELLO WORLD!";
    }
}
