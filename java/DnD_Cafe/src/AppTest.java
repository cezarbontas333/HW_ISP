import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

    @Test
    public void testMasa() {

    }

    @Test
    public void testAngajat() {

    }

    @Test
    public void testClient() {
        Client c1 = new Client("Harambe","Grigoras", 34);
        //Angajat a1 = new Angajat("Spinzur", "Ion", 48);

        assertTrue(c1.verificarePlata());
    }
}
