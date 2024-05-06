public class ResultadoEscolar {
    public static void main(String[] args) {
        
        //int nota = 3;

        //if(nota >= 7) //true
        //System.out.println("Aprovado!");

        //else if (nota >= 5 && nota < 7) 
        //System.out.println("Recuperacao");

        // else  //true ou false
        //System.out.println("reprovado!");

        int nota = 8;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ?"recuperacao" : "Reprovado";
        System.out.println(resultado);
    }
}
