package ssin;

public abstract class AbstractLokoopBean implements DemoBean {
    public abstract Singer getSinger();

    @Override
    public void doSomthing() {
        getSinger().Sound();
    }
}
