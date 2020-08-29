package p124p.p150h.p151d;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import p124p.p150h.p152e.C1325a;

/* renamed from: p.h.d.a */
public class C1309a extends C1325a {

    /* renamed from: p.h.d.a$a */
    public interface C1310a {
    }

    /* renamed from: a */
    public static C1310a m3356a() {
        return null;
    }

    /* renamed from: a */
    public static void m3357a(Activity activity) {
        activity.finishAffinity();
    }

    /* renamed from: a */
    public static void m3358a(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    /* renamed from: b */
    public static void m3359b(Activity activity) {
        if (VERSION.SDK_INT >= 28 || !C1311b.m3361a(activity)) {
            activity.recreate();
        }
    }
}
