package decorator.example.border;

import decorator.example.Display;

public class FullBorder extends Border{
    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 2+display.getColumns();
    }

    @Override
    public int getRows() {
        return 2+display.getRows();
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == display.getRows() + 1) {
            return "+"+makeLine('-', display.getColumns())+"+";
        }
        return "|"+display.getRowText(row-1)+"|";
    }

    private String makeLine(char c,int count) {
        StringBuffer s=new StringBuffer();
        for (int i = 0; i < count; i++) {
            s.append(c);
        }
        return s.toString();
    }
}
