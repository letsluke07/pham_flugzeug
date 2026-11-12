

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlugzeugTest
{
    @Test
    public void test_flugzeug_zu_wenig()
    {
        Flugzeug a;
        a = new Flugzeug("a", 0, true);
        assertEquals(1, a.getSitzplaetze());
    }
    
    @Test
    public void test_flugzeug_Ok()
    {
        Flugzeug b;
        b = new Flugzeug("b", 420, false);
        assertEquals(420, b.getSitzplaetze());
    }
    
    @Test
    public void test_flugzeug_zu_viel()
    {
        Flugzeug c;
        c = new Flugzeug("c", 1000, true);
        assertEquals(1, c.getSitzplaetze());
    }
}