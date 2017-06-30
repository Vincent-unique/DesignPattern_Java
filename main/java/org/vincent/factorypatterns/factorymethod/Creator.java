package org.vincent.factorypatterns.factorymethod;

import org.vincent.util.LoggerUtil;

/**
 * Created by Administrator on 2017/5/22 0022.
 */

/**
 * 工厂方法模式，在于工厂的分工化
 * 不同类的产品，由对应职能的工厂完成产出
 */
public abstract class Creator extends LoggerUtil{
    public abstract <T extends AbstractProduct> T factory(Class<T> product);
}
