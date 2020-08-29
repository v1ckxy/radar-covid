package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import p124p.p177n.C1536d;
import p124p.p177n.C1537e.C1538a;
import p124p.p177n.C1542h;
import p124p.p177n.C1543i;
import p124p.p185r.C1657a;
import p124p.p185r.C1657a.C1658a;
import p124p.p185r.C1661c;
import p213q.p214a.p215a.p216a.C1965a;

@SuppressLint({"RestrictedApi"})
public final class Recreator implements C1536d {

    /* renamed from: a */
    public final C1661c f915a;

    public Recreator(C1661c cVar) {
        this.f915a = cVar;
    }

    /* renamed from: a */
    public void mo9a(C1542h hVar, C1538a aVar) {
        if (aVar == C1538a.ON_CREATE) {
            ((C1543i) hVar.mo2g()).f4558a.remove(this);
            C1657a j = this.f915a.mo4j();
            String str = "androidx.savedstate.Restarter";
            if (j.f4894c) {
                Bundle bundle = j.f4893b;
                Bundle bundle2 = null;
                if (bundle != null) {
                    Bundle bundle3 = bundle.getBundle(str);
                    j.f4893b.remove(str);
                    if (j.f4893b.isEmpty()) {
                        j.f4893b = null;
                    }
                    bundle2 = bundle3;
                }
                if (bundle2 != null) {
                    ArrayList stringArrayList = bundle2.getStringArrayList("classes_to_restore");
                    if (stringArrayList != null) {
                        Iterator it = stringArrayList.iterator();
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            try {
                                Class asSubclass = Class.forName(str2, false, Recreator.class.getClassLoader()).asSubclass(C1658a.class);
                                try {
                                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                    declaredConstructor.setAccessible(true);
                                    try {
                                        ((C1658a) declaredConstructor.newInstance(new Object[0])).mo6459a(this.f915a);
                                    } catch (Exception e) {
                                        throw new RuntimeException(C1965a.m4751a("Failed to instantiate ", str2), e);
                                    }
                                } catch (NoSuchMethodException e2) {
                                    StringBuilder a = C1965a.m4756a("Class");
                                    a.append(asSubclass.getSimpleName());
                                    a.append(" must have default constructor in order to be automatically recreated");
                                    throw new IllegalStateException(a.toString(), e2);
                                }
                            } catch (ClassNotFoundException e3) {
                                throw new RuntimeException(C1965a.m4752a("Class ", str2, " wasn't found"), e3);
                            }
                        }
                        return;
                    }
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                return;
            }
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
