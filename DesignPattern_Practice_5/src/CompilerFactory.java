//CompilerFactory.java
public abstract class CompilerFactory {
	protected Scanner s;
	protected Parser p;
	protected CodeGenerator c;
	abstract Scanner createScanner();
	abstract Parser createParser();
	abstract CodeGenerator createCodeGenerator();
}