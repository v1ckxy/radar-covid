package p213q.p217b.p218a.p271c.p295x;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C0105d0;
import androidx.recyclerview.widget.RecyclerView.C0108g;
import java.util.Calendar;
import java.util.Locale;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.C3356h;
import p213q.p217b.p218a.p271c.C3369j;

/* renamed from: q.b.a.c.x.v */
public class C3493v extends C0108g<C3494a> {

    /* renamed from: d */
    public final C3468f<?> f8894d;

    /* renamed from: q.b.a.c.x.v$a */
    public static class C3494a extends C0105d0 {

        /* renamed from: u */
        public final TextView f8895u;

        public C3494a(TextView textView) {
            super(textView);
            this.f8895u = textView;
        }
    }

    public C3493v(C3468f<?> fVar) {
        this.f8894d = fVar;
    }

    /* renamed from: a */
    public void mo1175a(C0105d0 d0Var, int i) {
        C3494a aVar = (C3494a) d0Var;
        int i2 = this.f8894d.f8844e0.f8814e.f8875h + i;
        String string = aVar.f8895u.getContext().getString(C3369j.mtrl_picker_navigate_to_year_description);
        aVar.f8895u.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i2)}));
        aVar.f8895u.setContentDescription(String.format(string, new Object[]{Integer.valueOf(i2)}));
        C3465c cVar = this.f8894d.f8847h0;
        Calendar b = C2286e.m5288b();
        C3464b bVar = b.get(1) == i2 ? cVar.f8831f : cVar.f8829d;
        for (Long longValue : this.f8894d.f8843d0.mo9415m()) {
            b.setTimeInMillis(longValue.longValue());
            if (b.get(1) == i2) {
                bVar = cVar.f8830e;
            }
        }
        bVar.mo9412a(aVar.f8895u);
        aVar.f8895u.setOnClickListener(new C3492u(this, i2));
    }

    /* renamed from: b */
    public int mo1178b() {
        return this.f8894d.f8844e0.f8818i;
    }

    /* renamed from: b */
    public int mo9452b(int i) {
        return i - this.f8894d.f8844e0.f8814e.f8875h;
    }

    /* renamed from: a */
    public C0105d0 mo1174a(ViewGroup viewGroup, int i) {
        return new C3494a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C3356h.mtrl_calendar_year, viewGroup, false));
    }
}
