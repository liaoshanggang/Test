package testredis;
import redis.clients.jedis.Jedis;


public class RedisJava {
   public static void main(String[] args) {
      //���ӱ��ص� Redis ����
      Jedis jedis = new Jedis("localhost");
      System.out.println("Connection to server sucessfully");
      //�鿴�����Ƿ�����
      System.out.println("Server is running: "+jedis.ping());
 }
}