package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p116io.jsonwebtoken.lang.Objects;
import p116io.jsonwebtoken.lang.Strings;
import p124p.p126b.C1018a;
import p124p.p126b.C1021d;
import p124p.p126b.C1023f;
import p124p.p126b.C1024g;
import p124p.p126b.C1025h;
import p124p.p126b.C1027j;
import p124p.p126b.p127k.C1061o;
import p124p.p126b.p134p.C1091b;
import p124p.p126b.p136q.C1143a1;
import p124p.p126b.p136q.C1160d;
import p124p.p126b.p136q.C1167f0;
import p124p.p126b.p136q.C1200o0;
import p124p.p126b.p136q.C1213u0;
import p124p.p150h.p162l.C1404o;
import p124p.p165i.p166a.C1452a;
import p124p.p167j.p168a.C1458a;
import p213q.p214a.p215a.p216a.C1965a;

public class SearchView extends C1167f0 implements C1091b {

    /* renamed from: u0 */
    public static final C0047k f243u0 = new C0047k();

    /* renamed from: A */
    public final ImageView f244A;

    /* renamed from: B */
    public final View f245B;

    /* renamed from: C */
    public C0053p f246C;

    /* renamed from: D */
    public Rect f247D;

    /* renamed from: E */
    public Rect f248E;

    /* renamed from: F */
    public int[] f249F;

    /* renamed from: G */
    public int[] f250G;

    /* renamed from: H */
    public final ImageView f251H;

    /* renamed from: I */
    public final Drawable f252I;

    /* renamed from: J */
    public final int f253J;

    /* renamed from: K */
    public final int f254K;

    /* renamed from: L */
    public final Intent f255L;

    /* renamed from: M */
    public final Intent f256M;

    /* renamed from: N */
    public final CharSequence f257N;

    /* renamed from: O */
    public C0049m f258O;

    /* renamed from: P */
    public C0048l f259P;

    /* renamed from: Q */
    public OnFocusChangeListener f260Q;

    /* renamed from: R */
    public C0050n f261R;

    /* renamed from: S */
    public OnClickListener f262S;

    /* renamed from: T */
    public boolean f263T;

    /* renamed from: U */
    public boolean f264U;

    /* renamed from: V */
    public C1452a f265V;

    /* renamed from: W */
    public boolean f266W;

    /* renamed from: a0 */
    public CharSequence f267a0;

    /* renamed from: b0 */
    public boolean f268b0;

    /* renamed from: c0 */
    public boolean f269c0;

    /* renamed from: d0 */
    public int f270d0;

    /* renamed from: e0 */
    public boolean f271e0;

    /* renamed from: f0 */
    public CharSequence f272f0;

    /* renamed from: g0 */
    public CharSequence f273g0;

    /* renamed from: h0 */
    public boolean f274h0;

    /* renamed from: i0 */
    public int f275i0;

    /* renamed from: j0 */
    public SearchableInfo f276j0;

    /* renamed from: k0 */
    public Bundle f277k0;

    /* renamed from: l0 */
    public final Runnable f278l0;

    /* renamed from: m0 */
    public Runnable f279m0;

    /* renamed from: n0 */
    public final WeakHashMap<String, ConstantState> f280n0;

    /* renamed from: o0 */
    public final OnClickListener f281o0;

    /* renamed from: p0 */
    public OnKeyListener f282p0;

    /* renamed from: q0 */
    public final OnEditorActionListener f283q0;

    /* renamed from: r0 */
    public final OnItemClickListener f284r0;

    /* renamed from: s0 */
    public final OnItemSelectedListener f285s0;

    /* renamed from: t */
    public final SearchAutoComplete f286t;

    /* renamed from: t0 */
    public TextWatcher f287t0;

    /* renamed from: u */
    public final View f288u;

    /* renamed from: v */
    public final View f289v;

    /* renamed from: w */
    public final View f290w;

    /* renamed from: x */
    public final ImageView f291x;

    /* renamed from: y */
    public final ImageView f292y;

    /* renamed from: z */
    public final ImageView f293z;

    public static class SearchAutoComplete extends C1160d {

        /* renamed from: h */
        public int f294h;

        /* renamed from: i */
        public SearchView f295i;

        /* renamed from: j */
        public boolean f296j;

        /* renamed from: k */
        public final Runnable f297k;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        public class C0036a implements Runnable {
            public C0036a() {
            }

            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f296j) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f296j = false;
                }
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C1018a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f297k = new C0036a();
            this.f294h = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                return (i >= 600 || (i >= 640 && i2 >= 480)) ? 192 : 160;
            }
            return 256;
        }

        public boolean enoughToFilter() {
            return this.f294h <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f296j) {
                removeCallbacks(this.f297k);
                post(this.f297k);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f295i;
            searchView.mo305b(searchView.f264U);
            searchView.post(searchView.f278l0);
            if (searchView.f286t.hasFocus()) {
                searchView.mo311d();
            }
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f295i.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f295i.hasFocus() && getVisibility() == 0) {
                this.f296j = true;
                if (SearchView.m106a(getContext())) {
                    Method method = SearchView.f243u0.f311c;
                    if (method != null) {
                        try {
                            method.invoke(this, new Object[]{Boolean.valueOf(true)});
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f296j = false;
                removeCallbacks(this.f297k);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f296j = false;
                removeCallbacks(this.f297k);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f296j = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f295i = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f294h = i;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    public class C0037a implements TextWatcher {
        public C0037a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f286t.getText();
            searchView.f273g0 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.mo304a(z);
            searchView.mo308c(!z);
            searchView.mo323h();
            searchView.mo326k();
            if (searchView.f258O != null && !TextUtils.equals(charSequence, searchView.f272f0)) {
                searchView.f258O.mo374a(charSequence.toString());
            }
            searchView.f272f0 = charSequence.toString();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    public class C0038b implements Runnable {
        public C0038b() {
        }

        public void run() {
            SearchView.this.mo324i();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    public class C0039c implements Runnable {
        public C0039c() {
        }

        public void run() {
            C1452a aVar = SearchView.this.f265V;
            if (aVar instanceof C1200o0) {
                aVar.mo5277a(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    public class C0040d implements OnFocusChangeListener {
        public C0040d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            OnFocusChangeListener onFocusChangeListener = searchView.f260Q;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    public class C0041e implements OnLayoutChangeListener {
        public C0041e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView searchView = SearchView.this;
            if (searchView.f245B.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f289v.getPaddingLeft();
                Rect rect = new Rect();
                boolean a = C1143a1.m2887a(searchView);
                int dimensionPixelSize = searchView.f263T ? resources.getDimensionPixelSize(C1021d.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(C1021d.abc_dropdownitem_icon_width) : 0;
                searchView.f286t.getDropDownBackground().getPadding(rect);
                searchView.f286t.setDropDownHorizontalOffset(a ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.f286t.setDropDownWidth((((searchView.f245B.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    public class C0042f implements OnClickListener {
        public C0042f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f291x) {
                searchView.mo313f();
            } else if (view == searchView.f293z) {
                searchView.mo312e();
            } else if (view == searchView.f292y) {
                searchView.mo314g();
            } else if (view == searchView.f244A) {
                SearchableInfo searchableInfo = searchView.f276j0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.f255L);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.mo299a(searchView.f256M, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                }
            } else if (view == searchView.f286t) {
                searchView.mo311d();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    public class C0043g implements OnKeyListener {
        public C0043g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            boolean z = false;
            if (searchView.f276j0 == null) {
                return false;
            }
            if (!searchView.f286t.isPopupShowing() || SearchView.this.f286t.getListSelection() == -1) {
                if ((TextUtils.getTrimmedLength(SearchView.this.f286t.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.mo302a(0, null, searchView2.f286t.getText().toString());
                return true;
            }
            SearchView searchView3 = SearchView.this;
            if (searchView3.f276j0 != null && searchView3.f265V != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (i == 66 || i == 84 || i == 61) {
                    z = searchView3.mo306b(searchView3.f286t.getListSelection());
                } else if (i == 21 || i == 22) {
                    searchView3.f286t.setSelection(i == 21 ? 0 : searchView3.f286t.length());
                    searchView3.f286t.setListSelection(0);
                    searchView3.f286t.clearListSelection();
                    C0047k kVar = SearchView.f243u0;
                    SearchAutoComplete searchAutoComplete = searchView3.f286t;
                    Method method = kVar.f311c;
                    if (method != null) {
                        try {
                            method.invoke(searchAutoComplete, new Object[]{Boolean.valueOf(true)});
                        } catch (Exception unused) {
                        }
                    }
                    z = true;
                } else if (i == 19) {
                    int listSelection = searchView3.f286t.getListSelection();
                }
            }
            return z;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    public class C0044h implements OnEditorActionListener {
        public C0044h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.mo314g();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    public class C0045i implements OnItemClickListener {
        public C0045i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo306b(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    public class C0046j implements OnItemSelectedListener {
        public C0046j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo309c(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    public static class C0047k {

        /* renamed from: a */
        public Method f309a;

        /* renamed from: b */
        public Method f310b;

        /* renamed from: c */
        public Method f311c;

        public C0047k() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f309a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f310b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f311c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface C0048l {
        /* renamed from: a */
        boolean mo373a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface C0049m {
        /* renamed from: a */
        boolean mo374a(String str);

        /* renamed from: b */
        boolean mo375b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    public interface C0050n {
        /* renamed from: a */
        boolean mo376a(int i);

        /* renamed from: b */
        boolean mo377b(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    public static class C0051o extends C1458a {
        public static final Creator<C0051o> CREATOR = new C0052a();

        /* renamed from: g */
        public boolean f312g;

        /* renamed from: androidx.appcompat.widget.SearchView$o$a */
        public static class C0052a implements ClassLoaderCreator<C0051o> {
            public Object createFromParcel(Parcel parcel) {
                return new C0051o(parcel, null);
            }

            public Object[] newArray(int i) {
                return new C0051o[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0051o(parcel, classLoader);
            }
        }

        public C0051o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f312g = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public C0051o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder a = C1965a.m4756a("SearchView.SavedState{");
            a.append(Integer.toHexString(System.identityHashCode(this)));
            a.append(" isIconified=");
            a.append(this.f312g);
            a.append(Objects.ARRAY_END);
            return a.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f4274e, i);
            parcel.writeValue(Boolean.valueOf(this.f312g));
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    public static class C0053p extends TouchDelegate {

        /* renamed from: a */
        public final View f313a;

        /* renamed from: b */
        public final Rect f314b = new Rect();

        /* renamed from: c */
        public final Rect f315c = new Rect();

        /* renamed from: d */
        public final Rect f316d = new Rect();

        /* renamed from: e */
        public final int f317e;

        /* renamed from: f */
        public boolean f318f;

        public C0053p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f317e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo383a(rect, rect2);
            this.f313a = view;
        }

        /* renamed from: a */
        public void mo383a(Rect rect, Rect rect2) {
            this.f314b.set(rect);
            this.f316d.set(rect);
            Rect rect3 = this.f316d;
            int i = this.f317e;
            rect3.inset(-i, -i);
            this.f315c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0033
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003f
            L_0x001b:
                boolean r2 = r8.f318f
                r8.f318f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r8.f318f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r8.f316d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = r5
                goto L_0x0041
            L_0x002f:
                r7 = r4
                r4 = r2
                r2 = r7
                goto L_0x0041
            L_0x0033:
                android.graphics.Rect r2 = r8.f314b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003f
                r8.f318f = r4
                r2 = r4
                goto L_0x0041
            L_0x003f:
                r2 = r4
                r4 = r5
            L_0x0041:
                if (r4 == 0) goto L_0x0070
                if (r2 == 0) goto L_0x005d
                android.graphics.Rect r2 = r8.f315c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005d
                android.view.View r0 = r8.f313a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r8.f313a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                goto L_0x0066
            L_0x005d:
                android.graphics.Rect r2 = r8.f315c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x0066:
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                android.view.View r0 = r8.f313a
                boolean r5 = r0.dispatchTouchEvent(r9)
            L_0x0070:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0053p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1018a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f247D = new Rect();
        this.f248E = new Rect();
        this.f249F = new int[2];
        this.f250G = new int[2];
        this.f278l0 = new C0038b();
        this.f279m0 = new C0039c();
        this.f280n0 = new WeakHashMap<>();
        this.f281o0 = new C0042f();
        this.f282p0 = new C0043g();
        this.f283q0 = new C0044h();
        this.f284r0 = new C0045i();
        this.f285s0 = new C0046j();
        this.f287t0 = new C0037a();
        C1213u0 u0Var = new C1213u0(context, context.obtainStyledAttributes(attributeSet, C1027j.SearchView, i, 0));
        LayoutInflater.from(context).inflate(u0Var.mo5327g(C1027j.SearchView_layout, C1024g.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C1023f.search_src_text);
        this.f286t = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f288u = findViewById(C1023f.search_edit_frame);
        this.f289v = findViewById(C1023f.search_plate);
        this.f290w = findViewById(C1023f.submit_area);
        this.f291x = (ImageView) findViewById(C1023f.search_button);
        this.f292y = (ImageView) findViewById(C1023f.search_go_btn);
        this.f293z = (ImageView) findViewById(C1023f.search_close_btn);
        this.f244A = (ImageView) findViewById(C1023f.search_voice_btn);
        this.f251H = (ImageView) findViewById(C1023f.search_mag_icon);
        C1404o.m3522a(this.f289v, u0Var.mo5318b(C1027j.SearchView_queryBackground));
        this.f290w.setBackground(u0Var.mo5318b(C1027j.SearchView_submitBackground));
        this.f291x.setImageDrawable(u0Var.mo5318b(C1027j.SearchView_searchIcon));
        this.f292y.setImageDrawable(u0Var.mo5318b(C1027j.SearchView_goIcon));
        this.f293z.setImageDrawable(u0Var.mo5318b(C1027j.SearchView_closeIcon));
        this.f244A.setImageDrawable(u0Var.mo5318b(C1027j.SearchView_voiceIcon));
        this.f251H.setImageDrawable(u0Var.mo5318b(C1027j.SearchView_searchIcon));
        this.f252I = u0Var.mo5318b(C1027j.SearchView_searchHintIcon);
        C1061o.m2492a((View) this.f291x, (CharSequence) getResources().getString(C1025h.abc_searchview_description_search));
        this.f253J = u0Var.mo5327g(C1027j.SearchView_suggestionRowLayout, C1024g.abc_search_dropdown_item_icons_2line);
        this.f254K = u0Var.mo5327g(C1027j.SearchView_commitIcon, 0);
        this.f291x.setOnClickListener(this.f281o0);
        this.f293z.setOnClickListener(this.f281o0);
        this.f292y.setOnClickListener(this.f281o0);
        this.f244A.setOnClickListener(this.f281o0);
        this.f286t.setOnClickListener(this.f281o0);
        this.f286t.addTextChangedListener(this.f287t0);
        this.f286t.setOnEditorActionListener(this.f283q0);
        this.f286t.setOnItemClickListener(this.f284r0);
        this.f286t.setOnItemSelectedListener(this.f285s0);
        this.f286t.setOnKeyListener(this.f282p0);
        this.f286t.setOnFocusChangeListener(new C0040d());
        setIconifiedByDefault(u0Var.mo5316a(C1027j.SearchView_iconifiedByDefault, true));
        int c = u0Var.mo5319c(C1027j.SearchView_android_maxWidth, -1);
        if (c != -1) {
            setMaxWidth(c);
        }
        this.f257N = u0Var.mo5324e(C1027j.SearchView_defaultQueryHint);
        this.f267a0 = u0Var.mo5324e(C1027j.SearchView_queryHint);
        int d = u0Var.mo5321d(C1027j.SearchView_android_imeOptions, -1);
        if (d != -1) {
            setImeOptions(d);
        }
        int d2 = u0Var.mo5321d(C1027j.SearchView_android_inputType, -1);
        if (d2 != -1) {
            setInputType(d2);
        }
        setFocusable(u0Var.mo5316a(C1027j.SearchView_android_focusable, true));
        u0Var.f3426b.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f255L = intent;
        intent.addFlags(268435456);
        this.f255L.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f256M = intent2;
        intent2.addFlags(268435456);
        View findViewById = findViewById(this.f286t.getDropDownAnchor());
        this.f245B = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new C0041e());
        }
        mo305b(this.f263T);
        mo325j();
    }

    /* renamed from: a */
    public static boolean m106a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C1021d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C1021d.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f286t.setText(charSequence);
        this.f286t.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: a */
    public final Intent mo299a(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f277k0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: a */
    public final Intent mo300a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f273g0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f277k0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f276j0.getSearchActivity());
        return intent;
    }

    /* renamed from: a */
    public void mo301a() {
        if (!this.f274h0) {
            this.f274h0 = true;
            int imeOptions = this.f286t.getImeOptions();
            this.f275i0 = imeOptions;
            this.f286t.setImeOptions(imeOptions | 33554432);
            this.f286t.setText(Objects.EMPTY_STRING);
            setIconified(false);
        }
    }

    /* renamed from: a */
    public void mo302a(int i, String str, String str2) {
        getContext().startActivity(mo300a("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    /* renamed from: a */
    public void mo303a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r2.f271e0 == false) goto L_0x0023;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo304a(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f266W
            r1 = 0
            if (r0 == 0) goto L_0x0021
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.f271e0
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.f264U
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.f271e0
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r3 = r2.f292y
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.mo304a(boolean):void");
    }

    /* renamed from: b */
    public final void mo305b(boolean z) {
        this.f264U = z;
        int i = 0;
        boolean z2 = !TextUtils.isEmpty(this.f286t.getText());
        this.f291x.setVisibility(z ? 0 : 8);
        mo304a(z2);
        this.f288u.setVisibility(z ? 8 : 0);
        if (this.f251H.getDrawable() == null || this.f263T) {
            i = 8;
        }
        this.f251H.setVisibility(i);
        mo323h();
        mo308c(!z2);
        mo326k();
    }

    /* renamed from: b */
    public boolean mo306b(int i) {
        int i2;
        C0050n nVar = this.f261R;
        if (nVar != null && nVar.mo377b(i)) {
            return false;
        }
        String str = "SearchView";
        Cursor cursor = this.f265V.f4261g;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intent = null;
            try {
                String a = C1200o0.m2993a(cursor, "suggest_intent_action");
                if (a == null) {
                    a = this.f276j0.getSuggestIntentAction();
                }
                if (a == null) {
                    a = "android.intent.action.SEARCH";
                }
                String str2 = a;
                String a2 = C1200o0.m2992a(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (a2 == null) {
                    a2 = this.f276j0.getSuggestIntentData();
                }
                if (a2 != null) {
                    String a3 = C1200o0.m2992a(cursor, cursor.getColumnIndex("suggest_intent_data_id"));
                    if (a3 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(a2);
                        sb.append(Strings.FOLDER_SEPARATOR);
                        sb.append(Uri.encode(a3));
                        a2 = sb.toString();
                    }
                }
                Uri parse = a2 == null ? null : Uri.parse(a2);
                intent = mo300a(str2, parse, C1200o0.m2992a(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), C1200o0.m2992a(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, null);
            } catch (RuntimeException e) {
                try {
                    i2 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i2 = -1;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Search suggestions cursor at row ");
                sb2.append(i2);
                sb2.append(" returned exception.");
                Log.w(str, sb2.toString(), e);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e2) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Failed launch activity: ");
                    sb3.append(intent);
                    Log.e(str, sb3.toString(), e2);
                }
            }
        }
        this.f286t.setImeVisibility(false);
        this.f286t.dismissDropDown();
        return true;
    }

    /* renamed from: c */
    public void mo307c() {
        SearchAutoComplete searchAutoComplete = this.f286t;
        String str = Objects.EMPTY_STRING;
        searchAutoComplete.setText(str);
        SearchAutoComplete searchAutoComplete2 = this.f286t;
        searchAutoComplete2.setSelection(searchAutoComplete2.length());
        this.f273g0 = str;
        clearFocus();
        mo305b(true);
        this.f286t.setImeOptions(this.f275i0);
        this.f274h0 = false;
    }

    public void clearFocus() {
        this.f269c0 = true;
        super.clearFocus();
        this.f286t.clearFocus();
        this.f286t.setImeVisibility(false);
        this.f269c0 = false;
    }

    /* renamed from: d */
    public void mo311d() {
        if (VERSION.SDK_INT >= 29) {
            this.f286t.refreshAutoCompleteResults();
            return;
        }
        C0047k kVar = f243u0;
        SearchAutoComplete searchAutoComplete = this.f286t;
        Method method = kVar.f309a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        C0047k kVar2 = f243u0;
        SearchAutoComplete searchAutoComplete2 = this.f286t;
        Method method2 = kVar2.f310b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: e */
    public void mo312e() {
        if (!TextUtils.isEmpty(this.f286t.getText())) {
            this.f286t.setText(Objects.EMPTY_STRING);
            this.f286t.requestFocus();
            this.f286t.setImeVisibility(true);
        } else if (this.f263T) {
            C0048l lVar = this.f259P;
            if (lVar == null || !lVar.mo373a()) {
                clearFocus();
                mo305b(true);
            }
        }
    }

    /* renamed from: f */
    public void mo313f() {
        mo305b(false);
        this.f286t.requestFocus();
        this.f286t.setImeVisibility(true);
        OnClickListener onClickListener = this.f262S;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: g */
    public void mo314g() {
        Editable text = this.f286t.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0049m mVar = this.f258O;
            if (mVar == null || !mVar.mo375b(text.toString())) {
                if (this.f276j0 != null) {
                    mo302a(0, null, text.toString());
                }
                this.f286t.setImeVisibility(false);
                this.f286t.dismissDropDown();
            }
        }
    }

    public int getImeOptions() {
        return this.f286t.getImeOptions();
    }

    public int getInputType() {
        return this.f286t.getInputType();
    }

    public int getMaxWidth() {
        return this.f270d0;
    }

    public CharSequence getQuery() {
        return this.f286t.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f267a0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f276j0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f257N : getContext().getText(this.f276j0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f254K;
    }

    public int getSuggestionRowLayout() {
        return this.f253J;
    }

    public C1452a getSuggestionsAdapter() {
        return this.f265V;
    }

    /* renamed from: h */
    public final void mo323h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f286t.getText());
        int i = 0;
        if (!z2 && (!this.f263T || this.f274h0)) {
            z = false;
        }
        ImageView imageView = this.f293z;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f293z.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: i */
    public void mo324i() {
        int[] iArr = this.f286t.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f289v.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f290w.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: j */
    public final void mo325j() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f286t;
        if (queryHint == 0) {
            queryHint = Objects.EMPTY_STRING;
        }
        if (this.f263T && this.f252I != null) {
            int textSize = (int) (((double) this.f286t.getTextSize()) * 1.25d);
            this.f252I.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f252I), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    /* renamed from: k */
    public final void mo326k() {
        int i = 0;
        if (!((this.f266W || this.f271e0) && !this.f264U) || !(this.f292y.getVisibility() == 0 || this.f244A.getVisibility() == 0)) {
            i = 8;
        }
        this.f290w.setVisibility(i);
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.f278l0);
        post(this.f279m0);
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f286t;
            Rect rect = this.f247D;
            searchAutoComplete.getLocationInWindow(this.f249F);
            getLocationInWindow(this.f250G);
            int[] iArr = this.f249F;
            int i5 = iArr[1];
            int[] iArr2 = this.f250G;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            Rect rect2 = this.f248E;
            Rect rect3 = this.f247D;
            rect2.set(rect3.left, 0, rect3.right, i4 - i2);
            C0053p pVar = this.f246C;
            if (pVar == null) {
                C0053p pVar2 = new C0053p(this.f248E, this.f247D, this.f286t);
                this.f246C = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.mo383a(this.f248E, this.f247D);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 > 0) goto L_0x0033;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.f264U
            if (r0 == 0) goto L_0x0008
            super.onMeasure(r4, r5)
            return
        L_0x0008:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002a
            if (r0 == 0) goto L_0x0020
            if (r0 == r2) goto L_0x001b
            goto L_0x0037
        L_0x001b:
            int r0 = r3.f270d0
            if (r0 <= 0) goto L_0x0037
            goto L_0x002e
        L_0x0020:
            int r4 = r3.f270d0
            if (r4 <= 0) goto L_0x0025
            goto L_0x0037
        L_0x0025:
            int r4 = r3.getPreferredWidth()
            goto L_0x0037
        L_0x002a:
            int r0 = r3.f270d0
            if (r0 <= 0) goto L_0x002f
        L_0x002e:
            goto L_0x0033
        L_0x002f:
            int r0 = r3.getPreferredWidth()
        L_0x0033:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0037:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x0049
            if (r0 == 0) goto L_0x0044
            goto L_0x0051
        L_0x0044:
            int r5 = r3.getPreferredHeight()
            goto L_0x0051
        L_0x0049:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0051:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0051o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0051o oVar = (C0051o) parcelable;
        super.onRestoreInstanceState(oVar.f4274e);
        mo305b(oVar.f312g);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C0051o oVar = new C0051o(super.onSaveInstanceState());
        oVar.f312g = this.f264U;
        return oVar;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f278l0);
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f269c0 || !isFocusable()) {
            return false;
        }
        if (this.f264U) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f286t.requestFocus(i, rect);
        if (requestFocus) {
            mo305b(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f277k0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo312e();
        } else {
            mo313f();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f263T != z) {
            this.f263T = z;
            mo305b(z);
            mo325j();
        }
    }

    public void setImeOptions(int i) {
        this.f286t.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f286t.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f270d0 = i;
        requestLayout();
    }

    public void setOnCloseListener(C0048l lVar) {
        this.f259P = lVar;
    }

    public void setOnQueryTextFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.f260Q = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0049m mVar) {
        this.f258O = mVar;
    }

    public void setOnSearchClickListener(OnClickListener onClickListener) {
        this.f262S = onClickListener;
    }

    public void setOnSuggestionListener(C0050n nVar) {
        this.f261R = nVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f267a0 = charSequence;
        mo325j();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f268b0 = z;
        C1452a aVar = this.f265V;
        if (aVar instanceof C1200o0) {
            ((C1200o0) aVar).f3387v = z ? 2 : 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f276j0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L_0x006e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f286t
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f286t
            android.app.SearchableInfo r3 = r6.f276j0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.f276j0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L_0x0036
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f276j0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L_0x0036
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L_0x0036:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f286t
            r3.setInputType(r7)
            p.i.a.a r7 = r6.f265V
            if (r7 == 0) goto L_0x0042
            r7.mo5277a(r2)
        L_0x0042:
            android.app.SearchableInfo r7 = r6.f276j0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L_0x006b
            p.b.q.o0 r7 = new p.b.q.o0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f276j0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.f280n0
            r7.<init>(r3, r6, r4, r5)
            r6.f265V = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f286t
            r3.setAdapter(r7)
            p.i.a.a r7 = r6.f265V
            p.b.q.o0 r7 = (p124p.p126b.p136q.C1200o0) r7
            boolean r3 = r6.f268b0
            if (r3 == 0) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = r0
        L_0x0069:
            r7.f3387v = r3
        L_0x006b:
            r6.mo325j()
        L_0x006e:
            android.app.SearchableInfo r7 = r6.f276j0
            r3 = 0
            if (r7 == 0) goto L_0x009f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L_0x009f
            android.app.SearchableInfo r7 = r6.f276j0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L_0x0084
            android.content.Intent r2 = r6.f255L
            goto L_0x008e
        L_0x0084:
            android.app.SearchableInfo r7 = r6.f276j0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L_0x008e
            android.content.Intent r2 = r6.f256M
        L_0x008e:
            if (r2 == 0) goto L_0x009f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r0 = r3
        L_0x00a0:
            r6.f271e0 = r0
            if (r0 == 0) goto L_0x00ab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f286t
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        L_0x00ab:
            boolean r7 = r6.f264U
            r6.mo305b(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f266W = z;
        mo305b(this.f264U);
    }

    public void setSuggestionsAdapter(C1452a aVar) {
        this.f265V = aVar;
        this.f286t.setAdapter(aVar);
    }

    /* renamed from: c */
    public boolean mo309c(int i) {
        C0050n nVar = this.f261R;
        if (nVar != null && nVar.mo376a(i)) {
            return false;
        }
        Editable text = this.f286t.getText();
        Cursor cursor = this.f265V.f4261g;
        if (cursor != null) {
            if (cursor.moveToPosition(i)) {
                CharSequence b = this.f265V.mo5279b(cursor);
                if (b != null) {
                    setQuery(b);
                }
            }
            setQuery(text);
        }
        return true;
    }

    /* renamed from: c */
    public final void mo308c(boolean z) {
        int i = 8;
        if (this.f271e0 && !this.f264U && z) {
            this.f292y.setVisibility(8);
            i = 0;
        }
        this.f244A.setVisibility(i);
    }
}
