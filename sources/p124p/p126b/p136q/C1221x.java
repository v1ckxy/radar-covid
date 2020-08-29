package p124p.p126b.p136q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: p.b.q.x */
public class C1221x {

    /* renamed from: k */
    public static final RectF f3472k = new RectF();

    /* renamed from: l */
    public static ConcurrentHashMap<String, Method> f3473l = new ConcurrentHashMap<>();

    /* renamed from: m */
    public static ConcurrentHashMap<String, Field> f3474m = new ConcurrentHashMap<>();

    /* renamed from: a */
    public int f3475a = 0;

    /* renamed from: b */
    public boolean f3476b = false;

    /* renamed from: c */
    public float f3477c = -1.0f;

    /* renamed from: d */
    public float f3478d = -1.0f;

    /* renamed from: e */
    public float f3479e = -1.0f;

    /* renamed from: f */
    public int[] f3480f = new int[0];

    /* renamed from: g */
    public boolean f3481g = false;

    /* renamed from: h */
    public TextPaint f3482h;

    /* renamed from: i */
    public final TextView f3483i;

    /* renamed from: j */
    public final Context f3484j;

    public C1221x(TextView textView) {
        this.f3483i = textView;
        this.f3484j = textView.getContext();
    }

    /* renamed from: a */
    public static <T> T m3070a(Object obj, String str, T t) {
        try {
            return m3071a(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            String str2 = "ACTVAutoSizeHelper";
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to invoke TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w(str2, sb.toString(), e);
            return t;
        }
    }

    /* renamed from: a */
    public static Method m3071a(String str) {
        try {
            Method method = (Method) f3473l.get(str);
            if (method == null) {
                method = TextView.class.getDeclaredMethod(str, new Class[0]);
                if (method != null) {
                    method.setAccessible(true);
                    f3473l.put(str, method);
                }
            }
            return method;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo5388a() {
        if (mo5394d() && this.f3475a != 0) {
            if (this.f3476b) {
                if (this.f3483i.getMeasuredHeight() > 0 && this.f3483i.getMeasuredWidth() > 0) {
                    int measuredWidth = VERSION.SDK_INT >= 29 ? this.f3483i.isHorizontallyScrollable() : ((Boolean) m3070a((Object) this.f3483i, "getHorizontallyScrolling", (T) Boolean.valueOf(false))).booleanValue() ? 1048576 : (this.f3483i.getMeasuredWidth() - this.f3483i.getTotalPaddingLeft()) - this.f3483i.getTotalPaddingRight();
                    int height = (this.f3483i.getHeight() - this.f3483i.getCompoundPaddingBottom()) - this.f3483i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        synchronized (f3472k) {
                            f3472k.setEmpty();
                            f3472k.right = (float) measuredWidth;
                            f3472k.bottom = (float) height;
                            float a = (float) mo5387a(f3472k);
                            if (a != this.f3483i.getTextSize()) {
                                mo5390a(0, a);
                            }
                        }
                    }
                }
                return;
            }
            this.f3476b = true;
        }
    }

    /* renamed from: a */
    public final void mo5389a(float f, float f2, float f3) {
        String str = "px) is less or equal to (0px)";
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("Minimum auto-size text size (");
            sb.append(f);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 <= f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Maximum auto-size text size (");
            sb2.append(f2);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(f);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        } else if (f3 > 0.0f) {
            this.f3475a = 1;
            this.f3478d = f;
            this.f3479e = f2;
            this.f3477c = f3;
            this.f3481g = false;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("The auto-size step granularity (");
            sb3.append(f3);
            sb3.append(str);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* renamed from: a */
    public final int[] mo5391a(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: b */
    public final boolean mo5392b() {
        if (!mo5394d() || this.f3475a != 1) {
            this.f3476b = false;
        } else {
            if (!this.f3481g || this.f3480f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f3479e - this.f3478d) / this.f3477c))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((((float) i) * this.f3477c) + this.f3478d);
                }
                this.f3480f = mo5391a(iArr);
            }
            this.f3476b = true;
        }
        return this.f3476b;
    }

    /* renamed from: c */
    public final boolean mo5393c() {
        int length = this.f3480f.length;
        boolean z = length > 0;
        this.f3481g = z;
        if (z) {
            this.f3475a = 1;
            int[] iArr = this.f3480f;
            this.f3478d = (float) iArr[0];
            this.f3479e = (float) iArr[length - 1];
            this.f3477c = -1.0f;
        }
        return this.f3481g;
    }

    /* renamed from: d */
    public final boolean mo5394d() {
        return !(this.f3483i instanceof C1181j);
    }

    /* renamed from: a */
    public final int mo5387a(RectF rectF) {
        int length = this.f3480f.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                int i5 = this.f3480f[i4];
                CharSequence text = this.f3483i.getText();
                TransformationMethod transformationMethod = this.f3483i.getTransformationMethod();
                if (transformationMethod != null) {
                    CharSequence transformation = transformationMethod.getTransformation(text, this.f3483i);
                    if (transformation != null) {
                        text = transformation;
                    }
                }
                int maxLines = this.f3483i.getMaxLines();
                TextPaint textPaint = this.f3482h;
                if (textPaint == null) {
                    this.f3482h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f3482h.set(this.f3483i.getPaint());
                this.f3482h.setTextSize((float) i5);
                Alignment alignment = (Alignment) m3070a((Object) this.f3483i, "getLayoutAlignment", (T) Alignment.ALIGN_NORMAL);
                Builder obtain = Builder.obtain(text, 0, text.length(), this.f3482h, Math.round(rectF.right));
                obtain.setAlignment(alignment).setLineSpacing(this.f3483i.getLineSpacingExtra(), this.f3483i.getLineSpacingMultiplier()).setIncludePad(this.f3483i.getIncludeFontPadding()).setBreakStrategy(this.f3483i.getBreakStrategy()).setHyphenationFrequency(this.f3483i.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                try {
                    obtain.setTextDirection(VERSION.SDK_INT >= 29 ? this.f3483i.getTextDirectionHeuristic() : (TextDirectionHeuristic) m3070a((Object) this.f3483i, "getTextDirectionHeuristic", (T) TextDirectionHeuristics.FIRSTSTRONG_LTR));
                } catch (ClassCastException unused) {
                    Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                }
                StaticLayout build = obtain.build();
                if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && ((float) build.getHeight()) <= rectF.bottom) {
                    int i6 = i4 + 1;
                    i3 = i2;
                    i2 = i6;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f3480f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: a */
    public void mo5390a(int i, float f) {
        Context context = this.f3484j;
        float applyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.f3483i.getPaint().getTextSize()) {
            this.f3483i.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.f3483i.isInLayout();
            if (this.f3483i.getLayout() != null) {
                this.f3476b = false;
                try {
                    Method a = m3071a("nullLayouts");
                    if (a != null) {
                        a.invoke(this.f3483i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f3483i.requestLayout();
                } else {
                    this.f3483i.forceLayout();
                }
                this.f3483i.invalidate();
            }
        }
    }
}
