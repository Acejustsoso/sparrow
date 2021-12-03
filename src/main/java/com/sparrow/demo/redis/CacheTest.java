package com.sparrow.demo.redis;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "on_class")//这个注解在类上使用，用来描述该类中所有方法使用的缓存名称
public class CacheTest {

    @Cacheable(key = "#id") //这个注解一般加在查询方法上，表示将一个方法的返回值缓存起来，默认情况下，缓存的key就是方法的参数，缓存的value就是方法的返回值
    public String test1(Integer id) {
        return id + "1-----1";
    }

    //这个注解一般加在更新方法上，当数据库中的数据更新后，缓存中的数据也要跟着更新，使用该注解，可以将方法的返回值自动更新到已经存在的key上
    @CachePut
    public String test2(Integer id) {
        return id + "2-----2";
    }

    //这个注解一般加在删除方法上，当数据库中的数据删除后，相关的缓存数据也要自动清除，
    // 该注解在使用的时候也可以配置按照某种条件删除（condition属性）或者或者配置清除所有缓存（allEntries属性）
    @CacheEvict
    public void test3(Integer id) {
    }

}
