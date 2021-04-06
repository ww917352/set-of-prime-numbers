import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeNumberSetTest {

    @Test
    void upTo10() {
        PrimeNumberSet primeNumberSet = new PrimeNumberSet(2, 10);
        assertEquals(Utils.asSet(2, 3, 5, 7), primeNumberSet.getSetOfPrimeNumbers());
    }

    @Test
    void between10And20() {
        PrimeNumberSet primeNumberSet = new PrimeNumberSet(10, 20);
        assertEquals(Utils.asSet(11, 13, 17, 19), primeNumberSet.getSetOfPrimeNumbers());
    }

    @Test
    void upto100() {
        PrimeNumberSet primeNumberSet = new PrimeNumberSet(2, 100);
        //PrimeNumberSet primeNumberSet = new PrimeNumberSet(100);
        assertEquals(Utils.asSet(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97), primeNumberSet.getSetOfPrimeNumbers());
    }

}