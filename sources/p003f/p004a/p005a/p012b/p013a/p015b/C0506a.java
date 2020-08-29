package p003f.p004a.p005a.p012b.p013a.p015b;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import es.gob.radarcovid.R;
import java.util.HashMap;
import p002es.gob.radarcovid.common.view.LabelButton;
import p002es.gob.radarcovid.common.view.LabelTextView;
import p003f.p004a.p005a.C0699d;
import p003f.p004a.p005a.p006a.p011e.C0500a;
import p003f.p004a.p005a.p012b.p013a.p017d.C0515a;
import p003f.p004a.p005a.p012b.p013a.p017d.C0517c;
import p003f.p004a.p005a.p108g.p109a.C0706e;
import p003f.p004a.p005a.p108g.p114c.C0837d;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.p127k.C1034d;
import p124p.p126b.p127k.C1061o;
import p124p.p150h.p152e.C1325a;
import p124p.p170k.p171a.C1482e;
import p124p.p170k.p171a.C1487i;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4557i;
import p392u.C4560l;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;

/* renamed from: f.a.a.b.a.b.a */
public final class C0506a extends C0706e implements C0517c {

    /* renamed from: e0 */
    public C0515a f1914e0;

    /* renamed from: f0 */
    public HashMap f1915f0;

    /* renamed from: f.a.a.b.a.b.a$a */
    /* compiled from: com.android.tools.r8.jetbrains.kotlin-style lambda group */
    public static final class C0507a extends C4639i implements C4618l<C1034d, C4560l> {

        /* renamed from: g */
        public static final C0507a f1916g = new C0507a(0);

        /* renamed from: h */
        public static final C0507a f1917h = new C0507a(1);

        /* renamed from: f */
        public final /* synthetic */ int f1918f;

        public C0507a(int i) {
            this.f1918f = i;
            super(1);
        }

        /* renamed from: b */
        public final Object mo3153b(Object obj) {
            int i = this.f1918f;
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

    /* renamed from: E */
    public boolean mo3727E() {
        Context U = mo781U();
        if (U != null) {
            Object systemService = U.getSystemService("power");
            if (systemService != null) {
                PowerManager powerManager = (PowerManager) systemService;
                Context U2 = mo781U();
                if (U2 != null) {
                    C4638h.m10270a((Object) U2, "context!!");
                    return powerManager.isIgnoringBatteryOptimizations(U2.getPackageName());
                }
                C4638h.m10269a();
                throw null;
            }
            throw new C4557i("null cannot be cast to non-null type android.os.PowerManager");
        }
        C4638h.m10269a();
        throw null;
    }

    /* renamed from: F */
    public void mo3728F() {
        ConstraintLayout constraintLayout = (ConstraintLayout) mo3734d(C0699d.wrapperExposureNotificationsDisabledWarning);
        C4638h.m10270a((Object) constraintLayout, "wrapperExposureNotificationsDisabledWarning");
        constraintLayout.setVisibility(8);
        LabelTextView labelTextView = (LabelTextView) mo3734d(C0699d.textViewRadarDescription);
        C4638h.m10270a((Object) labelTextView, "textViewRadarDescription");
        labelTextView.setVisibility(0);
    }

    /* renamed from: I */
    public void mo3729I() {
        LabelButton labelButton = (LabelButton) mo3734d(C0699d.buttonCovidReport);
        C4638h.m10270a((Object) labelButton, "buttonCovidReport");
        labelButton.setVisibility(8);
    }

    /* renamed from: L */
    public void mo3730L() {
        ImageView imageView = (ImageView) mo3734d(C0699d.imageViewLogo);
        C4638h.m10270a((Object) imageView, "imageViewLogo");
        imageView.setAlpha(0.0f);
        ImageView imageView2 = (ImageView) mo3734d(C0699d.imageViewInitializationCheck);
        C4638h.m10270a((Object) imageView2, "imageViewInitializationCheck");
        imageView2.setAlpha(1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat((ImageView) mo3734d(C0699d.imageViewLogo), View.ALPHA, new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat((ImageView) mo3734d(C0699d.imageViewInitializationCheck), View.ALPHA, new float[]{1.0f, 0.0f})});
        animatorSet.setDuration(2000);
        animatorSet.setStartDelay(2000);
        animatorSet.start();
    }

    /* renamed from: N */
    public void mo3731N() {
        ConstraintLayout constraintLayout = (ConstraintLayout) mo3734d(C0699d.wrapperExposureNotificationsDisabledWarning);
        C4638h.m10270a((Object) constraintLayout, "wrapperExposureNotificationsDisabledWarning");
        constraintLayout.setVisibility(0);
        LabelTextView labelTextView = (LabelTextView) mo3734d(C0699d.textViewRadarDescription);
        C4638h.m10270a((Object) labelTextView, "textViewRadarDescription");
        labelTextView.setVisibility(8);
    }

    /* renamed from: a */
    public View mo787a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            return layoutInflater.inflate(R.layout.fragment_home, viewGroup, false);
        }
        C4638h.m10271a("inflater");
        throw null;
    }

    /* renamed from: a */
    public void mo788a(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            C0515a aVar = this.f1914e0;
            if (aVar != null) {
                aVar.mo3722d();
            } else {
                C4638h.m10273b("presenter");
                throw null;
            }
        }
    }

    /* renamed from: b */
    public void mo3732b(boolean z) {
        String str = "imageViewLogo";
        if (z) {
            ImageView imageView = (ImageView) mo3734d(C0699d.imageViewLogo);
            C4638h.m10270a((Object) imageView, str);
            if (imageView.getColorFilter() != null) {
                ((ImageView) mo3734d(C0699d.imageViewLogoBackground)).clearColorFilter();
                ((ImageView) mo3734d(C0699d.imageViewLogo)).clearColorFilter();
                return;
            }
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
        ImageView imageView2 = (ImageView) mo3734d(C0699d.imageViewLogo);
        C4638h.m10270a((Object) imageView2, str);
        if (imageView2.getColorFilter() == null) {
            ImageView imageView3 = (ImageView) mo3734d(C0699d.imageViewLogoBackground);
            C4638h.m10270a((Object) imageView3, "imageViewLogoBackground");
            imageView3.setColorFilter(colorMatrixColorFilter);
            ImageView imageView4 = (ImageView) mo3734d(C0699d.imageViewLogo);
            C4638h.m10270a((Object) imageView4, str);
            imageView4.setColorFilter(colorMatrixColorFilter);
        }
    }

    /* renamed from: c */
    public void mo3733c(boolean z) {
        LabelTextView labelTextView;
        int i;
        Context context;
        SwitchCompat switchCompat = (SwitchCompat) mo3734d(C0699d.switchRadar);
        C4638h.m10270a((Object) switchCompat, "switchRadar");
        switchCompat.setChecked(z);
        String str = "textViewRadarDescription";
        String str2 = "textViewRadarTitle";
        if (z) {
            LabelTextView labelTextView2 = (LabelTextView) mo3734d(C0699d.textViewRadarTitle);
            C4638h.m10270a((Object) labelTextView2, str2);
            C0500a s0 = mo3883s0();
            labelTextView2.setText(s0.mo3714a("HOME_RADAR_TITLE_ACTIVE", s0.f1897b.getText(R.string.radar_block_enabled_title)));
            LabelTextView labelTextView3 = (LabelTextView) mo3734d(C0699d.textViewRadarDescription);
            C4638h.m10270a((Object) labelTextView3, str);
            C0500a s02 = mo3883s0();
            labelTextView3.setText(s02.mo3714a("HOME_RADAR_CONTENT_ACTIVE", s02.f1897b.getText(R.string.radar_block_enabled_description)));
            LabelTextView labelTextView4 = (LabelTextView) mo3734d(C0699d.textViewRadarDescription);
            Context U = mo781U();
            if (U != null) {
                labelTextView4.setTextColor(C1325a.m3373a(U, (int) R.color.black));
                labelTextView = (LabelTextView) mo3734d(C0699d.textViewRadarDescription);
                context = mo781U();
                if (context != null) {
                    i = R.font.muli_light;
                } else {
                    C4638h.m10269a();
                    throw null;
                }
            } else {
                C4638h.m10269a();
                throw null;
            }
        } else {
            LabelTextView labelTextView5 = (LabelTextView) mo3734d(C0699d.textViewRadarTitle);
            C4638h.m10270a((Object) labelTextView5, str2);
            C0500a s03 = mo3883s0();
            labelTextView5.setText(s03.mo3714a("HOME_RADAR_TITLE_INACTIVE", s03.f1897b.getText(R.string.radar_block_disabled_title)));
            LabelTextView labelTextView6 = (LabelTextView) mo3734d(C0699d.textViewRadarDescription);
            C4638h.m10270a((Object) labelTextView6, str);
            C0500a s04 = mo3883s0();
            labelTextView6.setText(s04.mo3714a("HOME_RADAR_CONTENT_INACTIVE", s04.f1897b.getText(R.string.radar_block_disabled_description)));
            LabelTextView labelTextView7 = (LabelTextView) mo3734d(C0699d.textViewRadarDescription);
            Context U2 = mo781U();
            if (U2 != null) {
                labelTextView7.setTextColor(C1325a.m3373a(U2, (int) R.color.red));
                labelTextView = (LabelTextView) mo3734d(C0699d.textViewRadarDescription);
                context = mo781U();
                if (context != null) {
                    i = R.font.muli_bold;
                } else {
                    C4638h.m10269a();
                    throw null;
                }
            } else {
                C4638h.m10269a();
                throw null;
            }
        }
        labelTextView.setTypeface(C1061o.m2454a(context, i), 0);
    }

    /* renamed from: d */
    public View mo3734d(int i) {
        if (this.f1915f0 == null) {
            this.f1915f0 = new HashMap();
        }
        View view = (View) this.f1915f0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = this.f594K;
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f1915f0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public void mo3736e() {
        ((ConstraintLayout) mo3734d(C0699d.wrapperExposition)).setBackgroundResource(R.drawable.background_shape_exposition_low);
        LabelTextView labelTextView = (LabelTextView) mo3734d(C0699d.textViewExpositionTitle);
        C4638h.m10270a((Object) labelTextView, "textViewExpositionTitle");
        C0500a s0 = mo3883s0();
        labelTextView.setText(s0.mo3714a("HOME_EXPOSITION_TITLE_LOW", s0.f1897b.getText(R.string.exposition_block_low_title)));
        TextView textView = (TextView) mo3734d(C0699d.textViewExpositionDescription);
        C4638h.m10270a((Object) textView, "textViewExpositionDescription");
        C0500a s02 = mo3883s0();
        textView.setText(s02.mo3714a("HOME_EXPOSITION_MESSAGE_LOW", s02.f1897b.getText(R.string.exposition_block_low_description)));
        LabelTextView labelTextView2 = (LabelTextView) mo3734d(C0699d.textViewExpositionTitle);
        Context U = mo781U();
        if (U != null) {
            labelTextView2.setTextColor(C1325a.m3373a(U, (int) R.color.green));
        } else {
            C4638h.m10269a();
            throw null;
        }
    }

    /* renamed from: h */
    public void mo3737h() {
        ((ConstraintLayout) mo3734d(C0699d.wrapperExposition)).setBackgroundResource(R.drawable.background_shape_exposition_high);
        LabelTextView labelTextView = (LabelTextView) mo3734d(C0699d.textViewExpositionTitle);
        C4638h.m10270a((Object) labelTextView, "textViewExpositionTitle");
        C0500a s0 = mo3883s0();
        labelTextView.setText(s0.mo3714a("HOME_EXPOSITION_TITLE_POSITIVE", s0.f1897b.getText(R.string.exposition_block_infected_title)));
        TextView textView = (TextView) mo3734d(C0699d.textViewExpositionDescription);
        C4638h.m10270a((Object) textView, "textViewExpositionDescription");
        C0500a s02 = mo3883s0();
        textView.setText(s02.mo3714a("HOME_EXPOSITION_MESSAGE_INFECTED", s02.f1897b.getText(R.string.exposition_block_infected_description)));
        LabelTextView labelTextView2 = (LabelTextView) mo3734d(C0699d.textViewExpositionTitle);
        Context U = mo781U();
        if (U != null) {
            labelTextView2.setTextColor(C1325a.m3373a(U, (int) R.color.red));
        } else {
            C4638h.m10269a();
            throw null;
        }
    }

    /* renamed from: i0 */
    public /* synthetic */ void mo815i0() {
        super.mo815i0();
        HashMap hashMap = this.f1915f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: k0 */
    public void mo817k0() {
        this.f592I = true;
        C0515a aVar = this.f1914e0;
        if (aVar != null) {
            aVar.mo3721c();
        } else {
            C4638h.m10273b("presenter");
            throw null;
        }
    }

    /* renamed from: l0 */
    public void mo818l0() {
        this.f592I = true;
        C0515a aVar = this.f1914e0;
        if (aVar != null) {
            aVar.mo3719b();
        } else {
            C4638h.m10273b("presenter");
            throw null;
        }
    }

    /* renamed from: p */
    public void mo3738p() {
        Context U = mo781U();
        if (U != null) {
            PowerManager powerManager = (PowerManager) U.getSystemService("power");
            if (powerManager != null) {
                C1482e Q = mo777Q();
                if (Q != null) {
                    String str = "activity!!";
                    C4638h.m10270a((Object) Q, str);
                    if (!powerManager.isIgnoringBatteryOptimizations(Q.getPackageName())) {
                        Intent intent = new Intent();
                        intent.setAction("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                        StringBuilder a = C1965a.m4756a("package:");
                        C1482e Q2 = mo777Q();
                        if (Q2 != null) {
                            C4638h.m10270a((Object) Q2, str);
                            a.append(Q2.getPackageName());
                            intent.setData(Uri.parse(a.toString()));
                            C1487i iVar = this.f628w;
                            if (iVar != null) {
                                iVar.mo6084a(this, intent, 1, null);
                                return;
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append("Fragment ");
                            sb.append(this);
                            sb.append(" not attached to Activity");
                            throw new IllegalStateException(sb.toString());
                        }
                        C4638h.m10269a();
                        throw null;
                    }
                    return;
                }
                C4638h.m10269a();
                throw null;
            }
            return;
        }
        C4638h.m10269a();
        throw null;
    }

    /* renamed from: q */
    public void mo3739q() {
        LabelButton labelButton = (LabelButton) mo3734d(C0699d.buttonCovidReport);
        C4638h.m10270a((Object) labelButton, "buttonCovidReport");
        labelButton.setVisibility(0);
    }

    /* renamed from: r0 */
    public void mo3158r0() {
        HashMap hashMap = this.f1915f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: t0 */
    public final C0515a mo3740t0() {
        C0515a aVar = this.f1914e0;
        if (aVar != null) {
            return aVar;
        }
        C4638h.m10273b("presenter");
        throw null;
    }

    /* renamed from: w */
    public void mo3741w() {
        Context U = mo781U();
        if (U != null) {
            C4638h.m10270a((Object) U, "context!!");
            C0837d dVar = new C0837d(U);
            C0500a s0 = mo3883s0();
            dVar.mo3896a(s0.mo3714a("ALERT_RADAR_REQUIRED_TO_REPORT", s0.f1897b.getText(R.string.covid_report_warning)).toString());
            C0500a s02 = mo3883s0();
            dVar.mo3900b(s02.mo3714a("ALERT_ACCEPT_BUTTON", s02.f1897b.getText(R.string.accept)).toString(), C0507a.f1916g);
            dVar.mo3898a((C4618l<? super C1034d, C4560l>) C0507a.f1917h);
            dVar.f2398g.show();
            return;
        }
        C4638h.m10269a();
        throw null;
    }

    /* renamed from: a */
    public void mo795a(View view, Bundle bundle) {
        if (view != null) {
            boolean z = false;
            ((SwitchCompat) mo3734d(C0699d.switchRadar)).setOnClickListener(new C0885k(0, this));
            ((SwitchCompat) mo3734d(C0699d.switchRadar)).setOnTouchListener(C0508b.f1919e);
            ((ConstraintLayout) mo3734d(C0699d.wrapperExposition)).setOnClickListener(new C0885k(1, this));
            ((LabelButton) mo3734d(C0699d.buttonCovidReport)).setOnClickListener(new C0885k(2, this));
            ((ConstraintLayout) mo3734d(C0699d.wrapperExposureNotificationsDisabledWarning)).setOnClickListener(new C0885k(3, this));
            C0515a aVar = this.f1914e0;
            if (aVar != null) {
                Bundle bundle2 = this.f615j;
                if (bundle2 != null) {
                    z = bundle2.getBoolean("arg_activate_radar");
                }
                aVar.mo3718a(z);
                return;
            }
            C4638h.m10273b("presenter");
            throw null;
        }
        C4638h.m10271a("view");
        throw null;
    }

    /* renamed from: d */
    public void mo3735d() {
        ((ConstraintLayout) mo3734d(C0699d.wrapperExposition)).setBackgroundResource(R.drawable.background_shape_exposition_high);
        LabelTextView labelTextView = (LabelTextView) mo3734d(C0699d.textViewExpositionTitle);
        C4638h.m10270a((Object) labelTextView, "textViewExpositionTitle");
        C0500a s0 = mo3883s0();
        labelTextView.setText(s0.mo3714a("HOME_EXPOSITION_TITLE_HIGH", s0.f1897b.getText(R.string.exposition_block_high_title)));
        TextView textView = (TextView) mo3734d(C0699d.textViewExpositionDescription);
        C4638h.m10270a((Object) textView, "textViewExpositionDescription");
        String a = mo3883s0().mo3716a("HOME_EXPOSITION_MESSAGE_HIGH", mo3883s0().mo3715a());
        String b = mo798b((int) R.string.exposition_block_high_description);
        C4638h.m10270a((Object) b, "getString(R.string.expos…n_block_high_description)");
        String b2 = C2286e.m5284b(a, b);
        if (b2 == null) {
            b2 = Objects.EMPTY_STRING;
        }
        Spanned a2 = C1061o.m2459a(b2, 0);
        C4638h.m10270a((Object) a2, "HtmlCompat.fromHtml(this…at.FROM_HTML_MODE_LEGACY)");
        textView.setText(a2);
        LabelTextView labelTextView2 = (LabelTextView) mo3734d(C0699d.textViewExpositionTitle);
        Context U = mo781U();
        if (U != null) {
            labelTextView2.setTextColor(C1325a.m3373a(U, (int) R.color.red));
        } else {
            C4638h.m10269a();
            throw null;
        }
    }
}
