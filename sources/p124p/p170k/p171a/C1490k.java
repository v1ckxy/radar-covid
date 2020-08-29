package p124p.p170k.p171a;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment.C0083b;
import androidx.fragment.app.Fragment.C0085d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p124p.p125a.C1015a;
import p124p.p125a.C1016b;
import p124p.p126b.p127k.C1061o;
import p124p.p143e.C1251c;
import p124p.p150h.p161k.C1382b;
import p124p.p150h.p162l.C1402m;
import p124p.p170k.p171a.C1488j.C1489a;
import p124p.p170k.p171a.C1511r.C1512a;
import p124p.p177n.C1537e.C1539b;
import p124p.p178o.p179a.C1561a;
import p124p.p196x.p197b.C1770b;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.k.a.k */
public final class C1490k extends C1488j implements Factory2 {

    /* renamed from: K */
    public static boolean f4368K = false;

    /* renamed from: L */
    public static final Interpolator f4369L = new DecelerateInterpolator(2.5f);

    /* renamed from: M */
    public static final Interpolator f4370M = new DecelerateInterpolator(1.5f);

    /* renamed from: A */
    public boolean f4371A;

    /* renamed from: B */
    public boolean f4372B;

    /* renamed from: C */
    public ArrayList<C1472a> f4373C;

    /* renamed from: D */
    public ArrayList<Boolean> f4374D;

    /* renamed from: E */
    public ArrayList<Fragment> f4375E;

    /* renamed from: F */
    public Bundle f4376F = null;

    /* renamed from: G */
    public SparseArray<Parcelable> f4377G = null;

    /* renamed from: H */
    public ArrayList<C1500j> f4378H;

    /* renamed from: I */
    public C1507p f4379I;

    /* renamed from: J */
    public Runnable f4380J = new C1492b();

    /* renamed from: g */
    public ArrayList<C1498h> f4381g;

    /* renamed from: h */
    public boolean f4382h;

    /* renamed from: i */
    public int f4383i = 0;

    /* renamed from: j */
    public final ArrayList<Fragment> f4384j = new ArrayList<>();

    /* renamed from: k */
    public final HashMap<String, Fragment> f4385k = new HashMap<>();

    /* renamed from: l */
    public ArrayList<C1472a> f4386l;

    /* renamed from: m */
    public ArrayList<Fragment> f4387m;

    /* renamed from: n */
    public OnBackPressedDispatcher f4388n;

    /* renamed from: o */
    public final C1016b f4389o = new C1491a(false);

    /* renamed from: p */
    public ArrayList<C1472a> f4390p;

    /* renamed from: q */
    public ArrayList<Integer> f4391q;

    /* renamed from: r */
    public final CopyOnWriteArrayList<C1496f> f4392r = new CopyOnWriteArrayList<>();

    /* renamed from: s */
    public int f4393s = 0;

    /* renamed from: t */
    public C1487i f4394t;

    /* renamed from: u */
    public C1484f f4395u;

    /* renamed from: v */
    public Fragment f4396v;

    /* renamed from: w */
    public Fragment f4397w;

    /* renamed from: x */
    public boolean f4398x;

    /* renamed from: y */
    public boolean f4399y;

    /* renamed from: z */
    public boolean f4400z;

    /* renamed from: p.k.a.k$a */
    public class C1491a extends C1016b {
        public C1491a(boolean z) {
            super(z);
        }
    }

    /* renamed from: p.k.a.k$b */
    public class C1492b implements Runnable {
        public C1492b() {
        }

        public void run() {
            C1490k.this.mo6158k();
        }
    }

    /* renamed from: p.k.a.k$c */
    public class C1493c extends C1486h {
        public C1493c() {
        }

        /* renamed from: a */
        public Fragment mo6086a(ClassLoader classLoader, String str) {
            C1487i iVar = C1490k.this.f4394t;
            Context context = iVar.f4362f;
            if (iVar != null) {
                return Fragment.m262a(context, str, (Bundle) null);
            }
            throw null;
        }
    }

    /* renamed from: p.k.a.k$d */
    public static class C1494d {

        /* renamed from: a */
        public final Animation f4404a;

        /* renamed from: b */
        public final Animator f4405b;

        public C1494d(Animator animator) {
            this.f4404a = null;
            this.f4405b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        public C1494d(Animation animation) {
            this.f4404a = animation;
            this.f4405b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: p.k.a.k$e */
    public static class C1495e extends AnimationSet implements Runnable {

        /* renamed from: e */
        public final ViewGroup f4406e;

        /* renamed from: f */
        public final View f4407f;

        /* renamed from: g */
        public boolean f4408g;

        /* renamed from: h */
        public boolean f4409h;

        /* renamed from: i */
        public boolean f4410i = true;

        public C1495e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f4406e = viewGroup;
            this.f4407f = view;
            addAnimation(animation);
            this.f4406e.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f4410i = true;
            if (this.f4408g) {
                return !this.f4409h;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f4408g = true;
                C1402m.m3504a(this.f4406e, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f4410i = true;
            if (this.f4408g) {
                return !this.f4409h;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f4408g = true;
                C1402m.m3504a(this.f4406e, this);
            }
            return true;
        }

        public void run() {
            if (this.f4408g || !this.f4410i) {
                this.f4406e.endViewTransition(this.f4407f);
                this.f4409h = true;
                return;
            }
            this.f4410i = false;
            this.f4406e.post(this);
        }
    }

    /* renamed from: p.k.a.k$f */
    public static final class C1496f {

        /* renamed from: a */
        public final C1489a f4411a;

        /* renamed from: b */
        public final boolean f4412b;

        public C1496f(C1489a aVar, boolean z) {
            this.f4411a = aVar;
            this.f4412b = z;
        }
    }

    /* renamed from: p.k.a.k$g */
    public static class C1497g {

        /* renamed from: a */
        public static final int[] f4413a = {16842755, 16842960, 16842961};
    }

    /* renamed from: p.k.a.k$h */
    public interface C1498h {
        /* renamed from: a */
        boolean mo6032a(ArrayList<C1472a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: p.k.a.k$i */
    public class C1499i implements C1498h {

        /* renamed from: a */
        public final String f4414a;

        /* renamed from: b */
        public final int f4415b;

        /* renamed from: c */
        public final int f4416c;

        public C1499i(String str, int i, int i2) {
            this.f4414a = str;
            this.f4415b = i;
            this.f4416c = i2;
        }

        /* renamed from: a */
        public boolean mo6032a(ArrayList<C1472a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = C1490k.this.f4397w;
            if (fragment != null && this.f4415b < 0 && this.f4414a == null && fragment.mo780T().mo6095c()) {
                return false;
            }
            return C1490k.this.mo6120a(arrayList, arrayList2, this.f4414a, this.f4415b, this.f4416c);
        }
    }

    /* renamed from: p.k.a.k$j */
    public static class C1500j implements C0085d {

        /* renamed from: a */
        public final boolean f4418a;

        /* renamed from: b */
        public final C1472a f4419b;

        /* renamed from: c */
        public int f4420c;

        public C1500j(C1472a aVar, boolean z) {
            this.f4418a = z;
            this.f4419b = aVar;
        }

        /* renamed from: a */
        public void mo6172a() {
            boolean z = this.f4420c > 0;
            C1490k kVar = this.f4419b.f4316r;
            int size = kVar.f4384j.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) kVar.f4384j.get(i);
                fragment.mo796a((C0085d) null);
                if (z) {
                    C0083b bVar = fragment.f598O;
                    if (bVar == null ? false : bVar.f650q) {
                        fragment.mo826q0();
                    }
                }
            }
            C1472a aVar = this.f4419b;
            aVar.f4316r.mo6114a(aVar, this.f4418a, !z, true);
        }
    }

    /* renamed from: a */
    public static C1494d m3784a(float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f4369L);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f4370M);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new C1494d((Animation) animationSet);
    }

    /* renamed from: d */
    public static int m3785d(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: a */
    public int mo6096a(C1472a aVar) {
        synchronized (this) {
            if (this.f4391q != null) {
                if (this.f4391q.size() > 0) {
                    int intValue = ((Integer) this.f4391q.remove(this.f4391q.size() - 1)).intValue();
                    this.f4390p.set(intValue, aVar);
                    return intValue;
                }
            }
            if (this.f4390p == null) {
                this.f4390p = new ArrayList<>();
            }
            int size = this.f4390p.size();
            this.f4390p.add(aVar);
            return size;
        }
    }

    /* renamed from: a */
    public Fragment mo6087a(int i) {
        for (int size = this.f4384j.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f4384j.get(size);
            if (fragment != null && fragment.f631z == i) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.f4385k.values()) {
            if (fragment2 != null && fragment2.f631z == i) {
                return fragment2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public Fragment mo6088a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = (Fragment) this.f4385k.get(string);
        if (fragment != null) {
            return fragment;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment no longer exists for key ");
        sb.append(str);
        sb.append(": unique id ");
        sb.append(string);
        mo6110a((RuntimeException) new IllegalStateException(sb.toString()));
        throw null;
    }

    /* renamed from: a */
    public Fragment mo6089a(String str) {
        if (str != null) {
            for (int size = this.f4384j.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f4384j.get(size);
                if (fragment != null && str.equals(fragment.f585B)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (Fragment fragment2 : this.f4385k.values()) {
                if (fragment2 != null && str.equals(fragment2.f585B)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public List<Fragment> mo6090a() {
        List<Fragment> list;
        if (this.f4384j.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f4384j) {
            list = (List) this.f4384j.clone();
        }
        return list;
    }

    /* renamed from: a */
    public void mo6098a(int i, C1472a aVar) {
        synchronized (this) {
            if (this.f4390p == null) {
                this.f4390p = new ArrayList<>();
            }
            int size = this.f4390p.size();
            if (i < size) {
                this.f4390p.set(i, aVar);
            } else {
                while (size < i) {
                    this.f4390p.add(null);
                    if (this.f4391q == null) {
                        this.f4391q = new ArrayList<>();
                    }
                    this.f4391q.add(Integer.valueOf(size));
                    size++;
                }
                this.f4390p.add(aVar);
            }
        }
    }

    /* renamed from: a */
    public void mo6091a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f627v == this) {
            bundle.putString(str, fragment.f614i);
        } else {
            mo6110a((RuntimeException) new IllegalStateException(C1965a.m4749a("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    /* renamed from: a */
    public void mo6103a(Fragment fragment) {
        if (fragment.f587D) {
            fragment.f587D = false;
            if (fragment.f620o) {
                return;
            }
            if (!this.f4384j.contains(fragment)) {
                synchronized (this.f4384j) {
                    this.f4384j.add(fragment);
                }
                fragment.f620o = true;
                if (mo6140d(fragment)) {
                    this.f4398x = true;
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment already added: ");
            sb.append(fragment);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo6109a(Fragment fragment, boolean z) {
        mo6145f(fragment);
        if (fragment.f587D) {
            return;
        }
        if (!this.f4384j.contains(fragment)) {
            synchronized (this.f4384j) {
                this.f4384j.add(fragment);
            }
            fragment.f620o = true;
            fragment.f621p = false;
            if (fragment.f594K == null) {
                fragment.f600Q = false;
            }
            if (mo6140d(fragment)) {
                this.f4398x = true;
            }
            if (z) {
                mo6104a(fragment, this.f4393s, 0, 0, false);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment already added: ");
        sb.append(fragment);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final void mo6113a(C1251c<Fragment> cVar) {
        int i = this.f4393s;
        if (i >= 1) {
            int min = Math.min(i, 3);
            int size = this.f4384j.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = (Fragment) this.f4384j.get(i2);
                if (fragment.f610e < min) {
                    mo6104a(fragment, min, fragment.mo784X(), fragment.mo785Y(), false);
                    if (fragment.f594K != null && !fragment.f586C && fragment.f599P) {
                        cVar.add(fragment);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6114a(C1472a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.mo6034b(z3);
        } else {
            aVar.mo6036c();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C1517w.m3890a(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            mo6099a(this.f4393s, true);
        }
        for (Fragment fragment : this.f4385k.values()) {
            if (fragment != null && fragment.f594K != null && fragment.f599P && aVar.mo6035b(fragment.f584A)) {
                float f = fragment.f601R;
                if (f > 0.0f) {
                    fragment.f594K.setAlpha(f);
                }
                if (z3) {
                    fragment.f601R = 0.0f;
                } else {
                    fragment.f601R = -1.0f;
                    fragment.f599P = false;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6093a(C1489a aVar) {
        synchronized (this.f4392r) {
            int i = 0;
            int size = this.f4392r.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (((C1496f) this.f4392r.get(i)).f4411a == aVar) {
                    this.f4392r.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6116a(C1498h hVar, boolean z) {
        if (!z) {
            mo6141e();
        }
        synchronized (this) {
            if (!this.f4371A) {
                if (this.f4394t != null) {
                    if (this.f4381g == null) {
                        this.f4381g = new ArrayList<>();
                    }
                    this.f4381g.add(hVar);
                    mo6162o();
                    return;
                }
            }
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo6122b(int i) {
        try {
            this.f4382h = true;
            mo6099a(i, false);
            this.f4382h = false;
            mo6158k();
        } catch (Throwable th) {
            this.f4382h = false;
            throw th;
        }
    }

    /* renamed from: b */
    public void mo6123b(Fragment fragment) {
        if (!fragment.f587D) {
            fragment.f587D = true;
            if (fragment.f620o) {
                synchronized (this.f4384j) {
                    this.f4384j.remove(fragment);
                }
                if (mo6140d(fragment)) {
                    this.f4398x = true;
                }
                fragment.f620o = false;
            }
        }
    }

    /* renamed from: b */
    public void mo6125b(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f4396v;
        if (fragment2 != null) {
            C1490k kVar = fragment2.f627v;
            if (kVar instanceof C1490k) {
                kVar.mo6125b(fragment, bundle, true);
            }
        }
        Iterator it = this.f4392r.iterator();
        while (it.hasNext()) {
            C1496f fVar = (C1496f) it.next();
            if ((!z || fVar.f4412b) && fVar.f4411a == null) {
                throw null;
            }
        }
    }

    /* renamed from: b */
    public boolean mo6094b() {
        return this.f4399y || this.f4400z;
    }

    /* renamed from: c */
    public void mo6131c(int i) {
        synchronized (this) {
            this.f4390p.set(i, null);
            if (this.f4391q == null) {
                this.f4391q = new ArrayList<>();
            }
            this.f4391q.add(Integer.valueOf(i));
        }
    }

    /* renamed from: c */
    public void mo6134c(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f4396v;
        if (fragment2 != null) {
            C1490k kVar = fragment2.f627v;
            if (kVar instanceof C1490k) {
                kVar.mo6134c(fragment, true);
            }
        }
        Iterator it = this.f4392r.iterator();
        while (it.hasNext()) {
            C1496f fVar = (C1496f) it.next();
            if ((!z || fVar.f4412b) && fVar.f4411a == null) {
                throw null;
            }
        }
    }

    /* renamed from: c */
    public final void mo6135c(ArrayList<C1472a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            mo6111a(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!((C1472a) arrayList.get(i)).f4473p) {
                    if (i2 != i) {
                        mo6112a(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C1472a) arrayList.get(i2)).f4473p) {
                            i2++;
                        }
                    }
                    mo6112a(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                mo6112a(arrayList, arrayList2, i2, size);
            }
        }
    }

    /* renamed from: d */
    public final void mo6137d() {
        this.f4385k.values().removeAll(Collections.singleton(null));
    }

    /* renamed from: d */
    public void mo6139d(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f4396v;
        if (fragment2 != null) {
            C1490k kVar = fragment2.f627v;
            if (kVar instanceof C1490k) {
                kVar.mo6139d(fragment, true);
            }
        }
        Iterator it = this.f4392r.iterator();
        while (it.hasNext()) {
            C1496f fVar = (C1496f) it.next();
            if ((!z || fVar.f4412b) && fVar.f4411a == null) {
                throw null;
            }
        }
    }

    /* renamed from: e */
    public final void mo6141e() {
        if (mo6094b()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: e */
    public void mo6142e(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f4396v;
        if (fragment2 != null) {
            C1490k kVar = fragment2.f627v;
            if (kVar instanceof C1490k) {
                kVar.mo6142e(fragment, true);
            }
        }
        Iterator it = this.f4392r.iterator();
        while (it.hasNext()) {
            C1496f fVar = (C1496f) it.next();
            if ((!z || fVar.f4412b) && fVar.f4411a == null) {
                throw null;
            }
        }
    }

    /* renamed from: f */
    public final void mo6144f() {
        this.f4382h = false;
        this.f4374D.clear();
        this.f4373C.clear();
    }

    /* renamed from: f */
    public void mo6146f(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f4396v;
        if (fragment2 != null) {
            C1490k kVar = fragment2.f627v;
            if (kVar instanceof C1490k) {
                kVar.mo6146f(fragment, true);
            }
        }
        Iterator it = this.f4392r.iterator();
        while (it.hasNext()) {
            C1496f fVar = (C1496f) it.next();
            if ((!z || fVar.f4412b) && fVar.f4411a == null) {
                throw null;
            }
        }
    }

    /* renamed from: g */
    public void mo6147g() {
        this.f4399y = false;
        this.f4400z = false;
        mo6122b(1);
    }

    /* renamed from: g */
    public void mo6149g(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f4396v;
        if (fragment2 != null) {
            C1490k kVar = fragment2.f627v;
            if (kVar instanceof C1490k) {
                kVar.mo6149g(fragment, true);
            }
        }
        Iterator it = this.f4392r.iterator();
        while (it.hasNext()) {
            C1496f fVar = (C1496f) it.next();
            if ((!z || fVar.f4412b) && fVar.f4411a == null) {
                throw null;
            }
        }
    }

    /* renamed from: h */
    public void mo6150h() {
        this.f4371A = true;
        mo6158k();
        mo6122b(0);
        this.f4394t = null;
        this.f4395u = null;
        this.f4396v = null;
        if (this.f4388n != null) {
            Iterator it = this.f4389o.f2674b.iterator();
            while (it.hasNext()) {
                ((C1015a) it.next()).cancel();
            }
            this.f4388n = null;
        }
    }

    /* renamed from: h */
    public void mo6151h(Fragment fragment) {
        boolean z = !fragment.mo812g0();
        if (!fragment.f587D || z) {
            synchronized (this.f4384j) {
                this.f4384j.remove(fragment);
            }
            if (mo6140d(fragment)) {
                this.f4398x = true;
            }
            fragment.f620o = false;
            fragment.f621p = true;
        }
    }

    /* renamed from: i */
    public void mo6154i() {
        for (int i = 0; i < this.f4384j.size(); i++) {
            Fragment fragment = (Fragment) this.f4384j.get(i);
            if (fragment != null) {
                fragment.f592I = true;
                fragment.f629x.mo6154i();
            }
        }
    }

    /* renamed from: j */
    public void mo6155j() {
        if (this.f4372B) {
            this.f4372B = false;
            mo6165p();
        }
    }

    /* renamed from: j */
    public void mo6156j(Fragment fragment) {
        if (fragment.f595L != null) {
            SparseArray<Parcelable> sparseArray = this.f4377G;
            if (sparseArray == null) {
                this.f4377G = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            fragment.f595L.saveHierarchyState(this.f4377G);
            if (this.f4377G.size() > 0) {
                fragment.f612g = this.f4377G;
                this.f4377G = null;
            }
        }
    }

    /* renamed from: k */
    public void mo6157k(Fragment fragment) {
        if (fragment == null || (this.f4385k.get(fragment.f614i) == fragment && (fragment.f628w == null || fragment.f627v == this))) {
            Fragment fragment2 = this.f4397w;
            this.f4397w = fragment;
            mo6132c(fragment2);
            mo6132c(this.f4397w);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: k */
    public boolean mo6158k() {
        mo6136c(true);
        boolean z = false;
        while (mo6130b(this.f4373C, this.f4374D)) {
            this.f4382h = true;
            try {
                mo6135c(this.f4373C, this.f4374D);
                mo6144f();
                z = true;
            } catch (Throwable th) {
                mo6144f();
                throw th;
            }
        }
        mo6166q();
        mo6155j();
        mo6137d();
        return z;
    }

    /* renamed from: l */
    public C1486h mo6159l() {
        if (this.f4367e == null) {
            this.f4367e = C1488j.f4366f;
        }
        if (this.f4367e == C1488j.f4366f) {
            Fragment fragment = this.f4396v;
            if (fragment != null) {
                return fragment.f627v.mo6159l();
            }
            this.f4367e = new C1493c();
        }
        if (this.f4367e == null) {
            this.f4367e = C1488j.f4366f;
        }
        return this.f4367e;
    }

    /* renamed from: m */
    public void mo6160m() {
        this.f4399y = false;
        this.f4400z = false;
        int size = this.f4384j.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) this.f4384j.get(i);
            if (fragment != null) {
                fragment.f629x.mo6160m();
            }
        }
    }

    /* renamed from: n */
    public Parcelable mo6161n() {
        C1474b[] bVarArr;
        ArrayList<String> arrayList;
        if (this.f4378H != null) {
            while (!this.f4378H.isEmpty()) {
                ((C1500j) this.f4378H.remove(0)).mo6172a();
            }
        }
        Iterator it = this.f4385k.values().iterator();
        while (true) {
            bVarArr = null;
            if (!it.hasNext()) {
                break;
            }
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                if (fragment.mo778R() != null) {
                    int c0 = fragment.mo804c0();
                    View R = fragment.mo778R();
                    Animation animation = R.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        R.clearAnimation();
                    }
                    fragment.mo794a((View) null);
                    mo6104a(fragment, c0, 0, 0, false);
                } else if (fragment.mo779S() != null) {
                    fragment.mo779S().end();
                }
            }
        }
        mo6158k();
        this.f4399y = true;
        if (this.f4385k.isEmpty()) {
            return null;
        }
        ArrayList<C1509q> arrayList2 = new ArrayList<>(this.f4385k.size());
        Iterator it2 = this.f4385k.values().iterator();
        boolean z = false;
        while (true) {
            String str = " was removed from the FragmentManager";
            String str2 = "Failure saving state: active ";
            if (it2.hasNext()) {
                Fragment fragment2 = (Fragment) it2.next();
                if (fragment2 != null) {
                    if (fragment2.f627v == this) {
                        C1509q qVar = new C1509q(fragment2);
                        arrayList2.add(qVar);
                        if (fragment2.f610e <= 0 || qVar.f4456q != null) {
                            qVar.f4456q = fragment2.f611f;
                        } else {
                            qVar.f4456q = mo6153i(fragment2);
                            String str3 = fragment2.f617l;
                            if (str3 != null) {
                                Fragment fragment3 = (Fragment) this.f4385k.get(str3);
                                if (fragment3 != null) {
                                    if (qVar.f4456q == null) {
                                        qVar.f4456q = new Bundle();
                                    }
                                    mo6091a(qVar.f4456q, "android:target_state", fragment3);
                                    int i = fragment2.f618m;
                                    if (i != 0) {
                                        qVar.f4456q.putInt("android:target_req_state", i);
                                    }
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Failure saving state: ");
                                    sb.append(fragment2);
                                    sb.append(" has target not in fragment manager: ");
                                    sb.append(fragment2.f617l);
                                    mo6110a((RuntimeException) new IllegalStateException(sb.toString()));
                                    throw null;
                                }
                            }
                        }
                        z = true;
                    } else {
                        mo6110a((RuntimeException) new IllegalStateException(C1965a.m4749a(str2, fragment2, str)));
                        throw null;
                    }
                }
            } else if (!z) {
                return null;
            } else {
                int size = this.f4384j.size();
                if (size > 0) {
                    arrayList = new ArrayList<>(size);
                    Iterator it3 = this.f4384j.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment4 = (Fragment) it3.next();
                        arrayList.add(fragment4.f614i);
                        if (fragment4.f627v != this) {
                            mo6110a((RuntimeException) new IllegalStateException(C1965a.m4749a(str2, fragment4, str)));
                            throw null;
                        }
                    }
                } else {
                    arrayList = null;
                }
                ArrayList<C1472a> arrayList3 = this.f4386l;
                if (arrayList3 != null) {
                    int size2 = arrayList3.size();
                    if (size2 > 0) {
                        bVarArr = new C1474b[size2];
                        for (int i2 = 0; i2 < size2; i2++) {
                            bVarArr[i2] = new C1474b((C1472a) this.f4386l.get(i2));
                        }
                    }
                }
                C1505o oVar = new C1505o();
                oVar.f4432e = arrayList2;
                oVar.f4433f = arrayList;
                oVar.f4434g = bVarArr;
                Fragment fragment5 = this.f4397w;
                if (fragment5 != null) {
                    oVar.f4435h = fragment5.f614i;
                }
                oVar.f4436i = this.f4383i;
                return oVar;
            }
        }
    }

    /* renamed from: o */
    public void mo6162o() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = this.f4378H != null && !this.f4378H.isEmpty();
            if (this.f4381g != null && this.f4381g.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f4394t.f4363g.removeCallbacks(this.f4380J);
                this.f4394t.f4363g.post(this.f4380J);
                mo6166q();
            }
        }
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        AttributeSet attributeSet2 = attributeSet;
        String str2 = str;
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet2.getAttributeValue(null, "class");
        Context context2 = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, C1497g.f4413a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str3 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (str3 == null || !C1486h.m3770b(context.getClassLoader(), str3)) {
            return null;
        }
        if (view != null) {
            i = view.getId();
        }
        if (i == -1 && resourceId == -1 && string == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            sb.append(str3);
            throw new IllegalArgumentException(sb.toString());
        }
        if (resourceId != -1) {
            fragment = mo6087a(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = mo6089a(string);
        }
        if (fragment == null && i != -1) {
            fragment = mo6087a(i);
        }
        if (fragment == null) {
            fragment = mo6159l().mo6086a(context.getClassLoader(), str3);
            fragment.f622q = true;
            fragment.f631z = resourceId != 0 ? resourceId : i;
            fragment.f584A = i;
            fragment.f585B = string;
            fragment.f623r = true;
            fragment.f627v = this;
            C1487i iVar = this.f4394t;
            fragment.f628w = iVar;
            Context context3 = iVar.f4362f;
            fragment.mo793a(attributeSet2, fragment.f611f);
            mo6109a(fragment, true);
        } else if (!fragment.f623r) {
            fragment.f623r = true;
            C1487i iVar2 = this.f4394t;
            fragment.f628w = iVar2;
            Context context4 = iVar2.f4362f;
            fragment.mo793a(attributeSet2, fragment.f611f);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(attributeSet.getPositionDescription());
            sb2.append(": Duplicate id 0x");
            sb2.append(Integer.toHexString(resourceId));
            sb2.append(", tag ");
            sb2.append(string);
            sb2.append(", or parent id 0x");
            sb2.append(Integer.toHexString(i));
            sb2.append(" with another fragment for ");
            sb2.append(str3);
            throw new IllegalArgumentException(sb2.toString());
        }
        Fragment fragment2 = fragment;
        if (this.f4393s >= 1 || !fragment2.f622q) {
            mo6104a(fragment2, this.f4393s, 0, 0, false);
        } else {
            mo6104a(fragment2, 1, 0, 0, false);
        }
        View view2 = fragment2.f594K;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment2.f594K.getTag() == null) {
                fragment2.f594K.setTag(string);
            }
            return fragment2.f594K;
        }
        throw new IllegalStateException(C1965a.m4752a("Fragment ", str3, " did not create a view."));
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: p */
    public void mo6165p() {
        for (Fragment fragment : this.f4385k.values()) {
            if (fragment != null && fragment.f596M) {
                if (this.f4382h) {
                    this.f4372B = true;
                } else {
                    fragment.f596M = false;
                    mo6104a(fragment, this.f4393s, 0, 0, false);
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo6166q() {
        ArrayList<C1498h> arrayList = this.f4381g;
        boolean z = true;
        if (arrayList == null || arrayList.isEmpty()) {
            C1016b bVar = this.f4389o;
            ArrayList<C1472a> arrayList2 = this.f4386l;
            if ((arrayList2 != null ? arrayList2.size() : 0) <= 0 || !mo6143e(this.f4396v)) {
                z = false;
            }
            bVar.f2673a = z;
            return;
        }
        this.f4389o.f2673a = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.f4396v;
        if (obj == null) {
            obj = this.f4394t;
        }
        C1061o.m2496a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r6v18, types: [p.n.h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6115a(p124p.p170k.p171a.C1487i r5, p124p.p170k.p171a.C1484f r6, androidx.fragment.app.Fragment r7) {
        /*
            r4 = this;
            p.k.a.i r0 = r4.f4394t
            if (r0 != 0) goto L_0x00bf
            r4.f4394t = r5
            r4.f4395u = r6
            r4.f4396v = r7
            if (r7 == 0) goto L_0x000f
            r4.mo6166q()
        L_0x000f:
            boolean r6 = r5 instanceof p124p.p125a.C1017c
            if (r6 == 0) goto L_0x0040
            r6 = r5
            p.a.c r6 = (p124p.p125a.C1017c) r6
            androidx.activity.OnBackPressedDispatcher r0 = r6.mo3i()
            r4.f4388n = r0
            if (r7 == 0) goto L_0x001f
            r6 = r7
        L_0x001f:
            androidx.activity.OnBackPressedDispatcher r0 = r4.f4388n
            p.a.b r1 = r4.f4389o
            if (r0 == 0) goto L_0x003e
            p.n.e r6 = r6.mo2g()
            r2 = r6
            p.n.i r2 = (p124p.p177n.C1543i) r2
            p.n.e$b r2 = r2.f4559b
            p.n.e$b r3 = p124p.p177n.C1537e.C1539b.DESTROYED
            if (r2 != r3) goto L_0x0033
            goto L_0x0040
        L_0x0033:
            androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r2 = new androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            r2.<init>(r6, r1)
            java.util.concurrent.CopyOnWriteArrayList<p.a.a> r6 = r1.f2674b
            r6.add(r2)
            goto L_0x0040
        L_0x003e:
            r5 = 0
            throw r5
        L_0x0040:
            if (r7 == 0) goto L_0x0063
            p.k.a.k r5 = r7.f627v
            p.k.a.p r5 = r5.f4379I
            java.util.HashMap<java.lang.String, p.k.a.p> r6 = r5.f4439c
            java.lang.String r0 = r7.f614i
            java.lang.Object r6 = r6.get(r0)
            p.k.a.p r6 = (p124p.p170k.p171a.C1507p) r6
            if (r6 != 0) goto L_0x0060
            p.k.a.p r6 = new p.k.a.p
            boolean r0 = r5.f4441e
            r6.<init>(r0)
            java.util.HashMap<java.lang.String, p.k.a.p> r5 = r5.f4439c
            java.lang.String r7 = r7.f614i
            r5.put(r7, r6)
        L_0x0060:
            r4.f4379I = r6
            goto L_0x00be
        L_0x0063:
            boolean r6 = r5 instanceof p124p.p177n.C1560w
            if (r6 == 0) goto L_0x00b6
            p.n.w r5 = (p124p.p177n.C1560w) r5
            p.n.v r5 = r5.mo1G()
            p.n.t r6 = p124p.p170k.p171a.C1507p.f4437h
            java.lang.Class<p.k.a.p> r7 = p124p.p170k.p171a.C1507p.class
            java.lang.String r0 = r7.getCanonicalName()
            if (r0 == 0) goto L_0x00ae
            java.lang.String r1 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r0 = p213q.p214a.p215a.p216a.C1965a.m4751a(r1, r0)
            java.util.HashMap<java.lang.String, p.n.s> r1 = r5.f4578a
            java.lang.Object r1 = r1.get(r0)
            p.n.s r1 = (p124p.p177n.C1556s) r1
            boolean r2 = r7.isInstance(r1)
            if (r2 == 0) goto L_0x008c
            goto L_0x00a9
        L_0x008c:
            boolean r1 = r6 instanceof p124p.p177n.C1558u
            if (r1 == 0) goto L_0x0097
            p.n.u r6 = (p124p.p177n.C1558u) r6
            p.n.s r6 = r6.mo6252a(r0, r7)
            goto L_0x009b
        L_0x0097:
            p.n.s r6 = r6.mo6188a(r7)
        L_0x009b:
            r1 = r6
            java.util.HashMap<java.lang.String, p.n.s> r5 = r5.f4578a
            java.lang.Object r5 = r5.put(r0, r1)
            p.n.s r5 = (p124p.p177n.C1556s) r5
            if (r5 == 0) goto L_0x00a9
            r5.mo6184b()
        L_0x00a9:
            p.k.a.p r1 = (p124p.p170k.p171a.C1507p) r1
            r4.f4379I = r1
            goto L_0x00be
        L_0x00ae:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Local and anonymous classes can not be ViewModels"
            r5.<init>(r6)
            throw r5
        L_0x00b6:
            p.k.a.p r5 = new p.k.a.p
            r6 = 0
            r5.<init>(r6)
            r4.f4379I = r5
        L_0x00be:
            return
        L_0x00bf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Already attached"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p170k.p171a.C1490k.mo6115a(p.k.a.i, p.k.a.f, androidx.fragment.app.Fragment):void");
    }

    /* renamed from: h */
    public void mo6152h(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f4396v;
        if (fragment2 != null) {
            C1490k kVar = fragment2.f627v;
            if (kVar instanceof C1490k) {
                kVar.mo6152h(fragment, true);
            }
        }
        Iterator it = this.f4392r.iterator();
        while (it.hasNext()) {
            C1496f fVar = (C1496f) it.next();
            if ((!z || fVar.f4412b) && fVar.f4411a == null) {
                throw null;
            }
        }
    }

    /* renamed from: i */
    public Bundle mo6153i(Fragment fragment) {
        if (this.f4376F == null) {
            this.f4376F = new Bundle();
        }
        Bundle bundle = this.f4376F;
        fragment.mo805d(bundle);
        fragment.f608Y.mo6462b(bundle);
        Parcelable n = fragment.f629x.mo6161n();
        if (n != null) {
            bundle.putParcelable("android:support:fragments", n);
        }
        mo6138d(fragment, this.f4376F, false);
        Bundle bundle2 = null;
        if (!this.f4376F.isEmpty()) {
            Bundle bundle3 = this.f4376F;
            this.f4376F = null;
            bundle2 = bundle3;
        }
        if (fragment.f594K != null) {
            mo6156j(fragment);
        }
        if (fragment.f612g != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putSparseParcelableArray("android:view_state", fragment.f612g);
        }
        if (!fragment.f597N) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android:user_visible_hint", fragment.f597N);
        }
        return bundle2;
    }

    /* renamed from: b */
    public void mo6126b(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f4396v;
        if (fragment2 != null) {
            C1490k kVar = fragment2.f627v;
            if (kVar instanceof C1490k) {
                kVar.mo6126b(fragment, true);
            }
        }
        Iterator it = this.f4392r.iterator();
        while (it.hasNext()) {
            C1496f fVar = (C1496f) it.next();
            if ((!z || fVar.f4412b) && fVar.f4411a == null) {
                throw null;
            }
        }
    }

    /* renamed from: c */
    public void mo6133c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f4396v;
        if (fragment2 != null) {
            C1490k kVar = fragment2.f627v;
            if (kVar instanceof C1490k) {
                kVar.mo6133c(fragment, bundle, true);
            }
        }
        Iterator it = this.f4392r.iterator();
        while (it.hasNext()) {
            C1496f fVar = (C1496f) it.next();
            if ((!z || fVar.f4412b) && fVar.f4411a == null) {
                throw null;
            }
        }
    }

    /* renamed from: d */
    public void mo6138d(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f4396v;
        if (fragment2 != null) {
            C1490k kVar = fragment2.f627v;
            if (kVar instanceof C1490k) {
                kVar.mo6138d(fragment, bundle, true);
            }
        }
        Iterator it = this.f4392r.iterator();
        while (it.hasNext()) {
            C1496f fVar = (C1496f) it.next();
            if ((!z || fVar.f4412b) && fVar.f4411a == null) {
                throw null;
            }
        }
    }

    /* renamed from: e */
    public boolean mo6143e(Fragment fragment) {
        boolean z = true;
        if (fragment == null) {
            return true;
        }
        C1490k kVar = fragment.f627v;
        if (fragment != kVar.f4397w || !mo6143e(kVar.f4396v)) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public void mo6145f(Fragment fragment) {
        if (this.f4385k.get(fragment.f614i) == null) {
            this.f4385k.put(fragment.f614i, fragment);
            if (fragment.f589F) {
                if (fragment.f588E) {
                    if (!mo6094b()) {
                        this.f4379I.f4438b.add(fragment);
                    }
                } else if (!mo6094b()) {
                    this.f4379I.f4438b.remove(fragment);
                }
                fragment.f589F = false;
            }
        }
    }

    /* renamed from: g */
    public void mo6148g(Fragment fragment) {
        if (fragment != null && this.f4385k.containsKey(fragment.f614i)) {
            int i = this.f4393s;
            if (fragment.f621p) {
                i = fragment.mo812g0() ? Math.min(i, 1) : Math.min(i, 0);
            }
            mo6104a(fragment, i, fragment.mo785Y(), fragment.mo786Z(), false);
            View view = fragment.f594K;
            if (view != null) {
                ViewGroup viewGroup = fragment.f593J;
                Fragment fragment2 = null;
                if (viewGroup != null && view != null) {
                    int indexOf = this.f4384j.indexOf(fragment);
                    while (true) {
                        indexOf--;
                        if (indexOf < 0) {
                            break;
                        }
                        Fragment fragment3 = (Fragment) this.f4384j.get(indexOf);
                        if (fragment3.f593J == viewGroup && fragment3.f594K != null) {
                            fragment2 = fragment3;
                            break;
                        }
                    }
                }
                if (fragment2 != null) {
                    View view2 = fragment2.f594K;
                    ViewGroup viewGroup2 = fragment.f593J;
                    int indexOfChild = viewGroup2.indexOfChild(view2);
                    int indexOfChild2 = viewGroup2.indexOfChild(fragment.f594K);
                    if (indexOfChild2 < indexOfChild) {
                        viewGroup2.removeViewAt(indexOfChild2);
                        viewGroup2.addView(fragment.f594K, indexOfChild);
                    }
                }
                if (fragment.f599P && fragment.f593J != null) {
                    float f = fragment.f601R;
                    if (f > 0.0f) {
                        fragment.f594K.setAlpha(f);
                    }
                    fragment.f601R = 0.0f;
                    fragment.f599P = false;
                    C1494d a = mo6097a(fragment, fragment.mo785Y(), true, fragment.mo786Z());
                    if (a != null) {
                        Animation animation = a.f4404a;
                        if (animation != null) {
                            fragment.f594K.startAnimation(animation);
                        } else {
                            a.f4405b.setTarget(fragment.f594K);
                            a.f4405b.start();
                        }
                    }
                }
            }
            if (fragment.f600Q) {
                if (fragment.f594K != null) {
                    C1494d a2 = mo6097a(fragment, fragment.mo785Y(), !fragment.f586C, fragment.mo786Z());
                    if (a2 != null) {
                        Animator animator = a2.f4405b;
                        if (animator != null) {
                            animator.setTarget(fragment.f594K);
                            if (!fragment.f586C) {
                                fragment.f594K.setVisibility(0);
                            } else if (fragment.mo811f0()) {
                                fragment.mo808e(false);
                            } else {
                                ViewGroup viewGroup3 = fragment.f593J;
                                View view3 = fragment.f594K;
                                viewGroup3.startViewTransition(view3);
                                a2.f4405b.addListener(new C1504n(this, viewGroup3, view3, fragment));
                            }
                            a2.f4405b.start();
                        }
                    }
                    if (a2 != null) {
                        fragment.f594K.startAnimation(a2.f4404a);
                        a2.f4404a.start();
                    }
                    fragment.f594K.setVisibility((!fragment.f586C || fragment.mo811f0()) ? 0 : 8);
                    if (fragment.mo811f0()) {
                        fragment.mo808e(false);
                    }
                }
                if (fragment.f620o && mo6140d(fragment)) {
                    this.f4398x = true;
                }
                fragment.f600Q = false;
            }
        }
    }

    /* renamed from: b */
    public void mo6124b(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.f4396v;
        if (fragment2 != null) {
            C1490k kVar = fragment2.f627v;
            if (kVar instanceof C1490k) {
                kVar.mo6124b(fragment, context, true);
            }
        }
        Iterator it = this.f4392r.iterator();
        while (it.hasNext()) {
            C1496f fVar = (C1496f) it.next();
            if ((!z || fVar.f4412b) && fVar.f4411a == null) {
                throw null;
            }
        }
    }

    /* renamed from: c */
    public final void mo6132c(Fragment fragment) {
        if (fragment != null && this.f4385k.get(fragment.f614i) == fragment) {
            boolean e = fragment.f627v.mo6143e(fragment);
            Boolean bool = fragment.f619n;
            if (bool == null || bool.booleanValue() != e) {
                fragment.f619n = Boolean.valueOf(e);
                C1490k kVar = fragment.f629x;
                kVar.mo6166q();
                kVar.mo6132c(kVar.f4397w);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo6140d(Fragment fragment) {
        boolean z;
        if (fragment.f590G && fragment.f591H) {
            return true;
        }
        C1490k kVar = fragment.f629x;
        Iterator it = kVar.f4385k.values().iterator();
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                z2 = kVar.mo6140d(fragment2);
                continue;
            }
            if (z2) {
                z = true;
                break;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final void mo6136c(boolean z) {
        if (this.f4382h) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f4394t == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.f4394t.f4363g.getLooper()) {
            if (!z) {
                mo6141e();
            }
            if (this.f4373C == null) {
                this.f4373C = new ArrayList<>();
                this.f4374D = new ArrayList<>();
            }
            this.f4382h = true;
            try {
                mo6111a(null, null);
            } finally {
                this.f4382h = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: b */
    public boolean mo6129b(MenuItem menuItem) {
        if (this.f4393s < 1) {
            return false;
        }
        for (int i = 0; i < this.f4384j.size(); i++) {
            Fragment fragment = (Fragment) this.f4384j.get(i);
            if (fragment != null) {
                if (!fragment.f586C && fragment.f629x.mo6129b(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo6127b(boolean z) {
        int size = this.f4384j.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = (Fragment) this.f4384j.get(size);
                if (fragment != null) {
                    fragment.f629x.mo6127b(z);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public boolean mo6095c() {
        mo6141e();
        mo6158k();
        mo6136c(true);
        Fragment fragment = this.f4397w;
        if (fragment != null && fragment.mo780T().mo6095c()) {
            return true;
        }
        boolean a = mo6120a(this.f4373C, this.f4374D, (String) null, -1, 0);
        if (a) {
            this.f4382h = true;
            try {
                mo6135c(this.f4373C, this.f4374D);
            } finally {
                mo6144f();
            }
        }
        mo6166q();
        mo6155j();
        mo6137d();
        return a;
    }

    /* renamed from: b */
    public boolean mo6128b(Menu menu) {
        if (this.f4393s < 1) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f4384j.size(); i++) {
            Fragment fragment = (Fragment) this.f4384j.get(i);
            if (fragment != null) {
                if (!fragment.f586C ? fragment.f629x.mo6128b(menu) | false : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    public Fragment mo6121b(String str) {
        for (Fragment fragment : this.f4385k.values()) {
            if (fragment != null) {
                if (!str.equals(fragment.f614i)) {
                    fragment = fragment.f629x.mo6121b(str);
                }
                if (fragment != null) {
                    return fragment;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6130b(java.util.ArrayList<p124p.p170k.p171a.C1472a> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<p.k.a.k$h> r0 = r4.f4381g     // Catch:{ all -> 0x003a }
            r1 = 0
            if (r0 == 0) goto L_0x0038
            java.util.ArrayList<p.k.a.k$h> r0 = r4.f4381g     // Catch:{ all -> 0x003a }
            int r0 = r0.size()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x000f
            goto L_0x0038
        L_0x000f:
            java.util.ArrayList<p.k.a.k$h> r0 = r4.f4381g     // Catch:{ all -> 0x003a }
            int r0 = r0.size()     // Catch:{ all -> 0x003a }
            r2 = r1
        L_0x0016:
            if (r1 >= r0) goto L_0x0028
            java.util.ArrayList<p.k.a.k$h> r3 = r4.f4381g     // Catch:{ all -> 0x003a }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003a }
            p.k.a.k$h r3 = (p124p.p170k.p171a.C1490k.C1498h) r3     // Catch:{ all -> 0x003a }
            boolean r3 = r3.mo6032a(r5, r6)     // Catch:{ all -> 0x003a }
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0028:
            java.util.ArrayList<p.k.a.k$h> r5 = r4.f4381g     // Catch:{ all -> 0x003a }
            r5.clear()     // Catch:{ all -> 0x003a }
            p.k.a.i r5 = r4.f4394t     // Catch:{ all -> 0x003a }
            android.os.Handler r5 = r5.f4363g     // Catch:{ all -> 0x003a }
            java.lang.Runnable r6 = r4.f4380J     // Catch:{ all -> 0x003a }
            r5.removeCallbacks(r6)     // Catch:{ all -> 0x003a }
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            return r2
        L_0x0038:
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            return r1
        L_0x003a:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p170k.p171a.C1490k.mo6130b(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    /* renamed from: a */
    public void mo6100a(Configuration configuration) {
        for (int i = 0; i < this.f4384j.size(); i++) {
            Fragment fragment = (Fragment) this.f4384j.get(i);
            if (fragment != null) {
                fragment.f592I = true;
                fragment.f629x.mo6100a(configuration);
            }
        }
    }

    /* renamed from: a */
    public boolean mo6119a(MenuItem menuItem) {
        if (this.f4393s < 1) {
            return false;
        }
        for (int i = 0; i < this.f4384j.size(); i++) {
            Fragment fragment = (Fragment) this.f4384j.get(i);
            if (fragment != null) {
                if (!fragment.f586C && fragment.f629x.mo6119a(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo6118a(Menu menu, MenuInflater menuInflater) {
        if (this.f4393s < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f4384j.size(); i++) {
            Fragment fragment = (Fragment) this.f4384j.get(i);
            if (fragment != null) {
                if (!fragment.f586C ? fragment.f629x.mo6118a(menu, menuInflater) | false : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fragment);
                    z = true;
                }
            }
        }
        if (this.f4387m != null) {
            for (int i2 = 0; i2 < this.f4387m.size(); i2++) {
                Fragment fragment2 = (Fragment) this.f4387m.get(i2);
                if ((arrayList == null || !arrayList.contains(fragment2)) && fragment2 == null) {
                    throw null;
                }
            }
        }
        this.f4387m = arrayList;
        return z;
    }

    /* renamed from: a */
    public void mo6117a(boolean z) {
        int size = this.f4384j.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = (Fragment) this.f4384j.get(size);
                if (fragment != null) {
                    fragment.f629x.mo6117a(z);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo6106a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f4396v;
        if (fragment2 != null) {
            C1490k kVar = fragment2.f627v;
            if (kVar instanceof C1490k) {
                kVar.mo6106a(fragment, bundle, true);
            }
        }
        Iterator it = this.f4392r.iterator();
        while (it.hasNext()) {
            C1496f fVar = (C1496f) it.next();
            if ((!z || fVar.f4412b) && fVar.f4411a == null) {
                throw null;
            }
        }
    }

    /* renamed from: a */
    public void mo6105a(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.f4396v;
        if (fragment2 != null) {
            C1490k kVar = fragment2.f627v;
            if (kVar instanceof C1490k) {
                kVar.mo6105a(fragment, context, true);
            }
        }
        Iterator it = this.f4392r.iterator();
        while (it.hasNext()) {
            C1496f fVar = (C1496f) it.next();
            if ((!z || fVar.f4412b) && fVar.f4411a == null) {
                throw null;
            }
        }
    }

    /* renamed from: a */
    public void mo6107a(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f4396v;
        if (fragment2 != null) {
            C1490k kVar = fragment2.f627v;
            if (kVar instanceof C1490k) {
                kVar.mo6107a(fragment, view, bundle, true);
            }
        }
        Iterator it = this.f4392r.iterator();
        while (it.hasNext()) {
            C1496f fVar = (C1496f) it.next();
            if (!z || fVar.f4412b) {
                C1770b bVar = (C1770b) fVar.f4411a;
                if (fragment == bVar.f5194a) {
                    mo6093a((C1489a) bVar);
                    bVar.f5196c.mo1360a(view, bVar.f5195b);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6102a(Menu menu) {
        if (this.f4393s >= 1) {
            for (int i = 0; i < this.f4384j.size(); i++) {
                Fragment fragment = (Fragment) this.f4384j.get(i);
                if (fragment != null && !fragment.f586C) {
                    fragment.f629x.mo6102a(menu);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6092a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String a = C1965a.m4751a(str, "    ");
        if (!this.f4385k.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.f4385k.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    printWriter.print(a);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(fragment.f631z));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(fragment.f584A));
                    printWriter.print(" mTag=");
                    printWriter.println(fragment.f585B);
                    printWriter.print(a);
                    printWriter.print("mState=");
                    printWriter.print(fragment.f610e);
                    printWriter.print(" mWho=");
                    printWriter.print(fragment.f614i);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(fragment.f626u);
                    printWriter.print(a);
                    printWriter.print("mAdded=");
                    printWriter.print(fragment.f620o);
                    printWriter.print(" mRemoving=");
                    printWriter.print(fragment.f621p);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(fragment.f622q);
                    printWriter.print(" mInLayout=");
                    printWriter.println(fragment.f623r);
                    printWriter.print(a);
                    printWriter.print("mHidden=");
                    printWriter.print(fragment.f586C);
                    printWriter.print(" mDetached=");
                    printWriter.print(fragment.f587D);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(fragment.f591H);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(a);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(fragment.f588E);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(fragment.f597N);
                    if (fragment.f627v != null) {
                        printWriter.print(a);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(fragment.f627v);
                    }
                    if (fragment.f628w != null) {
                        printWriter.print(a);
                        printWriter.print("mHost=");
                        printWriter.println(fragment.f628w);
                    }
                    if (fragment.f630y != null) {
                        printWriter.print(a);
                        printWriter.print("mParentFragment=");
                        printWriter.println(fragment.f630y);
                    }
                    if (fragment.f615j != null) {
                        printWriter.print(a);
                        printWriter.print("mArguments=");
                        printWriter.println(fragment.f615j);
                    }
                    if (fragment.f611f != null) {
                        printWriter.print(a);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(fragment.f611f);
                    }
                    if (fragment.f612g != null) {
                        printWriter.print(a);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(fragment.f612g);
                    }
                    Fragment fragment2 = fragment.f616k;
                    if (fragment2 == null) {
                        C1490k kVar = fragment.f627v;
                        if (kVar != null) {
                            String str2 = fragment.f617l;
                            if (str2 != null) {
                                fragment2 = (Fragment) kVar.f4385k.get(str2);
                            }
                        }
                        fragment2 = null;
                    }
                    if (fragment2 != null) {
                        printWriter.print(a);
                        printWriter.print("mTarget=");
                        printWriter.print(fragment2);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(fragment.f618m);
                    }
                    if (fragment.mo784X() != 0) {
                        printWriter.print(a);
                        printWriter.print("mNextAnim=");
                        printWriter.println(fragment.mo784X());
                    }
                    if (fragment.f593J != null) {
                        printWriter.print(a);
                        printWriter.print("mContainer=");
                        printWriter.println(fragment.f593J);
                    }
                    if (fragment.f594K != null) {
                        printWriter.print(a);
                        printWriter.print("mView=");
                        printWriter.println(fragment.f594K);
                    }
                    if (fragment.f595L != null) {
                        printWriter.print(a);
                        printWriter.print("mInnerView=");
                        printWriter.println(fragment.f594K);
                    }
                    if (fragment.mo778R() != null) {
                        printWriter.print(a);
                        printWriter.print("mAnimatingAway=");
                        printWriter.println(fragment.mo778R());
                        printWriter.print(a);
                        printWriter.print("mStateAfterAnimating=");
                        printWriter.println(fragment.mo804c0());
                    }
                    if (fragment.mo781U() != null) {
                        C1561a.m3960a(fragment).mo6254a(a, fileDescriptor, printWriter, strArr);
                    }
                    printWriter.print(a);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Child ");
                    sb.append(fragment.f629x);
                    sb.append(":");
                    printWriter.println(sb.toString());
                    fragment.f629x.mo6092a(C1965a.m4751a(a, "  "), fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size = this.f4384j.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                Fragment fragment3 = (Fragment) this.f4384j.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f4387m;
        if (arrayList != null) {
            int size2 = arrayList.size();
            if (size2 > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (int i2 = 0; i2 < size2; i2++) {
                    Fragment fragment4 = (Fragment) this.f4387m.get(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(fragment4.toString());
                }
            }
        }
        ArrayList<C1472a> arrayList2 = this.f4386l;
        if (arrayList2 != null) {
            int size3 = arrayList2.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (int i3 = 0; i3 < size3; i3++) {
                    C1472a aVar = (C1472a) this.f4386l.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.mo6030a(a, printWriter, true);
                }
            }
        }
        synchronized (this) {
            if (this.f4390p != null) {
                int size4 = this.f4390p.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        C1472a aVar2 = (C1472a) this.f4390p.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(aVar2);
                    }
                }
            }
            if (this.f4391q != null && this.f4391q.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f4391q.toArray()));
            }
        }
        ArrayList<C1498h> arrayList3 = this.f4381g;
        if (arrayList3 != null) {
            int size5 = arrayList3.size();
            if (size5 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i5 = 0; i5 < size5; i5++) {
                    C1498h hVar = (C1498h) this.f4381g.get(i5);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(hVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f4394t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f4395u);
        if (this.f4396v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4396v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f4393s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f4399y);
        printWriter.print(" mStopped=");
        printWriter.print(this.f4400z);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f4371A);
        if (this.f4398x) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f4398x);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02cf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6112a(java.util.ArrayList<p124p.p170k.p171a.C1472a> r20, java.util.ArrayList<java.lang.Boolean> r21, int r22, int r23) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            java.lang.Object r0 = r7.get(r9)
            p.k.a.a r0 = (p124p.p170k.p171a.C1472a) r0
            boolean r11 = r0.f4473p
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.f4375E
            if (r0 != 0) goto L_0x001e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.f4375E = r0
            goto L_0x0021
        L_0x001e:
            r0.clear()
        L_0x0021:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.f4375E
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r6.f4384j
            r0.addAll(r1)
            androidx.fragment.app.Fragment r0 = r6.f4397w
            r1 = r9
            r2 = 0
        L_0x002c:
            r15 = 1
            if (r1 >= r10) goto L_0x016c
            java.lang.Object r3 = r7.get(r1)
            p.k.a.a r3 = (p124p.p170k.p171a.C1472a) r3
            java.lang.Object r4 = r8.get(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 3
            if (r4 != 0) goto L_0x0121
            java.util.ArrayList<androidx.fragment.app.Fragment> r4 = r6.f4375E
            r13 = 0
        L_0x0045:
            java.util.ArrayList<p.k.a.r$a> r12 = r3.f4458a
            int r12 = r12.size()
            if (r13 >= r12) goto L_0x015a
            java.util.ArrayList<p.k.a.r$a> r12 = r3.f4458a
            java.lang.Object r12 = r12.get(r13)
            p.k.a.r$a r12 = (p124p.p170k.p171a.C1511r.C1512a) r12
            int r14 = r12.f4475a
            if (r14 == r15) goto L_0x0112
            r15 = 2
            r9 = 9
            if (r14 == r15) goto L_0x0097
            if (r14 == r5) goto L_0x007f
            r15 = 6
            if (r14 == r15) goto L_0x007f
            r15 = 7
            if (r14 == r15) goto L_0x007c
            r15 = 8
            if (r14 == r15) goto L_0x006c
            goto L_0x0109
        L_0x006c:
            java.util.ArrayList<p.k.a.r$a> r14 = r3.f4458a
            p.k.a.r$a r15 = new p.k.a.r$a
            r15.<init>(r9, r0)
            r14.add(r13, r15)
            int r13 = r13 + 1
            androidx.fragment.app.Fragment r0 = r12.f4476b
            goto L_0x0109
        L_0x007c:
            r5 = 1
            goto L_0x0113
        L_0x007f:
            androidx.fragment.app.Fragment r14 = r12.f4476b
            r4.remove(r14)
            androidx.fragment.app.Fragment r12 = r12.f4476b
            if (r12 != r0) goto L_0x0109
            java.util.ArrayList<p.k.a.r$a> r0 = r3.f4458a
            p.k.a.r$a r14 = new p.k.a.r$a
            r14.<init>(r9, r12)
            r0.add(r13, r14)
            int r13 = r13 + 1
            r0 = 0
            goto L_0x0109
        L_0x0097:
            androidx.fragment.app.Fragment r14 = r12.f4476b
            int r15 = r14.f584A
            int r17 = r4.size()
            r16 = -1
            int r17 = r17 + -1
            r5 = r17
            r17 = 0
        L_0x00a7:
            if (r5 < 0) goto L_0x0100
            java.lang.Object r18 = r4.get(r5)
            r9 = r18
            androidx.fragment.app.Fragment r9 = (androidx.fragment.app.Fragment) r9
            int r8 = r9.f584A
            if (r8 != r15) goto L_0x00f5
            if (r9 != r14) goto L_0x00bc
            r18 = r15
            r17 = 1
            goto L_0x00f7
        L_0x00bc:
            if (r9 != r0) goto L_0x00d0
            java.util.ArrayList<p.k.a.r$a> r0 = r3.f4458a
            p.k.a.r$a r8 = new p.k.a.r$a
            r18 = r15
            r15 = 9
            r8.<init>(r15, r9)
            r0.add(r13, r8)
            int r13 = r13 + 1
            r0 = 0
            goto L_0x00d4
        L_0x00d0:
            r18 = r15
            r15 = 9
        L_0x00d4:
            p.k.a.r$a r8 = new p.k.a.r$a
            r15 = 3
            r8.<init>(r15, r9)
            int r15 = r12.f4477c
            r8.f4477c = r15
            int r15 = r12.f4479e
            r8.f4479e = r15
            int r15 = r12.f4478d
            r8.f4478d = r15
            int r15 = r12.f4480f
            r8.f4480f = r15
            java.util.ArrayList<p.k.a.r$a> r15 = r3.f4458a
            r15.add(r13, r8)
            r4.remove(r9)
            r8 = 1
            int r13 = r13 + r8
            goto L_0x00f7
        L_0x00f5:
            r18 = r15
        L_0x00f7:
            int r5 = r5 + -1
            r8 = r21
            r15 = r18
            r9 = 9
            goto L_0x00a7
        L_0x0100:
            if (r17 == 0) goto L_0x010b
            java.util.ArrayList<p.k.a.r$a> r5 = r3.f4458a
            r5.remove(r13)
            int r13 = r13 + -1
        L_0x0109:
            r5 = 1
            goto L_0x0118
        L_0x010b:
            r5 = 1
            r12.f4475a = r5
            r4.add(r14)
            goto L_0x0118
        L_0x0112:
            r5 = r15
        L_0x0113:
            androidx.fragment.app.Fragment r8 = r12.f4476b
            r4.add(r8)
        L_0x0118:
            int r13 = r13 + r5
            r8 = r21
            r9 = r22
            r15 = r5
            r5 = 3
            goto L_0x0045
        L_0x0121:
            r5 = r15
            java.util.ArrayList<androidx.fragment.app.Fragment> r4 = r6.f4375E
            java.util.ArrayList<p.k.a.r$a> r8 = r3.f4458a
            int r8 = r8.size()
            int r8 = r8 - r5
        L_0x012b:
            if (r8 < 0) goto L_0x015a
            java.util.ArrayList<p.k.a.r$a> r9 = r3.f4458a
            java.lang.Object r9 = r9.get(r8)
            p.k.a.r$a r9 = (p124p.p170k.p171a.C1511r.C1512a) r9
            int r12 = r9.f4475a
            if (r12 == r5) goto L_0x0150
            r5 = 3
            if (r12 == r5) goto L_0x014a
            switch(r12) {
                case 6: goto L_0x014a;
                case 7: goto L_0x0151;
                case 8: goto L_0x0148;
                case 9: goto L_0x0145;
                case 10: goto L_0x0140;
                default: goto L_0x013f;
            }
        L_0x013f:
            goto L_0x0156
        L_0x0140:
            p.n.e$b r12 = r9.f4481g
            r9.f4482h = r12
            goto L_0x0156
        L_0x0145:
            androidx.fragment.app.Fragment r0 = r9.f4476b
            goto L_0x0156
        L_0x0148:
            r0 = 0
            goto L_0x0156
        L_0x014a:
            androidx.fragment.app.Fragment r9 = r9.f4476b
            r4.add(r9)
            goto L_0x0156
        L_0x0150:
            r5 = 3
        L_0x0151:
            androidx.fragment.app.Fragment r9 = r9.f4476b
            r4.remove(r9)
        L_0x0156:
            int r8 = r8 + -1
            r5 = 1
            goto L_0x012b
        L_0x015a:
            if (r2 != 0) goto L_0x0163
            boolean r2 = r3.f4465h
            if (r2 == 0) goto L_0x0161
            goto L_0x0163
        L_0x0161:
            r2 = 0
            goto L_0x0164
        L_0x0163:
            r2 = 1
        L_0x0164:
            int r1 = r1 + 1
            r8 = r21
            r9 = r22
            goto L_0x002c
        L_0x016c:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.f4375E
            r0.clear()
            if (r11 != 0) goto L_0x0181
            r5 = 0
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            p124p.p170k.p171a.C1517w.m3890a(r0, r1, r2, r3, r4, r5)
        L_0x0181:
            r0 = r22
        L_0x0183:
            if (r0 >= r10) goto L_0x01b2
            java.lang.Object r1 = r7.get(r0)
            p.k.a.a r1 = (p124p.p170k.p171a.C1472a) r1
            r8 = r21
            java.lang.Object r2 = r8.get(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x01a8
            r2 = -1
            r1.mo6028a(r2)
            int r2 = r10 + -1
            if (r0 != r2) goto L_0x01a3
            r2 = 1
            goto L_0x01a4
        L_0x01a3:
            r2 = 0
        L_0x01a4:
            r1.mo6034b(r2)
            goto L_0x01af
        L_0x01a8:
            r2 = 1
            r1.mo6028a(r2)
            r1.mo6036c()
        L_0x01af:
            int r0 = r0 + 1
            goto L_0x0183
        L_0x01b2:
            r8 = r21
            if (r11 == 0) goto L_0x0276
            p.e.c r0 = new p.e.c
            r0.<init>()
            r6.mo6113a(r0)
            int r1 = r10 + -1
            r9 = r22
            r2 = r10
        L_0x01c3:
            if (r1 < r9) goto L_0x0253
            java.lang.Object r3 = r7.get(r1)
            p.k.a.a r3 = (p124p.p170k.p171a.C1472a) r3
            java.lang.Object r4 = r8.get(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 0
        L_0x01d6:
            java.util.ArrayList<p.k.a.r$a> r12 = r3.f4458a
            int r12 = r12.size()
            if (r5 >= r12) goto L_0x01f1
            java.util.ArrayList<p.k.a.r$a> r12 = r3.f4458a
            java.lang.Object r12 = r12.get(r5)
            p.k.a.r$a r12 = (p124p.p170k.p171a.C1511r.C1512a) r12
            boolean r12 = p124p.p170k.p171a.C1472a.m3707b(r12)
            if (r12 == 0) goto L_0x01ee
            r5 = 1
            goto L_0x01f2
        L_0x01ee:
            int r5 = r5 + 1
            goto L_0x01d6
        L_0x01f1:
            r5 = 0
        L_0x01f2:
            if (r5 == 0) goto L_0x01fe
            int r5 = r1 + 1
            boolean r5 = r3.mo6031a(r7, r5, r10)
            if (r5 != 0) goto L_0x01fe
            r5 = 1
            goto L_0x01ff
        L_0x01fe:
            r5 = 0
        L_0x01ff:
            if (r5 == 0) goto L_0x024e
            java.util.ArrayList<p.k.a.k$j> r5 = r6.f4378H
            if (r5 != 0) goto L_0x020c
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6.f4378H = r5
        L_0x020c:
            p.k.a.k$j r5 = new p.k.a.k$j
            r5.<init>(r3, r4)
            java.util.ArrayList<p.k.a.k$j> r12 = r6.f4378H
            r12.add(r5)
            r12 = 0
        L_0x0217:
            java.util.ArrayList<p.k.a.r$a> r13 = r3.f4458a
            int r13 = r13.size()
            if (r12 >= r13) goto L_0x0235
            java.util.ArrayList<p.k.a.r$a> r13 = r3.f4458a
            java.lang.Object r13 = r13.get(r12)
            p.k.a.r$a r13 = (p124p.p170k.p171a.C1511r.C1512a) r13
            boolean r14 = p124p.p170k.p171a.C1472a.m3707b(r13)
            if (r14 == 0) goto L_0x0232
            androidx.fragment.app.Fragment r13 = r13.f4476b
            r13.mo796a(r5)
        L_0x0232:
            int r12 = r12 + 1
            goto L_0x0217
        L_0x0235:
            if (r4 == 0) goto L_0x023c
            r3.mo6036c()
            r12 = 0
            goto L_0x0240
        L_0x023c:
            r12 = 0
            r3.mo6034b(r12)
        L_0x0240:
            int r2 = r2 + -1
            if (r1 == r2) goto L_0x024a
            r7.remove(r1)
            r7.add(r2, r3)
        L_0x024a:
            r6.mo6113a(r0)
            goto L_0x024f
        L_0x024e:
            r12 = 0
        L_0x024f:
            int r1 = r1 + -1
            goto L_0x01c3
        L_0x0253:
            r12 = 0
            int r1 = r0.f3551g
            r3 = r12
        L_0x0257:
            if (r3 >= r1) goto L_0x0274
            java.lang.Object[] r4 = r0.f3550f
            r4 = r4[r3]
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            boolean r5 = r4.f620o
            if (r5 != 0) goto L_0x0271
            android.view.View r5 = r4.mo825p0()
            float r13 = r5.getAlpha()
            r4.f601R = r13
            r4 = 0
            r5.setAlpha(r4)
        L_0x0271:
            int r3 = r3 + 1
            goto L_0x0257
        L_0x0274:
            r4 = r2
            goto L_0x027a
        L_0x0276:
            r9 = r22
            r12 = 0
            r4 = r10
        L_0x027a:
            if (r4 == r9) goto L_0x0290
            if (r11 == 0) goto L_0x0290
            r5 = 1
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            p124p.p170k.p171a.C1517w.m3890a(r0, r1, r2, r3, r4, r5)
            int r0 = r6.f4393s
            r1 = 1
            r6.mo6099a(r0, r1)
        L_0x0290:
            if (r9 >= r10) goto L_0x02d3
            java.lang.Object r0 = r7.get(r9)
            p.k.a.a r0 = (p124p.p170k.p171a.C1472a) r0
            java.lang.Object r1 = r8.get(r9)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x02af
            int r1 = r0.f4318t
            if (r1 < 0) goto L_0x02af
            r6.mo6131c(r1)
            r1 = -1
            r0.f4318t = r1
            goto L_0x02b0
        L_0x02af:
            r1 = -1
        L_0x02b0:
            java.util.ArrayList<java.lang.Runnable> r2 = r0.f4474q
            if (r2 == 0) goto L_0x02cf
            r2 = r12
        L_0x02b5:
            java.util.ArrayList<java.lang.Runnable> r3 = r0.f4474q
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x02cb
            java.util.ArrayList<java.lang.Runnable> r3 = r0.f4474q
            java.lang.Object r3 = r3.get(r2)
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r3.run()
            int r2 = r2 + 1
            goto L_0x02b5
        L_0x02cb:
            r2 = 0
            r0.f4474q = r2
            goto L_0x02d0
        L_0x02cf:
            r2 = 0
        L_0x02d0:
            int r9 = r9 + 1
            goto L_0x0290
        L_0x02d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p170k.p171a.C1490k.mo6112a(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (((java.lang.Boolean) r10.get(r6)).booleanValue() != false) goto L_0x0076;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6111a(java.util.ArrayList<p124p.p170k.p171a.C1472a> r9, java.util.ArrayList<java.lang.Boolean> r10) {
        /*
            r8 = this;
            java.util.ArrayList<p.k.a.k$j> r0 = r8.f4378H
            r1 = 0
            if (r0 != 0) goto L_0x0007
            r0 = r1
            goto L_0x000b
        L_0x0007:
            int r0 = r0.size()
        L_0x000b:
            r2 = r1
        L_0x000c:
            if (r2 >= r0) goto L_0x0085
            java.util.ArrayList<p.k.a.k$j> r3 = r8.f4378H
            java.lang.Object r3 = r3.get(r2)
            p.k.a.k$j r3 = (p124p.p170k.p171a.C1490k.C1500j) r3
            r4 = 1
            r5 = -1
            if (r9 == 0) goto L_0x003c
            boolean r6 = r3.f4418a
            if (r6 != 0) goto L_0x003c
            p.k.a.a r6 = r3.f4419b
            int r6 = r9.indexOf(r6)
            if (r6 == r5) goto L_0x003c
            java.lang.Object r6 = r10.get(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x003c
            java.util.ArrayList<p.k.a.k$j> r5 = r8.f4378H
            r5.remove(r2)
            int r2 = r2 + -1
            int r0 = r0 + -1
            goto L_0x0076
        L_0x003c:
            int r6 = r3.f4420c
            if (r6 != 0) goto L_0x0042
            r6 = r4
            goto L_0x0043
        L_0x0042:
            r6 = r1
        L_0x0043:
            if (r6 != 0) goto L_0x0053
            if (r9 == 0) goto L_0x0083
            p.k.a.a r6 = r3.f4419b
            int r7 = r9.size()
            boolean r6 = r6.mo6031a(r9, r1, r7)
            if (r6 == 0) goto L_0x0083
        L_0x0053:
            java.util.ArrayList<p.k.a.k$j> r6 = r8.f4378H
            r6.remove(r2)
            int r2 = r2 + -1
            int r0 = r0 + -1
            if (r9 == 0) goto L_0x0080
            boolean r6 = r3.f4418a
            if (r6 != 0) goto L_0x0080
            p.k.a.a r6 = r3.f4419b
            int r6 = r9.indexOf(r6)
            if (r6 == r5) goto L_0x0080
            java.lang.Object r5 = r10.get(r6)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0080
        L_0x0076:
            p.k.a.a r5 = r3.f4419b
            p.k.a.k r6 = r5.f4316r
            boolean r3 = r3.f4418a
            r6.mo6114a(r5, r3, r1, r1)
            goto L_0x0083
        L_0x0080:
            r3.mo6172a()
        L_0x0083:
            int r2 = r2 + r4
            goto L_0x000c
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p170k.p171a.C1490k.mo6111a(java.util.ArrayList, java.util.ArrayList):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042 A[SYNTHETIC, Splitter:B:20:0x0042] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p124p.p170k.p171a.C1490k.C1494d mo6097a(androidx.fragment.app.Fragment r7, int r8, boolean r9, int r10) {
        /*
            r6 = this;
            int r0 = r7.mo784X()
            r1 = 0
            r7.mo803c(r1)
            android.view.ViewGroup r7 = r7.f593J
            r2 = 0
            if (r7 == 0) goto L_0x0014
            android.animation.LayoutTransition r7 = r7.getLayoutTransition()
            if (r7 == 0) goto L_0x0014
            return r2
        L_0x0014:
            r7 = 1
            if (r0 == 0) goto L_0x0066
            p.k.a.i r3 = r6.f4394t
            android.content.Context r3 = r3.f4362f
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getResourceTypeName(r0)
            java.lang.String r4 = "anim"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x003f
            p.k.a.i r4 = r6.f4394t     // Catch:{ NotFoundException -> 0x003d, RuntimeException -> 0x003f }
            android.content.Context r4 = r4.f4362f     // Catch:{ NotFoundException -> 0x003d, RuntimeException -> 0x003f }
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r4, r0)     // Catch:{ NotFoundException -> 0x003d, RuntimeException -> 0x003f }
            if (r4 == 0) goto L_0x003b
            p.k.a.k$d r5 = new p.k.a.k$d     // Catch:{ NotFoundException -> 0x003d, RuntimeException -> 0x003f }
            r5.<init>(r4)     // Catch:{ NotFoundException -> 0x003d, RuntimeException -> 0x003f }
            return r5
        L_0x003b:
            r4 = r7
            goto L_0x0040
        L_0x003d:
            r7 = move-exception
            throw r7
        L_0x003f:
            r4 = r1
        L_0x0040:
            if (r4 != 0) goto L_0x0066
            p.k.a.i r4 = r6.f4394t     // Catch:{ RuntimeException -> 0x0052 }
            android.content.Context r4 = r4.f4362f     // Catch:{ RuntimeException -> 0x0052 }
            android.animation.Animator r4 = android.animation.AnimatorInflater.loadAnimator(r4, r0)     // Catch:{ RuntimeException -> 0x0052 }
            if (r4 == 0) goto L_0x0066
            p.k.a.k$d r5 = new p.k.a.k$d     // Catch:{ RuntimeException -> 0x0052 }
            r5.<init>(r4)     // Catch:{ RuntimeException -> 0x0052 }
            return r5
        L_0x0052:
            r4 = move-exception
            if (r3 != 0) goto L_0x0065
            p.k.a.i r3 = r6.f4394t
            android.content.Context r3 = r3.f4362f
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r3, r0)
            if (r0 == 0) goto L_0x0066
            p.k.a.k$d r7 = new p.k.a.k$d
            r7.<init>(r0)
            return r7
        L_0x0065:
            throw r4
        L_0x0066:
            if (r8 != 0) goto L_0x0069
            return r2
        L_0x0069:
            r0 = 4097(0x1001, float:5.741E-42)
            if (r8 == r0) goto L_0x0083
            r0 = 4099(0x1003, float:5.744E-42)
            if (r8 == r0) goto L_0x007d
            r0 = 8194(0x2002, float:1.1482E-41)
            if (r8 == r0) goto L_0x0077
            r8 = -1
            goto L_0x0088
        L_0x0077:
            if (r9 == 0) goto L_0x007b
            r8 = 3
            goto L_0x0088
        L_0x007b:
            r8 = 4
            goto L_0x0088
        L_0x007d:
            if (r9 == 0) goto L_0x0081
            r8 = 5
            goto L_0x0088
        L_0x0081:
            r8 = 6
            goto L_0x0088
        L_0x0083:
            if (r9 == 0) goto L_0x0087
            r8 = r7
            goto L_0x0088
        L_0x0087:
            r8 = 2
        L_0x0088:
            if (r8 >= 0) goto L_0x008b
            return r2
        L_0x008b:
            r3 = 220(0xdc, double:1.087E-321)
            r9 = 1064933786(0x3f79999a, float:0.975)
            r0 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            switch(r8) {
                case 1: goto L_0x00d3;
                case 2: goto L_0x00ce;
                case 3: goto L_0x00c9;
                case 4: goto L_0x00c1;
                case 5: goto L_0x00ae;
                case 6: goto L_0x009b;
                default: goto L_0x0096;
            }
        L_0x0096:
            if (r10 != 0) goto L_0x00fa
            p.k.a.i r8 = r6.f4394t
            goto L_0x00da
        L_0x009b:
            android.view.animation.AlphaAnimation r7 = new android.view.animation.AlphaAnimation
            r7.<init>(r5, r0)
            android.view.animation.Interpolator r8 = f4370M
            r7.setInterpolator(r8)
            r7.setDuration(r3)
            p.k.a.k$d r8 = new p.k.a.k$d
            r8.<init>(r7)
            return r8
        L_0x00ae:
            android.view.animation.AlphaAnimation r7 = new android.view.animation.AlphaAnimation
            r7.<init>(r0, r5)
            android.view.animation.Interpolator r8 = f4370M
            r7.setInterpolator(r8)
            r7.setDuration(r3)
            p.k.a.k$d r8 = new p.k.a.k$d
            r8.<init>(r7)
            return r8
        L_0x00c1:
            r7 = 1065982362(0x3f89999a, float:1.075)
            p.k.a.k$d r7 = m3784a(r5, r7, r5, r0)
            return r7
        L_0x00c9:
            p.k.a.k$d r7 = m3784a(r9, r5, r0, r5)
            return r7
        L_0x00ce:
            p.k.a.k$d r7 = m3784a(r5, r9, r5, r0)
            return r7
        L_0x00d3:
            r7 = 1066401792(0x3f900000, float:1.125)
            p.k.a.k$d r7 = m3784a(r7, r5, r0, r5)
            return r7
        L_0x00da:
            p.k.a.e$a r8 = (p124p.p170k.p171a.C1482e.C1483a) r8
            p.k.a.e r8 = p124p.p170k.p171a.C1482e.this
            android.view.Window r8 = r8.getWindow()
            if (r8 == 0) goto L_0x00e5
            r1 = r7
        L_0x00e5:
            if (r1 == 0) goto L_0x00fa
            p.k.a.i r7 = r6.f4394t
            p.k.a.e$a r7 = (p124p.p170k.p171a.C1482e.C1483a) r7
            p.k.a.e r7 = p124p.p170k.p171a.C1482e.this
            android.view.Window r7 = r7.getWindow()
            if (r7 != 0) goto L_0x00f4
            goto L_0x00fa
        L_0x00f4:
            android.view.WindowManager$LayoutParams r7 = r7.getAttributes()
            int r7 = r7.windowAnimations
        L_0x00fa:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p170k.p171a.C1490k.mo6097a(androidx.fragment.app.Fragment, int, boolean, int):p.k.a.k$d");
    }

    /* renamed from: a */
    public void mo6099a(int i, boolean z) {
        if (this.f4394t == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f4393s) {
            this.f4393s = i;
            int size = this.f4384j.size();
            for (int i2 = 0; i2 < size; i2++) {
                mo6148g((Fragment) this.f4384j.get(i2));
            }
            for (Fragment fragment : this.f4385k.values()) {
                if (fragment != null && ((fragment.f621p || fragment.f587D) && !fragment.f599P)) {
                    mo6148g(fragment);
                }
            }
            mo6165p();
            if (this.f4398x) {
                C1487i iVar = this.f4394t;
                if (iVar != null && this.f4393s == 4) {
                    C1482e.this.mo4427O();
                    this.f4398x = false;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0084, code lost:
        if (r0 != 3) goto L_0x06f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x06fa  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6104a(androidx.fragment.app.Fragment r17, int r18, int r19, int r20, boolean r21) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            boolean r0 = r7.f620o
            r8 = 1
            if (r0 == 0) goto L_0x0011
            boolean r0 = r7.f587D
            if (r0 == 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            r0 = r18
            goto L_0x0016
        L_0x0011:
            r0 = r18
            if (r0 <= r8) goto L_0x0016
            r0 = r8
        L_0x0016:
            boolean r1 = r7.f621p
            if (r1 == 0) goto L_0x002a
            int r1 = r7.f610e
            if (r0 <= r1) goto L_0x002a
            if (r1 != 0) goto L_0x0028
            boolean r0 = r17.mo812g0()
            if (r0 == 0) goto L_0x0028
            r0 = r8
            goto L_0x002a
        L_0x0028:
            int r0 = r7.f610e
        L_0x002a:
            boolean r1 = r7.f596M
            r9 = 2
            r10 = 3
            if (r1 == 0) goto L_0x0037
            int r1 = r7.f610e
            if (r1 >= r10) goto L_0x0037
            if (r0 <= r9) goto L_0x0037
            r0 = r9
        L_0x0037:
            p.n.e$b r1 = r7.f604U
            p.n.e$b r2 = p124p.p177n.C1537e.C1539b.CREATED
            if (r1 != r2) goto L_0x0042
            int r0 = java.lang.Math.min(r0, r8)
            goto L_0x004a
        L_0x0042:
            int r1 = r1.ordinal()
            int r0 = java.lang.Math.min(r0, r1)
        L_0x004a:
            r11 = r0
            int r0 = r7.f610e
            java.lang.String r12 = "Fragment "
            r13 = 0
            r14 = 0
            if (r0 > r11) goto L_0x03d9
            boolean r0 = r7.f622q
            if (r0 == 0) goto L_0x005c
            boolean r0 = r7.f623r
            if (r0 != 0) goto L_0x005c
            return
        L_0x005c:
            android.view.View r0 = r17.mo778R()
            if (r0 != 0) goto L_0x0068
            android.animation.Animator r0 = r17.mo779S()
            if (r0 == 0) goto L_0x007c
        L_0x0068:
            r7.mo794a(r14)
            r7.mo789a(r14)
            int r2 = r17.mo804c0()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r16
            r1 = r17
            r0.mo6104a(r1, r2, r3, r4, r5)
        L_0x007c:
            int r0 = r7.f610e
            if (r0 == 0) goto L_0x0088
            if (r0 == r8) goto L_0x0206
            if (r0 == r9) goto L_0x0342
            if (r0 == r10) goto L_0x0389
            goto L_0x06f5
        L_0x0088:
            if (r11 <= 0) goto L_0x0206
            android.os.Bundle r0 = r7.f611f
            if (r0 == 0) goto L_0x00df
            p.k.a.i r1 = r6.f4394t
            android.content.Context r1 = r1.f4362f
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.f611f
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.f612g = r0
            android.os.Bundle r0 = r7.f611f
            java.lang.String r1 = "android:target_state"
            androidx.fragment.app.Fragment r0 = r6.mo6088a(r0, r1)
            if (r0 == 0) goto L_0x00b0
            java.lang.String r0 = r0.f614i
            goto L_0x00b1
        L_0x00b0:
            r0 = r14
        L_0x00b1:
            r7.f617l = r0
            if (r0 == 0) goto L_0x00bf
            android.os.Bundle r0 = r7.f611f
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r13)
            r7.f618m = r0
        L_0x00bf:
            java.lang.Boolean r0 = r7.f613h
            if (r0 == 0) goto L_0x00cc
            boolean r0 = r0.booleanValue()
            r7.f597N = r0
            r7.f613h = r14
            goto L_0x00d6
        L_0x00cc:
            android.os.Bundle r0 = r7.f611f
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.f597N = r0
        L_0x00d6:
            boolean r0 = r7.f597N
            if (r0 != 0) goto L_0x00df
            r7.f596M = r8
            if (r11 <= r9) goto L_0x00df
            r11 = r9
        L_0x00df:
            p.k.a.i r0 = r6.f4394t
            r7.f628w = r0
            androidx.fragment.app.Fragment r1 = r6.f4396v
            r7.f630y = r1
            if (r1 == 0) goto L_0x00ec
            p.k.a.k r0 = r1.f629x
            goto L_0x00ee
        L_0x00ec:
            p.k.a.k r0 = r0.f4365i
        L_0x00ee:
            r7.f627v = r0
            androidx.fragment.app.Fragment r0 = r7.f616k
            java.lang.String r10 = " that does not belong to this FragmentManager!"
            java.lang.String r15 = " declared target fragment "
            if (r0 == 0) goto L_0x013a
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.f4385k
            java.lang.String r0 = r0.f614i
            java.lang.Object r0 = r1.get(r0)
            androidx.fragment.app.Fragment r1 = r7.f616k
            if (r0 != r1) goto L_0x011a
            int r0 = r1.f610e
            if (r0 >= r8) goto L_0x0111
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r16
            r0.mo6104a(r1, r2, r3, r4, r5)
        L_0x0111:
            androidx.fragment.app.Fragment r0 = r7.f616k
            java.lang.String r0 = r0.f614i
            r7.f617l = r0
            r7.f616k = r14
            goto L_0x013a
        L_0x011a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            r1.append(r7)
            r1.append(r15)
            androidx.fragment.app.Fragment r2 = r7.f616k
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x013a:
            java.lang.String r0 = r7.f617l
            if (r0 == 0) goto L_0x0171
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.f4385k
            java.lang.Object r0 = r1.get(r0)
            r1 = r0
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L_0x0157
            int r0 = r1.f610e
            if (r0 >= r8) goto L_0x0171
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r16
            r0.mo6104a(r1, r2, r3, r4, r5)
            goto L_0x0171
        L_0x0157:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            r1.append(r7)
            r1.append(r15)
            java.lang.String r2 = r7.f617l
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4754a(r1, r2, r10)
            r0.<init>(r1)
            throw r0
        L_0x0171:
            p.k.a.i r0 = r6.f4394t
            android.content.Context r0 = r0.f4362f
            r6.mo6124b(r7, r0, r13)
            p.k.a.k r0 = r7.f629x
            p.k.a.i r1 = r7.f628w
            p.k.a.d r2 = new p.k.a.d
            r2.<init>(r7)
            r0.mo6115a(r1, r2, r7)
            r7.f592I = r13
            p.k.a.i r0 = r7.f628w
            android.content.Context r0 = r0.f4362f
            r7.mo790a(r0)
            boolean r0 = r7.f592I
            if (r0 == 0) goto L_0x01fa
            androidx.fragment.app.Fragment r0 = r7.f630y
            if (r0 != 0) goto L_0x019f
            p.k.a.i r0 = r6.f4394t
            p.k.a.e$a r0 = (p124p.p170k.p171a.C1482e.C1483a) r0
            p.k.a.e r0 = p124p.p170k.p171a.C1482e.this
            if (r0 == 0) goto L_0x019e
            goto L_0x019f
        L_0x019e:
            throw r14
        L_0x019f:
            p.k.a.i r0 = r6.f4394t
            android.content.Context r0 = r0.f4362f
            r6.mo6105a(r7, r0, r13)
            boolean r0 = r7.f603T
            if (r0 != 0) goto L_0x01e1
            android.os.Bundle r0 = r7.f611f
            r6.mo6133c(r7, r0, r13)
            android.os.Bundle r0 = r7.f611f
            p.k.a.k r1 = r7.f629x
            r1.mo6160m()
            r7.f610e = r8
            r7.f592I = r13
            p.r.b r1 = r7.f608Y
            r1.mo6461a(r0)
            r7.mo799b(r0)
            r7.f603T = r8
            boolean r0 = r7.f592I
            if (r0 == 0) goto L_0x01d5
            p.n.i r0 = r7.f605V
            p.n.e$a r1 = p124p.p177n.C1537e.C1538a.ON_CREATE
            r0.mo6230a(r1)
            android.os.Bundle r0 = r7.f611f
            r6.mo6125b(r7, r0, r13)
            goto L_0x0206
        L_0x01d5:
            p.k.a.d0 r0 = new p.k.a.d0
            java.lang.String r1 = " did not call through to super.onCreate()"
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4749a(r12, r7, r1)
            r0.<init>(r1)
            throw r0
        L_0x01e1:
            android.os.Bundle r0 = r7.f611f
            if (r0 == 0) goto L_0x01f7
            java.lang.String r1 = "android:support:fragments"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            if (r0 == 0) goto L_0x01f7
            p.k.a.k r1 = r7.f629x
            r1.mo6101a(r0)
            p.k.a.k r0 = r7.f629x
            r0.mo6147g()
        L_0x01f7:
            r7.f610e = r8
            goto L_0x0206
        L_0x01fa:
            p.k.a.d0 r0 = new p.k.a.d0
            java.lang.String r1 = " did not call through to super.onAttach()"
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4749a(r12, r7, r1)
            r0.<init>(r1)
            throw r0
        L_0x0206:
            r0 = 8
            if (r11 <= 0) goto L_0x0242
            boolean r1 = r7.f622q
            if (r1 == 0) goto L_0x0242
            boolean r1 = r7.f625t
            if (r1 != 0) goto L_0x0242
            android.os.Bundle r1 = r7.f611f
            android.view.LayoutInflater r1 = r7.mo802c(r1)
            r7.f602S = r1
            android.os.Bundle r2 = r7.f611f
            r7.mo800b(r1, r14, r2)
            android.view.View r1 = r7.f594K
            if (r1 == 0) goto L_0x0240
            r7.f595L = r1
            r1.setSaveFromParentEnabled(r13)
            boolean r1 = r7.f586C
            if (r1 == 0) goto L_0x0231
            android.view.View r1 = r7.f594K
            r1.setVisibility(r0)
        L_0x0231:
            android.view.View r1 = r7.f594K
            android.os.Bundle r2 = r7.f611f
            r7.mo795a(r1, r2)
            android.view.View r1 = r7.f594K
            android.os.Bundle r2 = r7.f611f
            r6.mo6107a(r7, r1, r2, r13)
            goto L_0x0242
        L_0x0240:
            r7.f595L = r14
        L_0x0242:
            if (r11 <= r8) goto L_0x0342
            boolean r1 = r7.f622q
            if (r1 != 0) goto L_0x02f3
            int r1 = r7.f584A
            if (r1 == 0) goto L_0x02a8
            r2 = -1
            if (r1 == r2) goto L_0x0297
            p.k.a.f r2 = r6.f4395u
            android.view.View r1 = r2.mo6065a(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 != 0) goto L_0x02a9
            boolean r2 = r7.f624s
            if (r2 == 0) goto L_0x025e
            goto L_0x02a9
        L_0x025e:
            android.content.res.Resources r0 = r17.mo797a0()     // Catch:{ NotFoundException -> 0x0269 }
            int r1 = r7.f584A     // Catch:{ NotFoundException -> 0x0269 }
            java.lang.String r0 = r0.getResourceName(r1)     // Catch:{ NotFoundException -> 0x0269 }
            goto L_0x026b
        L_0x0269:
            java.lang.String r0 = "unknown"
        L_0x026b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "No view found for id 0x"
            java.lang.StringBuilder r2 = p213q.p214a.p215a.p216a.C1965a.m4756a(r2)
            int r3 = r7.f584A
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            r6.mo6110a(r1)
            throw r14
        L_0x0297:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot create fragment "
            java.lang.String r2 = " for a container view with no id"
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4749a(r1, r7, r2)
            r0.<init>(r1)
            r6.mo6110a(r0)
            throw r14
        L_0x02a8:
            r1 = r14
        L_0x02a9:
            r7.f593J = r1
            android.os.Bundle r2 = r7.f611f
            android.view.LayoutInflater r2 = r7.mo802c(r2)
            r7.f602S = r2
            android.os.Bundle r3 = r7.f611f
            r7.mo800b(r2, r1, r3)
            android.view.View r2 = r7.f594K
            if (r2 == 0) goto L_0x02f1
            r7.f595L = r2
            r2.setSaveFromParentEnabled(r13)
            if (r1 == 0) goto L_0x02c8
            android.view.View r2 = r7.f594K
            r1.addView(r2)
        L_0x02c8:
            boolean r1 = r7.f586C
            if (r1 == 0) goto L_0x02d1
            android.view.View r1 = r7.f594K
            r1.setVisibility(r0)
        L_0x02d1:
            android.view.View r0 = r7.f594K
            android.os.Bundle r1 = r7.f611f
            r7.mo795a(r0, r1)
            android.view.View r0 = r7.f594K
            android.os.Bundle r1 = r7.f611f
            r6.mo6107a(r7, r0, r1, r13)
            android.view.View r0 = r7.f594K
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x02ed
            android.view.ViewGroup r0 = r7.f593J
            if (r0 == 0) goto L_0x02ed
            r0 = r8
            goto L_0x02ee
        L_0x02ed:
            r0 = r13
        L_0x02ee:
            r7.f599P = r0
            goto L_0x02f3
        L_0x02f1:
            r7.f595L = r14
        L_0x02f3:
            android.os.Bundle r0 = r7.f611f
            p.k.a.k r1 = r7.f629x
            r1.mo6160m()
            r7.f610e = r9
            r7.f592I = r13
            r7.mo792a(r0)
            boolean r0 = r7.f592I
            if (r0 == 0) goto L_0x0336
            p.k.a.k r0 = r7.f629x
            r0.f4399y = r13
            r0.f4400z = r13
            r0.mo6122b(r9)
            android.os.Bundle r0 = r7.f611f
            r6.mo6106a(r7, r0, r13)
            android.view.View r0 = r7.f594K
            if (r0 == 0) goto L_0x0333
            android.util.SparseArray<android.os.Parcelable> r0 = r7.f612g
            if (r0 == 0) goto L_0x0322
            android.view.View r1 = r7.f595L
            r1.restoreHierarchyState(r0)
            r7.f612g = r14
        L_0x0322:
            r7.f592I = r13
            r7.f592I = r8
            android.view.View r0 = r7.f594K
            if (r0 == 0) goto L_0x0333
            p.k.a.c0 r0 = r7.f606W
            p.n.e$a r1 = p124p.p177n.C1537e.C1538a.ON_CREATE
            p.n.i r0 = r0.f4348e
            r0.mo6230a(r1)
        L_0x0333:
            r7.f611f = r14
            goto L_0x0342
        L_0x0336:
            p.k.a.d0 r0 = new p.k.a.d0
            java.lang.String r1 = " did not call through to super.onActivityCreated()"
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4749a(r12, r7, r1)
            r0.<init>(r1)
            throw r0
        L_0x0342:
            if (r11 <= r9) goto L_0x0388
            p.k.a.k r0 = r7.f629x
            r0.mo6160m()
            p.k.a.k r0 = r7.f629x
            r0.mo6158k()
            r0 = 3
            r7.f610e = r0
            r7.f592I = r13
            r17.mo819m0()
            boolean r0 = r7.f592I
            if (r0 == 0) goto L_0x037c
            p.n.i r0 = r7.f605V
            p.n.e$a r1 = p124p.p177n.C1537e.C1538a.ON_START
            r0.mo6230a(r1)
            android.view.View r0 = r7.f594K
            if (r0 == 0) goto L_0x036e
            p.k.a.c0 r0 = r7.f606W
            p.n.e$a r1 = p124p.p177n.C1537e.C1538a.ON_START
            p.n.i r0 = r0.f4348e
            r0.mo6230a(r1)
        L_0x036e:
            p.k.a.k r0 = r7.f629x
            r0.f4399y = r13
            r0.f4400z = r13
            r1 = 3
            r0.mo6122b(r1)
            r6.mo6146f(r7, r13)
            goto L_0x0388
        L_0x037c:
            p.k.a.d0 r0 = new p.k.a.d0
            java.lang.String r1 = " did not call through to super.onStart()"
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4749a(r12, r7, r1)
            r0.<init>(r1)
            throw r0
        L_0x0388:
            r10 = 3
        L_0x0389:
            if (r11 <= r10) goto L_0x06f5
            p.k.a.k r0 = r7.f629x
            r0.mo6160m()
            p.k.a.k r0 = r7.f629x
            r0.mo6158k()
            r0 = 4
            r7.f610e = r0
            r7.f592I = r13
            r17.mo818l0()
            boolean r0 = r7.f592I
            if (r0 == 0) goto L_0x03cd
            p.n.i r0 = r7.f605V
            p.n.e$a r1 = p124p.p177n.C1537e.C1538a.ON_RESUME
            r0.mo6230a(r1)
            android.view.View r0 = r7.f594K
            if (r0 == 0) goto L_0x03b5
            p.k.a.c0 r0 = r7.f606W
            p.n.e$a r1 = p124p.p177n.C1537e.C1538a.ON_RESUME
            p.n.i r0 = r0.f4348e
            r0.mo6230a(r1)
        L_0x03b5:
            p.k.a.k r0 = r7.f629x
            r0.f4399y = r13
            r0.f4400z = r13
            r1 = 4
            r0.mo6122b(r1)
            p.k.a.k r0 = r7.f629x
            r0.mo6158k()
            r6.mo6142e(r7, r13)
            r7.f611f = r14
            r7.f612g = r14
            goto L_0x06f5
        L_0x03cd:
            p.k.a.d0 r0 = new p.k.a.d0
            java.lang.String r1 = " did not call through to super.onResume()"
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4749a(r12, r7, r1)
            r0.<init>(r1)
            throw r0
        L_0x03d9:
            if (r0 <= r11) goto L_0x06f5
            if (r0 == r8) goto L_0x0551
            if (r0 == r9) goto L_0x0457
            r1 = 3
            if (r0 == r1) goto L_0x041e
            r2 = 4
            if (r0 == r2) goto L_0x03e7
            goto L_0x06f5
        L_0x03e7:
            if (r11 >= r2) goto L_0x041e
            p.k.a.k r0 = r7.f629x
            r0.mo6122b(r1)
            android.view.View r0 = r7.f594K
            if (r0 == 0) goto L_0x03fb
            p.k.a.c0 r0 = r7.f606W
            p.n.e$a r1 = p124p.p177n.C1537e.C1538a.ON_PAUSE
            p.n.i r0 = r0.f4348e
            r0.mo6230a(r1)
        L_0x03fb:
            p.n.i r0 = r7.f605V
            p.n.e$a r1 = p124p.p177n.C1537e.C1538a.ON_PAUSE
            r0.mo6230a(r1)
            r0 = 3
            r7.f610e = r0
            r7.f592I = r13
            r17.mo817k0()
            boolean r0 = r7.f592I
            if (r0 == 0) goto L_0x0412
            r6.mo6139d(r7, r13)
            goto L_0x041e
        L_0x0412:
            p.k.a.d0 r0 = new p.k.a.d0
            java.lang.String r1 = " did not call through to super.onPause()"
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4749a(r12, r7, r1)
            r0.<init>(r1)
            throw r0
        L_0x041e:
            r0 = 3
            if (r11 >= r0) goto L_0x0457
            p.k.a.k r0 = r7.f629x
            r0.f4400z = r8
            r0.mo6122b(r9)
            android.view.View r0 = r7.f594K
            if (r0 == 0) goto L_0x0435
            p.k.a.c0 r0 = r7.f606W
            p.n.e$a r1 = p124p.p177n.C1537e.C1538a.ON_STOP
            p.n.i r0 = r0.f4348e
            r0.mo6230a(r1)
        L_0x0435:
            p.n.i r0 = r7.f605V
            p.n.e$a r1 = p124p.p177n.C1537e.C1538a.ON_STOP
            r0.mo6230a(r1)
            r7.f610e = r9
            r7.f592I = r13
            r17.mo820n0()
            boolean r0 = r7.f592I
            if (r0 == 0) goto L_0x044b
            r6.mo6149g(r7, r13)
            goto L_0x0457
        L_0x044b:
            p.k.a.d0 r0 = new p.k.a.d0
            java.lang.String r1 = " did not call through to super.onStop()"
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4749a(r12, r7, r1)
            r0.<init>(r1)
            throw r0
        L_0x0457:
            if (r11 >= r9) goto L_0x0551
            android.view.View r0 = r7.f594K
            if (r0 == 0) goto L_0x0471
            p.k.a.i r0 = r6.f4394t
            p.k.a.e$a r0 = (p124p.p170k.p171a.C1482e.C1483a) r0
            p.k.a.e r0 = p124p.p170k.p171a.C1482e.this
            boolean r0 = r0.isFinishing()
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x0471
            android.util.SparseArray<android.os.Parcelable> r0 = r7.f612g
            if (r0 != 0) goto L_0x0471
            r16.mo6156j(r17)
        L_0x0471:
            p.k.a.k r0 = r7.f629x
            r0.mo6122b(r8)
            android.view.View r0 = r7.f594K
            if (r0 == 0) goto L_0x0483
            p.k.a.c0 r0 = r7.f606W
            p.n.e$a r1 = p124p.p177n.C1537e.C1538a.ON_DESTROY
            p.n.i r0 = r0.f4348e
            r0.mo6230a(r1)
        L_0x0483:
            r7.f610e = r8
            r7.f592I = r13
            r17.mo815i0()
            boolean r0 = r7.f592I
            if (r0 == 0) goto L_0x0545
            p.o.a.a r0 = p124p.p178o.p179a.C1561a.m3960a(r17)
            p.o.a.b r0 = (p124p.p178o.p179a.C1562b) r0
            p.o.a.b$c r0 = r0.f4580b
            p.e.i<p.o.a.b$a> r1 = r0.f4584b
            int r1 = r1.mo5617c()
            r2 = r13
        L_0x049d:
            if (r2 >= r1) goto L_0x04ac
            p.e.i<p.o.a.b$a> r3 = r0.f4584b
            java.lang.Object r3 = r3.mo5621d(r2)
            p.o.a.b$a r3 = (p124p.p178o.p179a.C1562b.C1563a) r3
            p.n.h r3 = r3.f4581k
            int r2 = r2 + 1
            goto L_0x049d
        L_0x04ac:
            r7.f625t = r13
            r6.mo6152h(r7, r13)
            android.view.View r0 = r7.f594K
            if (r0 == 0) goto L_0x0535
            android.view.ViewGroup r1 = r7.f593J
            if (r1 == 0) goto L_0x0535
            r1.endViewTransition(r0)
            android.view.View r0 = r7.f594K
            r0.clearAnimation()
            androidx.fragment.app.Fragment r0 = r7.f630y
            if (r0 == 0) goto L_0x04c9
            boolean r0 = r0.f621p
            if (r0 != 0) goto L_0x0535
        L_0x04c9:
            int r0 = r6.f4393s
            r1 = 0
            if (r0 <= 0) goto L_0x04e9
            boolean r0 = r6.f4371A
            if (r0 != 0) goto L_0x04e9
            android.view.View r0 = r7.f594K
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x04e9
            float r0 = r7.f601R
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x04e9
            r0 = r19
            r2 = r20
            p.k.a.k$d r0 = r6.mo6097a(r7, r0, r13, r2)
            goto L_0x04ea
        L_0x04e9:
            r0 = r14
        L_0x04ea:
            r7.f601R = r1
            if (r0 == 0) goto L_0x052e
            android.view.View r1 = r7.f594K
            android.view.ViewGroup r2 = r7.f593J
            r2.startViewTransition(r1)
            androidx.fragment.app.Fragment$b r3 = r17.mo776P()
            r3.f636c = r11
            android.view.animation.Animation r3 = r0.f4404a
            if (r3 == 0) goto L_0x0519
            p.k.a.k$e r3 = new p.k.a.k$e
            android.view.animation.Animation r0 = r0.f4404a
            r3.<init>(r0, r2, r1)
            android.view.View r0 = r7.f594K
            r7.mo794a(r0)
            p.k.a.l r0 = new p.k.a.l
            r0.<init>(r6, r2, r7)
            r3.setAnimationListener(r0)
            android.view.View r0 = r7.f594K
            r0.startAnimation(r3)
            goto L_0x052e
        L_0x0519:
            android.animation.Animator r0 = r0.f4405b
            r7.mo789a(r0)
            p.k.a.m r3 = new p.k.a.m
            r3.<init>(r6, r2, r1, r7)
            r0.addListener(r3)
            android.view.View r1 = r7.f594K
            r0.setTarget(r1)
            r0.start()
        L_0x052e:
            android.view.ViewGroup r0 = r7.f593J
            android.view.View r1 = r7.f594K
            r0.removeView(r1)
        L_0x0535:
            r7.f593J = r14
            r7.f594K = r14
            r7.f606W = r14
            p.n.n<p.n.h> r0 = r7.f607X
            r0.mo840b(r14)
            r7.f595L = r14
            r7.f623r = r13
            goto L_0x0551
        L_0x0545:
            p.k.a.d0 r0 = new p.k.a.d0
            java.lang.String r1 = " did not call through to super.onDestroyView()"
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4749a(r12, r7, r1)
            r0.<init>(r1)
            throw r0
        L_0x0551:
            if (r11 >= r8) goto L_0x06f5
            boolean r0 = r6.f4371A
            if (r0 == 0) goto L_0x0578
            android.view.View r0 = r17.mo778R()
            if (r0 == 0) goto L_0x0568
            android.view.View r0 = r17.mo778R()
            r7.mo794a(r14)
            r0.clearAnimation()
            goto L_0x0578
        L_0x0568:
            android.animation.Animator r0 = r17.mo779S()
            if (r0 == 0) goto L_0x0578
            android.animation.Animator r0 = r17.mo779S()
            r7.mo789a(r14)
            r0.cancel()
        L_0x0578:
            android.view.View r0 = r17.mo778R()
            if (r0 != 0) goto L_0x06ee
            android.animation.Animator r0 = r17.mo779S()
            if (r0 == 0) goto L_0x0586
            goto L_0x06ee
        L_0x0586:
            boolean r0 = r7.f621p
            if (r0 == 0) goto L_0x0592
            boolean r0 = r17.mo812g0()
            if (r0 != 0) goto L_0x0592
            r0 = r8
            goto L_0x0593
        L_0x0592:
            r0 = r13
        L_0x0593:
            if (r0 != 0) goto L_0x05a1
            p.k.a.p r1 = r6.f4379I
            boolean r1 = r1.mo6183a(r7)
            if (r1 == 0) goto L_0x059e
            goto L_0x05a1
        L_0x059e:
            r7.f610e = r13
            goto L_0x0609
        L_0x05a1:
            p.k.a.i r1 = r6.f4394t
            boolean r2 = r1 instanceof p124p.p177n.C1560w
            if (r2 == 0) goto L_0x05ac
            p.k.a.p r1 = r6.f4379I
            boolean r8 = r1.f4442f
            goto L_0x05b9
        L_0x05ac:
            android.content.Context r1 = r1.f4362f
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L_0x05b9
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            r8 = r8 ^ r1
        L_0x05b9:
            if (r0 != 0) goto L_0x05bd
            if (r8 == 0) goto L_0x05ed
        L_0x05bd:
            p.k.a.p r1 = r6.f4379I
            if (r1 == 0) goto L_0x06ed
            java.util.HashMap<java.lang.String, p.k.a.p> r2 = r1.f4439c
            java.lang.String r3 = r7.f614i
            java.lang.Object r2 = r2.get(r3)
            p.k.a.p r2 = (p124p.p170k.p171a.C1507p) r2
            if (r2 == 0) goto L_0x05d7
            r2.mo6184b()
            java.util.HashMap<java.lang.String, p.k.a.p> r2 = r1.f4439c
            java.lang.String r3 = r7.f614i
            r2.remove(r3)
        L_0x05d7:
            java.util.HashMap<java.lang.String, p.n.v> r2 = r1.f4440d
            java.lang.String r3 = r7.f614i
            java.lang.Object r2 = r2.get(r3)
            p.n.v r2 = (p124p.p177n.C1559v) r2
            if (r2 == 0) goto L_0x05ed
            r2.mo6253a()
            java.util.HashMap<java.lang.String, p.n.v> r1 = r1.f4440d
            java.lang.String r2 = r7.f614i
            r1.remove(r2)
        L_0x05ed:
            p.k.a.k r1 = r7.f629x
            r1.mo6150h()
            p.n.i r1 = r7.f605V
            p.n.e$a r2 = p124p.p177n.C1537e.C1538a.ON_DESTROY
            r1.mo6230a(r2)
            r7.f610e = r13
            r7.f592I = r13
            r7.f603T = r13
            r17.mo813h0()
            boolean r1 = r7.f592I
            if (r1 == 0) goto L_0x06e1
            r6.mo6126b(r7, r13)
        L_0x0609:
            r7.f592I = r13
            r17.mo816j0()
            r7.f602S = r14
            boolean r1 = r7.f592I
            if (r1 == 0) goto L_0x06d5
            p.k.a.k r1 = r7.f629x
            boolean r2 = r1.f4371A
            if (r2 != 0) goto L_0x0624
            r1.mo6150h()
            p.k.a.k r1 = new p.k.a.k
            r1.<init>()
            r7.f629x = r1
        L_0x0624:
            r6.mo6134c(r7, r13)
            if (r21 != 0) goto L_0x06f5
            if (r0 != 0) goto L_0x0650
            p.k.a.p r0 = r6.f4379I
            boolean r0 = r0.mo6183a(r7)
            if (r0 == 0) goto L_0x0634
            goto L_0x0650
        L_0x0634:
            r7.f628w = r14
            r7.f630y = r14
            r7.f627v = r14
            java.lang.String r0 = r7.f617l
            if (r0 == 0) goto L_0x06f5
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.f4385k
            java.lang.Object r0 = r1.get(r0)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x06f5
            boolean r1 = r0.f588E
            if (r1 == 0) goto L_0x06f5
            r7.f616k = r0
            goto L_0x06f5
        L_0x0650:
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r6.f4385k
            java.lang.String r1 = r7.f614i
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x065c
            goto L_0x06f5
        L_0x065c:
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r6.f4385k
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0666:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0683
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L_0x0666
            java.lang.String r2 = r7.f614i
            java.lang.String r3 = r1.f617l
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0666
            r1.f616k = r7
            r1.f617l = r14
            goto L_0x0666
        L_0x0683:
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r6.f4385k
            java.lang.String r1 = r7.f614i
            r0.put(r1, r14)
            boolean r0 = r16.mo6094b()
            if (r0 == 0) goto L_0x0691
            goto L_0x0698
        L_0x0691:
            p.k.a.p r0 = r6.f4379I
            java.util.HashSet<androidx.fragment.app.Fragment> r0 = r0.f4438b
            r0.remove(r7)
        L_0x0698:
            java.lang.String r0 = r7.f617l
            if (r0 == 0) goto L_0x06a6
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.f4385k
            java.lang.Object r0 = r1.get(r0)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r7.f616k = r0
        L_0x06a6:
            r17.mo806d0()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r7.f614i = r0
            r7.f620o = r13
            r7.f621p = r13
            r7.f622q = r13
            r7.f623r = r13
            r7.f624s = r13
            r7.f626u = r13
            r7.f627v = r14
            p.k.a.k r0 = new p.k.a.k
            r0.<init>()
            r7.f629x = r0
            r7.f628w = r14
            r7.f631z = r13
            r7.f584A = r13
            r7.f585B = r14
            r7.f586C = r13
            r7.f587D = r13
            goto L_0x06f5
        L_0x06d5:
            p.k.a.d0 r0 = new p.k.a.d0
            java.lang.String r1 = " did not call through to super.onDetach()"
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4749a(r12, r7, r1)
            r0.<init>(r1)
            throw r0
        L_0x06e1:
            p.k.a.d0 r0 = new p.k.a.d0
            java.lang.String r1 = " did not call through to super.onDestroy()"
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4749a(r12, r7, r1)
            r0.<init>(r1)
            throw r0
        L_0x06ed:
            throw r14
        L_0x06ee:
            androidx.fragment.app.Fragment$b r0 = r17.mo776P()
            r0.f636c = r11
            goto L_0x06f6
        L_0x06f5:
            r8 = r11
        L_0x06f6:
            int r0 = r7.f610e
            if (r0 == r8) goto L_0x0724
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r7.f610e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.w(r1, r0)
            r7.f610e = r8
        L_0x0724:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p170k.p171a.C1490k.mo6104a(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    /* renamed from: a */
    public boolean mo6120a(ArrayList<C1472a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        ArrayList<C1472a> arrayList3 = this.f4386l;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f4386l.remove(size));
            arrayList2.add(Boolean.valueOf(true));
        } else {
            int i3 = -1;
            if (str != null || i >= 0) {
                int size2 = this.f4386l.size() - 1;
                while (size2 >= 0) {
                    C1472a aVar = (C1472a) this.f4386l.get(size2);
                    if ((str != null && str.equals(aVar.f4466i)) || (i >= 0 && i == aVar.f4318t)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C1472a aVar2 = (C1472a) this.f4386l.get(size2);
                        if ((str == null || !str.equals(aVar2.f4466i)) && (i < 0 || i != aVar2.f4318t)) {
                            break;
                        }
                    }
                }
                i3 = size2;
            }
            if (i3 == this.f4386l.size() - 1) {
                return false;
            }
            for (int size3 = this.f4386l.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f4386l.remove(size3));
                arrayList2.add(Boolean.valueOf(true));
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo6101a(Parcelable parcelable) {
        Bundle bundle;
        Fragment fragment;
        C1509q qVar;
        if (parcelable != null) {
            C1505o oVar = (C1505o) parcelable;
            if (oVar.f4432e != null) {
                for (Fragment fragment2 : this.f4379I.f4438b) {
                    Iterator it = oVar.f4432e.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            qVar = null;
                            break;
                        }
                        qVar = (C1509q) it.next();
                        if (qVar.f4445f.equals(fragment2.f614i)) {
                            break;
                        }
                    }
                    if (qVar == null) {
                        Fragment fragment3 = fragment2;
                        mo6104a(fragment3, 1, 0, 0, false);
                        fragment2.f621p = true;
                        mo6104a(fragment3, 0, 0, 0, false);
                    } else {
                        qVar.f4457r = fragment2;
                        fragment2.f612g = null;
                        fragment2.f626u = 0;
                        fragment2.f623r = false;
                        fragment2.f620o = false;
                        Fragment fragment4 = fragment2.f616k;
                        fragment2.f617l = fragment4 != null ? fragment4.f614i : null;
                        fragment2.f616k = null;
                        Bundle bundle2 = qVar.f4456q;
                        if (bundle2 != null) {
                            bundle2.setClassLoader(this.f4394t.f4362f.getClassLoader());
                            fragment2.f612g = qVar.f4456q.getSparseParcelableArray("android:view_state");
                            fragment2.f611f = qVar.f4456q;
                        }
                    }
                }
                this.f4385k.clear();
                Iterator it2 = oVar.f4432e.iterator();
                while (it2.hasNext()) {
                    C1509q qVar2 = (C1509q) it2.next();
                    if (qVar2 != null) {
                        ClassLoader classLoader = this.f4394t.f4362f.getClassLoader();
                        C1486h l = mo6159l();
                        if (qVar2.f4457r == null) {
                            Bundle bundle3 = qVar2.f4453n;
                            if (bundle3 != null) {
                                bundle3.setClassLoader(classLoader);
                            }
                            Fragment a = l.mo6086a(classLoader, qVar2.f4444e);
                            qVar2.f4457r = a;
                            a.mo807e(qVar2.f4453n);
                            Bundle bundle4 = qVar2.f4456q;
                            if (bundle4 != null) {
                                bundle4.setClassLoader(classLoader);
                                fragment = qVar2.f4457r;
                                bundle = qVar2.f4456q;
                            } else {
                                fragment = qVar2.f4457r;
                                bundle = new Bundle();
                            }
                            fragment.f611f = bundle;
                            Fragment fragment5 = qVar2.f4457r;
                            fragment5.f614i = qVar2.f4445f;
                            fragment5.f622q = qVar2.f4446g;
                            fragment5.f624s = true;
                            fragment5.f631z = qVar2.f4447h;
                            fragment5.f584A = qVar2.f4448i;
                            fragment5.f585B = qVar2.f4449j;
                            fragment5.f588E = qVar2.f4450k;
                            fragment5.f621p = qVar2.f4451l;
                            fragment5.f587D = qVar2.f4452m;
                            fragment5.f586C = qVar2.f4454o;
                            fragment5.f604U = C1539b.values()[qVar2.f4455p];
                            if (f4368K) {
                                StringBuilder a2 = C1965a.m4756a("Instantiated fragment ");
                                a2.append(qVar2.f4457r);
                                Log.v("FragmentManager", a2.toString());
                            }
                        }
                        Fragment fragment6 = qVar2.f4457r;
                        fragment6.f627v = this;
                        this.f4385k.put(fragment6.f614i, fragment6);
                        qVar2.f4457r = null;
                    }
                }
                this.f4384j.clear();
                ArrayList<String> arrayList = oVar.f4433f;
                if (arrayList != null) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        String str = (String) it3.next();
                        Fragment fragment7 = (Fragment) this.f4385k.get(str);
                        if (fragment7 != null) {
                            fragment7.f620o = true;
                            if (!this.f4384j.contains(fragment7)) {
                                synchronized (this.f4384j) {
                                    this.f4384j.add(fragment7);
                                }
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Already added ");
                                sb.append(fragment7);
                                throw new IllegalStateException(sb.toString());
                            }
                        } else {
                            mo6110a((RuntimeException) new IllegalStateException(C1965a.m4752a("No instantiated fragment for (", str, ")")));
                            throw null;
                        }
                    }
                }
                if (oVar.f4434g != null) {
                    this.f4386l = new ArrayList<>(oVar.f4434g.length);
                    int i = 0;
                    while (true) {
                        C1474b[] bVarArr = oVar.f4434g;
                        if (i >= bVarArr.length) {
                            break;
                        }
                        C1474b bVar = bVarArr[i];
                        if (bVar != null) {
                            C1472a aVar = new C1472a(this);
                            int i2 = 0;
                            int i3 = 0;
                            while (i2 < bVar.f4321e.length) {
                                C1512a aVar2 = new C1512a();
                                int i4 = i2 + 1;
                                aVar2.f4475a = bVar.f4321e[i2];
                                if (f4368K) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Instantiate ");
                                    sb2.append(aVar);
                                    sb2.append(" op #");
                                    sb2.append(i3);
                                    sb2.append(" base fragment #");
                                    sb2.append(bVar.f4321e[i4]);
                                    Log.v("FragmentManager", sb2.toString());
                                }
                                String str2 = (String) bVar.f4322f.get(i3);
                                aVar2.f4476b = str2 != null ? (Fragment) this.f4385k.get(str2) : null;
                                aVar2.f4481g = C1539b.values()[bVar.f4323g[i3]];
                                aVar2.f4482h = C1539b.values()[bVar.f4324h[i3]];
                                int[] iArr = bVar.f4321e;
                                int i5 = i4 + 1;
                                int i6 = iArr[i4];
                                aVar2.f4477c = i6;
                                int i7 = i5 + 1;
                                int i8 = iArr[i5];
                                aVar2.f4478d = i8;
                                int i9 = i7 + 1;
                                int i10 = iArr[i7];
                                aVar2.f4479e = i10;
                                int i11 = i9 + 1;
                                int i12 = iArr[i9];
                                aVar2.f4480f = i12;
                                aVar.f4459b = i6;
                                aVar.f4460c = i8;
                                aVar.f4461d = i10;
                                aVar.f4462e = i12;
                                aVar.mo6195a(aVar2);
                                i3++;
                                i2 = i11;
                            }
                            aVar.f4463f = bVar.f4325i;
                            aVar.f4464g = bVar.f4326j;
                            aVar.f4466i = bVar.f4327k;
                            aVar.f4318t = bVar.f4328l;
                            aVar.f4465h = true;
                            aVar.f4467j = bVar.f4329m;
                            aVar.f4468k = bVar.f4330n;
                            aVar.f4469l = bVar.f4331o;
                            aVar.f4470m = bVar.f4332p;
                            aVar.f4471n = bVar.f4333q;
                            aVar.f4472o = bVar.f4334r;
                            aVar.f4473p = bVar.f4335s;
                            aVar.mo6028a(1);
                            this.f4386l.add(aVar);
                            int i13 = aVar.f4318t;
                            if (i13 >= 0) {
                                mo6098a(i13, aVar);
                            }
                            i++;
                        } else {
                            throw null;
                        }
                    }
                } else {
                    this.f4386l = null;
                }
                String str3 = oVar.f4435h;
                if (str3 != null) {
                    Fragment fragment8 = (Fragment) this.f4385k.get(str3);
                    this.f4397w = fragment8;
                    mo6132c(fragment8);
                }
                this.f4383i = oVar.f4436i;
            }
        }
    }

    /* renamed from: a */
    public void mo6108a(Fragment fragment, C1539b bVar) {
        if (this.f4385k.get(fragment.f614i) == fragment && (fragment.f628w == null || fragment.f627v == this)) {
            fragment.f604U = bVar;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo6110a(RuntimeException runtimeException) {
        String str = "FragmentManager";
        Log.e(str, runtimeException.getMessage());
        Log.e(str, "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C1382b(str));
        C1487i iVar = this.f4394t;
        String str2 = "Failed dumping state";
        String str3 = "  ";
        if (iVar != null) {
            try {
                C1482e.this.dump(str3, null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e(str, str2, e);
            }
        } else {
            mo6092a(str3, (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }
}
