public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        smartTv.ligar();
        System.out.println("TV Ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("canal atual: " + smartTv.canal);

        smartTv.mudarCanal(4);


        
        System.out.println("canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.desligar();

        System.out.println("novo status TV Ligada? " + smartTv.ligada);
    


        
    }
}
