public abstract class CompilerFactory {
	protected Scanner s;
	protected Parser p;
	protected CodeGenerator c;
	
	abstract Scanner createScanner();
	abstract Parser createParser();
	abstract CodeGenerator createCodeGenerator();

	void parse()
	{
		p.parse();
	}
	void scan()
	{
		s.scan();
	}
	void codegerate()
	{
		c.codegenrate();
	}
	
	public CompilerFactory() {
		s = createScanner();
		p = createParser();
		c = createCodeGenerator();
	}
}