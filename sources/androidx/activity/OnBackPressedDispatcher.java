package androidx.activity;

import java.util.ArrayDeque;
import java.util.Iterator;
import p124p.p125a.C1015a;
import p124p.p125a.C1016b;
import p124p.p170k.p171a.C1490k;
import p124p.p177n.C1537e;
import p124p.p177n.C1537e.C1538a;
import p124p.p177n.C1540f;
import p124p.p177n.C1542h;
import p124p.p177n.C1543i;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    public final Runnable f13a;

    /* renamed from: b */
    public final ArrayDeque<C1016b> f14b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements C1540f, C1015a {

        /* renamed from: a */
        public final C1537e f15a;

        /* renamed from: b */
        public final C1016b f16b;

        /* renamed from: c */
        public C1015a f17c;

        public LifecycleOnBackPressedCancellable(C1537e eVar, C1016b bVar) {
            this.f15a = eVar;
            this.f16b = bVar;
            eVar.mo6227a(this);
        }

        /* renamed from: a */
        public void mo9a(C1542h hVar, C1538a aVar) {
            if (aVar == C1538a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                C1016b bVar = this.f16b;
                onBackPressedDispatcher.f14b.add(bVar);
                C0005a aVar2 = new C0005a(bVar);
                bVar.f2674b.add(aVar2);
                this.f17c = aVar2;
            } else if (aVar == C1538a.ON_STOP) {
                C1015a aVar3 = this.f17c;
                if (aVar3 != null) {
                    aVar3.cancel();
                }
            } else if (aVar == C1538a.ON_DESTROY) {
                cancel();
            }
        }

        public void cancel() {
            ((C1543i) this.f15a).f4558a.remove(this);
            this.f16b.f2674b.remove(this);
            C1015a aVar = this.f17c;
            if (aVar != null) {
                aVar.cancel();
                this.f17c = null;
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    public class C0005a implements C1015a {

        /* renamed from: a */
        public final C1016b f19a;

        public C0005a(C1016b bVar) {
            this.f19a = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f14b.remove(this.f19a);
            this.f19a.f2674b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f13a = runnable;
    }

    /* renamed from: a */
    public void mo11a() {
        Iterator descendingIterator = this.f14b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C1016b bVar = (C1016b) descendingIterator.next();
            if (bVar.f2673a) {
                C1490k kVar = C1490k.this;
                kVar.mo6158k();
                if (kVar.f4389o.f2673a) {
                    kVar.mo6095c();
                } else {
                    kVar.f4388n.mo11a();
                }
                return;
            }
        }
        Runnable runnable = this.f13a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
