package p124p.p195w;

import android.os.Parcel;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p143e.C1248a;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.w.b */
public class C1766b extends C1765a {

    /* renamed from: d */
    public final SparseIntArray f5183d;

    /* renamed from: e */
    public final Parcel f5184e;

    /* renamed from: f */
    public final int f5185f;

    /* renamed from: g */
    public final int f5186g;

    /* renamed from: h */
    public final String f5187h;

    /* renamed from: i */
    public int f5188i;

    /* renamed from: j */
    public int f5189j;

    /* renamed from: k */
    public int f5190k;

    public C1766b(Parcel parcel) {
        Parcel parcel2 = parcel;
        this(parcel2, parcel.dataPosition(), parcel.dataSize(), Objects.EMPTY_STRING, new C1248a(), new C1248a(), new C1248a());
    }

    public C1766b(Parcel parcel, int i, int i2, String str, C1248a<String, Method> aVar, C1248a<String, Method> aVar2, C1248a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f5183d = new SparseIntArray();
        this.f5188i = -1;
        this.f5189j = 0;
        this.f5190k = -1;
        this.f5184e = parcel;
        this.f5185f = i;
        this.f5186g = i2;
        this.f5189j = i;
        this.f5187h = str;
    }

    /* renamed from: a */
    public void mo6745a() {
        int i = this.f5188i;
        if (i >= 0) {
            int i2 = this.f5183d.get(i);
            int dataPosition = this.f5184e.dataPosition();
            int i3 = dataPosition - i2;
            this.f5184e.setDataPosition(i2);
            this.f5184e.writeInt(i3);
            this.f5184e.setDataPosition(dataPosition);
        }
    }

    /* renamed from: a */
    public boolean mo6747a(int i) {
        while (true) {
            boolean z = true;
            if (this.f5189j < this.f5186g) {
                int i2 = this.f5190k;
                if (i2 == i) {
                    return true;
                }
                if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                    return false;
                }
                this.f5184e.setDataPosition(this.f5189j);
                int readInt = this.f5184e.readInt();
                this.f5190k = this.f5184e.readInt();
                this.f5189j += readInt;
            } else {
                if (this.f5190k != i) {
                    z = false;
                }
                return z;
            }
        }
    }

    /* renamed from: b */
    public C1765a mo6750b() {
        Parcel parcel = this.f5184e;
        int dataPosition = parcel.dataPosition();
        int i = this.f5189j;
        if (i == this.f5185f) {
            i = this.f5186g;
        }
        C1766b bVar = new C1766b(parcel, dataPosition, i, C1965a.m4754a(new StringBuilder(), this.f5187h, "  "), this.f5180a, this.f5181b, this.f5182c);
        return bVar;
    }

    /* renamed from: b */
    public void mo6751b(int i) {
        mo6745a();
        this.f5188i = i;
        this.f5183d.put(i, this.f5184e.dataPosition());
        this.f5184e.writeInt(0);
        this.f5184e.writeInt(i);
    }
}
