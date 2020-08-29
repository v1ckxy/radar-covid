package p124p.p150h.p162l;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.view.WindowInsets.Builder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Objects;
import p124p.p150h.p154f.C1336b;

/* renamed from: p.h.l.x */
public class C1419x {

    /* renamed from: a */
    public final C1427h f4187a;

    /* renamed from: p.h.l.x$a */
    public static class C1420a extends C1422c {

        /* renamed from: c */
        public static Field f4188c = null;

        /* renamed from: d */
        public static boolean f4189d = false;

        /* renamed from: e */
        public static Constructor<WindowInsets> f4190e = null;

        /* renamed from: f */
        public static boolean f4191f = false;

        /* renamed from: b */
        public WindowInsets f4192b;

        public C1420a() {
            String str = "WindowInsetsCompat";
            if (!f4189d) {
                try {
                    f4188c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i(str, "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f4189d = true;
            }
            Field field = f4188c;
            WindowInsets windowInsets = null;
            if (field != null) {
                try {
                    WindowInsets windowInsets2 = (WindowInsets) field.get(null);
                    if (windowInsets2 != null) {
                        windowInsets = new WindowInsets(windowInsets2);
                        this.f4192b = windowInsets;
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i(str, "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f4191f) {
                try {
                    f4190e = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e3) {
                    Log.i(str, "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f4191f = true;
            }
            Constructor<WindowInsets> constructor = f4190e;
            if (constructor != null) {
                try {
                    windowInsets = (WindowInsets) constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e4) {
                    Log.i(str, "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            this.f4192b = windowInsets;
        }

        public C1420a(C1419x xVar) {
            this.f4192b = xVar.mo5927f();
        }

        /* renamed from: a */
        public C1419x mo5929a() {
            return C1419x.m3601a(this.f4192b);
        }

        /* renamed from: a */
        public void mo5930a(C1336b bVar) {
            WindowInsets windowInsets = this.f4192b;
            if (windowInsets != null) {
                this.f4192b = windowInsets.replaceSystemWindowInsets(bVar.f4035a, bVar.f4036b, bVar.f4037c, bVar.f4038d);
            }
        }
    }

    /* renamed from: p.h.l.x$b */
    public static class C1421b extends C1422c {

        /* renamed from: b */
        public final Builder f4193b;

        public C1421b() {
            this.f4193b = new Builder();
        }

        public C1421b(C1419x xVar) {
            Builder builder;
            WindowInsets f = xVar.mo5927f();
            if (f != null) {
                builder = new Builder(f);
            } else {
                builder = new Builder();
            }
            this.f4193b = builder;
        }

        /* renamed from: a */
        public C1419x mo5929a() {
            return C1419x.m3601a(this.f4193b.build());
        }

        /* renamed from: a */
        public void mo5930a(C1336b bVar) {
            this.f4193b.setSystemWindowInsets(Insets.of(bVar.f4035a, bVar.f4036b, bVar.f4037c, bVar.f4038d));
        }
    }

    /* renamed from: p.h.l.x$c */
    public static class C1422c {

        /* renamed from: a */
        public final C1419x f4194a = new C1419x((C1419x) null);

        /* renamed from: a */
        public C1419x mo5929a() {
            throw null;
        }

        /* renamed from: a */
        public void mo5930a(C1336b bVar) {
            throw null;
        }
    }

    /* renamed from: p.h.l.x$d */
    public static class C1423d extends C1427h {

        /* renamed from: b */
        public final WindowInsets f4195b;

        /* renamed from: c */
        public C1336b f4196c = null;

        public C1423d(C1419x xVar, WindowInsets windowInsets) {
            super(xVar);
            this.f4195b = windowInsets;
        }

        public C1423d(C1419x xVar, C1423d dVar) {
            WindowInsets windowInsets = new WindowInsets(dVar.f4195b);
            super(xVar);
            this.f4195b = windowInsets;
        }

        /* renamed from: f */
        public final C1336b mo5931f() {
            if (this.f4196c == null) {
                this.f4196c = C1336b.m3390a(this.f4195b.getSystemWindowInsetLeft(), this.f4195b.getSystemWindowInsetTop(), this.f4195b.getSystemWindowInsetRight(), this.f4195b.getSystemWindowInsetBottom());
            }
            return this.f4196c;
        }

        /* renamed from: h */
        public boolean mo5932h() {
            return this.f4195b.isRound();
        }
    }

    /* renamed from: p.h.l.x$e */
    public static class C1424e extends C1423d {

        /* renamed from: d */
        public C1336b f4197d = null;

        public C1424e(C1419x xVar, WindowInsets windowInsets) {
            super(xVar, windowInsets);
        }

        public C1424e(C1419x xVar, C1424e eVar) {
            super(xVar, (C1423d) eVar);
        }

        /* renamed from: b */
        public C1419x mo5933b() {
            return C1419x.m3601a(this.f4195b.consumeStableInsets());
        }

        /* renamed from: c */
        public C1419x mo5934c() {
            return C1419x.m3601a(this.f4195b.consumeSystemWindowInsets());
        }

        /* renamed from: e */
        public final C1336b mo5935e() {
            if (this.f4197d == null) {
                this.f4197d = C1336b.m3390a(this.f4195b.getStableInsetLeft(), this.f4195b.getStableInsetTop(), this.f4195b.getStableInsetRight(), this.f4195b.getStableInsetBottom());
            }
            return this.f4197d;
        }

        /* renamed from: g */
        public boolean mo5936g() {
            return this.f4195b.isConsumed();
        }
    }

    /* renamed from: p.h.l.x$f */
    public static class C1425f extends C1424e {
        public C1425f(C1419x xVar, WindowInsets windowInsets) {
            super(xVar, windowInsets);
        }

        public C1425f(C1419x xVar, C1425f fVar) {
            super(xVar, (C1424e) fVar);
        }

        /* renamed from: a */
        public C1419x mo5937a() {
            return C1419x.m3601a(this.f4195b.consumeDisplayCutout());
        }

        /* renamed from: d */
        public C1391c mo5938d() {
            DisplayCutout displayCutout = this.f4195b.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new C1391c(displayCutout);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1425f)) {
                return false;
            }
            return Objects.equals(this.f4195b, ((C1425f) obj).f4195b);
        }

        public int hashCode() {
            return this.f4195b.hashCode();
        }
    }

    /* renamed from: p.h.l.x$g */
    public static class C1426g extends C1425f {
        public C1426g(C1419x xVar, WindowInsets windowInsets) {
            super(xVar, windowInsets);
        }

        public C1426g(C1419x xVar, C1426g gVar) {
            super(xVar, (C1425f) gVar);
        }
    }

    /* renamed from: p.h.l.x$h */
    public static class C1427h {

        /* renamed from: a */
        public final C1419x f4198a;

        public C1427h(C1419x xVar) {
            this.f4198a = xVar;
        }

        /* renamed from: a */
        public C1419x mo5937a() {
            return this.f4198a;
        }

        /* renamed from: b */
        public C1419x mo5933b() {
            return this.f4198a;
        }

        /* renamed from: c */
        public C1419x mo5934c() {
            return this.f4198a;
        }

        /* renamed from: d */
        public C1391c mo5938d() {
            return null;
        }

        /* renamed from: e */
        public C1336b mo5935e() {
            return C1336b.f4034e;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1427h)) {
                return false;
            }
            C1427h hVar = (C1427h) obj;
            if (mo5932h() != hVar.mo5932h() || mo5936g() != hVar.mo5936g() || !Objects.equals(mo5931f(), hVar.mo5931f()) || !Objects.equals(mo5935e(), hVar.mo5935e()) || !Objects.equals(mo5938d(), hVar.mo5938d())) {
                z = false;
            }
            return z;
        }

        /* renamed from: f */
        public C1336b mo5931f() {
            return C1336b.f4034e;
        }

        /* renamed from: g */
        public boolean mo5936g() {
            return false;
        }

        /* renamed from: h */
        public boolean mo5932h() {
            return false;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Boolean.valueOf(mo5932h()), Boolean.valueOf(mo5936g()), mo5931f(), mo5935e(), mo5938d()});
        }
    }

    static {
        (VERSION.SDK_INT >= 29 ? new C1421b() : new C1420a()).mo5929a().f4187a.mo5937a().f4187a.mo5933b().f4187a.mo5934c();
    }

    public C1419x(WindowInsets windowInsets) {
        int i = VERSION.SDK_INT;
        C1427h hVar = i >= 29 ? new C1426g(this, windowInsets) : i >= 28 ? new C1425f(this, windowInsets) : new C1424e(this, windowInsets);
        this.f4187a = hVar;
    }

    public C1419x(C1419x xVar) {
        C1427h hVar;
        C1427h hVar2;
        if (xVar != null) {
            C1427h hVar3 = xVar.f4187a;
            if (VERSION.SDK_INT >= 29 && (hVar3 instanceof C1426g)) {
                hVar2 = new C1426g(this, (C1426g) hVar3);
            } else if (VERSION.SDK_INT >= 28 && (hVar3 instanceof C1425f)) {
                hVar2 = new C1425f(this, (C1425f) hVar3);
            } else if (hVar3 instanceof C1424e) {
                hVar2 = new C1424e(this, (C1424e) hVar3);
            } else if (hVar3 instanceof C1423d) {
                hVar2 = new C1423d(this, (C1423d) hVar3);
            } else {
                hVar = new C1427h(this);
            }
            this.f4187a = hVar2;
            return;
        }
        hVar = new C1427h(this);
        this.f4187a = hVar;
    }

    /* renamed from: a */
    public static C1419x m3601a(WindowInsets windowInsets) {
        if (windowInsets != null) {
            return new C1419x(windowInsets);
        }
        throw null;
    }

    /* renamed from: a */
    public int mo5921a() {
        return mo5925e().f4038d;
    }

    /* renamed from: b */
    public int mo5922b() {
        return mo5925e().f4035a;
    }

    /* renamed from: c */
    public int mo5923c() {
        return mo5925e().f4037c;
    }

    /* renamed from: d */
    public int mo5924d() {
        return mo5925e().f4036b;
    }

    /* renamed from: e */
    public C1336b mo5925e() {
        return this.f4187a.mo5931f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1419x)) {
            return false;
        }
        return Objects.equals(this.f4187a, ((C1419x) obj).f4187a);
    }

    /* renamed from: f */
    public WindowInsets mo5927f() {
        C1427h hVar = this.f4187a;
        if (hVar instanceof C1423d) {
            return ((C1423d) hVar).f4195b;
        }
        return null;
    }

    public int hashCode() {
        C1427h hVar = this.f4187a;
        if (hVar == null) {
            return 0;
        }
        return hVar.hashCode();
    }
}
