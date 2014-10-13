public class CompilerTestDrive {
	public static void main(String[] args) {
		

		CompilerFactory cf = null;
		if (args[0].equals("UNIX"))
			cf = new UnixCompilerFactory();
		else if (args[0].equals("WINDOWS"))
			cf = new WindowsCompilerFactory();
		else if (args[0].equals("LINUX"))
			cf = new LinuxCompilerFactory();
		
		cf.codegerate();
		cf.parse();
		cf.scan();
	}
}