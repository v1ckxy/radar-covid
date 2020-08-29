package p124p.p180p.p181d;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0107f;
import java.util.ArrayList;
import java.util.List;
import p124p.p150h.p161k.C1384d;
import p124p.p180p.p181d.C1602q.C1603a;

/* renamed from: p.p.d.a */
public final class C1570a implements C1603a {

    /* renamed from: a */
    public C1384d<C1572b> f4585a = new C1384d<>(30);

    /* renamed from: b */
    public final ArrayList<C1572b> f4586b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<C1572b> f4587c = new ArrayList<>();

    /* renamed from: d */
    public final C1571a f4588d;

    /* renamed from: e */
    public final boolean f4589e;

    /* renamed from: f */
    public final C1602q f4590f;

    /* renamed from: g */
    public int f4591g = 0;

    /* renamed from: p.p.d.a$a */
    public interface C1571a {
    }

    /* renamed from: p.p.d.a$b */
    public static final class C1572b {

        /* renamed from: a */
        public int f4592a;

        /* renamed from: b */
        public int f4593b;

        /* renamed from: c */
        public Object f4594c;

        /* renamed from: d */
        public int f4595d;

        public C1572b(int i, int i2, int i3, Object obj) {
            this.f4592a = i;
            this.f4593b = i2;
            this.f4595d = i3;
            this.f4594c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1572b)) {
                return false;
            }
            C1572b bVar = (C1572b) obj;
            int i = this.f4592a;
            if (i != bVar.f4592a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f4595d - this.f4593b) == 1 && this.f4595d == bVar.f4593b && this.f4593b == bVar.f4595d) {
                return true;
            }
            if (this.f4595d != bVar.f4595d || this.f4593b != bVar.f4593b) {
                return false;
            }
            Object obj2 = this.f4594c;
            Object obj3 = bVar.f4594c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f4592a * 31) + this.f4593b) * 31) + this.f4595d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f4592a;
            String str = i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
            sb.append(str);
            sb.append(",s:");
            sb.append(this.f4593b);
            sb.append("c:");
            sb.append(this.f4595d);
            sb.append(",p:");
            sb.append(this.f4594c);
            sb.append("]");
            return sb.toString();
        }
    }

    public C1570a(C1571a aVar) {
        this.f4588d = aVar;
        this.f4589e = false;
        this.f4590f = new C1602q(this);
    }

    /* renamed from: a */
    public int mo6257a(int i, int i2) {
        int size = this.f4587c.size();
        while (i2 < size) {
            C1572b bVar = (C1572b) this.f4587c.get(i2);
            int i3 = bVar.f4592a;
            if (i3 == 8) {
                int i4 = bVar.f4593b;
                if (i4 == i) {
                    i = bVar.f4595d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f4595d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f4593b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f4595d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f4595d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: a */
    public C1572b mo6258a(int i, int i2, int i3, Object obj) {
        C1572b bVar = (C1572b) this.f4585a.mo5864a();
        if (bVar == null) {
            return new C1572b(i, i2, i3, obj);
        }
        bVar.f4592a = i;
        bVar.f4593b = i2;
        bVar.f4595d = i3;
        bVar.f4594c = obj;
        return bVar;
    }

    /* renamed from: a */
    public void mo6259a() {
        int size = this.f4587c.size();
        for (int i = 0; i < size; i++) {
            ((C0107f) this.f4588d).mo1172a((C1572b) this.f4587c.get(i));
        }
        mo6260a((List<C1572b>) this.f4587c);
        this.f4591g = 0;
    }

    /* renamed from: a */
    public void mo6260a(List<C1572b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo6267c((C1572b) list.get(i));
        }
        list.clear();
    }

    /* renamed from: a */
    public final boolean mo6263a(int i) {
        int size = this.f4587c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1572b bVar = (C1572b) this.f4587c.get(i2);
            int i3 = bVar.f4592a;
            if (i3 == 8) {
                if (mo6257a(bVar.f4595d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f4593b;
                int i5 = bVar.f4595d + i4;
                while (i4 < i5) {
                    if (mo6257a(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo6265b() {
        mo6259a();
        int size = this.f4586b.size();
        for (int i = 0; i < size; i++) {
            C1572b bVar = (C1572b) this.f4586b.get(i);
            int i2 = bVar.f4592a;
            if (i2 == 1) {
                ((C0107f) this.f4588d).mo1172a(bVar);
                C1571a aVar = this.f4588d;
                C0107f fVar = (C0107f) aVar;
                RecyclerView.this.offsetPositionRecordsForInsert(bVar.f4593b, bVar.f4595d);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            } else if (i2 == 2) {
                ((C0107f) this.f4588d).mo1172a(bVar);
                C1571a aVar2 = this.f4588d;
                int i3 = bVar.f4593b;
                int i4 = bVar.f4595d;
                C0107f fVar2 = (C0107f) aVar2;
                RecyclerView.this.offsetPositionRecordsForRemove(i3, i4, true);
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mItemsAddedOrRemoved = true;
                recyclerView.mState.f734c += i4;
            } else if (i2 == 4) {
                ((C0107f) this.f4588d).mo1172a(bVar);
                ((C0107f) this.f4588d).mo1171a(bVar.f4593b, bVar.f4595d, bVar.f4594c);
            } else if (i2 == 8) {
                ((C0107f) this.f4588d).mo1172a(bVar);
                C1571a aVar3 = this.f4588d;
                C0107f fVar3 = (C0107f) aVar3;
                RecyclerView.this.offsetPositionRecordsForMove(bVar.f4593b, bVar.f4595d);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }
        }
        mo6260a((List<C1572b>) this.f4586b);
        this.f4591g = 0;
    }

    /* renamed from: c */
    public void mo6267c(C1572b bVar) {
        if (!this.f4589e) {
            bVar.f4594c = null;
            this.f4585a.mo5865a(bVar);
        }
    }

    /* renamed from: c */
    public boolean mo6268c() {
        return this.f4586b.size() > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0193, code lost:
        if (r6 >= r12.f4593b) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0169, code lost:
        if (r6 > r12.f4593b) goto L_0x0195;
     */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0140  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6269d() {
        /*
            r16 = this;
            r0 = r16
            p.p.d.q r1 = r0.f4590f
            java.util.ArrayList<p.p.d.a$b> r2 = r0.f4586b
            r3 = 0
            if (r1 == 0) goto L_0x02cf
        L_0x0009:
            int r4 = r2.size()
            r5 = 1
            int r4 = r4 - r5
            r7 = 0
        L_0x0010:
            r8 = 8
            r9 = -1
            if (r4 < 0) goto L_0x0026
            java.lang.Object r10 = r2.get(r4)
            p.p.d.a$b r10 = (p124p.p180p.p181d.C1570a.C1572b) r10
            int r10 = r10.f4592a
            if (r10 != r8) goto L_0x0022
            if (r7 == 0) goto L_0x0023
            goto L_0x0027
        L_0x0022:
            r7 = r5
        L_0x0023:
            int r4 = r4 + -1
            goto L_0x0010
        L_0x0026:
            r4 = r9
        L_0x0027:
            r7 = 4
            r10 = 2
            if (r4 == r9) goto L_0x01e5
            int r8 = r4 + 1
            java.lang.Object r11 = r2.get(r4)
            p.p.d.a$b r11 = (p124p.p180p.p181d.C1570a.C1572b) r11
            java.lang.Object r12 = r2.get(r8)
            p.p.d.a$b r12 = (p124p.p180p.p181d.C1570a.C1572b) r12
            int r13 = r12.f4592a
            if (r13 == r5) goto L_0x01b1
            if (r13 == r10) goto L_0x00b1
            if (r13 == r7) goto L_0x0042
            goto L_0x0009
        L_0x0042:
            int r6 = r11.f4595d
            int r9 = r12.f4593b
            if (r6 >= r9) goto L_0x004d
            int r9 = r9 + -1
            r12.f4593b = r9
            goto L_0x0063
        L_0x004d:
            int r10 = r12.f4595d
            int r9 = r9 + r10
            if (r6 >= r9) goto L_0x0063
            int r10 = r10 + -1
            r12.f4595d = r10
            p.p.d.q$a r6 = r1.f4728a
            int r9 = r11.f4593b
            java.lang.Object r10 = r12.f4594c
            p.p.d.a r6 = (p124p.p180p.p181d.C1570a) r6
            p.p.d.a$b r5 = r6.mo6258a(r7, r9, r5, r10)
            goto L_0x0064
        L_0x0063:
            r5 = r3
        L_0x0064:
            int r6 = r11.f4593b
            int r9 = r12.f4593b
            if (r6 > r9) goto L_0x006f
            int r9 = r9 + 1
            r12.f4593b = r9
            goto L_0x0087
        L_0x006f:
            int r10 = r12.f4595d
            int r9 = r9 + r10
            if (r6 >= r9) goto L_0x0087
            int r9 = r9 - r6
            p.p.d.q$a r10 = r1.f4728a
            int r6 = r6 + 1
            java.lang.Object r13 = r12.f4594c
            p.p.d.a r10 = (p124p.p180p.p181d.C1570a) r10
            p.p.d.a$b r6 = r10.mo6258a(r7, r6, r9, r13)
            int r7 = r12.f4595d
            int r7 = r7 - r9
            r12.f4595d = r7
            goto L_0x0088
        L_0x0087:
            r6 = r3
        L_0x0088:
            r2.set(r8, r11)
            int r7 = r12.f4595d
            if (r7 <= 0) goto L_0x0093
            r2.set(r4, r12)
            goto L_0x00a5
        L_0x0093:
            r2.remove(r4)
            p.p.d.q$a r7 = r1.f4728a
            p.p.d.a r7 = (p124p.p180p.p181d.C1570a) r7
            boolean r8 = r7.f4589e
            if (r8 != 0) goto L_0x00a5
            r12.f4594c = r3
            p.h.k.d<p.p.d.a$b> r7 = r7.f4585a
            r7.mo5865a(r12)
        L_0x00a5:
            if (r5 == 0) goto L_0x00aa
            r2.add(r4, r5)
        L_0x00aa:
            if (r6 == 0) goto L_0x0009
            r2.add(r4, r6)
            goto L_0x0009
        L_0x00b1:
            int r7 = r11.f4593b
            int r9 = r11.f4595d
            int r13 = r12.f4593b
            if (r7 >= r9) goto L_0x00c5
            if (r13 != r7) goto L_0x00c3
            int r13 = r12.f4595d
            int r9 = r9 - r7
            if (r13 != r9) goto L_0x00c3
            r6 = r5
            r7 = 0
            goto L_0x00d3
        L_0x00c3:
            r6 = 0
            goto L_0x00cf
        L_0x00c5:
            int r14 = r9 + 1
            if (r13 != r14) goto L_0x00d1
            int r13 = r12.f4595d
            int r7 = r7 - r9
            if (r13 != r7) goto L_0x00d1
            r6 = r5
        L_0x00cf:
            r7 = r6
            goto L_0x00d3
        L_0x00d1:
            r7 = r5
            r6 = 0
        L_0x00d3:
            int r9 = r11.f4595d
            int r13 = r12.f4593b
            if (r9 >= r13) goto L_0x00de
            int r13 = r13 + -1
            r12.f4593b = r13
            goto L_0x0103
        L_0x00de:
            int r14 = r12.f4595d
            int r13 = r13 + r14
            if (r9 >= r13) goto L_0x0103
            int r14 = r14 + -1
            r12.f4595d = r14
            r11.f4592a = r10
            r11.f4595d = r5
            int r4 = r12.f4595d
            if (r4 != 0) goto L_0x0009
            r2.remove(r8)
            p.p.d.q$a r4 = r1.f4728a
            p.p.d.a r4 = (p124p.p180p.p181d.C1570a) r4
            boolean r5 = r4.f4589e
            if (r5 != 0) goto L_0x0009
            r12.f4594c = r3
            p.h.k.d<p.p.d.a$b> r4 = r4.f4585a
            r4.mo5865a(r12)
            goto L_0x0009
        L_0x0103:
            int r5 = r11.f4593b
            int r9 = r12.f4593b
            if (r5 > r9) goto L_0x010e
            int r9 = r9 + 1
            r12.f4593b = r9
            goto L_0x0126
        L_0x010e:
            int r13 = r12.f4595d
            int r9 = r9 + r13
            if (r5 >= r9) goto L_0x0126
            int r9 = r9 - r5
            p.p.d.q$a r13 = r1.f4728a
            int r5 = r5 + 1
            p.p.d.a r13 = (p124p.p180p.p181d.C1570a) r13
            p.p.d.a$b r5 = r13.mo6258a(r10, r5, r9, r3)
            int r9 = r11.f4593b
            int r10 = r12.f4593b
            int r9 = r9 - r10
            r12.f4595d = r9
            goto L_0x0127
        L_0x0126:
            r5 = r3
        L_0x0127:
            if (r6 == 0) goto L_0x0140
            r2.set(r4, r12)
            r2.remove(r8)
            p.p.d.q$a r4 = r1.f4728a
            p.p.d.a r4 = (p124p.p180p.p181d.C1570a) r4
            boolean r5 = r4.f4589e
            if (r5 != 0) goto L_0x0009
            r11.f4594c = r3
            p.h.k.d<p.p.d.a$b> r4 = r4.f4585a
            r4.mo5865a(r11)
            goto L_0x0009
        L_0x0140:
            if (r7 == 0) goto L_0x016c
            if (r5 == 0) goto L_0x015a
            int r6 = r11.f4593b
            int r7 = r5.f4593b
            if (r6 <= r7) goto L_0x014f
            int r7 = r5.f4595d
            int r6 = r6 - r7
            r11.f4593b = r6
        L_0x014f:
            int r6 = r11.f4595d
            int r7 = r5.f4593b
            if (r6 <= r7) goto L_0x015a
            int r7 = r5.f4595d
            int r6 = r6 - r7
            r11.f4595d = r6
        L_0x015a:
            int r6 = r11.f4593b
            int r7 = r12.f4593b
            if (r6 <= r7) goto L_0x0165
            int r7 = r12.f4595d
            int r6 = r6 - r7
            r11.f4593b = r6
        L_0x0165:
            int r6 = r11.f4595d
            int r7 = r12.f4593b
            if (r6 <= r7) goto L_0x019a
            goto L_0x0195
        L_0x016c:
            if (r5 == 0) goto L_0x0184
            int r6 = r11.f4593b
            int r7 = r5.f4593b
            if (r6 < r7) goto L_0x0179
            int r7 = r5.f4595d
            int r6 = r6 - r7
            r11.f4593b = r6
        L_0x0179:
            int r6 = r11.f4595d
            int r7 = r5.f4593b
            if (r6 < r7) goto L_0x0184
            int r7 = r5.f4595d
            int r6 = r6 - r7
            r11.f4595d = r6
        L_0x0184:
            int r6 = r11.f4593b
            int r7 = r12.f4593b
            if (r6 < r7) goto L_0x018f
            int r7 = r12.f4595d
            int r6 = r6 - r7
            r11.f4593b = r6
        L_0x018f:
            int r6 = r11.f4595d
            int r7 = r12.f4593b
            if (r6 < r7) goto L_0x019a
        L_0x0195:
            int r7 = r12.f4595d
            int r6 = r6 - r7
            r11.f4595d = r6
        L_0x019a:
            r2.set(r4, r12)
            int r6 = r11.f4593b
            int r7 = r11.f4595d
            if (r6 == r7) goto L_0x01a7
            r2.set(r8, r11)
            goto L_0x01aa
        L_0x01a7:
            r2.remove(r8)
        L_0x01aa:
            if (r5 == 0) goto L_0x0009
            r2.add(r4, r5)
            goto L_0x0009
        L_0x01b1:
            int r5 = r11.f4595d
            int r7 = r12.f4593b
            if (r5 >= r7) goto L_0x01b9
            r6 = r9
            goto L_0x01ba
        L_0x01b9:
            r6 = 0
        L_0x01ba:
            int r5 = r11.f4593b
            int r7 = r12.f4593b
            if (r5 >= r7) goto L_0x01c2
            int r6 = r6 + 1
        L_0x01c2:
            int r5 = r12.f4593b
            int r7 = r11.f4593b
            if (r5 > r7) goto L_0x01cd
            int r5 = r12.f4595d
            int r7 = r7 + r5
            r11.f4593b = r7
        L_0x01cd:
            int r5 = r12.f4593b
            int r7 = r11.f4595d
            if (r5 > r7) goto L_0x01d8
            int r5 = r12.f4595d
            int r7 = r7 + r5
            r11.f4595d = r7
        L_0x01d8:
            int r5 = r12.f4593b
            int r5 = r5 + r6
            r12.f4593b = r5
            r2.set(r4, r12)
            r2.set(r8, r11)
            goto L_0x0009
        L_0x01e5:
            java.util.ArrayList<p.p.d.a$b> r1 = r0.f4586b
            int r1 = r1.size()
            r2 = 0
        L_0x01ec:
            if (r2 >= r1) goto L_0x02c9
            java.util.ArrayList<p.p.d.a$b> r4 = r0.f4586b
            java.lang.Object r4 = r4.get(r2)
            p.p.d.a$b r4 = (p124p.p180p.p181d.C1570a.C1572b) r4
            int r11 = r4.f4592a
            if (r11 == r5) goto L_0x02c2
            if (r11 == r10) goto L_0x0264
            if (r11 == r7) goto L_0x0207
            if (r11 == r8) goto L_0x0202
            goto L_0x02c5
        L_0x0202:
            r0.mo6266b(r4)
            goto L_0x02c5
        L_0x0207:
            int r11 = r4.f4593b
            int r12 = r4.f4595d
            int r12 = r12 + r11
            r15 = r9
            r13 = r11
            r14 = 0
        L_0x020f:
            if (r11 >= r12) goto L_0x0243
            p.p.d.a$a r6 = r0.f4588d
            androidx.recyclerview.widget.RecyclerView$f r6 = (androidx.recyclerview.widget.RecyclerView.C0107f) r6
            androidx.recyclerview.widget.RecyclerView$d0 r6 = r6.mo1170a(r11)
            if (r6 != 0) goto L_0x0231
            boolean r6 = r0.mo6263a(r11)
            if (r6 == 0) goto L_0x0222
            goto L_0x0231
        L_0x0222:
            if (r15 != r5) goto L_0x022f
            java.lang.Object r6 = r4.f4594c
            p.p.d.a$b r6 = r0.mo6258a(r7, r13, r14, r6)
            r0.mo6266b(r6)
            r13 = r11
            r14 = 0
        L_0x022f:
            r15 = 0
            goto L_0x023f
        L_0x0231:
            if (r15 != 0) goto L_0x023e
            java.lang.Object r6 = r4.f4594c
            p.p.d.a$b r6 = r0.mo6258a(r7, r13, r14, r6)
            r0.mo6261a(r6)
            r13 = r11
            r14 = 0
        L_0x023e:
            r15 = r5
        L_0x023f:
            int r14 = r14 + r5
            int r11 = r11 + 1
            goto L_0x020f
        L_0x0243:
            int r6 = r4.f4595d
            if (r14 == r6) goto L_0x0258
            java.lang.Object r6 = r4.f4594c
            boolean r11 = r0.f4589e
            if (r11 != 0) goto L_0x0254
            r4.f4594c = r3
            p.h.k.d<p.p.d.a$b> r11 = r0.f4585a
            r11.mo5865a(r4)
        L_0x0254:
            p.p.d.a$b r4 = r0.mo6258a(r7, r13, r14, r6)
        L_0x0258:
            if (r15 != 0) goto L_0x025f
            r0.mo6261a(r4)
            goto L_0x02c5
        L_0x025f:
            r0.mo6266b(r4)
            goto L_0x02c5
        L_0x0264:
            int r6 = r4.f4593b
            int r11 = r4.f4595d
            int r11 = r11 + r6
            r12 = r6
            r14 = r9
            r13 = 0
        L_0x026c:
            if (r12 >= r11) goto L_0x02a5
            p.p.d.a$a r15 = r0.f4588d
            androidx.recyclerview.widget.RecyclerView$f r15 = (androidx.recyclerview.widget.RecyclerView.C0107f) r15
            androidx.recyclerview.widget.RecyclerView$d0 r15 = r15.mo1170a(r12)
            if (r15 != 0) goto L_0x028d
            boolean r15 = r0.mo6263a(r12)
            if (r15 == 0) goto L_0x027f
            goto L_0x028d
        L_0x027f:
            if (r14 != r5) goto L_0x028a
            p.p.d.a$b r14 = r0.mo6258a(r10, r6, r13, r3)
            r0.mo6266b(r14)
            r14 = r5
            goto L_0x028b
        L_0x028a:
            r14 = 0
        L_0x028b:
            r15 = 0
            goto L_0x029a
        L_0x028d:
            if (r14 != 0) goto L_0x0298
            p.p.d.a$b r14 = r0.mo6258a(r10, r6, r13, r3)
            r0.mo6261a(r14)
            r14 = r5
            goto L_0x0299
        L_0x0298:
            r14 = 0
        L_0x0299:
            r15 = r5
        L_0x029a:
            if (r14 == 0) goto L_0x02a0
            int r12 = r12 - r13
            int r11 = r11 - r13
            r13 = r5
            goto L_0x02a2
        L_0x02a0:
            int r13 = r13 + 1
        L_0x02a2:
            int r12 = r12 + r5
            r14 = r15
            goto L_0x026c
        L_0x02a5:
            int r11 = r4.f4595d
            if (r13 == r11) goto L_0x02b8
            boolean r11 = r0.f4589e
            if (r11 != 0) goto L_0x02b4
            r4.f4594c = r3
            p.h.k.d<p.p.d.a$b> r11 = r0.f4585a
            r11.mo5865a(r4)
        L_0x02b4:
            p.p.d.a$b r4 = r0.mo6258a(r10, r6, r13, r3)
        L_0x02b8:
            if (r14 != 0) goto L_0x02be
            r0.mo6261a(r4)
            goto L_0x02c5
        L_0x02be:
            r0.mo6266b(r4)
            goto L_0x02c5
        L_0x02c2:
            r0.mo6266b(r4)
        L_0x02c5:
            int r2 = r2 + 1
            goto L_0x01ec
        L_0x02c9:
            java.util.ArrayList<p.p.d.a$b> r1 = r0.f4586b
            r1.clear()
            return
        L_0x02cf:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p180p.p181d.C1570a.mo6269d():void");
    }

    /* renamed from: a */
    public final void mo6261a(C1572b bVar) {
        int i;
        int i2 = bVar.f4592a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int b = mo6264b(bVar.f4593b, i2);
        int i3 = bVar.f4593b;
        int i4 = bVar.f4592a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("op should be remove or update.");
            sb.append(bVar);
            throw new IllegalArgumentException(sb.toString());
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f4595d; i6++) {
            int b2 = mo6264b((i * i6) + bVar.f4593b, bVar.f4592a);
            int i7 = bVar.f4592a;
            if (i7 == 2 ? b2 == b : i7 == 4 && b2 == b + 1) {
                i5++;
            } else {
                C1572b a = mo6258a(bVar.f4592a, b, i5, bVar.f4594c);
                mo6262a(a, i3);
                if (!this.f4589e) {
                    a.f4594c = null;
                    this.f4585a.mo5865a(a);
                }
                if (bVar.f4592a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                b = b2;
            }
        }
        Object obj = bVar.f4594c;
        if (!this.f4589e) {
            bVar.f4594c = null;
            this.f4585a.mo5865a(bVar);
        }
        if (i5 > 0) {
            C1572b a2 = mo6258a(bVar.f4592a, b, i5, obj);
            mo6262a(a2, i3);
            if (!this.f4589e) {
                a2.f4594c = null;
                this.f4585a.mo5865a(a2);
            }
        }
    }

    /* renamed from: a */
    public void mo6262a(C1572b bVar, int i) {
        ((C0107f) this.f4588d).mo1172a(bVar);
        int i2 = bVar.f4592a;
        if (i2 == 2) {
            C1571a aVar = this.f4588d;
            int i3 = bVar.f4595d;
            C0107f fVar = (C0107f) aVar;
            RecyclerView.this.offsetPositionRecordsForRemove(i, i3, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f734c += i3;
        } else if (i2 == 4) {
            C1571a aVar2 = this.f4588d;
            C0107f fVar2 = (C0107f) aVar2;
            RecyclerView.this.viewRangeUpdate(i, bVar.f4595d, bVar.f4594c);
            RecyclerView.this.mItemsChanged = true;
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* renamed from: b */
    public final void mo6266b(C1572b bVar) {
        this.f4587c.add(bVar);
        int i = bVar.f4592a;
        if (i == 1) {
            C1571a aVar = this.f4588d;
            C0107f fVar = (C0107f) aVar;
            RecyclerView.this.offsetPositionRecordsForInsert(bVar.f4593b, bVar.f4595d);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        } else if (i == 2) {
            C1571a aVar2 = this.f4588d;
            C0107f fVar2 = (C0107f) aVar2;
            RecyclerView.this.offsetPositionRecordsForRemove(bVar.f4593b, bVar.f4595d, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        } else if (i == 4) {
            ((C0107f) this.f4588d).mo1171a(bVar.f4593b, bVar.f4595d, bVar.f4594c);
        } else if (i == 8) {
            C1571a aVar3 = this.f4588d;
            C0107f fVar3 = (C0107f) aVar3;
            RecyclerView.this.offsetPositionRecordsForMove(bVar.f4593b, bVar.f4595d);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown update op type for ");
            sb.append(bVar);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public final int mo6264b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        for (int size = this.f4587c.size() - 1; size >= 0; size--) {
            C1572b bVar = (C1572b) this.f4587c.get(size);
            int i7 = bVar.f4592a;
            if (i7 == 8) {
                int i8 = bVar.f4593b;
                int i9 = bVar.f4595d;
                if (i8 >= i9) {
                    int i10 = i9;
                    i9 = i8;
                    i8 = i10;
                }
                if (i < i8 || i > i9) {
                    int i11 = bVar.f4593b;
                    if (i < i11) {
                        if (i2 == 1) {
                            bVar.f4593b = i11 + 1;
                            i4 = bVar.f4595d + 1;
                        } else if (i2 == 2) {
                            bVar.f4593b = i11 - 1;
                            i4 = bVar.f4595d - 1;
                        }
                        bVar.f4595d = i4;
                    }
                } else {
                    int i12 = bVar.f4593b;
                    if (i8 == i12) {
                        if (i2 == 1) {
                            i6 = bVar.f4595d + 1;
                        } else {
                            if (i2 == 2) {
                                i6 = bVar.f4595d - 1;
                            }
                            i++;
                        }
                        bVar.f4595d = i6;
                        i++;
                    } else {
                        if (i2 == 1) {
                            i5 = i12 + 1;
                        } else {
                            if (i2 == 2) {
                                i5 = i12 - 1;
                            }
                            i--;
                        }
                        bVar.f4593b = i5;
                        i--;
                    }
                }
            } else {
                int i13 = bVar.f4593b;
                if (i13 > i) {
                    if (i2 == 1) {
                        i3 = i13 + 1;
                    } else if (i2 == 2) {
                        i3 = i13 - 1;
                    }
                    bVar.f4593b = i3;
                } else if (i7 == 1) {
                    i -= bVar.f4595d;
                } else if (i7 == 2) {
                    i += bVar.f4595d;
                }
            }
        }
        for (int size2 = this.f4587c.size() - 1; size2 >= 0; size2--) {
            C1572b bVar2 = (C1572b) this.f4587c.get(size2);
            if (bVar2.f4592a == 8) {
                int i14 = bVar2.f4595d;
                if (i14 == bVar2.f4593b || i14 < 0) {
                    this.f4587c.remove(size2);
                    if (this.f4589e) {
                    }
                }
            } else {
                if (bVar2.f4595d <= 0) {
                    this.f4587c.remove(size2);
                    if (this.f4589e) {
                    }
                }
            }
            bVar2.f4594c = null;
            this.f4585a.mo5865a(bVar2);
        }
        return i;
    }
}
