package dateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeLOP {

	    //lop --- method
	    public static long calculateLOPs(String startDateLOP, String endDateLOP) throws ParseException {
	        SimpleDateFormat formatt = new SimpleDateFormat("dd/MM/yyyy");
	        Date start = formatt.parse(startDateLOP);
	        Date end = formatt.parse(endDateLOP);
	        long diff = end.getTime() - start.getTime();
	        long lops = diff / (24 * 60 * 60 * 1000);
	        return lops + 1;
	    }
		public static void main(String[] args) throws ParseException {
			try {
				long result = calculateLOPs("15/02/2025", "15/03/2025");
				System.out.println("Number of LOP Days : " + result);
			}
			catch (ParseException e){
				System.out.println("Invalid Date Format : " + e.getMessage());
			}

	}
}

