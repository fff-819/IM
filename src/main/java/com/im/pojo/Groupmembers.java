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
 * @TableName groupmembers
 */
@TableName(value ="groupmembers")
@Data
public class Groupmembers implements Serializable {
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
     * 申请加入群聊的用户id
     */
    private Long userId;

    /**
     * 审核状态：1审核、2同意、3拒绝
     */
    private Integer status;

    /**
     * 申请信息
     */
    private String massage;

    /**
     * 申请时间
     */
    private Date createTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}