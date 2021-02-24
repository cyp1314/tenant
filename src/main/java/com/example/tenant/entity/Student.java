package com.example.tenant.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.tenant.entity.code.AgeEnum;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Mr-CHEN
 * @version 1.0
 * @description: TODO
 * @date 2021-02-24 14:47
 */
@Data
@TableName("student")
public class Student implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private AgeEnum ageDesc;

    @TableLogic
    private Integer deleted;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
