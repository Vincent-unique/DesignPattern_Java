package org.trump.vincent.gof.builder;

import java.util.UUID;

/**
 * Created by Vincent on 2017/12/21 0021.
 */
public class BuilderApp {


    public PlumpResource provideResource(){
        PlumpResource.ResourceBuilder builder = new PlumpResource.ResourceBuilder();
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
