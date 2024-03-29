package com.cas.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 * 数据接入端口配置
 * </p>
 *
 * @author wmj
 * @since 2024-01-21
 */
@Getter
@Setter
@TableName("config_access_listen")
public class ConfigAccessListen implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 端口
     */
    private Integer port;

    /**
     * 传输协议
     */
    private String transferProtocol;

    /**
     * 状态（0-不可用;1-可用）
     */
    private Boolean status;
}
