public class Main {
    public static void main(String[] args) throws Exception {
        Carro miCarro = new Carro(); 
        miCarro.ColocarPuerta(); 
        System.out.println("Numero de puertas: " + miCarro.puertas);
    }
}

class Carro{
    public int puertas = 0;

    public void ColocarPuerta(){
        this.puertas++;
    }
}
