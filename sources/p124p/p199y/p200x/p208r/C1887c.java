package p124p.p199y.p200x.p208r;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p124p.p199y.C1796h;
import p124p.p199y.C1800l;
import p124p.p199y.p200x.C1823b;
import p124p.p199y.p200x.C1842l;
import p124p.p199y.p200x.p205q.C1863c;
import p124p.p199y.p200x.p205q.C1864d;
import p124p.p199y.p200x.p209s.C1913p;
import p124p.p199y.p200x.p210t.C1941k;
import p124p.p199y.p200x.p210t.p212q.C1962a;
import p124p.p199y.p200x.p210t.p212q.C1963b;

/* renamed from: p.y.x.r.c */
public class C1887c implements C1863c, C1823b {

    /* renamed from: p */
    public static final String f5491p = C1800l.m4459a("SystemFgDispatcher");

    /* renamed from: e */
    public Context f5492e;

    /* renamed from: f */
    public C1842l f5493f;

    /* renamed from: g */
    public final C1962a f5494g;

    /* renamed from: h */
    public final Object f5495h = new Object();

    /* renamed from: i */
    public String f5496i;

    /* renamed from: j */
    public C1796h f5497j;

    /* renamed from: k */
    public final Map<String, C1796h> f5498k;

    /* renamed from: l */
    public final Map<String, C1913p> f5499l;

    /* renamed from: m */
    public final Set<C1913p> f5500m;

    /* renamed from: n */
    public final C1864d f5501n;

    /* renamed from: o */
    public C1888a f5502o;

    /* renamed from: p.y.x.r.c$a */
    public interface C1888a {
        /* renamed from: a */
        void mo1486a(int i);

        /* renamed from: a */
        void mo1487a(int i, int i2, Notification notification);

        /* renamed from: a */
        void mo1488a(int i, Notification notification);

        void stop();
    }

    public C1887c(Context context) {
        this.f5492e = context;
        C1842l a = C1842l.m4517a(this.f5492e);
        this.f5493f = a;
        this.f5494g = a.f5351d;
        this.f5496i = null;
        this.f5497j = null;
        this.f5498k = new LinkedHashMap();
        this.f5500m = new HashSet();
        this.f5499l = new HashMap();
        this.f5501n = new C1864d(this.f5492e, this.f5494g, this);
        this.f5493f.f5353f.mo6798a((C1823b) this);
    }

    /* renamed from: a */
    public final void mo6878a(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C1800l.m4460a().mo6782a(f5491p, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", new Object[]{Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)}), new Throwable[0]);
        if (notification != null && this.f5502o != null) {
            this.f5498k.put(stringExtra, new C1796h(intExtra, notification, intExtra2));
            if (TextUtils.isEmpty(this.f5496i)) {
                this.f5496i = stringExtra;
                this.f5502o.mo1487a(intExtra, intExtra2, notification);
                return;
            }
            this.f5502o.mo1488a(intExtra, notification);
            if (intExtra2 != 0 && VERSION.SDK_INT >= 29) {
                for (Entry value : this.f5498k.entrySet()) {
                    i |= ((C1796h) value.getValue()).f5276b;
                }
                C1796h hVar = (C1796h) this.f5498k.get(this.f5496i);
                if (hVar != null) {
                    this.f5502o.mo1487a(hVar.f5275a, i, hVar.f5277c);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo1499b(List<String> list) {
    }

    /* renamed from: a */
    public void mo1498a(List<String> list) {
        if (!list.isEmpty()) {
            for (String str : list) {
                C1800l.m4460a().mo6782a(f5491p, String.format("Constraints unmet for WorkSpec %s", new Object[]{str}), new Throwable[0]);
                C1842l lVar = this.f5493f;
                C1962a aVar = lVar.f5351d;
                ((C1963b) aVar).f5626a.execute(new C1941k(lVar, str, true));
            }
        }
    }

    /* renamed from: a */
    public void mo6877a() {
        this.f5502o = null;
        synchronized (this.f5495h) {
            this.f5501n.mo6853a();
        }
        this.f5493f.f5353f.mo6801b((C1823b) this);
    }

    /* renamed from: a */
    public void mo1480a(String str, boolean z) {
        C1888a aVar;
        C1796h hVar;
        Entry entry;
        synchronized (this.f5495h) {
            C1913p pVar = (C1913p) this.f5499l.remove(str);
            if (pVar != null ? this.f5500m.remove(pVar) : false) {
                this.f5501n.mo6854a((Iterable<C1913p>) this.f5500m);
            }
        }
        this.f5497j = (C1796h) this.f5498k.remove(str);
        if (!str.equals(this.f5496i)) {
            hVar = this.f5497j;
            if (hVar != null) {
                aVar = this.f5502o;
                if (aVar == null) {
                    return;
                }
            } else {
                return;
            }
        } else if (this.f5498k.size() > 0) {
            Iterator it = this.f5498k.entrySet().iterator();
            do {
                entry = (Entry) it.next();
            } while (it.hasNext());
            this.f5496i = (String) entry.getKey();
            if (this.f5502o != null) {
                hVar = (C1796h) entry.getValue();
                this.f5502o.mo1487a(hVar.f5275a, hVar.f5276b, hVar.f5277c);
                aVar = this.f5502o;
            } else {
                return;
            }
        } else {
            return;
        }
        aVar.mo1486a(hVar.f5275a);
    }
}
