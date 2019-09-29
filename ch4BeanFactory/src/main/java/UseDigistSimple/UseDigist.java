package UseDigistSimple;

import java.security.MessageDigest;

public class UseDigist {
    private MessageDigest messageDigest;
    private MessageDigest messageDigest1;

    public MessageDigest getMessageDigest() {
        return messageDigest;
    }

    public void setMessageDigest(MessageDigest messageDigest) {
        this.messageDigest = messageDigest;
    }

    public MessageDigest getMessageDigest1() {
        return messageDigest1;
    }

    public void setMessageDigest1(MessageDigest messageDigest1) {
        this.messageDigest1 = messageDigest1;
    }

    public void GetIt(String msg){
        System.out.println(msg);
        System.out.println(new String(messageDigest.digest(msg.getBytes())).toString());
        System.out.println(new String(messageDigest1.digest(msg.getBytes())).toString());
    }
}
