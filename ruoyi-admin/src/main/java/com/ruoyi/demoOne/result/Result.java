package com.ruoyi.demoOne.result;

/**
 * 返回通用模型
 * ClassName: Result
 * Package: com.ruoyi.demoOne.result
 * Description:
 *
 * @Author 李玉龙
 * @Create 2024/1/20 19:36
 * @Version 1.0
 */
public class Result <T> {
    /**
     * 返回码
     */
    private String code;

    /**
     * 返回消息
     */
    private String msg;

    /**
     * 响应数据
     */
    private T data;
    public Result(){

    }
    public Result(String code,String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result( T data) {
        this.code = "0";
        this.msg = "success";
        this.data = data;
    }
}
