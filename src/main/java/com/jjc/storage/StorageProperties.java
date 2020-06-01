package com.jjc.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("storage")
public class StorageProperties {

	/**
	 * 存储文件的文件夹
	 * 默认：D:/upload-dir
	 */
	private String location = "D:/upload-dir";

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
