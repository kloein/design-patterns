package visitor.example.visitor;

import visitor.example.files.Directory;
import visitor.example.files.Entry;
import visitor.example.files.File;

import java.util.Iterator;

public class ListVisitor extends Visitor{
    private String currentDir="";
    @Override
    public void visit(File file) {
        System.out.println(currentDir+"/"+file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir+"/"+directory);
        String savedDir=currentDir;
        currentDir=currentDir+"/"+directory.getName();
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry next = (Entry)iterator.next();
            next.accept(this);
        }
        currentDir=savedDir;
    }
}
