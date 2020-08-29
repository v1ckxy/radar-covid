package p124p.p199y.p200x.p205q.p207f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p124p.p199y.C1800l;
import p124p.p199y.p200x.p210t.p212q.C1962a;

/* renamed from: p.y.x.q.f.a */
public class C1874a extends C1876c<Boolean> {

    /* renamed from: i */
    public static final String f5463i = C1800l.m4459a("BatteryChrgTracker");

    public C1874a(Context context, C1962a aVar) {
        super(context, aVar);
    }

    /* renamed from: a */
    public Object mo6862a() {
        Intent registerReceiver = this.f5470b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            C1800l.m4460a().mo6783b(f5463i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r7 != 3) goto L_0x0065;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6863a(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            java.lang.String r6 = r7.getAction()
            if (r6 != 0) goto L_0x0007
            return
        L_0x0007:
            p.y.l r7 = p124p.p199y.C1800l.m4460a()
            java.lang.String r0 = f5463i
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r6
            java.lang.String r4 = "Received %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r7.mo6782a(r0, r2, r4)
            r7 = -1
            int r0 = r6.hashCode()
            r2 = 3
            r4 = 2
            switch(r0) {
                case -1886648615: goto L_0x0047;
                case -54942926: goto L_0x003d;
                case 948344062: goto L_0x0033;
                case 1019184907: goto L_0x0029;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x0050
        L_0x0029:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0050
            r7 = r4
            goto L_0x0050
        L_0x0033:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0050
            r7 = r3
            goto L_0x0050
        L_0x003d:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0050
            r7 = r1
            goto L_0x0050
        L_0x0047:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0050
            r7 = r2
        L_0x0050:
            if (r7 == 0) goto L_0x005e
            if (r7 == r1) goto L_0x0059
            if (r7 == r4) goto L_0x005e
            if (r7 == r2) goto L_0x0059
            goto L_0x0065
        L_0x0059:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            goto L_0x0062
        L_0x005e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
        L_0x0062:
            r5.mo6868a(r6)
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p199y.p200x.p205q.p207f.C1874a.mo6863a(android.content.Context, android.content.Intent):void");
    }

    /* renamed from: d */
    public IntentFilter mo6864d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }
}
