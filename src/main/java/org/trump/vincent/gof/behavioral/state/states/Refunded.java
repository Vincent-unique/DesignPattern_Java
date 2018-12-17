package org.trump.vincent.gof.behavioral.state.states;

import lombok.Data;
import org.trump.vincent.gof.behavioral.state.AbstractOrderState;
import org.trump.vincent.gof.behavioral.state.OrderStateEnum;

/**
 * Description:
 * User: vincent
 * Date: 2018/11/27
 **/

@Data
public class Refunded extends AbstractOrderState {

    private OrderStateEnum state = OrderStateEnum.REFUNDED;

    private String modTime; // 状态变更时间
}
