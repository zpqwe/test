package com.zp.classloader;

/**
 * @program: mydemo
 * @author: Mr.zeng
 * @create: 2021-01-11 15:01
 **/
public class MyClassLoader extends ClassLoader{
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}
