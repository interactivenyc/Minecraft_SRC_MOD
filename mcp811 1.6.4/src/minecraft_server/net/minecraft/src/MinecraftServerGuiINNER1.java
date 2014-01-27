package net.minecraft.src;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

final class MinecraftServerGuiINNER1 extends WindowAdapter
{
    final DedicatedServer field_120023_a;

    MinecraftServerGuiINNER1(DedicatedServer par1DedicatedServer)
    {
        this.field_120023_a = par1DedicatedServer;
    }

    public void windowClosing(WindowEvent par1WindowEvent)
    {
        this.field_120023_a.initiateShutdown();

        while (!this.field_120023_a.isServerStopped())
        {
            try
            {
                Thread.sleep(100L);
            }
            catch (InterruptedException var3)
            {
                var3.printStackTrace();
            }
        }

        System.exit(0);
    }
}
