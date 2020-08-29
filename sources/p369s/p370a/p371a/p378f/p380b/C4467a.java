package p369s.p370a.p371a.p378f.p380b;

import p213q.p214a.p215a.p216a.C1965a;
import p369s.p370a.p371a.p377e.C4458a;
import p369s.p370a.p371a.p377e.C4459b;
import p369s.p370a.p371a.p377e.C4460c;
import p369s.p370a.p371a.p377e.C4461d;

/* renamed from: s.a.a.f.b.a */
public final class C4467a {

    /* renamed from: a */
    public static final Runnable f10554a = new C4471d();

    /* renamed from: b */
    public static final C4458a f10555b = new C4469b();

    /* renamed from: c */
    public static final C4459b<Object> f10556c = new C4470c();

    /* renamed from: s.a.a.f.b.a$a */
    public static final class C4468a<T1, T2, T3, T4, R> implements C4461d<Object[], R> {

        /* renamed from: a */
        public final C4460c<T1, T2, T3, T4, R> f10557a;

        public C4468a(C4460c<T1, T2, T3, T4, R> cVar) {
            this.f10557a = cVar;
        }

        /* renamed from: a */
        public Object mo3712a(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 4) {
                return this.f10557a.mo3708a(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
            StringBuilder a = C1965a.m4756a("Array of size 4 expected but got ");
            a.append(objArr.length);
            throw new IllegalArgumentException(a.toString());
        }
    }

    /* renamed from: s.a.a.f.b.a$b */
    public static final class C4469b implements C4458a {
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: s.a.a.f.b.a$c */
    public static final class C4470c implements C4459b<Object> {
        /* renamed from: a */
        public void mo3749a(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: s.a.a.f.b.a$d */
    public static final class C4471d implements Runnable {
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, R> C4461d<Object[], R> m10063a(C4460c<T1, T2, T3, T4, R> cVar) {
        return new C4468a(cVar);
    }
}
