package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView.C0023e;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p124p.p126b.C1018a;
import p124p.p126b.C1027j;
import p124p.p126b.p127k.C1028a.C1029a;
import p124p.p126b.p128l.p129a.C1070a;
import p124p.p126b.p134p.C1091b;
import p124p.p126b.p134p.C1096f;
import p124p.p126b.p134p.p135i.C1114g;
import p124p.p126b.p134p.p135i.C1118i;
import p124p.p126b.p134p.p135i.C1129m;
import p124p.p126b.p134p.p135i.C1129m.C1130a;
import p124p.p126b.p134p.p135i.C1138r;
import p124p.p126b.p136q.C1142a0;
import p124p.p126b.p136q.C1143a1;
import p124p.p126b.p136q.C1147c;
import p124p.p126b.p136q.C1184k;
import p124p.p126b.p136q.C1194m;
import p124p.p126b.p136q.C1195m0;
import p124p.p126b.p136q.C1213u0;
import p124p.p126b.p136q.C1218w;
import p124p.p126b.p136q.C1219w0;
import p124p.p150h.p162l.C1404o;
import p124p.p167j.p168a.C1458a;

public class Toolbar extends ViewGroup {

    /* renamed from: A */
    public int f360A;

    /* renamed from: B */
    public CharSequence f361B;

    /* renamed from: C */
    public CharSequence f362C;

    /* renamed from: D */
    public ColorStateList f363D;

    /* renamed from: E */
    public ColorStateList f364E;

    /* renamed from: F */
    public boolean f365F;

    /* renamed from: G */
    public boolean f366G;

    /* renamed from: H */
    public final ArrayList<View> f367H;

    /* renamed from: I */
    public final ArrayList<View> f368I;

    /* renamed from: J */
    public final int[] f369J;

    /* renamed from: K */
    public C0060f f370K;

    /* renamed from: L */
    public final C0023e f371L;

    /* renamed from: M */
    public C1219w0 f372M;

    /* renamed from: N */
    public C1147c f373N;

    /* renamed from: O */
    public C0058d f374O;

    /* renamed from: P */
    public boolean f375P;

    /* renamed from: Q */
    public final Runnable f376Q;

    /* renamed from: e */
    public ActionMenuView f377e;

    /* renamed from: f */
    public TextView f378f;

    /* renamed from: g */
    public TextView f379g;

    /* renamed from: h */
    public ImageButton f380h;

    /* renamed from: i */
    public ImageView f381i;

    /* renamed from: j */
    public Drawable f382j;

    /* renamed from: k */
    public CharSequence f383k;

    /* renamed from: l */
    public ImageButton f384l;

    /* renamed from: m */
    public View f385m;

    /* renamed from: n */
    public Context f386n;

    /* renamed from: o */
    public int f387o;

    /* renamed from: p */
    public int f388p;

    /* renamed from: q */
    public int f389q;

    /* renamed from: r */
    public int f390r;

    /* renamed from: s */
    public int f391s;

    /* renamed from: t */
    public int f392t;

    /* renamed from: u */
    public int f393u;

    /* renamed from: v */
    public int f394v;

    /* renamed from: w */
    public int f395w;

    /* renamed from: x */
    public C1195m0 f396x;

    /* renamed from: y */
    public int f397y;

    /* renamed from: z */
    public int f398z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C0055a implements C0023e {
        public C0055a() {
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    public class C0056b implements Runnable {
        public C0056b() {
        }

        public void run() {
            Toolbar.this.mo457g();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    public class C0057c implements OnClickListener {
        public C0057c() {
        }

        public void onClick(View view) {
            C0058d dVar = Toolbar.this.f374O;
            C1118i iVar = dVar == null ? null : dVar.f403f;
            if (iVar != null) {
                iVar.collapseActionView();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    public class C0058d implements C1129m {

        /* renamed from: e */
        public C1114g f402e;

        /* renamed from: f */
        public C1118i f403f;

        public C0058d() {
        }

        /* renamed from: a */
        public void mo532a(Context context, C1114g gVar) {
            C1114g gVar2 = this.f402e;
            if (gVar2 != null) {
                C1118i iVar = this.f403f;
                if (iVar != null) {
                    gVar2.mo4812a(iVar);
                }
            }
            this.f402e = gVar;
        }

        /* renamed from: a */
        public void mo533a(Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo534a(C1114g gVar, boolean z) {
        }

        /* renamed from: a */
        public void mo535a(C1130a aVar) {
        }

        /* renamed from: a */
        public void mo536a(boolean z) {
            if (this.f403f != null) {
                C1114g gVar = this.f402e;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f402e.getItem(i) == this.f403f) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo537a(this.f402e, this.f403f);
                }
            }
        }

        /* renamed from: a */
        public boolean mo537a(C1114g gVar, C1118i iVar) {
            View view = Toolbar.this.f385m;
            if (view instanceof C1091b) {
                ((C1091b) view).mo307c();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f385m);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f384l);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f385m = null;
            int size = toolbar3.f368I.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar3.addView((View) toolbar3.f368I.get(size));
                } else {
                    toolbar3.f368I.clear();
                    this.f403f = null;
                    Toolbar.this.requestLayout();
                    iVar.f3102C = false;
                    iVar.f3117n.mo4824b(false);
                    return true;
                }
            }
        }

        /* renamed from: a */
        public boolean mo538a(C1138r rVar) {
            return false;
        }

        /* renamed from: b */
        public boolean mo539b() {
            return false;
        }

        /* renamed from: b */
        public boolean mo540b(C1114g gVar, C1118i iVar) {
            Toolbar.this.mo443a();
            ViewParent parent = Toolbar.this.f384l.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f384l);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f384l);
            }
            Toolbar.this.f385m = iVar.getActionView();
            this.f403f = iVar;
            ViewParent parent2 = Toolbar.this.f385m.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f385m);
                }
                C0059e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f2677a = 8388611 | (toolbar4.f390r & 112);
                generateDefaultLayoutParams.f405b = 2;
                toolbar4.f385m.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f385m);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (!(((C0059e) childAt.getLayoutParams()).f405b == 2 || childAt == toolbar6.f377e)) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.f368I.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            iVar.f3102C = true;
            iVar.f3117n.mo4824b(false);
            View view = Toolbar.this.f385m;
            if (view instanceof C1091b) {
                ((C1091b) view).mo301a();
            }
            return true;
        }

        /* renamed from: d */
        public Parcelable mo541d() {
            return null;
        }

        public int getId() {
            return 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0059e extends C1029a {

        /* renamed from: b */
        public int f405b;

        public C0059e(int i, int i2) {
            super(i, i2);
            this.f405b = 0;
            this.f2677a = 8388627;
        }

        public C0059e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f405b = 0;
        }

        public C0059e(LayoutParams layoutParams) {
            super(layoutParams);
            this.f405b = 0;
        }

        public C0059e(MarginLayoutParams marginLayoutParams) {
            super((LayoutParams) marginLayoutParams);
            this.f405b = 0;
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0059e(C0059e eVar) {
            super((C1029a) eVar);
            this.f405b = 0;
            this.f405b = eVar.f405b;
        }

        public C0059e(C1029a aVar) {
            super(aVar);
            this.f405b = 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public interface C0060f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0061g extends C1458a {
        public static final Creator<C0061g> CREATOR = new C0062a();

        /* renamed from: g */
        public int f406g;

        /* renamed from: h */
        public boolean f407h;

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        public static class C0062a implements ClassLoaderCreator<C0061g> {
            public Object createFromParcel(Parcel parcel) {
                return new C0061g(parcel, null);
            }

            public Object[] newArray(int i) {
                return new C0061g[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0061g(parcel, classLoader);
            }
        }

        public C0061g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f406g = parcel.readInt();
            this.f407h = parcel.readInt() != 0;
        }

        public C0061g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f4274e, i);
            parcel.writeInt(this.f406g);
            parcel.writeInt(this.f407h ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1018a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f360A = 8388627;
        this.f367H = new ArrayList<>();
        this.f368I = new ArrayList<>();
        this.f369J = new int[2];
        this.f371L = new C0055a();
        this.f376Q = new C0056b();
        C1213u0 a = C1213u0.m3013a(getContext(), attributeSet, C1027j.Toolbar, i, 0);
        this.f388p = a.mo5327g(C1027j.Toolbar_titleTextAppearance, 0);
        this.f389q = a.mo5327g(C1027j.Toolbar_subtitleTextAppearance, 0);
        this.f360A = a.mo5323e(C1027j.Toolbar_android_gravity, this.f360A);
        this.f390r = a.mo5323e(C1027j.Toolbar_buttonGravity, 48);
        int b = a.mo5317b(C1027j.Toolbar_titleMargin, 0);
        if (a.mo5326f(C1027j.Toolbar_titleMargins)) {
            b = a.mo5317b(C1027j.Toolbar_titleMargins, b);
        }
        this.f395w = b;
        this.f394v = b;
        this.f393u = b;
        this.f392t = b;
        int b2 = a.mo5317b(C1027j.Toolbar_titleMarginStart, -1);
        if (b2 >= 0) {
            this.f392t = b2;
        }
        int b3 = a.mo5317b(C1027j.Toolbar_titleMarginEnd, -1);
        if (b3 >= 0) {
            this.f393u = b3;
        }
        int b4 = a.mo5317b(C1027j.Toolbar_titleMarginTop, -1);
        if (b4 >= 0) {
            this.f394v = b4;
        }
        int b5 = a.mo5317b(C1027j.Toolbar_titleMarginBottom, -1);
        if (b5 >= 0) {
            this.f395w = b5;
        }
        this.f391s = a.mo5319c(C1027j.Toolbar_maxButtonHeight, -1);
        int b6 = a.mo5317b(C1027j.Toolbar_contentInsetStart, RecyclerView.UNDEFINED_DURATION);
        int b7 = a.mo5317b(C1027j.Toolbar_contentInsetEnd, RecyclerView.UNDEFINED_DURATION);
        int c = a.mo5319c(C1027j.Toolbar_contentInsetLeft, 0);
        int c2 = a.mo5319c(C1027j.Toolbar_contentInsetRight, 0);
        mo449b();
        C1195m0 m0Var = this.f396x;
        m0Var.f3366h = false;
        if (c != Integer.MIN_VALUE) {
            m0Var.f3363e = c;
            m0Var.f3359a = c;
        }
        if (c2 != Integer.MIN_VALUE) {
            m0Var.f3364f = c2;
            m0Var.f3360b = c2;
        }
        if (!(b6 == Integer.MIN_VALUE && b7 == Integer.MIN_VALUE)) {
            this.f396x.mo5246a(b6, b7);
        }
        this.f397y = a.mo5317b(C1027j.Toolbar_contentInsetStartWithNavigation, RecyclerView.UNDEFINED_DURATION);
        this.f398z = a.mo5317b(C1027j.Toolbar_contentInsetEndWithActions, RecyclerView.UNDEFINED_DURATION);
        this.f382j = a.mo5318b(C1027j.Toolbar_collapseIcon);
        this.f383k = a.mo5324e(C1027j.Toolbar_collapseContentDescription);
        CharSequence e = a.mo5324e(C1027j.Toolbar_title);
        if (!TextUtils.isEmpty(e)) {
            setTitle(e);
        }
        CharSequence e2 = a.mo5324e(C1027j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(e2)) {
            setSubtitle(e2);
        }
        this.f386n = getContext();
        setPopupTheme(a.mo5327g(C1027j.Toolbar_popupTheme, 0));
        Drawable b8 = a.mo5318b(C1027j.Toolbar_navigationIcon);
        if (b8 != null) {
            setNavigationIcon(b8);
        }
        CharSequence e3 = a.mo5324e(C1027j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(e3)) {
            setNavigationContentDescription(e3);
        }
        Drawable b9 = a.mo5318b(C1027j.Toolbar_logo);
        if (b9 != null) {
            setLogo(b9);
        }
        CharSequence e4 = a.mo5324e(C1027j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(e4)) {
            setLogoDescription(e4);
        }
        if (a.mo5326f(C1027j.Toolbar_titleTextColor)) {
            setTitleTextColor(a.mo5314a(C1027j.Toolbar_titleTextColor));
        }
        if (a.mo5326f(C1027j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a.mo5314a(C1027j.Toolbar_subtitleTextColor));
        }
        if (a.mo5326f(C1027j.Toolbar_menu)) {
            getMenuInflater().inflate(a.mo5327g(C1027j.Toolbar_menu, 0), getMenu());
        }
        a.f3426b.recycle();
    }

    private MenuInflater getMenuInflater() {
        return new C1096f(getContext());
    }

    /* renamed from: a */
    public final int mo441a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    public final int mo442a(View view, int i, int[] iArr, int i2) {
        C0059e eVar = (C0059e) view.getLayoutParams();
        int i3 = eVar.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int a = mo440a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a, max + measuredWidth, view.getMeasuredHeight() + a);
        return measuredWidth + eVar.rightMargin + max;
    }

    /* renamed from: a */
    public void mo443a() {
        if (this.f384l == null) {
            C1184k kVar = new C1184k(getContext(), null, C1018a.toolbarNavigationButtonStyle);
            this.f384l = kVar;
            kVar.setImageDrawable(this.f382j);
            this.f384l.setContentDescription(this.f383k);
            C0059e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f2677a = 8388611 | (this.f390r & 112);
            generateDefaultLayoutParams.f405b = 2;
            this.f384l.setLayoutParams(generateDefaultLayoutParams);
            this.f384l.setOnClickListener(new C0057c());
        }
    }

    /* renamed from: a */
    public final void mo444a(View view, int i, int i2, int i3, int i4, int i5) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    public final void mo445a(View view, boolean z) {
        LayoutParams layoutParams = view.getLayoutParams();
        C0059e eVar = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0059e) layoutParams;
        eVar.f405b = 1;
        if (!z || this.f385m == null) {
            addView(view, eVar);
            return;
        }
        view.setLayoutParams(eVar);
        this.f368I.add(view);
    }

    /* renamed from: a */
    public final void mo446a(List<View> list, int i) {
        boolean z = C1404o.m3551l(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0059e eVar = (C0059e) childAt.getLayoutParams();
                if (eVar.f405b == 0 && mo454d(childAt) && mo438a(eVar.f2677a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0059e eVar2 = (C0059e) childAt2.getLayoutParams();
            if (eVar2.f405b == 0 && mo454d(childAt2) && mo438a(eVar2.f2677a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: b */
    public final int mo447b(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final int mo448b(View view, int i, int[] iArr, int i2) {
        C0059e eVar = (C0059e) view.getLayoutParams();
        int i3 = eVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a = mo440a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a, max, view.getMeasuredHeight() + a);
        return max - (measuredWidth + eVar.leftMargin);
    }

    /* renamed from: b */
    public final void mo449b() {
        if (this.f396x == null) {
            this.f396x = new C1195m0();
        }
    }

    /* renamed from: c */
    public final void mo450c() {
        mo453d();
        ActionMenuView actionMenuView = this.f377e;
        if (actionMenuView.f184t == null) {
            C1114g gVar = (C1114g) actionMenuView.getMenu();
            if (this.f374O == null) {
                this.f374O = new C0058d();
            }
            this.f377e.setExpandedActionViewsExclusive(true);
            gVar.mo4807a((C1129m) this.f374O, this.f386n);
        }
    }

    /* renamed from: c */
    public final boolean mo451c(View view) {
        return view.getParent() == this || this.f368I.contains(view);
    }

    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0059e);
    }

    /* renamed from: d */
    public final void mo453d() {
        if (this.f377e == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f377e = actionMenuView;
            actionMenuView.setPopupTheme(this.f387o);
            this.f377e.setOnMenuItemClickListener(this.f371L);
            ActionMenuView actionMenuView2 = this.f377e;
            actionMenuView2.f189y = null;
            actionMenuView2.f190z = null;
            C0059e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f2677a = 8388613 | (this.f390r & 112);
            this.f377e.setLayoutParams(generateDefaultLayoutParams);
            mo445a((View) this.f377e, false);
        }
    }

    /* renamed from: d */
    public final boolean mo454d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: e */
    public final void mo455e() {
        if (this.f380h == null) {
            this.f380h = new C1184k(getContext(), null, C1018a.toolbarNavigationButtonStyle);
            C0059e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f2677a = 8388611 | (this.f390r & 112);
            this.f380h.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    /* renamed from: f */
    public boolean mo456f() {
        ActionMenuView actionMenuView = this.f377e;
        if (actionMenuView != null) {
            C1147c cVar = actionMenuView.f188x;
            if (cVar != null && cVar.mo5058f()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo457g() {
        ActionMenuView actionMenuView = this.f377e;
        if (actionMenuView != null) {
            C1147c cVar = actionMenuView.f188x;
            if (cVar != null && cVar.mo5059g()) {
                return true;
            }
        }
        return false;
    }

    public C0059e generateDefaultLayoutParams() {
        return new C0059e(-2, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0059e(getContext(), attributeSet);
    }

    public C0059e generateLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0059e ? new C0059e((C0059e) layoutParams) : layoutParams instanceof C1029a ? new C0059e((C1029a) layoutParams) : layoutParams instanceof MarginLayoutParams ? new C0059e((MarginLayoutParams) layoutParams) : new C0059e(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f384l;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f384l;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C1195m0 m0Var = this.f396x;
        if (m0Var != null) {
            return m0Var.f3365g ? m0Var.f3359a : m0Var.f3360b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f398z;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C1195m0 m0Var = this.f396x;
        if (m0Var != null) {
            return m0Var.f3359a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C1195m0 m0Var = this.f396x;
        if (m0Var != null) {
            return m0Var.f3360b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C1195m0 m0Var = this.f396x;
        if (m0Var != null) {
            return m0Var.f3365g ? m0Var.f3360b : m0Var.f3359a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f397y;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f377e
            r1 = 0
            if (r0 == 0) goto L_0x0011
            p.b.p.i.g r0 = r0.f184t
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0023
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f398z
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0027
        L_0x0023:
            int r0 = r3.getContentInsetEnd()
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return C1404o.m3551l(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C1404o.m3551l(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f397y, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f381i;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f381i;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        mo450c();
        return this.f377e.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f380h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f380h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public C1147c getOuterActionMenuPresenter() {
        return this.f373N;
    }

    public Drawable getOverflowIcon() {
        mo450c();
        return this.f377e.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f386n;
    }

    public int getPopupTheme() {
        return this.f387o;
    }

    public CharSequence getSubtitle() {
        return this.f362C;
    }

    public final TextView getSubtitleTextView() {
        return this.f379g;
    }

    public CharSequence getTitle() {
        return this.f361B;
    }

    public int getTitleMarginBottom() {
        return this.f395w;
    }

    public int getTitleMarginEnd() {
        return this.f393u;
    }

    public int getTitleMarginStart() {
        return this.f392t;
    }

    public int getTitleMarginTop() {
        return this.f394v;
    }

    public final TextView getTitleTextView() {
        return this.f378f;
    }

    public C1142a0 getWrapper() {
        if (this.f372M == null) {
            this.f372M = new C1219w0(this, true);
        }
        return this.f372M;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f376Q);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f366G = false;
        }
        if (!this.f366G) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f366G = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f366G = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0295 A[LOOP:0: B:106:0x0293->B:107:0x0295, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b7 A[LOOP:1: B:109:0x02b5->B:110:0x02b7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02dc A[LOOP:2: B:112:0x02da->B:113:0x02dc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0331 A[LOOP:3: B:120:0x032f->B:121:0x0331, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x021b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r21, int r22, int r23, int r24, int r25) {
        /*
            r20 = this;
            r0 = r20
            int r1 = p124p.p150h.p162l.C1404o.m3551l(r20)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = r2
            goto L_0x000d
        L_0x000c:
            r1 = r3
        L_0x000d:
            int r4 = r20.getWidth()
            int r5 = r20.getHeight()
            int r6 = r20.getPaddingLeft()
            int r7 = r20.getPaddingRight()
            int r8 = r20.getPaddingTop()
            int r9 = r20.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f369J
            r11[r2] = r3
            r11[r3] = r3
            int r12 = r20.getMinimumHeight()
            if (r12 < 0) goto L_0x003a
            int r13 = r25 - r23
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = r3
        L_0x003b:
            android.widget.ImageButton r13 = r0.f380h
            boolean r13 = r0.mo454d(r13)
            if (r13 == 0) goto L_0x0053
            android.widget.ImageButton r13 = r0.f380h
            if (r1 == 0) goto L_0x004e
            int r13 = r0.mo448b(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0055
        L_0x004e:
            int r13 = r0.mo442a(r13, r6, r11, r12)
            goto L_0x0054
        L_0x0053:
            r13 = r6
        L_0x0054:
            r14 = r10
        L_0x0055:
            android.widget.ImageButton r15 = r0.f384l
            boolean r15 = r0.mo454d(r15)
            if (r15 == 0) goto L_0x006a
            android.widget.ImageButton r15 = r0.f384l
            if (r1 == 0) goto L_0x0066
            int r14 = r0.mo448b(r15, r14, r11, r12)
            goto L_0x006a
        L_0x0066:
            int r13 = r0.mo442a(r15, r13, r11, r12)
        L_0x006a:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f377e
            boolean r15 = r0.mo454d(r15)
            if (r15 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f377e
            if (r1 == 0) goto L_0x007b
            int r13 = r0.mo442a(r15, r13, r11, r12)
            goto L_0x007f
        L_0x007b:
            int r14 = r0.mo448b(r15, r14, r11, r12)
        L_0x007f:
            int r15 = r20.getCurrentContentInsetLeft()
            int r16 = r20.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f385m
            boolean r13 = r0.mo454d(r13)
            if (r13 == 0) goto L_0x00ba
            android.view.View r13 = r0.f385m
            if (r1 == 0) goto L_0x00b6
            int r10 = r0.mo448b(r13, r10, r11, r12)
            goto L_0x00ba
        L_0x00b6:
            int r2 = r0.mo442a(r13, r2, r11, r12)
        L_0x00ba:
            android.widget.ImageView r13 = r0.f381i
            boolean r13 = r0.mo454d(r13)
            if (r13 == 0) goto L_0x00cf
            android.widget.ImageView r13 = r0.f381i
            if (r1 == 0) goto L_0x00cb
            int r10 = r0.mo448b(r13, r10, r11, r12)
            goto L_0x00cf
        L_0x00cb:
            int r2 = r0.mo442a(r13, r2, r11, r12)
        L_0x00cf:
            android.widget.TextView r13 = r0.f378f
            boolean r13 = r0.mo454d(r13)
            android.widget.TextView r14 = r0.f379g
            boolean r14 = r0.mo454d(r14)
            if (r13 == 0) goto L_0x00f6
            android.widget.TextView r15 = r0.f378f
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.C0059e) r15
            int r3 = r15.topMargin
            r24 = r7
            android.widget.TextView r7 = r0.f378f
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r3
            int r3 = r15.bottomMargin
            int r7 = r7 + r3
            r3 = 0
            int r7 = r7 + r3
            goto L_0x00f9
        L_0x00f6:
            r24 = r7
            r7 = 0
        L_0x00f9:
            if (r14 == 0) goto L_0x0113
            android.widget.TextView r3 = r0.f379g
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0059e) r3
            int r15 = r3.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f379g
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r3 = r3.bottomMargin
            int r4 = r4 + r3
            int r7 = r7 + r4
            goto L_0x0115
        L_0x0113:
            r16 = r4
        L_0x0115:
            if (r13 != 0) goto L_0x0120
            if (r14 == 0) goto L_0x011a
            goto L_0x0120
        L_0x011a:
            r18 = r6
            r23 = r12
            goto L_0x0285
        L_0x0120:
            if (r13 == 0) goto L_0x0125
            android.widget.TextView r3 = r0.f378f
            goto L_0x0127
        L_0x0125:
            android.widget.TextView r3 = r0.f379g
        L_0x0127:
            if (r14 == 0) goto L_0x012c
            android.widget.TextView r4 = r0.f379g
            goto L_0x012e
        L_0x012c:
            android.widget.TextView r4 = r0.f378f
        L_0x012e:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0059e) r3
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.C0059e) r4
            if (r13 == 0) goto L_0x0144
            android.widget.TextView r15 = r0.f378f
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x014e
        L_0x0144:
            if (r14 == 0) goto L_0x0151
            android.widget.TextView r15 = r0.f379g
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x0151
        L_0x014e:
            r17 = 1
            goto L_0x0153
        L_0x0151:
            r17 = 0
        L_0x0153:
            int r15 = r0.f360A
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x019b
            r6 = 80
            if (r15 == r6) goto L_0x018d
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r15 = r3.topMargin
            r23 = r12
            int r12 = r0.f394v
            r25 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0176
            int r6 = r15 + r12
            goto L_0x018b
        L_0x0176:
            int r5 = r5 - r9
            int r5 = r5 - r7
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r3.bottomMargin
            int r3 = r0.f395w
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x018b
            int r2 = r4.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x018b:
            int r8 = r8 + r6
            goto L_0x01aa
        L_0x018d:
            r25 = r2
            r23 = r12
            int r5 = r5 - r9
            int r2 = r4.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f395w
            int r5 = r5 - r2
            int r8 = r5 - r7
            goto L_0x01aa
        L_0x019b:
            r25 = r2
            r23 = r12
            int r2 = r20.getPaddingTop()
            int r3 = r3.topMargin
            int r2 = r2 + r3
            int r3 = r0.f394v
            int r8 = r2 + r3
        L_0x01aa:
            if (r1 == 0) goto L_0x021b
            if (r17 == 0) goto L_0x01b1
            int r1 = r0.f392t
            goto L_0x01b2
        L_0x01b1:
            r1 = 0
        L_0x01b2:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01e9
            android.widget.TextView r1 = r0.f378f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0059e) r1
            android.widget.TextView r2 = r0.f378f
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f378f
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f378f
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f393u
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01ea
        L_0x01e9:
            r2 = r10
        L_0x01ea:
            if (r14 == 0) goto L_0x0210
            android.widget.TextView r1 = r0.f379g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0059e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f379g
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f379g
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f379g
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f393u
            int r1 = r10 - r1
            goto L_0x0211
        L_0x0210:
            r1 = r10
        L_0x0211:
            if (r17 == 0) goto L_0x0218
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0218:
            r2 = r25
            goto L_0x0285
        L_0x021b:
            if (r17 == 0) goto L_0x0220
            int r1 = r0.f392t
            goto L_0x0221
        L_0x0220:
            r1 = 0
        L_0x0221:
            r2 = 0
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r25
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x0257
            android.widget.TextView r1 = r0.f378f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0059e) r1
            android.widget.TextView r2 = r0.f378f
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            android.widget.TextView r4 = r0.f378f
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f378f
            r5.layout(r3, r8, r2, r4)
            int r5 = r0.f393u
            int r2 = r2 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x0258
        L_0x0257:
            r2 = r3
        L_0x0258:
            if (r14 == 0) goto L_0x027c
            android.widget.TextView r1 = r0.f379g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0059e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f379g
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            android.widget.TextView r4 = r0.f379g
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f379g
            r5.layout(r3, r8, r1, r4)
            int r4 = r0.f393u
            int r1 = r1 + r4
            goto L_0x027d
        L_0x027c:
            r1 = r3
        L_0x027d:
            if (r17 == 0) goto L_0x0284
            int r2 = java.lang.Math.max(r2, r1)
            goto L_0x0285
        L_0x0284:
            r2 = r3
        L_0x0285:
            java.util.ArrayList<android.view.View> r1 = r0.f367H
            r3 = 3
            r0.mo446a(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.f367H
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x0293:
            if (r2 >= r1) goto L_0x02a6
            java.util.ArrayList<android.view.View> r4 = r0.f367H
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r23
            int r3 = r0.mo442a(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x0293
        L_0x02a6:
            r12 = r23
            java.util.ArrayList<android.view.View> r1 = r0.f367H
            r2 = 5
            r0.mo446a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f367H
            int r1 = r1.size()
            r2 = 0
        L_0x02b5:
            if (r2 >= r1) goto L_0x02c6
            java.util.ArrayList<android.view.View> r4 = r0.f367H
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.mo448b(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02b5
        L_0x02c6:
            java.util.ArrayList<android.view.View> r1 = r0.f367H
            r2 = 1
            r0.mo446a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f367H
            r4 = 0
            r5 = r11[r4]
            r2 = r11[r2]
            int r4 = r1.size()
            r7 = r5
            r5 = 0
            r6 = 0
        L_0x02da:
            if (r5 >= r4) goto L_0x030d
            java.lang.Object r8 = r1.get(r5)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r9 = (androidx.appcompat.widget.Toolbar.C0059e) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r7
            int r7 = r9.rightMargin
            int r7 = r7 - r2
            r2 = 0
            int r9 = java.lang.Math.max(r2, r13)
            int r14 = java.lang.Math.max(r2, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r2, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r2, r7)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r9
            int r8 = r8 + r14
            int r6 = r6 + r8
            int r5 = r5 + 1
            r2 = r7
            r7 = r13
            goto L_0x02da
        L_0x030d:
            r2 = 0
            int r4 = r16 - r18
            int r4 = r4 - r24
            int r4 = r4 / 2
            int r4 = r4 + r18
            int r1 = r6 / 2
            int r4 = r4 - r1
            int r6 = r6 + r4
            if (r4 >= r3) goto L_0x031d
            goto L_0x0324
        L_0x031d:
            if (r6 <= r10) goto L_0x0323
            int r6 = r6 - r10
            int r3 = r4 - r6
            goto L_0x0324
        L_0x0323:
            r3 = r4
        L_0x0324:
            java.util.ArrayList<android.view.View> r1 = r0.f367H
            int r1 = r1.size()
            r19 = r3
            r3 = r2
            r2 = r19
        L_0x032f:
            if (r3 >= r1) goto L_0x0340
            java.util.ArrayList<android.view.View> r4 = r0.f367H
            java.lang.Object r4 = r4.get(r3)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.mo442a(r4, r2, r11, r12)
            int r3 = r3 + 1
            goto L_0x032f
        L_0x0340:
            java.util.ArrayList<android.view.View> r1 = r0.f367H
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f369J;
        boolean z = true;
        int i10 = 0;
        if (C1143a1.m2887a(this)) {
            c2 = 1;
            c = 0;
        } else {
            c = 1;
            c2 = 0;
        }
        if (mo454d(this.f380h)) {
            mo444a((View) this.f380h, i, 0, i2, 0, this.f391s);
            i5 = mo439a((View) this.f380h) + this.f380h.getMeasuredWidth();
            i4 = Math.max(0, mo447b(this.f380h) + this.f380h.getMeasuredHeight());
            i3 = View.combineMeasuredStates(0, this.f380h.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (mo454d(this.f384l)) {
            mo444a((View) this.f384l, i, 0, i2, 0, this.f391s);
            i5 = mo439a((View) this.f384l) + this.f384l.getMeasuredWidth();
            i4 = Math.max(i4, mo447b(this.f384l) + this.f384l.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.f384l.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i5) + 0;
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (mo454d(this.f377e)) {
            mo444a((View) this.f377e, i, max, i2, 0, this.f391s);
            i6 = mo439a((View) this.f377e) + this.f377e.getMeasuredWidth();
            i4 = Math.max(i4, mo447b(this.f377e) + this.f377e.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.f377e.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = Math.max(currentContentInsetEnd, i6) + max;
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (mo454d(this.f385m)) {
            max2 += mo441a(this.f385m, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, mo447b(this.f385m) + this.f385m.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.f385m.getMeasuredState());
        }
        if (mo454d(this.f381i)) {
            max2 += mo441a((View) this.f381i, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, mo447b(this.f381i) + this.f381i.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.f381i.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((C0059e) childAt.getLayoutParams()).f405b == 0 && mo454d(childAt)) {
                View view = childAt;
                max2 += mo441a(childAt, i, max2, i2, 0, iArr);
                View view2 = view;
                i4 = Math.max(i4, mo447b(view2) + view.getMeasuredHeight());
                i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
            }
        }
        int i12 = this.f394v + this.f395w;
        int i13 = this.f392t + this.f393u;
        if (mo454d(this.f378f)) {
            mo441a((View) this.f378f, i, max2 + i13, i2, i12, iArr);
            int a = mo439a((View) this.f378f) + this.f378f.getMeasuredWidth();
            i7 = mo447b(this.f378f) + this.f378f.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i3, this.f378f.getMeasuredState());
            i8 = a;
        } else {
            i7 = 0;
            i9 = i3;
            i8 = 0;
        }
        if (mo454d(this.f379g)) {
            int i14 = i7 + i12;
            int i15 = i9;
            i8 = Math.max(i8, mo441a((View) this.f379g, i, max2 + i13, i2, i14, iArr));
            i7 = mo447b(this.f379g) + this.f379g.getMeasuredHeight() + i7;
            i9 = View.combineMeasuredStates(i15, this.f379g.getMeasuredState());
        } else {
            int i16 = i9;
        }
        int i17 = max2 + i8;
        int max3 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i17;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max3;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (this.f375P) {
            int childCount2 = getChildCount();
            int i18 = 0;
            while (true) {
                if (i18 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i18);
                if (mo454d(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i18++;
            }
        }
        z = false;
        if (!z) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0061g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0061g gVar = (C0061g) parcelable;
        super.onRestoreInstanceState(gVar.f4274e);
        ActionMenuView actionMenuView = this.f377e;
        C1114g gVar2 = actionMenuView != null ? actionMenuView.f184t : null;
        int i = gVar.f406g;
        if (!(i == 0 || this.f374O == null || gVar2 == null)) {
            MenuItem findItem = gVar2.findItem(i);
            if (findItem != null) {
                findItem.expandActionView();
            }
        }
        if (gVar.f407h) {
            removeCallbacks(this.f376Q);
            post(this.f376Q);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            r2.mo449b()
            p.b.q.m0 r0 = r2.f396x
            r1 = 1
            if (r3 != r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            boolean r3 = r0.f3365g
            if (r1 != r3) goto L_0x0012
            goto L_0x0040
        L_0x0012:
            r0.f3365g = r1
            boolean r3 = r0.f3366h
            if (r3 == 0) goto L_0x0038
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x002a
            int r1 = r0.f3362d
            if (r1 == r3) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            int r1 = r0.f3363e
        L_0x0023:
            r0.f3359a = r1
            int r1 = r0.f3361c
            if (r1 == r3) goto L_0x003c
            goto L_0x003e
        L_0x002a:
            int r1 = r0.f3361c
            if (r1 == r3) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            int r1 = r0.f3363e
        L_0x0031:
            r0.f3359a = r1
            int r1 = r0.f3362d
            if (r1 == r3) goto L_0x003c
            goto L_0x003e
        L_0x0038:
            int r3 = r0.f3363e
            r0.f3359a = r3
        L_0x003c:
            int r1 = r0.f3364f
        L_0x003e:
            r0.f3360b = r1
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    public Parcelable onSaveInstanceState() {
        C0061g gVar = new C0061g(super.onSaveInstanceState());
        C0058d dVar = this.f374O;
        if (dVar != null) {
            C1118i iVar = dVar.f403f;
            if (iVar != null) {
                gVar.f406g = iVar.f3104a;
            }
        }
        gVar.f407h = mo456f();
        return gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f365F = false;
        }
        if (!this.f365F) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f365F = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f365F = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo443a();
        }
        ImageButton imageButton = this.f384l;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C1070a.m2602b(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            mo443a();
            this.f384l.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f384l;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f382j);
        }
    }

    public void setCollapsible(boolean z) {
        this.f375P = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.f398z) {
            this.f398z = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.f397y) {
            this.f397y = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C1070a.m2602b(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f381i == null) {
                this.f381i = new C1194m(getContext(), null, 0);
            }
            if (!mo451c(this.f381i)) {
                mo445a((View) this.f381i, true);
            }
        } else {
            ImageView imageView = this.f381i;
            if (imageView != null && mo451c(imageView)) {
                removeView(this.f381i);
                this.f368I.remove(this.f381i);
            }
        }
        ImageView imageView2 = this.f381i;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f381i == null) {
            this.f381i = new C1194m(getContext(), null, 0);
        }
        ImageView imageView = this.f381i;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo455e();
        }
        ImageButton imageButton = this.f380h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C1070a.m2602b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            mo455e();
            if (!mo451c(this.f380h)) {
                mo445a((View) this.f380h, true);
            }
        } else {
            ImageButton imageButton = this.f380h;
            if (imageButton != null && mo451c(imageButton)) {
                removeView(this.f380h);
                this.f368I.remove(this.f380h);
            }
        }
        ImageButton imageButton2 = this.f380h;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(OnClickListener onClickListener) {
        mo455e();
        this.f380h.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0060f fVar) {
        this.f370K = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        mo450c();
        this.f377e.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f387o != i) {
            this.f387o = i;
            if (i == 0) {
                this.f386n = getContext();
            } else {
                this.f386n = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f379g == null) {
                Context context = getContext();
                C1218w wVar = new C1218w(context);
                this.f379g = wVar;
                wVar.setSingleLine();
                this.f379g.setEllipsize(TruncateAt.END);
                int i = this.f389q;
                if (i != 0) {
                    this.f379g.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f364E;
                if (colorStateList != null) {
                    this.f379g.setTextColor(colorStateList);
                }
            }
            if (!mo451c(this.f379g)) {
                mo445a((View) this.f379g, true);
            }
        } else {
            TextView textView = this.f379g;
            if (textView != null && mo451c(textView)) {
                removeView(this.f379g);
                this.f368I.remove(this.f379g);
            }
        }
        TextView textView2 = this.f379g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f362C = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f364E = colorStateList;
        TextView textView = this.f379g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f378f == null) {
                Context context = getContext();
                C1218w wVar = new C1218w(context);
                this.f378f = wVar;
                wVar.setSingleLine();
                this.f378f.setEllipsize(TruncateAt.END);
                int i = this.f388p;
                if (i != 0) {
                    this.f378f.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f363D;
                if (colorStateList != null) {
                    this.f378f.setTextColor(colorStateList);
                }
            }
            if (!mo451c(this.f378f)) {
                mo445a((View) this.f378f, true);
            }
        } else {
            TextView textView = this.f378f;
            if (textView != null && mo451c(textView)) {
                removeView(this.f378f);
                this.f368I.remove(this.f378f);
            }
        }
        TextView textView2 = this.f378f;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f361B = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f395w = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f393u = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f392t = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f394v = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f363D = colorStateList;
        TextView textView = this.f378f;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: a */
    public final int mo438a(int i) {
        int l = C1404o.m3551l(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i, l) & 7;
        if (absoluteGravity != 1) {
            int i2 = 3;
            if (!(absoluteGravity == 3 || absoluteGravity == 5)) {
                if (l == 1) {
                    i2 = 5;
                }
                return i2;
            }
        }
        return absoluteGravity;
    }

    /* renamed from: a */
    public final int mo440a(View view, int i) {
        C0059e eVar = (C0059e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = eVar.f2677a & 112;
        if (!(i3 == 16 || i3 == 48 || i3 == 80)) {
            i3 = this.f360A & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = eVar.topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = eVar.bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    /* renamed from: a */
    public final int mo439a(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }
}
