import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PuzzlesUtil {

    public ArrayList getTenRolls(){
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i= 0; i<10; i++){
            Random random = new Random();
            Integer val = random.nextInt(20);
            numeros.add(val);
        }
        return numeros;
    }

    public String getRandomLetter(){
        String letras[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        Random random = new Random();
        int val = random.nextInt(letras.length);
        String letra = letras[val];
        return letra;
    }

    public ArrayList generatePassword(){
        String letras[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        ArrayList<String> password = new ArrayList<String>();
        for (int i= 0; i<8; i++){
            Random random = new Random();
            Integer val = random.nextInt(letras.length);
            String letra = letras[val];
            password.add(letra);
        }
        return password;
    }

    public ArrayList getNewPasswordSet(int longitud){
        String letras[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        ArrayList<String> password = new ArrayList<String>();
        for (int i= 0; i<longitud; i++){
            Random random = new Random();
            Integer val = random.nextInt(letras.length);
            String letra = letras[val];
            password.add(letra);
        }
        return password;
    }
}