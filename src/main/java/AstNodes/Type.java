package AstNodes;

import javax.print.DocFlavor;

public class Type {
    private byte kind;
    private final Object type;
    public static final byte BOOL = 0;
    public static final byte INT = 1;
    public static final byte DOUBLE = 2;
    public static final byte STRING = 3;
    public static final byte ERROR = -1;
    public Type(byte kind){
        this.type = kind;
    }

    public boolean equals(Object other){
        return true;
    }

    @Override
    public String toString(){
        return type.toString();
    }

    public static Type boolT = new Type(BOOL);
    public static Type intT = new Type(INT);
    public static Type stringT = new Type(STRING);
    public static Type doubleT = new Type(DOUBLE);
    public static Type error = new Type(ERROR);
}


