// String manipulation practice with protein code
import java.io.*;
class Main {
    public static void main(String[] args) {
    String inputString = "ATATTATGTCGCGGATGTAAG";
    displaySequence(inputString);

    }
    
    public static String findProtein(String inputString){
        int startIndex = inputString.indexOf("ATG");
        if (startIndex == -1){
            return "";
        }
        int endIndex = inputString.indexOf("TAA",startIndex+3);
        if (endIndex == -1){
            return "";
        }
        return inputString.substring(startIndex, endIndex);
    }

    public static void displaySequence(String inputString){
        String result = findProtein(inputString);
        if (result.isEmpty()){
            System.out.println("No Protein Sequence found!");
        }
        else
        {
            System.out.print("The first Protein is: ");
            System.out.println(result);
        }
    }
}
