package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p218a.p231b.p232a.p233a.C2105a;
import p213q.p217b.p218a.p231b.p232a.p233a.C2105a.C2106a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;

/* renamed from: q.b.a.b.h.b.o4 */
public final class C3063o4 extends C3185z5 {

    /* renamed from: D */
    public static final Pair<String, Long> f7616D = new Pair<>(Objects.EMPTY_STRING, Long.valueOf(0));

    /* renamed from: A */
    public final C3129u4 f7617A = new C3129u4(this, "deferred_attribution_cache");

    /* renamed from: B */
    public final C3107s4 f7618B = new C3107s4(this, "deferred_attribution_cache_timestamp", 0);

    /* renamed from: C */
    public final C3074p4 f7619C = new C3074p4(this, "default_event_parameters");

    /* renamed from: c */
    public SharedPreferences f7620c;

    /* renamed from: d */
    public C3096r4 f7621d;

    /* renamed from: e */
    public final C3107s4 f7622e = new C3107s4(this, "last_upload", 0);

    /* renamed from: f */
    public final C3107s4 f7623f = new C3107s4(this, "last_upload_attempt", 0);

    /* renamed from: g */
    public final C3107s4 f7624g = new C3107s4(this, "backoff", 0);

    /* renamed from: h */
    public final C3107s4 f7625h = new C3107s4(this, "last_delete_stale", 0);

    /* renamed from: i */
    public final C3107s4 f7626i = new C3107s4(this, "midnight_offset", 0);

    /* renamed from: j */
    public final C3107s4 f7627j = new C3107s4(this, "first_open_time", 0);

    /* renamed from: k */
    public final C3107s4 f7628k = new C3107s4(this, "app_install_time", 0);

    /* renamed from: l */
    public final C3129u4 f7629l = new C3129u4(this, "app_instance_id");

    /* renamed from: m */
    public String f7630m;

    /* renamed from: n */
    public boolean f7631n;

    /* renamed from: o */
    public long f7632o;

    /* renamed from: p */
    public final C3107s4 f7633p = new C3107s4(this, "time_before_start", 10000);

    /* renamed from: q */
    public final C3107s4 f7634q = new C3107s4(this, "session_timeout", 1800000);

    /* renamed from: r */
    public final C3085q4 f7635r = new C3085q4(this, "start_new_session", true);

    /* renamed from: s */
    public final C3129u4 f7636s = new C3129u4(this, "non_personalized_ads");

    /* renamed from: t */
    public final C3085q4 f7637t = new C3085q4(this, "allow_remote_dynamite", false);

    /* renamed from: u */
    public final C3107s4 f7638u = new C3107s4(this, "last_pause_time", 0);

    /* renamed from: v */
    public boolean f7639v;

    /* renamed from: w */
    public C3085q4 f7640w = new C3085q4(this, "app_backgrounded", false);

    /* renamed from: x */
    public C3085q4 f7641x = new C3085q4(this, "deep_link_retrieval_complete", false);

    /* renamed from: y */
    public C3107s4 f7642y = new C3107s4(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: z */
    public final C3129u4 f7643z = new C3129u4(this, "firebase_feature_rollouts");

    public C3063o4(C2969g5 g5Var) {
        super(g5Var);
    }

    /* renamed from: a */
    public final Pair<String, Boolean> mo8662a(String str) {
        String str2 = Objects.EMPTY_STRING;
        mo8279c();
        if (((C2284c) this.f7133a.f7345n) != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f7630m != null && elapsedRealtime < this.f7632o) {
                return new Pair<>(this.f7630m, Boolean.valueOf(this.f7631n));
            }
            this.f7632o = this.f7133a.f7338g.mo8572a(str, C3069p.f7714b) + elapsedRealtime;
            try {
                C2106a a = C2105a.m4893a(this.f7133a.f7332a);
                if (a != null) {
                    this.f7630m = a.f5960a;
                    this.f7631n = a.f5961b;
                }
                if (this.f7630m == null) {
                    this.f7630m = str2;
                }
            } catch (Exception e) {
                mo8285i().f7160m.mo8433a("Unable to get advertising id", e);
                this.f7630m = str2;
            }
            return new Pair<>(this.f7630m, Boolean.valueOf(this.f7631n));
        }
        throw null;
    }

    /* renamed from: a */
    public final boolean mo8664a(long j) {
        return j - this.f7634q.mo8708a() > this.f7638u.mo8708a();
    }

    /* renamed from: b */
    public final String mo8665b(String str) {
        mo8279c();
        String str2 = (String) mo8662a(str).first;
        MessageDigest w = C3156w9.m7419w();
        if (w == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, w.digest(str2.getBytes()))});
    }

    /* renamed from: m */
    public final void mo8666m() {
        SharedPreferences sharedPreferences = this.f7133a.f7332a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f7620c = sharedPreferences;
        String str = "has_been_opened";
        boolean z = sharedPreferences.getBoolean(str, false);
        this.f7639v = z;
        if (!z) {
            Editor edit = this.f7620c.edit();
            edit.putBoolean(str, true);
            edit.apply();
        }
        C3096r4 r4Var = new C3096r4(this, "health_monitor", Math.max(0, ((Long) C3069p.f7716c.mo8702a(null)).longValue()), null);
        this.f7621d = r4Var;
    }

    /* renamed from: q */
    public final boolean mo8306q() {
        return true;
    }

    /* renamed from: s */
    public final SharedPreferences mo8667s() {
        mo8279c();
        mo8846n();
        return this.f7620c;
    }

    /* renamed from: t */
    public final Boolean mo8668t() {
        mo8279c();
        String str = "measurement_enabled";
        if (mo8667s().contains(str)) {
            return Boolean.valueOf(mo8667s().getBoolean(str, true));
        }
        return null;
    }

    /* renamed from: a */
    public final void mo8663a(boolean z) {
        mo8279c();
        mo8285i().f7161n.mo8433a("App measurement setting deferred collection", Boolean.valueOf(z));
        Editor edit = mo8667s().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }
}
