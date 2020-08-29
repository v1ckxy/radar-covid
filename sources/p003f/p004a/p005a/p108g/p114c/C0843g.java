package p003f.p004a.p005a.p108g.p114c;

import android.animation.Animator;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewAnimationUtils;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import es.gob.radarcovid.R;
import p003f.p004a.p005a.C0699d;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.g.c.g */
public final class C0843g extends Dialog {

    /* renamed from: e */
    public final long f2414e;

    /* renamed from: f */
    public final long f2415f;

    /* renamed from: g */
    public boolean f2416g;

    /* renamed from: f.a.a.g.c.g$a */
    public static final class C0844a implements AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ C0843g f2417a;

        public C0844a(C0843g gVar) {
            this.f2417a = gVar;
        }

        public void onAnimationEnd(Animation animation) {
            C0843g.super.hide();
            this.f2417a.f2416g = false;
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    public C0843g(Context context) {
        if (context != null) {
            super(context, R.style.FloatingDialog);
            setCancelable(false);
            setOnCancelListener(null);
            Window window = getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(17170445);
            }
            this.f2414e = 200;
            this.f2415f = 200;
            return;
        }
        C4638h.m10271a("context");
        throw null;
    }

    /* renamed from: a */
    public final void mo3918a(String str, String str2, String str3) {
        if (str3 != null) {
            if (str != null) {
                TextView textView = (TextView) findViewById(C0699d.textViewDialogTitle);
                String str4 = "textViewDialogTitle";
                C4638h.m10270a((Object) textView, str4);
                textView.setVisibility(0);
                TextView textView2 = (TextView) findViewById(C0699d.textViewDialogTitle);
                C4638h.m10270a((Object) textView2, str4);
                textView2.setText(str);
            }
            if (str2 != null) {
                TextView textView3 = (TextView) findViewById(C0699d.textViewDialogDescription);
                String str5 = "textViewDialogDescription";
                C4638h.m10270a((Object) textView3, str5);
                textView3.setVisibility(0);
                TextView textView4 = (TextView) findViewById(C0699d.textViewDialogDescription);
                C4638h.m10270a((Object) textView4, str5);
                textView4.setText(str2);
            }
            Button button = (Button) findViewById(C0699d.buttonOk);
            C4638h.m10270a((Object) button, "buttonOk");
            button.setText(str3);
            LinearLayout linearLayout = (LinearLayout) findViewById(C0699d.wrapperErrorMessage);
            String str6 = "wrapperErrorMessage";
            C4638h.m10270a((Object) linearLayout, str6);
            int width = linearLayout.getWidth() / 2;
            LinearLayout linearLayout2 = (LinearLayout) findViewById(C0699d.wrapperErrorMessage);
            C4638h.m10270a((Object) linearLayout2, str6);
            int height = linearLayout2.getHeight() / 2;
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((LinearLayout) findViewById(C0699d.wrapperErrorMessage), width, height, 0.0f, (float) Math.hypot((double) width, (double) height));
            LinearLayout linearLayout3 = (LinearLayout) findViewById(C0699d.wrapperErrorMessage);
            C4638h.m10270a((Object) linearLayout3, str6);
            linearLayout3.setVisibility(0);
            createCircularReveal.start();
            return;
        }
        C4638h.m10271a("button");
        throw null;
    }

    public void hide() {
        if (!this.f2416g) {
            this.f2416g = true;
            FrameLayout frameLayout = (FrameLayout) findViewById(C0699d.viewBackground);
            FrameLayout frameLayout2 = (FrameLayout) findViewById(C0699d.viewBackground);
            C4638h.m10270a((Object) frameLayout2, "viewBackground");
            AlphaAnimation alphaAnimation = new AlphaAnimation(frameLayout2.getAlpha(), 0.0f);
            alphaAnimation.setDuration(this.f2415f);
            alphaAnimation.setAnimationListener(new C0844a(this));
            frameLayout.startAnimation(alphaAnimation);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_loading);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        ((Button) findViewById(C0699d.buttonOk)).setOnClickListener(new C0382d(0, this));
        ((Button) findViewById(C0699d.buttonClose)).setOnClickListener(new C0382d(1, this));
        FrameLayout frameLayout = (FrameLayout) findViewById(C0699d.viewBackground);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(C0699d.viewBackground);
        C4638h.m10270a((Object) frameLayout2, "viewBackground");
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, frameLayout2.getAlpha());
        alphaAnimation.setDuration(this.f2414e);
        frameLayout.startAnimation(alphaAnimation);
    }
}
