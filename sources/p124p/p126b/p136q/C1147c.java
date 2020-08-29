package p124p.p126b.p136q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView.C0012b;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ActionMenuView.C0019a;
import androidx.appcompat.widget.ActionMenuView.C0021c;
import java.util.ArrayList;
import p124p.p126b.C1018a;
import p124p.p126b.C1024g;
import p124p.p126b.p127k.C1061o;
import p124p.p126b.p134p.p135i.C1103b;
import p124p.p126b.p134p.p135i.C1114g;
import p124p.p126b.p134p.p135i.C1114g.C1115a;
import p124p.p126b.p134p.p135i.C1118i;
import p124p.p126b.p134p.p135i.C1126k;
import p124p.p126b.p134p.p135i.C1127l;
import p124p.p126b.p134p.p135i.C1129m.C1130a;
import p124p.p126b.p134p.p135i.C1131n;
import p124p.p126b.p134p.p135i.C1131n.C1132a;
import p124p.p126b.p134p.p135i.C1134p;
import p124p.p126b.p134p.p135i.C1138r;
import p124p.p150h.p162l.C1389b;

/* renamed from: p.b.q.c */
public class C1147c extends C1103b {

    /* renamed from: A */
    public C1150c f3199A;

    /* renamed from: B */
    public C1149b f3200B;

    /* renamed from: C */
    public final C1154f f3201C = new C1154f();

    /* renamed from: D */
    public int f3202D;

    /* renamed from: n */
    public C1151d f3203n;

    /* renamed from: o */
    public Drawable f3204o;

    /* renamed from: p */
    public boolean f3205p;

    /* renamed from: q */
    public boolean f3206q;

    /* renamed from: r */
    public boolean f3207r;

    /* renamed from: s */
    public int f3208s;

    /* renamed from: t */
    public int f3209t;

    /* renamed from: u */
    public int f3210u;

    /* renamed from: v */
    public boolean f3211v;

    /* renamed from: w */
    public int f3212w;

    /* renamed from: x */
    public final SparseBooleanArray f3213x = new SparseBooleanArray();

    /* renamed from: y */
    public C1153e f3214y;

    /* renamed from: z */
    public C1148a f3215z;

    /* renamed from: p.b.q.c$a */
    public class C1148a extends C1127l {
        public C1148a(Context context, C1138r rVar, View view) {
            super(context, rVar, view, false, C1018a.actionOverflowMenuStyle, 0);
            if (!rVar.f3180B.mo4860d()) {
                View view2 = C1147c.this.f3203n;
                if (view2 == null) {
                    view2 = (View) C1147c.this.f3012l;
                }
                this.f3147f = view2;
            }
            mo4963a(C1147c.this.f3201C);
        }

        /* renamed from: c */
        public void mo4965c() {
            C1147c cVar = C1147c.this;
            cVar.f3215z = null;
            cVar.f3202D = 0;
            super.mo4965c();
        }
    }

    /* renamed from: p.b.q.c$b */
    public class C1149b extends C0012b {
        public C1149b() {
        }
    }

    /* renamed from: p.b.q.c$c */
    public class C1150c implements Runnable {

        /* renamed from: e */
        public C1153e f3218e;

        public C1150c(C1153e eVar) {
            this.f3218e = eVar;
        }

        public void run() {
            C1114g gVar = C1147c.this.f3007g;
            if (gVar != null) {
                C1115a aVar = gVar.f3076e;
                if (aVar != null) {
                    aVar.mo198a(gVar);
                }
            }
            View view = (View) C1147c.this.f3012l;
            if (!(view == null || view.getWindowToken() == null || !this.f3218e.mo4966d())) {
                C1147c.this.f3214y = this.f3218e;
            }
            C1147c.this.f3199A = null;
        }
    }

    /* renamed from: p.b.q.c$d */
    public class C1151d extends C1194m implements C0019a {

        /* renamed from: p.b.q.c$d$a */
        public class C1152a extends C1163e0 {
            public C1152a(View view, C1147c cVar) {
                super(view);
            }

            /* renamed from: b */
            public C1134p mo59b() {
                C1153e eVar = C1147c.this.f3214y;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo4961a();
            }

            /* renamed from: c */
            public boolean mo60c() {
                C1147c.this.mo5059g();
                return true;
            }

            /* renamed from: d */
            public boolean mo5063d() {
                C1147c cVar = C1147c.this;
                if (cVar.f3199A != null) {
                    return false;
                }
                cVar.mo5056c();
                return true;
            }
        }

        public C1151d(Context context) {
            super(context, null, C1018a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C1061o.m2492a((View) this, getContentDescription());
            setOnTouchListener(new C1152a(this, C1147c.this));
        }

        /* renamed from: a */
        public boolean mo39a() {
            return false;
        }

        /* renamed from: c */
        public boolean mo41c() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C1147c.this.mo5059g();
            return true;
        }

        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: p.b.q.c$e */
    public class C1153e extends C1127l {
        public C1153e(Context context, C1114g gVar, View view, boolean z) {
            super(context, gVar, view, z, C1018a.actionOverflowMenuStyle, 0);
            mo4963a(C1147c.this.f3201C);
        }

        /* renamed from: c */
        public void mo4965c() {
            C1114g gVar = C1147c.this.f3007g;
            if (gVar != null) {
                gVar.mo4808a(true);
            }
            C1147c.this.f3214y = null;
            super.mo4965c();
        }
    }

    /* renamed from: p.b.q.c$f */
    public class C1154f implements C1130a {
        public C1154f() {
        }

        /* renamed from: a */
        public void mo196a(C1114g gVar, boolean z) {
            if (gVar instanceof C1138r) {
                gVar.mo4826c().mo4808a(false);
            }
            C1130a aVar = C1147c.this.f3009i;
            if (aVar != null) {
                aVar.mo196a(gVar, z);
            }
        }

        /* renamed from: a */
        public boolean mo197a(C1114g gVar) {
            boolean z = false;
            if (gVar == null) {
                return false;
            }
            C1147c.this.f3202D = ((C1138r) gVar).f3180B.getItemId();
            C1130a aVar = C1147c.this.f3009i;
            if (aVar != null) {
                z = aVar.mo197a(gVar);
            }
            return z;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: p.b.q.c$g */
    public static class C1155g implements Parcelable {
        public static final Creator<C1155g> CREATOR = new C1156a();

        /* renamed from: e */
        public int f3224e;

        /* renamed from: p.b.q.c$g$a */
        public static class C1156a implements Creator<C1155g> {
            public Object createFromParcel(Parcel parcel) {
                return new C1155g(parcel);
            }

            public Object[] newArray(int i) {
                return new C1155g[i];
            }
        }

        public C1155g() {
        }

        public C1155g(Parcel parcel) {
            this.f3224e = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3224e);
        }
    }

    public C1147c(Context context) {
        super(context, C1024g.abc_action_menu_layout, C1024g.abc_action_menu_item_layout);
    }

    /* renamed from: a */
    public View mo4759a(C1118i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.mo4859c()) {
            actionView = super.mo4759a(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.f3102C ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (actionMenuView != null) {
            if (!(layoutParams instanceof C0021c)) {
                actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
            }
            return actionView;
        }
        throw null;
    }

    /* renamed from: a */
    public void mo533a(Parcelable parcelable) {
        if (parcelable instanceof C1155g) {
            int i = ((C1155g) parcelable).f3224e;
            if (i > 0) {
                MenuItem findItem = this.f3007g.findItem(i);
                if (findItem != null) {
                    mo538a((C1138r) findItem.getSubMenu());
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo5055a() {
        return mo5056c() | mo5057e();
    }

    /* renamed from: b */
    public boolean mo539b() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        C1114g gVar = this.f3007g;
        View view = null;
        if (gVar != null) {
            arrayList = gVar.mo4830d();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i3 = this.f3210u;
        int i4 = this.f3209t;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f3012l;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            C1118i iVar = (C1118i) arrayList.get(i5);
            if ((iVar.f3128y & 2) == 2) {
                i7++;
            } else {
                if ((iVar.f3128y & 1) == 1) {
                    i6++;
                } else {
                    z2 = true;
                }
            }
            if (this.f3211v && iVar.f3102C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f3206q && (z2 || i6 + i7 > i3)) {
            i3--;
        }
        int i8 = i3 - i7;
        SparseBooleanArray sparseBooleanArray = this.f3213x;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < i) {
            C1118i iVar2 = (C1118i) arrayList.get(i9);
            if ((iVar2.f3128y & i2) == i2 ? z : false) {
                View a = mo4759a(iVar2, view, viewGroup);
                a.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                int i11 = iVar2.f3105b;
                if (i11 != 0) {
                    sparseBooleanArray.put(i11, z);
                }
                iVar2.mo4858c(z);
            } else {
                if ((iVar2.f3128y & z) == z ? z : false) {
                    int i12 = iVar2.f3105b;
                    boolean z3 = sparseBooleanArray.get(i12);
                    boolean z4 = ((i8 > 0 || z3) && i4 > 0) ? z : false;
                    if (z4) {
                        View a2 = mo4759a(iVar2, view, viewGroup);
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = a2.getMeasuredWidth();
                        i4 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z4 &= i4 + i10 > 0 ? z : false;
                    }
                    boolean z5 = z4;
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, z);
                    } else if (z3) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            C1118i iVar3 = (C1118i) arrayList.get(i13);
                            if (iVar3.f3105b == i12) {
                                if (iVar3.mo4860d()) {
                                    i8++;
                                }
                                iVar3.mo4858c(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    iVar2.mo4858c(z5);
                } else {
                    iVar2.mo4858c(false);
                    i9++;
                    view = null;
                    i2 = 2;
                    z = true;
                }
            }
            i9++;
            view = null;
            i2 = 2;
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    public boolean mo5056c() {
        C1150c cVar = this.f3199A;
        if (cVar != null) {
            C1131n nVar = this.f3012l;
            if (nVar != null) {
                ((View) nVar).removeCallbacks(cVar);
                this.f3199A = null;
                return true;
            }
        }
        C1153e eVar = this.f3214y;
        if (eVar == null) {
            return false;
        }
        if (eVar.mo4964b()) {
            eVar.f3151j.dismiss();
        }
        return true;
    }

    /* renamed from: d */
    public Parcelable mo541d() {
        C1155g gVar = new C1155g();
        gVar.f3224e = this.f3202D;
        return gVar;
    }

    /* renamed from: e */
    public boolean mo5057e() {
        C1148a aVar = this.f3215z;
        if (aVar == null) {
            return false;
        }
        if (aVar.mo4964b()) {
            aVar.f3151j.dismiss();
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo5058f() {
        C1153e eVar = this.f3214y;
        return eVar != null && eVar.mo4964b();
    }

    /* renamed from: g */
    public boolean mo5059g() {
        if (this.f3206q && !mo5058f()) {
            C1114g gVar = this.f3007g;
            if (!(gVar == null || this.f3012l == null || this.f3199A != null)) {
                gVar.mo4800a();
                if (!gVar.f3081j.isEmpty()) {
                    C1153e eVar = new C1153e(this.f3006f, this.f3007g, this.f3203n, true);
                    C1150c cVar = new C1150c(eVar);
                    this.f3199A = cVar;
                    ((View) this.f3012l).post(cVar);
                    super.mo538a((C1138r) null);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo532a(Context context, C1114g gVar) {
        this.f3006f = context;
        LayoutInflater.from(context);
        this.f3007g = gVar;
        Resources resources = context.getResources();
        if (!this.f3207r) {
            this.f3206q = true;
        }
        int i = 2;
        this.f3208s = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f3210u = i;
        int i4 = this.f3208s;
        if (this.f3206q) {
            if (this.f3203n == null) {
                C1151d dVar = new C1151d(this.f3005e);
                this.f3203n = dVar;
                if (this.f3205p) {
                    dVar.setImageDrawable(this.f3204o);
                    this.f3204o = null;
                    this.f3205p = false;
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.f3203n.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.f3203n.getMeasuredWidth();
        } else {
            this.f3203n = null;
        }
        this.f3209t = i4;
        this.f3212w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    /* renamed from: a */
    public void mo534a(C1114g gVar, boolean z) {
        mo5055a();
        C1130a aVar = this.f3009i;
        if (aVar != null) {
            aVar.mo196a(gVar, z);
        }
    }

    /* renamed from: a */
    public boolean mo538a(C1138r rVar) {
        boolean z = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        C1138r rVar2 = rVar;
        while (true) {
            C1114g gVar = rVar2.f3179A;
            if (gVar == this.f3007g) {
                break;
            }
            rVar2 = (C1138r) gVar;
        }
        C1118i iVar = rVar2.f3180B;
        ViewGroup viewGroup = (ViewGroup) this.f3012l;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof C1132a) && ((C1132a) childAt).getItemData() == iVar) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        this.f3202D = rVar.f3180B.getItemId();
        int size = rVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        C1148a aVar = new C1148a(this.f3006f, rVar, view);
        this.f3215z = aVar;
        aVar.f3149h = z;
        C1126k kVar = aVar.f3151j;
        if (kVar != null) {
            kVar.mo4768b(z);
        }
        if (this.f3215z.mo4966d()) {
            C1130a aVar2 = this.f3009i;
            if (aVar2 != null) {
                aVar2.mo197a(rVar);
            }
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    /* renamed from: a */
    public void mo536a(boolean z) {
        ArrayList<C1118i> arrayList;
        super.mo536a(z);
        ((View) this.f3012l).requestLayout();
        C1114g gVar = this.f3007g;
        boolean z2 = false;
        if (gVar != null) {
            gVar.mo4800a();
            ArrayList<C1118i> arrayList2 = gVar.f3080i;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                C1389b bVar = ((C1118i) arrayList2.get(i)).f3100A;
            }
        }
        C1114g gVar2 = this.f3007g;
        if (gVar2 != null) {
            gVar2.mo4800a();
            arrayList = gVar2.f3081j;
        } else {
            arrayList = null;
        }
        if (this.f3206q && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z2 = !((C1118i) arrayList.get(0)).f3102C;
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        C1151d dVar = this.f3203n;
        if (z2) {
            if (dVar == null) {
                this.f3203n = new C1151d(this.f3005e);
            }
            ViewGroup viewGroup = (ViewGroup) this.f3203n.getParent();
            if (viewGroup != this.f3012l) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f3203n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f3012l;
                C1151d dVar2 = this.f3203n;
                C0021c generateDefaultLayoutParams = actionMenuView.generateDefaultLayoutParams();
                generateDefaultLayoutParams.f191c = true;
                actionMenuView.addView(dVar2, generateDefaultLayoutParams);
            }
        } else if (dVar != null) {
            ViewParent parent = dVar.getParent();
            C1131n nVar = this.f3012l;
            if (parent == nVar) {
                ((ViewGroup) nVar).removeView(this.f3203n);
            }
        }
        ((ActionMenuView) this.f3012l).setOverflowReserved(this.f3206q);
    }
}
