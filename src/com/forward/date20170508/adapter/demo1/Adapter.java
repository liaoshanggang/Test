package com.forward.date20170508.adapter.demo1;
/**
 * @Description: 就好像电源适配器那样，220v与110v可以流通了。
 * @author forward
 * @date 2017年5月9日 下午4:53:37
 * @version V2.0
 */
public class Adapter extends Source implements Target {

	@Override
	public void targetMethod() {
		System.out.println("this is targetMethod()!");
	}

}
