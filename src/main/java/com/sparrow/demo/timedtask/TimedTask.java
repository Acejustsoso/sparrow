package com.sparrow.demo.timedtask;

import org.springframework.stereotype.Component;

//定时任务的class一定要注册到bean中
@Component
public class TimedTask {
//    //所有时间的单位都是毫秒。
//
//    //fixedRate 表示任务执行之间的时间间隔，具体是指两次任务的开始时间间隔，即第二次任务开始时，第一次任务可能还没结束。
//    @Scheduled(fixedRate = 2000)
//    public void fixedRate() {
//        System.out.println("fixedRate>>>" + LocalDateTime.now());
//    }
//
//    //fixedDelay 表示任务执行之间的时间间隔，具体是指本次任务结束到下次任务开始之间的时间间隔。
//    @Scheduled(fixedDelay = 2000)
//    public void fixedDelay() {
//        System.out.println("fixedDelay>>>" + LocalDateTime.now());
//    }
//
//    //initialDelay 表示首次任务启动的延迟时间。
//    @Scheduled(initialDelay = 2000, fixedDelay = 2000)
//    public void initialDelay() {
//        System.out.println("initialDelay>>>" + LocalDateTime.now());
//    }
//
//
//    @Scheduled(cron = "0/5 * * * * *")
//    public void cron() {
//        System.out.println("现在是:" + LocalDateTime.now());
//    }
}
