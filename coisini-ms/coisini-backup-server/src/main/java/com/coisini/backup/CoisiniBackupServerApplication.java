package com.coisini.backup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动器
 * @author Coisini
 * @date Nov 11, 2019
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages={"com.coisini.backup"})
public class CoisiniBackupServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoisiniBackupServerApplication.class, args);
	}

}
