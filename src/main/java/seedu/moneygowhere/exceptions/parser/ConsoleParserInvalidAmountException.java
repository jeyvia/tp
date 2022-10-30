package seedu.moneygowhere.exceptions.parser;

import seedu.moneygowhere.exceptions.MoneyGoWhereException;

//@@author xzynos

/**
 * Defines exception to be thrown when amount entered is less than or equals to zero.
 */
@SuppressWarnings("unused")
public class ConsoleParserInvalidAmountException extends MoneyGoWhereException {
    public ConsoleParserInvalidAmountException() {
    }

    public ConsoleParserInvalidAmountException(String message) {
        super(message);
    }

    public ConsoleParserInvalidAmountException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConsoleParserInvalidAmountException(Throwable cause) {
        super(cause);
    }

    public ConsoleParserInvalidAmountException(
            String message,
            Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace
    ) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
