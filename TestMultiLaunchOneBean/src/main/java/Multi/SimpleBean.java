package Multi;

public class SimpleBean {
    private static String message;

    public SimpleBean(String message) {
        this.message = message;
    }

    void shows(){
        System.out.println(message);
    }

    void setMessage(String message){
        this.message = message;
    }
}
