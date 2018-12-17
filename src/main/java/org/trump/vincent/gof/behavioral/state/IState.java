package org.trump.vincent.gof.behavioral.state;

import org.trump.vincent.gof.behavioral.state.context.Context;

/**
 * Description:
 * User: vincent
 * Date: 2018/11/26
 **/
public interface IState<T, M extends Context> {

    T getState();

}
