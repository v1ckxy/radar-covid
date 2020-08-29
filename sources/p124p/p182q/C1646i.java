package p124p.p182q;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;
import p124p.p188t.p189a.C1674d;
import p124p.p188t.p189a.C1675e;

/* renamed from: p.q.i */
public class C1646i implements C1675e, C1674d {

    /* renamed from: m */
    public static final TreeMap<Integer, C1646i> f4843m = new TreeMap<>();

    /* renamed from: e */
    public volatile String f4844e;

    /* renamed from: f */
    public final long[] f4845f;

    /* renamed from: g */
    public final double[] f4846g;

    /* renamed from: h */
    public final String[] f4847h;

    /* renamed from: i */
    public final byte[][] f4848i;

    /* renamed from: j */
    public final int[] f4849j;

    /* renamed from: k */
    public final int f4850k;

    /* renamed from: l */
    public int f4851l;

    public C1646i(int i) {
        this.f4850k = i;
        int i2 = i + 1;
        this.f4849j = new int[i2];
        this.f4845f = new long[i2];
        this.f4846g = new double[i2];
        this.f4847h = new String[i2];
        this.f4848i = new byte[i2][];
    }

    /* renamed from: a */
    public static C1646i m4184a(String str, int i) {
        synchronized (f4843m) {
            Entry ceilingEntry = f4843m.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                f4843m.remove(ceilingEntry.getKey());
                C1646i iVar = (C1646i) ceilingEntry.getValue();
                iVar.f4844e = str;
                iVar.f4851l = i;
                return iVar;
            }
            C1646i iVar2 = new C1646i(i);
            iVar2.f4844e = str;
            iVar2.f4851l = i;
            return iVar2;
        }
    }

    /* renamed from: a */
    public String mo6426a() {
        return this.f4844e;
    }

    /* renamed from: a */
    public void mo6427a(C1674d dVar) {
        for (int i = 1; i <= this.f4851l; i++) {
            int i2 = this.f4849j[i];
            if (i2 == 1) {
                dVar.bindNull(i);
            } else if (i2 == 2) {
                dVar.bindLong(i, this.f4845f[i]);
            } else if (i2 == 3) {
                dVar.bindDouble(i, this.f4846g[i]);
            } else if (i2 == 4) {
                dVar.bindString(i, this.f4847h[i]);
            } else if (i2 == 5) {
                dVar.bindBlob(i, this.f4848i[i]);
            }
        }
    }

    public void bindBlob(int i, byte[] bArr) {
        this.f4849j[i] = 5;
        this.f4848i[i] = bArr;
    }

    public void bindDouble(int i, double d) {
        this.f4849j[i] = 3;
        this.f4846g[i] = d;
    }

    public void bindLong(int i, long j) {
        this.f4849j[i] = 2;
        this.f4845f[i] = j;
    }

    public void bindNull(int i) {
        this.f4849j[i] = 1;
    }

    public void bindString(int i, String str) {
        this.f4849j[i] = 4;
        this.f4847h[i] = str;
    }

    public void close() {
    }

    /* renamed from: f */
    public void mo6434f() {
        synchronized (f4843m) {
            f4843m.put(Integer.valueOf(this.f4850k), this);
            if (f4843m.size() > 15) {
                int size = f4843m.size() - 10;
                Iterator it = f4843m.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }
}
