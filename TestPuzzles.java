import java.util.ArrayList;
import java.util.Arrays;

public class TestPuzzles {
    public static void main(String[] args){

        PuzzlesUtil puzzle = new PuzzlesUtil();

        System.out.println("\n----- Prueba Lista de numeros -----");
        System.out.printf("Lista de numeros: %s \n\n", puzzle.getTenRolls());

        System.out.println("\n----- Letra aleatoria -----");
        System.out.printf("Letra : %s \n\n", puzzle.getRandomLetter());

        System.out.println("\n----- Password Aleatorio -----");
        System.out.printf("Password : %s \n\n", puzzle.generatePassword());

        System.out.println("\n----- Password Aleatorio -----");
        int longitud = 10;
        System.out.printf("Password : %s \n\n", puzzle.getNewPasswordSet(longitud));
    }
}