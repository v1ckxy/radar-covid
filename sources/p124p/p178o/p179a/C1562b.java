package p124p.p178o.p179a;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import p124p.p126b.p127k.C1061o;
import p124p.p143e.C1262i;
import p124p.p177n.C1542h;
import p124p.p177n.C1549n;
import p124p.p177n.C1550o;
import p124p.p177n.C1556s;
import p124p.p177n.C1557t;
import p124p.p177n.C1558u;
import p124p.p177n.C1559v;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.o.a.b */
public class C1562b extends C1561a {

    /* renamed from: a */
    public final C1542h f4579a;

    /* renamed from: b */
    public final C1565c f4580b;

    /* renamed from: p.o.a.b$a */
    public static class C1563a<D> extends C1549n<D> {

        /* renamed from: k */
        public C1542h f4581k;

        /* renamed from: l */
        public C1564b<D> f4582l;

        /* renamed from: a */
        public void mo834a() {
            throw null;
        }

        /* renamed from: a */
        public void mo837a(C1550o<? super D> oVar) {
            super.mo837a(oVar);
            this.f4581k = null;
            this.f4582l = null;
        }

        /* renamed from: b */
        public void mo838b() {
            throw null;
        }

        /* renamed from: b */
        public void mo840b(D d) {
            super.mo840b(d);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(0);
            sb.append(" : ");
            C1061o.m2496a((Object) null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: p.o.a.b$b */
    public static class C1564b<D> implements C1550o<D> {
    }

    /* renamed from: p.o.a.b$c */
    public static class C1565c extends C1556s {

        /* renamed from: c */
        public static final C1557t f4583c = new C1566a();

        /* renamed from: b */
        public C1262i<C1563a> f4584b = new C1262i<>(10);

        /* renamed from: p.o.a.b$c$a */
        public static class C1566a implements C1557t {
            /* renamed from: a */
            public <T extends C1556s> T mo6188a(Class<T> cls) {
                return new C1565c();
            }
        }

        /* renamed from: b */
        public void mo6184b() {
            if (this.f4584b.mo5617c() > 0) {
                C1563a aVar = (C1563a) this.f4584b.mo5621d(0);
                throw null;
            }
            C1262i<C1563a> iVar = this.f4584b;
            int i = iVar.f3594h;
            Object[] objArr = iVar.f3593g;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            iVar.f3594h = 0;
            iVar.f3591e = false;
        }
    }

    public C1562b(C1542h hVar, C1559v vVar) {
        this.f4579a = hVar;
        C1557t tVar = C1565c.f4583c;
        Class<C1565c> cls = C1565c.class;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String a = C1965a.m4751a("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            C1556s sVar = (C1556s) vVar.f4578a.get(a);
            if (!cls.isInstance(sVar)) {
                sVar = tVar instanceof C1558u ? ((C1558u) tVar).mo6252a(a, cls) : tVar.mo6188a(cls);
                C1556s sVar2 = (C1556s) vVar.f4578a.put(a, sVar);
                if (sVar2 != null) {
                    sVar2.mo6184b();
                }
            }
            this.f4580b = (C1565c) sVar;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Deprecated
    /* renamed from: a */
    public void mo6254a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C1565c cVar = this.f4580b;
        if (cVar.f4584b.mo5617c() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("    ");
            String sb2 = sb.toString();
            if (cVar.f4584b.mo5617c() > 0) {
                C1563a aVar = (C1563a) cVar.f4584b.mo5621d(0);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(cVar.f4584b.mo5614b(0));
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                printWriter.print(sb2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println(null);
                printWriter.print(sb2);
                printWriter.print("mLoader=");
                printWriter.println(null);
                throw null;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C1061o.m2496a((Object) this.f4579a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
