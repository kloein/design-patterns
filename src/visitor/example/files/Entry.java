package visitor.example.files;


import visitor.example.exception.FileTreatMentException;

public abstract class Entry implements Element{
    public abstract String getName();

    public abstract int getSize();

    public Composite.example.Entry add(Composite.example.Entry entry)throws FileTreatMentException {
        throw new FileTreatMentException();
    }

    public String toString() {
        return getName()+"("+getSize()+")";
    }
}
