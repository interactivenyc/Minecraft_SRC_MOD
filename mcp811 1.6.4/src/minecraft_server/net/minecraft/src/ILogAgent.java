package net.minecraft.src;

import java.util.logging.Logger;

public interface ILogAgent
{
    Logger func_120013_a();

    /**
     * Logs plain text message.
     */
    void logInfo(String var1);

    /**
     * Logs text as warning.
     */
    void logWarning(String var1);

    void logWarningFormatted(String var1, Object ... var2);

    void logWarningException(String var1, Throwable var2);

    void logSevere(String var1);

    void logSevereException(String var1, Throwable var2);
}
