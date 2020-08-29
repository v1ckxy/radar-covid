package p213q.p217b.p301c.p302a.p307g0.p308a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.c.a.g0.a.d */
public final class C3560d {

    /* renamed from: a */
    public final SharedPreferences f8943a;

    /* renamed from: b */
    public final String f8944b;

    public C3560d(Context context, String str, String str2) {
        if (str != null) {
            this.f8944b = str;
            Context applicationContext = context.getApplicationContext();
            this.f8943a = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0);
            return;
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    /* renamed from: a */
    public final byte[] mo9476a() {
        try {
            String string = this.f8943a.getString(this.f8944b, null);
            if (string != null) {
                return C2286e.m5315c(string);
            }
            throw new IOException(String.format("can't read keyset; the pref value %s does not exist", new Object[]{this.f8944b}));
        } catch (ClassCastException | IllegalArgumentException e) {
            throw new IOException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{this.f8944b}), e);
        }
    }
}
