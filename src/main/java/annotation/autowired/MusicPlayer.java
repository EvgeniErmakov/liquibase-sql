package annotation.autowired;

import annotation.simple.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("AutowiredMusicPlayer")
public class MusicPlayer {
    private final Music music;

    @Autowired
    public MusicPlayer(
        @Qualifier("simpleAnnotationClassicMusic") Music music) {
        this.music = music;
    }

    public void playMusic() {
        music.getSong();
    }

}
