

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;


public class Main {
    public static void main(String args[]) {
        String to = "korotkovReceiver@stub.test";         // sender email
        String from = "korotkovSender@stub.test";       // receiver email
        String host = "127.0.0.1";            // mail server host

        //Properties properties = System.getProperties();
        Properties properties = new Properties();
        properties.setProperty("mail.smtp.host", host);

        Session session = Session.getDefaultInstance(properties); // default session
        try {
            MimeMessage message = new MimeMessage(session); // email message
            message.setFrom(new InternetAddress(from)); // setting header fields
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Test Subject"); // subject line
            message.setText("TEXT of test message");
            Transport.send(message);
            System.out.println("Email Sent successfully....");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}

//Need https://github.com/Nilhcem/FakeSMTP
