package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p259h.p261b.C2891a;
import p213q.p217b.p218a.p231b.p259h.p261b.C2969g5;
import p213q.p217b.p218a.p231b.p259h.p261b.C2995i7;
import p213q.p217b.p218a.p231b.p259h.p261b.C3018k6;
import p213q.p217b.p218a.p231b.p259h.p261b.C3044m7;
import p213q.p217b.p218a.p231b.p259h.p261b.C3066o7;

@Deprecated
public class AppMeasurement {

    /* renamed from: d */
    public static volatile AppMeasurement f1108d;

    /* renamed from: a */
    public final C2969g5 f1109a;

    /* renamed from: b */
    public final C2995i7 f1110b;

    /* renamed from: c */
    public final boolean f1111c;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(Bundle bundle) {
            Class<Long> cls = Long.class;
            Class<String> cls2 = String.class;
            C1061o.m2524b(bundle);
            this.mAppId = (String) C2286e.m5178a(bundle, "app_id", cls2, null);
            this.mOrigin = (String) C2286e.m5178a(bundle, "origin", cls2, null);
            this.mName = (String) C2286e.m5178a(bundle, "name", cls2, null);
            this.mValue = C2286e.m5178a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) C2286e.m5178a(bundle, "trigger_event_name", cls2, null);
            Long valueOf = Long.valueOf(0);
            this.mTriggerTimeout = ((Long) C2286e.m5178a(bundle, "trigger_timeout", cls, valueOf)).longValue();
            this.mTimedOutEventName = (String) C2286e.m5178a(bundle, "timed_out_event_name", cls2, null);
            this.mTimedOutEventParams = (Bundle) C2286e.m5178a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) C2286e.m5178a(bundle, "triggered_event_name", cls2, null);
            this.mTriggeredEventParams = (Bundle) C2286e.m5178a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) C2286e.m5178a(bundle, "time_to_live", cls, valueOf)).longValue();
            this.mExpiredEventName = (String) C2286e.m5178a(bundle, "expired_event_name", cls2, null);
            this.mExpiredEventParams = (Bundle) C2286e.m5178a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) C2286e.m5178a(bundle, "active", Boolean.class, Boolean.valueOf(false))).booleanValue();
            this.mCreationTimestamp = ((Long) C2286e.m5178a(bundle, "creation_timestamp", cls, valueOf)).longValue();
            this.mTriggeredTimestamp = ((Long) C2286e.m5178a(bundle, "triggered_timestamp", cls, valueOf)).longValue();
        }

        /* renamed from: a */
        public final Bundle mo1560a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                C2286e.m5228a(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }
    }

    public AppMeasurement(C2969g5 g5Var) {
        C1061o.m2524b(g5Var);
        this.f1109a = g5Var;
        this.f1110b = null;
        this.f1111c = false;
    }

    public AppMeasurement(C2995i7 i7Var) {
        C1061o.m2524b(i7Var);
        this.f1110b = i7Var;
        this.f1109a = null;
        this.f1111c = true;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.measurement.AppMeasurement m907a(android.content.Context r13) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = f1108d
            if (r0 != 0) goto L_0x005c
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = f1108d     // Catch:{ all -> 0x0059 }
            if (r1 != 0) goto L_0x0057
            r1 = 0
            java.lang.String r2 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x0032 }
            java.lang.String r3 = "getScionFrontendApiImplementation"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{  }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r7 = 0
            r5[r7] = r6     // Catch:{  }
            java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
            r8 = 1
            r5[r8] = r6     // Catch:{  }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r5)     // Catch:{  }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{  }
            r3[r7] = r13     // Catch:{  }
            r3[r8] = r1     // Catch:{  }
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{  }
            q.b.a.b.h.b.i7 r2 = (p213q.p217b.p218a.p231b.p259h.p261b.C2995i7) r2     // Catch:{  }
            goto L_0x0033
        L_0x0032:
            r2 = r1
        L_0x0033:
            if (r2 == 0) goto L_0x003d
            com.google.android.gms.measurement.AppMeasurement r13 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0059 }
            r13.<init>(r2)     // Catch:{ all -> 0x0059 }
            f1108d = r13     // Catch:{ all -> 0x0059 }
            goto L_0x0057
        L_0x003d:
            q.b.a.b.g.e.f r12 = new q.b.a.b.g.e.f     // Catch:{ all -> 0x0059 }
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r2 = r12
            r2.<init>(r3, r5, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0059 }
            q.b.a.b.h.b.g5 r13 = p213q.p217b.p218a.p231b.p259h.p261b.C2969g5.m6914a(r13, r12, r1)     // Catch:{ all -> 0x0059 }
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0059 }
            r1.<init>(r13)     // Catch:{ all -> 0x0059 }
            f1108d = r1     // Catch:{ all -> 0x0059 }
        L_0x0057:
            monitor-exit(r0)     // Catch:{ all -> 0x0059 }
            goto L_0x005c
        L_0x0059:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0059 }
            throw r13
        L_0x005c:
            com.google.android.gms.measurement.AppMeasurement r13 = f1108d
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.m907a(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @Deprecated
    @Keep
    public static AppMeasurement getInstance(Context context) {
        return m907a(context);
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        if (this.f1111c) {
            this.f1110b.mo8526a(str);
            return;
        }
        C2891a w = this.f1109a.mo8480w();
        if (((C2284c) this.f1109a.f7345n) != null) {
            w.mo8256a(str, SystemClock.elapsedRealtime());
            return;
        }
        throw null;
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (this.f1111c) {
            this.f1110b.mo8527a(str, str2, bundle);
            return;
        }
        C3018k6 o = this.f1109a.mo8472o();
        o.mo8277a();
        o.mo8566a((String) null, str, str2, bundle);
    }

    @Keep
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        if (!this.f1111c) {
            C3018k6 o = this.f1109a.mo8472o();
            if (o != null) {
                C1061o.m2528b(str);
                o.mo8295m();
                throw null;
            }
            throw null;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    @Keep
    public void endAdUnitExposure(String str) {
        if (this.f1111c) {
            this.f1110b.mo8532c(str);
            return;
        }
        C2891a w = this.f1109a.mo8480w();
        if (((C2284c) this.f1109a.f7345n) != null) {
            w.mo8259b(str, SystemClock.elapsedRealtime());
            return;
        }
        throw null;
    }

    @Keep
    public long generateEventId() {
        return this.f1111c ? this.f1110b.mo8534e() : this.f1109a.mo8473p().mo8813s();
    }

    @Keep
    public String getAppInstanceId() {
        if (this.f1111c) {
            return this.f1110b.mo8531c();
        }
        C3018k6 o = this.f1109a.mo8472o();
        o.mo8277a();
        return (String) o.f7489g.get();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> list;
        if (this.f1111c) {
            list = this.f1110b.mo8523a(str, str2);
        } else {
            C3018k6 o = this.f1109a.mo8472o();
            o.mo8277a();
            list = o.mo8555a((String) null, str, str2);
        }
        ArrayList arrayList = new ArrayList(list == null ? 0 : list.size());
        for (Bundle conditionalUserProperty : list) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        if (!this.f1111c) {
            C3018k6 o = this.f1109a.mo8472o();
            if (o != null) {
                C1061o.m2528b(str);
                o.mo8295m();
                throw null;
            }
            throw null;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    @Keep
    public String getCurrentScreenClass() {
        if (this.f1111c) {
            return this.f1110b.mo8529b();
        }
        C3066o7 s = this.f1109a.mo8472o().f7133a.mo8476s();
        s.mo8277a();
        C3044m7 m7Var = s.f7650c;
        return m7Var != null ? m7Var.f7568b : null;
    }

    @Keep
    public String getCurrentScreenName() {
        if (this.f1111c) {
            return this.f1110b.mo8522a();
        }
        C3066o7 s = this.f1109a.mo8472o().f7133a.mo8476s();
        s.mo8277a();
        C3044m7 m7Var = s.f7650c;
        return m7Var != null ? m7Var.f7567a : null;
    }

    @Keep
    public String getGmpAppId() {
        return this.f1111c ? this.f1110b.mo8533d() : this.f1109a.mo8472o().mo8553A();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        if (this.f1111c) {
            return this.f1110b.mo8528b(str);
        }
        this.f1109a.mo8472o();
        C1061o.m2528b(str);
        return 25;
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        if (this.f1111c) {
            return this.f1110b.mo8524a(str, str2, z);
        }
        C3018k6 o = this.f1109a.mo8472o();
        o.mo8277a();
        return o.mo8556a((String) null, str, str2, z);
    }

    @Keep
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        if (!this.f1111c) {
            C3018k6 o = this.f1109a.mo8472o();
            if (o != null) {
                C1061o.m2528b(str);
                o.mo8295m();
                throw null;
            }
            throw null;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.f1111c) {
            this.f1110b.mo8530b(str, str2, bundle);
        } else {
            this.f1109a.mo8472o().mo8561a(str, str2, bundle);
        }
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        C1061o.m2524b(conditionalUserProperty);
        if (this.f1111c) {
            this.f1110b.mo8525a(conditionalUserProperty.mo1560a());
            return;
        }
        C3018k6 o = this.f1109a.mo8472o();
        Bundle a = conditionalUserProperty.mo1560a();
        if (((C2284c) o.f7133a.f7345n) != null) {
            o.mo8557a(a, System.currentTimeMillis());
            return;
        }
        throw null;
    }

    @Keep
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        C1061o.m2524b(conditionalUserProperty);
        if (!this.f1111c) {
            C3018k6 o = this.f1109a.mo8472o();
            Bundle a = conditionalUserProperty.mo1560a();
            if (o != null) {
                C1061o.m2524b(a);
                C1061o.m2528b(a.getString("app_id"));
                o.mo8295m();
                throw null;
            }
            throw null;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }
}
