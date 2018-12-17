package org.trump.vincent.gof.behavioral.state;

import org.apache.tools.ant.taskdefs.condition.Or;
import org.trump.vincent.gof.behavioral.state.bo.Order;
import org.trump.vincent.gof.behavioral.state.context.StateContext;

import java.io.IOException;

/**
 * Description: 订单状态抽象
 * User: vincent
 * Date: 2018/11/26
 **/
public abstract class AbstractOrderState implements IState<OrderStateEnum, StateContext>{
    private OrderStateEnum state;

    public OrderStateEnum getState() {
        return this.state;
    }

    /**
     * 订单状态变更持久化-订单轨迹
     * @param order
     * @return
     */
    public boolean statePersist(Order order) {

//        try {
//            //TODO Order状态变更持久化
//        } catch (IOException e) {
//            return false;
//        }
//
        return true;
    }

    public ActionResponse newOrder(Order order) {
        return new ActionResponse(){{
            setCode(-1);
            setError("当前不允许创建新订单");
        }};
    }

    public ActionResponse orderPay(Order order) {
        return new ActionResponse(){{
            setCode(-1);
            setError("当前状态不允许支付");
        }};
    }

    public ActionResponse refund(Order order) {
        return new ActionResponse(){{
            setCode(-1);
            setError("当前状态不允许退款");
        }};
    }

    public ActionResponse actionX(Order order){
        return new ActionResponse(){{
            setCode(-1);
            setError("当前状态不允许X..");
        }};
    }
}
