package p124p.p199y.p200x.p210t.p211p;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p298b.p299a.p300a.C3498a;

/* renamed from: p.y.x.t.p.a */
public abstract class C1949a<V> implements C3498a<V> {

    /* renamed from: h */
    public static final boolean f5597h = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: i */
    public static final Logger f5598i = Logger.getLogger(C1949a.class.getName());

    /* renamed from: j */
    public static final C1951b f5599j;

    /* renamed from: k */
    public static final Object f5600k = new Object();

    /* renamed from: e */
    public volatile Object f5601e;

    /* renamed from: f */
    public volatile C1955e f5602f;

    /* renamed from: g */
    public volatile C1959i f5603g;

    /* renamed from: p.y.x.t.p.a$b */
    public static abstract class C1951b {
        public /* synthetic */ C1951b(C1950a aVar) {
        }

        /* renamed from: a */
        public abstract void mo6949a(C1959i iVar, Thread thread);

        /* renamed from: a */
        public abstract void mo6950a(C1959i iVar, C1959i iVar2);

        /* renamed from: a */
        public abstract boolean mo6951a(C1949a<?> aVar, Object obj, Object obj2);

        /* renamed from: a */
        public abstract boolean mo6952a(C1949a<?> aVar, C1955e eVar, C1955e eVar2);

        /* renamed from: a */
        public abstract boolean mo6953a(C1949a<?> aVar, C1959i iVar, C1959i iVar2);
    }

    /* renamed from: p.y.x.t.p.a$c */
    public static final class C1952c {

        /* renamed from: c */
        public static final C1952c f5604c;

        /* renamed from: d */
        public static final C1952c f5605d;

        /* renamed from: a */
        public final boolean f5606a;

        /* renamed from: b */
        public final Throwable f5607b;

        static {
            if (C1949a.f5597h) {
                f5605d = null;
                f5604c = null;
                return;
            }
            f5605d = new C1952c(false, null);
            f5604c = new C1952c(true, null);
        }

        public C1952c(boolean z, Throwable th) {
            this.f5606a = z;
            this.f5607b = th;
        }
    }

    /* renamed from: p.y.x.t.p.a$d */
    public static final class C1953d {

        /* renamed from: b */
        public static final C1953d f5608b = new C1953d(new C1954a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        public final Throwable f5609a;

        /* renamed from: p.y.x.t.p.a$d$a */
        public class C1954a extends Throwable {
            public C1954a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public C1953d(Throwable th) {
            C1949a.m4717b(th);
            this.f5609a = th;
        }
    }

    /* renamed from: p.y.x.t.p.a$e */
    public static final class C1955e {

        /* renamed from: d */
        public static final C1955e f5610d = new C1955e(null, null);

        /* renamed from: a */
        public final Runnable f5611a;

        /* renamed from: b */
        public final Executor f5612b;

        /* renamed from: c */
        public C1955e f5613c;

        public C1955e(Runnable runnable, Executor executor) {
            this.f5611a = runnable;
            this.f5612b = executor;
        }
    }

    /* renamed from: p.y.x.t.p.a$f */
    public static final class C1956f extends C1951b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<C1959i, Thread> f5614a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<C1959i, C1959i> f5615b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<C1949a, C1959i> f5616c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<C1949a, C1955e> f5617d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<C1949a, Object> f5618e;

        public C1956f(AtomicReferenceFieldUpdater<C1959i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C1959i, C1959i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<C1949a, C1959i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<C1949a, C1955e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<C1949a, Object> atomicReferenceFieldUpdater5) {
            super(null);
            this.f5614a = atomicReferenceFieldUpdater;
            this.f5615b = atomicReferenceFieldUpdater2;
            this.f5616c = atomicReferenceFieldUpdater3;
            this.f5617d = atomicReferenceFieldUpdater4;
            this.f5618e = atomicReferenceFieldUpdater5;
        }

        /* renamed from: a */
        public void mo6949a(C1959i iVar, Thread thread) {
            this.f5614a.lazySet(iVar, thread);
        }

        /* renamed from: a */
        public void mo6950a(C1959i iVar, C1959i iVar2) {
            this.f5615b.lazySet(iVar, iVar2);
        }

        /* renamed from: a */
        public boolean mo6951a(C1949a<?> aVar, Object obj, Object obj2) {
            return this.f5618e.compareAndSet(aVar, obj, obj2);
        }

        /* renamed from: a */
        public boolean mo6952a(C1949a<?> aVar, C1955e eVar, C1955e eVar2) {
            return this.f5617d.compareAndSet(aVar, eVar, eVar2);
        }

        /* renamed from: a */
        public boolean mo6953a(C1949a<?> aVar, C1959i iVar, C1959i iVar2) {
            return this.f5616c.compareAndSet(aVar, iVar, iVar2);
        }
    }

    /* renamed from: p.y.x.t.p.a$g */
    public static final class C1957g<V> implements Runnable {

        /* renamed from: e */
        public final C1949a<V> f5619e;

        /* renamed from: f */
        public final C3498a<? extends V> f5620f;

        public C1957g(C1949a<V> aVar, C3498a<? extends V> aVar2) {
            this.f5619e = aVar;
            this.f5620f = aVar2;
        }

        public void run() {
            if (this.f5619e.f5601e == this) {
                if (C1949a.f5599j.mo6951a(this.f5619e, (Object) this, C1949a.m4715a(this.f5620f))) {
                    C1949a.m4716a(this.f5619e);
                }
            }
        }
    }

    /* renamed from: p.y.x.t.p.a$h */
    public static final class C1958h extends C1951b {
        public C1958h() {
            super(null);
        }

        /* renamed from: a */
        public void mo6949a(C1959i iVar, Thread thread) {
            iVar.f5622a = thread;
        }

        /* renamed from: a */
        public void mo6950a(C1959i iVar, C1959i iVar2) {
            iVar.f5623b = iVar2;
        }

        /* renamed from: a */
        public boolean mo6951a(C1949a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f5601e != obj) {
                    return false;
                }
                aVar.f5601e = obj2;
                return true;
            }
        }

        /* renamed from: a */
        public boolean mo6952a(C1949a<?> aVar, C1955e eVar, C1955e eVar2) {
            synchronized (aVar) {
                if (aVar.f5602f != eVar) {
                    return false;
                }
                aVar.f5602f = eVar2;
                return true;
            }
        }

        /* renamed from: a */
        public boolean mo6953a(C1949a<?> aVar, C1959i iVar, C1959i iVar2) {
            synchronized (aVar) {
                if (aVar.f5603g != iVar) {
                    return false;
                }
                aVar.f5603g = iVar2;
                return true;
            }
        }
    }

    /* renamed from: p.y.x.t.p.a$i */
    public static final class C1959i {

        /* renamed from: c */
        public static final C1959i f5621c = new C1959i(false);

        /* renamed from: a */
        public volatile Thread f5622a;

        /* renamed from: b */
        public volatile C1959i f5623b;

        public C1959i() {
            C1949a.f5599j.mo6949a(this, Thread.currentThread());
        }

        public C1959i(boolean z) {
        }
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [p.y.x.t.p.a$h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        /*
            java.lang.Class<p.y.x.t.p.a$i> r0 = p124p.p199y.p200x.p210t.p211p.C1949a.C1959i.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f5597h = r1
            java.lang.Class<p.y.x.t.p.a> r1 = p124p.p199y.p200x.p210t.p211p.C1949a.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f5598i = r1
            p.y.x.t.p.a$f r1 = new p.y.x.t.p.a$f     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<p.y.x.t.p.a> r2 = p124p.p199y.p200x.p210t.p211p.C1949a.class
            java.lang.String r5 = "g"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<p.y.x.t.p.a> r0 = p124p.p199y.p200x.p210t.p211p.C1949a.class
            java.lang.Class<p.y.x.t.p.a$e> r2 = p124p.p199y.p200x.p210t.p211p.C1949a.C1955e.class
            java.lang.String r6 = "f"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<p.y.x.t.p.a> r0 = p124p.p199y.p200x.p210t.p211p.C1949a.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "e"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            p.y.x.t.p.a$h r1 = new p.y.x.t.p.a$h
            r1.<init>()
        L_0x0054:
            f5599j = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f5598i
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f5600k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p199y.p200x.p210t.p211p.C1949a.<clinit>():void");
    }

    /* renamed from: a */
    public static <V> V m4714a(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: a */
    public static Object m4715a(C3498a<?> aVar) {
        if (aVar instanceof C1949a) {
            Object obj = ((C1949a) aVar).f5601e;
            if (obj instanceof C1952c) {
                C1952c cVar = (C1952c) obj;
                if (cVar.f5606a) {
                    obj = cVar.f5607b != null ? new C1952c(false, cVar.f5607b) : C1952c.f5605d;
                }
            }
            return obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f5597h) && isCancelled) {
            return C1952c.f5605d;
        }
        try {
            Object a = m4714a((Future<V>) aVar);
            if (a == null) {
                a = f5600k;
            }
            return a;
        } catch (ExecutionException e) {
            return new C1953d(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new C1952c(false, e2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb.append(aVar);
            return new C1953d(new IllegalArgumentException(sb.toString(), e2));
        } catch (Throwable th) {
            return new C1953d(th);
        }
    }

    /* renamed from: b */
    public static <T> T m4717b(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: b */
    public static void m4718b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f5598i;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder();
            sb.append("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), e);
        }
    }

    /* renamed from: a */
    public final void mo6941a(StringBuilder sb) {
        String str = "]";
        try {
            Object a = m4714a((Future<V>) this);
            sb.append("SUCCESS, result=[");
            sb.append(a == this ? "this future" : String.valueOf(a));
            sb.append(str);
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append(str);
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            str = " thrown from get()]";
            sb.append(str);
        }
    }

    /* renamed from: a */
    public final void mo6942a(C1959i iVar) {
        iVar.f5622a = null;
        while (true) {
            C1959i iVar2 = this.f5603g;
            if (iVar2 != C1959i.f5621c) {
                C1959i iVar3 = null;
                while (iVar2 != null) {
                    C1959i iVar4 = iVar2.f5623b;
                    if (iVar2.f5622a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f5623b = iVar4;
                        if (iVar3.f5622a == null) {
                        }
                    } else if (!f5599j.mo6953a(this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    public final boolean cancel(boolean z) {
        Object obj = this.f5601e;
        if (!(obj == null) && !(obj instanceof C1957g)) {
            return false;
        }
        C1952c cVar = f5597h ? new C1952c(z, new CancellationException("Future.cancel() was called.")) : z ? C1952c.f5604c : C1952c.f5605d;
        C1949a aVar = this;
        boolean z2 = false;
        while (true) {
            if (f5599j.mo6951a(aVar, obj, (Object) cVar)) {
                m4716a(aVar);
                if (!(obj instanceof C1957g)) {
                    return true;
                }
                C3498a<? extends V> aVar2 = ((C1957g) obj).f5620f;
                if (aVar2 instanceof C1949a) {
                    aVar = (C1949a) aVar2;
                    obj = aVar.f5601e;
                    if (!(obj == null) && !(obj instanceof C1957g)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    aVar2.cancel(z);
                    return true;
                }
            } else {
                obj = aVar.f5601e;
                if (!(obj instanceof C1957g)) {
                    return z2;
                }
            }
        }
    }

    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5601e;
            if ((obj2 != null) && (!(obj2 instanceof C1957g))) {
                return mo6938a(obj2);
            }
            C1959i iVar = this.f5603g;
            if (iVar != C1959i.f5621c) {
                C1959i iVar2 = new C1959i();
                do {
                    f5599j.mo6950a(iVar2, iVar);
                    if (f5599j.mo6953a(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5601e;
                            } else {
                                mo6942a(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C1957g))));
                        return mo6938a(obj);
                    }
                    iVar = this.f5603g;
                } while (iVar != C1959i.f5621c);
            }
            return mo6938a(this.f5601e);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f5601e instanceof C1952c;
    }

    public final boolean isDone() {
        Object obj = this.f5601e;
        return (!(obj instanceof C1957g)) & (obj != null);
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        String str3 = "]";
        if (this.f5601e instanceof C1952c) {
            str = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    str2 = mo6939a();
                } catch (RuntimeException e) {
                    StringBuilder a = C1965a.m4756a("Exception thrown from implementation: ");
                    a.append(e.getClass());
                    str2 = a.toString();
                }
                if (str2 != null && !str2.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str2);
                    sb.append(str3);
                    sb.append(str3);
                    return sb.toString();
                } else if (!isDone()) {
                    str = "PENDING";
                }
            }
            mo6941a(sb);
            sb.append(str3);
            return sb.toString();
        }
        sb.append(str);
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo6940a(Runnable runnable, Executor executor) {
        if (runnable == null) {
            throw null;
        } else if (executor != null) {
            C1955e eVar = this.f5602f;
            if (eVar != C1955e.f5610d) {
                C1955e eVar2 = new C1955e(runnable, executor);
                do {
                    eVar2.f5613c = eVar;
                    if (!f5599j.mo6952a(this, eVar, eVar2)) {
                        eVar = this.f5602f;
                    } else {
                        return;
                    }
                } while (eVar != C1955e.f5610d);
            }
            m4718b(runnable, executor);
        } else {
            throw null;
        }
    }

    public final V get(long j, TimeUnit timeUnit) {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f5601e;
            boolean z = true;
            if ((obj != null) && (!(obj instanceof C1957g))) {
                return mo6938a(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C1959i iVar = this.f5603g;
                if (iVar != C1959i.f5621c) {
                    C1959i iVar2 = new C1959i();
                    do {
                        f5599j.mo6950a(iVar2, iVar);
                        if (f5599j.mo6953a(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f5601e;
                                    if ((obj2 != null) && (!(obj2 instanceof C1957g))) {
                                        return mo6938a(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    mo6942a(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            mo6942a(iVar2);
                        } else {
                            iVar = this.f5603g;
                        }
                    } while (iVar != C1959i.f5621c);
                }
                return mo6938a(this.f5601e);
            }
            while (nanos > 0) {
                Object obj3 = this.f5601e;
                if ((obj3 != null) && (!(obj3 instanceof C1957g))) {
                    return mo6938a(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder();
            sb.append("Waited ");
            sb.append(j2);
            String str = " ";
            sb.append(str);
            sb.append(timeUnit.toString().toLowerCase(Locale.ROOT));
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String a = C1965a.m4751a(sb2, " (plus ");
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                if (i != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (i > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(a);
                    sb3.append(convert);
                    sb3.append(str);
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z) {
                        sb4 = C1965a.m4751a(sb4, ",");
                    }
                    a = C1965a.m4751a(sb4, str);
                }
                if (z) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(a);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    a = sb5.toString();
                }
                sb2 = C1965a.m4751a(a, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(C1965a.m4751a(sb2, " but future completed as timeout expired"));
            }
            throw new TimeoutException(C1965a.m4752a(sb2, " for ", aVar));
        }
        throw new InterruptedException();
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=p.y.x.t.p.a<?>, code=p.y.x.t.p.a, for r5v0, types: [p.y.x.t.p.a, p.y.x.t.p.a<?>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m4716a(p124p.p199y.p200x.p210t.p211p.C1949a r5) {
        /*
            r0 = 0
            r1 = r0
        L_0x0002:
            p.y.x.t.p.a$i r2 = r5.f5603g
            p.y.x.t.p.a$b r3 = f5599j
            p.y.x.t.p.a$i r4 = p124p.p199y.p200x.p210t.p211p.C1949a.C1959i.f5621c
            boolean r3 = r3.mo6953a(r5, r2, r4)
            if (r3 == 0) goto L_0x0002
        L_0x000e:
            if (r2 == 0) goto L_0x001c
            java.lang.Thread r3 = r2.f5622a
            if (r3 == 0) goto L_0x0019
            r2.f5622a = r0
            java.util.concurrent.locks.LockSupport.unpark(r3)
        L_0x0019:
            p.y.x.t.p.a$i r2 = r2.f5623b
            goto L_0x000e
        L_0x001c:
            p.y.x.t.p.a$e r2 = r5.f5602f
            p.y.x.t.p.a$b r3 = f5599j
            p.y.x.t.p.a$e r4 = p124p.p199y.p200x.p210t.p211p.C1949a.C1955e.f5610d
            boolean r3 = r3.mo6952a(r5, r2, r4)
            if (r3 == 0) goto L_0x001c
        L_0x0028:
            r5 = r1
            r1 = r2
            if (r1 == 0) goto L_0x0031
            p.y.x.t.p.a$e r2 = r1.f5613c
            r1.f5613c = r5
            goto L_0x0028
        L_0x0031:
            if (r5 == 0) goto L_0x0059
            p.y.x.t.p.a$e r1 = r5.f5613c
            java.lang.Runnable r2 = r5.f5611a
            boolean r3 = r2 instanceof p124p.p199y.p200x.p210t.p211p.C1949a.C1957g
            if (r3 == 0) goto L_0x0052
            p.y.x.t.p.a$g r2 = (p124p.p199y.p200x.p210t.p211p.C1949a.C1957g) r2
            p.y.x.t.p.a<V> r5 = r2.f5619e
            java.lang.Object r3 = r5.f5601e
            if (r3 != r2) goto L_0x0057
            q.b.b.a.a.a<? extends V> r3 = r2.f5620f
            java.lang.Object r3 = m4715a(r3)
            p.y.x.t.p.a$b r4 = f5599j
            boolean r2 = r4.mo6951a(r5, r2, r3)
            if (r2 == 0) goto L_0x0057
            goto L_0x0002
        L_0x0052:
            java.util.concurrent.Executor r5 = r5.f5612b
            m4718b(r2, r5)
        L_0x0057:
            r5 = r1
            goto L_0x0031
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p199y.p200x.p210t.p211p.C1949a.m4716a(p.y.x.t.p.a):void");
    }

    /* renamed from: a */
    public final V mo6938a(Object obj) {
        if (obj instanceof C1952c) {
            Throwable th = ((C1952c) obj).f5607b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C1953d) {
            throw new ExecutionException(((C1953d) obj).f5609a);
        } else if (obj == f5600k) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: a */
    public String mo6939a() {
        Object obj = this.f5601e;
        if (obj instanceof C1957g) {
            StringBuilder a = C1965a.m4756a("setFuture=[");
            C3498a<? extends V> aVar = ((C1957g) obj).f5620f;
            return C1965a.m4754a(a, aVar == this ? "this future" : String.valueOf(aVar), "]");
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder a2 = C1965a.m4756a("remaining delay=[");
            a2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            a2.append(" ms]");
            return a2.toString();
        }
    }
}
