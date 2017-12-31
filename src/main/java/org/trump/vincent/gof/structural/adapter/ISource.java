package org.trump.vincent.gof.structural.adapter;

import java.util.Properties;

public interface ISource {

    void setProperties(Properties properties);

    Properties getProperties();

    void originWork();
}
