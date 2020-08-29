package p002es.gob.radarcovid.features.poll.main.view;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import es.gob.radarcovid.R;
import java.util.HashMap;
import p002es.gob.radarcovid.common.view.StepIndicator;
import p003f.p004a.p005a.C0699d;
import p003f.p004a.p005a.p006a.p011e.C0500a;
import p003f.p004a.p005a.p012b.p087k.p092b.p095c.C0664a;
import p003f.p004a.p005a.p012b.p087k.p092b.p095c.C0666c;
import p003f.p004a.p005a.p012b.p087k.p092b.p097e.C0668a;
import p003f.p004a.p005a.p012b.p087k.p098c.p102d.C0676a;
import p003f.p004a.p005a.p012b.p087k.p098c.p102d.C0676a.C0677a;
import p003f.p004a.p005a.p108g.p109a.C0703b;
import p003f.p004a.p005a.p108g.p114c.C0837d;
import p003f.p004a.p005a.p108g.p114c.p115p.C0857b;
import p124p.p126b.p127k.C1034d;
import p124p.p170k.p171a.C1472a;
import p124p.p170k.p171a.C1490k;
import p392u.C4557i;
import p392u.C4560l;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;

/* renamed from: es.gob.radarcovid.features.poll.main.view.PollActivity */
public final class PollActivity extends C0703b implements C0666c, C0677a {

    /* renamed from: w */
    public C0664a f1762w;

    /* renamed from: x */
    public HashMap f1763x;

    /* renamed from: es.gob.radarcovid.features.poll.main.view.PollActivity$a */
    /* compiled from: com.android.tools.r8.jetbrains.kotlin-style lambda group */
    public static final class C0402a extends C4639i implements C4618l<C1034d, C4560l> {

        /* renamed from: g */
        public static final C0402a f1764g = new C0402a(0);

        /* renamed from: h */
        public static final C0402a f1765h = new C0402a(1);

        /* renamed from: f */
        public final /* synthetic */ int f1766f;

        public C0402a(int i) {
            this.f1766f = i;
            super(1);
        }

        /* renamed from: b */
        public final Object mo3153b(Object obj) {
            int i = this.f1766f;
            String str = "it";
            if (i == 0) {
                C1034d dVar = (C1034d) obj;
                if (dVar != null) {
                    dVar.dismiss();
                    return C4560l.f10773a;
                }
                C4638h.m10271a(str);
                throw null;
            } else if (i == 1) {
                C1034d dVar2 = (C1034d) obj;
                if (dVar2 != null) {
                    dVar2.dismiss();
                    return C4560l.f10773a;
                }
                C4638h.m10271a(str);
                throw null;
            } else {
                throw null;
            }
        }
    }

    /* renamed from: es.gob.radarcovid.features.poll.main.view.PollActivity$b */
    public static final class C0403b extends C4639i implements C4618l<C1034d, C4560l> {

        /* renamed from: f */
        public final /* synthetic */ PollActivity f1767f;

        public C0403b(PollActivity pollActivity) {
            this.f1767f = pollActivity;
            super(1);
        }

        /* renamed from: b */
        public Object mo3153b(Object obj) {
            C1034d dVar = (C1034d) obj;
            if (dVar != null) {
                dVar.dismiss();
                C0664a aVar = this.f1767f.f1762w;
                if (aVar != null) {
                    aVar.mo3844b();
                    return C4560l.f10773a;
                }
                C4638h.m10273b("presenter");
                throw null;
            }
            C4638h.m10271a("it");
            throw null;
        }
    }

    /* renamed from: K */
    public void mo3195K() {
        ConstraintLayout constraintLayout = (ConstraintLayout) mo3199c(C0699d.wrapperContent);
        C4638h.m10270a((Object) constraintLayout, "wrapperContent");
        constraintLayout.setVisibility(0);
    }

    /* renamed from: a */
    public void mo3197a(C0857b bVar) {
        if (bVar != null) {
            mo3874S();
            C0664a aVar = this.f1762w;
            if (aVar != null) {
                aVar.mo3842a(bVar);
            } else {
                C4638h.m10273b("presenter");
                throw null;
            }
        } else {
            C4638h.m10271a("answers");
            throw null;
        }
    }

    /* renamed from: c */
    public View mo3199c(int i) {
        if (this.f1763x == null) {
            this.f1763x = new HashMap();
        }
        View view = (View) this.f1763x.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f1763x.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public C0857b mo3200c() {
        Fragment a = mo6067J().mo6089a("QuestionFragment");
        if (a != null) {
            return ((C0676a) a).mo3855c();
        }
        throw new C4557i("null cannot be cast to non-null type es.gob.radarcovid.features.poll.question.view.QuestionFragment");
    }

    /* renamed from: m */
    public void mo3201m() {
        C0837d dVar = new C0837d(this);
        C0500a R = mo3873R();
        dVar.mo3899b(R.mo3714a("ALERT_POLL_TITLE", R.f1897b.getText(R.string.question_dialog_message)).toString());
        dVar.mo3898a((C4618l<? super C1034d, C4560l>) C0402a.f1764g);
        C0500a R2 = mo3873R();
        dVar.mo3900b(R2.mo3714a("ALERT_POLL_OK_BUTTON", R2.f1897b.getText(R.string.question_dialog_ok)).toString(), new C0403b(this));
        C0500a R3 = mo3873R();
        dVar.mo3897a(R3.mo3714a("ALERT_POLL_CANCEL_BUTTON", R3.f1897b.getText(R.string.question_dialog_cancel)).toString(), C0402a.f1765h);
        dVar.f2398g.show();
    }

    /* renamed from: o */
    public void mo3202o() {
        ConstraintLayout constraintLayout = (ConstraintLayout) mo3199c(C0699d.wrapperContent);
        C4638h.m10270a((Object) constraintLayout, "wrapperContent");
        constraintLayout.setVisibility(8);
    }

    public void onBackPressed() {
        mo3874S();
        C0664a aVar = this.f1762w;
        if (aVar != null) {
            aVar.mo3846c();
        } else {
            C4638h.m10273b("presenter");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_poll);
        ((ImageButton) mo3199c(C0699d.imageButtonBack)).setOnClickListener(new C0668a(this));
        C0664a aVar = this.f1762w;
        if (aVar != null) {
            aVar.mo3841a();
        } else {
            C4638h.m10273b("presenter");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3196a(int i, int i2) {
        StepIndicator stepIndicator = (StepIndicator) mo3199c(C0699d.stepIndicator);
        if (stepIndicator != null) {
            int i3 = 100;
            if (i != i2) {
                i3 = (100 / i2) * i;
            }
            ProgressBar progressBar = (ProgressBar) stepIndicator.mo3141a(C0699d.progressBar);
            C4638h.m10270a((Object) progressBar, "progressBar");
            progressBar.setProgress(i3);
            TextView textView = (TextView) stepIndicator.mo3141a(C0699d.textViewStep);
            C4638h.m10270a((Object) textView, "textViewStep");
            textView.setText(stepIndicator.getContext().getString(R.string.step_indicator_text, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public void mo3198a(boolean z, C0857b bVar) {
        if (bVar != null) {
            C1490k kVar = (C1490k) mo6067J();
            if (kVar != null) {
                C1472a aVar = new C1472a(kVar);
                C0676a aVar2 = new C0676a();
                Bundle bundle = new Bundle();
                bundle.putBoolean("arg_is_last_question", z);
                bundle.putParcelable("arg_question", bVar);
                aVar2.mo807e(bundle);
                aVar.mo6029a(R.id.wrapperQuestion, aVar2, "QuestionFragment", 2);
                aVar.mo6024a();
                return;
            }
            throw null;
        }
        C4638h.m10271a("question");
        throw null;
    }
}
