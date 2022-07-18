package chain_of_responsibility.example.support;

import chain_of_responsibility.example.Trouble;

public class OddSupport extends Support{
    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) {
            return true;
        }
        return false;
    }
}
