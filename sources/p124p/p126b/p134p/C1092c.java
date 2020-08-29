package p124p.p126b.p134p;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.view.LayoutInflater;
import p124p.p126b.C1026i;

/* renamed from: p.b.p.c */
public class C1092c extends ContextWrapper {

    /* renamed from: a */
    public int f2919a;

    /* renamed from: b */
    public Theme f2920b;

    /* renamed from: c */
    public LayoutInflater f2921c;

    /* renamed from: d */
    public Resources f2922d;

    public C1092c() {
        super(null);
    }

    public C1092c(Context context, int i) {
        super(context);
        this.f2919a = i;
    }

    public C1092c(Context context, Theme theme) {
        super(context);
        this.f2920b = theme;
    }

    /* renamed from: a */
    public final void mo4652a() {
        if (this.f2920b == null) {
            this.f2920b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2920b.setTo(theme);
            }
        }
        this.f2920b.applyStyle(this.f2919a, true);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        if (this.f2922d == null) {
            this.f2922d = super.getResources();
        }
        return this.f2922d;
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2921c == null) {
            this.f2921c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2921c;
    }

    public Theme getTheme() {
        Theme theme = this.f2920b;
        if (theme != null) {
            return theme;
        }
        if (this.f2919a == 0) {
            this.f2919a = C1026i.Theme_AppCompat_Light;
        }
        mo4652a();
        return this.f2920b;
    }

    public void setTheme(int i) {
        if (this.f2919a != i) {
            this.f2919a = i;
            mo4652a();
        }
    }
}
