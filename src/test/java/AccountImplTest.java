import fr.bank.exception.InvalidAmountException;
import fr.bank.model.Account;
import fr.bank.model.AccountImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AccountImplTest {

    private Account account;

    private Account account2;

    @BeforeEach
    public void init(){
        account = new AccountImpl();
        account2 = new AccountImpl();
        account2.deposit(1000L);
    }

    @Test
    @DisplayName("should_balance_be_1000_after_deposit_of_1000")
    public void deposit(){
        assertEquals(0L, account.getBalance());
        assertEquals(1000L,  account.deposit(1000L));
    }

    @Test
    @DisplayName("should_deposit_amount_be_positive")
    public void depositNegative(){
        Exception exception = assertThrows(InvalidAmountException.class, () -> account.deposit(-1000L));
        assertEquals("The deposit amount must be greater than 0",  exception.getMessage());
    }

    @Test
    @DisplayName("should_withdrawal_amount_be_positive_and_less_or_equal_balance")
    public void withdrawRestrictedCases(){
        Exception exception = assertThrows(InvalidAmountException.class, () -> account2.withdraw(2000L));
        assertEquals("The withdrawal amount must be greater than 0 and less than or equal to the balance",
                exception.getMessage());
    }

    @Test
    @DisplayName("should_balance_be_500_after_withdrawal_of_500")
    public void withdraw(){
        assertTrue(account2.withdraw(500L));
        assertEquals(500L, account2.getBalance());
    }
}
