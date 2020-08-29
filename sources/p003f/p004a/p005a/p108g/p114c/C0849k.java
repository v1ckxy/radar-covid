package p003f.p004a.p005a.p108g.p114c;

import android.content.Context;
import android.text.InputFilter.LengthFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import es.gob.radarcovid.R;
import java.util.HashMap;
import p003f.p004a.p005a.C0699d;
import p003f.p004a.p005a.p006a.p011e.C0500a;
import p003f.p004a.p005a.p108g.p114c.p115p.C0855a;
import p003f.p004a.p005a.p108g.p114c.p115p.C0857b;
import p365r.p366a.C4422e;
import p392u.C4557i;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.g.c.k */
public final class C0849k extends LinearLayout implements C0836c {

    /* renamed from: e */
    public C0500a f2423e;

    /* renamed from: f */
    public C0857b f2424f;

    /* renamed from: g */
    public HashMap f2425g;

    public /* synthetic */ C0849k(Context context, AttributeSet attributeSet, int i, int i2) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if (context != null) {
            super(context, attributeSet, i);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                ((C4422e) applicationContext).mo10710k().mo3887a(this);
                LayoutInflater.from(context).inflate(R.layout.view_question_edit_text, this);
                EditText editText = (EditText) mo3932a(C0699d.editTextQuestion);
                String str = "editTextQuestion";
                C4638h.m10270a((Object) editText, str);
                editText.addTextChangedListener(new C0848j(this));
                EditText editText2 = (EditText) mo3932a(C0699d.editTextQuestion);
                C4638h.m10270a((Object) editText2, str);
                C0500a aVar = this.f2423e;
                if (aVar != null) {
                    editText2.setHint(aVar.mo3714a("POLL_TEXTAREA_PLACEHOLDER", aVar.f1897b.getText(R.string.poll_edit_text_hint)));
                    return;
                }
                C4638h.m10273b("labelManager");
                throw null;
            }
            throw new C4557i("null cannot be cast to non-null type dagger.android.HasAndroidInjector");
        }
        C4638h.m10271a("context");
        throw null;
    }

    /* renamed from: a */
    public View mo3932a(int i) {
        if (this.f2425g == null) {
            this.f2425g = new HashMap();
        }
        View view = (View) this.f2425g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f2425g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C0500a getLabelManager() {
        C0500a aVar = this.f2423e;
        if (aVar != null) {
            return aVar;
        }
        C4638h.m10273b("labelManager");
        throw null;
    }

    public final C0857b getQuestion() {
        return this.f2424f;
    }

    public C0857b getSelectedAnswers() {
        C0857b bVar = this.f2424f;
        if (bVar != null) {
            return bVar;
        }
        C0857b bVar2 = new C0857b(0, null, null, null, 0, 0, 0, 0, 255);
        return bVar2;
    }

    public final void setLabelManager(C0500a aVar) {
        if (aVar != null) {
            this.f2423e = aVar;
        } else {
            C4638h.m10271a("<set-?>");
            throw null;
        }
    }

    public final void setQuestion(C0857b bVar) {
        this.f2424f = bVar;
        if (bVar != null) {
            ((EditText) mo3932a(C0699d.editTextQuestion)).setText(((C0855a) bVar.f2437h.get(0)).f2432f);
            EditText editText = (EditText) mo3932a(C0699d.editTextQuestion);
            C4638h.m10270a((Object) editText, "editTextQuestion");
            editText.setFilters(new LengthFilter[]{new LengthFilter(bVar.f2441l)});
        }
    }
}
