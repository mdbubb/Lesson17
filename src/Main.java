import java.util.Scanner;

/**
 * Created by mb977 on 10/18/16.
 */
public class Main {
    public static void main(String [] args){
        //position is a loction between two characters
        //not a method
        //used for scanner and .next() or .nextInt() or .nextString() or .nextLine()
        //position for scanner can never be placed backwards...only ahead
        //position is basically used for all scanner classes in order to tell the comptuer where the curser is and where to cutoff the outprint
        Scanner input = new Scanner("word1 word2");
        System.out.println(input.next());
        System.out.println(input.nextLine());


    }
}

