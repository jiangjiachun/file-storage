package com.jjc;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.jjc.storage.StorageProperties;

@Configuration
@EnableConfigurationProperties(StorageProperties.class)
public class UploadingFilesApplication {
	
	/*
	 * CommandLineRunner init(StorageService storageService) { return (args) -> {
	 * System.out.println(22222); storageService.init(); }; }
	 */
}
