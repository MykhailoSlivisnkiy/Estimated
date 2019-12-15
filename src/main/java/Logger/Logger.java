package Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Logger {

    public static boolean log(String any){

        try
        {
            String filename= "D:/Laba4/logs.txt";
            FileWriter fw = new FileWriter(filename,true);
            fw.write(any + "\n");
            fw.close();
            return true;
        }
        catch(IOException ioe)
        {
            Logger.error(ioe.getMessage() + "\n" + Arrays.toString(ioe.getStackTrace()));
            return false;
        }

    }

    public static boolean error(String err) {
        err+="\n";
        try
        {
            String filename= "D:/Laba4/logs.txt";
            FileWriter fw = new FileWriter(filename,true);
            fw.write(err);
            fw.close();
            try {
                EmailSender.sendEmail(err);
            } catch (com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException e) {
                e.printStackTrace();
            }
            return true;
        }
        catch(IOException e)
        {
            return false;
        }

    }


}
