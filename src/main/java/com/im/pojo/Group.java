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
 * @TableName group
 */
@TableName(value ="group")
@Data
public class Group implements Serializable {
    /**
     *
     */
    @TableId
    private Long id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建用户id
     */
    private Long userId;

    /**
     * 群聊名称
     */
    private String name;
    /**
     * 群聊头像
     */
    private String picture;

    /**
     * 群聊简介
     */
    private String introduction;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
