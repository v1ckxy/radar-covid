package p213q.p217b.p218a.p271c.p277f0;

import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import p124p.p150h.p154f.C1335a;

/* renamed from: q.b.a.c.f0.a */
public class C3328a {

    /* renamed from: h */
    public static final int[] f8349h = new int[3];

    /* renamed from: i */
    public static final float[] f8350i = {0.0f, 0.5f, 1.0f};

    /* renamed from: j */
    public static final int[] f8351j = new int[4];

    /* renamed from: k */
    public static final float[] f8352k = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    public final Paint f8353a;

    /* renamed from: b */
    public final Paint f8354b;

    /* renamed from: c */
    public final Paint f8355c;

    /* renamed from: d */
    public int f8356d;

    /* renamed from: e */
    public int f8357e;

    /* renamed from: f */
    public int f8358f;

    /* renamed from: g */
    public final Path f8359g = new Path();

    public C3328a() {
        mo9049a(-16777216);
        Paint paint = new Paint(4);
        this.f8354b = paint;
        paint.setStyle(Style.FILL);
        Paint paint2 = new Paint();
        this.f8353a = paint2;
        paint2.setColor(this.f8356d);
        this.f8355c = new Paint(this.f8354b);
    }

    /* renamed from: a */
    public void mo9049a(int i) {
        this.f8356d = C1335a.m3389b(i, 68);
        this.f8357e = C1335a.m3389b(i, 20);
        this.f8358f = C1335a.m3389b(i, 0);
    }
}
