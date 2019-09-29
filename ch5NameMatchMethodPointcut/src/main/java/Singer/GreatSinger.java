package Singer;

import SingerInterface.SingerI;

public class GreatSinger implements SingerI {
    @Override
    public void sing() {
        System.out.println("Greate Singer");
    }
    public void noSing(){System.out.println("No sing)");}
}
