package composite.example.exception;

public class FileTreatMentException extends RuntimeException{
    public FileTreatMentException() {
    }

    public FileTreatMentException(String msg) {
        super(msg);
    }
}
