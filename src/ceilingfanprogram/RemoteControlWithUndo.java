package ceilingFanProgram;
/**
 * Write a description of class RemoteControlWithUndo here.
 *
 * @author Harshilkumar Vaghela(3116318)
 */
import java.util.Stack;
public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Stack <Command> undoStack;
    Stack <Command> redoStack;
    public RemoteControlWithUndo() {
        undoStack=new Stack<>();
        redoStack=new Stack<>();
        onCommands = new Command[3];
        offCommands = new Command[3];
        //Command noCommand = new NoCommand();
        /*for(int i=0;i<3;i++) {
        onCommands[i] = noCommand;
        offCommands[i] = noCommand;
        }*/
        //undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) throws CloneNotSupportedException{
        onCommands[slot].execute();
        undoStack.push((Command)onCommands[slot].clone());
    }

    public void offButtonWasPushed(int slot) throws CloneNotSupportedException{
        offCommands[slot].execute();
        undoStack.push((Command)offCommands[slot].clone());
    }

   
    public void undoButtonWasPushed() {
        Command undoCommand=undoStack.pop();
        undoCommand.undo();
        redoStack.push(undoCommand);

    }

    public void redoButtonWasPushed(){
        Command redoCommand=redoStack.pop();
        redoCommand.execute();
        undoStack.push(redoCommand);

    }

    /*   public String toString() {
    // toString code here...
    }*/
}