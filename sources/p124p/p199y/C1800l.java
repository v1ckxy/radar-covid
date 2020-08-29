package p124p.p199y;

import android.util.Log;

/* renamed from: p.y.l */
public abstract class C1800l {

    /* renamed from: a */
    public static C1800l f5279a;

    /* renamed from: p.y.l$a */
    public static class C1801a extends C1800l {

        /* renamed from: b */
        public int f5280b;

        public C1801a(int i) {
            this.f5280b = i;
        }

        /* renamed from: a */
        public void mo6782a(String str, String str2, Throwable... thArr) {
            if (this.f5280b > 3) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.d(str, str2);
            } else {
                Log.d(str, str2, thArr[0]);
            }
        }

        /* renamed from: b */
        public void mo6783b(String str, String str2, Throwable... thArr) {
            if (this.f5280b > 6) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, thArr[0]);
            }
        }

        /* renamed from: c */
        public void mo6784c(String str, String str2, Throwable... thArr) {
            if (this.f5280b > 4) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.i(str, str2);
            } else {
                Log.i(str, str2, thArr[0]);
            }
        }

        /* renamed from: d */
        public void mo6785d(String str, String str2, Throwable... thArr) {
            if (this.f5280b > 5) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.w(str, str2);
            } else {
                Log.w(str, str2, thArr[0]);
            }
        }
    }

    /* renamed from: a */
    public static String m4459a(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            str = str.substring(0, 20);
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static synchronized C1800l m4460a() {
        C1800l lVar;
        synchronized (C1800l.class) {
            if (f5279a == null) {
                f5279a = new C1801a(3);
            }
            lVar = f5279a;
        }
        return lVar;
    }

    /* renamed from: a */
    public static synchronized void m4461a(C1800l lVar) {
        synchronized (C1800l.class) {
            f5279a = lVar;
        }
    }

    /* renamed from: a */
    public abstract void mo6782a(String str, String str2, Throwable... thArr);

    /* renamed from: b */
    public abstract void mo6783b(String str, String str2, Throwable... thArr);

    /* renamed from: c */
    public abstract void mo6784c(String str, String str2, Throwable... thArr);

    /* renamed from: d */
    public abstract void mo6785d(String str, String str2, Throwable... thArr);
}
