package order;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Test {
	protected static Float polishingServiceMins(Integer mins){
        if(mins == null){
            return 0f;
        }
        int extraMins = mins % 60;
        if(extraMins < 15){
            return (float) (mins / 60);
        }else if(mins % 60 >= 15 && mins % 60 <= 45){
            return (float) (mins / 60) + 0.5f;
        }else {
            return (float) (mins / 60 + 1);
        }
    }
	public static void main(String[] args) {
		System.out.println(new Random().nextInt(1000000000));
	}
}
