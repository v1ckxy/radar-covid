package p003f.p004a.p005a.p108g.p114c;

import android.text.Editable;
import android.text.TextWatcher;
import p003f.p004a.p005a.p108g.p114c.p115p.C0855a;
import p003f.p004a.p005a.p108g.p114c.p115p.C0857b;

/* renamed from: f.a.a.g.c.j */
public final class C0848j implements TextWatcher {

    /* renamed from: e */
    public final /* synthetic */ C0849k f2422e;

    public C0848j(C0849k kVar) {
        this.f2422e = kVar;
    }

    public void afterTextChanged(Editable editable) {
        C0857b question = this.f2422e.getQuestion();
        if (question != null) {
            boolean z = false;
            C0855a aVar = (C0855a) question.f2437h.get(0);
            String valueOf = String.valueOf(editable);
            aVar.f2432f = valueOf;
            if (valueOf.length() > 0) {
                z = true;
            }
            aVar.f2433g = z;
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
