package com.company;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
private  static void Default(String[] args)
{
    try {
        Chessboard chessboard = new Chessboard(args[0], args[1]);
        System.out.println(chessboard.getPicture());
    } catch (NumberFormatException ex) {
        System.out.println("Usage: height width\nExample: 4 5");
    } catch (IllegalArgumentException ex) {
        System.out.println(ex.getMessage());
    }
}
private static void Not_default()
{
    String height="";
    String width="";
    System.out.println("Enter height:");
    height = in.nextLine();
    System.out.println("Enter width:");
    width = in.nextLine();
    Chessboard chessboard = new Chessboard(height, width);
    System.out.println(chessboard.getPicture());
}
    public static void main(String[] args) {
        if (args.length > 0 && args.length == 2) {
            Default(args);
        } else
            {
                Not_default();
        }
        in.close();
    }
}
