package com.simplon;

/**
 * Created by alonso on 29/01/17.
 */
public enum Color {
    // Elements de l'enumération
    RED("#FFFF00"),
    GREEN("#008000"),
    BLUE("#0000FF");

    private final String codeColor;

    Color(String codeColor){
        this.codeColor = codeColor;
    }


}
