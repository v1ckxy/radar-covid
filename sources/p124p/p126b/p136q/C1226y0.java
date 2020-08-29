package p124p.p126b.p136q;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import p124p.p126b.C1023f;
import p124p.p126b.C1024g;
import p124p.p126b.C1026i;

/* renamed from: p.b.q.y0 */
public class C1226y0 {

    /* renamed from: a */
    public final Context f3499a;

    /* renamed from: b */
    public final View f3500b;

    /* renamed from: c */
    public final TextView f3501c;

    /* renamed from: d */
    public final LayoutParams f3502d = new LayoutParams();

    /* renamed from: e */
    public final Rect f3503e = new Rect();

    /* renamed from: f */
    public final int[] f3504f = new int[2];

    /* renamed from: g */
    public final int[] f3505g = new int[2];

    public C1226y0(Context context) {
        this.f3499a = context;
        View inflate = LayoutInflater.from(context).inflate(C1024g.abc_tooltip, null);
        this.f3500b = inflate;
        this.f3501c = (TextView) inflate.findViewById(C1023f.message);
        this.f3502d.setTitle(C1226y0.class.getSimpleName());
        this.f3502d.packageName = this.f3499a.getPackageName();
        LayoutParams layoutParams = this.f3502d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C1026i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    public void mo5404a() {
        if (this.f3500b.getParent() != null) {
            ((WindowManager) this.f3499a.getSystemService("window")).removeView(this.f3500b);
        }
    }
}
