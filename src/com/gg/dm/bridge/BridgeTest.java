package com.gg.dm.bridge;

public class BridgeTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Bridge bridge = new MyBridge();
		bridge.setSourceable(new SourceSub1());
		bridge.getSourceable().method();
		bridge.setSourceable(new SourceSub2());
		bridge.getSourceable().method();
	}

}
