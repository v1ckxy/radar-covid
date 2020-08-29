package p124p.p126b.p127k;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import p124p.p126b.p127k.C1039h.C1047g;
import p124p.p126b.p134p.C1089a;
import p124p.p126b.p134p.C1089a.C1090a;
import p124p.p126b.p134p.C1096f;
import p124p.p126b.p136q.C1178i;
import p124p.p126b.p136q.C1228z0;
import p124p.p150h.p151d.C1309a;
import p124p.p150h.p151d.C1324l;
import p124p.p150h.p152e.C1325a;
import p124p.p170k.p171a.C1482e;

/* renamed from: p.b.k.e */
public class C1036e extends C1482e implements C1037f, C1324l {

    /* renamed from: r */
    public C1038g f2685r;

    /* renamed from: s */
    public Resources f2686s;

    /* renamed from: C */
    public Intent mo4426C() {
        return C1061o.m2449a((Activity) this);
    }

    /* renamed from: O */
    public void mo4427O() {
        mo4428P().mo4463b();
    }

    /* renamed from: P */
    public C1038g mo4428P() {
        if (this.f2685r == null) {
            this.f2685r = C1038g.m2347a((Activity) this, (C1037f) this);
        }
        return this.f2685r;
    }

    /* renamed from: Q */
    public C1028a mo4429Q() {
        C1039h hVar = (C1039h) mo4428P();
        hVar.mo4487j();
        return hVar.f2728l;
    }

    /* renamed from: a */
    public C1089a mo4430a(C1090a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo4431a(C1089a aVar) {
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        mo4428P().mo4460a(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C1039h hVar = (C1039h) mo4428P();
        hVar.mo4474a(false);
        hVar.f2706M = true;
    }

    /* renamed from: b */
    public void mo4434b(C1089a aVar) {
    }

    public void closeOptionsMenu() {
        C1028a Q = mo4429Q();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C1028a Q = mo4429Q();
        return super.dispatchKeyEvent(keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        C1039h hVar = (C1039h) mo4428P();
        hVar.mo4483f();
        return hVar.f2725i.findViewById(i);
    }

    public MenuInflater getMenuInflater() {
        C1039h hVar = (C1039h) mo4428P();
        if (hVar.f2729m == null) {
            hVar.mo4487j();
            C1028a aVar = hVar.f2728l;
            hVar.f2729m = new C1096f(aVar != null ? aVar.mo4416c() : hVar.f2724h);
        }
        return hVar.f2729m;
    }

    public Resources getResources() {
        if (this.f2686s == null) {
            C1228z0.m3094a();
        }
        Resources resources = this.f2686s;
        return resources == null ? super.getResources() : resources;
    }

    public void invalidateOptionsMenu() {
        mo4428P().mo4463b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f2686s != null) {
            this.f2686s.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        C1039h hVar = (C1039h) mo4428P();
        if (hVar.f2697D && hVar.f2740x) {
            hVar.mo4487j();
            C1028a aVar = hVar.f2728l;
            if (aVar != null) {
                aVar.mo4409a(configuration);
            }
        }
        C1178i.m2951a().mo5176a(hVar.f2724h);
        hVar.mo4474a(false);
    }

    public void onContentChanged() {
    }

    public void onCreate(Bundle bundle) {
        C1038g P = mo4428P();
        P.mo4457a();
        P.mo4458a(bundle);
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        C1039h hVar = (C1039h) mo4428P();
        if (hVar != null) {
            C1038g.m2350b((C1038g) hVar);
            if (hVar.f2716W) {
                hVar.f2725i.getDecorView().removeCallbacks(hVar.f2718Y);
            }
            hVar.f2708O = false;
            hVar.f2709P = true;
            C1028a aVar = hVar.f2728l;
            C1047g gVar = hVar.f2714U;
            if (gVar != null) {
                gVar.mo4513a();
            }
            C1047g gVar2 = hVar.f2715V;
            if (gVar2 != null) {
                gVar2.mo4513a();
                return;
            }
            return;
        }
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 1
            if (r0 >= r1) goto L_0x003f
            boolean r0 = r5.isCtrlPressed()
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getRepeatCount()
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003f
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L_0x003f
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003f
            android.view.View r0 = r0.getDecorView()
            boolean r0 = r0.dispatchKeyShortcutEvent(r5)
            if (r0 == 0) goto L_0x003f
            r0 = r2
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x0043
            return r2
        L_0x0043:
            boolean r4 = super.onKeyDown(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p127k.C1036e.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        boolean z = true;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C1028a Q = mo4429Q();
        if (menuItem.getItemId() != 16908332 || Q == null || (Q.mo4414b() & 4) == 0) {
            return false;
        }
        Intent a = C1061o.m2449a((Activity) this);
        if (a == null) {
            z = false;
        } else if (shouldUpRecreateTask(a)) {
            ArrayList arrayList = new ArrayList();
            Intent C = mo4426C();
            if (C == null) {
                C = C1061o.m2449a((Activity) this);
            }
            if (C != null) {
                ComponentName component = C.getComponent();
                if (component == null) {
                    component = C.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                while (true) {
                    try {
                        Intent a2 = C1061o.m2450a((Context) this, component);
                        if (a2 == null) {
                            break;
                        }
                        arrayList.add(size, a2);
                        component = a2.getComponent();
                    } catch (NameNotFoundException e) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e);
                    }
                }
                arrayList.add(C);
            }
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                C1325a.m3376a(this, intentArr, null);
                try {
                    C1309a.m3357a(this);
                } catch (IllegalStateException unused) {
                    finish();
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            navigateUpTo(a);
        }
        return z;
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((C1039h) mo4428P()).mo4483f();
    }

    public void onPostResume() {
        super.onPostResume();
        C1039h hVar = (C1039h) mo4428P();
        hVar.mo4487j();
        C1028a aVar = hVar.f2728l;
        if (aVar != null) {
            aVar.mo4417c(true);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C1039h hVar = (C1039h) mo4428P();
        if (hVar.f2710Q != -100) {
            C1039h.f2689d0.put(hVar.f2723g.getClass(), Integer.valueOf(hVar.f2710Q));
        }
    }

    public void onStart() {
        super.onStart();
        C1039h hVar = (C1039h) mo4428P();
        hVar.f2708O = true;
        hVar.mo4479d();
        C1038g.m2349a((C1038g) hVar);
    }

    public void onStop() {
        super.onStop();
        mo4428P().mo4466c();
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo4428P().mo4461a(charSequence);
    }

    public void openOptionsMenu() {
        C1028a Q = mo4429Q();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        mo4428P().mo4464b(i);
    }

    public void setContentView(View view) {
        mo4428P().mo4459a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        mo4428P().mo4465b(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        ((C1039h) mo4428P()).f2711R = i;
    }
}
