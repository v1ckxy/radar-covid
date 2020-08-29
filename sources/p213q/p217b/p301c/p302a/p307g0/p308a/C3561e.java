package p213q.p217b.p301c.p302a.p307g0.p308a;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import p213q.p217b.p301c.p302a.C3766l;

/* renamed from: q.b.c.a.g0.a.e */
public final class C3561e implements C3766l {

    /* renamed from: a */
    public final Editor f8945a;

    /* renamed from: b */
    public final String f8946b;

    public C3561e(Context context, String str, String str2) {
        if (str != null) {
            this.f8946b = str;
            Context applicationContext = context.getApplicationContext();
            this.f8945a = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).edit();
            return;
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }
}
