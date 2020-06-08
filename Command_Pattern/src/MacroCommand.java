
public class MacroCommand implements Command {
	Command[] commands;
	
	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}
	
	public void execute() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
	}

	public void undo() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].undo();
		}
	}
}	// 매크로 커맨드 여러 명령을 순차적으로 수행
