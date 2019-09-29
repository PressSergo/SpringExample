package all;

import java.beans.PropertyEditorSupport;

public class ResourceS extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] data = text.split("\\s");
        setValue(new User(data[0],data[1]));
    }
}
