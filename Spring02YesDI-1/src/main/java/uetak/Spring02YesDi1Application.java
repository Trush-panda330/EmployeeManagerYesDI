package uetak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring02YesDi1Application {

	//このmainメソッドを含むクラスと同じ階層にあるものだけが
	//DIコンテナ内で影響される
	public static void main(String[] args) {
		SpringApplication.run(Spring02YesDi1Application.class, args);
	}

}
