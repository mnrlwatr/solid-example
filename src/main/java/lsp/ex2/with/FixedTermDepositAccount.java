package lsp.ex2.with;

import java.math.BigDecimal;

public class FixedTermDepositAccount extends Account {
    @Override
    void withdraw(BigDecimal amount) {
        throw new UnsupportedOperationException("Withdrawals are not supported by FixedTermDepositAccount!!");
    }

    @Override
    void deposit(BigDecimal amount) {
        // some logic here
    }
}
