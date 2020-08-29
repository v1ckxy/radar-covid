package p213q.p217b.p218a.p271c.p281j0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.TextInputLayout.C0249f;
import p124p.p126b.p128l.p129a.C1070a;
import p213q.p217b.p218a.p271c.C3325e;
import p213q.p217b.p218a.p271c.C3369j;
import p213q.p217b.p218a.p271c.p283m.C3407a;

/* renamed from: q.b.a.c.j0.a */
public class C3370a extends C3391n {

    /* renamed from: d */
    public final TextWatcher f8479d = new C3371a();

    /* renamed from: e */
    public final C0249f f8480e = new C3372b();

    /* renamed from: f */
    public AnimatorSet f8481f;

    /* renamed from: g */
    public ValueAnimator f8482g;

    /* renamed from: q.b.a.c.j0.a$a */
    public class C3371a implements TextWatcher {
        public C3371a() {
        }

        public void afterTextChanged(Editable editable) {
            if (!(editable.length() > 0)) {
                C3370a.this.f8481f.cancel();
                C3370a.this.f8482g.start();
            } else if (!C3370a.this.f8516a.mo2196g()) {
                C3370a.this.f8482g.cancel();
                C3370a.this.f8481f.start();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: q.b.a.c.j0.a$b */
    public class C3372b implements C0249f {
        public C3372b() {
        }

        /* renamed from: a */
        public void mo2309a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(editText.getText().length() > 0);
            textInputLayout.setEndIconCheckable(false);
            editText.removeTextChangedListener(C3370a.this.f8479d);
            editText.addTextChangedListener(C3370a.this.f8479d);
        }
    }

    /* renamed from: q.b.a.c.j0.a$c */
    public class C3373c implements OnClickListener {
        public C3373c() {
        }

        public void onClick(View view) {
            C3370a.this.f8516a.getEditText().setText(null);
        }
    }

    public C3370a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: a */
    public void mo9137a() {
        this.f8516a.setEndIconDrawable(C1070a.m2602b(this.f8517b, C3325e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f8516a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C3369j.clear_text_end_icon_content_description));
        this.f8516a.setEndIconOnClickListener(new C3373c());
        this.f8516a.mo2184a(this.f8480e);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(C3407a.f8575d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C3377e(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat2.setInterpolator(C3407a.f8572a);
        ofFloat2.setDuration(100);
        ofFloat2.addUpdateListener(new C3376d(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f8481f = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f8481f.addListener(new C3374b(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat3.setInterpolator(C3407a.f8572a);
        ofFloat3.setDuration(100);
        ofFloat3.addUpdateListener(new C3376d(this));
        this.f8482g = ofFloat3;
        ofFloat3.addListener(new C3375c(this));
    }
}
