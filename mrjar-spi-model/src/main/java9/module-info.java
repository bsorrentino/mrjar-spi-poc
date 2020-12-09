module org.bsc {

    requires org.bsc.service;
    requires metainf.services;

    provides org.bsc.service.MyService with org.bsc.impl.MyServiceImpl;
}