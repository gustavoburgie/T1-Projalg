package br.pucrs;
import java.lang.Math;


public class LCS {
    public static int iter = 0; //contagem de iterações
    public static void main(String[] args) {
        System.out.println("\n.");
        
        String a = "AGGTAB";
        String b = "GXTXAYB";
        System.out.println("\nS1: \"" + a + "\"\nS2: \"" + b + "\"\n");

        teste_LCS_rec(a, b);
        teste_LCS_prog(a, b);

        System.out.println("================================");


        String a1 = "ALGORITMO";
        String b1 = "EZSXPYIOWRVIUTMTO";
        System.out.println("\nS1: \"" + a1 + "\"\nS2: \"" + b1 + "\"\n");

        teste_LCS_rec(a1, b1);
        teste_LCS_prog(a1, b1);

        System.out.println("================================");

        String a2 = "HELLO123WORLDX67";
        String b2 = "H1E2L3L4O5W6O7R8L9D0X";
        System.out.println("\nS1: \"" + a2 + "\"\nS2: \"" + b2 + "\"\n");

        teste_LCS_rec(a2, b2);
        teste_LCS_prog(a2, b2);
        
    }

    public static int LCS_recursivo(String s1, String s2, int i, int j) {
        iter++;
        if(i == 0 || j == 0) {
            return 0;
        }
        if(s1.charAt(i-1) == s2.charAt(j-1)) {
            return 1 + LCS_recursivo(s1, s2, i-1, j-1);
        }

        return Math.max(LCS_recursivo(s1, s2, i-1, j), LCS_recursivo(s1, s2, i, j-1));
    }

    public static int LCS_prog_dinamica(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];

        for(int i = 0; i <= m; i++) {
            iter++;
            for(int j = 0; j <= n; j++) {
                iter++;
                if(i == 0 || j == 0) {
                    dp[i][j] = 0;   //inicializa a primeira linha e coluna com 0
                } else if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[m][n];
    }

    //======== Apenas para automatizar os testes =========//
    public static void teste_LCS_rec(String a, String b) {
        iter = 0;
        long startTime = System.nanoTime();
        int res1 = LCS_recursivo(a, b, a.length(), b.length());
        long endTime = System.nanoTime();
        System.out.println("Recursivo -\nLCS: " + res1);
        System.out.println("Iterações: " + iter);
        long tempo = endTime - startTime;   //tempo em nanossegundos
        System.out.println("Tempo de execução: " + tempo/1000 + " microsseg");
    }

    public static void teste_LCS_prog(String a, String b) {
        iter = 0;
        long startTime2 = System.nanoTime();
        int res2 = LCS_prog_dinamica(a, b);
        long endTime2 = System.nanoTime();
        System.out.println("\nProg Dinamica -\nLCS: " + res2);
        System.out.println("Iterações: " + iter);
        long tempo2 = endTime2 - startTime2;    //tempo em nanossegundos
        System.out.println("Tempo de execução: " + tempo2/1000 + " microsseg");
    }
}