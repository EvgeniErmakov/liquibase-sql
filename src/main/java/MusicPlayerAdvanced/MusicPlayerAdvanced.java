package MusicPlayerAdvanced;

import musicPlayer.MusicPlayer;

public class MusicPlayerAdvanced {

    private MusicPlayer musicPlayer;

    public MusicPlayerAdvanced(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }

    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
}
