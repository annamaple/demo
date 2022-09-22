package com.example.cron.timer;


import cn.hutool.core.date.DateTime;
import cn.hutool.core.thread.ThreadUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 使用JUC提供的可调度的线程池
 *
 * @author lei
 */
@Component
@Slf4j
public class TestScheduledExecutorService {

//    @PostConstruct
    public void task() {
        log.info("TestScheduledExecutorService...");
        final ScheduledThreadPoolExecutor scheduledExecutor = ThreadUtil.createScheduledExecutor(10);
        // 按照固定频率执行，每隔5秒跑一次
        scheduledExecutor.scheduleAtFixedRate(() -> log.info("TestScheduledExecutorService.scheduleAtFixedRate run...[{}]", DateTime.now()),
                0, 5, TimeUnit.SECONDS);
        // 按照固定延时执行，上次执行完后隔3秒再跑
        /*scheduledExecutor.scheduleWithFixedDelay(() -> log.info("TestScheduledExecutorService.scheduleWithFixedDelay run...[{}]", DateTime.now()),
                0, 3, TimeUnit.SECONDS);*/

    }
}
