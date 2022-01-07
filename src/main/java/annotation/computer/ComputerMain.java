package annotation.computer;

import annotation.autowired.MusicPlayer;
import annotation.autowired.MusicPlayer2;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComputerMain {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContextAnnotation.xml");

        Computer computer = classPathXmlApplicationContext.getBean("computer", Computer.class);
        System.out.println(computer);

        classPathXmlApplicationContext.close();
    }
}
