package Singer;

import SingerInterface.SingerI;

public class BestSinger implements SingerI {
    @Override
    public void sing() {
        System.out.println("BestSinger");
    }
}
