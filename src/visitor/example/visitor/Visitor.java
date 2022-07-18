package visitor.example.visitor;

import visitor.example.files.Directory;
import visitor.example.files.File;

public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
