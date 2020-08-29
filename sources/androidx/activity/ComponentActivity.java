package androidx.activity;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import p124p.p125a.C1017c;
import p124p.p150h.p151d.C1316d;
import p124p.p177n.C1537e;
import p124p.p177n.C1537e.C1538a;
import p124p.p177n.C1537e.C1539b;
import p124p.p177n.C1540f;
import p124p.p177n.C1542h;
import p124p.p177n.C1543i;
import p124p.p177n.C1552q;
import p124p.p177n.C1559v;
import p124p.p177n.C1560w;
import p124p.p185r.C1657a;
import p124p.p185r.C1660b;
import p124p.p185r.C1661c;

public class ComponentActivity extends C1316d implements C1542h, C1560w, C1661c, C1017c {

    /* renamed from: f */
    public final C1543i f0f = new C1543i(this);

    /* renamed from: g */
    public final C1660b f1g = new C1660b(this);

    /* renamed from: h */
    public C1559v f2h;

    /* renamed from: i */
    public final OnBackPressedDispatcher f3i = new OnBackPressedDispatcher(new C0003a());

    /* renamed from: androidx.activity.ComponentActivity$a */
    public class C0003a implements Runnable {
        public C0003a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    public static final class C0004b {

        /* renamed from: a */
        public C1559v f7a;
    }

    public ComponentActivity() {
        C1543i iVar = this.f0f;
        if (iVar != null) {
            iVar.mo6227a(new C1540f() {
                /* renamed from: a */
                public void mo9a(C1542h hVar, C1538a aVar) {
                    if (aVar == C1538a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
            this.f0f.mo6227a(new C1540f() {
                /* renamed from: a */
                public void mo9a(C1542h hVar, C1538a aVar) {
                    if (aVar == C1538a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.mo1G().mo6253a();
                    }
                }
            });
            if (VERSION.SDK_INT <= 23) {
                this.f0f.mo6227a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    /* renamed from: G */
    public C1559v mo1G() {
        if (getApplication() != null) {
            if (this.f2h == null) {
                C0004b bVar = (C0004b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.f2h = bVar.f7a;
                }
                if (this.f2h == null) {
                    this.f2h = new C1559v();
                }
            }
            return this.f2h;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    /* renamed from: g */
    public C1537e mo2g() {
        return this.f0f;
    }

    /* renamed from: i */
    public final OnBackPressedDispatcher mo3i() {
        return this.f3i;
    }

    /* renamed from: j */
    public final C1657a mo4j() {
        return this.f1g.f4897b;
    }

    public void onBackPressed() {
        this.f3i.mo11a();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1g.mo6461a(bundle);
        C1552q.m3947a((Activity) this);
    }

    public final Object onRetainNonConfigurationInstance() {
        C1559v vVar = this.f2h;
        if (vVar == null) {
            C0004b bVar = (C0004b) getLastNonConfigurationInstance();
            if (bVar != null) {
                vVar = bVar.f7a;
            }
        }
        if (vVar == null) {
            return null;
        }
        C0004b bVar2 = new C0004b();
        bVar2.f7a = vVar;
        return bVar2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C1543i iVar = this.f0f;
        if (iVar instanceof C1543i) {
            iVar.mo6231a(C1539b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f1g.mo6462b(bundle);
    }
}
