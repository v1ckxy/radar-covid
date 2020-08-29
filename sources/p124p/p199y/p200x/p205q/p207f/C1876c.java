package p124p.p199y.p200x.p205q.p207f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p124p.p199y.C1800l;
import p124p.p199y.p200x.p210t.p212q.C1962a;

/* renamed from: p.y.x.q.f.c */
public abstract class C1876c<T> extends C1878d<T> {

    /* renamed from: h */
    public static final String f5465h = C1800l.m4459a("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g */
    public final BroadcastReceiver f5466g = new C1877a();

    /* renamed from: p.y.x.q.f.c$a */
    public class C1877a extends BroadcastReceiver {
        public C1877a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                C1876c.this.mo6863a(context, intent);
            }
        }
    }

    public C1876c(Context context, C1962a aVar) {
        super(context, aVar);
    }

    /* renamed from: a */
    public abstract void mo6863a(Context context, Intent intent);

    /* renamed from: b */
    public void mo6865b() {
        C1800l.m4460a().mo6782a(f5465h, String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f5470b.registerReceiver(this.f5466g, mo6864d());
    }

    /* renamed from: c */
    public void mo6866c() {
        C1800l.m4460a().mo6782a(f5465h, String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f5470b.unregisterReceiver(this.f5466g);
    }

    /* renamed from: d */
    public abstract IntentFilter mo6864d();
}
