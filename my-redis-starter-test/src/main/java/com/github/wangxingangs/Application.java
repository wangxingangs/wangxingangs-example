package com.github.wangxingangs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import redis.clients.jedis.Jedis;

/**
 * @author ziyu
 * @date 2021/3/31 22:31
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        Jedis jedis = applicationContext.getBean(Jedis.class);
        jedis.set("k1", "v1");
        System.out.println(jedis.get("k1"));
    }
}
