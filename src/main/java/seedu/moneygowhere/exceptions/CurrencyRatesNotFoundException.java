package seedu.moneygowhere.exceptions;

/**
 * Thrown when there are no rates to be found.
 */
@SuppressWarnings("unused")
public class CurrencyRatesNotFoundException extends MoneyGoWhereException {
    public CurrencyRatesNotFoundException() {
    }

    public CurrencyRatesNotFoundException(String message) {
        super(message);
    }

    public CurrencyRatesNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public CurrencyRatesNotFoundException(Throwable cause) {
        super(cause);
    }

    public CurrencyRatesNotFoundException(
            String message,
            Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace
    ) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}