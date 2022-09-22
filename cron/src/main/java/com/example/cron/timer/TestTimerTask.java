package com.example.cron.timer;

import cn.hutool.core.date.DateTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Timer;
import java.util.TimerTask;


/**
 * java.util.TimerTask 任务
 *
 * @author lei
 */
@Slf4j
@Component
public class TestTimerTask {

    // @PostConstruct 在 bean 创建期间由 Spring 调用
//    @PostConstruct
    public void task() {
        log.info("TestTimerTask...");
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                log.info("[{}] - running TestTimerTask...", DateTime.now());
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, 10, 5000);
    } 
}
