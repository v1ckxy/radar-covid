package p425x.p472b.p473a.p474a.p476l.p481o;

import com.google.gson.Gson;
import p124p.p150h.p161k.C1386f;

/* renamed from: x.b.a.a.l.o.a */
public final class C5243a {

    /* renamed from: a */
    public static final Gson f12482a = new Gson();

    /* renamed from: a */
    public static <T> T m11694a(String str, Class<T> cls) {
        return f12482a.mo3076a(str, cls);
    }

    /* renamed from: a */
    public static <T> T m11695a(String str, Class<T> cls, C1386f<T> fVar) {
        try {
            return f12482a.mo3076a(str, cls);
        } catch (Exception unused) {
            return fVar.get();
        }
    }

    /* renamed from: a */
    public static <T> String m11696a(T t) {
        return f12482a.mo3078a((Object) t);
    }
}
