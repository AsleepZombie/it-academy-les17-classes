package src.by.academy.lesson17.task;

public class Customer {
    //id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
    private final long id;
    private String firstName;
    private String secondName;
    private String middleName;
    private String address;
    private String creditCardNumber;
    private String bankAccountNumber;

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public Customer(long id, String firstName, String secondName, String middleName, String address, String creditCardNumber, String bankAccountNumber) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public Customer(long id) {
        this.id = id;
    }

    public void setFullName(String firstName, String secondName, String middleName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
    }

    public void setBankData(String creditCardNumber, String bankAccountNumber) {
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setData(String firstName, String secondName, String middleName, String address, String creditCardNumber, String bankAccountNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        if ((secondName == null) || (firstName == null) || (middleName == null)) {
            return "no data";
        }
        return secondName + " " + firstName + " " + middleName;
    }
}
