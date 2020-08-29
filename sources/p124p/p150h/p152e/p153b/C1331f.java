package p124p.p150h.p152e.p153b;

import java.util.List;

/* renamed from: p.h.e.b.f */
public final class C1331f {

    /* renamed from: a */
    public final int[] f4028a;

    /* renamed from: b */
    public final float[] f4029b;

    public C1331f(int i, int i2) {
        this.f4028a = new int[]{i, i2};
        this.f4029b = new float[]{0.0f, 1.0f};
    }

    public C1331f(int i, int i2, int i3) {
        this.f4028a = new int[]{i, i2, i3};
        this.f4029b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C1331f(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.f4028a = new int[size];
        this.f4029b = new float[size];
        for (int i = 0; i < size; i++) {
            this.f4028a[i] = ((Integer) list.get(i)).intValue();
            this.f4029b[i] = ((Float) list2.get(i)).floatValue();
        }
    }
}
