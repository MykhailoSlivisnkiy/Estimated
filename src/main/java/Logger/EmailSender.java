package Logger;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailSender {


    public static void sendEmail(String errorMessage) throws MessagingException {

        final String username = "mykhailo.slivinskyi.knm.2018@lpnu.ua";
        final String password = "08.06.2001";

        Properties prop = new Properties();

        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS


        try {

            Session session = Session.getInstance(prop,
                    new javax.mail.Authenticator() {
                        protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                            return new javax.mail.PasswordAuthentication(username, password);
                        }
                    });

            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress("mykhailo.slivinskyi.knm.2018@lpnu.ua"));

            message.setRecipients(MimeMessage.RecipientType.TO, InternetAddress.parse("miwka0806@gmail.com"));

            message.setSubject("Exception thrown at laba 8");

            message.setText(errorMessage);

            Transport.send(message);

        } catch (javax.mail.MessagingException e) {
            e.printStackTrace();
        }

    }

}
