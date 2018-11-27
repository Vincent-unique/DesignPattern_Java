package org.trump.vincent.gof.behavioral.state.states;

import lombok.Data;
import org.trump.vincent.gof.behavioral.state.AbstractOrderState;
import org.trump.vincent.gof.behavioral.state.ActionResponse;
import org.trump.vincent.gof.behavioral.state.OrderStateEnum;
import org.trump.vincent.gof.behavioral.state.context.OrderContext;

/**
 * Description: 订单待支付
 * User: vincent
 * Date: 2018/11/26
 **/

@Data
public class WaitPay extends AbstractOrderState {

    private OrderStateEnum state = OrderStateEnum.WAIT_PAY;

    private String modTime; // 状态变更时间

    @Override
    public ActionResponse orderPay(OrderContext order) {

        /**
         * 订单支付逻辑
         */
        return new ActionResponse(){{
            setCode(0);
            setError("订单支付完成支付");
        }};
    }

}
