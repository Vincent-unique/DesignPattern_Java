package org.trump.vincent.gof.structural.bridge.bridges.feature.impl;

import org.trump.vincent.gof.structural.bridge.bridges.feature.Feature;

import java.util.Map;
import java.util.Properties;

/**
 * Created by Vincent on 2018/1/2 0002.
 */
public class FeatureImpl2 implements Feature {

    protected Properties properties;

    public FeatureImpl2(Properties properties){
        this.properties = properties;
    }
    public Properties getFeatures(){
        //TODO
        return this.properties;
    }

    public void settings(Map properties){
        //TODO
        this.properties.putAll(properties);
    }
}
