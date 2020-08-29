package p124p.p144f.p145a;

/* renamed from: p.f.a.f */
public class C1269f<T> {

    /* renamed from: a */
    public final Object[] f3630a;

    /* renamed from: b */
    public int f3631b;

    public C1269f(int i) {
        if (i > 0) {
            this.f3630a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public T mo5662a() {
        int i = this.f3631b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f3630a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f3631b = i - 1;
        return t;
    }

    /* renamed from: a */
    public boolean mo5663a(T t) {
        int i = this.f3631b;
        Object[] objArr = this.f3630a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f3631b = i + 1;
        return true;
    }
}
