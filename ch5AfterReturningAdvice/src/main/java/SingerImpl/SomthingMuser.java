package SingerImpl;

import Singer.Singer;

public class SomthingMuser implements Singer {
    @Override
    public boolean sing() {
        System.out.print(" I'm music ");
        return true;
    }
}
