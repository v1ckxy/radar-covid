package p124p.p170k.p171a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import p124p.p126b.p127k.C1061o;

/* renamed from: p.k.a.i */
public abstract class C1487i<E> extends C1484f {

    /* renamed from: e */
    public final Activity f4361e;

    /* renamed from: f */
    public final Context f4362f;

    /* renamed from: g */
    public final Handler f4363g;

    /* renamed from: h */
    public final int f4364h;

    /* renamed from: i */
    public final C1490k f4365i = new C1490k();

    public C1487i(C1482e eVar) {
        Handler handler = new Handler();
        this.f4361e = eVar;
        C1061o.m2465a(eVar, (Object) "context == null");
        this.f4362f = eVar;
        C1061o.m2465a(handler, (Object) "handler == null");
        this.f4363g = handler;
        this.f4364h = 0;
    }

    /* renamed from: a */
    public abstract void mo6084a(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle);
}
