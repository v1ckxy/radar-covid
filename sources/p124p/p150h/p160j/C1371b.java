package p124p.p150h.p160j;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.text.PrecomputedText.Params;
import android.text.PrecomputedText.Params.Builder;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.h.j.b */
public class C1371b implements Spannable {

    /* renamed from: p.h.j.b$a */
    public static final class C1372a {

        /* renamed from: a */
        public final TextPaint f4124a;

        /* renamed from: b */
        public final TextDirectionHeuristic f4125b;

        /* renamed from: c */
        public final int f4126c;

        /* renamed from: d */
        public final int f4127d;

        public C1372a(Params params) {
            this.f4124a = params.getTextPaint();
            this.f4125b = params.getTextDirection();
            this.f4126c = params.getBreakStrategy();
            this.f4127d = params.getHyphenationFrequency();
            int i = VERSION.SDK_INT;
        }

        @SuppressLint({"NewApi"})
        public C1372a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (VERSION.SDK_INT >= 29) {
                new Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.f4124a = textPaint;
            this.f4125b = textDirectionHeuristic;
            this.f4126c = i;
            this.f4127d = i2;
        }

        /* renamed from: a */
        public boolean mo5850a(C1372a aVar) {
            if (this.f4126c != aVar.f4126c || this.f4127d != aVar.f4127d || this.f4124a.getTextSize() != aVar.f4124a.getTextSize() || this.f4124a.getTextScaleX() != aVar.f4124a.getTextScaleX() || this.f4124a.getTextSkewX() != aVar.f4124a.getTextSkewX() || this.f4124a.getLetterSpacing() != aVar.f4124a.getLetterSpacing() || !TextUtils.equals(this.f4124a.getFontFeatureSettings(), aVar.f4124a.getFontFeatureSettings()) || this.f4124a.getFlags() != aVar.f4124a.getFlags()) {
                return false;
            }
            if (VERSION.SDK_INT >= 24) {
                if (!this.f4124a.getTextLocales().equals(aVar.f4124a.getTextLocales())) {
                    return false;
                }
            } else if (!this.f4124a.getTextLocale().equals(aVar.f4124a.getTextLocale())) {
                return false;
            }
            if (this.f4124a.getTypeface() == null) {
                if (aVar.f4124a.getTypeface() != null) {
                    return false;
                }
            } else if (!this.f4124a.getTypeface().equals(aVar.f4124a.getTypeface())) {
                return false;
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1372a)) {
                return false;
            }
            C1372a aVar = (C1372a) obj;
            return mo5850a(aVar) && this.f4125b == aVar.f4125b;
        }

        public int hashCode() {
            if (VERSION.SDK_INT >= 24) {
                return Objects.hash(new Object[]{Float.valueOf(this.f4124a.getTextSize()), Float.valueOf(this.f4124a.getTextScaleX()), Float.valueOf(this.f4124a.getTextSkewX()), Float.valueOf(this.f4124a.getLetterSpacing()), Integer.valueOf(this.f4124a.getFlags()), this.f4124a.getTextLocales(), this.f4124a.getTypeface(), Boolean.valueOf(this.f4124a.isElegantTextHeight()), this.f4125b, Integer.valueOf(this.f4126c), Integer.valueOf(this.f4127d)});
            }
            return Objects.hash(new Object[]{Float.valueOf(this.f4124a.getTextSize()), Float.valueOf(this.f4124a.getTextScaleX()), Float.valueOf(this.f4124a.getTextSkewX()), Float.valueOf(this.f4124a.getLetterSpacing()), Integer.valueOf(this.f4124a.getFlags()), this.f4124a.getTextLocale(), this.f4124a.getTypeface(), Boolean.valueOf(this.f4124a.isElegantTextHeight()), this.f4125b, Integer.valueOf(this.f4126c), Integer.valueOf(this.f4127d)});
        }

        public String toString() {
            Object obj;
            StringBuilder sb;
            StringBuilder sb2 = new StringBuilder(p116io.jsonwebtoken.lang.Objects.ARRAY_START);
            StringBuilder a = C1965a.m4756a("textSize=");
            a.append(this.f4124a.getTextSize());
            sb2.append(a.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(", textScaleX=");
            sb3.append(this.f4124a.getTextScaleX());
            sb2.append(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(", textSkewX=");
            sb4.append(this.f4124a.getTextSkewX());
            sb2.append(sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(", letterSpacing=");
            sb5.append(this.f4124a.getLetterSpacing());
            sb2.append(sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(", elegantTextHeight=");
            sb6.append(this.f4124a.isElegantTextHeight());
            sb2.append(sb6.toString());
            String str = ", textLocale=";
            if (VERSION.SDK_INT >= 24) {
                sb = C1965a.m4756a(str);
                obj = this.f4124a.getTextLocales();
            } else {
                sb = C1965a.m4756a(str);
                obj = this.f4124a.getTextLocale();
            }
            sb.append(obj);
            sb2.append(sb.toString());
            StringBuilder a2 = C1965a.m4756a(", typeface=");
            a2.append(this.f4124a.getTypeface());
            sb2.append(a2.toString());
            if (VERSION.SDK_INT >= 26) {
                StringBuilder a3 = C1965a.m4756a(", variationSettings=");
                a3.append(this.f4124a.getFontVariationSettings());
                sb2.append(a3.toString());
            }
            StringBuilder a4 = C1965a.m4756a(", textDir=");
            a4.append(this.f4125b);
            sb2.append(a4.toString());
            StringBuilder sb7 = new StringBuilder();
            sb7.append(", breakStrategy=");
            sb7.append(this.f4126c);
            sb2.append(sb7.toString());
            StringBuilder sb8 = new StringBuilder();
            sb8.append(", hyphenationFrequency=");
            sb8.append(this.f4127d);
            sb2.append(sb8.toString());
            sb2.append(p116io.jsonwebtoken.lang.Objects.ARRAY_END);
            return sb2.toString();
        }
    }

    public char charAt(int i) {
        throw null;
    }

    public int getSpanEnd(Object obj) {
        throw null;
    }

    public int getSpanFlags(Object obj) {
        throw null;
    }

    public int getSpanStart(Object obj) {
        throw null;
    }

    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        int i3 = VERSION.SDK_INT;
        throw null;
    }

    public int length() {
        throw null;
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        throw null;
    }

    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            int i = VERSION.SDK_INT;
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            int i4 = VERSION.SDK_INT;
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    public CharSequence subSequence(int i, int i2) {
        throw null;
    }

    public String toString() {
        throw null;
    }
}
