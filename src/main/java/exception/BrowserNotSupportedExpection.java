package exception;

public class BrowserNotSupportedExpection extends RuntimeException {
    public BrowserNotSupportedExpection(String browserName) {

        super(String.format("Browser %s not supported", browserName));
    }
}

