package withSetters;

import musicPlayer.MusicPlayer;
import org.example.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class withSettersMain {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
            new ClassPathXmlApplicationContext("ApplicationContext.xml");

        MusicPlayer musicPlayer = classPathXmlApplicationContext.getBean("withSetters",
            MusicPlayer.class);

        musicPlayer.getMusic().getSong();
        System.out.println(musicPlayer.getValue());

        classPathXmlApplicationContext.close();
    }

}
