package Map;

import io.reactivex.rxjava3.core.Observable;

import java.util.Scanner;

public class GugudanJava {
    public void emit(){
        Scanner in = new Scanner(System.in);
        System.out.println("Gugudan Input:");
        int dan = Integer.parseInt(in.nextLine());

        Observable<Integer> source = Observable.range(1, 9);
        source.subscribe(row -> System.out.println(dan + " * " + row + " = " + dan * row));
    }

    public static void main(String[] args) {
        GugudanJava demo = new GugudanJava();
        demo.emit();
    }
}
