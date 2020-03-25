package com.ddd.order.shared;

import lombok.Data;

/**
 * @author Mr.Yangxiufeng
 * @date 2020-03-19 9:40
 */
@Data
public class Response extends DTO {
    private static final long serialVersionUID = 1L;

    private boolean isSuccess;

    private String errCode;

    private String errMessage;

    public static Response buildFailure(String errCode, String errMessage) {
        Response response = new Response();
        response.setSuccess(false);
        response.setErrCode(errCode);
        response.setErrMessage(errMessage);
        return response;
    }

    public static Response buildSuccess(){
        Response response = new Response();
        response.setSuccess(true);
        return response;
    }
}