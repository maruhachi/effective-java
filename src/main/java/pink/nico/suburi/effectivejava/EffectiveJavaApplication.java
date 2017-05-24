package pink.nico.suburi.effectivejava;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pink.nico.suburi.effectivejava.chapter1.ObjLifecycle;

import java.util.*;

@SpringBootApplication
public class EffectiveJavaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EffectiveJavaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // java -jar target/effective-java-0.0.1-SNAPSHOT.jar arg
        // ここでコーディングしておべんきょう。
        System.out.println("Select Chapter-section : " + args[0]);
        List<String> argList = Arrays.asList(args);

        int returnCode = 0;

        String[] split = args[0].split("-");
        // きったねぇ分岐。。スマートに書けるのかな(invoke無しに)
        switch (split[0]) {
            case "1":
                ObjLifecycle obj = new ObjLifecycle();
                switch (split[1]) {
                    case "1":
                        returnCode = obj.section1(argList);
                        break;
                    case "2":
                        returnCode = obj.section2(argList);
                        break;
                }
            case "2":
                Object obj2 = new Object();
                switch (split[1]) {
                    case "1":
                        break;
                    case "2":
                        break;
                }
        }
        System.out.println("End benkyo : " + String.valueOf(returnCode));
    }
}
