package edu.felipe.primeirasemana;

public class App {
    public static void main(String[] args)
    {
       String primeiroNome = "Felipe";
       String SegundoNome = "Kretzschmar";

       String nomeCompleto = nomeCompleto(primeiroNome, SegundoNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome + (" ") + (segundoNome);
    }
}
