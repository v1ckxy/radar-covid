package p124p.p191u;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p124p.p191u.C1718i.C1721c;
import p124p.p191u.C1718i.C1722d;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.u.o */
public class C1730o extends C1718i {

    /* renamed from: M */
    public ArrayList<C1718i> f5062M = new ArrayList<>();

    /* renamed from: N */
    public boolean f5063N = true;

    /* renamed from: O */
    public int f5064O;

    /* renamed from: P */
    public boolean f5065P = false;

    /* renamed from: Q */
    public int f5066Q = 0;

    /* renamed from: p.u.o$a */
    public class C1731a extends C1725l {

        /* renamed from: a */
        public final /* synthetic */ C1718i f5067a;

        public C1731a(C1730o oVar, C1718i iVar) {
            this.f5067a = iVar;
        }

        /* renamed from: e */
        public void mo6538e(C1718i iVar) {
            this.f5067a.mo6584d();
            iVar.mo6574b((C1722d) this);
        }
    }

    /* renamed from: p.u.o$b */
    public static class C1732b extends C1725l {

        /* renamed from: a */
        public C1730o f5068a;

        public C1732b(C1730o oVar) {
            this.f5068a = oVar;
        }

        /* renamed from: a */
        public void mo6545a(C1718i iVar) {
            C1730o oVar = this.f5068a;
            if (!oVar.f5065P) {
                oVar.mo6585e();
                this.f5068a.f5065P = true;
            }
        }

        /* renamed from: e */
        public void mo6538e(C1718i iVar) {
            C1730o oVar = this.f5068a;
            int i = oVar.f5064O - 1;
            oVar.f5064O = i;
            if (i == 0) {
                oVar.f5065P = false;
                oVar.mo6576b();
            }
            iVar.mo6574b((C1722d) this);
        }
    }

    /* renamed from: a */
    public String mo6561a(String str) {
        String a = super.mo6561a(str);
        for (int i = 0; i < this.f5062M.size(); i++) {
            StringBuilder b = C1965a.m4763b(a, "\n");
            C1718i iVar = (C1718i) this.f5062M.get(i);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            b.append(iVar.mo6561a(sb.toString()));
            a = b.toString();
        }
        return a;
    }

    /* renamed from: a */
    public C1718i mo6594a(int i) {
        if (i < 0 || i >= this.f5062M.size()) {
            return null;
        }
        return (C1718i) this.f5062M.get(i);
    }

    /* renamed from: a */
    public C1718i mo6565a(C1722d dVar) {
        super.mo6565a(dVar);
        return this;
    }

    /* renamed from: a */
    public void mo6516a(C1734q qVar) {
        if (mo6578b(qVar.f5071b)) {
            Iterator it = this.f5062M.iterator();
            while (it.hasNext()) {
                C1718i iVar = (C1718i) it.next();
                if (iVar.mo6578b(qVar.f5071b)) {
                    iVar.mo6516a(qVar);
                    qVar.f5072c.add(iVar);
                }
            }
        }
    }

    /* renamed from: b */
    public C1718i mo6574b(C1722d dVar) {
        super.mo6574b(dVar);
        return this;
    }

    /* renamed from: b */
    public C1730o mo6596b(int i) {
        if (i == 0) {
            this.f5063N = true;
        } else if (i == 1) {
            this.f5063N = false;
        } else {
            throw new AndroidRuntimeException(C1965a.m4761b("Invalid parameter for TransitionSet ordering: ", i));
        }
        return this;
    }

    /* renamed from: b */
    public void mo6577b(C1734q qVar) {
        int size = this.f5062M.size();
        for (int i = 0; i < size; i++) {
            ((C1718i) this.f5062M.get(i)).mo6577b(qVar);
        }
    }

    /* renamed from: c */
    public void mo6580c(View view) {
        super.mo6580c(view);
        int size = this.f5062M.size();
        for (int i = 0; i < size; i++) {
            ((C1718i) this.f5062M.get(i)).mo6580c(view);
        }
    }

    /* renamed from: c */
    public void mo6517c(C1734q qVar) {
        if (mo6578b(qVar.f5071b)) {
            Iterator it = this.f5062M.iterator();
            while (it.hasNext()) {
                C1718i iVar = (C1718i) it.next();
                if (iVar.mo6578b(qVar.f5071b)) {
                    iVar.mo6517c(qVar);
                    qVar.f5072c.add(iVar);
                }
            }
        }
    }

    public void cancel() {
        super.cancel();
        int size = this.f5062M.size();
        for (int i = 0; i < size; i++) {
            ((C1718i) this.f5062M.get(i)).cancel();
        }
    }

    public C1718i clone() {
        C1730o oVar = (C1730o) super.clone();
        oVar.f5062M = new ArrayList<>();
        int size = this.f5062M.size();
        for (int i = 0; i < size; i++) {
            C1718i clone = ((C1718i) this.f5062M.get(i)).clone();
            oVar.f5062M.add(clone);
            clone.f5042v = oVar;
        }
        return oVar;
    }

    /* renamed from: d */
    public C1718i mo6583d(View view) {
        for (int i = 0; i < this.f5062M.size(); i++) {
            ((C1718i) this.f5062M.get(i)).mo6583d(view);
        }
        this.f5030j.remove(view);
        return this;
    }

    /* renamed from: e */
    public void mo6586e(View view) {
        super.mo6586e(view);
        int size = this.f5062M.size();
        for (int i = 0; i < size; i++) {
            ((C1718i) this.f5062M.get(i)).mo6586e(view);
        }
    }

    /* renamed from: a */
    public C1718i mo6564a(View view) {
        for (int i = 0; i < this.f5062M.size(); i++) {
            ((C1718i) this.f5062M.get(i)).mo6564a(view);
        }
        this.f5030j.add(view);
        return this;
    }

    /* renamed from: b */
    public C1718i mo6573b(long j) {
        this.f5026f = j;
        return this;
    }

    /* renamed from: d */
    public void mo6584d() {
        if (this.f5062M.isEmpty()) {
            mo6585e();
            mo6576b();
            return;
        }
        C1732b bVar = new C1732b(this);
        Iterator it = this.f5062M.iterator();
        while (it.hasNext()) {
            ((C1718i) it.next()).mo6565a((C1722d) bVar);
        }
        this.f5064O = this.f5062M.size();
        if (!this.f5063N) {
            for (int i = 1; i < this.f5062M.size(); i++) {
                ((C1718i) this.f5062M.get(i - 1)).mo6565a((C1722d) new C1731a(this, (C1718i) this.f5062M.get(i)));
            }
            C1718i iVar = (C1718i) this.f5062M.get(0);
            if (iVar != null) {
                iVar.mo6584d();
            }
        } else {
            Iterator it2 = this.f5062M.iterator();
            while (it2.hasNext()) {
                ((C1718i) it2.next()).mo6584d();
            }
        }
    }

    /* renamed from: a */
    public C1730o mo6595a(C1718i iVar) {
        this.f5062M.add(iVar);
        iVar.f5042v = this;
        long j = this.f5027g;
        if (j >= 0) {
            iVar.mo6562a(j);
        }
        if ((this.f5066Q & 1) != 0) {
            iVar.mo6563a(this.f5028h);
        }
        if ((this.f5066Q & 2) != 0) {
            iVar.mo6571a((C1729n) null);
        }
        if ((this.f5066Q & 4) != 0) {
            iVar.mo6569a(this.f5024I);
        }
        if ((this.f5066Q & 8) != 0) {
            iVar.mo6570a(this.f5023H);
        }
        return this;
    }

    /* renamed from: a */
    public void mo6567a(ViewGroup viewGroup, C1735r rVar, C1735r rVar2, ArrayList<C1734q> arrayList, ArrayList<C1734q> arrayList2) {
        long j = this.f5026f;
        int size = this.f5062M.size();
        for (int i = 0; i < size; i++) {
            C1718i iVar = (C1718i) this.f5062M.get(i);
            if (j > 0 && (this.f5063N || i == 0)) {
                long j2 = iVar.f5026f;
                if (j2 > 0) {
                    iVar.mo6573b(j2 + j);
                } else {
                    iVar.mo6573b(j);
                }
            }
            iVar.mo6567a(viewGroup, rVar, rVar2, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public C1730o m4351a(long j) {
        this.f5027g = j;
        if (j >= 0) {
            ArrayList<C1718i> arrayList = this.f5062M;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((C1718i) this.f5062M.get(i)).mo6562a(j);
                }
            }
        }
        return this;
    }

    /* renamed from: a */
    public void mo6570a(C1721c cVar) {
        this.f5023H = cVar;
        this.f5066Q |= 8;
        int size = this.f5062M.size();
        for (int i = 0; i < size; i++) {
            ((C1718i) this.f5062M.get(i)).mo6570a(cVar);
        }
    }

    /* renamed from: a */
    public C1730o m4352a(TimeInterpolator timeInterpolator) {
        this.f5066Q |= 1;
        ArrayList<C1718i> arrayList = this.f5062M;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C1718i) this.f5062M.get(i)).mo6563a(timeInterpolator);
            }
        }
        this.f5028h = timeInterpolator;
        return this;
    }

    /* renamed from: a */
    public void mo6569a(C1712e eVar) {
        this.f5024I = eVar == null ? C1718i.f5014K : eVar;
        this.f5066Q |= 4;
        if (this.f5062M != null) {
            for (int i = 0; i < this.f5062M.size(); i++) {
                ((C1718i) this.f5062M.get(i)).mo6569a(eVar);
            }
        }
    }

    /* renamed from: a */
    public void mo6571a(C1729n nVar) {
        this.f5022G = nVar;
        this.f5066Q |= 2;
        int size = this.f5062M.size();
        for (int i = 0; i < size; i++) {
            ((C1718i) this.f5062M.get(i)).mo6571a(nVar);
        }
    }
}
