

import java.awt.*;
import java.util.Scanner;



public class Main {


    static String result = null;


    public static String calc(String input) {
        Scanner sca = new Scanner(System.in);
        String inPut = sca.nextLine();
        String[]variables = inPut.split(" ", 3);
        String first = variables[0];
        String sign = variables[1];
        String second = variables[2];
        int position1 = -1;
        int position2 = -1;
        int positionRom1 = -1;
        int positionRom2 = -1;

        int intFirst = 0;
        int intSecond = 0;
        int intResult = 0;
        String[] myLat = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (int i = 0; i < myLat.length; i++) {
            if (myLat[i].equals(first)) {
                position1 = i;
                intFirst = Integer.parseInt(first);
            }
        }
            for (int i = 0; i < myLat.length; i++) {
                if (myLat[i].equals(second)) {
                    position2 = i;
                    intSecond = Integer.parseInt(second);
                }
            }
                if (position1==-1 && position2==-1) {
                    String[] myRom = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
                    for (int i = 0; i < myRom.length; i++) {
                        if (myRom[i].equals(first)) {
                            positionRom1 = i;
                            intFirst = Integer.parseInt(myLat[i]);
                        }
                    }
                    for (int i = 0; i < myLat.length; i++) {
                        if (myRom[i].equals(second)) {
                            positionRom2 = i;
                            intSecond = Integer.parseInt(myLat[i]);
                        }
                    }
                }
        if (sign.equals("*")) { //сравнивает знак в строке  и при совпадении присваивает его оператору
            intResult = intFirst * intSecond;
        } else if (sign.equals("/")) {
            intResult = intFirst / intSecond;
        } else if (sign.equals("+")) {
            intResult = intFirst + intSecond;
        } else if (sign.equals("-")) {
            intResult = intFirst - intSecond;
        } else result = "throws Exception";
if (position1!=-1 && position2!=-1){
    result="Result = " + intResult;
}else if(positionRom1!=-1 && positionRom1!=-1 && intResult>0){
    String[] greatRom = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X","XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "IXX", "XX","XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "IXXX", "XXX","XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "IXL", "XL","XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "IL", "L","LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "ILX", "LX","LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "ILXX", "LXX","LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "ILXXX", "LXXX","LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "IXC", "XC","XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "IC", "C"};
    result="Result = " + greatRom[intResult-1];
}else {
    result = "throws Exception";
}

            return result;
        }

        public static void main (String[] args){
            System.out.println( calc(result));
        }
}

