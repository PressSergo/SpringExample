package Mains;

public class Singer {
    private String sound;
    private int age;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Sound(){
        System.out.println("composer age: "+age+" and super music: "+sound);
    }
}
