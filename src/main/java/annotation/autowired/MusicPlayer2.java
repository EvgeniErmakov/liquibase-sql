package annotation.autowired;

import annotation.simple.ClassicMusic;
import annotation.simple.Music;
import annotation.simple.RockMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("AutowiredMusicPlayer2")
public class MusicPlayer2 {

    private final ClassicMusic classicMusic;
    private final RockMusic rockMusic;

    @Autowired
    public MusicPlayer2(ClassicMusic classicMusic, RockMusic rockMusic) {
        this.classicMusic = classicMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic() {
        System.out.println("_____________");
        classicMusic.getSong();
        rockMusic.getSong();
        System.out.println("_____________");
    }

}
