package org.trump.vincent.gof.factorypatterns.abstractfactory;

/**
 * Created by liwei on 2017/5/23 0023.
 */

import org.trump.vincent.util.LoggerUtil;

/**
 * 抽象工厂模式——产品族
 * 产品分族，不同族系的产品由相应该族的工厂产出
 */
public abstract class AbstractFactory extends LoggerUtil {
    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryBelongs() {
        return factoryBelongs;
    }

    public void setFactoryBelongs(String factoryBelongs) {
        this.factoryBelongs = factoryBelongs;
    }

    private String factoryName = null;
    private String factoryBelongs = "";

}
