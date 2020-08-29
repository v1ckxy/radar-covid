package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: j */
    public static final Mode f544j = Mode.SRC_IN;

    /* renamed from: a */
    public int f545a = -1;

    /* renamed from: b */
    public Object f546b;

    /* renamed from: c */
    public byte[] f547c = null;

    /* renamed from: d */
    public Parcelable f548d = null;

    /* renamed from: e */
    public int f549e = 0;

    /* renamed from: f */
    public int f550f = 0;

    /* renamed from: g */
    public ColorStateList f551g = null;

    /* renamed from: h */
    public Mode f552h = f544j;

    /* renamed from: i */
    public String f553i = null;

    public IconCompat() {
    }

    public IconCompat(int i) {
        this.f545a = i;
    }

    /* renamed from: a */
    public static Bitmap m224a(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        TileMode tileMode = TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: a */
    public static IconCompat m225a(Resources resources, String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f549e = i;
            if (resources != null) {
                try {
                    iconCompat.f546b = resources.getResourceName(i);
                } catch (NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f546b = str;
            }
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    /* renamed from: a */
    public int mo685a() {
        int i;
        int i2 = this.f545a;
        if (i2 == -1) {
            Icon icon = (Icon) this.f546b;
            String str = "Unable to get icon resource";
            String str2 = "IconCompat";
            if (VERSION.SDK_INT >= 28) {
                i = icon.getResId();
            } else {
                i = 0;
                try {
                    i = ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    Log.e(str2, str, e);
                }
            }
            return i;
        } else if (i2 == 2) {
            return this.f549e;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("called getResId() on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    public String mo686b() {
        String str;
        int i = this.f545a;
        if (i == -1) {
            Icon icon = (Icon) this.f546b;
            String str2 = "Unable to get icon package";
            String str3 = "IconCompat";
            if (VERSION.SDK_INT >= 28) {
                str = icon.getResPackage();
            } else {
                str = null;
                try {
                    str = (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    Log.e(str3, str2, e);
                }
            }
            return str;
        } else if (i == 2) {
            return ((String) this.f546b).split(":", -1)[0];
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("called getResPackage() on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: c */
    public Uri mo687c() {
        Uri uri;
        int i = this.f545a;
        if (i == -1) {
            Icon icon = (Icon) this.f546b;
            String str = "Unable to get icon uri";
            String str2 = "IconCompat";
            if (VERSION.SDK_INT >= 28) {
                uri = icon.getUri();
            } else {
                uri = null;
                try {
                    uri = (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    Log.e(str2, str, e);
                }
            }
            return uri;
        } else if (i == 4 || i == 6) {
            return Uri.parse((String) this.f546b);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("called getUri() on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }

    @java.lang.Deprecated
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Icon mo688d() {
        /*
            r3 = this;
            int r0 = r3.f545a
            r1 = 0
            r2 = 26
            switch(r0) {
                case -1: goto L_0x0077;
                case 0: goto L_0x0008;
                case 1: goto L_0x005e;
                case 2: goto L_0x0053;
                case 3: goto L_0x0046;
                case 4: goto L_0x003d;
                case 5: goto L_0x0027;
                case 6: goto L_0x0010;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown type"
            r0.<init>(r1)
            throw r0
        L_0x0010:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
            java.lang.StringBuilder r1 = p213q.p214a.p215a.p216a.C1965a.m4756a(r1)
            android.net.Uri r2 = r3.mo687c()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0027:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L_0x0034
            java.lang.Object r0 = r3.f546b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r0)
            goto L_0x0066
        L_0x0034:
            java.lang.Object r0 = r3.f546b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.Bitmap r0 = m224a(r0, r1)
            goto L_0x0062
        L_0x003d:
            java.lang.Object r0 = r3.f546b
            java.lang.String r0 = (java.lang.String) r0
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithContentUri(r0)
            goto L_0x0066
        L_0x0046:
            java.lang.Object r0 = r3.f546b
            byte[] r0 = (byte[]) r0
            int r1 = r3.f549e
            int r2 = r3.f550f
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithData(r0, r1, r2)
            goto L_0x0066
        L_0x0053:
            java.lang.String r0 = r3.mo686b()
            int r1 = r3.f549e
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithResource(r0, r1)
            goto L_0x0066
        L_0x005e:
            java.lang.Object r0 = r3.f546b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
        L_0x0062:
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithBitmap(r0)
        L_0x0066:
            android.content.res.ColorStateList r1 = r3.f551g
            if (r1 == 0) goto L_0x006d
            r0.setTintList(r1)
        L_0x006d:
            android.graphics.PorterDuff$Mode r1 = r3.f552h
            android.graphics.PorterDuff$Mode r2 = f544j
            if (r1 == r2) goto L_0x007b
            r0.setTintMode(r1)
            goto L_0x007b
        L_0x0077:
            java.lang.Object r0 = r3.f546b
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
        L_0x007b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.mo688d():android.graphics.drawable.Icon");
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f545a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.f546b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f545a
            switch(r1) {
                case 1: goto L_0x002a;
                case 2: goto L_0x0027;
                case 3: goto L_0x0024;
                case 4: goto L_0x0021;
                case 5: goto L_0x001e;
                case 6: goto L_0x001b;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.String r1 = "UNKNOWN"
            goto L_0x002c
        L_0x001b:
            java.lang.String r1 = "URI_MASKABLE"
            goto L_0x002c
        L_0x001e:
            java.lang.String r1 = "BITMAP_MASKABLE"
            goto L_0x002c
        L_0x0021:
            java.lang.String r1 = "URI"
            goto L_0x002c
        L_0x0024:
            java.lang.String r1 = "DATA"
            goto L_0x002c
        L_0x0027:
            java.lang.String r1 = "RESOURCE"
            goto L_0x002c
        L_0x002a:
            java.lang.String r1 = "BITMAP"
        L_0x002c:
            r0.append(r1)
            int r1 = r4.f545a
            switch(r1) {
                case 1: goto L_0x007f;
                case 2: goto L_0x0056;
                case 3: goto L_0x0040;
                case 4: goto L_0x0035;
                case 5: goto L_0x007f;
                case 6: goto L_0x0035;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x009f
        L_0x0035:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f546b
            r0.append(r1)
            goto L_0x009f
        L_0x0040:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f549e
            r0.append(r1)
            int r1 = r4.f550f
            if (r1 == 0) goto L_0x009f
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f550f
            goto L_0x009c
        L_0x0056:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.mo686b()
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.mo685a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x009f
        L_0x007f:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f546b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f546b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L_0x009c:
            r0.append(r1)
        L_0x009f:
            android.content.res.ColorStateList r1 = r4.f551g
            if (r1 == 0) goto L_0x00ad
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f551g
            r0.append(r1)
        L_0x00ad:
            android.graphics.PorterDuff$Mode r1 = r4.f552h
            android.graphics.PorterDuff$Mode r2 = f544j
            if (r1 == r2) goto L_0x00bd
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f552h
            r0.append(r1)
        L_0x00bd:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
