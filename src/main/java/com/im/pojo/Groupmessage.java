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
 * @TableName groupmessage
 */
@TableName(value ="groupmessage")
@Data
public class Groupmessage implements Serializable {
    /**
     * 
     */
    @TableId
    private Long id;

    /**
     * 群聊id
     */
    private Long groupId;

    /**
     * 用户id
     */
    private Long sendId;

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