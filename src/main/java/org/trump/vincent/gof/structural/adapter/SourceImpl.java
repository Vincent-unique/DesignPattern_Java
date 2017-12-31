package org.trump.vincent.gof.structural.adapter;

import java.util.Properties;

public class SourceImpl implements ISource {

    private Properties properties;

    public void originWork(){
        /**
         * TODO
         * source origin working from source definition
         */
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
