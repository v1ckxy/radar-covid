package p213q.p217b.p218a.p231b.p251g.p256e;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p124p.p143e.C1248a;

/* renamed from: q.b.a.b.g.e.k2 */
public final class C2525k2 implements C2646r1 {

    /* renamed from: f */
    public static final Map<String, C2525k2> f6675f = new C1248a();

    /* renamed from: a */
    public final SharedPreferences f6676a;

    /* renamed from: b */
    public final OnSharedPreferenceChangeListener f6677b = new C2508j2(this);

    /* renamed from: c */
    public final Object f6678c = new Object();

    /* renamed from: d */
    public volatile Map<String, ?> f6679d;

    /* renamed from: e */
    public final List<C2662s1> f6680e = new ArrayList();

    public C2525k2(SharedPreferences sharedPreferences) {
        this.f6676a = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.f6677b);
    }

    /* renamed from: a */
    public static C2525k2 m6067a(Context context, String str) {
        C2525k2 k2Var;
        SharedPreferences sharedPreferences;
        boolean z = true;
        if (C2541l1.m6100a() && !str.startsWith("direct_boot:") && C2541l1.m6100a() && !C2541l1.m6101a(context)) {
            z = false;
        }
        if (!z) {
            return null;
        }
        synchronized (C2525k2.class) {
            k2Var = (C2525k2) f6675f.get(str);
            if (k2Var == null) {
                ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        if (C2541l1.m6100a()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                    } else {
                        sharedPreferences = context.getSharedPreferences(str, 0);
                    }
                    k2Var = new C2525k2(sharedPreferences);
                    f6675f.put(str, k2Var);
                } finally {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                }
            }
        }
        return k2Var;
    }

    /* renamed from: b */
    public static synchronized void m6068b() {
        synchronized (C2525k2.class) {
            for (C2525k2 k2Var : f6675f.values()) {
                k2Var.f6676a.unregisterOnSharedPreferenceChangeListener(k2Var.f6677b);
            }
            f6675f.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Object mo7817a(String str) {
        Map<String, ?> map = this.f6679d;
        if (map == null) {
            synchronized (this.f6678c) {
                map = this.f6679d;
                if (map == null) {
                    ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.f6676a.getAll();
                        this.f6679d = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo7818a() {
        synchronized (this.f6678c) {
            this.f6679d = null;
            C2758y1.f6981j.incrementAndGet();
        }
        synchronized (this) {
            for (C2662s1 a : this.f6680e) {
                a.mo7997a();
            }
        }
    }
}
