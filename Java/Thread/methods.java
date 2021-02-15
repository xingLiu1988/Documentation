void start();
    启动线程

run();
    需要覆盖的方法，程序写在里面

String getName();
    获取当前线程的名字

void setName(String name);
    设置当前线程的名字

static Thread currentThread();
    获取当前线程

static void yield();
    让出当前线程的执行权，但是还是有机会再次获取执行权

join();
    强行加入线程并执行到结束

static void sleep(long millis);
    暂停该线程一段时间，会抛异常

boolean isAlive();
    判断当前线程是否还活着