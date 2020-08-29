package p124p.p150h.p160j;

/* renamed from: p.h.j.d */
public final class C1374d {

    /* renamed from: a */
    public static final C1373c f4128a = new C1379e(null, false);

    /* renamed from: b */
    public static final C1373c f4129b = new C1379e(null, true);

    /* renamed from: c */
    public static final C1373c f4130c = new C1379e(C1376b.f4134a, false);

    /* renamed from: d */
    public static final C1373c f4131d = new C1379e(C1376b.f4134a, true);

    /* renamed from: p.h.j.d$a */
    public static class C1375a implements C1377c {

        /* renamed from: b */
        public static final C1375a f4132b = new C1375a(true);

        /* renamed from: a */
        public final boolean f4133a;

        public C1375a(boolean z) {
            this.f4133a = z;
        }

        /* renamed from: a */
        public int mo5854a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = C1374d.m3456a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.f4133a) {
                        return 1;
                    }
                } else if (this.f4133a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f4133a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: p.h.j.d$b */
    public static class C1376b implements C1377c {

        /* renamed from: a */
        public static final C1376b f4134a = new C1376b();

        /* renamed from: a */
        public int mo5854a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C1374d.m3457b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: p.h.j.d$c */
    public interface C1377c {
        /* renamed from: a */
        int mo5854a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: p.h.j.d$d */
    public static abstract class C1378d implements C1373c {

        /* renamed from: a */
        public final C1377c f4135a;

        public C1378d(C1377c cVar) {
            this.f4135a = cVar;
        }

        /* renamed from: a */
        public abstract boolean mo5855a();

        /* renamed from: a */
        public boolean mo5856a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            C1377c cVar = this.f4135a;
            if (cVar == null) {
                return mo5855a();
            }
            int a = cVar.mo5854a(charSequence, i, i2);
            boolean z = true;
            if (a != 0) {
                z = a != 1 ? mo5855a() : false;
            }
            return z;
        }
    }

    /* renamed from: p.h.j.d$e */
    public static class C1379e extends C1378d {

        /* renamed from: b */
        public final boolean f4136b;

        public C1379e(C1377c cVar, boolean z) {
            super(cVar);
            this.f4136b = z;
        }

        /* renamed from: a */
        public boolean mo5855a() {
            return this.f4136b;
        }
    }

    static {
        C1375a aVar = C1375a.f4132b;
    }

    /* renamed from: a */
    public static int m3456a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    public static int m3457b(int i) {
        if (i != 0) {
            if (!(i == 1 || i == 2)) {
                switch (i) {
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                        break;
                    default:
                        return 2;
                }
            }
            return 0;
        }
        return 1;
    }
}
