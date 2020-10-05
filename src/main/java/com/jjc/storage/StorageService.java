package com.jjc.storage;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

import javax.servlet.http.HttpServletRequest;

public interface StorageService {

	void init();

	void store(MultipartFile file);

	Stream<Path> loadAll();
	
	String filename(String filename, HttpServletRequest request);

	Path load(String filename);

	Resource loadAsResource(String filename);

	void deleteAll();

}
