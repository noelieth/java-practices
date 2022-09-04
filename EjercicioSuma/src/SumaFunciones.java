public class SumaFunciones {
    public static double Sumar(double num1, double num2, double num3) {
        double resultado;

        resultado = num1 + num2 + num3;

        return resultado;
    }
    public static void main(String[] args) throws Exception {
        double resultado;
        
        resultado = Sumar(5,3,4);
        System.out.println("El resultado de la suma es: "+ resultado);
    }
}
