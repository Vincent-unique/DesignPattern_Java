package org.trump.vincent.gof.behavioral.state;

import org.trump.vincent.gof.behavioral.state.context.OrderContext;

import java.io.IOException;

/**
 * Description: 订单状态抽象
 * User: vincent
 * Date: 2018/11/26
 **/
public abstract class AbstractOrderState implements IState<OrderStateEnum, OrderContext>{
    private OrderStateEnum state;

    public OrderStateEnum getState() {
        return this.state;
    }

    /**
     * 订单状态变更持久化-订单轨迹
     * @param order
     * @return
     */
    public boolean statePersist(OrderContext order) {

//        try {
//            //TODO Order状态变更持久化
//        } catch (IOException e) {
//            return false;
//        }
//
        return true;
    }

    public ActionResponse newOrder(OrderContext order) {
        return new ActionResponse(){{
            setCode(-1);
            setError("当前不允许创建新订单");
        }};
    }

    public ActionResponse orderPay(OrderContext order) {
        return new ActionResponse(){{
            setCode(-1);
            setError("当前状态不允许支付");
        }};
    }

    public ActionResponse refund(OrderContext order) {
        return new ActionResponse(){{
            setCode(-1);
            setError("当前状态不允许退款");
        }};
    }

    public ActionResponse actionX(OrderContext order){
        return new ActionResponse(){{
            setCode(-1);
            setError("当前状态不允许X..");
        }};
    }
}
