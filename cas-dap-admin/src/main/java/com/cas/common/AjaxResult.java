package com.cas.common;

import java.util.HashMap;

public class AjaxResult extends HashMap<String, Object> {
    // 状态码
    private static final String CODE_TAG = "code";

    // 返回内容
    private static final String MSG_TAG = "msg";

    // 数据对象
    private static final String DATA_TAG = "data";

    /**
     * 初始化一个新创建的 AjaxResult 对象，使其表示一个空消息。
     */
    public AjaxResult() {
    }

    /**
     * 返回成功消息
     *
     * @return 成功消息
     */
    public static AjaxResult success() {
        return AjaxResult.success("操作成功");
    }

    /**
     * 返回成功数据
     *
     * @return 成功消息
     */
    public static AjaxResult success(Object data) {
        return AjaxResult.success("操作成功", data);
    }

    /**
     * 返回成功消息
     *
     * @param msg 返回内容
     * @param data 数据对象
     * @return 成功消息
     */
    public static AjaxResult success(String msg, Object data) {
        AjaxResult json = new AjaxResult();
        json.put(CODE_TAG, 200);
        json.put(MSG_TAG, msg);
        if (data != null) {
            json.put(DATA_TAG, data);
        }
        return json;
    }

    /**
     * 返回错误消息
     *
     * @return
     */
    public static AjaxResult error() {
        return AjaxResult.error("操作失败");
    }

    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @return 错误消息
     */
    public static AjaxResult error(String msg) {
        return AjaxResult.error(msg, null);
    }

    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @param data 数据对象
     * @return 错误消息
     */
    public static AjaxResult error(String msg, Object data) {
        AjaxResult json = new AjaxResult();
        json.put(CODE_TAG, 500);
        json.put(MSG_TAG, msg);
        if (data != null) {
            json.put(DATA_TAG, data);
        }
        return json;
    }
}
