package musicPlayer;

public class MusicPlayer {

    private Music music;
    private int value;

    public MusicPlayer() {

    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public int getValue() {
        return value;
    }

    public void init(){
        System.out.println("init");
    }

    public void setValue(int value) {
        this.value = value;
    }
}
