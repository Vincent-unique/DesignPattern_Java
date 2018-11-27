package org.trump.vincent.gof.behavioral.state.bo;

import lombok.Data;

/**
 * Description: 客户信息
 * User: vincent
 * Date: 2018/11/27
 **/

@Data
public class CustomerType {

    private Long accuntId;  // 账户ID

    private String accountName;     // 账户名称

    private String email;   // 账户email

    private String phoneNo;    // 账户电话号码
}
