public class WindowsCompilerFactory extends CompilerFactory{
	Scanner createScanner() {
		return new WindowsScanner();
	}

	Parser createParser() {
		// TODO Auto-generated method stub
		return new WindowsParser();
	}

	CodeGenerator createCodeGenerator() {
		// TODO Auto-generated method stub
		return new WindowsCodeGenerator();
	}
}