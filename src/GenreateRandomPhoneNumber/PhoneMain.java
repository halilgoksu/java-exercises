//Write a program that creates and prints a random phone number of the form XX-XXX-XXXX.
//Include the dashes in the output.Do not let the first three digits contain an 8 or 9
//(but don't be more restrictive than that), and make sure that the second set of three digits
//is no greater than 742

package GenreateRandomPhoneNumber;
import java.util.Random;
public class PhoneMain {
    //xx-xxx-xxx
    public static void main(String[] args) {
        Random rand= new Random();

        int first= rand.nextInt(8);
        int secend = rand.nextInt(8);
        int third =rand.nextInt(8);
        //till 8 will generarte a random number

        int middle =rand.nextInt(742);
        int last =rand.nextInt(9999);

        String middleString,lastString;

        middleString=Integer.toString(middle);
        lastString=Integer.toString(last);

        while (middleString.length()<3){
            middleString = "0"+middleString;
        }
        while (lastString.length()<4){
            lastString="0"+lastString;

        }
        System.out.println(Integer.toString(first)+Integer.toString(secend)+Integer.toString(third)+"-"+middleString+"-"+lastString);


    }
}
