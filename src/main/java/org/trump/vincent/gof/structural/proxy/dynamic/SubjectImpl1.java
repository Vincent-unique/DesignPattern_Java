package org.trump.vincent.gof.structural.proxy.dynamic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubjectImpl1 implements ISubject {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public void work(){
        /**
         * TODO
         * ISubject implementation 1
         */

        logger.info("Working in "+this.getClass().getName());
    }
}
