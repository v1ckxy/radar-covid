package p425x.p472b.p473a.p474a.p476l;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map.Entry;
import org.dpppt.android.sdk.models.ApplicationInfo;
import org.dpppt.android.sdk.models.DayDate;
import p116io.jsonwebtoken.lang.Objects;
import p425x.p472b.p473a.p474a.p476l.p477k.C5209c;
import p425x.p472b.p473a.p474a.p476l.p480n.C5242m;
import p425x.p472b.p473a.p474a.p476l.p481o.C5243a;

/* renamed from: x.b.a.a.l.d */
public class C5195d {

    /* renamed from: c */
    public static C5195d f12412c;

    /* renamed from: a */
    public SharedPreferences f12413a;

    /* renamed from: b */
    public C5242m f12414b;

    /* renamed from: x.b.a.a.l.d$a */
    public static class C5196a extends HashMap<String, Long> {
    }

    public C5195d(Context context) {
        this.f12413a = context.getSharedPreferences("dp3t_sdk_preferences", 0);
        this.f12414b = C5242m.m11680a(context);
    }

    /* renamed from: b */
    public static synchronized C5195d m11631b(Context context) {
        C5195d dVar;
        synchronized (C5195d.class) {
            if (f12412c == null) {
                f12412c = new C5195d(context.getApplicationContext());
            }
            dVar = f12412c;
        }
        return dVar;
    }

    /* renamed from: a */
    public final HashMap<String, Long> mo11934a(HashMap<DayDate, Long> hashMap) {
        HashMap<String, Long> hashMap2 = new HashMap<>();
        for (Entry entry : hashMap.entrySet()) {
            hashMap2.put(((DayDate) entry.getKey()).formatAsString(), entry.getValue());
        }
        return hashMap2;
    }

    /* renamed from: a */
    public C5209c mo11935a(Context context) {
        return new C5209c(context, ((ApplicationInfo) C5243a.m11694a(this.f12413a.getString("application", Objects.EMPTY_ARRAY), ApplicationInfo.class)).getReportBaseUrl());
    }

    /* renamed from: a */
    public boolean mo11936a() {
        return this.f12413a.getBoolean("devHistory", false);
    }

    /* renamed from: b */
    public HashMap<DayDate, Long> mo11937b() {
        return mo11938b((HashMap) C5243a.m11694a(this.f12413a.getString("lastLoadedTimes", Objects.EMPTY_ARRAY), C5196a.class));
    }

    /* renamed from: b */
    public final HashMap<DayDate, Long> mo11938b(HashMap<String, Long> hashMap) {
        HashMap<DayDate, Long> hashMap2 = new HashMap<>();
        for (Entry entry : hashMap.entrySet()) {
            try {
                hashMap2.put(new DayDate((String) entry.getKey()), entry.getValue());
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return hashMap2;
    }

    /* renamed from: c */
    public boolean mo11939c() {
        return this.f12413a.getBoolean("tracingEnabled", false);
    }
}
