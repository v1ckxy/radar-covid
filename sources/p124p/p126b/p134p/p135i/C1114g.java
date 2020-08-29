package p124p.p126b.p134p.p135i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p124p.p150h.p152e.C1325a;
import p124p.p150h.p156g.p157a.C1346a;
import p124p.p150h.p162l.C1412s;

/* renamed from: p.b.p.i.g */
public class C1114g implements C1346a {

    /* renamed from: z */
    public static final int[] f3071z = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f3072a;

    /* renamed from: b */
    public final Resources f3073b;

    /* renamed from: c */
    public boolean f3074c;

    /* renamed from: d */
    public boolean f3075d;

    /* renamed from: e */
    public C1115a f3076e;

    /* renamed from: f */
    public ArrayList<C1118i> f3077f;

    /* renamed from: g */
    public ArrayList<C1118i> f3078g;

    /* renamed from: h */
    public boolean f3079h;

    /* renamed from: i */
    public ArrayList<C1118i> f3080i;

    /* renamed from: j */
    public ArrayList<C1118i> f3081j;

    /* renamed from: k */
    public boolean f3082k;

    /* renamed from: l */
    public int f3083l = 1;

    /* renamed from: m */
    public CharSequence f3084m;

    /* renamed from: n */
    public Drawable f3085n;

    /* renamed from: o */
    public View f3086o;

    /* renamed from: p */
    public boolean f3087p = false;

    /* renamed from: q */
    public boolean f3088q = false;

    /* renamed from: r */
    public boolean f3089r = false;

    /* renamed from: s */
    public boolean f3090s = false;

    /* renamed from: t */
    public boolean f3091t = false;

    /* renamed from: u */
    public ArrayList<C1118i> f3092u = new ArrayList<>();

    /* renamed from: v */
    public CopyOnWriteArrayList<WeakReference<C1129m>> f3093v = new CopyOnWriteArrayList<>();

    /* renamed from: w */
    public C1118i f3094w;

    /* renamed from: x */
    public boolean f3095x = false;

    /* renamed from: y */
    public boolean f3096y;

    /* renamed from: p.b.p.i.g$a */
    public interface C1115a {
        /* renamed from: a */
        void mo198a(C1114g gVar);

        /* renamed from: a */
        boolean mo199a(C1114g gVar, MenuItem menuItem);
    }

    /* renamed from: p.b.p.i.g$b */
    public interface C1116b {
        /* renamed from: a */
        boolean mo62a(C1118i iVar);
    }

    public C1114g(Context context) {
        boolean z = false;
        this.f3072a = context;
        this.f3073b = context.getResources();
        this.f3077f = new ArrayList<>();
        this.f3078g = new ArrayList<>();
        this.f3079h = true;
        this.f3080i = new ArrayList<>();
        this.f3081j = new ArrayList<>();
        this.f3082k = true;
        if (this.f3073b.getConfiguration().keyboard != 1 && C1412s.m3588c(ViewConfiguration.get(this.f3072a), this.f3072a)) {
            z = true;
        }
        this.f3075d = z;
    }

    /* renamed from: a */
    public MenuItem mo4798a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = (-65536 & i3) >> 16;
        if (i5 >= 0) {
            int[] iArr = f3071z;
            if (i5 < iArr.length) {
                int i6 = (iArr[i5] << 16) | (65535 & i3);
                C1118i iVar = new C1118i(this, i, i2, i3, i6, charSequence, this.f3083l);
                ArrayList<C1118i> arrayList = this.f3077f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (((C1118i) arrayList.get(size)).f3107d <= i6) {
                            i4 = size + 1;
                            break;
                        }
                    } else {
                        i4 = 0;
                        break;
                    }
                }
                arrayList.add(i4, iVar);
                mo4824b(true);
                return iVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: a */
    public void mo4800a() {
        ArrayList d = mo4830d();
        if (this.f3082k) {
            Iterator it = this.f3093v.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C1129m mVar = (C1129m) weakReference.get();
                if (mVar == null) {
                    this.f3093v.remove(weakReference);
                } else {
                    z |= mVar.mo539b();
                }
            }
            if (z) {
                this.f3080i.clear();
                this.f3081j.clear();
                int size = d.size();
                for (int i = 0; i < size; i++) {
                    C1118i iVar = (C1118i) d.get(i);
                    (iVar.mo4860d() ? this.f3080i : this.f3081j).add(iVar);
                }
            } else {
                this.f3080i.clear();
                this.f3081j.clear();
                this.f3081j.addAll(mo4830d());
            }
            this.f3082k = false;
        }
    }

    /* renamed from: a */
    public final void mo4802a(int i, boolean z) {
        if (i >= 0 && i < this.f3077f.size()) {
            this.f3077f.remove(i);
            if (z) {
                mo4824b(true);
            }
        }
    }

    /* renamed from: a */
    public void mo4803a(Bundle bundle) {
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo4822b());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C1138r) item.getSubMenu()).mo4803a(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0) {
                MenuItem findItem = findItem(i2);
                if (findItem != null) {
                    findItem.expandActionView();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4805a(C1115a aVar) {
        this.f3076e = aVar;
    }

    /* renamed from: a */
    public void mo4806a(C1129m mVar) {
        Iterator it = this.f3093v.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C1129m mVar2 = (C1129m) weakReference.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.f3093v.remove(weakReference);
            }
        }
    }

    /* renamed from: a */
    public void mo4807a(C1129m mVar, Context context) {
        this.f3093v.add(new WeakReference(mVar));
        mVar.mo532a(context, this);
        this.f3082k = true;
    }

    /* renamed from: a */
    public final void mo4808a(boolean z) {
        if (!this.f3091t) {
            this.f3091t = true;
            Iterator it = this.f3093v.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C1129m mVar = (C1129m) weakReference.get();
                if (mVar == null) {
                    this.f3093v.remove(weakReference);
                } else {
                    mVar.mo534a(this, z);
                }
            }
            this.f3091t = false;
        }
    }

    /* renamed from: a */
    public boolean mo4809a(MenuItem menuItem, int i) {
        return mo4810a(menuItem, (C1129m) null, i);
    }

    /* renamed from: a */
    public boolean mo4811a(C1114g gVar, MenuItem menuItem) {
        C1115a aVar = this.f3076e;
        return aVar != null && aVar.mo199a(gVar, menuItem);
    }

    /* renamed from: a */
    public boolean mo4812a(C1118i iVar) {
        boolean z = false;
        if (!this.f3093v.isEmpty() && this.f3094w == iVar) {
            mo4840j();
            Iterator it = this.f3093v.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C1129m mVar = (C1129m) weakReference.get();
                if (mVar == null) {
                    this.f3093v.remove(weakReference);
                } else {
                    z = mVar.mo537a(this, iVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo4838i();
            if (z) {
                this.f3094w = null;
            }
        }
        return z;
    }

    public MenuItem add(int i) {
        return mo4798a(0, 0, 0, this.f3073b.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo4798a(i, i2, i3, this.f3073b.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo4798a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo4798a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f3072a.getPackageManager();
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i5);
            int i6 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i6 < 0 ? intent : intentArr[i6]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = mo4798a(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null) {
                int i7 = resolveInfo.specificIndex;
                if (i7 >= 0) {
                    menuItemArr[i7] = intent3;
                }
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f3073b.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f3073b.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C1118i iVar = (C1118i) mo4798a(i, i2, i3, charSequence);
        C1138r rVar = new C1138r(this.f3072a, this, iVar);
        iVar.f3118o = rVar;
        rVar.setHeaderTitle(iVar.f3108e);
        return rVar;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public String mo4822b() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: b */
    public void mo4823b(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C1138r) item.getSubMenu()).mo4823b(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo4822b(), sparseArray);
        }
    }

    /* renamed from: b */
    public void mo4824b(boolean z) {
        if (!this.f3087p) {
            if (z) {
                this.f3079h = true;
                this.f3082k = true;
            }
            if (!this.f3093v.isEmpty()) {
                mo4840j();
                Iterator it = this.f3093v.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    C1129m mVar = (C1129m) weakReference.get();
                    if (mVar == null) {
                        this.f3093v.remove(weakReference);
                    } else {
                        mVar.mo536a(z);
                    }
                }
                mo4838i();
                return;
            }
            return;
        }
        this.f3088q = true;
        if (z) {
            this.f3089r = true;
        }
    }

    /* renamed from: b */
    public boolean mo4825b(C1118i iVar) {
        boolean z = false;
        if (this.f3093v.isEmpty()) {
            return false;
        }
        mo4840j();
        Iterator it = this.f3093v.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C1129m mVar = (C1129m) weakReference.get();
            if (mVar == null) {
                this.f3093v.remove(weakReference);
            } else {
                z = mVar.mo540b(this, iVar);
                if (z) {
                    break;
                }
            }
        }
        mo4838i();
        if (z) {
            this.f3094w = iVar;
        }
        return z;
    }

    /* renamed from: c */
    public C1114g mo4826c() {
        return this;
    }

    public void clear() {
        C1118i iVar = this.f3094w;
        if (iVar != null) {
            mo4812a(iVar);
        }
        this.f3077f.clear();
        mo4824b(true);
    }

    public void clearHeader() {
        this.f3085n = null;
        this.f3084m = null;
        this.f3086o = null;
        mo4824b(false);
    }

    public void close() {
        mo4808a(true);
    }

    /* renamed from: d */
    public ArrayList<C1118i> mo4830d() {
        if (!this.f3079h) {
            return this.f3078g;
        }
        this.f3078g.clear();
        int size = this.f3077f.size();
        for (int i = 0; i < size; i++) {
            C1118i iVar = (C1118i) this.f3077f.get(i);
            if (iVar.isVisible()) {
                this.f3078g.add(iVar);
            }
        }
        this.f3079h = false;
        this.f3082k = true;
        return this.f3078g;
    }

    /* renamed from: e */
    public boolean mo4831e() {
        return this.f3095x;
    }

    /* renamed from: f */
    public boolean mo4832f() {
        return this.f3074c;
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C1118i iVar = (C1118i) this.f3077f.get(i2);
            if (iVar.f3104a == i) {
                return iVar;
            }
            if (iVar.hasSubMenu()) {
                MenuItem findItem = iVar.f3118o.findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public boolean mo4834g() {
        return this.f3075d;
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f3077f.get(i);
    }

    /* renamed from: h */
    public void mo4836h() {
        this.f3082k = true;
        mo4824b(true);
    }

    public boolean hasVisibleItems() {
        if (this.f3096y) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C1118i) this.f3077f.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void mo4838i() {
        this.f3087p = false;
        if (this.f3088q) {
            this.f3088q = false;
            mo4824b(this.f3089r);
        }
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo4799a(i, keyEvent) != null;
    }

    /* renamed from: j */
    public void mo4840j() {
        if (!this.f3087p) {
            this.f3087p = true;
            this.f3088q = false;
            this.f3089r = false;
        }
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo4809a(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C1118i a = mo4799a(i, keyEvent);
        boolean a2 = a != null ? mo4810a((MenuItem) a, (C1129m) null, i2) : false;
        if ((i2 & 2) != 0) {
            mo4808a(true);
        }
        return a2;
    }

    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C1118i) this.f3077f.get(i2)).f3105b == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.f3077f.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || ((C1118i) this.f3077f.get(i2)).f3105b != i) {
                    mo4824b(true);
                } else {
                    mo4802a(i2, false);
                    i3 = i4;
                }
            }
            mo4824b(true);
        }
    }

    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C1118i) this.f3077f.get(i2)).f3104a == i) {
                break;
            } else {
                i2++;
            }
        }
        mo4802a(i2, true);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f3077f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1118i iVar = (C1118i) this.f3077f.get(i2);
            if (iVar.f3105b == i) {
                iVar.mo4857b(z2);
                iVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f3095x = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f3077f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1118i iVar = (C1118i) this.f3077f.get(i2);
            if (iVar.f3105b == i) {
                iVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f3077f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C1118i iVar = (C1118i) this.f3077f.get(i2);
            if (iVar.f3105b == i && iVar.mo4861d(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo4824b(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f3074c = z;
        mo4824b(false);
    }

    public int size() {
        return this.f3077f.size();
    }

    /* renamed from: a */
    public C1118i mo4799a(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<C1118i> arrayList = this.f3092u;
        arrayList.clear();
        mo4804a((List<C1118i>) arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C1118i) arrayList.get(0);
        }
        boolean f = mo4832f();
        for (int i2 = 0; i2 < size; i2++) {
            C1118i iVar = (C1118i) arrayList.get(i2);
            if (f) {
                c = iVar.f3113j;
            } else {
                c = iVar.f3111h;
            }
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (f && c == 8 && i == 67))) {
                return iVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo4804a(List<C1118i> list, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean f = mo4832f();
        int modifiers = keyEvent.getModifiers();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f3077f.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1118i iVar = (C1118i) this.f3077f.get(i3);
                if (iVar.hasSubMenu()) {
                    iVar.f3118o.mo4804a(list, i, keyEvent);
                }
                if (f) {
                    c = iVar.f3113j;
                } else {
                    c = iVar.f3111h;
                }
                if (f) {
                    i2 = iVar.f3114k;
                } else {
                    i2 = iVar.f3112i;
                }
                if (((modifiers & 69647) == (i2 & 69647)) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (f && c == 8 && i == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        if (r1 != false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0073, code lost:
        if ((r9 & 1) == 0) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d9, code lost:
        if (r1 == false) goto L_0x00db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0068  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4810a(android.view.MenuItem r7, p124p.p126b.p134p.p135i.C1129m r8, int r9) {
        /*
            r6 = this;
            p.b.p.i.i r7 = (p124p.p126b.p134p.p135i.C1118i) r7
            r0 = 0
            if (r7 == 0) goto L_0x00df
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00df
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f3119p
            r2 = 1
            if (r1 == 0) goto L_0x0019
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L_0x0019
            goto L_0x0044
        L_0x0019:
            p.b.p.i.g r1 = r7.f3117n
            boolean r1 = r1.mo4811a(r1, r7)
            if (r1 == 0) goto L_0x0022
            goto L_0x0044
        L_0x0022:
            android.content.Intent r1 = r7.f3110g
            if (r1 == 0) goto L_0x0036
            p.b.p.i.g r3 = r7.f3117n     // Catch:{ ActivityNotFoundException -> 0x002e }
            android.content.Context r3 = r3.f3072a     // Catch:{ ActivityNotFoundException -> 0x002e }
            r3.startActivity(r1)     // Catch:{ ActivityNotFoundException -> 0x002e }
            goto L_0x0044
        L_0x002e:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L_0x0036:
            p.h.l.b r1 = r7.f3100A
            if (r1 == 0) goto L_0x0046
            p.b.p.i.j$a r1 = (p124p.p126b.p134p.p135i.C1120j.C1121a) r1
            android.view.ActionProvider r1 = r1.f3133b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L_0x0046
        L_0x0044:
            r1 = r2
            goto L_0x0047
        L_0x0046:
            r1 = r0
        L_0x0047:
            p.h.l.b r3 = r7.f3100A
            if (r3 == 0) goto L_0x0058
            r4 = r3
            p.b.p.i.j$a r4 = (p124p.p126b.p134p.p135i.C1120j.C1121a) r4
            android.view.ActionProvider r4 = r4.f3133b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L_0x0058
            r4 = r2
            goto L_0x0059
        L_0x0058:
            r4 = r0
        L_0x0059:
            boolean r5 = r7.mo4859c()
            if (r5 == 0) goto L_0x0068
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x00de
            goto L_0x00db
        L_0x0068:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x0076
            if (r4 == 0) goto L_0x0071
            goto L_0x0076
        L_0x0071:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x00de
            goto L_0x00db
        L_0x0076:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x007d
            r6.mo4808a(r0)
        L_0x007d:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0091
            p.b.p.i.r r9 = new p.b.p.i.r
            android.content.Context r5 = r6.f3072a
            r9.<init>(r5, r6, r7)
            r7.f3118o = r9
            java.lang.CharSequence r5 = r7.f3108e
            r9.setHeaderTitle(r5)
        L_0x0091:
            p.b.p.i.r r7 = r7.f3118o
            if (r4 == 0) goto L_0x00a2
            p.b.p.i.j$a r3 = (p124p.p126b.p134p.p135i.C1120j.C1121a) r3
            android.view.ActionProvider r9 = r3.f3133b
            p.b.p.i.j r3 = p124p.p126b.p134p.p135i.C1120j.this
            android.view.SubMenu r3 = r3.mo4761a(r7)
            r9.onPrepareSubMenu(r3)
        L_0x00a2:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<p.b.p.i.m>> r9 = r6.f3093v
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x00ab
            goto L_0x00d8
        L_0x00ab:
            if (r8 == 0) goto L_0x00b1
            boolean r0 = r8.mo538a(r7)
        L_0x00b1:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<p.b.p.i.m>> r8 = r6.f3093v
            java.util.Iterator r8 = r8.iterator()
        L_0x00b7:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00d8
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            p.b.p.i.m r3 = (p124p.p126b.p134p.p135i.C1129m) r3
            if (r3 != 0) goto L_0x00d1
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<p.b.p.i.m>> r3 = r6.f3093v
            r3.remove(r9)
            goto L_0x00b7
        L_0x00d1:
            if (r0 != 0) goto L_0x00b7
            boolean r0 = r3.mo538a(r7)
            goto L_0x00b7
        L_0x00d8:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00de
        L_0x00db:
            r6.mo4808a(r2)
        L_0x00de:
            return r1
        L_0x00df:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p134p.p135i.C1114g.mo4810a(android.view.MenuItem, p.b.p.i.m, int):boolean");
    }

    /* renamed from: a */
    public final void mo4801a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f3073b;
        if (view != null) {
            this.f3086o = view;
            this.f3084m = null;
            this.f3085n = null;
        } else {
            if (i > 0) {
                this.f3084m = resources.getText(i);
            } else if (charSequence != null) {
                this.f3084m = charSequence;
            }
            if (i2 > 0) {
                this.f3085n = C1325a.m3377b(this.f3072a, i2);
            } else if (drawable != null) {
                this.f3085n = drawable;
            }
            this.f3086o = null;
        }
        mo4824b(false);
    }
}
