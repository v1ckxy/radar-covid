package p124p.p185r;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry$1;
import java.util.Map.Entry;
import p124p.p137c.p138a.p140b.C1235b.C1239d;
import p124p.p177n.C1537e;
import p124p.p177n.C1537e.C1539b;
import p124p.p177n.C1543i;
import p124p.p185r.C1657a.C1659b;

/* renamed from: p.r.b */
public final class C1660b {

    /* renamed from: a */
    public final C1661c f4896a;

    /* renamed from: b */
    public final C1657a f4897b = new C1657a();

    public C1660b(C1661c cVar) {
        this.f4896a = cVar;
    }

    /* renamed from: a */
    public void mo6461a(Bundle bundle) {
        C1537e g = this.f4896a.mo2g();
        if (((C1543i) g).f4559b == C1539b.INITIALIZED) {
            g.mo6227a(new Recreator(this.f4896a));
            C1657a aVar = this.f4897b;
            if (!aVar.f4894c) {
                if (bundle != null) {
                    aVar.f4893b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
                g.mo6227a(new SavedStateRegistry$1(aVar));
                aVar.f4894c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* renamed from: b */
    public void mo6462b(Bundle bundle) {
        C1657a aVar = this.f4897b;
        if (aVar != null) {
            Bundle bundle2 = new Bundle();
            Bundle bundle3 = aVar.f4893b;
            if (bundle3 != null) {
                bundle2.putAll(bundle3);
            }
            C1239d c = aVar.f4892a.mo5415c();
            while (c.hasNext()) {
                Entry entry = (Entry) c.next();
                bundle2.putBundle((String) entry.getKey(), ((C1659b) entry.getValue()).mo6460a());
            }
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
            return;
        }
        throw null;
    }
}
