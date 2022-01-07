package MusicPlayerAdvanced;

import musicPlayer.Music;
import musicPlayer.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MusicPlayerAdvancedMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
            new ClassPathXmlApplicationContext("ApplicationContext.xml");

        MusicPlayer musicPlayer = classPathXmlApplicationContext.getBean("musicPlayer",
            MusicPlayer.class);

        musicPlayer.getMusic().getSong();

        classPathXmlApplicationContext.close();
    }

}
