package paquete;

public class Main {
    public static void main(String[] args) {
        System.out.println("¡?");
        int num = 6;
        int num2 = 10;
        boolean puede;
        puede = true;

        if (puede) {
            puede=true;
            System.out.println("puede er verdadero?");
        } else {
            puede=false;
            System.out.println("O puede es Falso?");
        }
        if ((num==6)) { // SI IGUAL A 6
            System.out.println("Si se cumple la condicion es True");
        } else {
            System.out.println("Si NUM no es 6 da false");
        }

        if (num >= 6) {// SI MAYOR igual QUE 6
            System.out.println("Si se cumple la condicion es True");
        } else {
            System.out.println("Si no se cumple la condicion es False");
        }

        if ((num <= 6)) //si menor igual que 6
        {
            System.out.println("Si se cumple la condicion es True");
        } else {
            System.out.println("Si no se cumple la condicion es False");
        }

        if ((num==6) || (num2==10)) { //si o si
            System.out.println("Si se cumple la condicion es True");
        } else {
            System.out.println("Si no se cumple la condicion es False");
        }

        if ((num == 6) && (num2 > 5)) { //si y si
            System.out.println("Si se cumple la condicion es True");
        } else {
            System.out.println("Si no se cumple la condicion es False");
        }
        // if (! == 6) Si no es 6
    }
}