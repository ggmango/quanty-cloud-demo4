package com.quanty.cloud.common.resposeobject;
import lombok.Data;

import java.io.Serializable;

/**
 * 通用返回结果结果对象类型
 */
@Data
public class BaseResult implements Serializable {
    /**
     * 自定义返回状态码
     */
    public static final int STATUS_SUCCESS=200;
    public static final int STATUS_FAIL=500;
    private int status;
    private int count;
    private String message;
    private Object Data;

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(Object data) {
        Data = data;
    }

    public static  BaseResult success(){
        return BaseResult.createResult (STATUS_SUCCESS,"成功",null);

    }

    public static  BaseResult success(String message) {

        return BaseResult.createResult (STATUS_SUCCESS,message,null);
    }

    public static  BaseResult success(String message,int count) {

        return BaseResult.createResult (STATUS_SUCCESS,count,message,null);
    }

    public static  BaseResult success(String message,Object data) {

        return BaseResult.createResult (STATUS_SUCCESS,message,data);
    }

    public static  BaseResult success(String message,int count,Object data){
        return BaseResult.createResult(STATUS_SUCCESS,count,message,data);
    }

    public  static BaseResult fail(){

        return  BaseResult.createResult (STATUS_FAIL,"失败",null);
    }

    public  static BaseResult fail(String message){

        return  BaseResult.createResult (STATUS_FAIL,message,null);
    }

    public  static BaseResult fail(int status,String message){

        return  BaseResult.createResult (status,message,null);
    }

    public  static  BaseResult createResult(int status,String message,Object data){
        BaseResult baseResult=new BaseResult ();
        baseResult.setStatus (status);
        baseResult.setMessage (message);
        baseResult.setData (data);
        return  baseResult;
    }
    public  static  BaseResult createResult(int status,int count, String message,Object data){
        BaseResult baseResult=new BaseResult ();
        baseResult.setStatus (status);
        baseResult.setCount(count);
        baseResult.setMessage (message);
        baseResult.setData (data);
        return  baseResult;
    }

}

