//1. block
synchronized(this){
    //同步代码用于操作同享数据的代码
}

//2. method
public synchronized void show() {
    if(ticket > 0) {
        System.out.println(Thread.currentThread().getName() + "..." + ticket);
        ticket--;
    }
}