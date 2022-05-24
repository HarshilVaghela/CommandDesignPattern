package ceilingFanProgram;
/**
 * Write a description of interface Command here.
 *
 * @author Harshilkumar Vaghela(3116318)
 */
public abstract class Command implements Cloneable{
    public abstract void execute();

    public abstract void undo();

    public Object clone() throws CloneNotSupportedException{
        try{
            Command c=(Command) super.clone();
            return c;
        }
        catch(CloneNotSupportedException e){
            System.out.println(e.getMessage());return null;
        }
    }
}
