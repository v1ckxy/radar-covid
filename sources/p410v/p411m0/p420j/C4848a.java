package p410v.p411m0.p420j;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: v.m0.j.a */
public final class C4848a extends ProxySelector {

    /* renamed from: a */
    public static final C4848a f11562a = new C4848a();

    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    public List<Proxy> select(URI uri) {
        if (uri != null) {
            return C2286e.m5332e(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
