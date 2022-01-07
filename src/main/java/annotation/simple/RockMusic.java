package annotation.simple;

import org.springframework.stereotype.Component;

@Component("simpleAnnotationRockMusic")
public class RockMusic implements Music {

    public RockMusic() {
    }

    @Override
    public void getSong() {
        System.out.println("ROOOCK2222");
    }

}
