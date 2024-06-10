package Lab8;
public class Enter {
    private int key;
    private String value;


public Enter() {
        this.key = 0;
        this.value = null;
    }

    public Enter(int key) {
        this.key = key;
        this.value = null;
    }

    public Enter(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}