package p213q.p217b.p218a.p271c.p281j0;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.TextInputLayout.C0248e;
import com.google.android.material.textfield.TextInputLayout.C0249f;
import p124p.p126b.p128l.p129a.C1070a;
import p124p.p150h.p162l.C1404o;
import p124p.p150h.p162l.p163y.C1429b;
import p213q.p217b.p218a.p271c.C3318d;
import p213q.p217b.p218a.p271c.C3325e;
import p213q.p217b.p218a.p271c.C3369j;
import p213q.p217b.p218a.p271c.p278g0.C3337g;
import p213q.p217b.p218a.p271c.p278g0.C3337g.C3339b;
import p213q.p217b.p218a.p271c.p278g0.C3342j;
import p213q.p217b.p218a.p271c.p278g0.C3342j.C3344b;
import p213q.p217b.p218a.p271c.p283m.C3407a;

/* renamed from: q.b.a.c.j0.h */
public class C3380h extends C3391n {

    /* renamed from: d */
    public final TextWatcher f8493d = new C3381a();

    /* renamed from: e */
    public final C0248e f8494e = new C3383b(this.f8516a);

    /* renamed from: f */
    public final C0249f f8495f = new C3384c();

    /* renamed from: g */
    public boolean f8496g = false;

    /* renamed from: h */
    public boolean f8497h = false;

    /* renamed from: i */
    public long f8498i = RecyclerView.FOREVER_NS;

    /* renamed from: j */
    public StateListDrawable f8499j;

    /* renamed from: k */
    public C3337g f8500k;

    /* renamed from: l */
    public AccessibilityManager f8501l;

    /* renamed from: m */
    public ValueAnimator f8502m;

    /* renamed from: n */
    public ValueAnimator f8503n;

    /* renamed from: q.b.a.c.j0.h$a */
    public class C3381a implements TextWatcher {

        /* renamed from: q.b.a.c.j0.h$a$a */
        public class C3382a implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ AutoCompleteTextView f8505e;

            public C3382a(AutoCompleteTextView autoCompleteTextView) {
                this.f8505e = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f8505e.isPopupShowing();
                C3380h.m7778a(C3380h.this, isPopupShowing);
                C3380h.this.f8496g = isPopupShowing;
            }
        }

        public C3381a() {
        }

        public void afterTextChanged(Editable editable) {
            C3380h hVar = C3380h.this;
            AutoCompleteTextView a = C3380h.m7776a(hVar, hVar.f8516a.getEditText());
            a.post(new C3382a(a));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: q.b.a.c.j0.h$b */
    public class C3383b extends C0248e {
        public C3383b(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        /* renamed from: a */
        public void mo768a(View view, C1429b bVar) {
            boolean z;
            super.mo768a(view, bVar);
            bVar.f4203a.setClassName(Spinner.class.getName());
            if (VERSION.SDK_INT >= 26) {
                z = bVar.f4203a.isShowingHintText();
            } else {
                Bundle b = bVar.mo5948b();
                z = b != null && (b.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4;
            }
            if (z) {
                bVar.mo5945a((CharSequence) null);
            }
        }

        /* renamed from: c */
        public void mo5871c(View view, AccessibilityEvent accessibilityEvent) {
            this.f4146a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            C3380h hVar = C3380h.this;
            AutoCompleteTextView a = C3380h.m7776a(hVar, hVar.f8516a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C3380h.this.f8501l.isTouchExplorationEnabled()) {
                C3380h.m7777a(C3380h.this, a);
            }
        }
    }

    /* renamed from: q.b.a.c.j0.h$c */
    public class C3384c implements C0249f {
        public C3384c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x00ff  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2309a(com.google.android.material.textfield.TextInputLayout r13) {
            /*
                r12 = this;
                q.b.a.c.j0.h r0 = p213q.p217b.p218a.p271c.p281j0.C3380h.this
                android.widget.EditText r1 = r13.getEditText()
                android.widget.AutoCompleteTextView r0 = p213q.p217b.p218a.p271c.p281j0.C3380h.m7776a(r0, r1)
                q.b.a.c.j0.h r1 = p213q.p217b.p218a.p271c.p281j0.C3380h.this
                com.google.android.material.textfield.TextInputLayout r2 = r1.f8516a
                int r2 = r2.getBoxBackgroundMode()
                r3 = 2
                r4 = 1
                if (r2 != r3) goto L_0x0019
                q.b.a.c.g0.g r1 = r1.f8500k
                goto L_0x001d
            L_0x0019:
                if (r2 != r4) goto L_0x0020
                android.graphics.drawable.StateListDrawable r1 = r1.f8499j
            L_0x001d:
                r0.setDropDownBackgroundDrawable(r1)
            L_0x0020:
                q.b.a.c.j0.h r1 = p213q.p217b.p218a.p271c.p281j0.C3380h.this
                r2 = 0
                if (r1 == 0) goto L_0x00ff
                android.text.method.KeyListener r5 = r0.getKeyListener()
                r6 = 0
                if (r5 == 0) goto L_0x002e
                goto L_0x00c3
            L_0x002e:
                com.google.android.material.textfield.TextInputLayout r5 = r1.f8516a
                int r5 = r5.getBoxBackgroundMode()
                com.google.android.material.textfield.TextInputLayout r7 = r1.f8516a
                q.b.a.c.g0.g r7 = r7.getBoxBackground()
                int r8 = p213q.p217b.p218a.p271c.C3294b.colorControlHighlight
                int r8 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5156a(r0, r8)
                int[][] r9 = new int[r3][]
                int[] r10 = new int[r4]
                r11 = 16842919(0x10100a7, float:2.3694026E-38)
                r10[r6] = r11
                r9[r6] = r10
                int[] r10 = new int[r6]
                r9[r4] = r10
                r10 = 1036831949(0x3dcccccd, float:0.1)
                if (r5 != r3) goto L_0x00a4
                int r1 = p213q.p217b.p218a.p271c.C3294b.colorSurface
                int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5156a(r0, r1)
                q.b.a.c.g0.g r5 = new q.b.a.c.g0.g
                q.b.a.c.g0.g$b r11 = r7.f8365e
                q.b.a.c.g0.j r11 = r11.f8387a
                r5.<init>(r11)
                int r8 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5145a(r8, r1, r10)
                int[] r10 = new int[r3]
                r10[r6] = r8
                r10[r4] = r6
                android.content.res.ColorStateList r11 = new android.content.res.ColorStateList
                r11.<init>(r9, r10)
                r5.mo9063a(r11)
                r5.setTint(r1)
                int[] r10 = new int[r3]
                r10[r6] = r8
                r10[r4] = r1
                android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
                r1.<init>(r9, r10)
                q.b.a.c.g0.g r8 = new q.b.a.c.g0.g
                q.b.a.c.g0.g$b r9 = r7.f8365e
                q.b.a.c.g0.j r9 = r9.f8387a
                r8.<init>(r9)
                r9 = -1
                r8.setTint(r9)
                android.graphics.drawable.RippleDrawable r9 = new android.graphics.drawable.RippleDrawable
                r9.<init>(r1, r5, r8)
                android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r3]
                r1[r6] = r9
                r1[r4] = r7
                android.graphics.drawable.LayerDrawable r3 = new android.graphics.drawable.LayerDrawable
                r3.<init>(r1)
                p124p.p150h.p162l.C1404o.m3522a(r0, r3)
                goto L_0x00c3
            L_0x00a4:
                if (r5 != r4) goto L_0x00c3
                com.google.android.material.textfield.TextInputLayout r1 = r1.f8516a
                int r1 = r1.getBoxBackgroundColor()
                int r5 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5145a(r8, r1, r10)
                int[] r3 = new int[r3]
                r3[r6] = r5
                r3[r4] = r1
                android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
                r1.<init>(r9, r3)
                android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
                r3.<init>(r1, r7, r7)
                p124p.p150h.p162l.C1404o.m3522a(r0, r3)
            L_0x00c3:
                q.b.a.c.j0.h r1 = p213q.p217b.p218a.p271c.p281j0.C3380h.this
                if (r1 == 0) goto L_0x00fe
                q.b.a.c.j0.i r3 = new q.b.a.c.j0.i
                r3.<init>(r1, r0)
                r0.setOnTouchListener(r3)
                q.b.a.c.j0.j r3 = new q.b.a.c.j0.j
                r3.<init>(r1)
                r0.setOnFocusChangeListener(r3)
                q.b.a.c.j0.k r3 = new q.b.a.c.j0.k
                r3.<init>(r1)
                r0.setOnDismissListener(r3)
                r0.setThreshold(r6)
                q.b.a.c.j0.h r1 = p213q.p217b.p218a.p271c.p281j0.C3380h.this
                android.text.TextWatcher r1 = r1.f8493d
                r0.removeTextChangedListener(r1)
                q.b.a.c.j0.h r1 = p213q.p217b.p218a.p271c.p281j0.C3380h.this
                android.text.TextWatcher r1 = r1.f8493d
                r0.addTextChangedListener(r1)
                r13.setErrorIconDrawable(r2)
                q.b.a.c.j0.h r0 = p213q.p217b.p218a.p271c.p281j0.C3380h.this
                com.google.android.material.textfield.TextInputLayout$e r0 = r0.f8494e
                r13.setTextInputAccessibilityDelegate(r0)
                r13.setEndIconVisible(r4)
                return
            L_0x00fe:
                throw r2
            L_0x00ff:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p271c.p281j0.C3380h.C3384c.mo2309a(com.google.android.material.textfield.TextInputLayout):void");
        }
    }

    /* renamed from: q.b.a.c.j0.h$d */
    public class C3385d implements OnClickListener {
        public C3385d() {
        }

        public void onClick(View view) {
            C3380h.m7777a(C3380h.this, (AutoCompleteTextView) C3380h.this.f8516a.getEditText());
        }
    }

    public C3380h(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: a */
    public static /* synthetic */ AutoCompleteTextView m7776a(C3380h hVar, EditText editText) {
        if (hVar == null) {
            throw null;
        } else if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        } else {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
    }

    /* renamed from: a */
    public boolean mo9148a(int i) {
        return i != 0;
    }

    /* renamed from: b */
    public boolean mo9149b() {
        return true;
    }

    /* renamed from: c */
    public final boolean mo9150c() {
        long currentTimeMillis = System.currentTimeMillis() - this.f8498i;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* renamed from: a */
    public static /* synthetic */ void m7778a(C3380h hVar, boolean z) {
        if (hVar.f8497h != z) {
            hVar.f8497h = z;
            hVar.f8503n.cancel();
            hVar.f8502m.start();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m7777a(C3380h hVar, AutoCompleteTextView autoCompleteTextView) {
        if (hVar == null) {
            throw null;
        } else if (autoCompleteTextView != null) {
            if (hVar.mo9150c()) {
                hVar.f8496g = false;
            }
            if (!hVar.f8496g) {
                boolean z = hVar.f8497h;
                boolean z2 = !z;
                if (z != z2) {
                    hVar.f8497h = z2;
                    hVar.f8503n.cancel();
                    hVar.f8502m.start();
                }
                if (hVar.f8497h) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            hVar.f8496g = false;
        }
    }

    /* renamed from: a */
    public final C3337g mo9147a(float f, float f2, float f3, int i) {
        C3344b bVar = new C3344b();
        bVar.mo9104c(f);
        bVar.mo9105d(f);
        bVar.mo9101a(f2);
        bVar.mo9103b(f2);
        C3342j a = bVar.mo9102a();
        C3337g a2 = C3337g.m7717a(this.f8517b, f3);
        a2.f8365e.f8387a = a;
        a2.invalidateSelf();
        C3339b bVar2 = a2.f8365e;
        if (bVar2.f8395i == null) {
            bVar2.f8395i = new Rect();
        }
        a2.f8365e.f8395i.set(0, i, 0, i);
        a2.f8384x = a2.f8365e.f8395i;
        a2.invalidateSelf();
        return a2;
    }

    /* renamed from: a */
    public void mo9137a() {
        float dimensionPixelOffset = (float) this.f8517b.getResources().getDimensionPixelOffset(C3318d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f8517b.getResources().getDimensionPixelOffset(C3318d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f8517b.getResources().getDimensionPixelOffset(C3318d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C3337g a = mo9147a(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C3337g a2 = mo9147a(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f8500k = a;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f8499j = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, a);
        this.f8499j.addState(new int[0], a2);
        this.f8516a.setEndIconDrawable(C1070a.m2602b(this.f8517b, C3325e.mtrl_dropdown_arrow));
        TextInputLayout textInputLayout = this.f8516a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C3369j.exposed_dropdown_menu_content_description));
        this.f8516a.setEndIconOnClickListener(new C3385d());
        this.f8516a.mo2184a(this.f8495f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(C3407a.f8572a);
        ofFloat.setDuration((long) 67);
        ofFloat.addUpdateListener(new C3390m(this));
        this.f8503n = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(C3407a.f8572a);
        ofFloat2.setDuration((long) 50);
        ofFloat2.addUpdateListener(new C3390m(this));
        this.f8502m = ofFloat2;
        ofFloat2.addListener(new C3389l(this));
        C1404o.m3545f(this.f8518c, 2);
        this.f8501l = (AccessibilityManager) this.f8517b.getSystemService("accessibility");
    }
}
