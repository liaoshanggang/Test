package com.forward.date20170508.adapter.demo1;
/**
 * @Description: �ͺ����Դ������������220v��110v������ͨ�ˡ�
 * @author forward
 * @date 2017��5��9�� ����4:53:37
 * @version V2.0
 */
public class Adapter extends Source implements Target {

	@Override
	public void targetMethod() {
		System.out.println("this is targetMethod()!");
	}

}
