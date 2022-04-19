package isp.lab7.safehome;
public class TooManyAttemptsException extends Exception {
    
    public TooManyAttemptsException() {
        super("Prea multe incercari gresite. Cheie eliminata");
    }
    
}
