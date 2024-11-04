package lsp.ex2.without;

import java.math.BigDecimal;

public abstract class Account {
    abstract void withdraw(BigDecimal amount);
    abstract void deposit(BigDecimal amount);
}
