package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.p127k.C1061o;
import p124p.p143e.C1248a;
import p213q.p217b.p218a.p231b.p249e.C2303a;
import p213q.p217b.p218a.p231b.p249e.C2306b;
import p213q.p217b.p218a.p231b.p251g.p256e.C2376c;
import p213q.p217b.p218a.p231b.p251g.p256e.C2393d;
import p213q.p217b.p218a.p231b.p251g.p256e.C2427f;
import p213q.p217b.p218a.p231b.p251g.p256e.C2589ne;
import p213q.p217b.p218a.p231b.p251g.p256e.C2626pe;
import p213q.p217b.p218a.p231b.p259h.p261b.C2899a7;
import p213q.p217b.p218a.p231b.p259h.p261b.C2900a8;
import p213q.p217b.p218a.p231b.p259h.p261b.C2911b7;
import p213q.p217b.p218a.p231b.p259h.p261b.C2913b9;
import p213q.p217b.p218a.p231b.p259h.p261b.C2922c6;
import p213q.p217b.p218a.p231b.p259h.p261b.C2923c7;
import p213q.p217b.p218a.p231b.p259h.p261b.C2935d7;
import p213q.p217b.p218a.p231b.p259h.p261b.C2944e4;
import p213q.p217b.p218a.p231b.p259h.p261b.C2945e5;
import p213q.p217b.p218a.p231b.p259h.p261b.C2958f6;
import p213q.p217b.p218a.p231b.p259h.p261b.C2969g5;
import p213q.p217b.p218a.p231b.p259h.p261b.C2971g7;
import p213q.p217b.p218a.p231b.p259h.p261b.C2994i6;
import p213q.p217b.p218a.p231b.p259h.p261b.C3006j6;
import p213q.p217b.p218a.p231b.p259h.p261b.C3018k6;
import p213q.p217b.p218a.p231b.p259h.p261b.C3030l6;
import p213q.p217b.p218a.p231b.p259h.p261b.C3036m;
import p213q.p217b.p218a.p231b.p259h.p261b.C3044m7;
import p213q.p217b.p218a.p231b.p259h.p261b.C3047n;
import p213q.p217b.p218a.p231b.p259h.p261b.C3065o6;
import p213q.p217b.p218a.p231b.p259h.p261b.C3066o7;
import p213q.p217b.p218a.p231b.p259h.p261b.C3087q6;
import p213q.p217b.p218a.p231b.p259h.p261b.C3098r6;
import p213q.p217b.p218a.p231b.p259h.p261b.C3142v6;
import p213q.p217b.p218a.p231b.p259h.p261b.C3153w6;
import p213q.p217b.p218a.p231b.p259h.p261b.C3156w9;
import p213q.p217b.p218a.p231b.p259h.p261b.C3167x9;
import p213q.p217b.p218a.p231b.p259h.p261b.C3175y6;
import p213q.p217b.p218a.p231b.p259h.p261b.C3184z4;
import p213q.p217b.p218a.p231b.p259h.p261b.C3186z6;

@DynamiteApi
public class AppMeasurementDynamiteService extends C2589ne {

    /* renamed from: a */
    public C2969g5 f1115a = null;

    /* renamed from: b */
    public Map<Integer, C2994i6> f1116b = new C1248a();

    /* renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$a */
    public class C0200a implements C2994i6 {

        /* renamed from: a */
        public C2376c f1117a;

        public C0200a(C2376c cVar) {
            this.f1117a = cVar;
        }

        /* renamed from: a */
        public final void mo1622a(String str, String str2, Bundle bundle, long j) {
            try {
                this.f1117a.mo7470a(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.f1115a.mo8285i().f7156i.mo8433a("Event listener threw exception", e);
            }
        }
    }

    /* renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$b */
    public class C0201b implements C2958f6 {

        /* renamed from: a */
        public C2376c f1119a;

        public C0201b(C2376c cVar) {
            this.f1119a = cVar;
        }
    }

    /* renamed from: a */
    public final void mo1580a() {
        if (this.f1115a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void beginAdUnitExposure(String str, long j) {
        mo1580a();
        this.f1115a.mo8480w().mo8256a(str, j);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        mo1580a();
        C3018k6 o = this.f1115a.mo8472o();
        o.mo8277a();
        o.mo8566a((String) null, str, str2, bundle);
    }

    public void endAdUnitExposure(String str, long j) {
        mo1580a();
        this.f1115a.mo8480w().mo8259b(str, j);
    }

    public void generateEventId(C2626pe peVar) {
        mo1580a();
        this.f1115a.mo8473p().mo8789a(peVar, this.f1115a.mo8473p().mo8813s());
    }

    public void getAppInstanceId(C2626pe peVar) {
        mo1580a();
        C3184z4 g = this.f1115a.mo8283g();
        C2922c6 c6Var = new C2922c6(this, peVar);
        g.mo8846n();
        C1061o.m2524b(c6Var);
        g.mo8843a(new C2945e5<>(g, c6Var, "Task exception on worker thread"));
    }

    public void getCachedAppInstanceId(C2626pe peVar) {
        mo1580a();
        C3018k6 o = this.f1115a.mo8472o();
        o.mo8277a();
        this.f1115a.mo8473p().mo8791a(peVar, (String) o.f7489g.get());
    }

    public void getConditionalUserProperties(String str, String str2, C2626pe peVar) {
        mo1580a();
        C3184z4 g = this.f1115a.mo8283g();
        C3167x9 x9Var = new C3167x9(this, peVar, str, str2);
        g.mo8846n();
        C1061o.m2524b(x9Var);
        g.mo8843a(new C2945e5<>(g, x9Var, "Task exception on worker thread"));
    }

    public void getCurrentScreenClass(C2626pe peVar) {
        mo1580a();
        C3066o7 s = this.f1115a.mo8472o().f7133a.mo8476s();
        s.mo8277a();
        C3044m7 m7Var = s.f7650c;
        this.f1115a.mo8473p().mo8791a(peVar, m7Var != null ? m7Var.f7568b : null);
    }

    public void getCurrentScreenName(C2626pe peVar) {
        mo1580a();
        C3066o7 s = this.f1115a.mo8472o().f7133a.mo8476s();
        s.mo8277a();
        C3044m7 m7Var = s.f7650c;
        this.f1115a.mo8473p().mo8791a(peVar, m7Var != null ? m7Var.f7567a : null);
    }

    public void getGmpAppId(C2626pe peVar) {
        mo1580a();
        this.f1115a.mo8473p().mo8791a(peVar, this.f1115a.mo8472o().mo8553A());
    }

    public void getMaxUserProperties(String str, C2626pe peVar) {
        mo1580a();
        this.f1115a.mo8472o();
        C1061o.m2528b(str);
        this.f1115a.mo8473p().mo8788a(peVar, 25);
    }

    public void getTestFlag(C2626pe peVar, int i) {
        mo1580a();
        if (i == 0) {
            C3156w9 p = this.f1115a.mo8473p();
            C3018k6 o = this.f1115a.mo8472o();
            if (o != null) {
                AtomicReference atomicReference = new AtomicReference();
                p.mo8791a(peVar, (String) o.mo8283g().mo8840a(atomicReference, 15000, "String test flag value", new C3142v6(o, atomicReference)));
                return;
            }
            throw null;
        } else if (i == 1) {
            C3156w9 p2 = this.f1115a.mo8473p();
            C3018k6 o2 = this.f1115a.mo8472o();
            if (o2 != null) {
                AtomicReference atomicReference2 = new AtomicReference();
                p2.mo8789a(peVar, ((Long) o2.mo8283g().mo8840a(atomicReference2, 15000, "long test flag value", new C3153w6(o2, atomicReference2))).longValue());
                return;
            }
            throw null;
        } else if (i == 2) {
            C3156w9 p3 = this.f1115a.mo8473p();
            C3018k6 o3 = this.f1115a.mo8472o();
            if (o3 != null) {
                AtomicReference atomicReference3 = new AtomicReference();
                double doubleValue = ((Double) o3.mo8283g().mo8840a(atomicReference3, 15000, "double test flag value", new C3175y6(o3, atomicReference3))).doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble("r", doubleValue);
                try {
                    peVar.mo7874a(bundle);
                } catch (RemoteException e) {
                    p3.f7133a.mo8285i().f7156i.mo8433a("Error returning double value to wrapper", e);
                }
            } else {
                throw null;
            }
        } else if (i != 3) {
            if (i == 4) {
                C3156w9 p4 = this.f1115a.mo8473p();
                C3018k6 o4 = this.f1115a.mo8472o();
                if (o4 != null) {
                    AtomicReference atomicReference4 = new AtomicReference();
                    p4.mo8793a(peVar, ((Boolean) o4.mo8283g().mo8840a(atomicReference4, 15000, "boolean test flag value", new C3030l6(o4, atomicReference4))).booleanValue());
                } else {
                    throw null;
                }
            }
        } else {
            C3156w9 p5 = this.f1115a.mo8473p();
            C3018k6 o5 = this.f1115a.mo8472o();
            if (o5 != null) {
                AtomicReference atomicReference5 = new AtomicReference();
                p5.mo8788a(peVar, ((Integer) o5.mo8283g().mo8840a(atomicReference5, 15000, "int test flag value", new C3186z6(o5, atomicReference5))).intValue());
                return;
            }
            throw null;
        }
    }

    public void getUserProperties(String str, String str2, boolean z, C2626pe peVar) {
        mo1580a();
        C3184z4 g = this.f1115a.mo8283g();
        C2923c7 c7Var = new C2923c7(this, peVar, str, str2, z);
        g.mo8846n();
        C1061o.m2524b(c7Var);
        g.mo8843a(new C2945e5<>(g, c7Var, "Task exception on worker thread"));
    }

    public void initForTests(Map map) {
        mo1580a();
    }

    public void initialize(C2303a aVar, C2427f fVar, long j) {
        Context context = (Context) C2306b.m5379a(aVar);
        C2969g5 g5Var = this.f1115a;
        if (g5Var == null) {
            this.f1115a = C2969g5.m6914a(context, fVar, Long.valueOf(j));
        } else {
            g5Var.mo8285i().f7156i.mo8432a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(C2626pe peVar) {
        mo1580a();
        C3184z4 g = this.f1115a.mo8283g();
        C2913b9 b9Var = new C2913b9(this, peVar);
        g.mo8846n();
        C1061o.m2524b(b9Var);
        g.mo8843a(new C2945e5<>(g, b9Var, "Task exception on worker thread"));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        mo1580a();
        this.f1115a.mo8472o().mo8562a(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, C2626pe peVar, long j) {
        Bundle bundle2;
        mo1580a();
        C1061o.m2528b(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        String str3 = "app";
        bundle2.putString("_o", str3);
        C3047n nVar = new C3047n(str2, new C3036m(bundle), str3, j);
        C3184z4 g = this.f1115a.mo8283g();
        C2900a8 a8Var = new C2900a8(this, peVar, nVar, str);
        g.mo8846n();
        C1061o.m2524b(a8Var);
        g.mo8843a(new C2945e5<>(g, a8Var, "Task exception on worker thread"));
    }

    public void logHealthData(int i, String str, C2303a aVar, C2303a aVar2, C2303a aVar3) {
        mo1580a();
        Object obj = null;
        Object a = aVar == null ? null : C2306b.m5379a(aVar);
        Object a2 = aVar2 == null ? null : C2306b.m5379a(aVar2);
        if (aVar3 != null) {
            obj = C2306b.m5379a(aVar3);
        }
        this.f1115a.mo8285i().mo8304a(i, true, false, str, a, a2, obj);
    }

    public void onActivityCreated(C2303a aVar, Bundle bundle, long j) {
        mo1580a();
        C2971g7 g7Var = this.f1115a.mo8472o().f7485c;
        if (g7Var != null) {
            this.f1115a.mo8472o().mo8568y();
            g7Var.onActivityCreated((Activity) C2306b.m5379a(aVar), bundle);
        }
    }

    public void onActivityDestroyed(C2303a aVar, long j) {
        mo1580a();
        C2971g7 g7Var = this.f1115a.mo8472o().f7485c;
        if (g7Var != null) {
            this.f1115a.mo8472o().mo8568y();
            g7Var.onActivityDestroyed((Activity) C2306b.m5379a(aVar));
        }
    }

    public void onActivityPaused(C2303a aVar, long j) {
        mo1580a();
        C2971g7 g7Var = this.f1115a.mo8472o().f7485c;
        if (g7Var != null) {
            this.f1115a.mo8472o().mo8568y();
            g7Var.onActivityPaused((Activity) C2306b.m5379a(aVar));
        }
    }

    public void onActivityResumed(C2303a aVar, long j) {
        mo1580a();
        C2971g7 g7Var = this.f1115a.mo8472o().f7485c;
        if (g7Var != null) {
            this.f1115a.mo8472o().mo8568y();
            g7Var.onActivityResumed((Activity) C2306b.m5379a(aVar));
        }
    }

    public void onActivitySaveInstanceState(C2303a aVar, C2626pe peVar, long j) {
        mo1580a();
        C2971g7 g7Var = this.f1115a.mo8472o().f7485c;
        Bundle bundle = new Bundle();
        if (g7Var != null) {
            this.f1115a.mo8472o().mo8568y();
            g7Var.onActivitySaveInstanceState((Activity) C2306b.m5379a(aVar), bundle);
        }
        try {
            peVar.mo7874a(bundle);
        } catch (RemoteException e) {
            this.f1115a.mo8285i().f7156i.mo8433a("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(C2303a aVar, long j) {
        mo1580a();
        C2971g7 g7Var = this.f1115a.mo8472o().f7485c;
        if (g7Var != null) {
            this.f1115a.mo8472o().mo8568y();
            g7Var.onActivityStarted((Activity) C2306b.m5379a(aVar));
        }
    }

    public void onActivityStopped(C2303a aVar, long j) {
        mo1580a();
        C2971g7 g7Var = this.f1115a.mo8472o().f7485c;
        if (g7Var != null) {
            this.f1115a.mo8472o().mo8568y();
            g7Var.onActivityStopped((Activity) C2306b.m5379a(aVar));
        }
    }

    public void performAction(Bundle bundle, C2626pe peVar, long j) {
        mo1580a();
        peVar.mo7874a(null);
    }

    public void registerOnMeasurementEventListener(C2376c cVar) {
        mo1580a();
        Object obj = (C2994i6) this.f1116b.get(Integer.valueOf(cVar.mo7469a()));
        if (obj == null) {
            obj = new C0200a(cVar);
            this.f1116b.put(Integer.valueOf(cVar.mo7469a()), obj);
        }
        C3018k6 o = this.f1115a.mo8472o();
        o.mo8277a();
        o.mo8373v();
        C1061o.m2524b(obj);
        if (!o.f7487e.add(obj)) {
            o.mo8285i().f7156i.mo8432a("OnEventListener already registered");
        }
    }

    public void resetAnalyticsData(long j) {
        mo1580a();
        C3018k6 o = this.f1115a.mo8472o();
        o.f7489g.set(null);
        C3184z4 g = o.mo8283g();
        C3098r6 r6Var = new C3098r6(o, j);
        g.mo8846n();
        C1061o.m2524b(r6Var);
        g.mo8843a(new C2945e5<>(g, r6Var, "Task exception on worker thread"));
    }

    public void setConditionalUserProperty(Bundle bundle, long j) {
        mo1580a();
        if (bundle == null) {
            this.f1115a.mo8285i().f7153f.mo8432a("Conditional user property must not be null");
        } else {
            this.f1115a.mo8472o().mo8557a(bundle, j);
        }
    }

    public void setCurrentScreen(C2303a aVar, String str, String str2, long j) {
        C2944e4 e4Var;
        Integer valueOf;
        String str3;
        C2944e4 e4Var2;
        String str4;
        mo1580a();
        C3066o7 s = this.f1115a.mo8476s();
        Activity activity = (Activity) C2306b.m5379a(aVar);
        if (!s.f7133a.f7338g.mo8587r().booleanValue()) {
            e4Var2 = s.mo8285i().f7158k;
            str4 = "setCurrentScreen cannot be called while screen reporting is disabled.";
        } else if (s.f7650c == null) {
            e4Var2 = s.mo8285i().f7158k;
            str4 = "setCurrentScreen cannot be called while no activity active";
        } else if (s.f7653f.get(activity) == null) {
            e4Var2 = s.mo8285i().f7158k;
            str4 = "setCurrentScreen must be called with an activity in the activity lifecycle";
        } else {
            if (str2 == null) {
                str2 = C3066o7.m7151a(activity.getClass().getCanonicalName());
            }
            boolean c = C3156w9.m7416c(s.f7650c.f7568b, str2);
            boolean c2 = C3156w9.m7416c(s.f7650c.f7567a, str);
            if (!c || !c2) {
                if (str != null && (str.length() <= 0 || str.length() > 100)) {
                    e4Var = s.mo8285i().f7158k;
                    valueOf = Integer.valueOf(str.length());
                    str3 = "Invalid screen name length in setCurrentScreen. Length";
                } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                    s.mo8285i().f7161n.mo8434a("Setting current screen to name, class", str == null ? Objects.NULL_STRING : str, str2);
                    C3044m7 m7Var = new C3044m7(str, str2, s.mo8287k().mo8813s());
                    s.f7653f.put(activity, m7Var);
                    s.mo8674a(activity, m7Var, true);
                    return;
                } else {
                    e4Var = s.mo8285i().f7158k;
                    valueOf = Integer.valueOf(str2.length());
                    str3 = "Invalid class name length in setCurrentScreen. Length";
                }
                e4Var.mo8433a(str3, valueOf);
                return;
            }
            e4Var2 = s.mo8285i().f7158k;
            str4 = "setCurrentScreen cannot be called with the same class and name";
        }
        e4Var2.mo8432a(str4);
    }

    public void setDataCollectionEnabled(boolean z) {
        mo1580a();
        C3018k6 o = this.f1115a.mo8472o();
        o.mo8373v();
        o.mo8277a();
        C3184z4 g = o.mo8283g();
        C2899a7 a7Var = new C2899a7(o, z);
        g.mo8846n();
        C1061o.m2524b(a7Var);
        g.mo8843a(new C2945e5<>(g, a7Var, "Task exception on worker thread"));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        mo1580a();
        C3018k6 o = this.f1115a.mo8472o();
        Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        C3184z4 g = o.mo8283g();
        C3006j6 j6Var = new C3006j6(o, bundle2);
        g.mo8846n();
        C1061o.m2524b(j6Var);
        g.mo8843a(new C2945e5<>(g, j6Var, "Task exception on worker thread"));
    }

    public void setEventInterceptor(C2376c cVar) {
        mo1580a();
        C3018k6 o = this.f1115a.mo8472o();
        C0201b bVar = new C0201b(cVar);
        o.mo8277a();
        o.mo8373v();
        C3184z4 g = o.mo8283g();
        C3087q6 q6Var = new C3087q6(o, bVar);
        g.mo8846n();
        C1061o.m2524b(q6Var);
        g.mo8843a(new C2945e5<>(g, q6Var, "Task exception on worker thread"));
    }

    public void setInstanceIdProvider(C2393d dVar) {
        mo1580a();
    }

    public void setMeasurementEnabled(boolean z, long j) {
        mo1580a();
        C3018k6 o = this.f1115a.mo8472o();
        o.mo8373v();
        o.mo8277a();
        C3184z4 g = o.mo8283g();
        C2911b7 b7Var = new C2911b7(o, z);
        g.mo8846n();
        C1061o.m2524b(b7Var);
        g.mo8843a(new C2945e5<>(g, b7Var, "Task exception on worker thread"));
    }

    public void setMinimumSessionDuration(long j) {
        mo1580a();
        C3018k6 o = this.f1115a.mo8472o();
        o.mo8277a();
        C3184z4 g = o.mo8283g();
        C2935d7 d7Var = new C2935d7(o, j);
        g.mo8846n();
        C1061o.m2524b(d7Var);
        g.mo8843a(new C2945e5<>(g, d7Var, "Task exception on worker thread"));
    }

    public void setSessionTimeoutDuration(long j) {
        mo1580a();
        C3018k6 o = this.f1115a.mo8472o();
        o.mo8277a();
        C3184z4 g = o.mo8283g();
        C3065o6 o6Var = new C3065o6(o, j);
        g.mo8846n();
        C1061o.m2524b(o6Var);
        g.mo8843a(new C2945e5<>(g, o6Var, "Task exception on worker thread"));
    }

    public void setUserId(String str, long j) {
        mo1580a();
        this.f1115a.mo8472o().mo8565a(null, "_id", str, true, j);
    }

    public void setUserProperty(String str, String str2, C2303a aVar, boolean z, long j) {
        mo1580a();
        this.f1115a.mo8472o().mo8565a(str, str2, C2306b.m5379a(aVar), z, j);
    }

    public void unregisterOnMeasurementEventListener(C2376c cVar) {
        mo1580a();
        Object obj = (C2994i6) this.f1116b.remove(Integer.valueOf(cVar.mo7469a()));
        if (obj == null) {
            obj = new C0200a(cVar);
        }
        C3018k6 o = this.f1115a.mo8472o();
        o.mo8277a();
        o.mo8373v();
        C1061o.m2524b(obj);
        if (!o.f7487e.remove(obj)) {
            o.mo8285i().f7156i.mo8432a("OnEventListener had not been registered");
        }
    }
}
