package com.im.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 头像
     */
    private String picture;
    /**
     * 账号
     */
    private String accout;

    /**
     * 密码
     */
    private String password;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 用户名
     */
    private String name;

    /**
     * 出生日期
     */
    private String brith;

    /**
     * 性别 0女1男
     */
    private Boolean sex;

    /**
     * 电话
     */
    private String phoneNumber;

    /**
     * 住址
     */
    private String address;

    /**
     * 在线状态
     */
    private String status;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
