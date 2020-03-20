package com.Spring_Study.web.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ytf
 * @Description TODO
 * @Date 2020/3/20
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseObject {
    private  Integer code;
    private  String msg;
    private  Object data;
}
