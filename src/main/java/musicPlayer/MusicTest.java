package musicPlayer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MusicTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
            new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Music someMusic = classPathXmlApplicationContext.getBean("someMusic",
            Music.class);

        someMusic.getSong();

        MusicPlayer musicPlayer = new MusicPlayer(someMusic);
        musicPlayer.getMusic().getSong();

        classPathXmlApplicationContext.close();
    }
}
