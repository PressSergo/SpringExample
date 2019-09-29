package ssin;

public class StandartLokoopDemoBean implements DemoBean {
    private Singer singer;

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    @Override
    public Singer getSinger() {
        return singer;
    }

    @Override
    public void doSomthing() {
        singer.Sound();
    }
}
