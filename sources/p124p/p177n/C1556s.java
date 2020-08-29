package p124p.p177n;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: p.n.s */
public abstract class C1556s {

    /* renamed from: a */
    public final Map<String, Object> f4577a = new HashMap();

    /* renamed from: a */
    public final void mo6251a() {
        Map<String, Object> map = this.f4577a;
        if (map != null) {
            synchronized (map) {
                for (Object next : this.f4577a.values()) {
                    if (next instanceof Closeable) {
                        try {
                            ((Closeable) next).close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
        mo6184b();
    }

    /* renamed from: b */
    public void mo6184b() {
    }
}
