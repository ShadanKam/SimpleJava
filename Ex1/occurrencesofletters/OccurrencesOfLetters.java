package occurrencesofletters;

import java.io.*;
import java.nio.file.Paths;
import java.util.*;

public class OccurrencesOfLetters {
    
    private static Scanner input;
    static String f;
    static File file;
    static int countA = 0, countB = 0, countC = 0, countD = 0;
    static int countE = 0, countF = 0, countG = 0, countH = 0;
    static int countI = 0, countJ = 0, countK = 0, countL = 0;
    static int countM = 0, countN = 0, countO = 0, countP = 0;
    static int countQ = 0, countR = 0, countS = 0, countT = 0;
    static int countU = 0, countV = 0, countW = 0, countX = 0;
    static int countY = 0, countZ = 0;
    public static void main(String[] args) throws IOException {
           Scanner sc = new Scanner(System.in);
           //my file's name is "Shadan.txt" contains "Hello world/n my name is shadan"
           System.out.print("Enter a filename: ");
           f = sc.next();
            
        openfile();
        readfile();
        closefile();
        
        System.out.println("Number of A's: " + countA);
        System.out.println("Number of B's: " + countB);
        System.out.println("Number of C's: " + countC);
        System.out.println("Number of D's: " + countD);
        System.out.println("Number of E's: " + countE);
        System.out.println("Number of F's: " + countF);
        System.out.println("Number of G's: " + countG);
        System.out.println("Number of H's: " + countH);
        System.out.println("Number of I's: " + countI);
        System.out.println("Number of J's: " + countJ);
        System.out.println("Number of K's: " + countK);
        System.out.println("Number of L's: " + countL);
        System.out.println("Number of M's: " + countM);
        System.out.println("Number of N's: " + countN);
        System.out.println("Number of O's: " + countO);
        System.out.println("Number of P's: " + countP);
        System.out.println("Number of Q's: " + countQ);
        System.out.println("Number of R's: " + countR);
        System.out.println("Number of S's: " + countS);
        System.out.println("Number of T's: " + countT);
        System.out.println("Number of U's: " + countU);
        System.out.println("Number of V's: " + countV);
        System.out.println("Number of W's: " + countW);
        System.out.println("Number of X's: " + countX);
        System.out.println("Number of Y's: " + countY);
        System.out.println("Number of Z's: " + countZ);
        
    }

    public static void openfile() {
        try {
            input = new Scanner(Paths.get(f));

        } catch (Exception e) {
            System.out.println("File doesn't exist!. Terminate");
            System.exit(1);
        }
    }

    public static void readfile() {
        
        
        while (input.hasNextLine()) {
            String s = input.nextLine();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (Character.toUpperCase(ch)=='A') 
                    countA++;
                if (Character.toUpperCase(ch)=='B')
                    countB++;
                if (Character.toUpperCase(ch)=='C')
                    countC++;
                if (Character.toUpperCase(ch)=='D')
                    countD++;
                if (Character.toUpperCase(ch)=='E')
                    countE++;
                if (Character.toUpperCase(ch)=='F')
                    countF++;
                if (Character.toUpperCase(ch)=='G')
                    countG++;
                if (Character.toUpperCase(ch)=='H')
                    countH++;
                if (Character.toUpperCase(ch)=='I')
                    countI++;
                if (Character.toUpperCase(ch)=='J')
                    countJ++;
                if (Character.toUpperCase(ch)=='K')
                    countK++;
                if (Character.toUpperCase(ch)=='L')
                    countL++;
                if (Character.toUpperCase(ch)=='M')
                    countM++;
                if (Character.toUpperCase(ch)=='N')
                    countN++;
                if (Character.toUpperCase(ch)=='O')
                    countO++;
                if (Character.toUpperCase(ch)=='P')
                    countP++;
                if (Character.toUpperCase(ch)=='Q')
                    countQ++;
                if (Character.toUpperCase(ch)=='R')
                    countR++;
                if (Character.toUpperCase(ch)=='S')
                    countS++;
                if (Character.toUpperCase(ch)=='T')
                    countT++;
                if (Character.toUpperCase(ch)=='U')
                    countU++;
                if (Character.toUpperCase(ch)=='V')
                    countV++;
                if (Character.toUpperCase(ch)=='W')
                    countW++;
                if (Character.toUpperCase(ch)=='X')
                    countX++;
                if (Character.toUpperCase(ch)=='Y')
                    countY++;
                if (Character.toUpperCase(ch)=='Z')
                    countZ++;
               
            }
        }

    }

    public static void closefile() {
       if (input != null) {
            input.close();
        }

}
}