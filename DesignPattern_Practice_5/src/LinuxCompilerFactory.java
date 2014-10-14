//LinuxCompilerFactory.java
public class LinuxCompilerFactory extends CompilerFactory {

	public LinuxCompilerFactory() {
		// TODO Auto-generated constructor stub
		s = createScanner();
		p = createParser();
		c = createCodeGenerator();
		s.scan();
		p.parse();
		c.codegenrate();
	}

	Scanner createScanner() {
		return new LinuxScanner();
	}

	Parser createParser() {
		return new LinuxParser();
	}

	CodeGenerator createCodeGenerator() {
		return new LinuxCodeGenerator();
	}
}
