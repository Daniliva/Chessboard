package com.company;

class Chessboard {
    private double height;
    private double width;

    Chessboard(String height, String width) throws NumberFormatException {
        this.height = Double.parseDouble(height);
        this.width = Double.parseDouble(width);
        if (this.height <= 0 || this.width <= 0) {
            throw new IllegalArgumentException("Arguments must be larger than zero");
        }
    }
    private String space()
    {
        return"  ";
    }
    private String star()
    {
        return "*";
    }
private StringBuilder If_true(int j)
{StringBuilder stringBuilder = new StringBuilder();
    if (j % 2 == 0) {
        stringBuilder.append(star());
    } else {
        stringBuilder.append(space());
    }
    return stringBuilder;
}
    private StringBuilder If_false(int j)
    {StringBuilder stringBuilder = new StringBuilder();
        if (j % 2 == 0) {
            stringBuilder.append(space());
        } else {
            stringBuilder.append(star());
        }
        return stringBuilder;
    }

    String getPicture() {
        String result;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2*width; j++) {
                if (i % 2 == 0) {
                    stringBuilder.append(If_true(j));
                } else {
                    stringBuilder.append(If_false(j));
                }
            }
            if (i < height - 1) {
                stringBuilder.append("\n");
            }
        }
        result = stringBuilder.toString();
        return result;
    }
}