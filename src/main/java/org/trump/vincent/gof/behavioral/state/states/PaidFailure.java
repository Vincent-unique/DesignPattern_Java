package org.trump.vincent.gof.behavioral.state.states;

import lombok.Data;
import org.trump.vincent.gof.behavioral.state.ActionResponse;
import org.trump.vincent.gof.behavioral.state.OrderStateEnum;
import org.trump.vincent.gof.behavioral.state.context.OrderContext;

/**
 * Description:
 * User: vincent
 * Date: 2018/11/27
 **/

@Data
public class PaidFailure {

    private OrderStateEnum state = OrderStateEnum.PAID_FAILURE;

    private String modTime; // 状态变更时间


    public ActionResponse refund(OrderContext order) {

        // TODO  订单申请退款逻辑

        return new ActionResponse(){{
            setCode(0);
            setError("订单申请退款成功");
        }};
    }
}
