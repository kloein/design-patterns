package builder.example.builder;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder{
    private String filename;
    private PrintWriter printWriter;
    @Override
    public void makeTitle(String title) {
        filename=title+".html";
        try {
            printWriter=new PrintWriter(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printWriter.println("<html><head><title>"+title+"</title></head><body>");
        printWriter.println("<h1>"+title+"</h1>");
    }

    @Override
    public void makeString(String str) {
        printWriter.println("<p>"+str+"</p>");
    }

    @Override
    public void makeItems(String[] items) {
        printWriter.println("<ul>");
        for (String item : items) {
            printWriter.println("<li>"+item+"</li>");
        }
        printWriter.println("</ul>");
    }

    @Override
    public void close() {
        printWriter.println("</body></html>");
        printWriter.close();
    }

    public String getResult() {
        return filename;
    }
}
