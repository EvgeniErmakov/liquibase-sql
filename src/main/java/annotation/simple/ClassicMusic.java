package annotation.simple;

import org.springframework.stereotype.Component;

@Component("simpleAnnotationClassicMusic")
public class ClassicMusic implements Music {

    public ClassicMusic() {
    }

    @Override
    public void getSong() {
        System.out.println("Classic music!!1");
    }

}
