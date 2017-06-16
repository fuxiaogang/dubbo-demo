package com.fuxg;

import org.springframework.stereotype.Service;

/**
 * @author fuxg
 * @create 2017-06-16 11:11
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "hello:" + name;
    }
}
