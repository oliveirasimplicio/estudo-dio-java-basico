public class ExemploForarrays {
    public static void main(String[] args) {

        //em arrays o indice inicia em zero
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        //for (int x=0; x<alunos.length; x++){
            //System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        //}
        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
    
}