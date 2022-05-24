package ceilingFanProgram;
/**
 * Write a description of class CeilingFanSimulator here.
 *
 * @author Harshilkumar Vaghela(3116318)
 */
public class CeilingFanSimulator
{
    public static void main(String[] args)throws CloneNotSupportedException{
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
 
		CeilingFan ceilingFan = new CeilingFan("Living Room");
   
		CeilingFanLowCommand ceilingFanLow = 
				new CeilingFanLowCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMedium = 
				new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = 
				new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
  
		remoteControl.setCommand(0, ceilingFanLow, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(2, ceilingFanHigh, ceilingFanOff);
   
		System.out.println("go to low, medium, high, medium, low, high");
		remoteControl.onButtonWasPushed(0); // ->low
		remoteControl.onButtonWasPushed(1); // ->medium
		remoteControl.onButtonWasPushed(2); // ->high
		remoteControl.onButtonWasPushed(1); // ->medium
		remoteControl.onButtonWasPushed(0); // ->low
		remoteControl.onButtonWasPushed(2); // ->high
		
		System.out.println("6 undo commands");
		remoteControl.undoButtonWasPushed(); 
		remoteControl.undoButtonWasPushed(); 
		remoteControl.undoButtonWasPushed(); 
		remoteControl.undoButtonWasPushed();
		remoteControl.undoButtonWasPushed(); 
		remoteControl.undoButtonWasPushed();
		
		System.out.println("6 redo commands");
		remoteControl.redoButtonWasPushed(); 
		remoteControl.redoButtonWasPushed(); 
		remoteControl.redoButtonWasPushed(); 
		remoteControl.redoButtonWasPushed(); 
		remoteControl.redoButtonWasPushed(); 
		remoteControl.redoButtonWasPushed();
    }
}
