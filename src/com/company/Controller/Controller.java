package com.company.Controller;

import com.company.Service.Chessboard;

import java.util.Scanner;

public class Controller {
    String[] args;

    public Controller(String[] args) {
        this.args = args;
    }
    private static String inputStr() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        return str;
    }

    private static void outputStr(String str) {
        System.out.println(str);
    }

    private static void inOfProcess(String[] args) {
        try {
            Chessboard chessboard = new Chessboard(args[0], args[1]);
            outputStr(chessboard.getPicture());
        } catch (NumberFormatException ex) {
            outOfProcess();
        } catch (IllegalArgumentException ex) {
            outputStr(ex.getMessage());
        }
    }

    private static void outOfProcess() {
        outputStr("Enter height:");
        String height = inputStr();
        outputStr("Enter width:");
        String width = inputStr();
        Chessboard chessboard = new Chessboard(height, width);
        outputStr(chessboard.getPicture());
    }
    public void run()
    {
        if (args.length > 0 && args.length == 2) {
             inOfProcess(args);
        } else {
            outOfProcess();
        }
    }


}
