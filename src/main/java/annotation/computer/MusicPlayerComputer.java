package annotation.computer;

import annotation.simple.ClassicMusic;
import annotation.simple.RockMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayerComputer {

    private final ClassicMusic classicMusic;
    private final RockMusic rockMusic;

    @Autowired
    public MusicPlayerComputer(ClassicMusic classicMusic, RockMusic rockMusic) {
        this.classicMusic = classicMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic() {
        classicMusic.getSong();
        return "Playing";
    }
}
