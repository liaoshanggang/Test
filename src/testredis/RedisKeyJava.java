package testredis;
import java.util.Iterator;
import java.util.Set;

import redis.clients.jedis.Jedis;
public class RedisKeyJava {
	public static void main(String[] args) {
		//���ӱ��ص� Redis ����
		Jedis jedis = new Jedis("localhost");
		System.out.println("Connection to server sucessfully");

		// ��ȡ���ݲ����
		Set<String> keys = jedis.keys("*"); 
		Iterator<String> it=keys.iterator() ;   
		while(it.hasNext()){   
			String key = it.next();   
			System.out.println(key);   
		}
	}
}