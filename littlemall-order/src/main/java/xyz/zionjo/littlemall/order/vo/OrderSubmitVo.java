package xyz.zionjo.littlemall.order.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderSubmitVo {

    private Long addrId;

    private Integer payType;

    private String orderToken;

    private BigDecimal payPrice;

    private String note;
}
