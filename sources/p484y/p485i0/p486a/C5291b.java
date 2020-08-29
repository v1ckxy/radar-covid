package p484y.p485i0.p486a;

import com.google.gson.Gson;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import p213q.p217b.p355e.C4344s;
import p213q.p217b.p355e.p362x.C4400c;
import p410v.C4716h0;
import p410v.C4879z;
import p423w.C4892f;
import p423w.C4894g;
import p484y.C5280h;

/* renamed from: y.i0.a.b */
public final class C5291b<T> implements C5280h<T, C4716h0> {

    /* renamed from: c */
    public static final C4879z f12589c = C4879z.m10906a("application/json; charset=UTF-8");

    /* renamed from: d */
    public static final Charset f12590d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final Gson f12591a;

    /* renamed from: b */
    public final C4344s<T> f12592b;

    public C5291b(Gson gson, C4344s<T> sVar) {
        this.f12591a = gson;
        this.f12592b = sVar;
    }

    /* renamed from: a */
    public Object mo11984a(Object obj) {
        C4892f fVar = new C4892f();
        C4400c a = this.f12591a.mo3081a((Writer) new OutputStreamWriter(new C4894g(fVar), f12590d));
        this.f12592b.mo3073a(a, obj);
        a.close();
        return C4716h0.m10396a(f12589c, fVar.mo11464m());
    }
}
