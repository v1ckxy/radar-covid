package com.google.gson.internal.bind;

import com.google.gson.Gson;
import p213q.p217b.p355e.C4344s;
import p213q.p217b.p355e.C4345t;
import p213q.p217b.p355e.p356u.C4346a;
import p213q.p217b.p355e.p357v.C4362g;
import p213q.p217b.p355e.p361w.C4396a;

public final class JsonAdapterAnnotationTypeAdapterFactory implements C4345t {

    /* renamed from: e */
    public final C4362g f1590e;

    public JsonAdapterAnnotationTypeAdapterFactory(C4362g gVar) {
        this.f1590e = gVar;
    }

    /* renamed from: a */
    public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
        C4346a aVar2 = (C4346a) aVar.getRawType().getAnnotation(C4346a.class);
        if (aVar2 == null) {
            return null;
        }
        return mo3094a(this.f1590e, gson, aVar, aVar2);
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [q.b.e.s<?>, q.b.e.s] */
    /* JADX WARNING: type inference failed for: r9v13, types: [q.b.e.s] */
    /* JADX WARNING: type inference failed for: r9v14, types: [q.b.e.s] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p213q.p217b.p355e.C4344s<?> mo3094a(p213q.p217b.p355e.p357v.C4362g r9, com.google.gson.Gson r10, p213q.p217b.p355e.p361w.C4396a<?> r11, p213q.p217b.p355e.p356u.C4346a r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            q.b.e.w.a r0 = p213q.p217b.p355e.p361w.C4396a.get(r0)
            q.b.e.v.s r9 = r9.mo10577a(r0)
            java.lang.Object r9 = r9.mo10576a()
            boolean r0 = r9 instanceof p213q.p217b.p355e.C4344s
            if (r0 == 0) goto L_0x0017
            q.b.e.s r9 = (p213q.p217b.p355e.C4344s) r9
            goto L_0x0071
        L_0x0017:
            boolean r0 = r9 instanceof p213q.p217b.p355e.C4345t
            if (r0 == 0) goto L_0x0022
            q.b.e.t r9 = (p213q.p217b.p355e.C4345t) r9
            q.b.e.s r9 = r9.mo3085a(r10, r11)
            goto L_0x0071
        L_0x0022:
            boolean r0 = r9 instanceof p213q.p217b.p355e.C4339p
            if (r0 != 0) goto L_0x0057
            boolean r1 = r9 instanceof p213q.p217b.p355e.C4331h
            if (r1 == 0) goto L_0x002b
            goto L_0x0057
        L_0x002b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Invalid attempt to bind an instance of "
            java.lang.StringBuilder r12 = p213q.p214a.p215a.p216a.C1965a.m4756a(r12)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.String r9 = r11.toString()
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L_0x0057:
            r1 = 0
            if (r0 == 0) goto L_0x005f
            r0 = r9
            q.b.e.p r0 = (p213q.p217b.p355e.C4339p) r0
            r3 = r0
            goto L_0x0060
        L_0x005f:
            r3 = r1
        L_0x0060:
            boolean r0 = r9 instanceof p213q.p217b.p355e.C4331h
            if (r0 == 0) goto L_0x0067
            r1 = r9
            q.b.e.h r1 = (p213q.p217b.p355e.C4331h) r1
        L_0x0067:
            r4 = r1
            com.google.gson.internal.bind.TreeTypeAdapter r9 = new com.google.gson.internal.bind.TreeTypeAdapter
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0071:
            if (r9 == 0) goto L_0x007f
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x007f
            com.google.gson.TypeAdapter$1 r10 = new com.google.gson.TypeAdapter$1
            r10.<init>(r9)
            r9 = r10
        L_0x007f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.mo3094a(q.b.e.v.g, com.google.gson.Gson, q.b.e.w.a, q.b.e.u.a):q.b.e.s");
    }
}
