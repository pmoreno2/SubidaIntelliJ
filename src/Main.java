// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Declaración de variables
        double Capital,tae,Cuota,InteresMensual,SaldoAnt;
        //float Capital,tae,InteresMensual,SaldoAnt;
        double SaldoAc,Amortizacion,Interes;
        //float SaldoAc,Amortizacion,Interes;
        int mensualidades , i ;
        String car;
        boolean datos_correctos=false;

        /*//Colores de letras y fondo
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";
        final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        final String ANSI_RED_BACKGROUND = "\u001B[41m";
        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
        final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
        final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
        final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
        System.out.println(ANSI_BLUE_BACKGROUND + ANSI_WHITE + "Texto de color blanco sobre fondo azul");*/

        /*//precision de dos decimales, y con truncamiento
        cout.flags(ios_base::fixed);
        cout << setprecision(2);*/

        //Esta condición nos permite volver a introducir los datos en el caso de que nos equivoquemos
        //al meter los datos, o bien queramos cambiarlos al final del programa
        while(!datos_correctos){

            /*//Volvemos a introducir la notacion punto fijo por si el usuario se equivoca
            cout.flags(ios_base::fixed);
            cout << setprecision(2);*/

            //Pedimos al usuario los datos
            var sc = new Scanner(System.in);
            System.out.println("Escriba el Capital Inicial:");
            Capital=sc.nextFloat();
            System.out.println("Escriba el TAE:");
            tae=sc.nextFloat();
            tae=tae/100;
            System.out.println("Escriba el numero de mensualidades:");
            mensualidades=sc.nextInt();

            //Cálculos
            InteresMensual=tae/12;
            Cuota=(Capital*InteresMensual*(Math.pow(1+InteresMensual,mensualidades)))/((Math.pow(1+ InteresMensual,mensualidades))-1);

            //Nos vamos a la posicion (1,1)
            //clrscr();gotoxy(1,1);
            System.out.println("Periodo            Amortizacion            Interes            Saldo            Cuota");
            System.out.println("------------------------------------------------------------------------------------");
            SaldoAnt=Capital;


            for(i=1;i<=mensualidades;i++){
                //Cálculos
                Interes=SaldoAnt*InteresMensual;
                Amortizacion=Cuota-Interes;
                SaldoAc=SaldoAnt-Amortizacion;
                //Datos por pantalla
                System.out.print(i+"                 ");
                System.out.printf("%.2f", Amortizacion);
                System.out.print("                 ");
                System.out.printf("%.2f", Interes);
                System.out.print("                 ");
                System.out.printf("%.2f", SaldoAc);
                System.out.print("           ");
                System.out.printf("%.2f", Cuota);
                System.out.println(" ");
                //Para la siguiente iteración
                SaldoAnt=SaldoAc;
            }

            System.out.println("El Capital Inicial es de: "+Capital);
            System.out.println("El TAE es de: "+(tae*100));
            System.out.println("El numero de mensualidades es de: "+mensualidades);
            System.out.println("El interes mensual es: "+(InteresMensual*100));
            System.out.println("El pago mensual es: "+Cuota);

            //Derechos del programador
            System.out.println("Produced by P-Jay.");
            System.out.println("All rights reserved.");

/*            System.out.println("¿Son correctos los datos?(s/n)");
            car = sc.nextLine();
            if((car.equals("Si"))||(car.equals("si"))||(car.equals("SI"))||(car.equals("s"))){
                datos_correctos=true;
            }
            else if((car.equals("No"))||(car.equals("no"))||(car.equals("NO"))||(car.equals("n"))) {
                datos_correctos = false;
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
            }
            else{
                    System.out.println("Entrada no valida");

                *//*final String os = System.getProperty("os.name");
                if (os.contains("Windows")) {
                    Runtime.getRuntime().exec("cls");
                }
                else {
                    Runtime.getRuntime().exec("clear");
                }*//*
            }*/
            datos_correctos=true;
            sc.close();
        }

        /*system("PAUSE");
        return 0;*/

    }

}