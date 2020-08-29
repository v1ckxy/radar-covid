package p213q.p217b.p218a.p231b.p239d.p242n;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import p124p.p126b.p127k.C1061o;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.C2115b;
import p213q.p217b.p218a.p231b.p239d.C2119d;
import p213q.p217b.p218a.p231b.p239d.C2124f;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2169e;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2202s;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2203t;
import p213q.p217b.p218a.p231b.p239d.p242n.C2236f.C2237a;
import p213q.p217b.p218a.p231b.p239d.p242n.C2245i.C2246a;
import p213q.p217b.p218a.p231b.p251g.p254c.C2330g;

/* renamed from: q.b.a.b.d.n.b */
public abstract class C2214b<T extends IInterface> {

    /* renamed from: w */
    public static final C2119d[] f6114w = new C2119d[0];

    /* renamed from: a */
    public volatile String f6115a = null;

    /* renamed from: b */
    public C2249j0 f6116b;

    /* renamed from: c */
    public final Context f6117c;

    /* renamed from: d */
    public final C2236f f6118d;

    /* renamed from: e */
    public final C2124f f6119e;

    /* renamed from: f */
    public final Handler f6120f;

    /* renamed from: g */
    public final Object f6121g = new Object();

    /* renamed from: h */
    public final Object f6122h = new Object();
    @GuardedBy("mServiceBrokerLock")

    /* renamed from: i */
    public C2250k f6123i;

    /* renamed from: j */
    public C2217c f6124j;
    @GuardedBy("mLock")

    /* renamed from: k */
    public T f6125k;

    /* renamed from: l */
    public final ArrayList<C2222h<?>> f6126l = new ArrayList<>();
    @GuardedBy("mLock")

    /* renamed from: m */
    public C2223i f6127m;
    @GuardedBy("mLock")

    /* renamed from: n */
    public int f6128n = 1;

    /* renamed from: o */
    public final C2215a f6129o;

    /* renamed from: p */
    public final C2216b f6130p;

    /* renamed from: q */
    public final int f6131q;

    /* renamed from: r */
    public final String f6132r;

    /* renamed from: s */
    public C2115b f6133s = null;

    /* renamed from: t */
    public boolean f6134t = false;

    /* renamed from: u */
    public volatile C2227b0 f6135u = null;

    /* renamed from: v */
    public AtomicInteger f6136v = new AtomicInteger(0);

    /* renamed from: q.b.a.b.d.n.b$a */
    public interface C2215a {
        /* renamed from: a */
        void mo7249a(int i);

        /* renamed from: b */
        void mo7250b(Bundle bundle);
    }

    /* renamed from: q.b.a.b.d.n.b$b */
    public interface C2216b {
        /* renamed from: a */
        void mo7251a(C2115b bVar);
    }

    /* renamed from: q.b.a.b.d.n.b$c */
    public interface C2217c {
        /* renamed from: a */
        void mo7187a(C2115b bVar);
    }

    /* renamed from: q.b.a.b.d.n.b$d */
    public class C2218d implements C2217c {
        public C2218d() {
        }

        /* renamed from: a */
        public void mo7187a(C2115b bVar) {
            if (bVar.mo7093c()) {
                C2214b bVar2 = C2214b.this;
                bVar2.mo7226a((C2241h) null, bVar2.mo7242p());
                return;
            }
            C2216b bVar3 = C2214b.this.f6130p;
            if (bVar3 != null) {
                bVar3.mo7251a(bVar);
            }
        }
    }

    /* renamed from: q.b.a.b.d.n.b$e */
    public interface C2219e {
    }

    /* renamed from: q.b.a.b.d.n.b$f */
    public abstract class C2220f extends C2222h<Boolean> {

        /* renamed from: d */
        public final int f6138d;

        /* renamed from: e */
        public final Bundle f6139e;

        public C2220f(int i, Bundle bundle) {
            super(Boolean.valueOf(true));
            this.f6138d = i;
            this.f6139e = bundle;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo7252a(Object obj) {
            PendingIntent pendingIntent = null;
            if (((Boolean) obj) == null) {
                C2214b.this.mo7229b(1, null);
                return;
            }
            int i = this.f6138d;
            if (i != 0) {
                if (i != 10) {
                    C2214b.this.mo7229b(1, null);
                    Bundle bundle = this.f6139e;
                    if (bundle != null) {
                        pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                    }
                    mo7253a(new C2115b(this.f6138d, pendingIntent));
                } else {
                    C2214b.this.mo7229b(1, null);
                    throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", new Object[]{getClass().getSimpleName(), C2214b.this.mo7245s(), C2214b.this.mo7244r()}));
                }
            } else if (!mo7254d()) {
                C2214b.this.mo7229b(1, null);
                mo7253a(new C2115b(8, null));
            }
        }

        /* renamed from: a */
        public abstract void mo7253a(C2115b bVar);

        /* renamed from: d */
        public abstract boolean mo7254d();
    }

    /* renamed from: q.b.a.b.d.n.b$g */
    public final class C2221g extends C2330g {
        public C2221g(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public static void m5071a(Message message) {
            C2222h hVar = (C2222h) message.obj;
            if (((C2220f) hVar) != null) {
                hVar.mo7257b();
                return;
            }
            throw null;
        }

        /* renamed from: b */
        public static boolean m5072b(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            if (r0 == 5) goto L_0x002b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r8) {
            /*
                r7 = this;
                q.b.a.b.d.n.b r0 = p213q.p217b.p218a.p231b.p239d.p242n.C2214b.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.f6136v
                int r0 = r0.get()
                int r1 = r8.arg1
                if (r0 == r1) goto L_0x0016
                boolean r0 = m5072b(r8)
                if (r0 == 0) goto L_0x0015
                m5071a(r8)
            L_0x0015:
                return
            L_0x0016:
                int r0 = r8.what
                r1 = 4
                r2 = 1
                r3 = 5
                r4 = 0
                if (r0 == r2) goto L_0x002b
                r5 = 7
                if (r0 == r5) goto L_0x002b
                if (r0 != r1) goto L_0x0029
                q.b.a.b.d.n.b r0 = p213q.p217b.p218a.p231b.p239d.p242n.C2214b.this
                if (r0 == 0) goto L_0x0028
                goto L_0x002b
            L_0x0028:
                throw r4
            L_0x0029:
                if (r0 != r3) goto L_0x0037
            L_0x002b:
                q.b.a.b.d.n.b r0 = p213q.p217b.p218a.p231b.p239d.p242n.C2214b.this
                boolean r0 = r0.mo7232e()
                if (r0 != 0) goto L_0x0037
                m5071a(r8)
                return
            L_0x0037:
                int r0 = r8.what
                r5 = 8
                r6 = 3
                if (r0 != r1) goto L_0x0077
                q.b.a.b.d.n.b r0 = p213q.p217b.p218a.p231b.p239d.p242n.C2214b.this
                q.b.a.b.d.b r1 = new q.b.a.b.d.b
                int r8 = r8.arg2
                r1.<init>(r8)
                r0.f6133s = r1
                q.b.a.b.d.n.b r8 = p213q.p217b.p218a.p231b.p239d.p242n.C2214b.this
                boolean r8 = p213q.p217b.p218a.p231b.p239d.p242n.C2214b.m5032b(r8)
                if (r8 == 0) goto L_0x005b
                q.b.a.b.d.n.b r8 = p213q.p217b.p218a.p231b.p239d.p242n.C2214b.this
                boolean r0 = r8.f6134t
                if (r0 != 0) goto L_0x005b
                r8.mo7229b(r6, r4)
                return
            L_0x005b:
                q.b.a.b.d.n.b r8 = p213q.p217b.p218a.p231b.p239d.p242n.C2214b.this
                q.b.a.b.d.b r8 = r8.f6133s
                if (r8 == 0) goto L_0x0062
                goto L_0x0067
            L_0x0062:
                q.b.a.b.d.b r8 = new q.b.a.b.d.b
                r8.<init>(r5)
            L_0x0067:
                q.b.a.b.d.n.b r0 = p213q.p217b.p218a.p231b.p239d.p242n.C2214b.this
                q.b.a.b.d.n.b$c r0 = r0.f6124j
                r0.mo7187a(r8)
                q.b.a.b.d.n.b r8 = p213q.p217b.p218a.p231b.p239d.p242n.C2214b.this
                if (r8 == 0) goto L_0x0076
                java.lang.System.currentTimeMillis()
                return
            L_0x0076:
                throw r4
            L_0x0077:
                if (r0 != r3) goto L_0x0095
                q.b.a.b.d.n.b r8 = p213q.p217b.p218a.p231b.p239d.p242n.C2214b.this
                q.b.a.b.d.b r8 = r8.f6133s
                if (r8 == 0) goto L_0x0080
                goto L_0x0085
            L_0x0080:
                q.b.a.b.d.b r8 = new q.b.a.b.d.b
                r8.<init>(r5)
            L_0x0085:
                q.b.a.b.d.n.b r0 = p213q.p217b.p218a.p231b.p239d.p242n.C2214b.this
                q.b.a.b.d.n.b$c r0 = r0.f6124j
                r0.mo7187a(r8)
                q.b.a.b.d.n.b r8 = p213q.p217b.p218a.p231b.p239d.p242n.C2214b.this
                if (r8 == 0) goto L_0x0094
                java.lang.System.currentTimeMillis()
                return
            L_0x0094:
                throw r4
            L_0x0095:
                if (r0 != r6) goto L_0x00b8
                java.lang.Object r0 = r8.obj
                boolean r1 = r0 instanceof android.app.PendingIntent
                if (r1 == 0) goto L_0x00a0
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                goto L_0x00a1
            L_0x00a0:
                r0 = r4
            L_0x00a1:
                q.b.a.b.d.b r1 = new q.b.a.b.d.b
                int r8 = r8.arg2
                r1.<init>(r8, r0)
                q.b.a.b.d.n.b r8 = p213q.p217b.p218a.p231b.p239d.p242n.C2214b.this
                q.b.a.b.d.n.b$c r8 = r8.f6124j
                r8.mo7187a(r1)
                q.b.a.b.d.n.b r8 = p213q.p217b.p218a.p231b.p239d.p242n.C2214b.this
                if (r8 == 0) goto L_0x00b7
                java.lang.System.currentTimeMillis()
                return
            L_0x00b7:
                throw r4
            L_0x00b8:
                r1 = 6
                if (r0 != r1) goto L_0x00d8
                q.b.a.b.d.n.b r0 = p213q.p217b.p218a.p231b.p239d.p242n.C2214b.this
                r0.mo7229b(r3, r4)
                q.b.a.b.d.n.b r0 = p213q.p217b.p218a.p231b.p239d.p242n.C2214b.this
                q.b.a.b.d.n.b$a r0 = r0.f6129o
                if (r0 == 0) goto L_0x00cb
                int r1 = r8.arg2
                r0.mo7249a(r1)
            L_0x00cb:
                q.b.a.b.d.n.b r0 = p213q.p217b.p218a.p231b.p239d.p242n.C2214b.this
                int r8 = r8.arg2
                r0.mo7220a(r8)
                q.b.a.b.d.n.b r8 = p213q.p217b.p218a.p231b.p239d.p242n.C2214b.this
                r8.mo7228a(r3, r2, r4)
                return
            L_0x00d8:
                r1 = 2
                if (r0 != r1) goto L_0x00e7
                q.b.a.b.d.n.b r0 = p213q.p217b.p218a.p231b.p239d.p242n.C2214b.this
                boolean r0 = r0.mo7227a()
                if (r0 != 0) goto L_0x00e7
                m5071a(r8)
                return
            L_0x00e7:
                boolean r0 = m5072b(r8)
                if (r0 == 0) goto L_0x00f5
                java.lang.Object r8 = r8.obj
                q.b.a.b.d.n.b$h r8 = (p213q.p217b.p218a.p231b.p239d.p242n.C2214b.C2222h) r8
                r8.mo7256a()
                return
            L_0x00f5:
                int r8 = r8.what
                r0 = 45
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Don't know how to handle message: "
                r1.append(r0)
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                java.lang.Exception r0 = new java.lang.Exception
                r0.<init>()
                java.lang.String r1 = "GmsClient"
                android.util.Log.wtf(r1, r8, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p239d.p242n.C2214b.C2221g.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: q.b.a.b.d.n.b$h */
    public abstract class C2222h<TListener> {

        /* renamed from: a */
        public TListener f6142a;

        /* renamed from: b */
        public boolean f6143b = false;

        public C2222h(TListener tlistener) {
            this.f6142a = tlistener;
        }

        /* renamed from: a */
        public final void mo7256a() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f6142a;
                if (this.f6143b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    mo7252a(tlistener);
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            synchronized (this) {
                this.f6143b = true;
            }
            mo7257b();
        }

        /* renamed from: a */
        public abstract void mo7252a(TListener tlistener);

        /* renamed from: b */
        public final void mo7257b() {
            mo7258c();
            synchronized (C2214b.this.f6126l) {
                C2214b.this.f6126l.remove(this);
            }
        }

        /* renamed from: c */
        public final void mo7258c() {
            synchronized (this) {
                this.f6142a = null;
            }
        }
    }

    /* renamed from: q.b.a.b.d.n.b$i */
    public final class C2223i implements ServiceConnection {

        /* renamed from: a */
        public final int f6145a;

        public C2223i(int i) {
            this.f6145a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C2214b bVar = C2214b.this;
            if (iBinder == null) {
                C2214b.m5031a(bVar);
                return;
            }
            synchronized (bVar.f6122h) {
                C2214b bVar2 = C2214b.this;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                bVar2.f6123i = (queryLocalInterface == null || !(queryLocalInterface instanceof C2250k)) ? new C2248j(iBinder) : (C2250k) queryLocalInterface;
            }
            C2214b bVar3 = C2214b.this;
            int i = this.f6145a;
            Handler handler = bVar3.f6120f;
            handler.sendMessage(handler.obtainMessage(7, i, -1, new C2226l(0)));
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (C2214b.this.f6122h) {
                C2214b.this.f6123i = null;
            }
            Handler handler = C2214b.this.f6120f;
            handler.sendMessage(handler.obtainMessage(6, this.f6145a, 1));
        }
    }

    /* renamed from: q.b.a.b.d.n.b$j */
    public static final class C2224j extends C2246a {

        /* renamed from: a */
        public C2214b f6147a;

        /* renamed from: b */
        public final int f6148b;

        public C2224j(C2214b bVar, int i) {
            this.f6147a = bVar;
            this.f6148b = i;
        }

        /* renamed from: a */
        public final void mo7261a(int i, IBinder iBinder, Bundle bundle) {
            C1061o.m2525b(this.f6147a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
            C2214b bVar = this.f6147a;
            int i2 = this.f6148b;
            Handler handler = bVar.f6120f;
            handler.sendMessage(handler.obtainMessage(1, i2, -1, new C2225k(i, iBinder, bundle)));
            this.f6147a = null;
        }
    }

    /* renamed from: q.b.a.b.d.n.b$k */
    public final class C2225k extends C2220f {

        /* renamed from: g */
        public final IBinder f6149g;

        public C2225k(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.f6149g = iBinder;
        }

        /* renamed from: a */
        public final void mo7253a(C2115b bVar) {
            C2216b bVar2 = C2214b.this.f6130p;
            if (bVar2 != null) {
                bVar2.mo7251a(bVar);
            }
            if (C2214b.this != null) {
                int i = bVar.f5976f;
                System.currentTimeMillis();
                return;
            }
            throw null;
        }

        /* renamed from: d */
        public final boolean mo7254d() {
            String str = "GmsClient";
            try {
                String interfaceDescriptor = this.f6149g.getInterfaceDescriptor();
                if (!C2214b.this.mo7244r().equals(interfaceDescriptor)) {
                    String r = C2214b.this.mo7244r();
                    StringBuilder sb = new StringBuilder(C1965a.m4743a(interfaceDescriptor, C1965a.m4743a(r, 34)));
                    sb.append("service descriptor mismatch: ");
                    sb.append(r);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e(str, sb.toString());
                    return false;
                }
                IInterface a = C2214b.this.mo7219a(this.f6149g);
                if (a == null || (!C2214b.this.mo7228a(2, 4, a) && !C2214b.this.mo7228a(3, 4, a))) {
                    return false;
                }
                C2214b bVar = C2214b.this;
                bVar.f6133s = null;
                C2215a aVar = bVar.f6129o;
                if (aVar != null) {
                    aVar.mo7250b(null);
                }
                return true;
            } catch (RemoteException unused) {
                Log.w(str, "service probably died");
                return false;
            }
        }
    }

    /* renamed from: q.b.a.b.d.n.b$l */
    public final class C2226l extends C2220f {
        public C2226l(int i) {
            super(i, null);
        }

        /* renamed from: a */
        public final void mo7253a(C2115b bVar) {
            C2214b bVar2 = C2214b.this;
            if (bVar2 != null) {
                bVar2.f6124j.mo7187a(bVar);
                if (C2214b.this != null) {
                    int i = bVar.f5976f;
                    System.currentTimeMillis();
                    return;
                }
                throw null;
            }
            throw null;
        }

        /* renamed from: d */
        public final boolean mo7254d() {
            C2214b.this.f6124j.mo7187a(C2115b.f5974i);
            return true;
        }
    }

    public C2214b(Context context, Looper looper, C2236f fVar, C2124f fVar2, int i, C2215a aVar, C2216b bVar, String str) {
        C1061o.m2525b(context, (Object) "Context must not be null");
        this.f6117c = context;
        C1061o.m2525b(looper, (Object) "Looper must not be null");
        Looper looper2 = looper;
        C1061o.m2525b(fVar, (Object) "Supervisor must not be null");
        this.f6118d = fVar;
        C1061o.m2525b(fVar2, (Object) "API availability must not be null");
        this.f6119e = fVar2;
        this.f6120f = new C2221g(looper);
        this.f6131q = i;
        this.f6129o = aVar;
        this.f6130p = bVar;
        this.f6132r = str;
    }

    /* renamed from: a */
    public abstract T mo7219a(IBinder iBinder);

    /* renamed from: a */
    public void mo7220a(int i) {
        System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo7221a(int i, T t) {
    }

    /* renamed from: a */
    public void mo7222a(T t) {
        System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo7223a(String str) {
        this.f6115a = str;
        mo7236i();
    }

    /* renamed from: a */
    public void mo7224a(C2217c cVar) {
        C1061o.m2525b(cVar, (Object) "Connection progress callbacks cannot be null.");
        this.f6124j = cVar;
        mo7229b(2, null);
    }

    /* renamed from: a */
    public void mo7226a(C2241h hVar, Set<Scope> set) {
        Bundle o = mo7241o();
        C2232d dVar = new C2232d(this.f6131q);
        dVar.f6172h = this.f6117c.getPackageName();
        dVar.f6175k = o;
        if (set != null) {
            dVar.f6174j = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo7237j()) {
            dVar.f6176l = mo7239m() != null ? mo7239m() : new Account("<<default account>>", "com.google");
            if (hVar != null) {
                dVar.f6173i = hVar.asBinder();
            }
        }
        dVar.f6177m = f6114w;
        dVar.f6178n = mo7240n();
        try {
            synchronized (this.f6122h) {
                if (this.f6123i != null) {
                    this.f6123i.mo7279a(new C2224j(this, this.f6136v.get()), dVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            Handler handler = this.f6120f;
            handler.sendMessage(handler.obtainMessage(6, this.f6136v.get(), 3));
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            int i = this.f6136v.get();
            Handler handler2 = this.f6120f;
            handler2.sendMessage(handler2.obtainMessage(1, i, -1, new C2225k(8, null, null)));
        }
    }

    /* renamed from: a */
    public boolean mo7227a() {
        boolean z;
        synchronized (this.f6121g) {
            z = this.f6128n == 4;
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo7228a(int i, int i2, T t) {
        synchronized (this.f6121g) {
            if (this.f6128n != i) {
                return false;
            }
            mo7229b(i2, t);
            return true;
        }
    }

    /* renamed from: b */
    public final void mo7229b(int i, T t) {
        boolean z = false;
        if ((i == 4) == (t != null)) {
            z = true;
        }
        C1061o.m2507a(z);
        synchronized (this.f6121g) {
            this.f6128n = i;
            this.f6125k = t;
            mo7221a(i, t);
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (!(this.f6127m == null || this.f6116b == null)) {
                        String str = this.f6116b.f6208a;
                        String str2 = this.f6116b.f6209b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 70 + String.valueOf(str2).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str);
                        sb.append(" on ");
                        sb.append(str2);
                        Log.e("GmsClient", sb.toString());
                        C2236f fVar = this.f6118d;
                        String str3 = this.f6116b.f6208a;
                        String str4 = this.f6116b.f6209b;
                        int i2 = this.f6116b.f6210c;
                        C2223i iVar = this.f6127m;
                        String u = mo7247u();
                        boolean z2 = this.f6116b.f6211d;
                        if (fVar != null) {
                            fVar.mo7268b(new C2237a(str3, str4, i2, z2), iVar, u);
                            this.f6136v.incrementAndGet();
                        } else {
                            throw null;
                        }
                    }
                    this.f6127m = new C2223i(this.f6136v.get());
                    String str5 = "com.google.android.gms";
                    String s = mo7245s();
                    C2236f.m5088a();
                    C2249j0 j0Var = new C2249j0(str5, s, false, 129, mo7246t());
                    this.f6116b = j0Var;
                    if (!j0Var.f6211d || mo7231d() >= 17895000) {
                        if (!this.f6118d.mo7267a(new C2237a(this.f6116b.f6208a, this.f6116b.f6209b, this.f6116b.f6210c, this.f6116b.f6211d), this.f6127m, mo7247u())) {
                            String str6 = this.f6116b.f6208a;
                            String str7 = this.f6116b.f6209b;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 34 + String.valueOf(str7).length());
                            sb2.append("unable to connect to service: ");
                            sb2.append(str6);
                            sb2.append(" on ");
                            sb2.append(str7);
                            Log.e("GmsClient", sb2.toString());
                            int i3 = this.f6136v.get();
                            Handler handler = this.f6120f;
                            handler.sendMessage(handler.obtainMessage(7, i3, -1, new C2226l(16)));
                        }
                    } else {
                        String str8 = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ";
                        String valueOf = String.valueOf(this.f6116b.f6208a);
                        throw new IllegalStateException(valueOf.length() != 0 ? str8.concat(valueOf) : new String(str8));
                    }
                } else if (i == 4) {
                    mo7222a(t);
                }
            } else if (this.f6127m != null) {
                C2236f fVar2 = this.f6118d;
                String str9 = this.f6116b.f6208a;
                String str10 = this.f6116b.f6209b;
                int i4 = this.f6116b.f6210c;
                C2223i iVar2 = this.f6127m;
                String u2 = mo7247u();
                boolean z3 = this.f6116b.f6211d;
                if (fVar2 != null) {
                    fVar2.mo7268b(new C2237a(str9, str10, i4, z3), iVar2, u2);
                    this.f6127m = null;
                } else {
                    throw null;
                }
            }
        }
    }

    /* renamed from: c */
    public boolean mo7230c() {
        return true;
    }

    /* renamed from: d */
    public int mo7231d() {
        return C2124f.f5996a;
    }

    /* renamed from: e */
    public boolean mo7232e() {
        boolean z;
        synchronized (this.f6121g) {
            if (this.f6128n != 2) {
                if (this.f6128n != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    public final C2119d[] mo7233f() {
        C2227b0 b0Var = this.f6135u;
        if (b0Var == null) {
            return null;
        }
        return b0Var.f6153f;
    }

    /* renamed from: g */
    public String mo7234g() {
        if (mo7227a()) {
            C2249j0 j0Var = this.f6116b;
            if (j0Var != null) {
                return j0Var.f6209b;
            }
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: h */
    public String mo7235h() {
        return this.f6115a;
    }

    /* renamed from: i */
    public void mo7236i() {
        this.f6136v.incrementAndGet();
        synchronized (this.f6126l) {
            int size = this.f6126l.size();
            for (int i = 0; i < size; i++) {
                ((C2222h) this.f6126l.get(i)).mo7258c();
            }
            this.f6126l.clear();
        }
        synchronized (this.f6122h) {
            this.f6123i = null;
        }
        mo7229b(1, null);
    }

    /* renamed from: j */
    public boolean mo7237j() {
        return false;
    }

    /* renamed from: l */
    public void mo7238l() {
        int a = this.f6119e.mo7110a(this.f6117c, mo7231d());
        if (a != 0) {
            mo7229b(1, null);
            C2218d dVar = new C2218d();
            C1061o.m2525b(dVar, (Object) "Connection progress callbacks cannot be null.");
            this.f6124j = dVar;
            Handler handler = this.f6120f;
            handler.sendMessage(handler.obtainMessage(3, this.f6136v.get(), a, null));
            return;
        }
        mo7224a((C2217c) new C2218d());
    }

    /* renamed from: m */
    public Account mo7239m() {
        return null;
    }

    /* renamed from: n */
    public C2119d[] mo7240n() {
        return f6114w;
    }

    /* renamed from: o */
    public Bundle mo7241o() {
        return new Bundle();
    }

    /* renamed from: p */
    public Set<Scope> mo7242p() {
        return Collections.emptySet();
    }

    /* renamed from: q */
    public final T mo7243q() {
        T t;
        synchronized (this.f6121g) {
            if (this.f6128n == 5) {
                throw new DeadObjectException();
            } else if (mo7227a()) {
                C1061o.m2534b(this.f6125k != null, (Object) "Client is connected but service is null");
                t = this.f6125k;
            } else {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
        }
        return t;
    }

    /* renamed from: r */
    public abstract String mo7244r();

    /* renamed from: s */
    public abstract String mo7245s();

    /* renamed from: t */
    public boolean mo7246t() {
        return false;
    }

    /* renamed from: u */
    public final String mo7247u() {
        String str = this.f6132r;
        return str == null ? this.f6117c.getClass().getName() : str;
    }

    /* renamed from: v */
    public final boolean mo7248v() {
        boolean z;
        synchronized (this.f6121g) {
            z = this.f6128n == 3;
        }
        return z;
    }

    /* renamed from: a */
    public void mo7225a(C2219e eVar) {
        C2203t tVar = (C2203t) eVar;
        C2169e.this.f6056m.post(new C2202s(tVar));
    }

    /* renamed from: a */
    public static /* synthetic */ void m5031a(C2214b bVar) {
        int i;
        if (bVar.mo7248v()) {
            i = 5;
            bVar.f6134t = true;
        } else {
            i = 4;
        }
        Handler handler = bVar.f6120f;
        handler.sendMessage(handler.obtainMessage(i, bVar.f6136v.get(), 16));
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m5032b(C2214b bVar) {
        if (bVar.f6134t || TextUtils.isEmpty(bVar.mo7244r()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(bVar.mo7244r());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
