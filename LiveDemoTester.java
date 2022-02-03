import java.beans.Transient;

import static org.junit.Assert.*;
import org.junit.*;
public class LiveDemoTester {
    @Test
    public void quickTest(){
        assertEquals("no equal to two", LiveDemo.two(), 3);
    }
}
