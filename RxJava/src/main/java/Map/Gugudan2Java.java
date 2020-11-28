package Map;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;

import java.util.Scanner;

public class Gugudan2Java {
    public void emit(){
        Scanner in = new Scanner(System.in);
        System.out.println("Gugudan Input : ");
        int dan = Integer.parseInt(in.nextLine());

        Function<Integer, Observable<String>> gugudan = num ->
                Observable.range(1, 9).map(row -> num + " * " + row + " = " + num * row);
        Observable<String> source = Observable.just(dan).flatMap(gugudan);
        source.subscribe(System.out::println);
    }

    public static void main(String[] args) {
        Gugudan2Java demo = new Gugudan2Java();
        demo.emit();
    }
}
