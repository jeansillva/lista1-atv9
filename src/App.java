import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Pedir a temperatura em graus Fahrenheit:
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        double temp = sc.nextDouble();
        sc.close();
        //Transformar e mostrar a temperatura em graus Celsius. C = 5 * ((F-32) / 9).
        double cel = 5*((temp-32)/9);
        System.out.println("A temperatura em Fahrenheit é "+ temp +", convertida para Celsius ela é "+ cel);
    }
}