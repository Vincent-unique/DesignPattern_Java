package org.trump.vincent.gof.behavioral.state.bo;

import lombok.Data;
import org.trump.vincent.gof.behavioral.state.AbstractOrderState;
import org.trump.vincent.gof.behavioral.state.bo.CustomerType;
import org.trump.vincent.gof.behavioral.state.bo.LogisticsType;
import org.trump.vincent.gof.behavioral.state.bo.ProductType;
import org.trump.vincent.gof.behavioral.state.bo.ShopType;

/**
 * Description: 订单内容
 * User: vincent
 * Date: 2018/11/27
 **/

@Data
public class Order {

    private Long orderId;   // 订单ID

    private AbstractOrderState orderState;  // 订单状态

    private ShopType shopType;  // 店铺信息

    private ProductType productType;    // 商品信息

    private CustomerType customerType;  // 客户信息

    private Double turnOver;    // 订单成交金额

    private LogisticsType logisticsType;    // 物流信息
}
