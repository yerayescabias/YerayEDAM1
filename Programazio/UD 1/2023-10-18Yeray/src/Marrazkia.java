import java.util.Scanner;

public class Marrazkia {
    public static void main(String[] args) {
        int alde1, alde2;
        char printChar;
        boolean tente = false;
        boolean betea = false;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu alde luzeera(1): ");
        alde1 = in.nextInt();
        System.out.print("Sartu alde luzeera(2): ");
        alde2 = in.nextInt();
        System.out.print("Sartu imprimatzeko karakterea: ");
        printChar = in.next().charAt(0);
        System.out.print("Sartu marrazkia tente egongo den(true/false): ");
        tente = in.nextBoolean();
        System.out.print("Sartu marrazkia beteta egongo den(true/false): ");
        betea = in.nextBoolean();
        in.close();

        marraztu(alde1, alde2, printChar, tente, betea);
    }

    public static void marraztu(int alde1, int alde2, char pintzela, boolean tente, boolean betea) {
        int altuera, zabalera;

        if (tente == true) {
            if (alde1 > alde2) {
                altuera = alde1;
                zabalera = alde2;
            } else if (alde1 < alde2) {
                altuera = alde2;
                zabalera = alde1;
            } else {
                altuera = alde1;
                zabalera = alde2;
            }
        } else {
            if (alde1 > alde2) {
                altuera = alde2;
                zabalera = alde1;
            } else if (alde1 < alde2) {
                altuera = alde1;
                zabalera = alde2;
            } else {
                altuera = alde1;
                zabalera = alde2;
            }
        }

        for (int row = 1; row <= altuera; ++row) {
            for (int column = 1; column <= zabalera; ++column) {
                if (betea == true) {
                    if (column == zabalera) {
                        System.out.println(pintzela);
                    } else {
                        System.out.print(pintzela);
                    }
                } else {
                    if (row == 1 || row == altuera) {
                        if (column == zabalera) {
                            System.out.println(pintzela);
                        } else {
                            System.out.print(pintzela);
                        }
                    } else {
                        if (column == 1) {
                            System.out.print(pintzela);
                        } else if (column == zabalera) {
                            System.out.println(pintzela);
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
            }
        }
    }
}