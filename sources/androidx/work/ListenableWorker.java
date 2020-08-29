package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import p124p.p199y.C1792e;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p298b.p299a.p300a.C3498a;

public abstract class ListenableWorker {

    /* renamed from: e */
    public Context f978e;

    /* renamed from: f */
    public WorkerParameters f979f;

    /* renamed from: g */
    public boolean f980g;

    /* renamed from: androidx.work.ListenableWorker$a */
    public static abstract class C0177a {

        /* renamed from: androidx.work.ListenableWorker$a$a */
        public static final class C0178a extends C0177a {

            /* renamed from: a */
            public final C1792e f981a = C1792e.f5264c;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0178a.class != obj.getClass()) {
                    return false;
                }
                return this.f981a.equals(((C0178a) obj).f981a);
            }

            public int hashCode() {
                return this.f981a.hashCode() + (C0178a.class.getName().hashCode() * 31);
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Failure {mOutputData=");
                a.append(this.f981a);
                a.append('}');
                return a.toString();
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$b */
        public static final class C0179b extends C0177a {
            public boolean equals(Object obj) {
                boolean z = true;
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0179b.class != obj.getClass()) {
                    z = false;
                }
                return z;
            }

            public int hashCode() {
                return C0179b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$c */
        public static final class C0180c extends C0177a {

            /* renamed from: a */
            public final C1792e f982a;

            public C0180c() {
                this.f982a = C1792e.f5264c;
            }

            public C0180c(C1792e eVar) {
                this.f982a = eVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0180c.class != obj.getClass()) {
                    return false;
                }
                return this.f982a.equals(((C0180c) obj).f982a);
            }

            public int hashCode() {
                return this.f982a.hashCode() + (C0180c.class.getName().hashCode() * 31);
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Success {mOutputData=");
                a.append(this.f982a);
                a.append('}');
                return a.toString();
            }
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.f978e = context;
            this.f979f = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    /* renamed from: a */
    public boolean mo1442a() {
        return false;
    }

    /* renamed from: b */
    public void mo1443b() {
    }

    /* renamed from: c */
    public abstract C3498a<C0177a> mo1444c();

    /* renamed from: d */
    public final void mo1445d() {
        mo1443b();
    }
}
