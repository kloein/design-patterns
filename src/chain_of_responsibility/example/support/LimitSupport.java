package chain_of_responsibility.example.support;

import chain_of_responsibility.example.Trouble;

public class LimitSupport extends Support{
    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit) {
            return true;
        }
        return false;
    }
}
