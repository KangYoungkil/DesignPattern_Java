package DecoratorPattern;
abstract class AirplaneDecorator extends Airplane{
	public Airplane airplane;
	public abstract String attack();
}
