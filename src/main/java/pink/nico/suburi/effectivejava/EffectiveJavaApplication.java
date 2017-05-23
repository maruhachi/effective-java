package pink.nico.suburi.effectivejava;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EffectiveJavaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EffectiveJavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// java -jar target/effective-java-0.0.1-SNAPSHOT.jar arg
		// ここでコーディングしておべんきょう。
		System.out.println("Hello, World!   args: " + args[0]);
	}
}
