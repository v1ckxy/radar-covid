package p213q.p217b.p317d.p318f.p319a;

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p251g.p256e.C2462h;
import p213q.p217b.p218a.p231b.p259h.p260a.C2889a;
import p213q.p217b.p317d.C3857a;
import p213q.p217b.p317d.C3859c;
import p213q.p217b.p317d.p318f.p319a.C3867a.C3868a;
import p213q.p217b.p317d.p318f.p319a.C3867a.C3869b;
import p213q.p217b.p317d.p318f.p319a.p320c.C3872a;
import p213q.p217b.p317d.p318f.p319a.p320c.C3875d;
import p213q.p217b.p317d.p318f.p319a.p320c.C3877f;
import p213q.p217b.p317d.p345j.C4209d;

/* renamed from: q.b.d.f.a.b */
public class C3870b implements C3867a {

    /* renamed from: c */
    public static volatile C3867a f9478c;

    /* renamed from: a */
    public final C2889a f9479a;

    /* renamed from: b */
    public final Map<String, Object> f9480b = new ConcurrentHashMap();

    /* renamed from: q.b.d.f.a.b$a */
    public class C3871a implements C3868a {
        public C3871a(C3870b bVar, String str) {
        }
    }

    public C3870b(C2889a aVar) {
        C1061o.m2524b(aVar);
        this.f9479a = aVar;
    }

    /* renamed from: a */
    public static C3867a m9245a(C3859c cVar, Context context, C4209d dVar) {
        C1061o.m2524b(cVar);
        C1061o.m2524b(context);
        C1061o.m2524b(dVar);
        C1061o.m2524b(context.getApplicationContext());
        if (f9478c == null) {
            synchronized (C3870b.class) {
                if (f9478c == null) {
                    Bundle bundle = new Bundle(1);
                    if (cVar.mo10060e()) {
                        dVar.mo10095a(C3857a.class, C3878d.f9495e, C3879e.f9496a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", cVar.mo10059d());
                    }
                    f9478c = new C3870b(C2462h.m5876a(context, null, null, null, bundle).f6558d);
                }
            }
        }
        return f9478c;
    }

    /* renamed from: a */
    public void mo10071a(String str, String str2, Bundle bundle) {
        boolean z;
        String str3;
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C3872a.m9248a(str)) {
            boolean z2 = true;
            if (!C3872a.f9482b.contains(str2)) {
                Iterator it = C3872a.f9484d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (bundle.containsKey((String) it.next())) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
            }
            if (z) {
                if ("_cmp".equals(str2)) {
                    if (C3872a.m9248a(str)) {
                        Iterator it2 = C3872a.f9484d.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (bundle.containsKey((String) it2.next())) {
                                    break;
                                }
                            } else {
                                char c = 65535;
                                int hashCode = str.hashCode();
                                if (hashCode != 101200) {
                                    if (hashCode != 101230) {
                                        if (hashCode == 3142703 && str.equals("fiam")) {
                                            c = 2;
                                        }
                                    } else if (str.equals("fdl")) {
                                        c = 1;
                                    }
                                } else if (str.equals("fcm")) {
                                    c = 0;
                                }
                                if (c == 0) {
                                    str3 = "fcm_integration";
                                } else if (c == 1) {
                                    str3 = "fdl_integration";
                                } else if (c == 2) {
                                    str3 = "fiam_integration";
                                }
                                bundle.putString("_cis", str3);
                            }
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    if ("clx".equals(str) && "_ae".equals(str2)) {
                        bundle.putLong("_r", 1);
                    }
                    this.f9479a.f7111a.mo7689a(str, str2, bundle);
                }
            }
        }
    }

    /* renamed from: a */
    public C3868a mo10070a(String str, C3869b bVar) {
        C1061o.m2524b(bVar);
        if (!C3872a.m9248a(str)) {
            return null;
        }
        if (!str.isEmpty() && this.f9480b.containsKey(str) && this.f9480b.get(str) != null) {
            return null;
        }
        C2889a aVar = this.f9479a;
        Object obj = "fiam".equals(str) ? new C3875d(aVar, bVar) : ("crash".equals(str) || "clx".equals(str)) ? new C3877f(aVar, bVar) : null;
        if (obj == null) {
            return null;
        }
        this.f9480b.put(str, obj);
        return new C3871a(this, str);
    }
}
