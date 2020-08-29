package p213q.p217b.p317d.p322h.p323e;

import android.util.Log;

/* renamed from: q.b.d.h.e.b */
public class C3913b {

    /* renamed from: c */
    public static final C3913b f9552c = new C3913b("FirebaseCrashlytics");

    /* renamed from: a */
    public final String f9553a;

    /* renamed from: b */
    public int f9554b = 4;

    public C3913b(String str) {
        this.f9553a = str;
    }

    /* renamed from: a */
    public void mo10108a(String str) {
        if (mo10110a(3)) {
            Log.d(this.f9553a, str, null);
        }
    }

    /* renamed from: a */
    public void mo10109a(String str, Throwable th) {
        if (mo10110a(3)) {
            Log.d(this.f9553a, str, th);
        }
    }

    /* renamed from: a */
    public final boolean mo10110a(int i) {
        return this.f9554b <= i || Log.isLoggable(this.f9553a, i);
    }

    /* renamed from: b */
    public void mo10111b(String str) {
        if (mo10110a(6)) {
            Log.e(this.f9553a, str, null);
        }
    }

    /* renamed from: b */
    public void mo10112b(String str, Throwable th) {
        if (mo10110a(6)) {
            Log.e(this.f9553a, str, th);
        }
    }

    /* renamed from: c */
    public void mo10113c(String str) {
        if (mo10110a(5)) {
            Log.w(this.f9553a, str, null);
        }
    }
}
