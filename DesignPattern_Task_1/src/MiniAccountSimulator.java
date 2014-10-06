import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MiniAccountSimulator {
	public static void main(String[] args) {
		
			Account normal;
			normal = new NormalAccount(new Date(), 10000);
			normal.deposit(1000);
			normal.display();
			normal.withdraw(10000);
			normal.display();
			
			Account minus;
			minus = new MinusAccount(new Date(), 10000);
			minus.display();
			minus.withdraw(10000);
			minus.display();
			minus.withdraw(100000);
			minus.display();
			
			Date d = new Date();
			d.setYear(new Date().getYear()-3);
			Account saving = new SavingAccount(d,10000);
			saving.display();
			saving.withdraw(100);
			saving.display();
			saving.withdraw(10000);
			saving.display();
	}
}
