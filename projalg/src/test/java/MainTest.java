import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void meusTestes(){
        br.pucrs.Main main = new br.pucrs.Main();

    }
    @Test
    public void testeLCSRecursivo(){
        br.pucrs.Main main = new br.pucrs.Main();
        String a = "AGGTAB";
        String b = "GXTXAYB";
        int res = main.LCS_recursivo(a, b, a.length(), b.length());
        assertEquals(4, res);

        String a1 = "ABCD";
        String b1 = "ACBAD";
        int res1 = main.LCS_recursivo(a1, b1, a1.length(), b1.length());
        assertEquals(3, res1);

        String a2 = "INCREMENTE";
        String b2 = "LAMEXNTO";
        int res2 = main.LCS_recursivo(a2, b2, a2.length(), b2.length());
        assertEquals(4, res2);

        long startTime = System.nanoTime();
        System.out.println("Recursivo -\nLCS: " + main.LCS_recursivo(a, b, a.length(), b.length()));
        long endTime = System.nanoTime();
        System.out.println("Iterações: " + main.iter);
        long tempo = endTime - startTime;
        System.out.println("Tempo de execução: " + tempo/1000 + " microsseg");
    }
}
