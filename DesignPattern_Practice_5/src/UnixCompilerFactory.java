public class UnixCompilerFactory extends CompilerFactory{
	
	
	Scanner createScanner() {
		return new UnixScanner();
	}

	Parser createParser() {
		// TODO Auto-generated method stub
		return new UnixParser();
	}

	CodeGenerator createCodeGenerator() {
		// TODO Auto-generated method stub
		return new UnixCodeGenerator();
	}
}