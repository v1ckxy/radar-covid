package p124p.p177n;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p124p.p177n.C1537e.C1538a;

/* renamed from: p.n.k */
public class C1546k extends Service implements C1542h {

    /* renamed from: e */
    public final C1554r f4567e = new C1554r(this);

    /* renamed from: g */
    public C1537e mo2g() {
        return this.f4567e.f4571a;
    }

    public IBinder onBind(Intent intent) {
        C1554r rVar = this.f4567e;
        if (rVar != null) {
            rVar.mo6249a(C1538a.ON_START);
            return null;
        }
        throw null;
    }

    public void onCreate() {
        C1554r rVar = this.f4567e;
        if (rVar != null) {
            rVar.mo6249a(C1538a.ON_CREATE);
            super.onCreate();
            return;
        }
        throw null;
    }

    public void onDestroy() {
        C1554r rVar = this.f4567e;
        if (rVar != null) {
            rVar.mo6249a(C1538a.ON_STOP);
            rVar.mo6249a(C1538a.ON_DESTROY);
            super.onDestroy();
            return;
        }
        throw null;
    }

    public void onStart(Intent intent, int i) {
        C1554r rVar = this.f4567e;
        if (rVar != null) {
            rVar.mo6249a(C1538a.ON_START);
            super.onStart(intent, i);
            return;
        }
        throw null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
