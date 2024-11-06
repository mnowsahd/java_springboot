package com.nowshad.crud.common;

import java.io.Serializable;

public interface ResponseWrapper<T> extends Serializable {

public  T getData();

public boolean isSuccess();

public String getMsg();

}
