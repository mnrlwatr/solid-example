package lsp.ex2.with;

import java.math.BigDecimal;

public abstract class WithdrawableAccount extends Account {
    abstract void withdraw(BigDecimal amount);
}
