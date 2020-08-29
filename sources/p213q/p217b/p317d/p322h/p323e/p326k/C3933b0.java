package p213q.p217b.p317d.p322h.p323e.p326k;

import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p270l.C3253h;
import p213q.p217b.p218a.p231b.p270l.C3255i;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p213q.p217b.p317d.p322h.p323e.p326k.C3975t.C3981f;
import p213q.p217b.p317d.p322h.p323e.p333q.C4145a;
import p213q.p217b.p317d.p322h.p323e.p333q.p334c.C4152b;
import p213q.p217b.p317d.p322h.p323e.p333q.p334c.C4153c;
import p213q.p217b.p317d.p322h.p323e.p333q.p334c.C4155d;

/* renamed from: q.b.d.h.e.k.b0 */
public class C3933b0 implements Callable<C3255i<Void>> {

    /* renamed from: e */
    public final /* synthetic */ Boolean f9596e;

    /* renamed from: f */
    public final /* synthetic */ C3981f f9597f;

    public C3933b0(C3981f fVar, Boolean bool) {
        this.f9597f = fVar;
        this.f9596e = bool;
    }

    public Object call() {
        C4145a aVar = C3975t.this.f9730m;
        if (aVar != null) {
            C3913b.f9552c.mo10108a("Checking for crash reports...");
            File[] g = C3975t.this.mo10181g();
            File[] listFiles = C3975t.this.mo10178d().listFiles();
            if (listFiles == null) {
                listFiles = new File[0];
            }
            LinkedList linkedList = new LinkedList();
            if (g != null) {
                for (File file : g) {
                    C3913b bVar = C3913b.f9552c;
                    StringBuilder a = C1965a.m4756a("Found crash report ");
                    a.append(file.getPath());
                    bVar.mo10108a(a.toString());
                    linkedList.add(new C4155d(file, Collections.emptyMap()));
                }
            }
            for (File bVar2 : listFiles) {
                linkedList.add(new C4152b(bVar2));
            }
            if (linkedList.isEmpty()) {
                C3913b.f9552c.mo10108a("No reports found.");
            }
            if (!this.f9596e.booleanValue()) {
                C3913b.f9552c.mo10108a("Reports are being deleted.");
                File[] a2 = C3975t.this.mo10175a(C3975t.f9716y);
                if (a2 != null) {
                    for (File delete : a2) {
                        delete.delete();
                    }
                }
                if (C3975t.this.f9730m != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((C4153c) it.next()).remove();
                    }
                    C3975t.this.f9736s.f9774b.mo10335a();
                    C3975t.this.f9740w.mo8941a(null);
                    return C2286e.m5291b(null);
                }
                throw null;
            }
            C3913b.f9552c.mo10108a("Reports are being sent.");
            boolean booleanValue = this.f9596e.booleanValue();
            C3959l0 l0Var = C3975t.this.f9719b;
            if (l0Var == null) {
                throw null;
            } else if (booleanValue) {
                l0Var.f9666g.mo8941a(null);
                C3981f fVar = this.f9597f;
                ExecutorService executorService = C3975t.this.f9722e.f9640a;
                return fVar.f9746a.mo8927a((Executor) executorService, (C3253h<TResult, TContinuationResult>) new C3931a0<TResult,TContinuationResult>(this, linkedList, booleanValue, executorService));
            } else {
                throw new IllegalStateException("An invalid data collection token was used.");
            }
        } else {
            throw null;
        }
    }
}
