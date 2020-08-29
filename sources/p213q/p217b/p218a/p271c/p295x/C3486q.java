package p213q.p217b.p218a.p271c.p295x;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C0105d0;
import androidx.recyclerview.widget.RecyclerView.C0108g;
import androidx.recyclerview.widget.RecyclerView.C0125p;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import p124p.p150h.p162l.C1404o;
import p213q.p217b.p218a.p271c.C3318d;
import p213q.p217b.p218a.p271c.C3327f;
import p213q.p217b.p218a.p271c.C3356h;
import p213q.p217b.p218a.p271c.p295x.C3468f.C3474f;

/* renamed from: q.b.a.c.x.q */
public class C3486q extends C0108g<C3487a> {

    /* renamed from: d */
    public final C3461a f8885d;

    /* renamed from: e */
    public final C3466d<?> f8886e;

    /* renamed from: f */
    public final C3474f f8887f;

    /* renamed from: g */
    public final int f8888g;

    /* renamed from: q.b.a.c.x.q$a */
    public static class C3487a extends C0105d0 {

        /* renamed from: u */
        public final TextView f8889u;

        /* renamed from: v */
        public final MaterialCalendarGridView f8890v;

        public C3487a(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C3327f.month_title);
            this.f8889u = textView;
            C1404o.m3531a((View) textView, true);
            this.f8890v = (MaterialCalendarGridView) linearLayout.findViewById(C3327f.month_grid);
            if (!z) {
                this.f8889u.setVisibility(8);
            }
        }
    }

    public C3486q(Context context, C3466d<?> dVar, C3461a aVar, C3474f fVar) {
        C3482n nVar = aVar.f8814e;
        C3482n nVar2 = aVar.f8815f;
        C3482n nVar3 = aVar.f8816g;
        if (nVar.compareTo(nVar3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (nVar3.compareTo(nVar2) <= 0) {
            this.f8888g = (C3468f.m7925b(context) * C3484o.f8878i) + (C3481m.m7939b(context) ? context.getResources().getDimensionPixelSize(C3318d.mtrl_calendar_day_height) : 0);
            this.f8885d = aVar;
            this.f8886e = dVar;
            this.f8887f = fVar;
            if (!this.f778a.mo1182a()) {
                this.f779b = true;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* renamed from: a */
    public long mo1173a(int i) {
        return this.f8885d.f8814e.mo9430a(i).f8872e.getTimeInMillis();
    }

    /* renamed from: b */
    public int mo1178b() {
        return this.f8885d.f8819j;
    }

    /* renamed from: b */
    public C3482n mo9449b(int i) {
        return this.f8885d.f8814e.mo9430a(i);
    }

    /* renamed from: a */
    public int mo9448a(C3482n nVar) {
        return this.f8885d.f8814e.mo9431b(nVar);
    }

    /* renamed from: a */
    public void mo1175a(C0105d0 d0Var, int i) {
        C3487a aVar = (C3487a) d0Var;
        C3482n a = this.f8885d.f8814e.mo9430a(i);
        aVar.f8889u.setText(a.f8873f);
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.f8890v.findViewById(C3327f.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !a.equals(materialCalendarGridView.getAdapter().f8879e)) {
            C3484o oVar = new C3484o(a, this.f8886e, this.f8885d);
            materialCalendarGridView.setNumColumns(a.f8876i);
            materialCalendarGridView.setAdapter((ListAdapter) oVar);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new C3485p(this, materialCalendarGridView));
    }

    /* renamed from: a */
    public C0105d0 mo1174a(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C3356h.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C3481m.m7939b(viewGroup.getContext())) {
            return new C3487a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C0125p(-1, this.f8888g));
        return new C3487a(linearLayout, true);
    }
}
