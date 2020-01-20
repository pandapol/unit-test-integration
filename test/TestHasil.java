import kalkulator.Hasil;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class TestHasil {

    private Hasil hasil = new Hasil(2,"BERHASIL");

    @Test
    public void testGetJawab(){
        assertEquals(2, hasil.getJawab());
    }

    @Test
    public void testGetPesanError(){
        assertEquals("BERHASIL", hasil.getPesanError());
    }

}
