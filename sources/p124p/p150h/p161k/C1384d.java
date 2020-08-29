package p124p.p150h.p161k;

/* renamed from: p.h.k.d */
public class C1384d<T> {

    /* renamed from: a */
    public final Object[] f4142a;

    /* renamed from: b */
    public int f4143b;

    public C1384d(int i) {
        if (i > 0) {
            this.f4142a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public T mo5864a() {
        int i = this.f4143b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f4142a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f4143b = i - 1;
        return t;
    }

    /* renamed from: a */
    public boolean mo5865a(T t) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.f4143b) {
                z = false;
                break;
            } else if (this.f4142a[i] == t) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            int i2 = this.f4143b;
            Object[] objArr = this.f4142a;
            if (i2 >= objArr.length) {
                return false;
            }
            objArr[i2] = t;
            this.f4143b = i2 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}
