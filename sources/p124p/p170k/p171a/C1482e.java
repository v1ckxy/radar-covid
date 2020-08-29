package p124p.p170k.p171a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p124p.p125a.C1017c;
import p124p.p126b.p127k.C1061o;
import p124p.p143e.C1252d;
import p124p.p143e.C1262i;
import p124p.p150h.p151d.C1309a;
import p124p.p177n.C1537e;
import p124p.p177n.C1537e.C1538a;
import p124p.p177n.C1537e.C1539b;
import p124p.p177n.C1543i;
import p124p.p177n.C1559v;
import p124p.p177n.C1560w;
import p124p.p178o.p179a.C1561a;

/* renamed from: p.k.a.e */
public class C1482e extends ComponentActivity {

    /* renamed from: j */
    public final C1485g f4350j;

    /* renamed from: k */
    public final C1543i f4351k = new C1543i(this);

    /* renamed from: l */
    public boolean f4352l;

    /* renamed from: m */
    public boolean f4353m;

    /* renamed from: n */
    public boolean f4354n = true;

    /* renamed from: o */
    public boolean f4355o;

    /* renamed from: p */
    public int f4356p;

    /* renamed from: q */
    public C1262i<String> f4357q;

    /* renamed from: p.k.a.e$a */
    public class C1483a extends C1487i<C1482e> implements C1560w, C1017c {
        public C1483a() {
            super(C1482e.this);
        }

        /* renamed from: G */
        public C1559v mo1G() {
            return C1482e.this.mo1G();
        }

        /* renamed from: a */
        public View mo6065a(int i) {
            return C1482e.this.findViewById(i);
        }

        /* renamed from: a */
        public void mo6084a(Fragment fragment, Intent intent, int i, Bundle bundle) {
            C1482e eVar = C1482e.this;
            eVar.f4355o = true;
            if (i == -1) {
                try {
                    C1309a.m3358a(eVar, intent, -1, bundle);
                } catch (Throwable th) {
                    eVar.f4355o = false;
                    throw th;
                }
            } else {
                C1482e.m3757b(i);
                C1309a.m3358a(eVar, intent, ((eVar.mo6068a(fragment) + 1) << 16) + (i & 65535), bundle);
            }
            eVar.f4355o = false;
        }

        /* renamed from: a */
        public boolean mo6066a() {
            Window window = C1482e.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: g */
        public C1537e mo2g() {
            return C1482e.this.f4351k;
        }

        /* renamed from: i */
        public OnBackPressedDispatcher mo3i() {
            return C1482e.this.f3i;
        }
    }

    public C1482e() {
        C1483a aVar = new C1483a();
        C1061o.m2465a(aVar, (Object) "callbacks == null");
        this.f4350j = new C1485g(aVar);
    }

    /* renamed from: b */
    public static void m3757b(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* renamed from: J */
    public C1488j mo6067J() {
        return this.f4350j.f4359a.f4365i;
    }

    @Deprecated
    /* renamed from: O */
    public void mo4427O() {
        invalidateOptionsMenu();
    }

    /* renamed from: a */
    public final int mo6068a(Fragment fragment) {
        if (this.f4357q.mo5617c() < 65534) {
            while (true) {
                C1262i<String> iVar = this.f4357q;
                int i = this.f4356p;
                if (iVar.f3591e) {
                    iVar.mo5616b();
                }
                if (C1252d.m3159a(iVar.f3592f, iVar.f3594h, i) >= 0) {
                    this.f4356p = (this.f4356p + 1) % 65534;
                } else {
                    int i2 = this.f4356p;
                    this.f4357q.mo5619c(i2, fragment.f614i);
                    this.f4356p = (this.f4356p + 1) % 65534;
                    return i2;
                }
            }
        } else {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        String sb2 = sb.toString();
        printWriter.print(sb2);
        printWriter.print("mCreated=");
        printWriter.print(this.f4352l);
        printWriter.print(" mResumed=");
        printWriter.print(this.f4353m);
        printWriter.print(" mStopped=");
        printWriter.print(this.f4354n);
        if (getApplication() != null) {
            C1561a.m3960a(this).mo6254a(sb2, fileDescriptor, printWriter, strArr);
        }
        this.f4350j.f4359a.f4365i.mo6092a(str, fileDescriptor, printWriter, strArr);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f4350j.mo6085a();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String str = (String) this.f4357q.mo5612a(i4);
            this.f4357q.mo5618c(i4);
            String str2 = "FragmentActivity";
            if (str == null) {
                Log.w(str2, "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment b = this.f4350j.f4359a.f4365i.mo6121b(str);
            if (b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Activity result no fragment exists for who: ");
                sb.append(str);
                Log.w(str2, sb.toString());
            } else {
                b.mo788a(i & 65535, i2, intent);
            }
            return;
        }
        C1309a.m3356a();
        super.onActivityResult(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4350j.mo6085a();
        this.f4350j.f4359a.f4365i.mo6100a(configuration);
    }

    public void onCreate(Bundle bundle) {
        C1487i<?> iVar = this.f4350j.f4359a;
        iVar.f4365i.mo6115a((C1487i) iVar, (C1484f) iVar, (Fragment) null);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            C1487i<?> iVar2 = this.f4350j.f4359a;
            if (iVar2 instanceof C1560w) {
                iVar2.f4365i.mo6101a(parcelable);
                String str = "android:support:next_request_index";
                if (bundle.containsKey(str)) {
                    this.f4356p = bundle.getInt(str);
                    int[] intArray = bundle.getIntArray("android:support:request_indicies");
                    String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                    if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                        Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                    } else {
                        this.f4357q = new C1262i<>(intArray.length);
                        for (int i = 0; i < intArray.length; i++) {
                            this.f4357q.mo5619c(intArray[i], stringArray[i]);
                        }
                    }
                }
            } else {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
        }
        if (this.f4357q == null) {
            this.f4357q = new C1262i<>(10);
            this.f4356p = 0;
        }
        super.onCreate(bundle);
        this.f4351k.mo6230a(C1538a.ON_CREATE);
        this.f4350j.f4359a.f4365i.mo6147g();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        C1485g gVar = this.f4350j;
        return onCreatePanelMenu | gVar.f4359a.f4365i.mo6118a(menu, getMenuInflater());
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f4350j.f4359a.f4365i.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f4350j.f4359a.f4365i.mo6150h();
        this.f4351k.mo6230a(C1538a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f4350j.f4359a.f4365i.mo6154i();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f4350j.f4359a.f4365i.mo6129b(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f4350j.f4359a.f4365i.mo6119a(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f4350j.f4359a.f4365i.mo6117a(z);
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f4350j.mo6085a();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f4350j.f4359a.f4365i.mo6102a(menu);
        }
        super.onPanelClosed(i, menu);
    }

    public void onPause() {
        super.onPause();
        this.f4353m = false;
        this.f4350j.f4359a.f4365i.mo6122b(3);
        this.f4351k.mo6230a(C1538a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f4350j.f4359a.f4365i.mo6127b(z);
    }

    public void onPostResume() {
        super.onPostResume();
        this.f4351k.mo6230a(C1538a.ON_RESUME);
        C1490k kVar = this.f4350j.f4359a.f4365i;
        kVar.f4399y = false;
        kVar.f4400z = false;
        kVar.mo6122b(4);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return super.onPreparePanel(0, view, menu) | this.f4350j.f4359a.f4365i.mo6128b(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f4350j.mo6085a();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String str = (String) this.f4357q.mo5612a(i3);
            this.f4357q.mo5618c(i3);
            String str2 = "FragmentActivity";
            if (str == null) {
                Log.w(str2, "Activity result delivered for unknown Fragment.");
            } else if (this.f4350j.f4359a.f4365i.mo6121b(str) == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Activity result no fragment exists for who: ");
                sb.append(str);
                Log.w(str2, sb.toString());
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.f4353m = true;
        this.f4350j.mo6085a();
        this.f4350j.f4359a.f4365i.mo6158k();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        do {
        } while (m3756a(mo6067J(), C1539b.CREATED));
        this.f4351k.mo6230a(C1538a.ON_STOP);
        Parcelable n = this.f4350j.f4359a.f4365i.mo6161n();
        if (n != null) {
            bundle.putParcelable("android:support:fragments", n);
        }
        if (this.f4357q.mo5617c() > 0) {
            bundle.putInt("android:support:next_request_index", this.f4356p);
            int[] iArr = new int[this.f4357q.mo5617c()];
            String[] strArr = new String[this.f4357q.mo5617c()];
            for (int i = 0; i < this.f4357q.mo5617c(); i++) {
                iArr[i] = this.f4357q.mo5614b(i);
                strArr[i] = (String) this.f4357q.mo5621d(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    public void onStart() {
        super.onStart();
        this.f4354n = false;
        if (!this.f4352l) {
            this.f4352l = true;
            C1490k kVar = this.f4350j.f4359a.f4365i;
            kVar.f4399y = false;
            kVar.f4400z = false;
            kVar.mo6122b(2);
        }
        this.f4350j.mo6085a();
        this.f4350j.f4359a.f4365i.mo6158k();
        this.f4351k.mo6230a(C1538a.ON_START);
        C1490k kVar2 = this.f4350j.f4359a.f4365i;
        kVar2.f4399y = false;
        kVar2.f4400z = false;
        kVar2.mo6122b(3);
    }

    public void onStateNotSaved() {
        this.f4350j.mo6085a();
    }

    public void onStop() {
        super.onStop();
        this.f4354n = true;
        do {
        } while (m3756a(mo6067J(), C1539b.CREATED));
        C1490k kVar = this.f4350j.f4359a.f4365i;
        kVar.f4400z = true;
        kVar.mo6122b(2);
        this.f4351k.mo6230a(C1538a.ON_STOP);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (!this.f4355o && i != -1) {
            m3757b(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (!this.f4355o && i != -1) {
            m3757b(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (i != -1) {
            m3757b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i != -1) {
            m3757b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: a */
    public static boolean m3756a(C1488j jVar, C1539b bVar) {
        C1482e eVar;
        boolean z = false;
        for (Fragment fragment : jVar.mo6090a()) {
            if (fragment != null) {
                if (fragment.f605V.f4559b.mo6228a(C1539b.STARTED)) {
                    fragment.f605V.mo6231a(bVar);
                    z = true;
                }
                C1487i iVar = fragment.f628w;
                if (iVar == null) {
                    eVar = null;
                } else {
                    eVar = C1482e.this;
                }
                if (eVar != null) {
                    z |= m3756a(fragment.mo780T(), bVar);
                }
            }
        }
        return z;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f4350j.f4359a.f4365i.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
