package common.sup.template;

import java.io.Serializable;

public class Value implements Serializable {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
