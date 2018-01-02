package org.trump.vincent.gof.structural.bridge.bridges.feature;

import java.util.Map;
import java.util.Properties;

/**
 * Created by Vincent on 2018/1/2 0002.
 */
public interface Feature {

    Properties getFeatures();

    void settings(Map properties);
}
