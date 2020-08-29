package p124p.p182q;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p124p.p182q.C1620c.C1621a;
import p124p.p182q.C1623d.C1624a;
import p124p.p182q.C1626e.C1629c;

/* renamed from: p.q.f */
public class C1631f {

    /* renamed from: a */
    public final Context f4790a;

    /* renamed from: b */
    public final String f4791b;

    /* renamed from: c */
    public int f4792c;

    /* renamed from: d */
    public final C1626e f4793d;

    /* renamed from: e */
    public final C1629c f4794e;

    /* renamed from: f */
    public C1623d f4795f;

    /* renamed from: g */
    public final Executor f4796g;

    /* renamed from: h */
    public final C1620c f4797h = new C1632a();

    /* renamed from: i */
    public final AtomicBoolean f4798i = new AtomicBoolean(false);

    /* renamed from: j */
    public final ServiceConnection f4799j = new C1634b();

    /* renamed from: k */
    public final Runnable f4800k = new C1635c();

    /* renamed from: l */
    public final Runnable f4801l = new C1636d();

    /* renamed from: p.q.f$a */
    public class C1632a extends C1621a {

        /* renamed from: p.q.f$a$a */
        public class C1633a implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ String[] f4803e;

            public C1633a(String[] strArr) {
                this.f4803e = strArr;
            }

            public void run() {
                C1631f.this.f4793d.mo6394a(this.f4803e);
            }
        }

        public C1632a() {
        }

        /* renamed from: a */
        public void mo6384a(String[] strArr) {
            C1631f.this.f4796g.execute(new C1633a(strArr));
        }
    }

    /* renamed from: p.q.f$b */
    public class C1634b implements ServiceConnection {
        public C1634b() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1631f.this.f4795f = C1624a.m4149a(iBinder);
            C1631f fVar = C1631f.this;
            fVar.f4796g.execute(fVar.f4800k);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C1631f fVar = C1631f.this;
            fVar.f4796g.execute(fVar.f4801l);
            C1631f.this.f4795f = null;
        }
    }

    /* renamed from: p.q.f$c */
    public class C1635c implements Runnable {
        public C1635c() {
        }

        public void run() {
            try {
                C1623d dVar = C1631f.this.f4795f;
                if (dVar != null) {
                    C1631f.this.f4792c = dVar.mo1351a(C1631f.this.f4797h, C1631f.this.f4791b);
                    C1631f.this.f4793d.mo6391a(C1631f.this.f4794e);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
            }
        }
    }

    /* renamed from: p.q.f$d */
    public class C1636d implements Runnable {
        public C1636d() {
        }

        public void run() {
            C1631f fVar = C1631f.this;
            fVar.f4793d.mo6397b(fVar.f4794e);
        }
    }

    /* renamed from: p.q.f$e */
    public class C1637e extends C1629c {
        public C1637e(String[] strArr) {
            super(strArr);
        }

        /* renamed from: a */
        public void mo6406a(Set<String> set) {
            if (!C1631f.this.f4798i.get()) {
                try {
                    C1623d dVar = C1631f.this.f4795f;
                    if (dVar != null) {
                        dVar.mo1352a(C1631f.this.f4792c, (String[]) set.toArray(new String[0]));
                    }
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e);
                }
            }
        }
    }

    public C1631f(Context context, String str, C1626e eVar, Executor executor) {
        this.f4790a = context.getApplicationContext();
        this.f4791b = str;
        this.f4793d = eVar;
        this.f4796g = executor;
        this.f4794e = new C1637e((String[]) eVar.f4769a.keySet().toArray(new String[0]));
        this.f4790a.bindService(new Intent(this.f4790a, MultiInstanceInvalidationService.class), this.f4799j, 1);
    }
}
