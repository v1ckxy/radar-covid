package p124p.p126b.p136q;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: p.b.q.m0 */
public class C1195m0 {

    /* renamed from: a */
    public int f3359a = 0;

    /* renamed from: b */
    public int f3360b = 0;

    /* renamed from: c */
    public int f3361c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: d */
    public int f3362d = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: e */
    public int f3363e = 0;

    /* renamed from: f */
    public int f3364f = 0;

    /* renamed from: g */
    public boolean f3365g = false;

    /* renamed from: h */
    public boolean f3366h = false;

    /* renamed from: a */
    public void mo5246a(int i, int i2) {
        this.f3361c = i;
        this.f3362d = i2;
        this.f3366h = true;
        if (this.f3365g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f3359a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f3360b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f3359a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3360b = i2;
        }
    }
}
