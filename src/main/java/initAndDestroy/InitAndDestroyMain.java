package initAndDestroy;

import musicPlayer.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitAndDestroyMain {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
            new ClassPathXmlApplicationContext("ApplicationContext.xml");

        MusicPlayer musicPlayer = classPathXmlApplicationContext.getBean("withInit",
            MusicPlayer.class);

        musicPlayer.getMusic().getSong();
        System.out.println(musicPlayer.getValue());

        classPathXmlApplicationContext.close();
    }

}
