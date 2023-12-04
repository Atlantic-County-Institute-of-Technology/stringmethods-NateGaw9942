import java.util.Scanner;

public class Ascii_Conversion_Final {
    public static void main(String[] args) {
        /*
        Your program should first decode this block of text and display it.
        Then, prompt the user for a name. Take that name and output the following:
        The name in reverse,
        the Reverse order in ALL CAPITALS,
        the original string using CaMeL cAsE,
        and finally the original string in ASCII.
        DO NOT USE ANY STRING MANIPULATION METHODS.
         */

        Scanner input = new Scanner(System.in);
        String code, name, revName = "", capRevName = "", camelCaseName = "", asciiName = "";

        System.out.println("Gimme the ascii code: ");
        code = input.nextLine();

        String[] arrCode = code.split(" ");

        for (int i = 0; i < arrCode.length; i++) {
            System.out.print((char) Integer.parseInt(arrCode[i]));
        }
        System.out.println("");

        System.out.println("Gimme the name: ");
        name = input.nextLine();

        String[] arrName = name.split("");

        for (int i = 0; i < name.length(); i++) {
            revName = arrName[i] + revName;
        }
        System.out.println("Name in reverse: " + revName);

        for (int i = 0; i < revName.length(); i++) {
            char tempChar = revName.charAt(i);
            int tempInt = (int) tempChar;
            if (tempInt > 97 && tempInt < 122) {
                tempInt = tempInt - 32;
            }
            char money = (char) tempInt;
            capRevName += money;
        }

        System.out.println("Name in reverse and all caps: " + capRevName);

        for (int i = 0; i < name.length(); i++) {
            if (i % 2 == 0) {
                int temp = (int) arrName[i].charAt(0);
                if (temp >= 97 && temp <= 122) {
                    temp -= 32;
                }
                char tempChar = (char) temp;

                camelCaseName += tempChar;
            } else {
                int temp = (int) arrName[i].charAt(0);
                if (temp >= 65 && temp <= 90) {
                    temp += 32;
                }
                char tempChar = (char) temp;

                camelCaseName += tempChar;
            }
        }
        System.out.println("Name in camelCase: " + camelCaseName);

        for (int i = 0; i < name.length(); i++) {
            char tempChar = name.charAt(i);
            int tempInt = (int) tempChar;
            asciiName = asciiName + tempInt + " ";
        }
        System.out.println(asciiName);
    }
}
