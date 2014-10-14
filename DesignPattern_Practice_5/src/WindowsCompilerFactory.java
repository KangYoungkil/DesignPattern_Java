//WindowsCompilerFactory.java
public class WindowsCompilerFactory extends CompilerFactory{
	public WindowsCompilerFactory() {
		s = createScanner();
		p = createParser();
		c = createCodeGenerator();
		s.scan();
		p.parse();
		c.codegenrate();
	}
	Scanner createScanner() {
		return new WindowsScanner();
	}

	Parser createParser() {
		return new WindowsParser();
	}

	CodeGenerator createCodeGenerator() {
		return new WindowsCodeGenerator();
	}
}