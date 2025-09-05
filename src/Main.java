import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(IMC());
    }

    public static String IMC() {

        double peso = 0;
        double estatura = 0;

        System.out.println("Bienvenido, ¿deseas conocer tu estado nutricional?");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su peso en kg");
        peso = teclado.nextDouble();
        System.out.println("ingrese su estatura en metros");
        estatura = teclado.nextDouble();

        double imc = peso/(Math.pow(estatura,2));

        if (imc< 18.5) {
            System.out.println("Su imc es bajo peso");
        } else if (imc>= 18.5 && imc<= 24.9) {
            System.out.println("Su imc es peso normal");
        } else if (imc >=25 && imc<= 26.9){
            System.out.println("Su imc es sobrepeso de grado 1");
        } else if (imc >=27 && imc<=29.9){
            System.out.println("Su imc es sobrepeso de grado 2");
        } else if (imc >=30 && imc<=34.9){
            System.out.println("Su imc es obesidad de tipo 1");
        } else if (imc >=35 && imc<=39.9){
            System.out.println("Su imc es obesidad de tipo 2");
        } else if (imc >=40 && imc<=49.9){
            System.out.println("Su imc es obesidad de tipo 3 morbida");
        }  else if (imc >=50){
            System.out.println("Su imc es obesidad de tipo 4 extrema");
        }
        return "Su peso es:" +peso+ "Su estatura es:" +estatura+ "Su imc es:" +imc;
    }

}