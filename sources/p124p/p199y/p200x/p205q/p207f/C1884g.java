package p124p.p199y.p200x.p205q.p207f;

import android.content.Context;
import p124p.p199y.p200x.p210t.p212q.C1962a;

/* renamed from: p.y.x.q.f.g */
public class C1884g {

    /* renamed from: e */
    public static C1884g f5483e;

    /* renamed from: a */
    public C1874a f5484a;

    /* renamed from: b */
    public C1875b f5485b;

    /* renamed from: c */
    public C1880e f5486c;

    /* renamed from: d */
    public C1883f f5487d;

    public C1884g(Context context, C1962a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f5484a = new C1874a(applicationContext, aVar);
        this.f5485b = new C1875b(applicationContext, aVar);
        this.f5486c = new C1880e(applicationContext, aVar);
        this.f5487d = new C1883f(applicationContext, aVar);
    }

    /* renamed from: a */
    public static synchronized C1884g m4630a(Context context, C1962a aVar) {
        C1884g gVar;
        synchronized (C1884g.class) {
            if (f5483e == null) {
                f5483e = new C1884g(context, aVar);
            }
            gVar = f5483e;
        }
        return gVar;
    }
}
