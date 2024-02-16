import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P_0383_Tests {
    @Test
    public void canConstruct_e1() {
        String ran = "a";
        String mag = "b";
        P_0383 CUT = new P_0383();

        boolean result  = CUT.canConstruct(ran, mag);

        Assertions.assertFalse(result);
    }

    @Test
    public void canConstruct_e2() {
        String ran = "aa";
        String mag = "ab";
        P_0383 CUT = new P_0383();

        boolean result  = CUT.canConstruct(ran, mag);

        Assertions.assertFalse(result);
    }

    @Test
    public void canConstruct_e3() {
        String ran = "aa";
        String mag = "aab";
        P_0383 CUT = new P_0383();

        boolean result  = CUT.canConstruct(ran, mag);

        Assertions.assertTrue(result);
    }

    @Test
    public void canConstruct2_e1() {
        String ran = "a";
        String mag = "b";
        P_0383 CUT = new P_0383();

        boolean result  = CUT.canConstruct2(ran, mag);

        Assertions.assertFalse(result);
    }

    @Test
    public void canConstruct2_e2() {
        String ran = "aa";
        String mag = "ab";
        P_0383 CUT = new P_0383();

        boolean result  = CUT.canConstruct2(ran, mag);

        Assertions.assertFalse(result);
    }

    @Test
    public void canConstruct2_e3() {
        String ran = "aa";
        String mag = "aab";
        P_0383 CUT = new P_0383();

        boolean result  = CUT.canConstruct2(ran, mag);

        Assertions.assertTrue(result);
    }

}