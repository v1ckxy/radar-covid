package p213q.p217b.p218a.p231b.p239d.p240m;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.C2119d;
import p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2137d;
import p213q.p217b.p218a.p231b.p239d.p240m.C2150d.C2151a;
import p213q.p217b.p218a.p231b.p239d.p240m.C2150d.C2152b;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2167d;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2186k;
import p213q.p217b.p218a.p231b.p239d.p242n.C2214b.C2217c;
import p213q.p217b.p218a.p231b.p239d.p242n.C2214b.C2219e;
import p213q.p217b.p218a.p231b.p239d.p242n.C2228c;
import p213q.p217b.p218a.p231b.p239d.p242n.C2241h;

/* renamed from: q.b.a.b.d.m.a */
public final class C2133a<O extends C2137d> {

    /* renamed from: a */
    public final C2134a<?, O> f6008a;

    /* renamed from: b */
    public final String f6009b;

    /* renamed from: q.b.a.b.d.m.a$a */
    public static abstract class C2134a<T extends C2145f, O> extends C2144e<T, O> {
        @Deprecated
        /* renamed from: a */
        public T mo7120a(Context context, Looper looper, C2228c cVar, O o, C2151a aVar, C2152b bVar) {
            return mo7121a(context, looper, cVar, o, (C2167d) aVar, (C2186k) bVar);
        }

        /* renamed from: a */
        public T mo7121a(Context context, Looper looper, C2228c cVar, O o, C2167d dVar, C2186k kVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: q.b.a.b.d.m.a$b */
    public interface C2135b {
    }

    /* renamed from: q.b.a.b.d.m.a$c */
    public static class C2136c<C extends C2135b> {
    }

    /* renamed from: q.b.a.b.d.m.a$d */
    public interface C2137d {

        /* renamed from: q.b.a.b.d.m.a$d$a */
        public interface C2138a extends C2140c, C2142e {
            /* renamed from: a */
            Account mo7122a();
        }

        /* renamed from: q.b.a.b.d.m.a$d$b */
        public interface C2139b extends C2140c {
            /* renamed from: b */
            GoogleSignInAccount mo7123b();
        }

        /* renamed from: q.b.a.b.d.m.a$d$c */
        public interface C2140c extends C2137d {
        }

        /* renamed from: q.b.a.b.d.m.a$d$d */
        public static final class C2141d implements C2142e {
        }

        /* renamed from: q.b.a.b.d.m.a$d$e */
        public interface C2142e extends C2137d {
        }

        /* renamed from: q.b.a.b.d.m.a$d$f */
        public interface C2143f extends C2140c, C2142e {
        }
    }

    /* renamed from: q.b.a.b.d.m.a$e */
    public static abstract class C2144e<T extends C2135b, O> {
    }

    /* renamed from: q.b.a.b.d.m.a$f */
    public interface C2145f extends C2135b {
        /* renamed from: a */
        void mo7124a(String str);

        /* renamed from: a */
        void mo7125a(C2217c cVar);

        /* renamed from: a */
        void mo7126a(C2219e eVar);

        /* renamed from: a */
        void mo7127a(C2241h hVar, Set<Scope> set);

        /* renamed from: a */
        boolean mo7128a();

        /* renamed from: b */
        Set<Scope> mo7129b();

        /* renamed from: c */
        boolean mo7130c();

        /* renamed from: d */
        int mo7131d();

        /* renamed from: e */
        boolean mo7132e();

        /* renamed from: f */
        C2119d[] mo7133f();

        /* renamed from: g */
        String mo7134g();

        /* renamed from: h */
        String mo7135h();

        /* renamed from: i */
        void mo7136i();

        /* renamed from: j */
        boolean mo7137j();
    }

    /* renamed from: q.b.a.b.d.m.a$g */
    public static final class C2146g<C extends C2145f> extends C2136c<C> {
    }

    public <C extends C2145f> C2133a(String str, C2134a<C, O> aVar, C2146g<C> gVar) {
        C1061o.m2525b(aVar, (Object) "Cannot construct an Api with a null ClientBuilder");
        C1061o.m2525b(gVar, (Object) "Cannot construct an Api with a null ClientKey");
        this.f6009b = str;
        this.f6008a = aVar;
    }
}
