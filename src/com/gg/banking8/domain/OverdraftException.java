package com.gg.banking8.domain;

public class OverdraftException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double deficit;// 赤字；不足额
	
	
	
	public OverdraftException(String message) {
		super(message);
		// TODO 自动生成的构造函数存根
	}

	public OverdraftException(String message,double deficit) {
		super(message);
		this.deficit = deficit;
	}

	public double getDeficit() {
		return deficit;
	}
}
