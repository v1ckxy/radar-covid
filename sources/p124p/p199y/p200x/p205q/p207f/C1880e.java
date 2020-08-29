package p124p.p199y.p200x.p205q.p207f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import p124p.p199y.C1800l;
import p124p.p199y.p200x.p205q.C1862b;
import p124p.p199y.p200x.p210t.p212q.C1962a;

/* renamed from: p.y.x.q.f.e */
public class C1880e extends C1878d<C1862b> {

    /* renamed from: j */
    public static final String f5476j = C1800l.m4459a("NetworkStateTracker");

    /* renamed from: g */
    public final ConnectivityManager f5477g = ((ConnectivityManager) this.f5470b.getSystemService("connectivity"));

    /* renamed from: h */
    public C1882b f5478h;

    /* renamed from: i */
    public C1881a f5479i;

    /* renamed from: p.y.x.q.f.e$a */
    public class C1881a extends BroadcastReceiver {
        public C1881a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                C1800l.m4460a().mo6782a(C1880e.f5476j, "Network broadcast received", new Throwable[0]);
                C1880e eVar = C1880e.this;
                eVar.mo6868a(eVar.mo6872d());
            }
        }
    }

    /* renamed from: p.y.x.q.f.e$b */
    public class C1882b extends NetworkCallback {
        public C1882b() {
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C1800l.m4460a().mo6782a(C1880e.f5476j, String.format("Network capabilities changed: %s", new Object[]{networkCapabilities}), new Throwable[0]);
            C1880e eVar = C1880e.this;
            eVar.mo6868a(eVar.mo6872d());
        }

        public void onLost(Network network) {
            C1800l.m4460a().mo6782a(C1880e.f5476j, "Network connection lost", new Throwable[0]);
            C1880e eVar = C1880e.this;
            eVar.mo6868a(eVar.mo6872d());
        }
    }

    public C1880e(Context context, C1962a aVar) {
        super(context, aVar);
        if (m4622e()) {
            this.f5478h = new C1882b();
        } else {
            this.f5479i = new C1881a();
        }
    }

    /* renamed from: e */
    public static boolean m4622e() {
        return VERSION.SDK_INT >= 24;
    }

    /* renamed from: a */
    public Object mo6862a() {
        return mo6872d();
    }

    /* renamed from: b */
    public void mo6865b() {
        if (m4622e()) {
            try {
                C1800l.m4460a().mo6782a(f5476j, "Registering network callback", new Throwable[0]);
                this.f5477g.registerDefaultNetworkCallback(this.f5478h);
            } catch (IllegalArgumentException | SecurityException e) {
                C1800l.m4460a().mo6783b(f5476j, "Received exception while registering network callback", e);
            }
        } else {
            C1800l.m4460a().mo6782a(f5476j, "Registering broadcast receiver", new Throwable[0]);
            this.f5470b.registerReceiver(this.f5479i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* renamed from: c */
    public void mo6866c() {
        if (m4622e()) {
            try {
                C1800l.m4460a().mo6782a(f5476j, "Unregistering network callback", new Throwable[0]);
                this.f5477g.unregisterNetworkCallback(this.f5478h);
            } catch (IllegalArgumentException | SecurityException e) {
                C1800l.m4460a().mo6783b(f5476j, "Received exception while unregistering network callback", e);
            }
        } else {
            C1800l.m4460a().mo6782a(f5476j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f5470b.unregisterReceiver(this.f5479i);
        }
    }

    /* renamed from: d */
    public C1862b mo6872d() {
        NetworkInfo activeNetworkInfo = this.f5477g.getActiveNetworkInfo();
        boolean z = true;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        NetworkCapabilities networkCapabilities = this.f5477g.getNetworkCapabilities(this.f5477g.getActiveNetwork());
        boolean z3 = networkCapabilities != null && networkCapabilities.hasCapability(16);
        boolean isActiveNetworkMetered = this.f5477g.isActiveNetworkMetered();
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z = false;
        }
        return new C1862b(z2, z3, isActiveNetworkMetered, z);
    }
}
