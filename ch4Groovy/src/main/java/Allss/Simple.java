package Allss;

public class Simple {
    private String name;
    private String jas;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJas() {
        return jas;
    }

    public void setJas(String jas) {
        this.jas = jas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Simple{");
        sb.append("name='").append(name).append('\'');
        sb.append(", jas='").append(jas).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
