package com.gg.banking8.domain;

public class OverdraftException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double deficit;// ���֣������
	
	
	
	public OverdraftException(String message) {
		super(message);
		// TODO �Զ����ɵĹ��캯�����
	}

	public OverdraftException(String message,double deficit) {
		super(message);
		this.deficit = deficit;
	}

	public double getDeficit() {
		return deficit;
	}
}
