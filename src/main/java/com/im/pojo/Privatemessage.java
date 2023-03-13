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
 * @TableName privatemessage
 */
@TableName(value ="privatemessage")
@Data
public class Privatemessage implements Serializable {
    /**
     * 消息id
     */
    @TableId
    private Integer id;

    /**
     * 发送者id
     */
    private Long senderId;

    /**
     * 接受者id
     */
    private Long receiverId;

    /**
     * 消息内容
     */
    private String context;

    /**
     * 发送时间
     */
    private Date sendTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}