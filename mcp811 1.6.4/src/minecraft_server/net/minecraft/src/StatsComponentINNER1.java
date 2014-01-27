package net.minecraft.src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class StatsComponentINNER1 implements ActionListener
{
    final StatsComponent field_120030_a;

    StatsComponentINNER1(StatsComponent par1StatsComponent)
    {
        this.field_120030_a = par1StatsComponent;
    }

    public void actionPerformed(ActionEvent par1ActionEvent)
    {
        StatsComponent.func_120033_a(this.field_120030_a);
    }
}
