package annotation.autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContextAnnotation.xml");

        MusicPlayer autowiredMusicPlayer = classPathXmlApplicationContext.getBean("AutowiredMusicPlayer", MusicPlayer.class);

        autowiredMusicPlayer.playMusic();

        MusicPlayer2 autowiredMusicPlayer2 = classPathXmlApplicationContext.getBean("AutowiredMusicPlayer2", MusicPlayer2.class);
        autowiredMusicPlayer2.playMusic();

        classPathXmlApplicationContext.close();
    }
}
