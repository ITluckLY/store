package cn.tedu.store;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.tedu.store.mapper")
public class TeduStoreApplication {
/**
 * 加个注释试试
 * @param args
 */
	public static void main(String[] args) {
		SpringApplication.run(TeduStoreApplication.class, args);
	}

}
