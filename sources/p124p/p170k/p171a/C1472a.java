package p124p.p170k.p171a;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment.C0083b;
import java.io.PrintWriter;
import java.util.ArrayList;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p150h.p161k.C1382b;
import p124p.p170k.p171a.C1490k.C1498h;
import p124p.p170k.p171a.C1511r.C1512a;
import p124p.p177n.C1537e.C1539b;
import p213q.p214a.p215a.p216a.C1965a;
import p410v.p411m0.p412c.C4744e;

/* renamed from: p.k.a.a */
public final class C1472a extends C1511r implements C1498h {

    /* renamed from: r */
    public final C1490k f4316r;

    /* renamed from: s */
    public boolean f4317s;

    /* renamed from: t */
    public int f4318t = -1;

    public C1472a(C1490k kVar) {
        this.f4316r = kVar;
    }

    /* renamed from: a */
    public int mo6024a() {
        return mo6025a(false);
    }

    /* renamed from: a */
    public int mo6025a(boolean z) {
        if (!this.f4317s) {
            if (C1490k.f4368K) {
                StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                String str = "FragmentManager";
                Log.v(str, sb.toString());
                PrintWriter printWriter = new PrintWriter(new C1382b(str));
                mo6030a("  ", printWriter, true);
                printWriter.close();
            }
            this.f4317s = true;
            this.f4318t = this.f4465h ? this.f4316r.mo6096a(this) : -1;
            this.f4316r.mo6116a((C1498h) this, z);
            return this.f4318t;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: a */
    public C1511r mo6026a(Fragment fragment) {
        C1490k kVar = fragment.f627v;
        if (kVar == null || kVar == this.f4316r) {
            super.mo6026a(fragment);
            return this;
        }
        StringBuilder a = C1965a.m4756a("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        a.append(fragment.toString());
        a.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(a.toString());
    }

    /* renamed from: a */
    public C1511r mo6027a(Fragment fragment, C1539b bVar) {
        if (fragment.f627v != this.f4316r) {
            StringBuilder a = C1965a.m4756a("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            a.append(this.f4316r);
            throw new IllegalArgumentException(a.toString());
        } else if (bVar.mo6228a(C1539b.CREATED)) {
            super.mo6027a(fragment, bVar);
            return this;
        } else {
            StringBuilder a2 = C1965a.m4756a("Cannot set maximum Lifecycle below ");
            a2.append(C1539b.CREATED);
            throw new IllegalArgumentException(a2.toString());
        }
    }

    /* renamed from: a */
    public void mo6028a(int i) {
        if (this.f4465h) {
            String str = "FragmentManager";
            if (C1490k.f4368K) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
                Log.v(str, sb.toString());
            }
            int size = this.f4458a.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1512a aVar = (C1512a) this.f4458a.get(i2);
                Fragment fragment = aVar.f4476b;
                if (fragment != null) {
                    fragment.f626u += i;
                    if (C1490k.f4368K) {
                        StringBuilder a = C1965a.m4756a("Bump nesting of ");
                        a.append(aVar.f4476b);
                        a.append(" to ");
                        a.append(aVar.f4476b.f626u);
                        Log.v(str, a.toString());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6029a(int i, Fragment fragment, String str, int i2) {
        super.mo6029a(i, fragment, str, i2);
        fragment.f627v = this.f4316r;
    }

    /* renamed from: a */
    public void mo6030a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4466i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f4318t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f4317s);
            if (this.f4463f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4463f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f4464g));
            }
            if (!(this.f4459b == 0 && this.f4460c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4459b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4460c));
            }
            if (!(this.f4461d == 0 && this.f4462e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4461d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4462e));
            }
            if (!(this.f4467j == 0 && this.f4468k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4467j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4468k);
            }
            if (!(this.f4469l == 0 && this.f4470m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4469l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f4470m);
            }
        }
        if (!this.f4458a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f4458a.size();
            for (int i = 0; i < size; i++) {
                C1512a aVar = (C1512a) this.f4458a.get(i);
                switch (aVar.f4475a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = C4744e.f11157B;
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder a = C1965a.m4756a("cmd=");
                        a.append(aVar.f4475a);
                        str2 = a.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f4476b);
                if (z) {
                    if (!(aVar.f4477c == 0 && aVar.f4478d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f4477c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f4478d));
                    }
                    if (aVar.f4479e != 0 || aVar.f4480f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f4479e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f4480f));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo6031a(ArrayList<C1472a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f4458a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = ((C1512a) this.f4458a.get(i4)).f4476b;
            int i5 = fragment != null ? fragment.f584A : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C1472a aVar = (C1472a) arrayList.get(i6);
                    int size2 = aVar.f4458a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = ((C1512a) aVar.f4458a.get(i7)).f4476b;
                        if ((fragment2 != null ? fragment2.f584A : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo6033b() {
        if (!this.f4465h) {
            C1490k kVar = this.f4316r;
            kVar.mo6136c(false);
            if (mo6032a(kVar.f4373C, kVar.f4374D)) {
                kVar.f4382h = true;
                try {
                    kVar.mo6135c(kVar.f4373C, kVar.f4374D);
                } finally {
                    kVar.mo6144f();
                }
            }
            kVar.mo6166q();
            kVar.mo6155j();
            kVar.mo6137d();
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: b */
    public boolean mo6035b(int i) {
        int size = this.f4458a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = ((C1512a) this.f4458a.get(i2)).f4476b;
            int i3 = fragment != null ? fragment.f584A : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo6036c() {
        int size = this.f4458a.size();
        for (int i = 0; i < size; i++) {
            C1512a aVar = (C1512a) this.f4458a.get(i);
            Fragment fragment = aVar.f4476b;
            if (fragment != null) {
                int i2 = this.f4463f;
                int i3 = this.f4464g;
                if (!(fragment.f598O == null && i2 == 0 && i3 == 0)) {
                    fragment.mo776P();
                    C0083b bVar = fragment.f598O;
                    bVar.f638e = i2;
                    bVar.f639f = i3;
                }
            }
            switch (aVar.f4475a) {
                case 1:
                    fragment.mo803c(aVar.f4477c);
                    this.f4316r.mo6109a(fragment, false);
                    break;
                case 3:
                    fragment.mo803c(aVar.f4478d);
                    this.f4316r.mo6151h(fragment);
                    break;
                case 4:
                    fragment.mo803c(aVar.f4478d);
                    if (this.f4316r != null) {
                        if (!fragment.f586C) {
                            fragment.f586C = true;
                            fragment.f600Q = !fragment.f600Q;
                            break;
                        }
                    } else {
                        throw null;
                    }
                    break;
                case 5:
                    fragment.mo803c(aVar.f4477c);
                    if (this.f4316r != null) {
                        if (fragment.f586C) {
                            fragment.f586C = false;
                            fragment.f600Q = !fragment.f600Q;
                            break;
                        }
                    } else {
                        throw null;
                    }
                    break;
                case 6:
                    fragment.mo803c(aVar.f4478d);
                    this.f4316r.mo6123b(fragment);
                    break;
                case 7:
                    fragment.mo803c(aVar.f4477c);
                    this.f4316r.mo6103a(fragment);
                    break;
                case 8:
                    this.f4316r.mo6157k(fragment);
                    break;
                case 9:
                    this.f4316r.mo6157k(null);
                    break;
                case 10:
                    this.f4316r.mo6108a(fragment, aVar.f4482h);
                    break;
                default:
                    StringBuilder a = C1965a.m4756a("Unknown cmd: ");
                    a.append(aVar.f4475a);
                    throw new IllegalArgumentException(a.toString());
            }
            if (!(this.f4473p || aVar.f4475a == 1 || fragment == null)) {
                this.f4316r.mo6148g(fragment);
            }
        }
        if (!this.f4473p) {
            C1490k kVar = this.f4316r;
            kVar.mo6099a(kVar.f4393s, true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f4318t >= 0) {
            sb.append(" #");
            sb.append(this.f4318t);
        }
        if (this.f4466i != null) {
            sb.append(" ");
            sb.append(this.f4466i);
        }
        sb.append(Objects.ARRAY_END);
        return sb.toString();
    }

    /* renamed from: a */
    public boolean mo6032a(ArrayList<C1472a> arrayList, ArrayList<Boolean> arrayList2) {
        if (C1490k.f4368K) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
            Log.v("FragmentManager", sb.toString());
        }
        arrayList.add(this);
        arrayList2.add(Boolean.valueOf(false));
        if (this.f4465h) {
            C1490k kVar = this.f4316r;
            if (kVar.f4386l == null) {
                kVar.f4386l = new ArrayList<>();
            }
            kVar.f4386l.add(this);
        }
        return true;
    }

    /* renamed from: b */
    public void mo6034b(boolean z) {
        for (int size = this.f4458a.size() - 1; size >= 0; size--) {
            C1512a aVar = (C1512a) this.f4458a.get(size);
            Fragment fragment = aVar.f4476b;
            if (fragment != null) {
                int d = C1490k.m3785d(this.f4463f);
                int i = this.f4464g;
                if (!(fragment.f598O == null && d == 0 && i == 0)) {
                    fragment.mo776P();
                    C0083b bVar = fragment.f598O;
                    bVar.f638e = d;
                    bVar.f639f = i;
                }
            }
            switch (aVar.f4475a) {
                case 1:
                    fragment.mo803c(aVar.f4480f);
                    this.f4316r.mo6151h(fragment);
                    break;
                case 3:
                    fragment.mo803c(aVar.f4479e);
                    this.f4316r.mo6109a(fragment, false);
                    break;
                case 4:
                    fragment.mo803c(aVar.f4479e);
                    if (this.f4316r != null) {
                        if (fragment.f586C) {
                            fragment.f586C = false;
                            fragment.f600Q = !fragment.f600Q;
                            break;
                        }
                    } else {
                        throw null;
                    }
                    break;
                case 5:
                    fragment.mo803c(aVar.f4480f);
                    if (this.f4316r != null) {
                        if (!fragment.f586C) {
                            fragment.f586C = true;
                            fragment.f600Q = !fragment.f600Q;
                            break;
                        }
                    } else {
                        throw null;
                    }
                    break;
                case 6:
                    fragment.mo803c(aVar.f4479e);
                    this.f4316r.mo6103a(fragment);
                    break;
                case 7:
                    fragment.mo803c(aVar.f4480f);
                    this.f4316r.mo6123b(fragment);
                    break;
                case 8:
                    this.f4316r.mo6157k(null);
                    break;
                case 9:
                    this.f4316r.mo6157k(fragment);
                    break;
                case 10:
                    this.f4316r.mo6108a(fragment, aVar.f4481g);
                    break;
                default:
                    StringBuilder a = C1965a.m4756a("Unknown cmd: ");
                    a.append(aVar.f4475a);
                    throw new IllegalArgumentException(a.toString());
            }
            if (!(this.f4473p || aVar.f4475a == 3 || fragment == null)) {
                this.f4316r.mo6148g(fragment);
            }
        }
        if (!this.f4473p && z) {
            C1490k kVar = this.f4316r;
            kVar.mo6099a(kVar.f4393s, true);
        }
    }

    /* renamed from: b */
    public static boolean m3707b(C1512a aVar) {
        Fragment fragment = aVar.f4476b;
        if (fragment == null || !fragment.f620o || fragment.f594K == null || fragment.f587D || fragment.f586C) {
            return false;
        }
        C0083b bVar = fragment.f598O;
        return bVar == null ? false : bVar.f650q;
    }
}
