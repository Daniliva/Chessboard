package com.company.Service;

public class Chessboard {
    private double height;
    private double width;

    public Chessboard(String height, String width) throws NumberFormatException {
        this.height = Double.parseDouble(height);
        this.width = Double.parseDouble(width);
        if (this.height <= 0 || this.width <= 0) {
            throw new IllegalArgumentException("Arguments must be larger than zero");
        }
    }

    private StringBuilder ChoseElements(int i, int j) {
        String space = "  ";
        String star = "*";
        StringBuilder stringBuilder = new StringBuilder();
        if (i % 2 == 0) {
            if (j % 2 == 0) {
                stringBuilder.append(star);
            } else {
                stringBuilder.append(space);
            }
        } else {
            if (j % 2 == 0) {
                stringBuilder.append(space);
            } else {
                stringBuilder.append(star);
            }
        }
        return stringBuilder;
    }

    public String getPicture() {
        String result;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * width; j++) {
                stringBuilder.append(ChoseElements(i, j));
            }
            if (i < height - 1) {
                stringBuilder.append("\n");
            }
        }
        result = stringBuilder.toString();
        return result;
    }
}