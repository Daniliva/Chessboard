package com.company;

import java.util.Scanner;

public class Main {
    private static String inputStr() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();
        return str;
    }

    private static void outputStr(String str) {
        System.out.println(str);
    }

    private static void outOfProcess(String[] args) {
        try {
            Chessboard chessboard = new Chessboard(args[0], args[1]);
            outputStr(chessboard.getPicture());
        } catch (NumberFormatException ex) {
            outputStr("Usage: height width\nExample: 4 5");
        } catch (IllegalArgumentException ex) {
            outputStr(ex.getMessage());
        }
    }

    private static void inOfProcess() {
        outputStr("Enter height:");
        String height = inputStr();
        outputStr("Enter width:");
        String width = inputStr();
        Chessboard chessboard = new Chessboard(height, width);
        outputStr(chessboard.getPicture());
    }

    public static void main(String[] args) {
        if (args.length > 0 && args.length == 2) {
            outOfProcess(args);
        } else {
            inOfProcess();
        }
    }
}
