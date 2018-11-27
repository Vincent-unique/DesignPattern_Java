package org.trump.vincent.gof.behavioral.state.bo;

import javafx.util.Pair;
import lombok.Data;

import java.util.List;

/**
 * Description: 物流信息
 * User: vincent
 * Date: 2018/11/27
 **/

@Data
public class LogisticsType {

    private Long orderId;   // 订单ID

    private Long shopId;    //  商铺ID

    private Long productId;     //  商品ID

    private Long accuntId;  //  账户ID

    private String fromAddress;  // 发货地址

    private String toAddress;   // 送货地址

    private List<Pair<String, String>> trackInfo;   // 物流轨迹

    private Integer LogisticsStatus; // 物流状态；也可用状态模式实现，此处简单化
}
