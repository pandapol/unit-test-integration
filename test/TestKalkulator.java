import org.junit.*;
import kalkulator.Kalkulator;
import kalkulator.Hasil;
import static junit.framework.Assert.assertEquals;

public class TestKalkulator {

    private Kalkulator kalkulator = new Kalkulator();

    @Test
    public void testPertambahan(){
        Hasil hasil = kalkulator.pertambahan(1,2);
        assertEquals(3, hasil.getJawab());
    }

    @Test
    public void testPengurangan(){
        Hasil hasil = kalkulator.pengurangan(5, 2);
        assertEquals(3, hasil.getJawab());
    }

    @Test
    public void testPerkalian(){
        Hasil hasil = kalkulator.perkalian(2, 5);
        assertEquals(10, hasil.getJawab());
    }

    @Test
    public void testPembagian(){
        Hasil hasil = kalkulator.pembagian(10, 2);
        assertEquals(5, hasil.getJawab());
    }
}
