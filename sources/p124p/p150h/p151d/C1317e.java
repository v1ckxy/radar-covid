package p124p.p150h.p151d;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import p116io.jsonwebtoken.lang.Objects;

/* renamed from: p.h.d.e */
public class C1317e {

    /* renamed from: a */
    public final Bundle f3956a;

    /* renamed from: b */
    public IconCompat f3957b;

    /* renamed from: c */
    public final C1322j[] f3958c;

    /* renamed from: d */
    public final C1322j[] f3959d;

    /* renamed from: e */
    public boolean f3960e;

    /* renamed from: f */
    public boolean f3961f;

    /* renamed from: g */
    public final int f3962g;

    /* renamed from: h */
    public final boolean f3963h;
    @Deprecated

    /* renamed from: i */
    public int f3964i;

    /* renamed from: j */
    public CharSequence f3965j;

    /* renamed from: k */
    public PendingIntent f3966k;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1317e(int r10, java.lang.CharSequence r11, android.app.PendingIntent r12) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L_0x0005
            r10 = r0
            goto L_0x000b
        L_0x0005:
            java.lang.String r1 = ""
            androidx.core.graphics.drawable.IconCompat r10 = androidx.core.graphics.drawable.IconCompat.m225a(r0, r1, r10)
        L_0x000b:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r9.<init>()
            r2 = 1
            r9.f3961f = r2
            r9.f3957b = r10
            r3 = 0
            if (r10 == 0) goto L_0x0077
            int r4 = r10.f545a
            r5 = -1
            if (r4 != r5) goto L_0x006e
            int r4 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r6 = r10.f546b
            android.graphics.drawable.Icon r6 = (android.graphics.drawable.Icon) r6
            r7 = 28
            if (r4 < r7) goto L_0x002f
            int r4 = r6.getType()
            goto L_0x006e
        L_0x002f:
            java.lang.Class r4 = r6.getClass()     // Catch:{ IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004f, NoSuchMethodException -> 0x0048 }
            java.lang.String r7 = "getType"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004f, NoSuchMethodException -> 0x0048 }
            java.lang.reflect.Method r4 = r4.getMethod(r7, r8)     // Catch:{ IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004f, NoSuchMethodException -> 0x0048 }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004f, NoSuchMethodException -> 0x0048 }
            java.lang.Object r4 = r4.invoke(r6, r7)     // Catch:{ IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004f, NoSuchMethodException -> 0x0048 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004f, NoSuchMethodException -> 0x0048 }
            int r4 = r4.intValue()     // Catch:{ IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004f, NoSuchMethodException -> 0x0048 }
            goto L_0x006e
        L_0x0048:
            r4 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            goto L_0x005c
        L_0x004f:
            r4 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            goto L_0x005c
        L_0x0056:
            r4 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
        L_0x005c:
            java.lang.String r8 = "Unable to get icon type "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "IconCompat"
            android.util.Log.e(r7, r6, r4)
            r4 = r5
        L_0x006e:
            r5 = 2
            if (r4 != r5) goto L_0x0077
            int r10 = r10.mo685a()
            r9.f3964i = r10
        L_0x0077:
            java.lang.CharSequence r10 = p124p.p150h.p151d.C1319g.m3364c(r11)
            r9.f3965j = r10
            r9.f3966k = r12
            r9.f3956a = r1
            r9.f3958c = r0
            r9.f3959d = r0
            r9.f3960e = r2
            r9.f3962g = r3
            r9.f3961f = r2
            r9.f3963h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p150h.p151d.C1317e.<init>(int, java.lang.CharSequence, android.app.PendingIntent):void");
    }

    /* renamed from: a */
    public IconCompat mo5783a() {
        if (this.f3957b == null) {
            int i = this.f3964i;
            if (i != 0) {
                this.f3957b = IconCompat.m225a(null, Objects.EMPTY_STRING, i);
            }
        }
        return this.f3957b;
    }
}
