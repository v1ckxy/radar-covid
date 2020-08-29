package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p251g.p256e.C2462h;
import p213q.p217b.p218a.p231b.p251g.p256e.C2572n;
import p213q.p217b.p218a.p231b.p259h.p261b.C2995i7;
import p213q.p217b.p317d.p318f.C3880b;
import p213q.p217b.p317d.p350n.C4281f;

public final class FirebaseAnalytics {

    /* renamed from: b */
    public static volatile FirebaseAnalytics f1534b;

    /* renamed from: a */
    public final C2462h f1535a;

    public FirebaseAnalytics(C2462h hVar) {
        C1061o.m2524b(hVar);
        this.f1535a = hVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f1534b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f1534b == null) {
                    f1534b = new FirebaseAnalytics(C2462h.m5876a(context, null, null, null, null));
                }
            }
        }
        return f1534b;
    }

    @Keep
    public static C2995i7 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C2462h a = C2462h.m5876a(context, null, null, null, bundle);
        if (a == null) {
            return null;
        }
        return new C3880b(a);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) C2286e.m5187a(C4281f.m9773h().getId(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        C2462h hVar = this.f1535a;
        if (hVar != null) {
            hVar.f6557c.execute(new C2572n(hVar, activity, str, str2));
            return;
        }
        throw null;
    }
}
