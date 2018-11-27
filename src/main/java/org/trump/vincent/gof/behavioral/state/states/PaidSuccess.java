package org.trump.vincent.gof.behavioral.state.states;

import lombok.Data;
import org.trump.vincent.gof.behavioral.state.OrderStateEnum;

/**
 * Description:
 * User: vincent
 * Date: 2018/11/27
 **/

@Data
public class PaidSuccess {

    private OrderStateEnum state = OrderStateEnum.PAID_SUCCESS;

    private String modTime; // 状态变更时间
}
