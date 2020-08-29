package p003f.p004a.p005a.p108g.p114c;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AlertController.C0007b;
import es.gob.radarcovid.R;
import p124p.p126b.p127k.C1034d;
import p124p.p126b.p127k.C1034d.C1035a;
import p392u.C4560l;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.g.c.d */
public final class C0837d {

    /* renamed from: a */
    public final View f2392a;

    /* renamed from: b */
    public final TextView f2393b;

    /* renamed from: c */
    public final TextView f2394c;

    /* renamed from: d */
    public final Button f2395d;

    /* renamed from: e */
    public final Button f2396e;

    /* renamed from: f */
    public final Button f2397f;

    /* renamed from: g */
    public final C1034d f2398g;

    /* renamed from: h */
    public final Context f2399h;

    /* renamed from: f.a.a.g.c.d$a */
    public static final class C0838a implements OnClickListener {

        /* renamed from: e */
        public final /* synthetic */ C0837d f2400e;

        /* renamed from: f */
        public final /* synthetic */ C4618l f2401f;

        public C0838a(C0837d dVar, C4618l lVar) {
            this.f2400e = dVar;
            this.f2401f = lVar;
        }

        public final void onClick(View view) {
            this.f2401f.mo3153b(this.f2400e.f2398g);
        }
    }

    /* renamed from: f.a.a.g.c.d$b */
    public static final class C0839b implements OnClickListener {

        /* renamed from: e */
        public final /* synthetic */ C0837d f2402e;

        /* renamed from: f */
        public final /* synthetic */ C4618l f2403f;

        public C0839b(C0837d dVar, C4618l lVar) {
            this.f2402e = dVar;
            this.f2403f = lVar;
        }

        public final void onClick(View view) {
            this.f2403f.mo3153b(this.f2402e.f2398g);
        }
    }

    /* renamed from: f.a.a.g.c.d$c */
    public static final class C0840c implements OnClickListener {

        /* renamed from: e */
        public final /* synthetic */ C0837d f2404e;

        /* renamed from: f */
        public final /* synthetic */ C4618l f2405f;

        public C0840c(C0837d dVar, C4618l lVar) {
            this.f2404e = dVar;
            this.f2405f = lVar;
        }

        public final void onClick(View view) {
            this.f2405f.mo3153b(this.f2404e.f2398g);
        }
    }

    public C0837d(Context context) {
        if (context != null) {
            this.f2399h = context;
            View inflate = LayoutInflater.from(context).inflate(R.layout.dialog, null);
            C4638h.m10270a((Object) inflate, "LayoutInflater.from(cont…te(R.layout.dialog, null)");
            this.f2392a = inflate;
            this.f2393b = (TextView) inflate.findViewById(R.id.textViewDialogTitle);
            this.f2394c = (TextView) this.f2392a.findViewById(R.id.textViewDialogDescription);
            this.f2395d = (Button) this.f2392a.findViewById(R.id.buttonOk);
            this.f2396e = (Button) this.f2392a.findViewById(R.id.buttonCancel);
            this.f2397f = (Button) this.f2392a.findViewById(R.id.buttonClose);
            C1035a aVar = new C1035a(this.f2399h);
            View view = this.f2392a;
            C0007b bVar = aVar.f2683a;
            bVar.f86r = view;
            bVar.f85q = 0;
            bVar.f87s = false;
            bVar.f79k = false;
            C1034d a = aVar.mo4425a();
            Window window = a.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            C4638h.m10270a((Object) a, "AlertDialog.Builder(cont…ANSPARENT))\n            }");
            this.f2398g = a;
            return;
        }
        C4638h.m10271a("context");
        throw null;
    }

    /* renamed from: a */
    public final C0837d mo3898a(C4618l<? super C1034d, C4560l> lVar) {
        if (lVar != null) {
            Button button = this.f2397f;
            C4638h.m10270a((Object) button, "buttonClose");
            button.setVisibility(0);
            this.f2397f.setOnClickListener(new C0838a(this, lVar));
            return this;
        }
        C4638h.m10271a("onCloseButtonClick");
        throw null;
    }

    /* renamed from: b */
    public final C0837d mo3900b(String str, C4618l<? super C1034d, C4560l> lVar) {
        if (str == null) {
            C4638h.m10271a("text");
            throw null;
        } else if (lVar != null) {
            Button button = this.f2395d;
            String str2 = "buttonOk";
            C4638h.m10270a((Object) button, str2);
            button.setVisibility(0);
            Button button2 = this.f2395d;
            C4638h.m10270a((Object) button2, str2);
            button2.setText(str);
            this.f2395d.setOnClickListener(new C0840c(this, lVar));
            return this;
        } else {
            C4638h.m10271a("onPositiveButtonClick");
            throw null;
        }
    }

    /* renamed from: a */
    public final C0837d mo3896a(String str) {
        if (str != null) {
            TextView textView = this.f2394c;
            String str2 = "textViewDescription";
            C4638h.m10270a((Object) textView, str2);
            textView.setVisibility(0);
            TextView textView2 = this.f2394c;
            C4638h.m10270a((Object) textView2, str2);
            textView2.setText(str);
            return this;
        }
        C4638h.m10271a("text");
        throw null;
    }

    /* renamed from: b */
    public final C0837d mo3899b(String str) {
        if (str != null) {
            TextView textView = this.f2393b;
            String str2 = "textViewTitle";
            C4638h.m10270a((Object) textView, str2);
            textView.setVisibility(0);
            TextView textView2 = this.f2393b;
            C4638h.m10270a((Object) textView2, str2);
            textView2.setText(str);
            return this;
        }
        C4638h.m10271a("text");
        throw null;
    }

    /* renamed from: a */
    public final C0837d mo3897a(String str, C4618l<? super C1034d, C4560l> lVar) {
        if (str == null) {
            C4638h.m10271a("text");
            throw null;
        } else if (lVar != null) {
            Button button = this.f2396e;
            String str2 = "buttonCancel";
            C4638h.m10270a((Object) button, str2);
            button.setVisibility(0);
            Button button2 = this.f2396e;
            C4638h.m10270a((Object) button2, str2);
            button2.setText(str);
            this.f2396e.setOnClickListener(new C0839b(this, lVar));
            return this;
        } else {
            C4638h.m10271a("onNegativeButtonClick");
            throw null;
        }
    }
}
