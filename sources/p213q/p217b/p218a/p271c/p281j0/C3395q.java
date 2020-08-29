package p213q.p217b.p218a.p271c.p281j0;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.TextInputLayout.C0249f;
import com.google.android.material.textfield.TextInputLayout.C0250g;
import p124p.p126b.p128l.p129a.C1070a;
import p213q.p217b.p218a.p271c.C3325e;
import p213q.p217b.p218a.p271c.C3369j;

/* renamed from: q.b.a.c.j0.q */
public class C3395q extends C3391n {

    /* renamed from: d */
    public final TextWatcher f8545d = new C3396a();

    /* renamed from: e */
    public final C0249f f8546e = new C3397b();

    /* renamed from: f */
    public final C0250g f8547f = new C3398c(this);

    /* renamed from: q.b.a.c.j0.q$a */
    public class C3396a implements TextWatcher {
        public C3396a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C3395q qVar = C3395q.this;
            qVar.f8518c.setChecked(!C3395q.m7802a(qVar));
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: q.b.a.c.j0.q$b */
    public class C3397b implements C0249f {
        public C3397b() {
        }

        /* renamed from: a */
        public void mo2309a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            C3395q qVar = C3395q.this;
            qVar.f8518c.setChecked(!C3395q.m7802a(qVar));
            editText.removeTextChangedListener(C3395q.this.f8545d);
            editText.addTextChangedListener(C3395q.this.f8545d);
        }
    }

    /* renamed from: q.b.a.c.j0.q$c */
    public class C3398c implements C0250g {
        public C3398c(C3395q qVar) {
        }

        /* renamed from: a */
        public void mo2310a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    /* renamed from: q.b.a.c.j0.q$d */
    public class C3399d implements OnClickListener {
        public C3399d() {
        }

        public void onClick(View view) {
            EditText editText = C3395q.this.f8516a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                editText.setTransformationMethod(C3395q.m7802a(C3395q.this) ? null : PasswordTransformationMethod.getInstance());
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
            }
        }
    }

    public C3395q(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m7802a(C3395q qVar) {
        EditText editText = qVar.f8516a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: a */
    public void mo9137a() {
        this.f8516a.setEndIconDrawable(C1070a.m2602b(this.f8517b, C3325e.design_password_eye));
        TextInputLayout textInputLayout = this.f8516a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C3369j.password_toggle_content_description));
        this.f8516a.setEndIconOnClickListener(new C3399d());
        this.f8516a.mo2184a(this.f8546e);
        TextInputLayout textInputLayout2 = this.f8516a;
        textInputLayout2.f1380U.add(this.f8547f);
    }
}
