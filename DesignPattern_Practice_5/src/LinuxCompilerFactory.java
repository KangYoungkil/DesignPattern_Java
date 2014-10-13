
public class LinuxCompilerFactory extends CompilerFactory{

	public LinuxCompilerFactory() {
		// TODO Auto-generated constructor stub
		s = createScanner();
		p = createParser();
		c = createCodeGenerator();
	}
	Scanner createScanner() {
		// TODO Auto-generated method stub
		return new LinuxScanner();
	}

	Parser createParser() {
		// TODO Auto-generated method stub
		return new LinuxParser();
	}

	CodeGenerator createCodeGenerator() {
		// TODO Auto-generated method stub
		return new LinuxCodeGenerator();
	}

}
