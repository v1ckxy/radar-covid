package p425x.p426a.p427a;

/* renamed from: x.a.a.e */
public class C4933e {

    /* renamed from: d */
    public static final C4929d[] f11770d = new C4929d[0];

    /* renamed from: a */
    public C4929d[] f11771a;

    /* renamed from: b */
    public int f11772b;

    /* renamed from: c */
    public boolean f11773c;

    public C4933e(int i) {
        if (i >= 0) {
            this.f11771a = i == 0 ? f11770d : new C4929d[i];
            this.f11772b = 0;
            this.f11773c = false;
            return;
        }
        throw new IllegalArgumentException("'initialCapacity' must not be negative");
    }

    /* renamed from: a */
    public C4929d mo11572a(int i) {
        if (i < this.f11772b) {
            return this.f11771a[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" >= ");
        sb.append(this.f11772b);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: a */
    public void mo11573a(C4929d dVar) {
        if (dVar != null) {
            boolean z = true;
            int i = this.f11772b + 1;
            if (i <= this.f11771a.length) {
                z = false;
            }
            if (this.f11773c || z) {
                C4929d[] dVarArr = new C4929d[Math.max(this.f11771a.length, (i >> 1) + i)];
                System.arraycopy(this.f11771a, 0, dVarArr, 0, this.f11772b);
                this.f11771a = dVarArr;
                this.f11773c = false;
            }
            this.f11771a[this.f11772b] = dVar;
            this.f11772b = i;
            return;
        }
        throw new NullPointerException("'element' cannot be null");
    }

    /* renamed from: a */
    public C4929d[] mo11574a() {
        int i = this.f11772b;
        if (i == 0) {
            return f11770d;
        }
        C4929d[] dVarArr = this.f11771a;
        if (dVarArr.length == i) {
            this.f11773c = true;
            return dVarArr;
        }
        C4929d[] dVarArr2 = new C4929d[i];
        System.arraycopy(dVarArr, 0, dVarArr2, 0, i);
        return dVarArr2;
    }
}
