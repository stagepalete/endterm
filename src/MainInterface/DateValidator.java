package MainInterface;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateValidator {
    public static String DateFormatValidate(String dateToValdate){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        //To make strict date format validation
        formatter.setLenient(false);
        Date parsedDate = null;
        try {
            parsedDate = formatter.parse(dateToValdate);

        } catch (ParseException e) {
            System.out.println("Invalid date format");
            return null;
        }
        return String.valueOf(formatter.format(parsedDate));
    }


    public static boolean DateTimeLineValidate(String day_of_acq, String day_of_ret){
        String[] day_of_acquisition = day_of_acq.split("-");
        String[] day_of_return = day_of_ret.split("-");
        if(Integer.parseInt(day_of_acquisition[0]) > Integer.parseInt(day_of_return[0])){
            System.out.println("Day of return is before day of acquisition");
            return false;
        }
        if(Integer.parseInt(day_of_acquisition[1]) > Integer.parseInt(day_of_return[1])){
            System.out.println("Day of return is before day of acquisition");
            return false;
        }
        if(Integer.parseInt(day_of_acquisition[2]) > Integer.parseInt(day_of_return[2])){
            System.out.println("Day of return is before day of acquisition");
            return false;
        }
        return true;
    }
}
