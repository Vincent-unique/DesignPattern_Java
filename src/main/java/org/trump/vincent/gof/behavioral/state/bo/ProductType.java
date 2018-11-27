package org.trump.vincent.gof.behavioral.state.bo;

import lombok.Data;

/**
 * Description: 商品信息
 * User: vincent
 * Date: 2018/11/27
 **/

@Data
public class ProductType {

    private Long productId;     // 产品ID

    private String productName;     // 产品名称

    private Integer category;   // 产品分类

    private Double price;   // 产品定价

    private Long shopId;    // 产品所属商铺ID
}
