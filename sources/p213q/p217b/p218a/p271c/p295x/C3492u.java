package p213q.p217b.p218a.p271c.p295x;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Calendar;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.p295x.C3468f.C3473e;

/* renamed from: q.b.a.c.x.u */
public class C3492u implements OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ int f8892e;

    /* renamed from: f */
    public final /* synthetic */ C3493v f8893f;

    public C3492u(C3493v vVar, int i) {
        this.f8893f = vVar;
        this.f8892e = i;
    }

    public void onClick(View view) {
        int i = this.f8892e;
        int i2 = this.f8893f.f8894d.f8845f0.f8874g;
        Calendar c = C2286e.m5311c();
        c.set(1, i);
        c.set(2, i2);
        this.f8893f.f8894d.mo9422a(new C3482n(c));
        this.f8893f.f8894d.mo9421a(C3473e.DAY);
    }
}
