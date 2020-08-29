package p124p.p165i.p166a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: p.i.a.c */
public abstract class C1457c extends C1452a {

    /* renamed from: m */
    public int f4270m;

    /* renamed from: n */
    public int f4271n;

    /* renamed from: o */
    public LayoutInflater f4272o;

    @Deprecated
    public C1457c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f4271n = i;
        this.f4270m = i;
        this.f4272o = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public View mo5276a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f4272o.inflate(this.f4270m, viewGroup, false);
    }
}
