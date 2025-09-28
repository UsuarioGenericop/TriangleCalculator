import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hola!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Construye tu △");
        System.out.print("Introduce el tamaño de su lado a: ");
        double a = scanner.nextDouble();
        System.out.print("Introduce el tamaño de su lado b: ");
        double b = scanner.nextDouble();
        System.out.print("Introduce el tamaño de su lado c (base): ");
        double c = scanner.nextDouble();
        System.out.print("Introduce la altura de su trinagulo: ");
        double height = scanner.nextDouble();
        String tipo = null;
        if (a == b && b == c) {
            System.out.println("Usted tiene un triangulo equilatero");
            tipo = "equilatero";
        } else if (a == b || b == c || a == c) {
            System.out.println("Usted tiene un triangulo isoceles");
            tipo = "isoceles";
        } else {
            System.out.println("Su triangulo es escaleno");
            tipo = "escaleno";
        }
        switch (tipo){
            case "equilatero": System.out.println("Todos los lados son de 60 grados");
            case "isoceles":
            case "escaleno":
                double A = Math.toDegrees(Math.acos((b*b + c*c - a*a) / (2*b*c)));
                double B = Math.toDegrees(Math.acos((a*a + c*c - b*b) / (2*a*c)));
                double C = 180 - (A + B);
                System.out.printf("Ángulo A: %.2f°%n", A);
                System.out.printf("Ángulo B: %.2f°%n", B);
                System.out.printf("Ángulo C: %.2f°%n", C);break;

            default:
                System.out.println("Ese triangulo no existe");break;
        }
        double area = ((height * c)/2);
        System.out.println("El area de tu triangulo es: " + area);

        for (int i = 1; i < height; i++) {
            System.out.print(" ");
        }
        System.out.println("C");


        for (int i = 2; i < height; i++) {
            for (int j = i; j < height; j++) {
                System.out.print(" ");
            }


            if (i == height / 2) {
                System.out.print("b");
            } else {
                System.out.print("/");
            }


            for (int k = 1; k < (2*i - 3); k++) {
                System.out.print(" ");
            }


            if (i == height / 2) {
                System.out.print("a");
            } else {
                System.out.print("\\");
            }

            System.out.println();
        }


        System.out.print("A");
        for (int i = 0; i < (2*height - 5); i++) {
            if (i == (2*height - 6) / 2) {
                System.out.print("c");
            } else {
                System.out.print("-");
            }
        }
        System.out.println("B");

    }
}