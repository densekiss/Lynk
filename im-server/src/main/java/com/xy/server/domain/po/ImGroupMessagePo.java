package com.xy.server.domain.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName im_group_message
 */
@TableName(value = "im_group_message")
@Data
public class ImGroupMessagePo implements Serializable {
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     * Still in CONNECTING state.
     */
    @TableId(value = "message_id")
    private String message_id;
    /**
     *
     */
    @TableField(value = "group_id")
    private String group_id;
    /**
     *
     */
    @TableField(value = "from_id")
    private String from_id;
    /**
     *
     */
    @TableField(value = "message_body", typeHandler = JacksonTypeHandler.class)
    private Object message_body;
    /**
     *
     */
    @TableField(value = "message_time")
    private Long message_time;
    /**
     *
     */
    @TableField(value = "message_content_type")
    private String message_content_type;
    /**
     * If this is a native custom element, make sure to exclude it from component resolution via compilerOptions.isCustomElement.
     */
    @TableField(value = "extra")
    private String extra;
    /**
     *
     */
    @TableField(value = "del_flag")
    private Integer del_flag;
    /**
     *
     */
    @TableField(value = "sequence")
    private Long sequence;
    /**
     *
     */
    @TableField(value = "message_random")
    private String message_random;
    /**
     *
     */
    @TableField(value = "create_time")
    private Long create_time;

}