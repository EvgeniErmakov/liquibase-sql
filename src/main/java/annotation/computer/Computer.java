package annotation.computer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component("computer")
public class Computer implements InitializingBean, BeanPostProcessor {
    private final int id;
    private final MusicPlayerComputer musicPlayerComputer;

    @PostConstruct
    public void initZZ(){
        System.out.println("Comp init");
    }

    @Autowired
    public Computer(MusicPlayerComputer musicPlayer) {
        this.id = 1;
        this.musicPlayerComputer = musicPlayer;
    }

    @Autowired
    public void autoSomething(){
        System.out.println("AUTOWIRED FOREVER!!!1");
    }

    @PreDestroy
    public void makeDestroy(){
        System.out.println("Destroyer");
    }

    @Override
    public String toString() {
        return "Computer " + id + " " + musicPlayerComputer.playMusic();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("lolz");
    }
}
