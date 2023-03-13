package com.im.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName addfriend
 */
@TableName(value ="addfriend")
@Data
public class Addfriend implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 被添加用户id
     */
    private Long addUser;

    /**
     * 添加状态 ：0审核| 1通过 | 2 拒绝
     */
    private Integer status;

    /**
     * 添加消息
     */
    private String message;

    /**
     * 申请时间
     */
    private Date createTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}