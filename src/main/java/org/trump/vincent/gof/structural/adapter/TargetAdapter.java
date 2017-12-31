package org.trump.vincent.gof.structural.adapter;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Properties;

public class TargetAdapter implements ITarget {
    private ISource source;

    private HashMap props;

    public TargetAdapter(ISource source){
        this.source = source;
    }

    public void targetWork(){
        /**
         * Target type Working Implementation by adapter;
         * which convert source working to the target working
         *
         * TODO
         */
    }

    public String propsInfo() {
        String info = this.props==null?""
                : new Gson().toJson(this.props);
        return info;
    }

    public ITarget convertSource2Target(){
        Properties properties = source.getProperties();
        this.props = new HashMap(properties);
        return this;
    }
}
