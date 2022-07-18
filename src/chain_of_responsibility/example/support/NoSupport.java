package chain_of_responsibility.example.support;

import chain_of_responsibility.example.Trouble;

public class NoSupport extends Support{
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
