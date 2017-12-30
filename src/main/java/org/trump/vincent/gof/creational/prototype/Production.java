package org.trump.vincent.gof.creational.prototype;

import java.util.Properties;

public class Production extends Prototype {

    private Properties properties;

    public Production(Properties properties){
        this.properties = properties;
    }


    public Production setProperties(Properties properties) {
        this.properties = properties;
        return this;
    }

    public Properties getProperties() {
        return properties;
    }



    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("name","vincent");
        properties.setProperty("sex","female");

        Production production = new Production(properties);

        /**
         * Duplication copied from origin production
         * Thereofore ,they are not the same one.
         */
        Production duplicate =(Production) production.clone();

        System.out.println(production == duplicate);
    }
}
