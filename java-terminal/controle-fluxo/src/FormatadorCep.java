public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalido e) {
           System.out.println("Cep invalido tente novamente");
        }

    }

    static String formatarCep(String cep) throws CepInvalido{

        if(cep.length() != 8)
         throw new CepInvalido();

         return "23.765-064";
    }

}
