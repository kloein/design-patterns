package state.example;

import state.example.state.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener,Context {
    private TextField textClock = new TextField(60);
    private TextArea textScreen = new TextArea(10, 60);
    private Button buttonUse = new Button("Use");
    private Button buttonAlarm = new Button("Alarm");
    private Button buttonPhone = new Button("Call");
    private Button buttonExit = new Button("Exit");
    private State state = DayState.getInstance();
    //���Բ�������ǰ��ҳ������ôʵ�ֵ�
    public SafeFrame(String title) throws HeadlessException {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);
        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        add(panel, BorderLayout.SOUTH);
        pack();
        show();
        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    //����ʱ��
    @Override
    public void setClock(int hour) {
        String clockString = "����ʱ���ǣ�";
        if (hour < 10) {
            clockString += "0" + hour + ":00";
        } else {
            clockString += hour + ":00";
        }
        System.out.println(clockString);
        textClock.setText(clockString);
        state.doClock(this, hour);
    }

    //�ı�״̬
    @Override
    public void changeState(State state) {
        System.out.println("��" + this.state + "״̬��Ϊ��" + state + "״̬��");
        this.state = state;
    }

    //��ϵ��������
    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call! " + msg + "\n");
    }

    //�ھ����������¼�¼
    @Override
    public void recordLog(String msg) {
        textScreen.append("recode ... " + msg + "\n");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if (e.getSource() == buttonUse) {
            state.doUse(this);
        } else if (e.getSource() == buttonAlarm) {
            state.doAlarm(this);
        } else if (e.getSource() == buttonPhone) {
            state.doPhone(this);
        } else if (e.getSource() == buttonExit) {
            System.exit(0);
        } else {
            System.out.println("?");
        }
    }
}
