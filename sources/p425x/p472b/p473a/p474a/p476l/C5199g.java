package p425x.p472b.p473a.p474a.p476l;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.dpppt.android.sdk.models.DayDate;
import org.dpppt.android.sdk.models.ExposureDay;
import p124p.p186s.p187a.C1662a;
import p124p.p186s.p187a.C1662a.C1665c;
import p124p.p186s.p187a.C1662a.C1666d;
import p124p.p186s.p187a.C1667b;
import p425x.p472b.p473a.p474a.p476l.p481o.C5243a;

/* renamed from: x.b.a.a.l.g */
public class C5199g {

    /* renamed from: b */
    public static C5199g f12415b;

    /* renamed from: a */
    public SharedPreferences f12416a;

    /* renamed from: x.b.a.a.l.g$b */
    public static class C5201b extends ArrayList<ExposureDay> {
        public C5201b() {
        }

        public /* synthetic */ C5201b(C5200a aVar) {
        }
    }

    public C5199g(Context context) {
        try {
            this.f12416a = C1662a.m4206a("dp3t_exposuredays_store", C1667b.m4214a(C1667b.f4921a), context, C1665c.AES256_SIV, C1666d.AES256_GCM);
        } catch (IOException | GeneralSecurityException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static synchronized C5199g m11639a(Context context) {
        C5199g gVar;
        synchronized (C5199g.class) {
            if (f12415b == null) {
                f12415b = new C5199g(context);
            }
            gVar = f12415b;
        }
        return gVar;
    }

    /* renamed from: c */
    public static /* synthetic */ C5201b m11640c() {
        return new C5201b(null);
    }

    /* renamed from: a */
    public ArrayList<ExposureDay> mo11942a() {
        C5201b b = mo11943b();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            if (((ExposureDay) it.next()).isDeleted()) {
                it.remove();
            }
        }
        if (b.size() <= 0) {
            return b;
        }
        ExposureDay exposureDay = (ExposureDay) b.get(b.size() - 1);
        C5201b bVar = new C5201b(null);
        bVar.add(exposureDay);
        return bVar;
    }

    /* renamed from: b */
    public final C5201b mo11943b() {
        C5201b bVar = (C5201b) C5243a.m11695a(this.f12416a.getString("exposureDays", "[]"), C5201b.class, C5192a.f12409a);
        DayDate subtractDays = new DayDate().subtractDays(10);
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            if (((ExposureDay) it.next()).getExposedDate().isBefore(subtractDays)) {
                it.remove();
            }
        }
        Collections.sort(bVar, C5193b.f12410e);
        return bVar;
    }
}
