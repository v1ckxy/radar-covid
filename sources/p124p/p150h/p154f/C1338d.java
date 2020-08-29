package p124p.p150h.p154f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.Log;
import p124p.p143e.C1254f;
import p124p.p150h.p152e.p153b.C1327b;
import p124p.p150h.p152e.p153b.C1328c;
import p124p.p150h.p152e.p153b.C1330e;
import p124p.p150h.p152e.p153b.C1332g;
import p124p.p150h.p159i.C1355b;

@SuppressLint({"NewApi"})
/* renamed from: p.h.f.d */
public class C1338d {

    /* renamed from: a */
    public static final C1344j f4041a;

    /* renamed from: b */
    public static final C1254f<String, Typeface> f4042b = new C1254f<>(16);

    static {
        C1344j jVar;
        int i = VERSION.SDK_INT;
        if (i >= 29) {
            jVar = new C1343i();
        } else if (i >= 28) {
            jVar = new C1342h();
        } else if (i >= 26) {
            jVar = new C1341g();
        } else {
            if (i >= 24) {
                if (C1340f.f4050d == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (C1340f.f4050d != null) {
                    jVar = new C1340f();
                }
            }
            jVar = new C1339e();
        }
        f4041a = jVar;
    }

    /* renamed from: a */
    public static Typeface m3393a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f4041a.mo5801a(context, resources, i, str, i2);
        if (a != null) {
            f4042b.mo5526a(m3396a(resources, i, i2), a);
        }
        return a;
    }

    /* renamed from: a */
    public static Typeface m3394a(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: a */
    public static Typeface m3395a(Context context, C1327b bVar, Resources resources, int i, int i2, C1332g gVar, Handler handler, boolean z) {
        Typeface typeface;
        if (bVar instanceof C1330e) {
            C1330e eVar = (C1330e) bVar;
            boolean z2 = false;
            if (!z ? gVar == null : eVar.f4027c == 0) {
                z2 = true;
            }
            typeface = C1355b.m3439a(context, eVar.f4025a, gVar, handler, z2, z ? eVar.f4026b : -1, i2);
        } else {
            typeface = f4041a.mo5800a(context, (C1328c) bVar, resources, i2);
            if (gVar != null) {
                if (typeface != null) {
                    gVar.mo5793a(typeface, handler);
                } else {
                    gVar.mo5792a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f4042b.mo5526a(m3396a(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: a */
    public static String m3396a(Resources resources, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        String str = "-";
        sb.append(str);
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }
}
