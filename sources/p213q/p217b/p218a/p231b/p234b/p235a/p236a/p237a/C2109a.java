package p213q.p217b.p218a.p231b.p234b.p235a.p236a.p237a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import p124p.p126b.p127k.C1061o;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.b.a.a.a.a */
public class C2109a {

    /* renamed from: c */
    public static final Lock f5967c = new ReentrantLock();
    @GuardedBy("sLk")

    /* renamed from: d */
    public static C2109a f5968d;

    /* renamed from: a */
    public final Lock f5969a = new ReentrantLock();
    @GuardedBy("mLk")

    /* renamed from: b */
    public final SharedPreferences f5970b;

    public C2109a(Context context) {
        this.f5970b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public static C2109a m4900a(Context context) {
        C1061o.m2524b(context);
        f5967c.lock();
        try {
            if (f5968d == null) {
                f5968d = new C2109a(context.getApplicationContext());
            }
            return f5968d;
        } finally {
            f5967c.unlock();
        }
    }

    /* renamed from: a */
    public GoogleSignInAccount mo7086a() {
        String a = mo7087a("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(C1965a.m4743a(a, 20));
        sb.append("googleSignInAccount");
        sb.append(":");
        sb.append(a);
        String a2 = mo7087a(sb.toString());
        if (a2 == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m878a(a2);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final String mo7087a(String str) {
        this.f5969a.lock();
        try {
            return this.f5970b.getString(str, null);
        } finally {
            this.f5969a.unlock();
        }
    }
}
