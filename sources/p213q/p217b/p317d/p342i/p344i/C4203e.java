package p213q.p217b.p317d.p342i.p344i;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p116io.jsonwebtoken.lang.DateFormats;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p342i.C4192c;
import p213q.p217b.p317d.p342i.C4193d;
import p213q.p217b.p317d.p342i.C4195f;
import p213q.p217b.p317d.p342i.C4196g;
import p213q.p217b.p317d.p342i.p343h.C4198b;

/* renamed from: q.b.d.i.i.e */
public final class C4203e implements C4198b<C4203e> {

    /* renamed from: e */
    public static final C4193d<Object> f10134e = C4199a.f10130a;

    /* renamed from: f */
    public static final C4195f<String> f10135f = C4200b.f10131a;

    /* renamed from: g */
    public static final C4195f<Boolean> f10136g = C4201c.f10132a;

    /* renamed from: h */
    public static final C4204a f10137h = new C4204a(null);

    /* renamed from: a */
    public final Map<Class<?>, C4193d<?>> f10138a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, C4195f<?>> f10139b;

    /* renamed from: c */
    public C4193d<Object> f10140c;

    /* renamed from: d */
    public boolean f10141d = true;

    /* renamed from: q.b.d.i.i.e$a */
    public static final class C4204a implements C4195f<Date> {

        /* renamed from: a */
        public static final DateFormat f10142a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateFormats.ISO_8601_MILLIS_PATTERN, Locale.US);
            f10142a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public /* synthetic */ C4204a(C4202d dVar) {
        }

        /* renamed from: a */
        public void mo6969a(Object obj, Object obj2) {
            ((C4196g) obj2).mo10388a(f10142a.format((Date) obj));
        }
    }

    public C4203e() {
        HashMap hashMap = new HashMap();
        this.f10139b = hashMap;
        this.f10140c = f10134e;
        this.f10141d = false;
        Class<String> cls = String.class;
        hashMap.put(cls, f10135f);
        this.f10138a.remove(cls);
        Class<Boolean> cls2 = Boolean.class;
        this.f10139b.put(cls2, f10136g);
        this.f10138a.remove(cls2);
        Class<Date> cls3 = Date.class;
        this.f10139b.put(cls3, f10137h);
        this.f10138a.remove(cls3);
    }

    /* renamed from: a */
    public static /* synthetic */ void m9671a(Object obj) {
        StringBuilder a = C1965a.m4756a("Couldn't find encoder for type ");
        a.append(obj.getClass().getCanonicalName());
        throw new C4192c(a.toString());
    }
}
