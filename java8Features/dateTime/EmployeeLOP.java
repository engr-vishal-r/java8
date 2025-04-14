package dateTime;

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
	�
	    // Other fields and methods
	}

