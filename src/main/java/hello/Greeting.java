package hello;

public class Greeting {
    private final long id;
    private final String content;
    private final String fname;
    private final String attribute;

    public Greeting(long id, String content, String fname, String attribute) {
        this.id = id;
        this.content = content;
        this.fname = fname;
        this.attribute = attribute;
    }

    public String getFname(){
        return fname;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getAttribute() {
        return attribute;
    }
}
