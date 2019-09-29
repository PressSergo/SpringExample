package Singer;

import SingerInterface.SingerI;

public class GreatSinger implements SingerI {
    @Override
    public void sing() {
        System.out.println("Greate Singer");
    }
}
