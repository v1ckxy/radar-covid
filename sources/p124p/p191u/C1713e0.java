package p124p.p191u;

import android.view.View;
import android.view.WindowId;

/* renamed from: p.u.e0 */
public class C1713e0 implements C1715f0 {

    /* renamed from: a */
    public final WindowId f5012a;

    public C1713e0(View view) {
        this.f5012a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1713e0) && ((C1713e0) obj).f5012a.equals(this.f5012a);
    }

    public int hashCode() {
        return this.f5012a.hashCode();
    }
}
