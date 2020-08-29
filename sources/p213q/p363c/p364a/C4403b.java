package p213q.p363c.p364a;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.c.a.b */
public class C4403b {

    /* renamed from: a */
    public final ConcurrentMap<Class<?>, Set<C4408d>> f10499a = new ConcurrentHashMap();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, C4409e> f10500b = new ConcurrentHashMap();

    /* renamed from: c */
    public final String f10501c;

    /* renamed from: d */
    public final C4414i f10502d;

    /* renamed from: e */
    public final C4410f f10503e;

    /* renamed from: f */
    public final ThreadLocal<ConcurrentLinkedQueue<C4406c>> f10504f = new C4404a(this);

    /* renamed from: g */
    public final ThreadLocal<Boolean> f10505g = new C4405b(this);

    /* renamed from: h */
    public final ConcurrentMap<Class<?>, Set<Class<?>>> f10506h = new ConcurrentHashMap();

    /* renamed from: q.c.a.b$a */
    public class C4404a extends ThreadLocal<ConcurrentLinkedQueue<C4406c>> {
        public C4404a(C4403b bVar) {
        }

        public Object initialValue() {
            return new ConcurrentLinkedQueue();
        }
    }

    /* renamed from: q.c.a.b$b */
    public class C4405b extends ThreadLocal<Boolean> {
        public C4405b(C4403b bVar) {
        }

        public Object initialValue() {
            return Boolean.valueOf(false);
        }
    }

    /* renamed from: q.c.a.b$c */
    public static class C4406c {

        /* renamed from: a */
        public final Object f10507a;

        /* renamed from: b */
        public final C4408d f10508b;

        public C4406c(Object obj, C4408d dVar) {
            this.f10507a = obj;
            this.f10508b = dVar;
        }
    }

    public C4403b(C4414i iVar) {
        C4410f fVar = C4410f.f10519a;
        this.f10502d = iVar;
        this.f10501c = "default";
        this.f10503e = fVar;
    }

    /* renamed from: a */
    public static void m9985a(String str, InvocationTargetException invocationTargetException) {
        Throwable cause = invocationTargetException.getCause();
        String str2 = ": ";
        if (cause != null) {
            StringBuilder b = C1965a.m4763b(str, str2);
            b.append(cause.getMessage());
            throw new RuntimeException(b.toString(), cause);
        }
        StringBuilder b2 = C1965a.m4763b(str, str2);
        b2.append(invocationTargetException.getMessage());
        throw new RuntimeException(b2.toString(), invocationTargetException);
    }

    /* renamed from: a */
    public void mo10694a(Object obj) {
        if (obj != null) {
            this.f10502d.mo10708a(this);
            Class cls = obj.getClass();
            Set<Class> set = (Set) this.f10506h.get(cls);
            if (set == 0) {
                LinkedList linkedList = new LinkedList();
                HashSet hashSet = new HashSet();
                Class cls2 = cls;
                loop0:
                while (true) {
                    linkedList.add(cls2);
                    while (true) {
                        if (linkedList.isEmpty()) {
                            break loop0;
                        }
                        Class cls3 = (Class) linkedList.remove(0);
                        hashSet.add(cls3);
                        cls2 = cls3.getSuperclass();
                        if (cls2 != null) {
                        }
                    }
                }
                set = (Set) this.f10506h.putIfAbsent(cls, hashSet);
                if (set == 0) {
                    set = hashSet;
                }
            }
            boolean z = false;
            for (Class cls4 : set) {
                Set<C4408d> set2 = (Set) this.f10499a.get(cls4);
                if (set2 != null && !set2.isEmpty()) {
                    for (C4408d cVar : set2) {
                        ((ConcurrentLinkedQueue) this.f10504f.get()).offer(new C4406c(obj, cVar));
                    }
                    z = true;
                }
            }
            if (!z && !(obj instanceof C4407c)) {
                mo10694a(new C4407c(this, obj));
            }
            if (!((Boolean) this.f10505g.get()).booleanValue()) {
                this.f10505g.set(Boolean.valueOf(true));
                while (true) {
                    try {
                        C4406c cVar2 = (C4406c) ((ConcurrentLinkedQueue) this.f10504f.get()).poll();
                        if (cVar2 != null) {
                            if (cVar2.f10508b.f10514d) {
                                mo10695a(cVar2.f10507a, cVar2.f10508b);
                            }
                        } else {
                            return;
                        }
                    } finally {
                        this.f10505g.set(Boolean.valueOf(false));
                    }
                }
            }
        } else {
            throw new NullPointerException("Event to post must not be null.");
        }
    }

    /* renamed from: a */
    public void mo10695a(Object obj, C4408d dVar) {
        try {
            dVar.mo10700a(obj);
        } catch (InvocationTargetException e) {
            StringBuilder a = C1965a.m4756a("Could not dispatch event: ");
            a.append(obj.getClass());
            a.append(" to handler ");
            a.append(dVar);
            m9985a(a.toString(), e);
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo10696a(C4408d dVar, C4409e eVar) {
        try {
            Object a = eVar.mo10704a();
            if (a != null) {
                mo10695a(a, dVar);
            }
        } catch (InvocationTargetException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Producer ");
            sb.append(eVar);
            sb.append(" threw an exception.");
            m9985a(sb.toString(), e);
            throw null;
        }
    }

    public String toString() {
        return C1965a.m4754a(C1965a.m4756a("[Bus \""), this.f10501c, "\"]");
    }
}
