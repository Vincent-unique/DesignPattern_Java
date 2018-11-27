package org.trump.vincent.gof.behavioral.state.states;

import lombok.Data;
import org.trump.vincent.gof.behavioral.state.AbstractOrderState;
import org.trump.vincent.gof.behavioral.state.ActionResponse;
import org.trump.vincent.gof.behavioral.state.OrderStateEnum;

/**
 * Description: 新建订单
 * User: vincent
 * Date: 2018/11/26
 **/

@Data
public class NewOrder extends AbstractOrderState {

    private OrderStateEnum state = OrderStateEnum.NEW_ORDER;

    private String modTime; // 状态变更时间

}
