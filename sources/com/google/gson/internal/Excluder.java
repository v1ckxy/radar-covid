package com.google.gson.internal;

import com.google.gson.Gson;
import java.util.Collections;
import java.util.List;
import p213q.p217b.p355e.C4318a;
import p213q.p217b.p355e.C4344s;
import p213q.p217b.p355e.C4345t;
import p213q.p217b.p355e.p356u.C4348c;
import p213q.p217b.p355e.p356u.C4349d;
import p213q.p217b.p355e.p361w.C4396a;
import p213q.p217b.p355e.p362x.C4397a;
import p213q.p217b.p355e.p362x.C4400c;

public final class Excluder implements C4345t, Cloneable {

    /* renamed from: j */
    public static final Excluder f1570j = new Excluder();

    /* renamed from: e */
    public double f1571e = -1.0d;

    /* renamed from: f */
    public int f1572f = 136;

    /* renamed from: g */
    public boolean f1573g = true;

    /* renamed from: h */
    public List<C4318a> f1574h = Collections.emptyList();

    /* renamed from: i */
    public List<C4318a> f1575i = Collections.emptyList();

    /* renamed from: a */
    public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
        Class rawType = aVar.getRawType();
        boolean a = mo3086a(rawType);
        final boolean z = a || mo3087a(rawType, true);
        final boolean z2 = a || mo3087a(rawType, false);
        if (!z && !z2) {
            return null;
        }
        final Gson gson2 = gson;
        final C4396a<T> aVar2 = aVar;
        C03361 r5 = new C4344s<T>() {

            /* renamed from: a */
            public C4344s<T> f1576a;

            /* renamed from: a */
            public T mo3072a(C4397a aVar) {
                if (z2) {
                    aVar.mo10625D();
                    return null;
                }
                C4344s<T> sVar = this.f1576a;
                if (sVar == null) {
                    sVar = gson2.mo3079a((C4345t) Excluder.this, aVar2);
                    this.f1576a = sVar;
                }
                return sVar.mo3072a(aVar);
            }

            /* renamed from: a */
            public void mo3073a(C4400c cVar, T t) {
                if (z) {
                    cVar.mo10661o();
                    return;
                }
                C4344s<T> sVar = this.f1576a;
                if (sVar == null) {
                    sVar = gson2.mo3079a((C4345t) Excluder.this, aVar2);
                    this.f1576a = sVar;
                }
                sVar.mo3073a(cVar, t);
            }
        };
        return r5;
    }

    /* renamed from: a */
    public final boolean mo3086a(Class<?> cls) {
        if (this.f1571e == -1.0d || mo3088a((C4348c) cls.getAnnotation(C4348c.class), (C4349d) cls.getAnnotation(C4349d.class))) {
            return (!this.f1573g && mo3090c(cls)) || mo3089b(cls);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo3087a(Class<?> cls, boolean z) {
        for (C4318a a : z ? this.f1574h : this.f1575i) {
            if (a.mo10533a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo3088a(C4348c cVar, C4349d dVar) {
        if (!(cVar == null || cVar.value() <= this.f1571e)) {
            return false;
        }
        if (dVar == null || dVar.value() > this.f1571e) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo3089b(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: c */
    public final boolean mo3090c(Class<?> cls) {
        if (cls.isMemberClass()) {
            if (!((cls.getModifiers() & 8) != 0)) {
                return true;
            }
        }
        return false;
    }

    public Object clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
