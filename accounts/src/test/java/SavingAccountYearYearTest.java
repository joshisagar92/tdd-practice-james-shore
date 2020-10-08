import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SavingAccountYearYearTest {
    @Test
    public void startingBalanceMatchesConstructor() {
        assertEquals(10000,newAccount().startingBalance());
    }

    @Test
    public void endingBalanceAppliesInterestRate() {
        assertEquals(11000,newAccount().endingBalance());
    }

    @Test
    public void interestRateMatchesConstructor() {
        assertEquals(10,newAccount().interestRate());
    }

    @Test
    public void nextYearStaringBalanceEqualsThisYearEndingBalance() {
        SavingAccountYear thisYear = newAccount();
        assertEquals(thisYear.endingBalance(),thisYear.nextYear().startingBalance());
    }

    @Test
    public void nextYearInterestRateIsEqualThisYearInterestRate() {
        SavingAccountYear thisYear = newAccount();
        assertEquals(thisYear.interestRate(),thisYear.nextYear().interestRate());
    }

    private SavingAccountYear newAccount() {
        return new SavingAccountYear(10000, 10);
    }
}


