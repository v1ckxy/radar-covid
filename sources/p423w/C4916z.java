package p423w;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p119o.p120a.C0967p0;
import p392u.p401r.p403c.C4638h;

/* renamed from: w.z */
public final class C4916z extends C4883b {

    /* renamed from: l */
    public final Logger f11713l;

    /* renamed from: m */
    public final Socket f11714m;

    public C4916z(Socket socket) {
        if (socket != null) {
            this.f11714m = socket;
            this.f11713l = Logger.getLogger("okio.Okio");
            return;
        }
        C4638h.m10271a("socket");
        throw null;
    }

    /* renamed from: b */
    public IOException mo11265b(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* renamed from: h */
    public void mo11159h() {
        StringBuilder sb;
        Level level;
        Logger logger;
        String str = "Failed to close timed out socket ";
        try {
            this.f11714m.close();
            return;
        } catch (Exception e) {
            logger = this.f11713l;
            level = Level.WARNING;
            sb = new StringBuilder();
            r1 = e;
        } catch (AssertionError e2) {
            if (C0967p0.m2208a(e2)) {
                logger = this.f11713l;
                level = Level.WARNING;
                sb = new StringBuilder();
                r1 = e2;
            } else {
                throw e2;
            }
        }
        sb.append(str);
        sb.append(this.f11714m);
        logger.log(level, sb.toString(), r1);
    }
}
