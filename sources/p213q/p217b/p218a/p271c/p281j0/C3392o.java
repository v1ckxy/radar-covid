package p213q.p217b.p218a.p271c.p281j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import p124p.p150h.p162l.C1404o;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.C3318d;
import p213q.p217b.p218a.p271c.p283m.C3407a;

/* renamed from: q.b.a.c.j0.o */
public final class C3392o {

    /* renamed from: a */
    public final Context f8519a;

    /* renamed from: b */
    public final TextInputLayout f8520b;

    /* renamed from: c */
    public LinearLayout f8521c;

    /* renamed from: d */
    public int f8522d;

    /* renamed from: e */
    public FrameLayout f8523e;

    /* renamed from: f */
    public int f8524f;

    /* renamed from: g */
    public Animator f8525g;

    /* renamed from: h */
    public final float f8526h;

    /* renamed from: i */
    public int f8527i;

    /* renamed from: j */
    public int f8528j;

    /* renamed from: k */
    public CharSequence f8529k;

    /* renamed from: l */
    public boolean f8530l;

    /* renamed from: m */
    public TextView f8531m;

    /* renamed from: n */
    public int f8532n;

    /* renamed from: o */
    public ColorStateList f8533o;

    /* renamed from: p */
    public CharSequence f8534p;

    /* renamed from: q */
    public boolean f8535q;

    /* renamed from: r */
    public TextView f8536r;

    /* renamed from: s */
    public int f8537s;

    /* renamed from: t */
    public ColorStateList f8538t;

    /* renamed from: u */
    public Typeface f8539u;

    /* renamed from: q.b.a.c.j0.o$a */
    public class C3393a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f8540a;

        /* renamed from: b */
        public final /* synthetic */ TextView f8541b;

        /* renamed from: c */
        public final /* synthetic */ int f8542c;

        /* renamed from: d */
        public final /* synthetic */ TextView f8543d;

        public C3393a(int i, TextView textView, int i2, TextView textView2) {
            this.f8540a = i;
            this.f8541b = textView;
            this.f8542c = i2;
            this.f8543d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            C3392o oVar = C3392o.this;
            oVar.f8527i = this.f8540a;
            oVar.f8525g = null;
            TextView textView = this.f8541b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f8542c == 1) {
                    TextView textView2 = C3392o.this.f8531m;
                    if (textView2 != null) {
                        textView2.setText(null);
                    }
                }
                TextView textView3 = this.f8543d;
                if (textView3 != null) {
                    textView3.setTranslationY(0.0f);
                    this.f8543d.setAlpha(1.0f);
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f8543d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C3392o(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f8519a = context;
        this.f8520b = textInputLayout;
        this.f8526h = (float) context.getResources().getDimensionPixelSize(C3318d.design_textinput_caption_translate_y);
    }

    /* renamed from: a */
    public final TextView mo9161a(int i) {
        if (i == 1) {
            return this.f8531m;
        }
        if (i != 2) {
            return null;
        }
        return this.f8536r;
    }

    /* renamed from: a */
    public void mo9162a() {
        if ((this.f8521c == null || this.f8520b.getEditText() == null) ? false : true) {
            this.f8521c.setPaddingRelative(C1404o.m3555p(this.f8520b.getEditText()), 0, this.f8520b.getEditText().getPaddingEnd(), 0);
        }
    }

    /* renamed from: a */
    public void mo9164a(TextView textView, int i) {
        if (this.f8521c == null && this.f8523e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f8519a);
            this.f8521c = linearLayout;
            linearLayout.setOrientation(0);
            this.f8520b.addView(this.f8521c, -1, -2);
            FrameLayout frameLayout = new FrameLayout(this.f8519a);
            this.f8523e = frameLayout;
            this.f8521c.addView(frameLayout, -1, new LayoutParams(-2, -2));
            this.f8521c.addView(new Space(this.f8519a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f8520b.getEditText() != null) {
                mo9162a();
            }
        }
        if (i == 0 || i == 1) {
            this.f8523e.setVisibility(0);
            this.f8523e.addView(textView);
            this.f8524f++;
        } else {
            this.f8521c.addView(textView, i);
        }
        this.f8521c.setVisibility(0);
        this.f8522d++;
    }

    /* renamed from: a */
    public final boolean mo9166a(TextView textView, CharSequence charSequence) {
        return C1404o.m3563x(this.f8520b) && this.f8520b.isEnabled() && (this.f8528j != this.f8527i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: b */
    public void mo9167b() {
        Animator animator = this.f8525g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9168b(android.widget.TextView r4, int r5) {
        /*
            r3 = this;
            android.widget.LinearLayout r0 = r3.f8521c
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            if (r5 == 0) goto L_0x000d
            if (r5 != r0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r5 = 0
            goto L_0x000e
        L_0x000d:
            r5 = r0
        L_0x000e:
            r1 = 8
            if (r5 == 0) goto L_0x0026
            android.widget.FrameLayout r5 = r3.f8523e
            if (r5 == 0) goto L_0x0026
            int r2 = r3.f8524f
            int r2 = r2 - r0
            r3.f8524f = r2
            if (r2 != 0) goto L_0x0020
            r5.setVisibility(r1)
        L_0x0020:
            android.widget.FrameLayout r5 = r3.f8523e
            r5.removeView(r4)
            goto L_0x002b
        L_0x0026:
            android.widget.LinearLayout r5 = r3.f8521c
            r5.removeView(r4)
        L_0x002b:
            int r4 = r3.f8522d
            int r4 = r4 - r0
            r3.f8522d = r4
            android.widget.LinearLayout r5 = r3.f8521c
            if (r4 != 0) goto L_0x0037
            r5.setVisibility(r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p271c.p281j0.C3392o.mo9168b(android.widget.TextView, int):void");
    }

    /* renamed from: c */
    public boolean mo9169c() {
        return this.f8528j == 1 && this.f8531m != null && !TextUtils.isEmpty(this.f8529k);
    }

    /* renamed from: d */
    public int mo9170d() {
        TextView textView = this.f8531m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: e */
    public void mo9171e() {
        this.f8529k = null;
        mo9167b();
        if (this.f8527i == 1) {
            this.f8528j = (!this.f8535q || TextUtils.isEmpty(this.f8534p)) ? 0 : 2;
        }
        mo9163a(this.f8527i, this.f8528j, mo9166a(this.f8531m, (CharSequence) null));
    }

    /* renamed from: a */
    public final void mo9165a(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{i3 == i ? 1.0f : 0.0f});
                ofFloat.setDuration(167);
                ofFloat.setInterpolator(C3407a.f8572a);
                list.add(ofFloat);
                if (i3 == i) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f8526h, 0.0f});
                    ofFloat2.setDuration(217);
                    ofFloat2.setInterpolator(C3407a.f8575d);
                    list.add(ofFloat2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo9163a(int i, int i2, boolean z) {
        int i3 = i;
        int i4 = i2;
        boolean z2 = z;
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f8525g = animatorSet;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = arrayList;
            int i5 = i;
            int i6 = i2;
            mo9165a(arrayList2, this.f8535q, this.f8536r, 2, i5, i6);
            mo9165a(arrayList2, this.f8530l, this.f8531m, 1, i5, i6);
            C2286e.m5227a(animatorSet, (List<Animator>) arrayList);
            C3393a aVar = new C3393a(i2, mo9161a(i), i, mo9161a(i4));
            animatorSet.addListener(aVar);
            animatorSet.start();
        } else if (i3 != i4) {
            if (i4 != 0) {
                TextView a = mo9161a(i4);
                if (a != null) {
                    a.setVisibility(0);
                    a.setAlpha(1.0f);
                }
            }
            if (i3 != 0) {
                TextView a2 = mo9161a(i);
                if (a2 != null) {
                    a2.setVisibility(4);
                    if (i3 == 1) {
                        a2.setText(null);
                    }
                }
            }
            this.f8527i = i4;
        }
        this.f8520b.mo2235l();
        this.f8520b.mo2185a(z2, false);
        this.f8520b.mo2238o();
    }
}
