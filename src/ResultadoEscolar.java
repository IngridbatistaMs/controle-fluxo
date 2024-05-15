public class ResultadoEscolar {
    public static void main(String[] args) {
        /*int nota = 6;

        if(nota >= 7)
            System.out.println("Você está aprovado!");

        else if (nota >= 5 && nota < 7) //tem que retornar ou true ou false
            System.out.println("Você está em Recuperação");
        
        
        else
            System.out.println("Você está Reprovado.");

        
        int nota = 5;

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);*/

        int nota = 6;
        
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
