package p425x.p472b.p473a.p474a.p476l;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import p124p.p186s.p187a.C1662a;
import p124p.p186s.p187a.C1662a.C1665c;
import p124p.p186s.p187a.C1662a.C1666d;
import p124p.p186s.p187a.C1667b;
import p425x.p472b.p473a.p474a.p476l.p481o.C5243a;

/* renamed from: x.b.a.a.l.i */
public class C5203i {

    /* renamed from: b */
    public static C5203i f12417b;

    /* renamed from: a */
    public SharedPreferences f12418a;

    /* renamed from: x.b.a.a.l.i$a */
    public static class C5204a {

        /* renamed from: a */
        public int f12419a;

        /* renamed from: b */
        public String f12420b;

        /* renamed from: c */
        public int f12421c;

        public C5204a(int i, String str, int i2) {
            this.f12419a = i;
            this.f12420b = str;
            this.f12421c = i2;
        }

        /* renamed from: a */
        public boolean mo11949a() {
            return this.f12421c == 1;
        }
    }

    /* renamed from: x.b.a.a.l.i$b */
    public static class C5205b extends ArrayList<C5204a> {
    }

    public C5203i(Context context) {
        try {
            this.f12418a = C1662a.m4206a("dp3t_pendingkeyupload_store", C1667b.m4214a(C1667b.f4921a), context, C1665c.AES256_SIV, C1666d.AES256_GCM);
        } catch (IOException | GeneralSecurityException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static synchronized C5203i m11644a(Context context) {
        C5203i iVar;
        synchronized (C5203i.class) {
            if (f12417b == null) {
                f12417b = new C5203i(context);
            }
            iVar = f12417b;
        }
        return iVar;
    }

    /* renamed from: a */
    public final C5205b mo11945a() {
        return (C5205b) C5243a.m11694a(this.f12418a.getString("pendingKeys", "[]"), C5205b.class);
    }

    /* renamed from: a */
    public void mo11946a(C5204a aVar) {
        synchronized (this) {
            C5205b a = mo11945a();
            a.add(aVar);
            mo11947a(a);
        }
    }

    /* renamed from: a */
    public final void mo11947a(C5205b bVar) {
        Collections.sort(bVar, C5194c.f12411e);
        this.f12418a.edit().putString("pendingKeys", C5243a.m11696a(bVar)).apply();
    }

    /* renamed from: b */
    public C5204a mo11948b() {
        synchronized (this) {
            C5205b a = mo11945a();
            if (a.size() <= 0) {
                return null;
            }
            C5204a aVar = (C5204a) a.remove(0);
            mo11947a(a);
            return aVar;
        }
    }
}
