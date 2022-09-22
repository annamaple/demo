package com.example.cron.timer;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * 业务幂等解决方案- 使用DB/Zookeeper获取锁，再执行业务代码
 *
 * @author lei
 */
public class DbZkLockTaskDemo {

    @Scheduled(cron = "5/5 * * * * ?")
    public void task() {
        if (tryLock()) {
            // do...
            unLock();
        }
    }

    boolean tryLock() {
        // get lock
        return false;
    }

    void unLock() {
        // release lock
    }
}
