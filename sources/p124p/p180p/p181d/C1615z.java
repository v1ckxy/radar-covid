package p124p.p180p.p181d;

import android.view.View;

/* renamed from: p.p.d.z */
public class C1615z {

    /* renamed from: a */
    public final C1617b f4746a;

    /* renamed from: b */
    public C1616a f4747b = new C1616a();

    /* renamed from: p.p.d.z$a */
    public static class C1616a {

        /* renamed from: a */
        public int f4748a = 0;

        /* renamed from: b */
        public int f4749b;

        /* renamed from: c */
        public int f4750c;

        /* renamed from: d */
        public int f4751d;

        /* renamed from: e */
        public int f4752e;

        /* renamed from: a */
        public int mo6379a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* renamed from: a */
        public boolean mo6380a() {
            int i = this.f4748a;
            if ((i & 7) != 0 && (i & (mo6379a(this.f4751d, this.f4749b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f4748a;
            if ((i2 & 112) != 0 && (i2 & (mo6379a(this.f4751d, this.f4750c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f4748a;
            if ((i3 & 1792) != 0 && (i3 & (mo6379a(this.f4752e, this.f4749b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f4748a;
            return (i4 & 28672) == 0 || (i4 & (mo6379a(this.f4752e, this.f4750c) << 12)) != 0;
        }
    }

    /* renamed from: p.p.d.z$b */
    public interface C1617b {
        /* renamed from: a */
        int mo1243a();

        /* renamed from: a */
        int mo1244a(View view);

        /* renamed from: a */
        View mo1245a(int i);

        /* renamed from: b */
        int mo1246b();

        /* renamed from: b */
        int mo1247b(View view);
    }

    public C1615z(C1617b bVar) {
        this.f4746a = bVar;
    }

    /* renamed from: a */
    public View mo6377a(int i, int i2, int i3, int i4) {
        int b = this.f4746a.mo1246b();
        int a = this.f4746a.mo1243a();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a2 = this.f4746a.mo1245a(i);
            int a3 = this.f4746a.mo1244a(a2);
            int b2 = this.f4746a.mo1247b(a2);
            C1616a aVar = this.f4747b;
            aVar.f4749b = b;
            aVar.f4750c = a;
            aVar.f4751d = a3;
            aVar.f4752e = b2;
            if (i3 != 0) {
                aVar.f4748a = 0;
                aVar.f4748a = i3 | 0;
                if (aVar.mo6380a()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                C1616a aVar2 = this.f4747b;
                aVar2.f4748a = 0;
                aVar2.f4748a = i4 | 0;
                if (aVar2.mo6380a()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: a */
    public boolean mo6378a(View view, int i) {
        C1616a aVar = this.f4747b;
        int b = this.f4746a.mo1246b();
        int a = this.f4746a.mo1243a();
        int a2 = this.f4746a.mo1244a(view);
        int b2 = this.f4746a.mo1247b(view);
        aVar.f4749b = b;
        aVar.f4750c = a;
        aVar.f4751d = a2;
        aVar.f4752e = b2;
        if (i == 0) {
            return false;
        }
        C1616a aVar2 = this.f4747b;
        aVar2.f4748a = 0;
        aVar2.f4748a = 0 | i;
        return aVar2.mo6380a();
    }
}
