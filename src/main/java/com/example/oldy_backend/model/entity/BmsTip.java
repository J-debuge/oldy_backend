package com.example.oldy_backend.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@TableName("bms_tip")
@NoArgsConstructor
public class BmsTip implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 内容
     */
    @TableField("content")
    private String content;

    /**
     * 公告时间
     */
    private String author;

    /**
     * 1：展示中，0：过期
     */
    private boolean type;

}