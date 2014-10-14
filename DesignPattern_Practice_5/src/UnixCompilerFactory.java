//UnixCompilerFactory.java
public class UnixCompilerFactory extends CompilerFactory {
	public UnixCompilerFactory() {
		s = createScanner();
		p = createParser();
		c = createCodeGenerator();
		s.scan();
		p.parse();
		c.codegenrate();
	}

	Scanner createScanner() {
		return new UnixScanner();
	}

	Parser createParser() {
		return new UnixParser();
	}

	CodeGenerator createCodeGenerator() {
		return new UnixCodeGenerator();
	}
}