package com.example.utils;

import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

public class FormUtil {

    @SuppressWarnings("unchecked")
    public static <T> T toModel(Class<T> clazz, HttpServletRequest request) {
        T object = null;
        try {
            object = clazz.getDeclaredConstructor().newInstance();
            BeanUtils.populate(object, request.getParameterMap());
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException
                | NoSuchMethodException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
        return object;
    }
}
