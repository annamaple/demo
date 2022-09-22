package com.example.cron.timer;

import cn.hutool.core.date.DateTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Springboot 中提供了一套轻量级的定时任务工具 Spring Task，通过注解可以很方便的配置，支持 cron 表达式、fixedRate、fixedDelay。
 *
 * @author lei
 */
@Component
@EnableScheduling
@Slf4j
public class TestSpringBootTask {

    /**
     * 每分钟的第30秒跑一次
     */
    @Scheduled(cron = "5/5 * * * * ?")
    public void task1() {
        log.info("TestSpringBootTask cron...[{}]", DateTime.now());
    }

    /**
     * 每隔5秒跑一次
     */
    @Scheduled(fixedRate = 5000)    
    public void task2() {
        log.info("TestSpringBootTask fixedRate...[{}]", DateTime.now());
    }

    /**
     * 上次跑完隔3秒再跑
     */
    @Scheduled(fixedDelay = 5000)
    public void task3() {
        log.info("TestSpringBootTask fixedDelay...[{}]", DateTime.now());
    }
}
