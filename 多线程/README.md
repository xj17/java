多线程概述
1.每个进程是一个应用程序，都有独立的内存空间
2.同一个进程中的线程共享其进程中的内存和资源
3.线程是进程中的一个执行场景，也就是执行流程
作用：提高应用程序的使用率，线程和线程共享‘堆内存和方法区内存’，栈内存是独立的。

java程序运行原理：java命令会启动虚拟机，启动jvm等于启动了一个应用程序，表示启动了一个进程，该进程会自动启动一个主线程，然后主线程去调用某个类的main方法，所有main方法运行在主线程中，在此之前所有程序都是单线程的，
