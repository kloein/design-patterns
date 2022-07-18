package facade.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailAddress, String filename) {
        try {
            Properties properties = Database.getProperties("./src/facade/example/data");
            String username = properties.getProperty(mailAddress);
            HtmlWriter htmlWriter = new HtmlWriter(new FileWriter(filename));
            htmlWriter.title("Welcome to "+username+"'s page");
            htmlWriter.paragraph(username+"��ӭ����"+username+"����ҳ");
            htmlWriter.paragraph("�ȴ�����ʼ�");
            htmlWriter.mailto(mailAddress, username);
            htmlWriter.close();
            System.out.println(filename+"is created for "+mailAddress+"("+username+")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
