package lsp.ex2.without;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        new BankingAppWithdrawalService(new FixedTermDepositAccount()).
                withdraw(BigDecimal.valueOf(200)); // throws UnsupportedOperationException
    }
}
