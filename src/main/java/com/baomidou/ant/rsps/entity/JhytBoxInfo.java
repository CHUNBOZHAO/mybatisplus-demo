package com.baomidou.ant.rsps.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhaochunbo
 * @since 2018-10-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("rsps_jhyt_box_info")
public class JhytBoxInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 电子标签
     */
    private String rfid;

    /**
     * 条形码
     */
    private String barcode;

    /**
     * 包装箱状态
     */
    private Integer status;

    /**
     * 操作人ID
     */
    private String operatorId;

    /**
     * 操作人名称
     */
    private String operator;

    /**
     * 操作时间
     */
    private LocalDateTime operateTime;

    /**
     * 百度地图上次地址
     */
    private String duAddress;

    /**
     * 用户上传的纬度
     */
    private Double duLatitude;

    /**
     * 用户上传的经度
     */
    private Double duLongitude;

    /**
     * 用户上传的坐标类型
1：GPS经纬度坐标 2：国测局加密经纬度坐标 3：百度加密经纬度坐标 4：百度加密墨卡托坐标
     */
    private Integer duCoordType;

    /**
     * table的标识
     */
    private String duTableId;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 箱子的名称
     */
    private String boxName;

    /**
     * 下一个操作人wms提供的ID
     */
    private String nextOperatorId;

    /**
     * 包装箱和条形码绑定时间
     */
    private LocalDateTime bindTime;

    private String detail;

    /**
     * 包裹签收状态
     */
    private Integer signStatus;

    /**
     * 中转状态
     */
    private Integer transitStatus;

    /**
     * 当前站点ID（系统用户ID）
     */
    private String transferId;


}
