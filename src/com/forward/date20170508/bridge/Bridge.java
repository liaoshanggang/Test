package com.forward.date20170508.bridge;

public abstract class Bridge {
	Source source;
	
	public void method(){
		source.method();
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}
		
}

