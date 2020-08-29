package p124p.p170k.p171a;

import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p177n.C1556s;
import p124p.p177n.C1557t;
import p124p.p177n.C1559v;

/* renamed from: p.k.a.p */
public class C1507p extends C1556s {

    /* renamed from: h */
    public static final C1557t f4437h = new C1508a();

    /* renamed from: b */
    public final HashSet<Fragment> f4438b = new HashSet<>();

    /* renamed from: c */
    public final HashMap<String, C1507p> f4439c = new HashMap<>();

    /* renamed from: d */
    public final HashMap<String, C1559v> f4440d = new HashMap<>();

    /* renamed from: e */
    public final boolean f4441e;

    /* renamed from: f */
    public boolean f4442f = false;

    /* renamed from: g */
    public boolean f4443g = false;

    /* renamed from: p.k.a.p$a */
    public static class C1508a implements C1557t {
        /* renamed from: a */
        public <T extends C1556s> T mo6188a(Class<T> cls) {
            return new C1507p(true);
        }
    }

    public C1507p(boolean z) {
        this.f4441e = z;
    }

    /* renamed from: a */
    public boolean mo6183a(Fragment fragment) {
        if (!this.f4438b.contains(fragment)) {
            return true;
        }
        return this.f4441e ? this.f4442f : !this.f4443g;
    }

    /* renamed from: b */
    public void mo6184b() {
        if (C1490k.f4368K) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        this.f4442f = true;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C1507p.class != obj.getClass()) {
            return false;
        }
        C1507p pVar = (C1507p) obj;
        if (!this.f4438b.equals(pVar.f4438b) || !this.f4439c.equals(pVar.f4439c) || !this.f4440d.equals(pVar.f4440d)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f4440d.hashCode() + ((this.f4439c.hashCode() + (this.f4438b.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f4438b.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            str = Objects.ARRAY_ELEMENT_SEPARATOR;
            if (!hasNext) {
                break;
            }
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f4439c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f4440d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
