package builder.example;

import builder.example.builder.HTMLBuilder;
import builder.example.builder.TextBuilder;

public class Main {
    public static void main(String[] args) {
        //普通文本
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String result0 = textBuilder.getResult();
        System.out.println("普通文本:"+result0);
        //html
        HTMLBuilder htmlBuilder = new HTMLBuilder();
        director=new Director(htmlBuilder);
        director.construct();
        String result1 = htmlBuilder.getResult();
        System.out.println("html:"+result1);
    }
}
