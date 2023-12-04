import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        //Menu
        while (true){
            System.out.println("**** Aplicacion Calculadora ****");
            mostrarMenu();

            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //revisar que este dentro de los valores
                if (operacion >= 1 && operacion <= 4){
                    //ejecutamos la operacion deseada
                    ejecutarOperacion(operacion, consola);
                }
                else if (operacion == 5) {
                    System.out.println("Hasta pronto...");
                    break;
                }
                else {
                    System.out.println("Opcion erronea "+operacion);
                }
                System.out.println();
            }
            catch (Exception e) {
                System.out.println("Ocurrio un error: "+ e.getMessage());
            }
        } //fin while
    } //fin main

    private static void mostrarMenu(){
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    """);
        System.out.print("Operacion a realizar? ");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.print("Proporciona valor num1: ");
        var num1 = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona valor num2: ");
        var num2 = Integer.parseInt(consola.nextLine());
        int resultado;
        switch(operacion){
            case 1 ->{ //suma
                resultado = num1+num2;
                System.out.println("Resultado suma: "+resultado);
            }
            case 2 ->{ //resta
                resultado = num1-num2;
                System.out.println("Resultado resta: "+resultado);
            }
            case 3 ->{ //multiplicacion
                resultado = num1*num2;
                System.out.println("Resultado multiplicacion: "+resultado);
            }
            case 4 ->{ //division
                resultado = num1/num2;
                System.out.println("Resultado division: "+resultado);
            }
            default -> {
                System.out.println("Opcion erronea "+operacion);
            }
        }
    }


} //fin clase
