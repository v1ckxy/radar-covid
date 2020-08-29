package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import p124p.p126b.p127k.C1061o;
import p124p.p150h.p151d.C1323k;
import p124p.p170k.p171a.C1479c0;
import p124p.p170k.p171a.C1482e;
import p124p.p170k.p171a.C1482e.C1483a;
import p124p.p170k.p171a.C1486h;
import p124p.p170k.p171a.C1487i;
import p124p.p170k.p171a.C1488j;
import p124p.p170k.p171a.C1490k;
import p124p.p170k.p171a.C1490k.C1500j;
import p124p.p170k.p171a.C1507p;
import p124p.p177n.C1537e;
import p124p.p177n.C1537e.C1538a;
import p124p.p177n.C1537e.C1539b;
import p124p.p177n.C1540f;
import p124p.p177n.C1541g;
import p124p.p177n.C1542h;
import p124p.p177n.C1543i;
import p124p.p177n.C1549n;
import p124p.p177n.C1559v;
import p124p.p177n.C1560w;
import p124p.p185r.C1657a;
import p124p.p185r.C1660b;
import p124p.p185r.C1661c;
import p213q.p214a.p215a.p216a.C1965a;

public class Fragment implements ComponentCallbacks, OnCreateContextMenuListener, C1542h, C1560w, C1661c {

    /* renamed from: a0 */
    public static final Object f583a0 = new Object();

    /* renamed from: A */
    public int f584A;

    /* renamed from: B */
    public String f585B;

    /* renamed from: C */
    public boolean f586C;

    /* renamed from: D */
    public boolean f587D;

    /* renamed from: E */
    public boolean f588E;

    /* renamed from: F */
    public boolean f589F;

    /* renamed from: G */
    public boolean f590G;

    /* renamed from: H */
    public boolean f591H;

    /* renamed from: I */
    public boolean f592I;

    /* renamed from: J */
    public ViewGroup f593J;

    /* renamed from: K */
    public View f594K;

    /* renamed from: L */
    public View f595L;

    /* renamed from: M */
    public boolean f596M;

    /* renamed from: N */
    public boolean f597N;

    /* renamed from: O */
    public C0083b f598O;

    /* renamed from: P */
    public boolean f599P;

    /* renamed from: Q */
    public boolean f600Q;

    /* renamed from: R */
    public float f601R;

    /* renamed from: S */
    public LayoutInflater f602S;

    /* renamed from: T */
    public boolean f603T;

    /* renamed from: U */
    public C1539b f604U;

    /* renamed from: V */
    public C1543i f605V;

    /* renamed from: W */
    public C1479c0 f606W;

    /* renamed from: X */
    public C1549n<C1542h> f607X;

    /* renamed from: Y */
    public C1660b f608Y;

    /* renamed from: Z */
    public int f609Z;

    /* renamed from: e */
    public int f610e;

    /* renamed from: f */
    public Bundle f611f;

    /* renamed from: g */
    public SparseArray<Parcelable> f612g;

    /* renamed from: h */
    public Boolean f613h;

    /* renamed from: i */
    public String f614i;

    /* renamed from: j */
    public Bundle f615j;

    /* renamed from: k */
    public Fragment f616k;

    /* renamed from: l */
    public String f617l;

    /* renamed from: m */
    public int f618m;

    /* renamed from: n */
    public Boolean f619n;

    /* renamed from: o */
    public boolean f620o;

    /* renamed from: p */
    public boolean f621p;

    /* renamed from: q */
    public boolean f622q;

    /* renamed from: r */
    public boolean f623r;

    /* renamed from: s */
    public boolean f624s;

    /* renamed from: t */
    public boolean f625t;

    /* renamed from: u */
    public int f626u;

    /* renamed from: v */
    public C1490k f627v;

    /* renamed from: w */
    public C1487i f628w;

    /* renamed from: x */
    public C1490k f629x;

    /* renamed from: y */
    public Fragment f630y;

    /* renamed from: z */
    public int f631z;

    /* renamed from: androidx.fragment.app.Fragment$a */
    public class C0082a implements Runnable {
        public C0082a() {
        }

        public void run() {
            Fragment.this.mo775O();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    public static class C0083b {

        /* renamed from: a */
        public View f634a;

        /* renamed from: b */
        public Animator f635b;

        /* renamed from: c */
        public int f636c;

        /* renamed from: d */
        public int f637d;

        /* renamed from: e */
        public int f638e;

        /* renamed from: f */
        public int f639f;

        /* renamed from: g */
        public Object f640g = null;

        /* renamed from: h */
        public Object f641h;

        /* renamed from: i */
        public Object f642i;

        /* renamed from: j */
        public Object f643j;

        /* renamed from: k */
        public Object f644k;

        /* renamed from: l */
        public Object f645l;

        /* renamed from: m */
        public Boolean f646m;

        /* renamed from: n */
        public Boolean f647n;

        /* renamed from: o */
        public C1323k f648o;

        /* renamed from: p */
        public C1323k f649p;

        /* renamed from: q */
        public boolean f650q;

        /* renamed from: r */
        public C0085d f651r;

        /* renamed from: s */
        public boolean f652s;

        public C0083b() {
            Object obj = Fragment.f583a0;
            this.f641h = obj;
            this.f642i = null;
            this.f643j = obj;
            this.f644k = null;
            this.f645l = obj;
            this.f648o = null;
            this.f649p = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    public static class C0084c extends RuntimeException {
        public C0084c(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    public interface C0085d {
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.fragment.app.Fragment$e */
    public static class C0086e implements Parcelable {
        public static final Creator<C0086e> CREATOR = new C0087a();

        /* renamed from: e */
        public final Bundle f653e;

        /* renamed from: androidx.fragment.app.Fragment$e$a */
        public static class C0087a implements ClassLoaderCreator<C0086e> {
            public Object createFromParcel(Parcel parcel) {
                return new C0086e(parcel, null);
            }

            public Object[] newArray(int i) {
                return new C0086e[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0086e(parcel, classLoader);
            }
        }

        public C0086e(Bundle bundle) {
            this.f653e = bundle;
        }

        public C0086e(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f653e = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f653e);
        }
    }

    public Fragment() {
        this.f610e = 0;
        this.f614i = UUID.randomUUID().toString();
        this.f617l = null;
        this.f619n = null;
        this.f629x = new C1490k();
        this.f591H = true;
        this.f597N = true;
        this.f604U = C1539b.RESUMED;
        this.f607X = new C1549n<>();
        mo806d0();
    }

    public Fragment(int i) {
        this();
        this.f609Z = i;
    }

    @Deprecated
    /* renamed from: a */
    public static Fragment m262a(Context context, String str, Bundle bundle) {
        String str2 = ": make sure class name exists, is public, and has an empty constructor that is public";
        String str3 = "Unable to instantiate fragment ";
        try {
            Fragment fragment = (Fragment) C1486h.m3772d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.mo807e(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            throw new C0084c(C1965a.m4752a(str3, str, str2), e);
        } catch (IllegalAccessException e2) {
            throw new C0084c(C1965a.m4752a(str3, str, str2), e2);
        } catch (NoSuchMethodException e3) {
            throw new C0084c(C1965a.m4752a(str3, str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new C0084c(C1965a.m4752a(str3, str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    /* renamed from: G */
    public C1559v mo1G() {
        C1490k kVar = this.f627v;
        if (kVar != null) {
            C1507p pVar = kVar.f4379I;
            C1559v vVar = (C1559v) pVar.f4440d.get(this.f614i);
            if (vVar != null) {
                return vVar;
            }
            C1559v vVar2 = new C1559v();
            pVar.f4440d.put(this.f614i, vVar2);
            return vVar2;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* renamed from: O */
    public void mo775O() {
        C0083b bVar = this.f598O;
        Object obj = null;
        if (bVar != null) {
            bVar.f650q = false;
            Object obj2 = bVar.f651r;
            bVar.f651r = null;
            obj = obj2;
        }
        if (obj != null) {
            C1500j jVar = (C1500j) obj;
            int i = jVar.f4420c - 1;
            jVar.f4420c = i;
            if (i == 0) {
                jVar.f4419b.f4316r.mo6162o();
            }
        }
    }

    /* renamed from: P */
    public final C0083b mo776P() {
        if (this.f598O == null) {
            this.f598O = new C0083b();
        }
        return this.f598O;
    }

    /* renamed from: Q */
    public final C1482e mo777Q() {
        C1487i iVar = this.f628w;
        if (iVar == null) {
            return null;
        }
        return (C1482e) iVar.f4361e;
    }

    /* renamed from: R */
    public View mo778R() {
        C0083b bVar = this.f598O;
        if (bVar == null) {
            return null;
        }
        return bVar.f634a;
    }

    /* renamed from: S */
    public Animator mo779S() {
        C0083b bVar = this.f598O;
        if (bVar == null) {
            return null;
        }
        return bVar.f635b;
    }

    /* renamed from: T */
    public final C1488j mo780T() {
        if (this.f628w != null) {
            return this.f629x;
        }
        throw new IllegalStateException(C1965a.m4749a("Fragment ", this, " has not been attached yet."));
    }

    /* renamed from: U */
    public Context mo781U() {
        C1487i iVar = this.f628w;
        if (iVar == null) {
            return null;
        }
        return iVar.f4362f;
    }

    /* renamed from: V */
    public Object mo782V() {
        C0083b bVar = this.f598O;
        if (bVar == null) {
            return null;
        }
        return bVar.f640g;
    }

    /* renamed from: W */
    public Object mo783W() {
        C0083b bVar = this.f598O;
        if (bVar == null) {
            return null;
        }
        return bVar.f642i;
    }

    /* renamed from: X */
    public int mo784X() {
        C0083b bVar = this.f598O;
        if (bVar == null) {
            return 0;
        }
        return bVar.f637d;
    }

    /* renamed from: Y */
    public int mo785Y() {
        C0083b bVar = this.f598O;
        if (bVar == null) {
            return 0;
        }
        return bVar.f638e;
    }

    /* renamed from: Z */
    public int mo786Z() {
        C0083b bVar = this.f598O;
        if (bVar == null) {
            return 0;
        }
        return bVar.f639f;
    }

    /* renamed from: a */
    public View mo787a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f609Z;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* renamed from: a */
    public void mo788a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public void mo789a(Animator animator) {
        mo776P().f635b = animator;
    }

    /* renamed from: a */
    public void mo790a(Context context) {
        this.f592I = true;
        C1487i iVar = this.f628w;
        if ((iVar == null ? null : iVar.f4361e) != null) {
            this.f592I = false;
            this.f592I = true;
        }
    }

    /* renamed from: a */
    public void mo792a(Bundle bundle) {
        this.f592I = true;
    }

    /* renamed from: a */
    public void mo794a(View view) {
        mo776P().f634a = view;
    }

    /* renamed from: a */
    public void mo795a(View view, Bundle bundle) {
    }

    /* renamed from: a0 */
    public final Resources mo797a0() {
        Context U = mo781U();
        if (U != null) {
            return U.getResources();
        }
        throw new IllegalStateException(C1965a.m4749a("Fragment ", this, " not attached to a context."));
    }

    /* renamed from: b */
    public final String mo798b(int i) {
        return mo797a0().getString(i);
    }

    /* renamed from: b */
    public void mo799b(Bundle bundle) {
        boolean z = true;
        this.f592I = true;
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                this.f629x.mo6101a(parcelable);
                this.f629x.mo6147g();
            }
        }
        if (this.f629x.f4393s < 1) {
            z = false;
        }
        if (!z) {
            this.f629x.mo6147g();
        }
    }

    /* renamed from: b0 */
    public Object mo801b0() {
        C0083b bVar = this.f598O;
        if (bVar == null) {
            return null;
        }
        return bVar.f644k;
    }

    /* renamed from: c */
    public LayoutInflater mo802c(Bundle bundle) {
        C1487i iVar = this.f628w;
        if (iVar != null) {
            C1483a aVar = (C1483a) iVar;
            LayoutInflater cloneInContext = C1482e.this.getLayoutInflater().cloneInContext(C1482e.this);
            C1490k kVar = this.f629x;
            if (kVar != null) {
                cloneInContext.setFactory2(kVar);
                return cloneInContext;
            }
            throw null;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: c */
    public void mo803c(int i) {
        if (this.f598O != null || i != 0) {
            mo776P().f637d = i;
        }
    }

    /* renamed from: c0 */
    public int mo804c0() {
        C0083b bVar = this.f598O;
        if (bVar == null) {
            return 0;
        }
        return bVar.f636c;
    }

    /* renamed from: d */
    public void mo805d(Bundle bundle) {
    }

    /* renamed from: d0 */
    public final void mo806d0() {
        this.f605V = new C1543i(this);
        this.f608Y = new C1660b(this);
        this.f605V.mo6227a((C1541g) new C1540f() {
            /* renamed from: a */
            public void mo9a(C1542h hVar, C1538a aVar) {
                if (aVar == C1538a.ON_STOP) {
                    View view = Fragment.this.f594K;
                    if (view != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            }
        });
    }

    /* renamed from: e */
    public void mo807e(Bundle bundle) {
        C1490k kVar = this.f627v;
        if (kVar != null) {
            if (kVar == null ? false : kVar.mo6094b()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f615j = bundle;
    }

    /* renamed from: e */
    public void mo808e(boolean z) {
        mo776P().f652s = z;
    }

    /* renamed from: e0 */
    public final boolean mo809e0() {
        return this.f628w != null && this.f620o;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f0 */
    public boolean mo811f0() {
        C0083b bVar = this.f598O;
        if (bVar == null) {
            return false;
        }
        return bVar.f652s;
    }

    /* renamed from: g */
    public C1537e mo2g() {
        return this.f605V;
    }

    /* renamed from: g0 */
    public final boolean mo812g0() {
        return this.f626u > 0;
    }

    /* renamed from: h0 */
    public void mo813h0() {
        this.f592I = true;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i0 */
    public void mo815i0() {
        this.f592I = true;
    }

    /* renamed from: j */
    public final C1657a mo4j() {
        return this.f608Y.f4897b;
    }

    /* renamed from: j0 */
    public void mo816j0() {
        this.f592I = true;
    }

    /* renamed from: k0 */
    public void mo817k0() {
        this.f592I = true;
    }

    /* renamed from: l0 */
    public void mo818l0() {
        this.f592I = true;
    }

    /* renamed from: m0 */
    public void mo819m0() {
        this.f592I = true;
    }

    /* renamed from: n0 */
    public void mo820n0() {
        this.f592I = true;
    }

    /* renamed from: o0 */
    public final C1488j mo821o0() {
        C1490k kVar = this.f627v;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalStateException(C1965a.m4749a("Fragment ", this, " not associated with a fragment manager."));
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f592I = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        C1482e Q = mo777Q();
        if (Q != null) {
            Q.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException(C1965a.m4749a("Fragment ", this, " not attached to an activity."));
    }

    public void onLowMemory() {
        this.f592I = true;
    }

    /* renamed from: p0 */
    public final View mo825p0() {
        View view = this.f594K;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(C1965a.m4749a("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    /* renamed from: q0 */
    public void mo826q0() {
        C1490k kVar = this.f627v;
        if (kVar == null || kVar.f4394t == null) {
            mo776P().f650q = false;
        } else if (Looper.myLooper() != this.f627v.f4394t.f4363g.getLooper()) {
            this.f627v.f4394t.f4363g.postAtFrontOfQueue(new C0082a());
        } else {
            mo775O();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C1061o.m2496a((Object) this, sb);
        sb.append(" (");
        sb.append(this.f614i);
        sb.append(")");
        if (this.f631z != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f631z));
        }
        if (this.f585B != null) {
            sb.append(" ");
            sb.append(this.f585B);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public void mo793a(AttributeSet attributeSet, Bundle bundle) {
        this.f592I = true;
        C1487i iVar = this.f628w;
        if ((iVar == null ? null : iVar.f4361e) != null) {
            this.f592I = false;
            this.f592I = true;
        }
    }

    /* renamed from: b */
    public void mo800b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f629x.mo6160m();
        boolean z = true;
        this.f625t = true;
        this.f606W = new C1479c0();
        View a = mo787a(layoutInflater, viewGroup, bundle);
        this.f594K = a;
        if (a != null) {
            C1479c0 c0Var = this.f606W;
            if (c0Var.f4348e == null) {
                c0Var.f4348e = new C1543i(c0Var);
            }
            this.f607X.mo840b(this.f606W);
            return;
        }
        if (this.f606W.f4348e == null) {
            z = false;
        }
        if (!z) {
            this.f606W = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    /* renamed from: a */
    public void mo796a(C0085d dVar) {
        mo776P();
        C0085d dVar2 = this.f598O.f651r;
        if (dVar != dVar2) {
            if (dVar == null || dVar2 == null) {
                C0083b bVar = this.f598O;
                if (bVar.f650q) {
                    bVar.f651r = dVar;
                }
                if (dVar != null) {
                    C1500j jVar = (C1500j) dVar;
                    jVar.f4420c++;
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to set a replacement startPostponedEnterTransition on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo791a(@SuppressLint({"UnknownNullness"}) Intent intent) {
        C1487i iVar = this.f628w;
        if (iVar != null) {
            iVar.mo6084a(this, intent, -1, null);
            return;
        }
        throw new IllegalStateException(C1965a.m4749a("Fragment ", this, " not attached to Activity"));
    }
}
