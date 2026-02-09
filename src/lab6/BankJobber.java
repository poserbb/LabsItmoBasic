package lab6;

public class BankJobber extends Human implements Admin{

    private String bankName;

    public BankJobber(String name, String secondName, String bankName) {
        super(name, secondName);
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public void changeBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String getHumanInfo() {
        return "Имя: " + super.getName() + "\n" +
                "Фамилия: " + super.getSecondName() + "\n" +
                "Работник Банка: " + getBankName();
    }

    @Override
    public String getInfo() {
        return "Имя: " + super.getName() + "\n" +
                "Фамилия: " + super.getSecondName() + "\n" +
                "Работник Банка: " + getBankName();
    }
}
