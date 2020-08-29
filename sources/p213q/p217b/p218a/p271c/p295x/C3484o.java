package p213q.p217b.p218a.p271c.p295x;

import android.widget.BaseAdapter;
import java.util.Calendar;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.c.x.o */
public class C3484o extends BaseAdapter {

    /* renamed from: i */
    public static final int f8878i = C2286e.m5311c().getMaximum(4);

    /* renamed from: e */
    public final C3482n f8879e;

    /* renamed from: f */
    public final C3466d<?> f8880f;

    /* renamed from: g */
    public C3465c f8881g;

    /* renamed from: h */
    public final C3461a f8882h;

    public C3484o(C3482n nVar, C3466d<?> dVar, C3461a aVar) {
        this.f8879e = nVar;
        this.f8880f = dVar;
        this.f8882h = aVar;
    }

    /* renamed from: a */
    public int mo9440a() {
        return this.f8879e.mo9435f();
    }

    /* renamed from: b */
    public int mo9441b() {
        return (this.f8879e.mo9435f() + this.f8879e.f8877j) - 1;
    }

    public int getCount() {
        return mo9440a() + this.f8879e.f8877j;
    }

    public Long getItem(int i) {
        if (i < this.f8879e.mo9435f() || i > mo9441b()) {
            return null;
        }
        C3482n nVar = this.f8879e;
        int f = (i - nVar.mo9435f()) + 1;
        Calendar a = C2286e.m5201a(nVar.f8872e);
        a.set(5, f);
        return Long.valueOf(a.getTimeInMillis());
    }

    public long getItemId(int i) {
        return (long) (i / this.f8879e.f8876i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
            r7 = this;
            android.content.Context r0 = r10.getContext()
            q.b.a.c.x.c r1 = r7.f8881g
            if (r1 != 0) goto L_0x000f
            q.b.a.c.x.c r1 = new q.b.a.c.x.c
            r1.<init>(r0)
            r7.f8881g = r1
        L_0x000f:
            r0 = r9
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r9 != 0) goto L_0x0026
            android.content.Context r9 = r10.getContext()
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            int r0 = p213q.p217b.p218a.p271c.C3356h.mtrl_calendar_day
            android.view.View r9 = r9.inflate(r0, r10, r1)
            r0 = r9
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0026:
            int r9 = r7.mo9440a()
            int r9 = r8 - r9
            r10 = 1
            if (r9 < 0) goto L_0x00d8
            q.b.a.c.x.n r2 = r7.f8879e
            int r3 = r2.f8877j
            if (r9 < r3) goto L_0x0037
            goto L_0x00d8
        L_0x0037:
            int r9 = r9 + r10
            r0.setTag(r2)
            java.lang.String r2 = java.lang.String.valueOf(r9)
            r0.setText(r2)
            q.b.a.c.x.n r2 = r7.f8879e
            java.util.Calendar r2 = r2.f8872e
            java.util.Calendar r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5201a(r2)
            r3 = 5
            r2.set(r3, r9)
            long r2 = r2.getTimeInMillis()
            q.b.a.c.x.n r9 = r7.f8879e
            int r9 = r9.f8875h
            q.b.a.c.x.n r4 = new q.b.a.c.x.n
            java.util.Calendar r5 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5288b()
            r4.<init>(r5)
            int r4 = r4.f8875h
            java.lang.String r5 = "UTC"
            r6 = 24
            if (r9 != r4) goto L_0x009b
            java.util.Locale r9 = java.util.Locale.getDefault()
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r6) goto L_0x0086
            java.lang.String r4 = "MMMEd"
            android.icu.text.DateFormat r9 = android.icu.text.DateFormat.getInstanceForSkeleton(r4, r9)
            android.icu.util.TimeZone r4 = android.icu.util.TimeZone.getTimeZone(r5)
            r9.setTimeZone(r4)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r2)
            java.lang.String r9 = r9.format(r4)
            goto L_0x00ce
        L_0x0086:
            java.text.DateFormat r9 = java.text.DateFormat.getDateInstance(r1, r9)
            java.util.TimeZone r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5206a()
            r9.setTimeZone(r4)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r2)
            java.lang.String r9 = r9.format(r4)
            goto L_0x00ce
        L_0x009b:
            java.util.Locale r9 = java.util.Locale.getDefault()
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r6) goto L_0x00ba
            java.lang.String r4 = "yMMMEd"
            android.icu.text.DateFormat r9 = android.icu.text.DateFormat.getInstanceForSkeleton(r4, r9)
            android.icu.util.TimeZone r4 = android.icu.util.TimeZone.getTimeZone(r5)
            r9.setTimeZone(r4)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r2)
            java.lang.String r9 = r9.format(r4)
            goto L_0x00ce
        L_0x00ba:
            java.text.DateFormat r9 = java.text.DateFormat.getDateInstance(r1, r9)
            java.util.TimeZone r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5206a()
            r9.setTimeZone(r4)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r2)
            java.lang.String r9 = r9.format(r4)
        L_0x00ce:
            r0.setContentDescription(r9)
            r0.setVisibility(r1)
            r0.setEnabled(r10)
            goto L_0x00e0
        L_0x00d8:
            r9 = 8
            r0.setVisibility(r9)
            r0.setEnabled(r1)
        L_0x00e0:
            java.lang.Long r8 = r7.getItem(r8)
            if (r8 != 0) goto L_0x00e8
            goto L_0x0162
        L_0x00e8:
            q.b.a.c.x.a r9 = r7.f8882h
            q.b.a.c.x.a$b r9 = r9.f8817h
            long r2 = r8.longValue()
            boolean r9 = r9.mo9411d(r2)
            if (r9 == 0) goto L_0x0158
            r0.setEnabled(r10)
            q.b.a.c.x.d<?> r9 = r7.f8880f
            java.util.Collection r9 = r9.mo9415m()
            java.util.Iterator r9 = r9.iterator()
        L_0x0103:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x013e
            java.lang.Object r10 = r9.next()
            java.lang.Long r10 = (java.lang.Long) r10
            long r1 = r10.longValue()
            long r3 = r8.longValue()
            java.util.Calendar r10 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5311c()
            r10.setTimeInMillis(r3)
            java.util.Calendar r10 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5201a(r10)
            long r3 = r10.getTimeInMillis()
            java.util.Calendar r10 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5311c()
            r10.setTimeInMillis(r1)
            java.util.Calendar r10 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5201a(r10)
            long r1 = r10.getTimeInMillis()
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r10 != 0) goto L_0x0103
            q.b.a.c.x.c r8 = r7.f8881g
            q.b.a.c.x.b r8 = r8.f8827b
            goto L_0x015f
        L_0x013e:
            java.util.Calendar r9 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5288b()
            long r9 = r9.getTimeInMillis()
            long r1 = r8.longValue()
            int r8 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x0153
            q.b.a.c.x.c r8 = r7.f8881g
            q.b.a.c.x.b r8 = r8.f8828c
            goto L_0x015f
        L_0x0153:
            q.b.a.c.x.c r8 = r7.f8881g
            q.b.a.c.x.b r8 = r8.f8826a
            goto L_0x015f
        L_0x0158:
            r0.setEnabled(r1)
            q.b.a.c.x.c r8 = r7.f8881g
            q.b.a.c.x.b r8 = r8.f8832g
        L_0x015f:
            r8.mo9412a(r0)
        L_0x0162:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p271c.p295x.C3484o.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public boolean hasStableIds() {
        return true;
    }
}
