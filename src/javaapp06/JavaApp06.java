package javaapp06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class JavaApp06 {

   
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Date data1 = sdf.parse("12/10/2021");
        Date data2 = sdf.parse("15/10/2021");
        
        long difemMill = (data1.getTime() - data2.getTime());
        
        long diff = TimeUnit.DAYS.convert(difemMill, TimeUnit.MILLISECONDS);
        
        System.out.println(Math.abs(diff));
        
             
    }
    
}
