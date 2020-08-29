package p392u.p409w;

import java.util.List;
import p392u.C4553f;
import p392u.p401r.p402b.C4622p;
import p392u.p401r.p403c.C4639i;

/* renamed from: u.w.i */
public final class C4683i extends C4639i implements C4622p<CharSequence, Integer, C4553f<? extends Integer, ? extends Integer>> {

    /* renamed from: f */
    public final /* synthetic */ List f10878f;

    /* renamed from: g */
    public final /* synthetic */ boolean f10879g;

    public C4683i(List list, boolean z) {
        this.f10878f = list;
        this.f10879g = z;
        super(2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo3781a(java.lang.Object r14, java.lang.Object r15) {
        /*
            r13 = this;
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            r6 = 0
            if (r14 == 0) goto L_0x00f4
            java.util.List r7 = r13.f10878f
            boolean r8 = r13.f10879g
            r0 = 0
            if (r8 != 0) goto L_0x004b
            int r1 = r7.size()
            r2 = 1
            if (r1 != r2) goto L_0x004b
            int r1 = r7.size()
            if (r1 == 0) goto L_0x0043
            if (r1 != r2) goto L_0x003b
            java.lang.Object r1 = r7.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 4
            int r14 = p392u.p409w.C4681g.m10306a(r14, r1, r15, r0, r2)
            if (r14 >= 0) goto L_0x0030
            goto L_0x00dd
        L_0x0030:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            u.f r15 = new u.f
            r15.<init>(r14, r1)
            goto L_0x00de
        L_0x003b:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "List has more than one element."
            r14.<init>(r15)
            throw r14
        L_0x0043:
            java.util.NoSuchElementException r14 = new java.util.NoSuchElementException
            java.lang.String r15 = "List is empty."
            r14.<init>(r15)
            throw r14
        L_0x004b:
            if (r15 >= 0) goto L_0x004e
            r15 = r0
        L_0x004e:
            u.t.c r0 = new u.t.c
            int r1 = r14.length()
            r0.<init>(r15, r1)
            boolean r15 = r14 instanceof java.lang.String
            if (r15 == 0) goto L_0x009d
            int r15 = r0.f10839e
            int r9 = r0.f10840f
            int r10 = r0.f10841g
            if (r10 < 0) goto L_0x0066
            if (r15 > r9) goto L_0x00dd
            goto L_0x0068
        L_0x0066:
            if (r15 < r9) goto L_0x00dd
        L_0x0068:
            java.util.Iterator r11 = r7.iterator()
        L_0x006c:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x008a
            java.lang.Object r12 = r11.next()
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            r2 = r14
            java.lang.String r2 = (java.lang.String) r2
            int r4 = r0.length()
            r3 = r15
            r5 = r8
            boolean r0 = p392u.p409w.C4681g.m10319a(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x006c
            goto L_0x008b
        L_0x008a:
            r12 = r6
        L_0x008b:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x0099
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            u.f r15 = new u.f
            r15.<init>(r14, r12)
            goto L_0x00de
        L_0x0099:
            if (r15 == r9) goto L_0x00dd
            int r15 = r15 + r10
            goto L_0x0068
        L_0x009d:
            int r15 = r0.f10839e
            int r9 = r0.f10840f
            int r10 = r0.f10841g
            if (r10 < 0) goto L_0x00a8
            if (r15 > r9) goto L_0x00dd
            goto L_0x00aa
        L_0x00a8:
            if (r15 < r9) goto L_0x00dd
        L_0x00aa:
            java.util.Iterator r11 = r7.iterator()
        L_0x00ae:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r12 = r11.next()
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            int r4 = r0.length()
            r2 = r14
            r3 = r15
            r5 = r8
            boolean r0 = p392u.p409w.C4681g.m10317a(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00ae
            goto L_0x00cb
        L_0x00ca:
            r12 = r6
        L_0x00cb:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x00d9
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            u.f r15 = new u.f
            r15.<init>(r14, r12)
            goto L_0x00de
        L_0x00d9:
            if (r15 == r9) goto L_0x00dd
            int r15 = r15 + r10
            goto L_0x00aa
        L_0x00dd:
            r15 = r6
        L_0x00de:
            if (r15 == 0) goto L_0x00f3
            A r14 = r15.f10766e
            B r15 = r15.f10767f
            java.lang.String r15 = (java.lang.String) r15
            int r15 = r15.length()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            u.f r6 = new u.f
            r6.<init>(r14, r15)
        L_0x00f3:
            return r6
        L_0x00f4:
            java.lang.String r14 = "$receiver"
            p392u.p401r.p403c.C4638h.m10271a(r14)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p392u.p409w.C4683i.mo3781a(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
