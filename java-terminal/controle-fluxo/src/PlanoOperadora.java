public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "B"; //B /M /T

        //if(plano == "B"){
        //    System.out.println("100 minutos de ligacao");
        //}else if (plano == "M"){
        //    System.out.println("100 minutos de ligacao");
        //    System.out.println("Whats e instagram gratis");
        //}else if (plano == "T"){
        //    System.out.println("100 minutos de ligacao");
        //    System.out.println("Whats e instagram gratis");
        //    System.out.println("5Gb Youtube");

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Whats e Instagram gratis");
            }
            case "B": {
                System.out.println("100 miutos de ligacao");
            }
        }



        
    }
}
