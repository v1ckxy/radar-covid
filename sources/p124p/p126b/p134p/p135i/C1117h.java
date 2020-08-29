package p124p.p126b.p134p.p135i;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import p124p.p126b.p127k.C1034d;
import p124p.p126b.p134p.p135i.C1129m.C1130a;

/* renamed from: p.b.p.i.h */
public class C1117h implements OnKeyListener, OnClickListener, OnDismissListener, C1130a {

    /* renamed from: e */
    public C1114g f3097e;

    /* renamed from: f */
    public C1034d f3098f;

    /* renamed from: g */
    public C1111e f3099g;

    public C1117h(C1114g gVar) {
        this.f3097e = gVar;
    }

    /* renamed from: a */
    public void mo196a(C1114g gVar, boolean z) {
        if (z || gVar == this.f3097e) {
            C1034d dVar = this.f3098f;
            if (dVar != null) {
                dVar.dismiss();
            }
        }
    }

    /* renamed from: a */
    public boolean mo197a(C1114g gVar) {
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f3097e.mo4809a((MenuItem) (C1118i) this.f3099g.mo4784a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C1111e eVar = this.f3099g;
        C1114g gVar = this.f3097e;
        C1130a aVar = eVar.f3061l;
        if (aVar != null) {
            aVar.mo196a(gVar, true);
        }
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window = this.f3098f.getWindow();
                if (window != null) {
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        DispatcherState keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                Window window2 = this.f3098f.getWindow();
                if (window2 != null) {
                    View decorView2 = window2.getDecorView();
                    if (decorView2 != null) {
                        DispatcherState keyDispatcherState2 = decorView2.getKeyDispatcherState();
                        if (keyDispatcherState2 != null && keyDispatcherState2.isTracking(keyEvent)) {
                            this.f3097e.mo4808a(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f3097e.performShortcut(i, keyEvent, 0);
    }
}
