package p425x.p426a.p427a;

/* renamed from: x.a.a.a2 */
public class C4920a2 {

    /* renamed from: a */
    public String f11718a;

    /* renamed from: b */
    public int f11719b = 0;

    public C4920a2(String str) {
        this.f11718a = str;
    }

    /* renamed from: a */
    public String mo11557a() {
        int i = this.f11719b;
        if (i == -1) {
            return null;
        }
        int indexOf = this.f11718a.indexOf(46, i);
        if (indexOf == -1) {
            String substring = this.f11718a.substring(this.f11719b);
            this.f11719b = -1;
            return substring;
        }
        String substring2 = this.f11718a.substring(this.f11719b, indexOf);
        this.f11719b = indexOf + 1;
        return substring2;
    }
}
