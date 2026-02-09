package lab6;

public class Client extends Human implements Admin {

    private String bankName;

    public Client(String name, String secondName, String bankName) {
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
    public String getInfo() {
        return "Имя: " + super.getName() + "\n" +
                "Фамилия: " + super.getSecondName() + "\n" +
                "Клиент Банка: " + getBankName();
    }

    @Override
    public String getHumanInfo() {
        return "Имя: " + super.getName() + "\n" +
                "Фамилия: " + super.getSecondName() + "\n" +
                "Клиент Банка: " + getBankName();
    }
}
