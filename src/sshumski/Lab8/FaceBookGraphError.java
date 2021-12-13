package sshumski.Lab8;

public class FaceBookGraphError {
    private String message;
    private String type;
    private Number code;

    public String getMessage() {
        return message;
    }

    public String getType() {
        return type;
    }

    public Number getCode() {
        return code;
    }

    public String getFbtrace_id() {
        return fbtrace_id;
    }

    private String fbtrace_id;

    public FaceBookGraphError(String message, String type, Number code, String fbtrace_id) {
        this.message = message;
        this.type = type;
        this.code = code;
        this.fbtrace_id = fbtrace_id;
    }
}
