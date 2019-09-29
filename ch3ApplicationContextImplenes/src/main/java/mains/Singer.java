package mains;

public class Singer {
    private String sond;

    public String getSond() {
        return sond;
    }

    public void setSond(String sond) {
        this.sond = sond;
    }

    void Poy(){
        System.out.println("music: "+sond);
    }
}
