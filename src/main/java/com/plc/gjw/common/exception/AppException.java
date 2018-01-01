package com.plc.gjw.common.exception;

import java.text.MessageFormat;

/**
 * 自定义异常类
 */
public class AppException extends RuntimeException {

	/**
	 * 
	 */
	private boolean isSuccess = false;
	private String key;
	private String info;

	public AppException(String key) {
		super(key);
		this.key = key;
		this.info = key;
	}

	public AppException(String key, String message) {
		super(MessageFormat.format("{0}[{1}]", key, message));
		this.key = key;
		this.info = message;
	}

	public AppException(String message, String key, String info) {
		super(message);
		this.key = key;
		this.info = info;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}
