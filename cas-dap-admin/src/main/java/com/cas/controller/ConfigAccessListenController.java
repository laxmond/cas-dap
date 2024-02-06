package com.cas.controller;

import com.cas.common.AjaxResult;
import com.cas.entity.ConfigAccessListen;
import com.cas.service.IConfigAccessListenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 数据接入端口配置
 * </p>
 *
 * @author wmj
 * @since 2024-01-21
 */
@RestController
@RequestMapping("/config/access/listen")
public class ConfigAccessListenController {

    @Autowired
    private IConfigAccessListenService configAccessListenService;

    /**
     * 查询数据接入端口配置列表
     */
    @GetMapping("/list")
    public AjaxResult list() {
        List<ConfigAccessListen> list = configAccessListenService.list();
        return AjaxResult.success(list);
    }

    /**
     * 根据id查询数据接入端口配置
     */
    @GetMapping("/get/{id}")
    public AjaxResult get(@PathVariable String id) {
        ConfigAccessListen configAccessListen = configAccessListenService.getById(id);
        return AjaxResult.success(configAccessListen);
    }

}
