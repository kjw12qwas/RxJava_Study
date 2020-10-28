# RxJava Start!! 2020-10-28

RxJava를 build.gradle 파일에 추가 시킵니다.
-------------
```
dependencies {
    implementation 'io.reactivex.rxjava3:rxjava:3.0.0'
    implementation 'io.reactivex.rxjava3:rxkotlin:3.0.0'
}
```

#### FirstExample.java을 생성합니다.

```
public class FirstExample {
    public void emit() {
        Observable.just("Hello", "RxJava 2!!")
            .subscribe(System.out::println);
   }
   
   public static void main(String args[]) {
        FirstExample demo = new FirstExample();
        demo.emit();
    }
}
```

#### 결과

```
Hello
RxJava 2!!
```

