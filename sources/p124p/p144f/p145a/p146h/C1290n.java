package p124p.p144f.p145a.p146h;

import java.util.ArrayList;
import p124p.p144f.p145a.C1265c;

/* renamed from: p.f.a.h.n */
public class C1290n extends C1278d {

    /* renamed from: k0 */
    public ArrayList<C1278d> f3827k0 = new ArrayList<>();

    /* renamed from: a */
    public void mo5683a(C1265c cVar) {
        super.mo5683a(cVar);
        int size = this.f3827k0.size();
        for (int i = 0; i < size; i++) {
            ((C1278d) this.f3827k0.get(i)).mo5683a(cVar);
        }
    }

    /* renamed from: b */
    public void mo5689b(int i, int i2) {
        this.f3710O = i;
        this.f3711P = i2;
        int size = this.f3827k0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C1278d) this.f3827k0.get(i3)).mo5689b(this.f3704I + this.f3710O, this.f3705J + this.f3711P);
        }
    }

    /* renamed from: l */
    public void mo5707l() {
        this.f3827k0.clear();
        super.mo5707l();
    }

    /* renamed from: o */
    public void mo5708o() {
        int i = this.f3704I;
        int i2 = this.f3705J;
        this.f3708M = i;
        this.f3709N = i2;
        ArrayList<C1278d> arrayList = this.f3827k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1278d dVar = (C1278d) this.f3827k0.get(i3);
                dVar.mo5689b(this.f3708M + this.f3710O, this.f3709N + this.f3711P);
                if (!(dVar instanceof C1280e)) {
                    dVar.mo5708o();
                }
            }
        }
    }

    /* renamed from: p */
    public void mo5714p() {
        mo5708o();
        ArrayList<C1278d> arrayList = this.f3827k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C1278d dVar = (C1278d) this.f3827k0.get(i);
                if (dVar instanceof C1290n) {
                    ((C1290n) dVar).mo5714p();
                }
            }
        }
    }
}
