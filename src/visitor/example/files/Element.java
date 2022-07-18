package visitor.example.files;

import visitor.example.visitor.Visitor;

public interface Element {
    public abstract void accept(Visitor v);
}
