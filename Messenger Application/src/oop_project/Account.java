package oop_project;

public class Account {

    int id;
    String name;
    String password;
    double balance;
    boolean premium;
    String messages = "";
    String[] messageHistory = new String[9999];
    String[] sentHistory = new String[9999];
    int inc = 0;
    int inc_02 = 0;
    boolean hasMessage = false;

    Account() {
        id = 0;
        name = "";
        password = "";
        balance = 0;
        premium = false;
    }

    public Account(int id, String name, String password, double balance) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    public void addMoney(double ammount) {
        this.balance += ammount;
    }

    public void withdrawMoney(double ammount) {
        if (ammount <= balance) {
            this.balance -= ammount;
        } else {
            System.out.println("insufficient funds!");
        }
    }

    public void sendMoney(double ammount, Account target) {

        withdrawMoney(ammount);
        if (!premium) {
            double ammountAfterTax = applyTax(ammount);
            target.balance += ammountAfterTax;
        } else {
            target.balance += ammount;
        }

    }

    public double applyTax(double sentAmmount) {
        double percentage = sentAmmount * 0.05;
        double afterTax = sentAmmount - percentage;

        return afterTax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean premium() {
        return this.premium;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name=" + name + ", password=" + password + ", is premium: " + premium() + '}';
    }

}
