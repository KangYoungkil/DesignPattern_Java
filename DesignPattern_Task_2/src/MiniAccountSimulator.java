import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MiniAccountSimulator {
	public static void main(String[] args) {
		// subject 생성
		AccountData accountData = new AccountData();
		// Observers 생성
		CurrentInterestDisplay currentDisplay = new CurrentInterestDisplay(accountData);
		StatisticsInterestDisplay statisticsDisplay = new StatisticsInterestDisplay(accountData);
		BeforeInterestDisplay forecastDisplay = new BeforeInterestDisplay(accountData);
		
		// 기상대 시뮬레이션
		accountData.setMeasurements(0.5);
		accountData.setMeasurements(0.1);
		accountData.setMeasurements(0.2);
		
	}
}
