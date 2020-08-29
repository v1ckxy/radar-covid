package p213q.p217b.p218a.p231b.p259h.p261b;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p124p.p143e.C1248a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2351ab;
import p213q.p217b.p218a.p231b.p251g.p256e.C2447g1;
import p213q.p217b.p218a.p231b.p251g.p256e.C2447g1.C2448a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2467h1;
import p213q.p217b.p218a.p231b.p251g.p256e.C2467h1.C2468a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6;
import p213q.p217b.p218a.p231b.p251g.p256e.C2581n6;
import p213q.p217b.p218a.p231b.p251g.p256e.C2635q6;
import p213q.p217b.p218a.p231b.p251g.p256e.C2730w4;
import p213q.p217b.p218a.p231b.p251g.p256e.C2756y0;
import p213q.p217b.p218a.p231b.p251g.p256e.C2756y0.C2757a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2772z0;
import p213q.p217b.p218a.p231b.p251g.p256e.C2772z0.C2773a;

/* renamed from: q.b.a.b.h.b.ca */
public final class C2926ca {

    /* renamed from: a */
    public String f7223a;

    /* renamed from: b */
    public boolean f7224b;

    /* renamed from: c */
    public C2447g1 f7225c;

    /* renamed from: d */
    public BitSet f7226d;

    /* renamed from: e */
    public BitSet f7227e;

    /* renamed from: f */
    public Map<Integer, Long> f7228f;

    /* renamed from: g */
    public Map<Integer, List<Long>> f7229g;

    /* renamed from: h */
    public final /* synthetic */ C2902aa f7230h;

    public /* synthetic */ C2926ca(C2902aa aaVar, String str, C2447g1 g1Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, C2938da daVar) {
        this.f7230h = aaVar;
        this.f7223a = str;
        this.f7226d = bitSet;
        this.f7227e = bitSet2;
        this.f7228f = map;
        this.f7229g = new C1248a();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add((Long) map2.get(num));
                this.f7229g.put(num, arrayList);
            }
        }
        this.f7224b = false;
        this.f7225c = g1Var;
    }

    /* renamed from: a */
    public final C2756y0 mo8380a(int i) {
        ArrayList arrayList;
        Iterable iterable;
        C2757a aVar = (C2757a) C2756y0.zzh.mo7768g();
        if (aVar.f6619g) {
            aVar.mo7776k();
            aVar.f6619g = false;
        }
        C2756y0 y0Var = (C2756y0) aVar.f6618f;
        y0Var.zzc |= 1;
        y0Var.zzd = i;
        boolean z = this.f7224b;
        if (aVar.f6619g) {
            aVar.mo7776k();
            aVar.f6619g = false;
        }
        C2756y0 y0Var2 = (C2756y0) aVar.f6618f;
        y0Var2.zzc |= 8;
        y0Var2.zzg = z;
        C2447g1 g1Var = this.f7225c;
        if (g1Var != null) {
            if (aVar.f6619g) {
                aVar.mo7776k();
                aVar.f6619g = false;
            }
            C2756y0.m6555b((C2756y0) aVar.f6618f, g1Var);
        }
        C2448a aVar2 = (C2448a) C2447g1.zzg.mo7768g();
        aVar2.mo7669b((Iterable<? extends Long>) C3123t9.m7334a(this.f7226d));
        aVar2.mo7667a((Iterable<? extends Long>) C3123t9.m7334a(this.f7227e));
        if (this.f7228f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f7228f.size());
            for (Integer intValue : this.f7228f.keySet()) {
                int intValue2 = intValue.intValue();
                C2773a aVar3 = (C2773a) C2772z0.zzf.mo7768g();
                if (aVar3.f6619g) {
                    aVar3.mo7776k();
                    aVar3.f6619g = false;
                }
                C2772z0 z0Var = (C2772z0) aVar3.f6618f;
                z0Var.zzc |= 1;
                z0Var.zzd = intValue2;
                long longValue = ((Long) this.f7228f.get(Integer.valueOf(intValue2))).longValue();
                if (aVar3.f6619g) {
                    aVar3.mo7776k();
                    aVar3.f6619g = false;
                }
                C2772z0 z0Var2 = (C2772z0) aVar3.f6618f;
                z0Var2.zzc |= 2;
                z0Var2.zze = longValue;
                arrayList.add((C2772z0) ((C2490i6) aVar3.mo7778m()));
            }
        }
        if (aVar2.f6619g) {
            aVar2.mo7776k();
            aVar2.f6619g = false;
        }
        C2447g1 g1Var2 = (C2447g1) aVar2.f6618f;
        C2635q6<C2772z0> q6Var = g1Var2.zze;
        if (!q6Var.mo7387a()) {
            g1Var2.zze = C2490i6.m5946a(q6Var);
        }
        C2730w4.m6511a(arrayList, g1Var2.zze);
        if (this.f7229g == null) {
            iterable = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(this.f7229g.size());
            for (Integer num : this.f7229g.keySet()) {
                C2468a aVar4 = (C2468a) C2467h1.zzf.mo7768g();
                int intValue3 = num.intValue();
                if (aVar4.f6619g) {
                    aVar4.mo7776k();
                    aVar4.f6619g = false;
                }
                C2467h1 h1Var = (C2467h1) aVar4.f6618f;
                h1Var.zzc |= 1;
                h1Var.zzd = intValue3;
                List list = (List) this.f7229g.get(num);
                if (list != null) {
                    Collections.sort(list);
                    if (aVar4.f6619g) {
                        aVar4.mo7776k();
                        aVar4.f6619g = false;
                    }
                    C2467h1 h1Var2 = (C2467h1) aVar4.f6618f;
                    C2581n6 n6Var = h1Var2.zze;
                    if (!n6Var.mo7387a()) {
                        h1Var2.zze = C2490i6.m5945a(n6Var);
                    }
                    C2730w4.m6511a(list, h1Var2.zze);
                }
                arrayList2.add((C2467h1) ((C2490i6) aVar4.mo7778m()));
            }
            iterable = arrayList2;
        }
        if (aVar2.f6619g) {
            aVar2.mo7776k();
            aVar2.f6619g = false;
        }
        C2447g1 g1Var3 = (C2447g1) aVar2.f6618f;
        C2635q6<C2467h1> q6Var2 = g1Var3.zzf;
        if (!q6Var2.mo7387a()) {
            g1Var3.zzf = C2490i6.m5946a(q6Var2);
        }
        C2730w4.m6511a(iterable, g1Var3.zzf);
        if (aVar.f6619g) {
            aVar.mo7776k();
            aVar.f6619g = false;
        }
        C2756y0.m6554a((C2756y0) aVar.f6618f, (C2447g1) ((C2490i6) aVar2.mo7778m()));
        return (C2756y0) ((C2490i6) aVar.mo7778m());
    }

    public /* synthetic */ C2926ca(C2902aa aaVar, String str, C2938da daVar) {
        this.f7230h = aaVar;
        this.f7223a = str;
        this.f7224b = true;
        this.f7226d = new BitSet();
        this.f7227e = new BitSet();
        this.f7228f = new C1248a();
        this.f7229g = new C1248a();
    }

    /* renamed from: a */
    public final void mo8381a(C2986ha haVar) {
        int a = haVar.mo8442a();
        Boolean bool = haVar.f7397c;
        if (bool != null) {
            this.f7227e.set(a, bool.booleanValue());
        }
        Boolean bool2 = haVar.f7398d;
        if (bool2 != null) {
            this.f7226d.set(a, bool2.booleanValue());
        }
        if (haVar.f7399e != null) {
            Long l = (Long) this.f7228f.get(Integer.valueOf(a));
            long longValue = haVar.f7399e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f7228f.put(Integer.valueOf(a), Long.valueOf(longValue));
            }
        }
        if (haVar.f7400f != null) {
            List list = (List) this.f7229g.get(Integer.valueOf(a));
            if (list == null) {
                list = new ArrayList();
                this.f7229g.put(Integer.valueOf(a), list);
            }
            if (haVar.mo8444b()) {
                list.clear();
            }
            if (C2351ab.m5463b() && this.f7230h.f7133a.f7338g.mo8578c(this.f7223a, C3069p.f7725g0) && haVar.mo8445c()) {
                list.clear();
            }
            if (!C2351ab.m5463b() || !this.f7230h.f7133a.f7338g.mo8578c(this.f7223a, C3069p.f7725g0)) {
                list.add(Long.valueOf(haVar.f7400f.longValue() / 1000));
            } else {
                long longValue2 = haVar.f7400f.longValue() / 1000;
                if (!list.contains(Long.valueOf(longValue2))) {
                    list.add(Long.valueOf(longValue2));
                }
            }
        }
    }
}
