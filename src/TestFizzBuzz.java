import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void testCheckFizzBuzz() {
        String expected = "Uncountable";
        String result = FizzBuzz.checkFizzBuzz(100);
        assertEquals(expected,result);
    }
}
