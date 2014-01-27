package net.minecraft.src;

import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import javax.swing.JTextArea;

public class TextAreaLogHandler extends Handler
{
    private int[] field_120027_b = new int[1024];
    private int field_120028_c;
    Formatter field_120029_a = new TextAreaLogHandlerINNER1(this);
    private JTextArea field_120026_d;

    public TextAreaLogHandler(JTextArea par1JTextArea)
    {
        this.setFormatter(this.field_120029_a);
        this.field_120026_d = par1JTextArea;
    }

    public void close() {}

    public void flush() {}

    public void publish(LogRecord par1LogRecord)
    {
        int var2 = this.field_120026_d.getDocument().getLength();
        this.field_120026_d.append(this.field_120029_a.format(par1LogRecord));
        this.field_120026_d.setCaretPosition(this.field_120026_d.getDocument().getLength());
        int var3 = this.field_120026_d.getDocument().getLength() - var2;

        if (this.field_120027_b[this.field_120028_c] != 0)
        {
            this.field_120026_d.replaceRange("", 0, this.field_120027_b[this.field_120028_c]);
        }

        this.field_120027_b[this.field_120028_c] = var3;
        this.field_120028_c = (this.field_120028_c + 1) % 1024;
    }
}
