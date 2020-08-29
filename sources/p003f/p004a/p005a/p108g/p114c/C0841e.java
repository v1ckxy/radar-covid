package p003f.p004a.p005a.p108g.p114c;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import es.gob.radarcovid.R;
import p002es.gob.radarcovid.common.view.DropdownView;
import p003f.p004a.p005a.C0699d;
import p124p.p150h.p152e.C1325a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.g.c.e */
public final class C0841e implements OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ DropdownView f2406e;

    /* renamed from: f */
    public final /* synthetic */ Context f2407f;

    public C0841e(DropdownView dropdownView, Context context) {
        this.f2406e = dropdownView;
        this.f2407f = context;
    }

    public final void onClick(View view) {
        TextView textView = (TextView) this.f2406e.mo3130a(C0699d.textViewDropdownContent);
        String str = "textViewDropdownContent";
        C4638h.m10270a((Object) textView, str);
        if (textView.getVisibility() == 0) {
            ((TextView) this.f2406e.mo3130a(C0699d.textViewDropdownTitle)).setTextColor(C1325a.m3373a(this.f2407f, (int) R.color.purple_9C));
            ((ImageView) this.f2406e.mo3130a(C0699d.imageViewDropdown)).setImageResource(R.drawable.ic_dropdown_closed);
            TextView textView2 = (TextView) this.f2406e.mo3130a(C0699d.textViewDropdownContent);
            C4638h.m10270a((Object) textView2, str);
            textView2.setVisibility(8);
            return;
        }
        ((TextView) this.f2406e.mo3130a(C0699d.textViewDropdownTitle)).setTextColor(C1325a.m3373a(this.f2407f, (int) R.color.black));
        ((ImageView) this.f2406e.mo3130a(C0699d.imageViewDropdown)).setImageResource(R.drawable.ic_dropdown_opened);
        TextView textView3 = (TextView) this.f2406e.mo3130a(C0699d.textViewDropdownContent);
        C4638h.m10270a((Object) textView3, str);
        textView3.setVisibility(0);
    }
}
