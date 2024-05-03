package rita.cassia.primeirasemana;

public class SmartTv {
    public boolean ligada = false;
    public int canal = 1;
    public int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void almentarVolume(){
        volume ++;
    }

    public void duminirVolume(){
        volume --;
    }

    public void mudarCanal(int escolherCanal){
        canal = escolherCanal;
    }



}
