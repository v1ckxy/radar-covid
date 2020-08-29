package p124p.p170k.p171a;

import androidx.fragment.app.Fragment;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p124p.p177n.C1537e.C1539b;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.k.a.r */
public abstract class C1511r {

    /* renamed from: a */
    public ArrayList<C1512a> f4458a = new ArrayList<>();

    /* renamed from: b */
    public int f4459b;

    /* renamed from: c */
    public int f4460c;

    /* renamed from: d */
    public int f4461d;

    /* renamed from: e */
    public int f4462e;

    /* renamed from: f */
    public int f4463f;

    /* renamed from: g */
    public int f4464g;

    /* renamed from: h */
    public boolean f4465h;

    /* renamed from: i */
    public String f4466i;

    /* renamed from: j */
    public int f4467j;

    /* renamed from: k */
    public CharSequence f4468k;

    /* renamed from: l */
    public int f4469l;

    /* renamed from: m */
    public CharSequence f4470m;

    /* renamed from: n */
    public ArrayList<String> f4471n;

    /* renamed from: o */
    public ArrayList<String> f4472o;

    /* renamed from: p */
    public boolean f4473p = false;

    /* renamed from: q */
    public ArrayList<Runnable> f4474q;

    /* renamed from: p.k.a.r$a */
    public static final class C1512a {

        /* renamed from: a */
        public int f4475a;

        /* renamed from: b */
        public Fragment f4476b;

        /* renamed from: c */
        public int f4477c;

        /* renamed from: d */
        public int f4478d;

        /* renamed from: e */
        public int f4479e;

        /* renamed from: f */
        public int f4480f;

        /* renamed from: g */
        public C1539b f4481g;

        /* renamed from: h */
        public C1539b f4482h;

        public C1512a() {
        }

        public C1512a(int i, Fragment fragment) {
            this.f4475a = i;
            this.f4476b = fragment;
            C1539b bVar = C1539b.RESUMED;
            this.f4481g = bVar;
            this.f4482h = bVar;
        }

        public C1512a(int i, Fragment fragment, C1539b bVar) {
            this.f4475a = i;
            this.f4476b = fragment;
            this.f4481g = fragment.f604U;
            this.f4482h = bVar;
        }
    }

    /* renamed from: a */
    public abstract int mo6024a();

    /* renamed from: a */
    public C1511r mo6194a(int i, Fragment fragment) {
        if (i != 0) {
            mo6029a(i, fragment, null, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: a */
    public C1511r mo6026a(Fragment fragment) {
        mo6195a(new C1512a(3, fragment));
        return this;
    }

    /* renamed from: a */
    public C1511r mo6027a(Fragment fragment, C1539b bVar) {
        mo6195a(new C1512a(10, fragment, bVar));
        return this;
    }

    /* renamed from: a */
    public void mo6029a(int i, Fragment fragment, String str, int i2) {
        Class cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder a = C1965a.m4756a("Fragment ");
            a.append(cls.getCanonicalName());
            a.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(a.toString());
        }
        String str2 = " now ";
        String str3 = ": was ";
        if (str != null) {
            String str4 = fragment.f585B;
            if (str4 == null || str.equals(str4)) {
                fragment.f585B = str;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(str3);
                sb.append(fragment.f585B);
                sb.append(str2);
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.f631z;
                if (i3 == 0 || i3 == i) {
                    fragment.f631z = i;
                    fragment.f584A = i;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Can't change container ID of fragment ");
                    sb2.append(fragment);
                    sb2.append(str3);
                    sb2.append(fragment.f631z);
                    sb2.append(str2);
                    sb2.append(i);
                    throw new IllegalStateException(sb2.toString());
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Can't add fragment ");
                sb3.append(fragment);
                sb3.append(" with tag ");
                sb3.append(str);
                sb3.append(" to container view with no id");
                throw new IllegalArgumentException(sb3.toString());
            }
        }
        mo6195a(new C1512a(i2, fragment));
    }

    /* renamed from: a */
    public void mo6195a(C1512a aVar) {
        this.f4458a.add(aVar);
        aVar.f4477c = this.f4459b;
        aVar.f4478d = this.f4460c;
        aVar.f4479e = this.f4461d;
        aVar.f4480f = this.f4462e;
    }

    /* renamed from: b */
    public abstract void mo6033b();
}
