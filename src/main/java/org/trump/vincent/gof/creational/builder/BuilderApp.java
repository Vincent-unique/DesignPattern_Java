package org.trump.vincent.gof.creational.builder;

import java.util.UUID;

/**
 * Created by Vincent on 2017/12/21 0021.
 */
public class BuilderApp {


    public FinalResource provideResource(){
        FinalResource.ResourceBuilder builder = new FinalResource.ResourceBuilder();
        builder.setResourceId(UUID.randomUUID().toString())
                .setName("hehe")
                .setCcid("solo")
                .setFolerId("/")
                .setIconUrl("http://hello.world")
                .setLifeCycle(10)
                .setPath("/kill/")
                .setStatus(0);

        return builder.build();
    }
}
