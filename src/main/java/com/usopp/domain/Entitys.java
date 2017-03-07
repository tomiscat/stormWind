package com.usopp.domain;

import java.io.Serializable;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Entity 基类
 * Created by fov on 2017/3/7.
 */
public class Entitys implements Serializable{
    public static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
