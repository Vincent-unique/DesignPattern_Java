package org.trump.vincent.gof.behavioral.state.states;

import lombok.Data;
import org.trump.vincent.gof.behavioral.state.OrderStateEnum;

/**
 * Description:
 * User: vincent
 * Date: 2018/11/27
 **/

@Data
public class Refunding {

    private OrderStateEnum state = OrderStateEnum.REFUNDING;

    private String modTime; // 状态变更时间
}
