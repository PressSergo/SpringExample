package Configurable;

import SecondBlock.World;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = "/simple.xml")
@Configuration
public class ConfigurateSecondBlock {

    @Bean
    public World SimpeWorld(){
        World world = new World();
        world.setMessage("this is a simple solution");
        return world;
    }
}
