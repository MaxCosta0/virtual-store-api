package com.maxley.virtualstore.resource.exception;

import java.io.Serializable;
import java.time.LocalDateTime;


public class StandardError implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private LocalDateTime TimeStamp;
	
	public StandardError(Integer status, String msg, LocalDateTime timeStamp) {
		super();
		this.status = status;
		this.msg = msg;
		TimeStamp = timeStamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public LocalDateTime getTimeStamp() {
		return TimeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		TimeStamp = timeStamp;
	}

}
