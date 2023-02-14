package edu.rpi.legup.puzzle.lightup;

public enum LightUpCellType {
    BULB(-4), EMPTY(-3), UNKNOWN(-2), BLACK(-1), NUMBER(0);

    public int value;

    LightUpCellType(int value) {
        this.value = value;
    }

    public static LightUpCellType IntToenum(int val){
        switch(val){
            case -3:
                return EMPTY;
            case 0:
                return NUMBER;
            case -2:
                return UNKNOWN;
            case -4:
                return BULB;
            case -1:
                return BLACK;
        }
        return null;
    }
}
