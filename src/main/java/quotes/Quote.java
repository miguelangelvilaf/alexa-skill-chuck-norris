package quotes;

public class Quote {
    private String text;

    public Quote(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Quote {text='" + text + "'}";
    }
}
