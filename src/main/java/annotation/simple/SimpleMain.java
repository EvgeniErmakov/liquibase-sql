package annotation.simple;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContextAnnotation.xml");

        Music simpleAnnotationRockMusic = classPathXmlApplicationContext.getBean("simpleAnnotationRockMusic", Music.class);
        simpleAnnotationRockMusic.getSong();

        Music simpleAnnotationClassicMusic = classPathXmlApplicationContext.getBean("simpleAnnotationClassicMusic", Music.class);
        simpleAnnotationClassicMusic.getSong();

        classPathXmlApplicationContext.close();
    }
}
