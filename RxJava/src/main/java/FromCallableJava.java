import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.Callable;

public class FromCallableJava {
    public void CallableJava(){
        /*Callable<String> callable = () -> {
            Thread.sleep(1000);
            return "Hello Callable";
        }; 람다식 */
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                return "Hello Callable";
            }
        };

        Observable<String> source = Observable.fromCallable(callable);
        source.subscribe(System.out::println);
    }

    public static void main(String[] args) {
        FromCallableJava demo = new FromCallableJava();
        demo.CallableJava();
    }
}
