package y8;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class i extends x8.d {

    /* renamed from: n  reason: collision with root package name */
    public final Socket f6995n;

    public i(Socket socket) {
        this.f6995n = socket;
    }

    @Override // x8.d
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // x8.d
    public final void k() {
        Socket socket = this.f6995n;
        try {
            socket.close();
        } catch (AssertionError e9) {
            if (!m.a(e9)) {
                throw e9;
            }
            Logger logger = m.f7022a;
            Level level = Level.WARNING;
            logger.log(level, "Failed to close timed out socket " + socket, (Throwable) e9);
        } catch (Exception e10) {
            Logger logger2 = m.f7022a;
            Level level2 = Level.WARNING;
            logger2.log(level2, "Failed to close timed out socket " + socket, (Throwable) e10);
        }
    }
}
