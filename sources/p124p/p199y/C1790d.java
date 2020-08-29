package p124p.p199y;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* renamed from: p.y.d */
public final class C1790d {

    /* renamed from: a */
    public final Set<C1791a> f5260a = new HashSet();

    /* renamed from: p.y.d$a */
    public static final class C1791a {

        /* renamed from: a */
        public final Uri f5261a;

        /* renamed from: b */
        public final boolean f5262b;

        public C1791a(Uri uri, boolean z) {
            this.f5261a = uri;
            this.f5262b = z;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C1791a.class != obj.getClass()) {
                return false;
            }
            C1791a aVar = (C1791a) obj;
            if (this.f5262b != aVar.f5262b || !this.f5261a.equals(aVar.f5261a)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (this.f5261a.hashCode() * 31) + (this.f5262b ? 1 : 0);
        }
    }

    /* renamed from: a */
    public int mo6769a() {
        return this.f5260a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1790d.class != obj.getClass()) {
            return false;
        }
        return this.f5260a.equals(((C1790d) obj).f5260a);
    }

    public int hashCode() {
        return this.f5260a.hashCode();
    }
}
