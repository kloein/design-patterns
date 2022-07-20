package mediator.example.colleague;

import mediator.example.Mediator;

public interface Colleague {
    public abstract void setMediator(Mediator mediator);
    public abstract void setColleagueEnabled(Boolean enabled);
}
