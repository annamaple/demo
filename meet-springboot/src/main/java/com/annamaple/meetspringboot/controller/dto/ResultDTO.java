package com.annamaple.meetspringboot.controller.dto;

import lombok.Data;
import lombok.ToString;

import java.util.Date;


/**
 * 结果集处理
 * @author lei
 *
 */
@Data
@ToString
@SuppressWarnings("unused")
public class ResultDTO<E> {
	
	private Head head;
	private Body<E> body;
	
	private ResultDTO(){
		this.head = new Head();
		this.body = new Body<>();
	}
	
	
	public static <E> ResultDTO<E> success(E data) {
		ResultDTO<E> resDto = new ResultDTO<>();
		resDto.head.outBoundTime = new Date();
		resDto.body.data = data;
		resDto.body.code = "0000";
		resDto.body.message = "success";
		return resDto;
	}
	
	
	public static <E> ResultDTO<E> error(String message) {
		ResultDTO<E> resDto = new ResultDTO<>();
		resDto.head.outBoundTime = new Date();
		resDto.body.code = "5000";
		resDto.body.message = message;
		return resDto;
	}
	
	
	@Data
	@ToString
	private static class Head {
		private long usedTime;
		private Date inBoundTime;
		private Date outBoundTime;
		private String recourseId;
	}
	
	@Data
	@ToString
	private static class Body<E> {
		private String code;
		private String message;
		private E data;
	}
	
}
