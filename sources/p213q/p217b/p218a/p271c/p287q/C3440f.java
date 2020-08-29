package p213q.p217b.p218a.p271c.p287q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import p124p.p126b.p134p.p135i.C1114g;
import p124p.p126b.p134p.p135i.C1118i;
import p124p.p126b.p134p.p135i.C1129m;
import p124p.p126b.p134p.p135i.C1129m.C1130a;
import p124p.p126b.p134p.p135i.C1138r;
import p124p.p191u.C1726m;
import p213q.p217b.p218a.p271c.p273b0.C3300f;
import p213q.p217b.p218a.p271c.p278g0.C3337g;
import p213q.p217b.p218a.p271c.p285o.C3424a;
import p213q.p217b.p218a.p271c.p285o.C3424a.C3425a;

/* renamed from: q.b.a.c.q.f */
public class C3440f implements C1129m {

    /* renamed from: e */
    public C1114g f8707e;

    /* renamed from: f */
    public C3439e f8708f;

    /* renamed from: g */
    public boolean f8709g = false;

    /* renamed from: h */
    public int f8710h;

    /* renamed from: q.b.a.c.q.f$a */
    public static class C3441a implements Parcelable {
        public static final Creator<C3441a> CREATOR = new C3442a();

        /* renamed from: e */
        public int f8711e;

        /* renamed from: f */
        public C3300f f8712f;

        /* renamed from: q.b.a.c.q.f$a$a */
        public static class C3442a implements Creator<C3441a> {
            public Object createFromParcel(Parcel parcel) {
                return new C3441a(parcel);
            }

            public Object[] newArray(int i) {
                return new C3441a[i];
            }
        }

        public C3441a() {
        }

        public C3441a(Parcel parcel) {
            this.f8711e = parcel.readInt();
            this.f8712f = (C3300f) parcel.readParcelable(C3441a.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f8711e);
            parcel.writeParcelable(this.f8712f, 0);
        }
    }

    /* renamed from: a */
    public void mo532a(Context context, C1114g gVar) {
        this.f8707e = gVar;
        this.f8708f.f8684C = gVar;
    }

    /* renamed from: a */
    public void mo534a(C1114g gVar, boolean z) {
    }

    /* renamed from: a */
    public void mo535a(C1130a aVar) {
    }

    /* renamed from: a */
    public boolean mo537a(C1114g gVar, C1118i iVar) {
        return false;
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
        return false;
    }

    /* renamed from: d */
    public Parcelable mo541d() {
        C3441a aVar = new C3441a();
        aVar.f8711e = this.f8708f.getSelectedItemId();
        SparseArray badgeDrawables = this.f8708f.getBadgeDrawables();
        C3300f fVar = new C3300f();
        int i = 0;
        while (i < badgeDrawables.size()) {
            int keyAt = badgeDrawables.keyAt(i);
            C3424a aVar2 = (C3424a) badgeDrawables.valueAt(i);
            if (aVar2 != null) {
                fVar.put(keyAt, aVar2.f8630l);
                i++;
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        aVar.f8712f = fVar;
        return aVar;
    }

    public int getId() {
        return this.f8710h;
    }

    /* renamed from: a */
    public void mo533a(Parcelable parcelable) {
        if (parcelable instanceof C3441a) {
            C3439e eVar = this.f8708f;
            C3441a aVar = (C3441a) parcelable;
            int i = aVar.f8711e;
            int size = eVar.f8684C.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = eVar.f8684C.getItem(i2);
                if (i == item.getItemId()) {
                    eVar.f8696p = i;
                    eVar.f8697q = i2;
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
            Context context = this.f8708f.getContext();
            C3300f fVar = aVar.f8712f;
            SparseArray sparseArray = new SparseArray(fVar.size());
            int i3 = 0;
            while (i3 < fVar.size()) {
                int keyAt = fVar.keyAt(i3);
                C3425a aVar2 = (C3425a) fVar.valueAt(i3);
                if (aVar2 != null) {
                    C3424a aVar3 = new C3424a(context);
                    int i4 = aVar2.f8643i;
                    C3425a aVar4 = aVar3.f8630l;
                    if (aVar4.f8643i != i4) {
                        aVar4.f8643i = i4;
                        aVar3.f8633o = ((int) Math.pow(10.0d, ((double) i4) - 1.0d)) - 1;
                        aVar3.f8625g.f8295d = true;
                        aVar3.mo9214e();
                        aVar3.invalidateSelf();
                    }
                    int i5 = aVar2.f8642h;
                    if (i5 != -1) {
                        int max = Math.max(0, i5);
                        C3425a aVar5 = aVar3.f8630l;
                        if (aVar5.f8642h != max) {
                            aVar5.f8642h = max;
                            aVar3.f8625g.f8295d = true;
                            aVar3.mo9214e();
                            aVar3.invalidateSelf();
                        }
                    }
                    int i6 = aVar2.f8639e;
                    aVar3.f8630l.f8639e = i6;
                    ColorStateList valueOf = ColorStateList.valueOf(i6);
                    C3337g gVar = aVar3.f8624f;
                    if (gVar.f8365e.f8390d != valueOf) {
                        gVar.mo9063a(valueOf);
                        aVar3.invalidateSelf();
                    }
                    int i7 = aVar2.f8640f;
                    aVar3.f8630l.f8640f = i7;
                    if (aVar3.f8625g.f8292a.getColor() != i7) {
                        aVar3.f8625g.f8292a.setColor(i7);
                        aVar3.invalidateSelf();
                    }
                    int i8 = aVar2.f8646l;
                    C3425a aVar6 = aVar3.f8630l;
                    if (aVar6.f8646l != i8) {
                        aVar6.f8646l = i8;
                        WeakReference<View> weakReference = aVar3.f8637s;
                        if (!(weakReference == null || weakReference.get() == null)) {
                            View view = (View) aVar3.f8637s.get();
                            WeakReference<ViewGroup> weakReference2 = aVar3.f8638t;
                            ViewGroup viewGroup = weakReference2 != null ? (ViewGroup) weakReference2.get() : null;
                            aVar3.f8637s = new WeakReference<>(view);
                            aVar3.f8638t = new WeakReference<>(viewGroup);
                            aVar3.mo9214e();
                            aVar3.invalidateSelf();
                        }
                    }
                    sparseArray.put(keyAt, aVar3);
                    i3++;
                } else {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
            }
            this.f8708f.setBadgeDrawables(sparseArray);
        }
    }

    /* renamed from: a */
    public void mo536a(boolean z) {
        if (!this.f8709g) {
            if (z) {
                this.f8708f.mo9260a();
            } else {
                C3439e eVar = this.f8708f;
                C1114g gVar = eVar.f8684C;
                if (!(gVar == null || eVar.f8695o == null)) {
                    int size = gVar.size();
                    if (size != eVar.f8695o.length) {
                        eVar.mo9260a();
                    } else {
                        int i = eVar.f8696p;
                        for (int i2 = 0; i2 < size; i2++) {
                            MenuItem item = eVar.f8684C.getItem(i2);
                            if (item.isChecked()) {
                                eVar.f8696p = item.getItemId();
                                eVar.f8697q = i2;
                            }
                        }
                        if (i != eVar.f8696p) {
                            C1726m.m4343a(eVar, eVar.f8685e);
                        }
                        boolean a = eVar.mo9261a(eVar.f8694n, eVar.f8684C.mo4830d().size());
                        for (int i3 = 0; i3 < size; i3++) {
                            eVar.f8683B.f8709g = true;
                            eVar.f8695o[i3].setLabelVisibilityMode(eVar.f8694n);
                            eVar.f8695o[i3].setShifting(a);
                            eVar.f8695o[i3].mo38a((C1118i) eVar.f8684C.getItem(i3), 0);
                            eVar.f8683B.f8709g = false;
                        }
                    }
                }
            }
        }
    }
}
