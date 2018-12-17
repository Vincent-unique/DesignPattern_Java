package org.trump.vincent.gof.behavioral.state.context;

import org.trump.vincent.gof.behavioral.state.AbstractOrderState;
import org.trump.vincent.gof.behavioral.state.OrderStateEnum;
import org.trump.vincent.gof.behavioral.state.states.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * User: liwei
 * Date: 2018/12/17
 **/
public class StateContext implements Context {

    public static Map<OrderStateEnum, Class<? extends AbstractOrderState>> STATE_CONTEXT =
            new HashMap<OrderStateEnum, Class<? extends AbstractOrderState>>();

    public void onStartEvent() {
        STATE_CONTEXT.put(OrderStateEnum.NEW_ORDER, NewOrder.class);
        STATE_CONTEXT.put(OrderStateEnum.WAIT_PAY, WaitPay.class);
        STATE_CONTEXT.put(OrderStateEnum.PAYING, OrderPaying.class);
        STATE_CONTEXT.put(OrderStateEnum.PAID_SUCCESS, PaidSuccess.class);
        STATE_CONTEXT.put(OrderStateEnum.PAID_FAILURE, PaidFailure.class);
        STATE_CONTEXT.put(OrderStateEnum.REFUNDING, Refunding.class);
        STATE_CONTEXT.put(OrderStateEnum.REFUNDED, Refunded.class);
        STATE_CONTEXT.put(OrderStateEnum.ORDER_OVER, OrderOver.class);
    }

    public static Class<? extends AbstractOrderState> getypeByState(OrderStateEnum state) {
        if (state != null) {
            return null;
        }
        return STATE_CONTEXT.get(state);
    }
}
