package p392u.p409w;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p392u.C4553f;
import p392u.C4557i;
import p392u.p401r.p402b.C4622p;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.p404p.C4646a;
import p392u.p406t.C4655c;
import p392u.p406t.C4656d;
import p392u.p408v.C4669d;

/* renamed from: u.w.b */
public final class C4675b implements C4669d<C4655c> {

    /* renamed from: a */
    public final CharSequence f10863a;

    /* renamed from: b */
    public final int f10864b;

    /* renamed from: c */
    public final int f10865c;

    /* renamed from: d */
    public final C4622p<CharSequence, Integer, C4553f<Integer, Integer>> f10866d;

    /* renamed from: u.w.b$a */
    public static final class C4676a implements Iterator<C4655c>, C4646a {

        /* renamed from: e */
        public int f10867e = -1;

        /* renamed from: f */
        public int f10868f;

        /* renamed from: g */
        public int f10869g;

        /* renamed from: h */
        public C4655c f10870h;

        /* renamed from: i */
        public int f10871i;

        /* renamed from: j */
        public final /* synthetic */ C4675b f10872j;

        public C4676a(C4675b bVar) {
            this.f10872j = bVar;
            int a = C4656d.m10288a(bVar.f10864b, 0, bVar.f10863a.length());
            this.f10868f = a;
            this.f10869g = a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r4 < r0) goto L_0x001b;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo10960b() {
            /*
                r6 = this;
                int r0 = r6.f10869g
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f10867e = r1
                r0 = 0
                r6.f10870h = r0
                goto L_0x0080
            L_0x000c:
                u.w.b r0 = r6.f10872j
                int r0 = r0.f10865c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x001b
                int r4 = r6.f10871i
                int r4 = r4 + r3
                r6.f10871i = r4
                if (r4 >= r0) goto L_0x0027
            L_0x001b:
                int r0 = r6.f10869g
                u.w.b r4 = r6.f10872j
                java.lang.CharSequence r4 = r4.f10863a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0037
            L_0x0027:
                int r0 = r6.f10868f
                u.t.c r1 = new u.t.c
                u.w.b r4 = r6.f10872j
                java.lang.CharSequence r4 = r4.f10863a
                int r4 = p392u.p409w.C4681g.m10301a(r4)
                r1.<init>(r0, r4)
                goto L_0x005a
            L_0x0037:
                u.w.b r0 = r6.f10872j
                u.r.b.p<java.lang.CharSequence, java.lang.Integer, u.f<java.lang.Integer, java.lang.Integer>> r4 = r0.f10866d
                java.lang.CharSequence r0 = r0.f10863a
                int r5 = r6.f10869g
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r4.mo3781a(r0, r5)
                u.f r0 = (p392u.C4553f) r0
                if (r0 != 0) goto L_0x005d
                int r0 = r6.f10868f
                u.t.c r1 = new u.t.c
                u.w.b r4 = r6.f10872j
                java.lang.CharSequence r4 = r4.f10863a
                int r4 = p392u.p409w.C4681g.m10301a(r4)
                r1.<init>(r0, r4)
            L_0x005a:
                r6.f10870h = r1
                goto L_0x007c
            L_0x005d:
                A r2 = r0.f10766e
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.f10767f
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f10868f
                u.t.c r4 = p392u.p406t.C4656d.m10291b(r4, r2)
                r6.f10870h = r4
                int r2 = r2 + r0
                r6.f10868f = r2
                if (r0 != 0) goto L_0x007b
                r1 = r3
            L_0x007b:
                int r2 = r2 + r1
            L_0x007c:
                r6.f10869g = r2
                r6.f10867e = r3
            L_0x0080:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p392u.p409w.C4675b.C4676a.mo10960b():void");
        }

        public boolean hasNext() {
            if (this.f10867e == -1) {
                mo10960b();
            }
            return this.f10867e == 1;
        }

        public Object next() {
            if (this.f10867e == -1) {
                mo10960b();
            }
            if (this.f10867e != 0) {
                C4655c cVar = this.f10870h;
                if (cVar != null) {
                    this.f10870h = null;
                    this.f10867e = -1;
                    return cVar;
                }
                throw new C4557i("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C4675b(CharSequence charSequence, int i, int i2, C4622p<? super CharSequence, ? super Integer, C4553f<Integer, Integer>> pVar) {
        if (charSequence == null) {
            C4638h.m10271a("input");
            throw null;
        } else if (pVar != null) {
            this.f10863a = charSequence;
            this.f10864b = i;
            this.f10865c = i2;
            this.f10866d = pVar;
        } else {
            C4638h.m10271a("getNextMatch");
            throw null;
        }
    }

    public Iterator<C4655c> iterator() {
        return new C4676a(this);
    }
}
