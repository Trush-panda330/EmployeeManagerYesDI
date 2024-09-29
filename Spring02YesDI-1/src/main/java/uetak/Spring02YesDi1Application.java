package uetak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import uetak.controller.ShainController;

@SpringBootApplication
public class Spring02YesDi1Application {

	//このmainメソッドを含むクラスと同じ階層にあるものだけが
	//DIコンテナ内で影響される
	public static void main(String[] args) {
		//DIコンテナを作成
		ConfigurableApplicationContext context = SpringApplication.run(Spring02YesDi1Application.class, args);

		//社員コントローラーのインスタンスを呼ぶ
		ShainController shainController = context.getBean(ShainController.class);

		//インスタンスからメソッドを実行
		shainController.findAll();
	}

}
