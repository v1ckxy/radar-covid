package p124p.p150h.p154f;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface.CustomFallbackBuilder;
import android.graphics.fonts.Font;
import android.graphics.fonts.Font.Builder;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import p124p.p150h.p152e.p153b.C1328c;
import p124p.p150h.p152e.p153b.C1329d;
import p124p.p150h.p159i.C1355b.C1361f;

/* renamed from: p.h.f.i */
public class C1343i extends C1344j {
    /* renamed from: a */
    public Typeface mo5801a(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Builder(resources, i).build();
            return new CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public Typeface mo5800a(Context context, C1328c cVar, Resources resources, int i) {
        C1329d[] dVarArr = cVar.f4018a;
        int length = dVarArr.length;
        int i2 = 0;
        FontFamily.Builder builder = null;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= length) {
                break;
            }
            C1329d dVar = dVarArr[i3];
            try {
                Builder weight = new Builder(resources, dVar.f4024f).setWeight(dVar.f4020b);
                if (!dVar.f4021c) {
                    i4 = 0;
                }
                Font build = weight.setSlant(i4).setTtcIndex(dVar.f4023e).setFontVariationSettings(dVar.f4022d).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
            } catch (IOException unused) {
            }
            i3++;
        }
        if (builder == null) {
            return null;
        }
        int i5 = (i & 1) != 0 ? 700 : 400;
        if ((i & 2) != 0) {
            i2 = 1;
        }
        return new CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i5, i2)).build();
    }

    /* renamed from: a */
    public C1361f mo5810a(C1361f[] fVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* renamed from: a */
    public Typeface mo5799a(Context context, CancellationSignal cancellationSignal, C1361f[] fVarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        int length = fVarArr.length;
        int i2 = 0;
        FontFamily.Builder builder = null;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 < length) {
                C1361f fVar = fVarArr[i3];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(fVar.f4084a, "r", cancellationSignal);
                    if (openFileDescriptor != null) {
                        Builder weight = new Builder(openFileDescriptor).setWeight(fVar.f4086c);
                        if (!fVar.f4087d) {
                            i4 = 0;
                        }
                        Font build = weight.setSlant(i4).setTtcIndex(fVar.f4085b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } else if (openFileDescriptor == null) {
                        i3++;
                    }
                    openFileDescriptor.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    break;
                }
                i3++;
            } else if (builder == null) {
                return null;
            } else {
                int i5 = (i & 1) != 0 ? 700 : 400;
                if ((i & 2) != 0) {
                    i2 = 1;
                }
                return new CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i5, i2)).build();
            }
        }
        throw th;
    }
}
