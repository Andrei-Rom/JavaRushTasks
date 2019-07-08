package com.javarush.task.task28.task2805;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {

    static AtomicInteger priority = new AtomicInteger(0);

    {
        priority.incrementAndGet();
        priority.compareAndSet(11, 1);
        setPriority(priority.get());
    }

    public MyThread() {
        setPriority(priority.get());
    }

    public MyThread(Runnable target) {
        super(target);
        setPriority(priority.get());
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        setPriority(priority.get());
    }

    public MyThread(String name) {
        super(name);
        setPriority(priority.get());
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        setPriority(priority.get());
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
        setPriority(priority.get());
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        setPriority(priority.get());
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
        setPriority(priority.get());
    }
}
