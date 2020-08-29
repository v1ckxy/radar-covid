package p423w;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4557i;
import p392u.p393n.C4562a;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;
import p423w.p424c0.C4889a;

/* renamed from: w.q */
public final class C4905q extends AbstractList<C4897j> implements RandomAccess {

    /* renamed from: g */
    public static final C4906a f11683g = new C4906a(null);

    /* renamed from: e */
    public final C4897j[] f11684e;

    /* renamed from: f */
    public final int[] f11685f;

    /* renamed from: w.q$a */
    public static final class C4906a {
        public /* synthetic */ C4906a(C4636f fVar) {
        }

        /* renamed from: a */
        public final void mo11526a(long j, C4892f fVar, int i, List<? extends C4897j> list, int i2, int i3, List<Integer> list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            C4892f fVar2;
            C4892f fVar3 = fVar;
            int i8 = i;
            List<? extends C4897j> list3 = list;
            int i9 = i2;
            int i10 = i3;
            List<Integer> list4 = list2;
            String str = "Failed requirement.";
            if (i9 < i10) {
                int i11 = i9;
                while (i11 < i10) {
                    if (((C4897j) list3.get(i11)).mo11503g() >= i8) {
                        i11++;
                    } else {
                        throw new IllegalArgumentException(str.toString());
                    }
                }
                C4897j jVar = (C4897j) list.get(i2);
                C4897j jVar2 = (C4897j) list3.get(i10 - 1);
                int i12 = -1;
                if (i8 == jVar.mo11503g()) {
                    int intValue = ((Number) list4.get(i9)).intValue();
                    int i13 = i9 + 1;
                    i4 = i13;
                    i5 = intValue;
                    jVar = (C4897j) list3.get(i13);
                } else {
                    i4 = i9;
                    i5 = -1;
                }
                if (jVar.mo11495a(i8) != jVar2.mo11495a(i8)) {
                    int i14 = 1;
                    for (int i15 = i4 + 1; i15 < i10; i15++) {
                        if (((C4897j) list3.get(i15 - 1)).mo11495a(i8) != ((C4897j) list3.get(i15)).mo11495a(i8)) {
                            i14++;
                        }
                    }
                    long a = mo11524a(fVar3) + j + ((long) 2) + ((long) (i14 * 2));
                    fVar3.writeInt(i14);
                    fVar3.writeInt(i5);
                    for (int i16 = i4; i16 < i10; i16++) {
                        byte a2 = ((C4897j) list3.get(i16)).mo11495a(i8);
                        if (i16 == i4 || a2 != ((C4897j) list3.get(i16 - 1)).mo11495a(i8)) {
                            fVar3.writeInt((int) a2 & 255);
                        }
                    }
                    C4892f fVar4 = new C4892f();
                    while (i4 < i10) {
                        byte a3 = ((C4897j) list3.get(i4)).mo11495a(i8);
                        int i17 = i4 + 1;
                        int i18 = i17;
                        while (true) {
                            if (i18 >= i10) {
                                i6 = i10;
                                break;
                            } else if (a3 != ((C4897j) list3.get(i18)).mo11495a(i8)) {
                                i6 = i18;
                                break;
                            } else {
                                i18++;
                            }
                        }
                        if (i17 == i6 && i8 + 1 == ((C4897j) list3.get(i4)).mo11503g()) {
                            fVar3.writeInt(((Number) list4.get(i4)).intValue());
                            i7 = i6;
                            fVar2 = fVar4;
                        } else {
                            fVar3.writeInt(((int) (mo11524a(fVar4) + a)) * i12);
                            i7 = i6;
                            fVar2 = fVar4;
                            mo11526a(a, fVar4, i8 + 1, list, i4, i6, list2);
                        }
                        fVar4 = fVar2;
                        i4 = i7;
                        i12 = -1;
                    }
                    fVar3.mo11435a((C4882a0) fVar4);
                    return;
                }
                int min = Math.min(jVar.mo11503g(), jVar2.mo11503g());
                int i19 = i8;
                int i20 = 0;
                while (i19 < min && jVar.mo11495a(i19) == jVar2.mo11495a(i19)) {
                    i20++;
                    i19++;
                }
                long a4 = mo11524a(fVar3) + j + ((long) 2) + ((long) i20) + 1;
                fVar3.writeInt(-i20);
                fVar3.writeInt(i5);
                int i21 = i8 + i20;
                while (i8 < i21) {
                    fVar3.writeInt((int) jVar.mo11495a(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i10) {
                    if (i21 == ((C4897j) list3.get(i4)).mo11503g()) {
                        fVar3.writeInt(((Number) list4.get(i4)).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                C4892f fVar5 = new C4892f();
                fVar3.writeInt(((int) (mo11524a(fVar5) + a4)) * -1);
                mo11526a(a4, fVar5, i21, list, i4, i3, list2);
                fVar3.mo11435a((C4882a0) fVar5);
                return;
            }
            throw new IllegalArgumentException(str.toString());
        }

        /* renamed from: a */
        public final long mo11524a(C4892f fVar) {
            return fVar.f11661f / ((long) 4);
        }

        /* renamed from: a */
        public final C4905q mo11525a(C4897j... jVarArr) {
            int i;
            C4897j[] jVarArr2 = jVarArr;
            if (jVarArr2 != null) {
                int i2 = 0;
                if (jVarArr2.length == 0) {
                    return new C4905q(new C4897j[0], new int[]{0, -1}, null);
                }
                List b = C2286e.m5290b((T[]) jVarArr);
                ArrayList arrayList = (ArrayList) b;
                if (arrayList.size() > 1) {
                    Collections.sort(b);
                }
                ArrayList arrayList2 = new ArrayList(jVarArr2.length);
                for (C4897j jVar : jVarArr2) {
                    arrayList2.add(Integer.valueOf(-1));
                }
                Object[] array = arrayList2.toArray(new Integer[0]);
                if (array != null) {
                    Integer[] numArr = (Integer[]) array;
                    Integer[] numArr2 = (Integer[]) Arrays.copyOf(numArr, numArr.length);
                    if (numArr2 != null) {
                        List arrayList3 = numArr2.length == 0 ? new ArrayList() : new ArrayList(new C4562a(numArr2, true));
                        int length = jVarArr2.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            C4897j jVar2 = jVarArr2[i3];
                            int i5 = i4 + 1;
                            int size = arrayList.size();
                            int size2 = arrayList.size();
                            String str = ").";
                            if (size < 0) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("fromIndex (");
                                sb.append(0);
                                sb.append(") is greater than toIndex (");
                                sb.append(size);
                                sb.append(str);
                                throw new IllegalArgumentException(sb.toString());
                            } else if (size <= size2) {
                                int i6 = size - 1;
                                int i7 = 0;
                                while (true) {
                                    if (i7 > i6) {
                                        i = -(i7 + 1);
                                        break;
                                    }
                                    i = (i7 + i6) >>> 1;
                                    int a = C2286e.m5157a((Comparable) arrayList.get(i), jVar2);
                                    if (a >= 0) {
                                        if (a <= 0) {
                                            break;
                                        }
                                        i6 = i - 1;
                                    } else {
                                        i7 = i + 1;
                                    }
                                }
                                arrayList3.set(i, Integer.valueOf(i4));
                                i3++;
                                i4 = i5;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("toIndex (");
                                sb2.append(size);
                                sb2.append(") is greater than size (");
                                sb2.append(size2);
                                sb2.append(str);
                                throw new IndexOutOfBoundsException(sb2.toString());
                            }
                        }
                        if (((C4897j) arrayList.get(0)).mo11503g() > 0) {
                            int i8 = 0;
                            while (i8 < arrayList.size()) {
                                C4897j jVar3 = (C4897j) arrayList.get(i8);
                                int i9 = i8 + 1;
                                int i10 = i9;
                                while (i10 < arrayList.size()) {
                                    C4897j jVar4 = (C4897j) arrayList.get(i10);
                                    if (jVar4 == null) {
                                        throw null;
                                    } else if (jVar3 == null) {
                                        C4638h.m10271a("prefix");
                                        throw null;
                                    } else if (!C4889a.m10946b(jVar4, jVar3)) {
                                        continue;
                                        break;
                                    } else {
                                        if (!(jVar4.mo11503g() != jVar3.mo11503g())) {
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append("duplicate option: ");
                                            sb3.append(jVar4);
                                            throw new IllegalArgumentException(sb3.toString().toString());
                                        } else if (((Number) arrayList3.get(i10)).intValue() > ((Number) arrayList3.get(i8)).intValue()) {
                                            arrayList.remove(i10);
                                            arrayList3.remove(i10);
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                                i8 = i9;
                            }
                            C4892f fVar = new C4892f();
                            mo11526a(0, fVar, 0, b, 0, arrayList.size(), arrayList3);
                            int[] iArr = new int[((int) mo11524a(fVar))];
                            while (!fVar.mo11460i()) {
                                int i11 = i2 + 1;
                                iArr[i2] = fVar.readInt();
                                i2 = i11;
                            }
                            return new C4905q((C4897j[]) jVarArr.clone(), iArr, null);
                        }
                        throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
                    }
                    C4638h.m10271a("elements");
                    throw null;
                }
                throw new C4557i("null cannot be cast to non-null type kotlin.Array<T>");
            }
            C4638h.m10271a("byteStrings");
            throw null;
        }
    }

    public /* synthetic */ C4905q(C4897j[] jVarArr, int[] iArr, C4636f fVar) {
        this.f11684e = jVarArr;
        this.f11685f = iArr;
    }

    public final boolean contains(Object obj) {
        if (obj != null ? obj instanceof C4897j : true) {
            return super.contains((C4897j) obj);
        }
        return false;
    }

    public Object get(int i) {
        return this.f11684e[i];
    }

    public final int indexOf(Object obj) {
        if (obj != null ? obj instanceof C4897j : true) {
            return super.indexOf((C4897j) obj);
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        if (obj != null ? obj instanceof C4897j : true) {
            return super.lastIndexOf((C4897j) obj);
        }
        return -1;
    }

    public final boolean remove(Object obj) {
        if (obj != null ? obj instanceof C4897j : true) {
            return super.remove((C4897j) obj);
        }
        return false;
    }

    public final int size() {
        return this.f11684e.length;
    }
}
