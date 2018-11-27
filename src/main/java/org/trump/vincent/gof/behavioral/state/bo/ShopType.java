package org.trump.vincent.gof.behavioral.state.bo;

import lombok.Data;

/**
 * Description: 店铺信息
 * User: vincent
 * Date: 2018/11/27
 **/

@Data
public class ShopType {

    private Long shopId;    // 店铺ID

    private String shopName;    // 店铺名称

    private Long ownerId;   // 电商ID

    private Integer shopState;      // 店铺状态： 0-营业中， 1-暂停营业， 2-关闭营业
}
