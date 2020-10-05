package com.jjc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jjc.storage.StorageProperties;
import com.jjc.storage.StorageService;

@Configuration
@EnableConfigurationProperties(StorageProperties.class)
public class UploadingFilesApplication {

	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			storageService.init();
		};
	}
	 
}
