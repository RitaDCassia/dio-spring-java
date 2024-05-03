import rita.cassia.primeirasemana.SmartTv;

public class Main {
    public static void main(String[] args) {
        // criar um exemplo de uma classe pra representar uma smartTV onde
        // 1 ela tenha as caracteristicas: ligada, canal, vlume

        SmartTv smartTv = new SmartTv();

        System.out.println("está ligada?" + smartTv.ligada);
        System.out.println( "canal atual: "+ smartTv.canal);
        System.out.println("volume atual: "+smartTv.volume);

        smartTv.ligar();
        System.out.println("esta ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("esta ligada? " + smartTv.ligada);

        smartTv.duminirVolume();
        smartTv.duminirVolume();
        System.out.println("volume atual: "+smartTv.volume);

        smartTv.mudarCanal(50);
        System.out.println( "canal atual: "+ smartTv.canal);


    }



}