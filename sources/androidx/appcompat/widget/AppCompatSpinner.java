package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController.C0007b;
import p124p.p126b.C1018a;
import p124p.p126b.p127k.C1034d;
import p124p.p126b.p127k.C1034d.C1035a;
import p124p.p126b.p128l.p129a.C1070a;
import p124p.p126b.p134p.p135i.C1134p;
import p124p.p126b.p136q.C1157c0;
import p124p.p126b.p136q.C1162e;
import p124p.p126b.p136q.C1163e0;
import p124p.p126b.p136q.C1172h0;
import p124p.p126b.p136q.C1205q0;
import p124p.p150h.p162l.C1404o;

public class AppCompatSpinner extends Spinner {

    /* renamed from: m */
    public static final int[] f202m = {16843505};

    /* renamed from: e */
    public final C1162e f203e;

    /* renamed from: f */
    public final Context f204f;

    /* renamed from: g */
    public C1163e0 f205g;

    /* renamed from: h */
    public SpinnerAdapter f206h;

    /* renamed from: i */
    public final boolean f207i;

    /* renamed from: j */
    public C0034g f208j;

    /* renamed from: k */
    public int f209k;

    /* renamed from: l */
    public final Rect f210l;

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    public class C0024a extends C1163e0 {

        /* renamed from: n */
        public final /* synthetic */ C0028e f211n;

        public C0024a(View view, C0028e eVar) {
            this.f211n = eVar;
            super(view);
        }

        /* renamed from: b */
        public C1134p mo59b() {
            return this.f211n;
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: c */
        public boolean mo60c() {
            if (!AppCompatSpinner.this.getInternalPopup().mo250a()) {
                AppCompatSpinner.this.mo215a();
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    public class C0025b implements OnGlobalLayoutListener {
        public C0025b() {
        }

        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().mo250a()) {
                AppCompatSpinner.this.mo215a();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    public class C0026c implements C0034g, OnClickListener {

        /* renamed from: e */
        public C1034d f214e;

        /* renamed from: f */
        public ListAdapter f215f;

        /* renamed from: g */
        public CharSequence f216g;

        public C0026c() {
        }

        /* renamed from: a */
        public void mo245a(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: a */
        public void mo246a(int i, int i2) {
            if (this.f215f != null) {
                C1035a aVar = new C1035a(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.f216g;
                if (charSequence != null) {
                    aVar.f2683a.f74f = charSequence;
                }
                ListAdapter listAdapter = this.f215f;
                int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
                C0007b bVar = aVar.f2683a;
                bVar.f83o = listAdapter;
                bVar.f84p = this;
                bVar.f89u = selectedItemPosition;
                bVar.f88t = true;
                C1034d a = aVar.mo4425a();
                this.f214e = a;
                ListView listView = a.f2682g.f46g;
                listView.setTextDirection(i);
                listView.setTextAlignment(i2);
                this.f214e.show();
            }
        }

        /* renamed from: a */
        public void mo247a(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        /* renamed from: a */
        public void mo248a(ListAdapter listAdapter) {
            this.f215f = listAdapter;
        }

        /* renamed from: a */
        public void mo249a(CharSequence charSequence) {
            this.f216g = charSequence;
        }

        /* renamed from: a */
        public boolean mo250a() {
            C1034d dVar = this.f214e;
            if (dVar != null) {
                return dVar.isShowing();
            }
            return false;
        }

        /* renamed from: b */
        public int mo251b() {
            return 0;
        }

        /* renamed from: b */
        public void mo252b(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: c */
        public void mo253c(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: d */
        public Drawable mo254d() {
            return null;
        }

        public void dismiss() {
            C1034d dVar = this.f214e;
            if (dVar != null) {
                dVar.dismiss();
                this.f214e = null;
            }
        }

        /* renamed from: f */
        public int mo256f() {
            return 0;
        }

        /* renamed from: g */
        public CharSequence mo257g() {
            return this.f216g;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i, this.f215f.getItemId(i));
            }
            C1034d dVar = this.f214e;
            if (dVar != null) {
                dVar.dismiss();
                this.f214e = null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    public static class C0027d implements ListAdapter, SpinnerAdapter {

        /* renamed from: e */
        public SpinnerAdapter f218e;

        /* renamed from: f */
        public ListAdapter f219f;

        public C0027d(SpinnerAdapter spinnerAdapter, Theme theme) {
            this.f218e = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f219f = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof C1205q0) {
                C1205q0 q0Var = (C1205q0) spinnerAdapter;
                if (q0Var.getDropDownViewTheme() == null) {
                    q0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f219f;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f218e;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f218e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f218e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f218e;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f218e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f218e;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f219f;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f218e;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f218e;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    public class C0028e extends C1172h0 implements C0034g {

        /* renamed from: J */
        public CharSequence f220J;

        /* renamed from: K */
        public ListAdapter f221K;

        /* renamed from: L */
        public final Rect f222L = new Rect();

        /* renamed from: M */
        public int f223M;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$a */
        public class C0029a implements OnItemClickListener {
            public C0029a(AppCompatSpinner appCompatSpinner) {
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C0028e eVar = C0028e.this;
                    AppCompatSpinner.this.performItemClick(view, i, eVar.f221K.getItemId(i));
                }
                C0028e.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$b */
        public class C0030b implements OnGlobalLayoutListener {
            public C0030b() {
            }

            public void onGlobalLayout() {
                C0028e eVar = C0028e.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                if (eVar != null) {
                    if (!(C1404o.m3562w(appCompatSpinner) && appCompatSpinner.getGlobalVisibleRect(eVar.f222L))) {
                        C0028e.this.dismiss();
                        return;
                    }
                    C0028e.this.mo272h();
                    C0028e.super.mo4769c();
                    return;
                }
                throw null;
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$c */
        public class C0031c implements OnDismissListener {

            /* renamed from: e */
            public final /* synthetic */ OnGlobalLayoutListener f227e;

            public C0031c(OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f227e = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f227e);
                }
            }
        }

        public C0028e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i, 0);
            this.f3315v = AppCompatSpinner.this;
            mo5161a(true);
            this.f3313t = 0;
            this.f3316w = new C0029a(AppCompatSpinner.this);
        }

        /* renamed from: a */
        public void mo246a(int i, int i2) {
            boolean a = mo4766a();
            mo272h();
            this.f3297F.setInputMethodMode(2);
            super.mo4769c();
            C1157c0 c0Var = this.f3300g;
            c0Var.setChoiceMode(1);
            c0Var.setTextDirection(i);
            c0Var.setTextAlignment(i2);
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            C1157c0 c0Var2 = this.f3300g;
            if (mo4766a() && c0Var2 != null) {
                c0Var2.setListSelectionHidden(false);
                c0Var2.setSelection(selectedItemPosition);
                if (c0Var2.getChoiceMode() != 0) {
                    c0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!a) {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    C0030b bVar = new C0030b();
                    viewTreeObserver.addOnGlobalLayoutListener(bVar);
                    this.f3297F.setOnDismissListener(new C0031c(bVar));
                }
            }
        }

        /* renamed from: a */
        public void mo248a(ListAdapter listAdapter) {
            super.mo248a(listAdapter);
            this.f221K = listAdapter;
        }

        /* renamed from: a */
        public void mo249a(CharSequence charSequence) {
            this.f220J = charSequence;
        }

        /* renamed from: b */
        public void mo252b(int i) {
            this.f223M = i;
        }

        /* renamed from: g */
        public CharSequence mo257g() {
            return this.f220J;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0096  */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo272h() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.mo5164d()
                r1 = 0
                if (r0 == 0) goto L_0x0026
                androidx.appcompat.widget.AppCompatSpinner r1 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r1 = r1.f210l
                r0.getPadding(r1)
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                boolean r0 = p124p.p126b.p136q.C1143a1.m2887a(r0)
                if (r0 == 0) goto L_0x001d
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.f210l
                int r0 = r0.right
                goto L_0x0024
            L_0x001d:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.f210l
                int r0 = r0.left
                int r0 = -r0
            L_0x0024:
                r1 = r0
                goto L_0x002e
            L_0x0026:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.f210l
                r0.right = r1
                r0.left = r1
            L_0x002e:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.AppCompatSpinner r2 = androidx.appcompat.widget.AppCompatSpinner.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.AppCompatSpinner r3 = androidx.appcompat.widget.AppCompatSpinner.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.AppCompatSpinner r4 = androidx.appcompat.widget.AppCompatSpinner.this
                int r5 = r4.f209k
                r6 = -2
                if (r5 != r6) goto L_0x0078
                android.widget.ListAdapter r5 = r8.f221K
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.mo5164d()
                int r4 = r4.mo214a(r5, r6)
                androidx.appcompat.widget.AppCompatSpinner r5 = androidx.appcompat.widget.AppCompatSpinner.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.AppCompatSpinner r6 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r6 = r6.f210l
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L_0x0070
                r4 = r5
            L_0x0070:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L_0x007e
            L_0x0078:
                r4 = -1
                if (r5 != r4) goto L_0x0082
                int r4 = r3 - r0
                int r4 = r4 - r2
            L_0x007e:
                r8.mo5165d(r4)
                goto L_0x0085
            L_0x0082:
                r8.mo5165d(r5)
            L_0x0085:
                androidx.appcompat.widget.AppCompatSpinner r4 = androidx.appcompat.widget.AppCompatSpinner.this
                boolean r4 = p124p.p126b.p136q.C1143a1.m2887a(r4)
                if (r4 == 0) goto L_0x0096
                int r3 = r3 - r2
                int r0 = r8.f3302i
                int r3 = r3 - r0
                int r0 = r8.f223M
                int r3 = r3 - r0
                int r3 = r3 + r1
                goto L_0x009b
            L_0x0096:
                int r2 = r8.f223M
                int r0 = r0 + r2
                int r3 = r0 + r1
            L_0x009b:
                r8.f3303j = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.C0028e.mo272h():void");
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    public static class C0032f extends BaseSavedState {
        public static final Creator<C0032f> CREATOR = new C0033a();

        /* renamed from: e */
        public boolean f229e;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f$a */
        public static class C0033a implements Creator<C0032f> {
            public Object createFromParcel(Parcel parcel) {
                return new C0032f(parcel);
            }

            public Object[] newArray(int i) {
                return new C0032f[i];
            }
        }

        public C0032f(Parcel parcel) {
            super(parcel);
            this.f229e = parcel.readByte() != 0;
        }

        public C0032f(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f229e ? (byte) 1 : 0);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$g */
    public interface C0034g {
        /* renamed from: a */
        void mo245a(int i);

        /* renamed from: a */
        void mo246a(int i, int i2);

        /* renamed from: a */
        void mo247a(Drawable drawable);

        /* renamed from: a */
        void mo248a(ListAdapter listAdapter);

        /* renamed from: a */
        void mo249a(CharSequence charSequence);

        /* renamed from: a */
        boolean mo250a();

        /* renamed from: b */
        int mo251b();

        /* renamed from: b */
        void mo252b(int i);

        /* renamed from: c */
        void mo253c(int i);

        /* renamed from: d */
        Drawable mo254d();

        void dismiss();

        /* renamed from: f */
        int mo256f();

        /* renamed from: g */
        CharSequence mo257g();
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatSpinner(Context context, int i) {
        this(context, null, C1018a.spinnerStyle, i);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1018a.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        if (r11 != null) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036 A[SYNTHETIC, Splitter:B:10:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f210l = r0
            int[] r0 = p124p.p126b.C1027j.Spinner
            r1 = 0
            android.content.res.TypedArray r0 = r7.obtainStyledAttributes(r8, r0, r9, r1)
            p.b.q.e r2 = new p.b.q.e
            r2.<init>(r6)
            r6.f203e = r2
            if (r11 == 0) goto L_0x0022
            p.b.p.c r2 = new p.b.p.c
            r2.<init>(r7, r11)
        L_0x001f:
            r6.f204f = r2
            goto L_0x0032
        L_0x0022:
            int r11 = p124p.p126b.C1027j.Spinner_popupTheme
            int r11 = r0.getResourceId(r11, r1)
            if (r11 == 0) goto L_0x0030
            p.b.p.c r2 = new p.b.p.c
            r2.<init>(r7, r11)
            goto L_0x001f
        L_0x0030:
            r6.f204f = r7
        L_0x0032:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x0062
            int[] r11 = f202m     // Catch:{ Exception -> 0x004e, all -> 0x004c }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x004e, all -> 0x004c }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x004a }
            if (r3 == 0) goto L_0x0046
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x004a }
        L_0x0046:
            r11.recycle()
            goto L_0x0062
        L_0x004a:
            r3 = move-exception
            goto L_0x0050
        L_0x004c:
            r7 = move-exception
            goto L_0x005c
        L_0x004e:
            r3 = move-exception
            r11 = r2
        L_0x0050:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x005a }
            if (r11 == 0) goto L_0x0062
            goto L_0x0046
        L_0x005a:
            r7 = move-exception
            r2 = r11
        L_0x005c:
            if (r2 == 0) goto L_0x0061
            r2.recycle()
        L_0x0061:
            throw r7
        L_0x0062:
            r11 = 1
            if (r10 == 0) goto L_0x00a2
            if (r10 == r11) goto L_0x0068
            goto L_0x00b2
        L_0x0068:
            androidx.appcompat.widget.AppCompatSpinner$e r10 = new androidx.appcompat.widget.AppCompatSpinner$e
            android.content.Context r3 = r6.f204f
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f204f
            int[] r4 = p124p.p126b.C1027j.Spinner
            p.b.q.u0 r1 = p124p.p126b.p136q.C1213u0.m3013a(r3, r8, r4, r9, r1)
            int r3 = p124p.p126b.C1027j.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.mo5325f(r3, r4)
            r6.f209k = r3
            int r3 = p124p.p126b.C1027j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.mo5318b(r3)
            android.widget.PopupWindow r4 = r10.f3297F
            r4.setBackgroundDrawable(r3)
            int r3 = p124p.p126b.C1027j.Spinner_android_prompt
            java.lang.String r3 = r0.getString(r3)
            r10.f220J = r3
            android.content.res.TypedArray r1 = r1.f3426b
            r1.recycle()
            r6.f208j = r10
            androidx.appcompat.widget.AppCompatSpinner$a r1 = new androidx.appcompat.widget.AppCompatSpinner$a
            r1.<init>(r6, r10)
            r6.f205g = r1
            goto L_0x00b2
        L_0x00a2:
            androidx.appcompat.widget.AppCompatSpinner$c r10 = new androidx.appcompat.widget.AppCompatSpinner$c
            r10.<init>()
            r6.f208j = r10
            int r1 = p124p.p126b.C1027j.Spinner_android_prompt
            java.lang.String r1 = r0.getString(r1)
            r10.mo249a(r1)
        L_0x00b2:
            int r10 = p124p.p126b.C1027j.Spinner_android_entries
            java.lang.CharSequence[] r10 = r0.getTextArray(r10)
            if (r10 == 0) goto L_0x00ca
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = p124p.p126b.C1024g.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r7)
            r6.setAdapter(r1)
        L_0x00ca:
            r0.recycle()
            r6.f207i = r11
            android.widget.SpinnerAdapter r7 = r6.f206h
            if (r7 == 0) goto L_0x00d8
            r6.setAdapter(r7)
            r6.f206h = r2
        L_0x00d8:
            p.b.q.e r7 = r6.f203e
            r7.mo5097a(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* renamed from: a */
    public int mo214a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f210l);
            Rect rect = this.f210l;
            i2 += rect.left + rect.right;
        }
        return i2;
    }

    /* renamed from: a */
    public void mo215a() {
        this.f208j.mo246a(getTextDirection(), getTextAlignment());
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1162e eVar = this.f203e;
        if (eVar != null) {
            eVar.mo5093a();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0034g gVar = this.f208j;
        return gVar != null ? gVar.mo251b() : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        C0034g gVar = this.f208j;
        return gVar != null ? gVar.mo256f() : super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return this.f208j != null ? this.f209k : super.getDropDownWidth();
    }

    public final C0034g getInternalPopup() {
        return this.f208j;
    }

    public Drawable getPopupBackground() {
        C0034g gVar = this.f208j;
        return gVar != null ? gVar.mo254d() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f204f;
    }

    public CharSequence getPrompt() {
        C0034g gVar = this.f208j;
        return gVar != null ? gVar.mo257g() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1162e eVar = this.f203e;
        if (eVar != null) {
            return eVar.mo5098b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C1162e eVar = this.f203e;
        if (eVar != null) {
            return eVar.mo5100c();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0034g gVar = this.f208j;
        if (gVar != null && gVar.mo250a()) {
            this.f208j.dismiss();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f208j != null && MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo214a(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C0032f fVar = (C0032f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (fVar.f229e) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new C0025b());
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        C0032f fVar = new C0032f(super.onSaveInstanceState());
        C0034g gVar = this.f208j;
        fVar.f229e = gVar != null && gVar.mo250a();
        return fVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C1163e0 e0Var = this.f205g;
        if (e0Var == null || !e0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0034g gVar = this.f208j;
        if (gVar == null) {
            return super.performClick();
        }
        if (!gVar.mo250a()) {
            mo215a();
        }
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f207i) {
            this.f206h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f208j != null) {
            Context context = this.f204f;
            if (context == null) {
                context = getContext();
            }
            this.f208j.mo248a((ListAdapter) new C0027d(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1162e eVar = this.f203e;
        if (eVar != null) {
            eVar.mo5101d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1162e eVar = this.f203e;
        if (eVar != null) {
            eVar.mo5094a(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0034g gVar = this.f208j;
        if (gVar != null) {
            gVar.mo252b(i);
            this.f208j.mo253c(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    public void setDropDownVerticalOffset(int i) {
        C0034g gVar = this.f208j;
        if (gVar != null) {
            gVar.mo245a(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f208j != null) {
            this.f209k = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0034g gVar = this.f208j;
        if (gVar != null) {
            gVar.mo247a(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C1070a.m2602b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0034g gVar = this.f208j;
        if (gVar != null) {
            gVar.mo249a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1162e eVar = this.f203e;
        if (eVar != null) {
            eVar.mo5099b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C1162e eVar = this.f203e;
        if (eVar != null) {
            eVar.mo5096a(mode);
        }
    }
}
