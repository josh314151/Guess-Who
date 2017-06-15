package com.example.josh.guesswho;

/**
 * Created by Josh on 2017-06-13.
 */

public class Character {
    /** Name of the character */
    private String name;

    /**
     * 2D Array of character attributes
     * Values are as follows:
     *      Hair Color: [blond, blue, brown, black, red]
     *      Hair Length: [short, long]
     *      Headgear: [yes, no]
     *      Shirt Color: [white, green, blue, red, yellow]
     *      Sport: [basket ball, soccer, skiing, golf, hockey, swimming, tennis, volleyball, equestrian]
     *      Gender: [male, female]
     *      Skin Color [black, white]
     * All other spaces are filler and are not used
     */
    private boolean[][] attributes;

    public Character() {
        this.name = "";
        this.attributes = new boolean[7][9];
    }

    public Character(String name) {
        this.name = name;
        this.attributes = new boolean[7][9];
    }

    public Character(String name, int value1, int value2, int value3, int value4, int value5, int value6, int value7) {
        this.name = name;
        this.attributes = new boolean[7][9];
        this.attributes[0][value1] = true;
        this.attributes[1][value2] = true;
        this.attributes[2][value3] = true;
        this.attributes[3][value4] = true;
        this.attributes[4][value5] = true;
        this.attributes[5][value6] = true;
        this.attributes[6][value7] = true;
    }

    public void setAttributes(int type, int value) {
        this.attributes[type][value] = true;
    }

    public void setName(String s) {
        this.name = s;
    }

    public boolean[][] getAttributes() {
        return attributes;
    }

    public String getName() {
        return name;
    }
}
