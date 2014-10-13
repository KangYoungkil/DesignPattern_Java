package DecoratorPattern;
class AirplaneSimulator {
	public static void main(String args[])
	{
		Airplane f,s,r,crt;
		f = new FrontAttackAirplane();
		s = new SideAttackAirplane(new FrontAttackAirplane());
		System.out.println("SideAttack : " + s.attack());
		r = new RearAttackAirplane(new FrontAttackAirplane());
		System.out.println("RearAttack : " + r.attack());
		crt = f;
		System.out.println("crt : " + crt.attack());
		crt = new SideAttackAirplane(crt);
		System.out.println("crt : " + crt.attack());
		crt = new RearAttackAirplane(crt);
		System.out.println("crt : " + crt.attack());
		crt = f;
		System.out.println("crt : " + crt.attack());
	}
}
