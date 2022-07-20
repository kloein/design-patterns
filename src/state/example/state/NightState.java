package state.example.state;

import state.example.Context;

public class NightState implements State{
    private static NightState singleton=new NightState();

    private NightState() {
    }

    public static NightState getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("����������ʹ�ý�⣡");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("���¾��壨���ϣ�");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("���ϵĵ绰¼��");
    }

    public String toString() {
        return "[����]";
    }
}
