package com.mycompany.codesmell7;

public class BankSystem {
    private AccountManagement accountManagement;
    private LoanProcessing loanProcessing;
    private TransactionManagement transactionManagement;

    public BankSystem() {
        this.accountManagement = new AccountManagement();
        this.loanProcessing = new LoanProcessing();
        this.transactionManagement = new TransactionManagement();
    }

    public void manageAccounts() {
        accountManagement.manageAccounts();
    }

    public void processLoans() {
        loanProcessing.processLoans();
    }

    public void manageTransactions() {
        transactionManagement.manageTransactions();
    }
}

class AccountManagement {
    public void manageAccounts() {
        // Logika manajemen akun
    }
}

class LoanProcessing {
    public void processLoans() {
        // Logika proses pinjaman
    }
}

class TransactionManagement {
    public void manageTransactions() {
        // Logika manajemen transaksi
    }
}