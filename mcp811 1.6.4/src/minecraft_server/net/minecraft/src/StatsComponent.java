package net.minecraft.src;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.text.DecimalFormat;
import javax.swing.JComponent;
import javax.swing.Timer;
import net.minecraft.server.MinecraftServer;

public class StatsComponent extends JComponent
{
    private static final DecimalFormat field_120040_a = new DecimalFormat("########0.000");
    private int[] field_120038_b = new int[256];
    private int field_120039_c;
    private String[] field_120036_d = new String[11];
    private final MinecraftServer field_120037_e;

    public StatsComponent(MinecraftServer par1MinecraftServer)
    {
        this.field_120037_e = par1MinecraftServer;
        this.setPreferredSize(new Dimension(456, 246));
        this.setMinimumSize(new Dimension(456, 246));
        this.setMaximumSize(new Dimension(456, 246));
        (new Timer(500, new StatsComponentINNER1(this))).start();
        this.setBackground(Color.BLACK);
    }

    private void func_120034_a()
    {
        long var1 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.gc();
        this.field_120036_d[0] = "Memory use: " + var1 / 1024L / 1024L + " mb (" + Runtime.getRuntime().freeMemory() * 100L / Runtime.getRuntime().maxMemory() + "% free)";
        this.field_120036_d[1] = "Threads: " + TcpConnection.field_74471_a.get() + " + " + TcpConnection.field_74469_b.get();
        this.field_120036_d[2] = "Avg tick: " + field_120040_a.format(this.func_120035_a(this.field_120037_e.tickTimeArray) * 1.0E-6D) + " ms";
        this.field_120036_d[3] = "Avg sent: " + (int)this.func_120035_a(this.field_120037_e.sentPacketCountArray) + ", Avg size: " + (int)this.func_120035_a(this.field_120037_e.sentPacketSizeArray);
        this.field_120036_d[4] = "Avg rec: " + (int)this.func_120035_a(this.field_120037_e.receivedPacketCountArray) + ", Avg size: " + (int)this.func_120035_a(this.field_120037_e.receivedPacketSizeArray);

        if (this.field_120037_e.worldServers != null)
        {
            for (int var3 = 0; var3 < this.field_120037_e.worldServers.length; ++var3)
            {
                this.field_120036_d[5 + var3] = "Lvl " + var3 + " tick: " + field_120040_a.format(this.func_120035_a(this.field_120037_e.timeOfLastDimensionTick[var3]) * 1.0E-6D) + " ms";

                if (this.field_120037_e.worldServers[var3] != null && this.field_120037_e.worldServers[var3].theChunkProviderServer != null)
                {
                    this.field_120036_d[5 + var3] = this.field_120036_d[5 + var3] + ", " + this.field_120037_e.worldServers[var3].theChunkProviderServer.makeString();
                    this.field_120036_d[5 + var3] = this.field_120036_d[5 + var3] + ", Vec3: " + this.field_120037_e.worldServers[var3].getWorldVec3Pool().func_82590_d() + " / " + this.field_120037_e.worldServers[var3].getWorldVec3Pool().getPoolSize();
                }
            }
        }

        double var5 = 12500.0D;
        this.field_120038_b[this.field_120039_c++ & 255] = (int)(this.func_120035_a(this.field_120037_e.sentPacketSizeArray) * 100.0D / 12500.0D);
        this.repaint();
    }

    private double func_120035_a(long[] par1ArrayOfLong)
    {
        long var2 = 0L;

        for (int var4 = 0; var4 < par1ArrayOfLong.length; ++var4)
        {
            var2 += par1ArrayOfLong[var4];
        }

        return (double)var2 / (double)par1ArrayOfLong.length;
    }

    public void paint(Graphics par1Graphics)
    {
        par1Graphics.setColor(new Color(16777215));
        par1Graphics.fillRect(0, 0, 456, 246);
        int var2;

        for (var2 = 0; var2 < 256; ++var2)
        {
            int var3 = this.field_120038_b[var2 + this.field_120039_c & 255];
            par1Graphics.setColor(new Color(var3 + 28 << 16));
            par1Graphics.fillRect(var2, 100 - var3, 1, var3);
        }

        par1Graphics.setColor(Color.BLACK);

        for (var2 = 0; var2 < this.field_120036_d.length; ++var2)
        {
            String var4 = this.field_120036_d[var2];

            if (var4 != null)
            {
                par1Graphics.drawString(var4, 32, 116 + var2 * 16);
            }
        }
    }

    static void func_120033_a(StatsComponent par0StatsComponent)
    {
        par0StatsComponent.func_120034_a();
    }
}
