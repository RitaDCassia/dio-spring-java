public class SisitemaMedida {
    public static void main(String[] args) {
        String sigla = "M";

        switch (sigla){
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("médio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
        }

        // cennario complementar
        switch (sigla){
            case "T": {
                System.out.println("5gb Youtube");
            }
            case "M": {
                System.out.println("instagram e wpp");
            }
            case "B": {
                System.out.println("100 mintuos de ligacao");
            }
        }

        int idade = 14;
        if(idade >= 16)
            System.out.println("Vá para a piscina de adultos");
        else
            System.out.println("Vá para a piscina de de crianças");

    }
}
