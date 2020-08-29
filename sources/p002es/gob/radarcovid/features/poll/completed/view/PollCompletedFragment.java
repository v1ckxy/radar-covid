package p002es.gob.radarcovid.features.poll.completed.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import es.gob.radarcovid.R;
import java.util.HashMap;
import p003f.p004a.p005a.C0699d;
import p003f.p004a.p005a.p006a.p011e.C0500a;
import p003f.p004a.p005a.p012b.p087k.p088a.p091c.C0656a;
import p003f.p004a.p005a.p012b.p087k.p088a.p091c.C0657b;
import p003f.p004a.p005a.p108g.p109a.C0706e;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.features.poll.completed.view.PollCompletedFragment */
public final class PollCompletedFragment extends C0706e implements C0657b {

    /* renamed from: e0 */
    public C0656a f1760e0;

    /* renamed from: f0 */
    public HashMap f1761f0;

    /* renamed from: a */
    public View mo787a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            return layoutInflater.inflate(R.layout.activity_poll_completed, viewGroup, false);
        }
        C4638h.m10271a("inflater");
        throw null;
    }

    /* renamed from: d */
    public View mo3192d(int i) {
        if (this.f1761f0 == null) {
            this.f1761f0 = new HashMap();
        }
        View view = (View) this.f1761f0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = this.f594K;
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f1761f0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: f */
    public void mo3193f() {
        Intent intent = new Intent("android.intent.action.DIAL");
        StringBuilder a = C1965a.m4756a("tel:");
        C0500a s0 = mo3883s0();
        a.append(s0.mo3714a("CONTACT_PHONE", s0.f1897b.getText(R.string.contact_support_phone)));
        intent.setData(Uri.parse(a.toString()));
        mo791a(intent);
    }

    /* renamed from: i0 */
    public /* synthetic */ void mo815i0() {
        super.mo815i0();
        HashMap hashMap = this.f1761f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: r */
    public void mo3194r() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("plain/text");
        C0500a s0 = mo3883s0();
        Spanned[] spannedArr = {s0.mo3714a("CONTACT_EMAIL", s0.f1897b.getText(R.string.contact_email))};
        intent.putExtra("android.intent.extra.EMAIL", spannedArr.toString());
        mo791a(Intent.createChooser(intent, "Send mail..."));
    }

    /* renamed from: r0 */
    public void mo3158r0() {
        HashMap hashMap = this.f1761f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    public void mo795a(View view, Bundle bundle) {
        if (view != null) {
            ((TextView) mo3192d(C0699d.textViewEmail)).setOnClickListener(new C0888m(0, this));
            mo3192d(C0699d.buttonContactSupport).setOnClickListener(new C0888m(1, this));
            C0656a aVar = this.f1760e0;
            if (aVar != null) {
                aVar.mo3838a();
            } else {
                C4638h.m10273b("presenter");
                throw null;
            }
        } else {
            C4638h.m10271a("view");
            throw null;
        }
    }
}
