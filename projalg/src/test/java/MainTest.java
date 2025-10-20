import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {
    
    @Test
    public void testeLCSRecursivo(){
        br.pucrs.Main main = new br.pucrs.Main();
        String a = "AGGTAB";
        String b = "GXTXAYB";
        int res = main.LCS_recursivo(a, b, a.length(), b.length());
        assertEquals(4, res);
    }
    
    @Test
    public void LCSRec1(){
        br.pucrs.Main main = new br.pucrs.Main();
        String a = "ABCD";
        String b = "ACBAD";
        int res = main.LCS_recursivo(a, b, a.length(), b.length());
        assertEquals(3, res);
    }
    
    @Test
    public void LCSRec2(){
        br.pucrs.Main main = new br.pucrs.Main();
        String a = "INCREMENTE";
        String b = "LAMEXNTO";
        int res = main.LCS_recursivo(a, b, a.length(), b.length());
        assertEquals(4, res);
    }

    @Test
    public void LCSRec3(){
        br.pucrs.Main main = new br.pucrs.Main();
        String a = "HELLO123WORLDX67";
        String b = "H1E2L3L4O5W6O7R8L9D0X";
        int res = main.LCS_recursivo(a, b, a.length(), b.length());
        assertEquals(11, res);
    }

    @Test
    public void testeLCSProgDinamica(){
        br.pucrs.Main main = new br.pucrs.Main();
        String a = "AGGTAB";
        String b = "GXTXAYB";
        int res = main.LCS_prog_dinamica(a, b);
        assertEquals(4, res);
    }

    @Test
    public void LCS_PD1(){
        br.pucrs.Main main = new br.pucrs.Main();
        String a = "ABCD";
        String b = "ACBAD";
        int res = main.LCS_prog_dinamica(a, b);
        assertEquals(3, res);
    }

    @Test
    public void LCS_PD2(){
        br.pucrs.Main main = new br.pucrs.Main();
        String a = "INCREMENTE";
        String b = "LAMEXNTO";
        int res = main.LCS_prog_dinamica(a, b);
        assertEquals(4, res);
    }

    @Test
    public void LCS_PD3(){
        br.pucrs.Main main = new br.pucrs.Main();
        String a = "HELLO123WORLDX67";
        String b = "H1E2L3L4O5W6O7R8L9D0X";
        int res = main.LCS_prog_dinamica(a, b);
        assertEquals(11, res);
    }
}
