public class Usuario {
    public static void main(String[] args){

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? "+ smartTv.ligada);
        System.out.println("Canal  "+ smartTv.canal);
        System.out.println("Volume "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("TV ligada? "+ smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV ligada? "+ smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume atual "+ smartTv.volume);

        System.out.println("Canal atual: "+ smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Canal atual: "+ smartTv.canal);
        

    }
}
