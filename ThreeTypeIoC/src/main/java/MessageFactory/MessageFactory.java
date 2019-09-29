package MessageFactory;

import FirstBlock.Hello;
import SecondBlock.World;
import ThirtyBlock.Simple;

public class MessageFactory {
    Hello hello;
    World world;
    Simple simple;

    public Hello getHello() {
        return hello;
    }

    public void setHello(Hello hello) {
        this.hello = hello;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public Simple getSimple() {
        return simple;
    }

    public void setSimple(Simple simple) {
        this.simple = simple;
    }

    public void getMessage(){
        System.out.println(hello.getMessage()+" "+world.getMessage()+" "+simple.getMessage());
    }
}
