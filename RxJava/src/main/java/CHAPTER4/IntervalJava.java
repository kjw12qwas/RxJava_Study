package CHAPTER4;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class IntervalJava {
    public void emit(){
        CommonUtils.exampleStart();
        Observable<Long> source = Observable.interval(100L, TimeUnit.MILLISECONDS)
                .map(data -> (data + 1) * 100)
                .take(5);
        source.subscribe(Log::it);
        CommonUtils.sleep(1000);
    }

    public static void main(String[] args) {
        IntervalJava demo = new IntervalJava();
        demo.emit();
    }
}

class Log {
    public static void it(Object obj){
        long time = System.currentTimeMillis() - CommonUtils.startTime;
        System.out.println(Thread.currentThread().getName()  + " | " + time + " | " + "value = " + obj);
    }
}


