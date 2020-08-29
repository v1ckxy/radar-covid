package p213q.p217b.p218a.p271c.p285o;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* renamed from: q.b.a.c.o.b */
public class C3427b {
    /* renamed from: a */
    public static void m7835a(C3424a aVar, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.f8637s = new WeakReference<>(view);
        aVar.f8638t = new WeakReference<>(frameLayout);
        aVar.mo9214e();
        aVar.invalidateSelf();
    }
}
