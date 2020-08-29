package p213q.p217b.p317d.p321g;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p213q.p217b.p317d.p345j.C4208c;
import p213q.p217b.p317d.p349m.C4274a;

/* renamed from: q.b.d.g.x */
public final class C3906x extends C3881a {

    /* renamed from: a */
    public final Set<Class<?>> f9538a;

    /* renamed from: b */
    public final Set<Class<?>> f9539b;

    /* renamed from: c */
    public final Set<Class<?>> f9540c;

    /* renamed from: d */
    public final Set<Class<?>> f9541d;

    /* renamed from: e */
    public final Set<Class<?>> f9542e;

    /* renamed from: f */
    public final C3887e f9543f;

    /* renamed from: q.b.d.g.x$a */
    public static class C3907a implements C4208c {
        public C3907a(Set<Class<?>> set, C4208c cVar) {
        }
    }

    public C3906x(C3884d<?> dVar, C3887e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (C3899q qVar : dVar.f9501b) {
            if (qVar.f9529c == 0) {
                if (qVar.mo10088a()) {
                    hashSet3.add(qVar.f9527a);
                } else {
                    hashSet.add(qVar.f9527a);
                }
            } else if (qVar.mo10088a()) {
                hashSet4.add(qVar.f9527a);
            } else {
                hashSet2.add(qVar.f9527a);
            }
        }
        if (!dVar.f9505f.isEmpty()) {
            hashSet.add(C4208c.class);
        }
        this.f9538a = Collections.unmodifiableSet(hashSet);
        this.f9539b = Collections.unmodifiableSet(hashSet2);
        this.f9540c = Collections.unmodifiableSet(hashSet3);
        this.f9541d = Collections.unmodifiableSet(hashSet4);
        this.f9542e = dVar.f9505f;
        this.f9543f = eVar;
    }

    /* renamed from: a */
    public <T> T mo10075a(Class<T> cls) {
        if (this.f9538a.contains(cls)) {
            T a = this.f9543f.mo10075a(cls);
            return !cls.equals(C4208c.class) ? a : new C3907a(this.f9542e, (C4208c) a);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    /* renamed from: b */
    public <T> Set<T> mo10076b(Class<T> cls) {
        if (this.f9540c.contains(cls)) {
            return this.f9543f.mo10076b(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    /* renamed from: c */
    public <T> C4274a<T> mo10083c(Class<T> cls) {
        if (this.f9539b.contains(cls)) {
            return this.f9543f.mo10083c(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    /* renamed from: d */
    public <T> C4274a<Set<T>> mo10084d(Class<T> cls) {
        if (this.f9541d.contains(cls)) {
            return this.f9543f.mo10084d(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }
}
