package org.trump.vincent.gof.behavioral.state;

/**
 * Description: 商业订单有限状态机 FSM
 * User: vincent
 * Date: 2018/11/26
 **/
public enum OrderStateEnum {
    NEW_ORDER(1), // 新订单[订单创建成功，订单信息ok]

    WAIT_PAY(2), // 订单待支付

    PAYING(3), // 订单支付中

    PAID_SUCCESS(4), // 订单支付成功

    PAID_FAILURE(5), // 订单支付失败

    REFUNDING(6), // 订单退款中

    REFUNDED(7), // 订单退款完成

    ORDER_OVER(0),  // 订单确认完成


    ;

    OrderStateEnum(Integer value) {
        this.value = value;
    }

    private Integer value;


    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
