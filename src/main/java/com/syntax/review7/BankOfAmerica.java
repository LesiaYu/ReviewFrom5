package com.syntax.review7;

public class BankOfAmerica {
    public static void main(String[] args) {
         BankAccount bank = new BankAccount();
         bank.accountHolder="John Smith";
         bank.accountNumber=6236362662L;
         bank.accBalance=20;
         bank.ssn=768696;

        System.out.println(BankAccount.bankName);

        BankAccount bank1 = new BankAccount();
        bank1.accountHolder="Jane Smith";
        bank1.accountNumber=612345566662L;
        bank1.accBalance=2000;
        bank1.ssn=1111111;

        System.out.println(bank1.bankName); //not the right way to access Static variables - but it
        bank1.bankName="Chase";
        System.out.println(BankAccount.bankName);

    }

}
