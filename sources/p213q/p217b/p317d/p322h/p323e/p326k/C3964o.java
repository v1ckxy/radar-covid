package p213q.p217b.p317d.p322h.p323e.p326k;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashSet;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p213q.p217b.p317d.p322h.p323e.p326k.C3975t.C3985j;

/* renamed from: q.b.d.h.e.k.o */
public class C3964o implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C3975t f9681e;

    public C3964o(C3975t tVar) {
        this.f9681e = tVar;
    }

    public void run() {
        File[] a;
        C3975t tVar = this.f9681e;
        File[] a2 = tVar.mo10175a((FilenameFilter) new C3985j());
        if (tVar != null) {
            HashSet hashSet = new HashSet();
            for (File file : a2) {
                C3913b bVar = C3913b.f9552c;
                StringBuilder sb = new StringBuilder();
                sb.append("Found invalid session part file: ");
                sb.append(file);
                bVar.mo10108a(sb.toString());
                hashSet.add(C3975t.m9399a(file));
            }
            if (!hashSet.isEmpty()) {
                for (File file2 : tVar.mo10175a((FilenameFilter) new C3967p(tVar, hashSet))) {
                    C3913b bVar2 = C3913b.f9552c;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Deleting invalid session file: ");
                    sb2.append(file2);
                    bVar2.mo10108a(sb2.toString());
                    file2.delete();
                }
                return;
            }
            return;
        }
        throw null;
    }
}
