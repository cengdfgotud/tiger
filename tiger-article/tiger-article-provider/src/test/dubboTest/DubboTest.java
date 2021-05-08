package dubboTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by yuqi on 2017/5/10.
 */
public class DubboTest {

    public static void main(String args[]) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring.xml");
        context.start();
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
    }

}
