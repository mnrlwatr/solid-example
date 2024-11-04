package lsp.ex2.without;

import java.math.BigDecimal;

public abstract class WithdrawableAccount extends Account {
    abstract void withdraw(BigDecimal amount);
}
