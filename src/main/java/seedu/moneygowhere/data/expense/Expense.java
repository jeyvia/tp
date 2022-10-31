package seedu.moneygowhere.data.expense;

import java.math.BigDecimal;
import java.time.LocalDateTime;

//@@author xzynos

/**
 * Stores data associated with an expense.
 */
@SuppressWarnings("unused")
public class Expense {
    private String name;
    private LocalDateTime dateTime;
    private String description;
    private BigDecimal amount;
    private String category;
    private String remarks;
    private String currency;
    private String modeOfPayment;
    private BigDecimal rate;

    public Expense(String name,
                   LocalDateTime dateTime,
                   String description,
                   BigDecimal amount,
                   String category,
                   String remarks,
                   String currency,
                   String modeOfPayment) {
        assert !(currency == null || currency.isEmpty() || currency.trim().isEmpty()) :
                "There must be a currency";
        assert !(name == null || name.isEmpty() || name.trim().isEmpty()) :
                "There must be a name";
        assert amount != null : "There must be an amount";
        assert dateTime != null : "There must be a date and time";
        this.name = name;
        this.dateTime = dateTime;
        this.description = description;
        this.amount = amount;
        this.category = category;
        this.remarks = remarks;
        this.currency = currency;
        this.modeOfPayment = modeOfPayment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }
}
