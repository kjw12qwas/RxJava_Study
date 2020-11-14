import io.reactivex.rxjava3.core.Observable;

import java.util.ArrayList;
import java.util.List;

public class FromIterableJava {
    //    public interface Iterator<E> {
//        boolean hasNext();
//        E next();
//    }
    public void integerArray() {
        List<String> names = new ArrayList<>();
        names.add("Jerry");
        names.add("William");
        names.add("Bod");

        Observable<String> source = Observable.fromIterable(names);
        source.subscribe(System.out::println);
    }

    public static void main(String[] args) {
        FromIterableJava demo = new FromIterableJava();
        demo.integerArray();
    }

}
