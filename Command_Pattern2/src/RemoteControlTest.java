
public class RemoteControlTest {
	
	public static void main(String[] args) {
		CeilingFan ceilingFan = new CeilingFan("Living room");
		CeilingFanHighCommand high = new CeilingFanHighCommand(ceilingFan);
		CeilingFanMediumCommand medium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanLowCommand low = new CeilingFanLowCommand(ceilingFan);
		CeilingFanOffCommand off = new CeilingFanOffCommand(ceilingFan);
		
		RemoteControlWithUndo remote = new RemoteControlWithUndo();
		
		remote.setCommand(0, high, off);
		remote.setCommand(1, medium, off);
		
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		System.out.println(remote);
		remote.undoButtonWasPushed();
		
		remote.onButtonWasPushed(1);
		System.out.println(remote);
		remote.undoButtonWasPushed();
	}
}
