package visitor.example.files;


import visitor.example.exception.FileTreatMentException;

public abstract class Entry implements Element{
    public abstract String getName();

    public abstract int getSize();

    public composite.example.Entry add(composite.example.Entry entry)throws FileTreatMentException {
        throw new FileTreatMentException();
    }

    public String toString() {
        return getName()+"("+getSize()+")";
    }
}
