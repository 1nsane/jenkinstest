import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Yevgeniy_Vtulkin on 11/18/2016.
 */
public class SomeClassTest {
    private SomeClass clazz;

    @Before
    public void setUp() {
        clazz = new SomeClass();
    }

    @Test
    public void someMethodTest() {
        int arg1 = 2, arg2 = 3;
        assertEquals(clazz.comeMethod(arg1, arg2), arg1 + arg2);
    }
}
