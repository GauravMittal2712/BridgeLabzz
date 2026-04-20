import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {

        int sum =0,Invalid = 0;
        int n;
        for(String arg:args)
            try{
                n = Integer.parseInt(arg);
                sum+=n;

            }catch (NumberFormatException e){
                Invalid++;
            }
        System.out.println(sum);
        System.out.println(Invalid);
    }
}
