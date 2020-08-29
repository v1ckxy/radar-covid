package com.google.gson.internal.bind;

import com.google.gson.Gson;
import p213q.p217b.p355e.C4330g;
import p213q.p217b.p355e.C4331h;
import p213q.p217b.p355e.C4338o;
import p213q.p217b.p355e.C4339p;
import p213q.p217b.p355e.C4344s;
import p213q.p217b.p355e.C4345t;
import p213q.p217b.p355e.p361w.C4396a;
import p213q.p217b.p355e.p362x.C4400c;

public final class TreeTypeAdapter<T> extends C4344s<T> {

    /* renamed from: a */
    public final C4339p<T> f1613a;

    /* renamed from: b */
    public final C4331h<T> f1614b;

    /* renamed from: c */
    public final Gson f1615c;

    /* renamed from: d */
    public final C4396a<T> f1616d;

    /* renamed from: e */
    public final C4345t f1617e;

    /* renamed from: f */
    public final C0344b f1618f = new C0344b<>(this, null);

    /* renamed from: g */
    public C4344s<T> f1619g;

    public static final class SingleTypeFactory implements C4345t {
        /* renamed from: a */
        public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
            aVar.getRawType();
            throw null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TreeTypeAdapter$b */
    public final class C0344b implements C4338o, C4330g {
        public /* synthetic */ C0344b(TreeTypeAdapter treeTypeAdapter, C0343a aVar) {
        }
    }

    public TreeTypeAdapter(C4339p<T> pVar, C4331h<T> hVar, Gson gson, C4396a<T> aVar, C4345t tVar) {
        this.f1613a = pVar;
        this.f1614b = hVar;
        this.f1615c = gson;
        this.f1616d = aVar;
        this.f1617e = tVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        throw new p213q.p217b.p355e.C4340q((java.lang.Throwable) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        throw new p213q.p217b.p355e.C4333j((java.lang.Throwable) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        throw new p213q.p217b.p355e.C4340q((java.lang.Throwable) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029 A[ExcHandler: NumberFormatException (r4v8 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030 A[ExcHandler: IOException (r4v7 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[ExcHandler: d (r4v6 'e' q.b.e.x.d A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo3072a(p213q.p217b.p355e.p362x.C4397a r4) {
        /*
            r3 = this;
            q.b.e.h<T> r0 = r3.f1614b
            if (r0 != 0) goto L_0x001a
            q.b.e.s<T> r0 = r3.f1619g
            if (r0 == 0) goto L_0x0009
            goto L_0x0015
        L_0x0009:
            com.google.gson.Gson r0 = r3.f1615c
            q.b.e.t r1 = r3.f1617e
            q.b.e.w.a<T> r2 = r3.f1616d
            q.b.e.s r0 = r0.mo3079a(r1, r2)
            r3.f1619g = r0
        L_0x0015:
            java.lang.Object r4 = r0.mo3072a(r4)
            return r4
        L_0x001a:
            r4.peek()     // Catch:{ EOFException -> 0x003e, d -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            r0 = 0
            q.b.e.s<q.b.e.i> r1 = com.google.gson.internal.bind.TypeAdapters.f1646X     // Catch:{ EOFException -> 0x0027, d -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            java.lang.Object r4 = r1.mo3072a(r4)     // Catch:{ EOFException -> 0x0027, d -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            q.b.e.i r4 = (p213q.p217b.p355e.C4332i) r4     // Catch:{ EOFException -> 0x0027, d -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            goto L_0x0044
        L_0x0027:
            r4 = move-exception
            goto L_0x0040
        L_0x0029:
            r4 = move-exception
            q.b.e.q r0 = new q.b.e.q
            r0.<init>(r4)
            throw r0
        L_0x0030:
            r4 = move-exception
            q.b.e.j r0 = new q.b.e.j
            r0.<init>(r4)
            throw r0
        L_0x0037:
            r4 = move-exception
            q.b.e.q r0 = new q.b.e.q
            r0.<init>(r4)
            throw r0
        L_0x003e:
            r4 = move-exception
            r0 = 1
        L_0x0040:
            if (r0 == 0) goto L_0x005c
            q.b.e.k r4 = p213q.p217b.p355e.C4334k.f10382a
        L_0x0044:
            r0 = 0
            if (r4 == 0) goto L_0x005b
            boolean r1 = r4 instanceof p213q.p217b.p355e.C4334k
            if (r1 == 0) goto L_0x004c
            return r0
        L_0x004c:
            q.b.e.h<T> r0 = r3.f1614b
            q.b.e.w.a<T> r1 = r3.f1616d
            java.lang.reflect.Type r1 = r1.getType()
            com.google.gson.internal.bind.TreeTypeAdapter$b<> r2 = r3.f1618f
            java.lang.Object r4 = r0.mo10540a(r4, r1, r2)
            return r4
        L_0x005b:
            throw r0
        L_0x005c:
            q.b.e.q r0 = new q.b.e.q
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TreeTypeAdapter.mo3072a(q.b.e.x.a):java.lang.Object");
    }

    /* renamed from: a */
    public void mo3073a(C4400c cVar, T t) {
        C4339p<T> pVar = this.f1613a;
        if (pVar == null) {
            C4344s<T> sVar = this.f1619g;
            if (sVar == null) {
                sVar = this.f1615c.mo3079a(this.f1617e, this.f1616d);
                this.f1619g = sVar;
            }
            sVar.mo3073a(cVar, t);
        } else if (t == null) {
            cVar.mo10661o();
        } else {
            TypeAdapters.f1646X.mo3073a(cVar, pVar.mo10553a(t, this.f1616d.getType(), this.f1618f));
        }
    }
}
