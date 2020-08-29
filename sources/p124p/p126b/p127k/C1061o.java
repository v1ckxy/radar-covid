package p124p.p126b.p127k;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Process;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Property;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode.Callback;
import android.view.InflateException;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C0099a0;
import androidx.recyclerview.widget.RecyclerView.C0120o;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p116io.jsonwebtoken.lang.Objects;
import p116io.jsonwebtoken.lang.Strings;
import p124p.p126b.p136q.C1146b1;
import p124p.p126b.p136q.C1222x0;
import p124p.p144f.p145a.p146h.C1274c;
import p124p.p144f.p145a.p146h.C1278d;
import p124p.p144f.p145a.p146h.C1278d.C1279a;
import p124p.p144f.p145a.p146h.C1280e;
import p124p.p144f.p145a.p146h.C1281f;
import p124p.p144f.p145a.p146h.C1284i;
import p124p.p144f.p145a.p146h.C1285j;
import p124p.p144f.p145a.p146h.C1287l;
import p124p.p150h.C1308c;
import p124p.p150h.p152e.p153b.C1326a;
import p124p.p150h.p152e.p153b.C1327b;
import p124p.p150h.p152e.p153b.C1328c;
import p124p.p150h.p152e.p153b.C1329d;
import p124p.p150h.p152e.p153b.C1330e;
import p124p.p150h.p152e.p153b.C1332g;
import p124p.p150h.p154f.C1337c;
import p124p.p150h.p154f.p155k.C1345a;
import p124p.p150h.p159i.C1354a;
import p124p.p150h.p160j.C1371b;
import p124p.p150h.p164m.C1450d;
import p124p.p180p.p181d.C1606t;
import p124p.p192v.p193a.p194a.C1746a;
import p124p.p192v.p193a.p194a.C1752d;
import p124p.p192v.p193a.p194a.C1753e;
import p124p.p199y.C1784a;
import p124p.p199y.C1802m;
import p124p.p199y.C1816t;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p219a.p220e.C1998c;
import p213q.p217b.p218a.p219a.p220e.C1999d;
import p213q.p217b.p218a.p219a.p220e.C2000e.C2001a;
import p213q.p217b.p218a.p219a.p220e.C2000e.C2002b;
import p213q.p217b.p218a.p219a.p222f.p224q.C2042a;
import p213q.p217b.p218a.p231b.p239d.p240m.C2147b;
import p213q.p217b.p218a.p231b.p239d.p242n.C2254m;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2259b;
import p213q.p217b.p218a.p231b.p239d.p244o.C2275a;
import p213q.p217b.p218a.p231b.p239d.p244o.C2276b;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p270l.C3257j;

/* renamed from: p.b.k.o */
public class C1061o {

    /* renamed from: a */
    public static Field f2787a;

    /* renamed from: b */
    public static boolean f2788b;

    /* renamed from: c */
    public static Class<?> f2789c;

    /* renamed from: d */
    public static boolean f2790d;

    /* renamed from: e */
    public static Field f2791e;

    /* renamed from: f */
    public static boolean f2792f;

    /* renamed from: g */
    public static Field f2793g;

    /* renamed from: h */
    public static boolean f2794h;

    /* renamed from: i */
    public static C2275a f2795i;

    /* renamed from: j */
    public static Boolean f2796j;

    /* renamed from: k */
    public static Boolean f2797k;

    /* renamed from: l */
    public static Boolean f2798l;

    /* renamed from: m */
    public static Boolean f2799m;

    /* renamed from: a */
    public static float m2430a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m2515a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: a */
    public static int m2431a(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static int m2432a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: a */
    public static int m2434a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m2515a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: a */
    public static int m2435a(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        StringBuilder sb = new StringBuilder();
        String str2 = "`";
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        return cursor.getColumnIndexOrThrow(sb.toString());
    }

    /* renamed from: a */
    public static int m2436a(Parcel parcel) {
        return m2565m(parcel, 20293);
    }

    /* renamed from: a */
    public static int m2437a(C0099a0 a0Var, C1606t tVar, View view, View view2, C0120o oVar, boolean z) {
        if (oVar.mo1222d() == 0 || a0Var.mo1135a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.mo1237i(view) - oVar.mo1237i(view2)) + 1;
        }
        return Math.min(tVar.mo6367g(), tVar.mo6355a(view2) - tVar.mo6362d(view));
    }

    /* renamed from: a */
    public static int m2438a(C0099a0 a0Var, C1606t tVar, View view, View view2, C0120o oVar, boolean z, boolean z2) {
        if (oVar.mo1222d() == 0 || a0Var.mo1135a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (a0Var.mo1135a() - Math.max(oVar.mo1237i(view), oVar.mo1237i(view2))) - 1) : Math.max(0, Math.min(oVar.mo1237i(view), oVar.mo1237i(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(tVar.mo6355a(view2) - tVar.mo6362d(view))) / ((float) (Math.abs(oVar.mo1237i(view) - oVar.mo1237i(view2)) + 1)))) + ((float) (tVar.mo6365f() - tVar.mo6362d(view))));
    }

    /* renamed from: a */
    public static int m2439a(C1278d dVar) {
        if (dVar.mo5698e() == C1279a.MATCH_CONSTRAINT) {
            int d = (int) (dVar.f3703H == 0 ? ((float) dVar.mo5696d()) * dVar.f3702G : ((float) dVar.mo5696d()) / dVar.f3702G);
            dVar.mo5701f(d);
            return d;
        } else if (dVar.mo5704i() != C1279a.MATCH_CONSTRAINT) {
            return -1;
        } else {
            int j = (int) (dVar.f3703H == 1 ? ((float) dVar.mo5705j()) * dVar.f3702G : ((float) dVar.mo5705j()) / dVar.f3702G);
            dVar.mo5699e(j);
            return j;
        }
    }

    /* renamed from: a */
    public static int m2440a(C1278d dVar, int i) {
        int i2 = i * 2;
        C1274c[] cVarArr = dVar.f3696A;
        C1274c cVar = cVarArr[i2];
        C1274c cVar2 = cVarArr[i2 + 1];
        C1274c cVar3 = cVar.f3672d;
        if (cVar3 != null) {
            C1278d dVar2 = cVar3.f3670b;
            C1278d dVar3 = dVar.f3699D;
            if (dVar2 == dVar3) {
                C1274c cVar4 = cVar2.f3672d;
                if (cVar4 != null && cVar4.f3670b == dVar3) {
                    return (int) (((float) (((dVar3.mo5693c(i) - cVar.mo5674a()) - cVar2.mo5674a()) - dVar.mo5693c(i))) * (i == 0 ? dVar.f3717V : dVar.f3718W));
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m2443a(C1816t tVar) {
        int ordinal = tVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Could not convert ");
                        sb.append(tVar);
                        sb.append(" to int");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public static Keyframe m2445a(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* renamed from: a */
    public static <T> ObjectAnimator m2446a(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t, property, null, path);
    }

    /* renamed from: a */
    public static Intent m2450a(Context context, ComponentName componentName) {
        String b = m2527b(context, componentName);
        if (b == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b);
        return m2527b(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: a */
    public static ColorStateList m2451a(Resources resources, XmlPullParser xmlPullParser, Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m2452a(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: a */
    public static TypedArray m2453a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public static Typeface m2454a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m2455a(context, i, new TypedValue(), 0, (C1332g) null, (Handler) null, false);
    }

    /* renamed from: a */
    public static <T extends Drawable> T m2456a(Drawable drawable) {
        return drawable instanceof C1345a ? ((C1345a) drawable).mo5812a() : drawable;
    }

    /* renamed from: a */
    public static Bundle m2457a(Parcel parcel, int i) {
        int k = m2563k(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (k == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + k);
        return readBundle;
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m2458a(Parcel parcel, int i, Creator<T> creator) {
        int k = m2563k(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (k == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + k);
        return t;
    }

    /* renamed from: a */
    public static Spanned m2459a(String str, int i) {
        return VERSION.SDK_INT >= 24 ? Html.fromHtml(str, i) : Html.fromHtml(str);
    }

    /* renamed from: a */
    public static Callback m2460a(TextView textView, Callback callback) {
        int i = VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof C1450d)) ? callback : new C1450d(callback, textView);
    }

    /* renamed from: a */
    public static InputConnection m2461a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof C1146b1) {
                    editorInfo.hintText = ((C1146b1) parent).mo5054a();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return inputConnection;
    }

    /* renamed from: a */
    public static File m2462a(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        StringBuilder a = C1965a.m4756a(".font");
        a.append(Process.myPid());
        String str = "-";
        a.append(str);
        a.append(Process.myTid());
        a.append(str);
        String sb = a.toString();
        int i = 0;
        while (i < 100) {
            File file = new File(cacheDir, C1965a.m4761b(sb, i));
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static <T> T m2464a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: a */
    public static <T> T m2465a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static String m2466a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m2515a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: a */
    public static String m2467a(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static ByteBuffer m2468a(Context context, CancellationSignal cancellationSignal, Uri uri) {
        FileInputStream fileInputStream;
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(MapMode.READ_ONLY, 0, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } catch (Throwable th) {
                openFileDescriptor.close();
                throw th;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    /* renamed from: a */
    public static List<byte[]> m2470a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    @Deprecated
    /* renamed from: a */
    public static synchronized C2275a m2475a() {
        C2275a aVar;
        synchronized (C1061o.class) {
            if (f2795i == null) {
                f2795i = new C2276b();
            }
            aVar = f2795i;
        }
        return aVar;
    }

    /* renamed from: a */
    public static void m2476a(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    /* renamed from: a */
    public static void m2477a(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    /* renamed from: a */
    public static void m2478a(Drawable drawable, Mode mode) {
        drawable.setTintMode(mode);
    }

    /* renamed from: a */
    public static void m2479a(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(C1965a.m4743a(name, C1965a.m4743a(name2, 36)));
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(Strings.CURRENT_PATH);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m2480a(Parcel parcel, int i, int i2) {
        m2541c(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: a */
    public static void m2481a(Parcel parcel, int i, long j) {
        m2541c(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: a */
    public static void m2482a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                m2541c(parcel, i, 0);
            }
            return;
        }
        int m = m2565m(parcel, i);
        parcel.writeBundle(bundle);
        m2566n(parcel, m);
    }

    /* renamed from: a */
    public static void m2483a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                m2541c(parcel, i, 0);
            }
            return;
        }
        int m = m2565m(parcel, i);
        parcel.writeStrongBinder(iBinder);
        m2566n(parcel, m);
    }

    /* renamed from: a */
    public static void m2484a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                m2541c(parcel, i, 0);
            }
            return;
        }
        int m = m2565m(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        m2566n(parcel, m);
    }

    /* renamed from: a */
    public static void m2485a(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                m2541c(parcel, i, 0);
            }
            return;
        }
        int m = m2565m(parcel, i);
        parcel.writeString(str);
        m2566n(parcel, m);
    }

    /* renamed from: a */
    public static void m2486a(Parcel parcel, int i, List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                m2541c(parcel, i, 0);
            }
            return;
        }
        int m = m2565m(parcel, i);
        parcel.writeStringList(list);
        m2566n(parcel, m);
    }

    /* renamed from: a */
    public static void m2487a(Parcel parcel, int i, boolean z) {
        m2541c(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static void m2488a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                m2541c(parcel, i, 0);
            }
            return;
        }
        int m = m2565m(parcel, i);
        parcel.writeByteArray(bArr);
        m2566n(parcel, m);
    }

    /* renamed from: a */
    public static void m2489a(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                m2541c(parcel, i, 0);
            }
            return;
        }
        int m = m2565m(parcel, i);
        parcel.writeIntArray(iArr);
        m2566n(parcel, m);
    }

    /* renamed from: a */
    public static <T extends Parcelable> void m2490a(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (z) {
                m2541c(parcel, i, 0);
            }
            return;
        }
        int m = m2565m(parcel, i);
        parcel.writeInt(r7);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m2491a(parcel, t, i2);
            }
        }
        m2566n(parcel, m);
    }

    /* renamed from: a */
    public static <T extends Parcelable> void m2491a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: a */
    public static void m2493a(TextView textView, int i) {
        m2431a(i);
        if (VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: a */
    public static void m2496a(Object obj, StringBuilder sb) {
        String hexString;
        if (obj == null) {
            hexString = Objects.NULL_STRING;
        } else {
            String simpleName = obj.getClass().getSimpleName();
            if (simpleName.length() <= 0) {
                simpleName = obj.getClass().getName();
                int lastIndexOf = simpleName.lastIndexOf(46);
                if (lastIndexOf > 0) {
                    simpleName = simpleName.substring(lastIndexOf + 1);
                }
            }
            sb.append(simpleName);
            sb.append('{');
            hexString = Integer.toHexString(System.identityHashCode(obj));
        }
        sb.append(hexString);
    }

    /* renamed from: a */
    public static void m2498a(String str, String str2) {
        Log.i(m2556f(str), str2);
    }

    /* renamed from: a */
    public static void m2499a(String str, String str2, Object obj) {
        Log.d(m2556f(str), String.format(str2, new Object[]{obj}));
    }

    /* renamed from: a */
    public static void m2500a(String str, String str2, Throwable th) {
        Log.e(m2556f(str), str2, th);
    }

    /* renamed from: a */
    public static void m2501a(String str, String str2, Object... objArr) {
        Log.d(m2556f(str), String.format(str2, objArr));
    }

    /* renamed from: a */
    public static void m2503a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0167, code lost:
        if (r12.f3733f0 == 2) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x016b, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01ef, code lost:
        r13 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x044e, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e7, code lost:
        if (r4[r10].f3672d.f3670b == r15) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x014b, code lost:
        if (r12.f3731e0 == 2) goto L_0x0169;
     */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2505a(p124p.p144f.p145a.p146h.C1280e r27, p124p.p144f.p145a.C1267e r28, int r29) {
        /*
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = 2
            if (r2 != 0) goto L_0x000f
            int r5 = r0.f3775s0
            p.f.a.h.b[] r6 = r0.f3778v0
            r7 = 0
            goto L_0x0014
        L_0x000f:
            int r5 = r0.f3776t0
            p.f.a.h.b[] r6 = r0.f3777u0
            r7 = r3
        L_0x0014:
            r8 = 0
        L_0x0015:
            if (r8 >= r5) goto L_0x046b
            r9 = r6[r8]
            boolean r10 = r9.f3668q
            r11 = 0
            r12 = 8
            r14 = 1
            if (r10 != 0) goto L_0x0119
            int r10 = r9.f3663l
            int r10 = r10 * r3
            p.f.a.h.d r15 = r9.f3652a
            r4 = r15
            r16 = 0
        L_0x0029:
            if (r16 != 0) goto L_0x00f9
            int r13 = r9.f3660i
            int r13 = r13 + r14
            r9.f3660i = r13
            p.f.a.h.d[] r13 = r15.f3739i0
            int r14 = r9.f3663l
            r13[r14] = r11
            p.f.a.h.d[] r13 = r15.f3737h0
            r13[r14] = r11
            int r13 = r15.f3720Y
            if (r13 == r12) goto L_0x00c5
            p.f.a.h.d r13 = r9.f3653b
            if (r13 != 0) goto L_0x0044
            r9.f3653b = r15
        L_0x0044:
            r9.f3655d = r15
            p.f.a.h.d$a[] r13 = r15.f3698C
            int r14 = r9.f3663l
            r13 = r13[r14]
            p.f.a.h.d$a r11 = p124p.p144f.p145a.p146h.C1278d.C1279a.MATCH_CONSTRAINT
            if (r13 != r11) goto L_0x00c5
            int[] r11 = r15.f3734g
            r13 = r11[r14]
            r12 = 3
            if (r13 == 0) goto L_0x005f
            r13 = r11[r14]
            if (r13 == r12) goto L_0x005f
            r11 = r11[r14]
            if (r11 != r3) goto L_0x00c5
        L_0x005f:
            int r11 = r9.f3661j
            r13 = 1
            int r11 = r11 + r13
            r9.f3661j = r11
            float[] r11 = r15.f3735g0
            int r13 = r9.f3663l
            r14 = r11[r13]
            r17 = 0
            int r19 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r19 <= 0) goto L_0x0078
            float r3 = r9.f3662k
            r11 = r11[r13]
            float r3 = r3 + r11
            r9.f3662k = r3
        L_0x0078:
            int r3 = r9.f3663l
            int r11 = r15.f3720Y
            r13 = 8
            if (r11 == r13) goto L_0x0094
            p.f.a.h.d$a[] r11 = r15.f3698C
            r11 = r11[r3]
            p.f.a.h.d$a r13 = p124p.p144f.p145a.p146h.C1278d.C1279a.MATCH_CONSTRAINT
            if (r11 != r13) goto L_0x0094
            int[] r11 = r15.f3734g
            r13 = r11[r3]
            if (r13 == 0) goto L_0x0092
            r3 = r11[r3]
            if (r3 != r12) goto L_0x0094
        L_0x0092:
            r3 = 1
            goto L_0x0095
        L_0x0094:
            r3 = 0
        L_0x0095:
            if (r3 == 0) goto L_0x00b3
            r3 = 0
            int r11 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r11 >= 0) goto L_0x00a0
            r3 = 1
            r9.f3665n = r3
            goto L_0x00a3
        L_0x00a0:
            r3 = 1
            r9.f3666o = r3
        L_0x00a3:
            java.util.ArrayList<p.f.a.h.d> r3 = r9.f3659h
            if (r3 != 0) goto L_0x00ae
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r9.f3659h = r3
        L_0x00ae:
            java.util.ArrayList<p.f.a.h.d> r3 = r9.f3659h
            r3.add(r15)
        L_0x00b3:
            p.f.a.h.d r3 = r9.f3657f
            if (r3 != 0) goto L_0x00b9
            r9.f3657f = r15
        L_0x00b9:
            p.f.a.h.d r3 = r9.f3658g
            if (r3 == 0) goto L_0x00c3
            p.f.a.h.d[] r3 = r3.f3737h0
            int r11 = r9.f3663l
            r3[r11] = r15
        L_0x00c3:
            r9.f3658g = r15
        L_0x00c5:
            if (r4 == r15) goto L_0x00cd
            p.f.a.h.d[] r3 = r4.f3739i0
            int r4 = r9.f3663l
            r3[r4] = r15
        L_0x00cd:
            p.f.a.h.c[] r3 = r15.f3696A
            int r4 = r10 + 1
            r3 = r3[r4]
            p.f.a.h.c r3 = r3.f3672d
            if (r3 == 0) goto L_0x00e9
            p.f.a.h.d r3 = r3.f3670b
            p.f.a.h.c[] r4 = r3.f3696A
            r11 = r4[r10]
            p.f.a.h.c r11 = r11.f3672d
            if (r11 == 0) goto L_0x00e9
            r4 = r4[r10]
            p.f.a.h.c r4 = r4.f3672d
            p.f.a.h.d r4 = r4.f3670b
            if (r4 == r15) goto L_0x00ea
        L_0x00e9:
            r3 = 0
        L_0x00ea:
            if (r3 == 0) goto L_0x00ed
            goto L_0x00f0
        L_0x00ed:
            r3 = r15
            r16 = 1
        L_0x00f0:
            r4 = r15
            r11 = 0
            r12 = 8
            r14 = 1
            r15 = r3
            r3 = 2
            goto L_0x0029
        L_0x00f9:
            r9.f3654c = r15
            int r3 = r9.f3663l
            if (r3 != 0) goto L_0x0106
            boolean r3 = r9.f3664m
            if (r3 == 0) goto L_0x0106
            r9.f3656e = r15
            goto L_0x010a
        L_0x0106:
            p.f.a.h.d r3 = r9.f3652a
            r9.f3656e = r3
        L_0x010a:
            boolean r3 = r9.f3666o
            if (r3 == 0) goto L_0x0114
            boolean r3 = r9.f3665n
            if (r3 == 0) goto L_0x0114
            r3 = 1
            goto L_0x0115
        L_0x0114:
            r3 = 0
        L_0x0115:
            r9.f3667p = r3
            r3 = 1
            goto L_0x011a
        L_0x0119:
            r3 = r14
        L_0x011a:
            r9.f3668q = r3
            r3 = 4
            boolean r3 = r0.mo5713g(r3)
            if (r3 == 0) goto L_0x0456
            p.f.a.h.d r3 = r9.f3652a
            p.f.a.h.d r4 = r9.f3654c
            p.f.a.h.d r10 = r9.f3653b
            p.f.a.h.d r11 = r9.f3655d
            p.f.a.h.d r12 = r9.f3656e
            float r13 = r9.f3662k
            p.f.a.h.d$a[] r14 = r0.f3698C
            r14 = r14[r2]
            p.f.a.h.d$a r14 = p124p.p144f.p145a.p146h.C1278d.C1279a.WRAP_CONTENT
            if (r2 != 0) goto L_0x014e
            int r14 = r12.f3731e0
            if (r14 != 0) goto L_0x013d
            r14 = 1
            goto L_0x013e
        L_0x013d:
            r14 = 0
        L_0x013e:
            int r15 = r12.f3731e0
            r16 = r5
            r5 = 1
            if (r15 != r5) goto L_0x0147
            r5 = 1
            goto L_0x0148
        L_0x0147:
            r5 = 0
        L_0x0148:
            int r12 = r12.f3731e0
            r15 = 2
            if (r12 != r15) goto L_0x016b
            goto L_0x0169
        L_0x014e:
            r16 = r5
            int r5 = r12.f3733f0
            if (r5 != 0) goto L_0x0156
            r5 = 1
            goto L_0x0157
        L_0x0156:
            r5 = 0
        L_0x0157:
            int r14 = r12.f3733f0
            r15 = 1
            if (r14 != r15) goto L_0x015e
            r14 = 1
            goto L_0x015f
        L_0x015e:
            r14 = 0
        L_0x015f:
            int r12 = r12.f3733f0
            r15 = 2
            r26 = r14
            r14 = r5
            r5 = r26
            if (r12 != r15) goto L_0x016b
        L_0x0169:
            r12 = 1
            goto L_0x016c
        L_0x016b:
            r12 = 0
        L_0x016c:
            r15 = r3
            r22 = r6
            r23 = r8
            r6 = 0
            r8 = 0
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x0179:
            if (r21 != 0) goto L_0x0237
            int r0 = r15.f3720Y
            r24 = r9
            r9 = 8
            if (r0 == r9) goto L_0x01c7
            int r6 = r6 + 1
            if (r2 != 0) goto L_0x018c
            int r0 = r15.mo5705j()
            goto L_0x0190
        L_0x018c:
            int r0 = r15.mo5696d()
        L_0x0190:
            float r0 = (float) r0
            float r19 = r19 + r0
            if (r15 == r10) goto L_0x01a0
            p.f.a.h.c[] r0 = r15.f3696A
            r0 = r0[r7]
            int r0 = r0.mo5674a()
            float r0 = (float) r0
            float r19 = r19 + r0
        L_0x01a0:
            if (r15 == r11) goto L_0x01af
            p.f.a.h.c[] r0 = r15.f3696A
            int r9 = r7 + 1
            r0 = r0[r9]
            int r0 = r0.mo5674a()
            float r0 = (float) r0
            float r19 = r19 + r0
        L_0x01af:
            p.f.a.h.c[] r0 = r15.f3696A
            r0 = r0[r7]
            int r0 = r0.mo5674a()
            float r0 = (float) r0
            float r20 = r20 + r0
            p.f.a.h.c[] r0 = r15.f3696A
            int r9 = r7 + 1
            r0 = r0[r9]
            int r0 = r0.mo5674a()
            float r0 = (float) r0
            float r20 = r20 + r0
        L_0x01c7:
            p.f.a.h.c[] r0 = r15.f3696A
            r0 = r0[r7]
            int r0 = r15.f3720Y
            r9 = 8
            if (r0 == r9) goto L_0x0203
            p.f.a.h.d$a[] r0 = r15.f3698C
            r0 = r0[r2]
            p.f.a.h.d$a r9 = p124p.p144f.p145a.p146h.C1278d.C1279a.MATCH_CONSTRAINT
            if (r0 != r9) goto L_0x0203
            int r8 = r8 + 1
            if (r2 != 0) goto L_0x01eb
            int r0 = r15.f3730e
            if (r0 == 0) goto L_0x01e2
        L_0x01e1:
            goto L_0x01ef
        L_0x01e2:
            int r0 = r15.f3736h
            if (r0 != 0) goto L_0x01ef
            int r0 = r15.f3738i
            if (r0 == 0) goto L_0x01fb
            goto L_0x01ef
        L_0x01eb:
            int r0 = r15.f3732f
            if (r0 == 0) goto L_0x01f2
        L_0x01ef:
            r13 = r1
            goto L_0x044e
        L_0x01f2:
            int r0 = r15.f3741k
            if (r0 != 0) goto L_0x01ef
            int r0 = r15.f3742l
            if (r0 == 0) goto L_0x01fb
            goto L_0x0202
        L_0x01fb:
            float r0 = r15.f3702G
            r9 = 0
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0203
        L_0x0202:
            goto L_0x01e1
        L_0x0203:
            p.f.a.h.c[] r0 = r15.f3696A
            int r9 = r7 + 1
            r0 = r0[r9]
            p.f.a.h.c r0 = r0.f3672d
            if (r0 == 0) goto L_0x0225
            p.f.a.h.d r0 = r0.f3670b
            p.f.a.h.c[] r9 = r0.f3696A
            r25 = r0
            r0 = r9[r7]
            p.f.a.h.c r0 = r0.f3672d
            if (r0 == 0) goto L_0x0225
            r0 = r9[r7]
            p.f.a.h.c r0 = r0.f3672d
            p.f.a.h.d r0 = r0.f3670b
            if (r0 == r15) goto L_0x0222
            goto L_0x0225
        L_0x0222:
            r0 = r25
            goto L_0x0226
        L_0x0225:
            r0 = 0
        L_0x0226:
            if (r0 == 0) goto L_0x022f
            r15 = r0
            r9 = r24
            r0 = r27
            goto L_0x0179
        L_0x022f:
            r21 = 1
            r0 = r27
            r9 = r24
            goto L_0x0179
        L_0x0237:
            r24 = r9
            p.f.a.h.c[] r0 = r3.f3696A
            r0 = r0[r7]
            p.f.a.h.j r0 = r0.f3669a
            p.f.a.h.c[] r9 = r4.f3696A
            int r18 = r7 + 1
            r9 = r9[r18]
            p.f.a.h.j r9 = r9.f3669a
            r21 = r3
            p.f.a.h.j r3 = r0.f3804d
            if (r3 == 0) goto L_0x01ef
            p.f.a.h.j r1 = r9.f3804d
            if (r1 != 0) goto L_0x0252
            goto L_0x0262
        L_0x0252:
            int r3 = r3.f3816b
            r25 = r13
            r13 = 1
            if (r3 != r13) goto L_0x0262
            int r1 = r1.f3816b
            if (r1 == r13) goto L_0x025e
            goto L_0x0262
        L_0x025e:
            if (r8 <= 0) goto L_0x0266
            if (r8 == r6) goto L_0x0266
        L_0x0262:
            r13 = r28
            goto L_0x044e
        L_0x0266:
            if (r12 != 0) goto L_0x026f
            if (r14 != 0) goto L_0x026f
            if (r5 == 0) goto L_0x026d
            goto L_0x026f
        L_0x026d:
            r1 = 0
            goto L_0x0288
        L_0x026f:
            if (r10 == 0) goto L_0x027b
            p.f.a.h.c[] r1 = r10.f3696A
            r1 = r1[r7]
            int r1 = r1.mo5674a()
            float r1 = (float) r1
            goto L_0x027c
        L_0x027b:
            r1 = 0
        L_0x027c:
            if (r11 == 0) goto L_0x0288
            p.f.a.h.c[] r3 = r11.f3696A
            r3 = r3[r18]
            int r3 = r3.mo5674a()
            float r3 = (float) r3
            float r1 = r1 + r3
        L_0x0288:
            p.f.a.h.j r3 = r0.f3804d
            float r3 = r3.f3807g
            p.f.a.h.j r9 = r9.f3804d
            float r9 = r9.f3807g
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x0296
            float r9 = r9 - r3
            goto L_0x0298
        L_0x0296:
            float r9 = r3 - r9
        L_0x0298:
            float r9 = r9 - r19
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 <= 0) goto L_0x0326
            if (r8 != r6) goto L_0x0326
            p.f.a.h.d r1 = r15.f3699D
            if (r1 == 0) goto L_0x02ad
            p.f.a.h.d$a[] r1 = r1.f3698C
            r1 = r1[r2]
            p.f.a.h.d$a r5 = p124p.p144f.p145a.p146h.C1278d.C1279a.WRAP_CONTENT
            if (r1 != r5) goto L_0x02ad
            goto L_0x0262
        L_0x02ad:
            float r9 = r9 + r19
            float r9 = r9 - r20
            r1 = r3
            r3 = r21
        L_0x02b4:
            if (r3 == 0) goto L_0x0321
            p.f.a.h.d[] r5 = r3.f3739i0
            r5 = r5[r2]
            if (r5 != 0) goto L_0x02c2
            if (r3 != r4) goto L_0x02bf
            goto L_0x02c2
        L_0x02bf:
            r13 = r28
            goto L_0x031f
        L_0x02c2:
            float r6 = (float) r8
            float r6 = r9 / r6
            r10 = 0
            int r12 = (r25 > r10 ? 1 : (r25 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x02d9
            float[] r6 = r3.f3735g0
            r10 = r6[r2]
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x02d4
            r6 = 0
            goto L_0x02d9
        L_0x02d4:
            r6 = r6[r2]
            float r6 = r6 * r9
            float r6 = r6 / r25
        L_0x02d9:
            int r10 = r3.f3720Y
            r12 = 8
            if (r10 != r12) goto L_0x02e0
            r6 = 0
        L_0x02e0:
            p.f.a.h.c[] r10 = r3.f3696A
            r10 = r10[r7]
            int r10 = r10.mo5674a()
            float r10 = (float) r10
            float r1 = r1 + r10
            p.f.a.h.c[] r10 = r3.f3696A
            r10 = r10[r7]
            p.f.a.h.j r10 = r10.f3669a
            p.f.a.h.j r12 = r0.f3806f
            r10.mo5726a(r12, r1)
            p.f.a.h.c[] r10 = r3.f3696A
            r10 = r10[r18]
            p.f.a.h.j r10 = r10.f3669a
            p.f.a.h.j r12 = r0.f3806f
            float r1 = r1 + r6
            r10.mo5726a(r12, r1)
            p.f.a.h.c[] r6 = r3.f3696A
            r6 = r6[r7]
            p.f.a.h.j r6 = r6.f3669a
            r13 = r28
            r6.mo5725a(r13)
            p.f.a.h.c[] r6 = r3.f3696A
            r6 = r6[r18]
            p.f.a.h.j r6 = r6.f3669a
            r6.mo5725a(r13)
            p.f.a.h.c[] r3 = r3.f3696A
            r3 = r3[r18]
            int r3 = r3.mo5674a()
            float r3 = (float) r3
            float r1 = r1 + r3
        L_0x031f:
            r3 = r5
            goto L_0x02b4
        L_0x0321:
            r13 = r28
            r14 = 1
            goto L_0x044f
        L_0x0326:
            r13 = r28
            r8 = 0
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0330
            r5 = 0
            r12 = 1
            r14 = 0
        L_0x0330:
            if (r12 == 0) goto L_0x0399
            float r9 = r9 - r1
            if (r2 != 0) goto L_0x033a
            r8 = r21
            float r11 = r8.f3717V
            goto L_0x0341
        L_0x033a:
            r8 = r21
            r1 = 1
            if (r2 != r1) goto L_0x0341
            float r11 = r8.f3718W
        L_0x0341:
            float r9 = r9 * r11
            float r9 = r9 + r3
            r3 = r8
        L_0x0344:
            if (r3 == 0) goto L_0x03a0
            p.f.a.h.d[] r1 = r3.f3739i0
            r1 = r1[r2]
            if (r1 != 0) goto L_0x034e
            if (r3 != r4) goto L_0x0397
        L_0x034e:
            if (r2 != 0) goto L_0x0355
            int r5 = r3.mo5705j()
            goto L_0x0359
        L_0x0355:
            int r5 = r3.mo5696d()
        L_0x0359:
            float r5 = (float) r5
            p.f.a.h.c[] r6 = r3.f3696A
            r6 = r6[r7]
            int r6 = r6.mo5674a()
            float r6 = (float) r6
            float r9 = r9 + r6
            p.f.a.h.c[] r6 = r3.f3696A
            r6 = r6[r7]
            p.f.a.h.j r6 = r6.f3669a
            p.f.a.h.j r8 = r0.f3806f
            r6.mo5726a(r8, r9)
            p.f.a.h.c[] r6 = r3.f3696A
            r6 = r6[r18]
            p.f.a.h.j r6 = r6.f3669a
            p.f.a.h.j r8 = r0.f3806f
            float r9 = r9 + r5
            r6.mo5726a(r8, r9)
            p.f.a.h.c[] r5 = r3.f3696A
            r5 = r5[r7]
            p.f.a.h.j r5 = r5.f3669a
            r5.mo5725a(r13)
            p.f.a.h.c[] r5 = r3.f3696A
            r5 = r5[r18]
            p.f.a.h.j r5 = r5.f3669a
            r5.mo5725a(r13)
            p.f.a.h.c[] r3 = r3.f3696A
            r3 = r3[r18]
            int r3 = r3.mo5674a()
            float r3 = (float) r3
            float r9 = r9 + r3
        L_0x0397:
            r3 = r1
            goto L_0x0344
        L_0x0399:
            r8 = r21
            if (r14 != 0) goto L_0x03a3
            if (r5 == 0) goto L_0x03a0
            goto L_0x03a3
        L_0x03a0:
            r5 = 1
            goto L_0x044c
        L_0x03a3:
            if (r14 == 0) goto L_0x03a6
            goto L_0x03a8
        L_0x03a6:
            if (r5 == 0) goto L_0x03a9
        L_0x03a8:
            float r9 = r9 - r1
        L_0x03a9:
            int r1 = r6 + 1
            float r1 = (float) r1
            float r1 = r9 / r1
            if (r5 == 0) goto L_0x03bb
            r11 = 1
            if (r6 <= r11) goto L_0x03b7
            int r1 = r6 + -1
            float r1 = (float) r1
            goto L_0x03b9
        L_0x03b7:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x03b9:
            float r1 = r9 / r1
        L_0x03bb:
            int r9 = r8.f3720Y
            r11 = 8
            if (r9 == r11) goto L_0x03c4
            float r9 = r3 + r1
            goto L_0x03c5
        L_0x03c4:
            r9 = r3
        L_0x03c5:
            if (r5 == 0) goto L_0x03d6
            r5 = 1
            if (r6 <= r5) goto L_0x03d7
            p.f.a.h.c[] r6 = r10.f3696A
            r6 = r6[r7]
            int r6 = r6.mo5674a()
            float r6 = (float) r6
            float r9 = r6 + r3
            goto L_0x03d7
        L_0x03d6:
            r5 = 1
        L_0x03d7:
            if (r14 == 0) goto L_0x03e5
            if (r10 == 0) goto L_0x03e5
            p.f.a.h.c[] r3 = r10.f3696A
            r3 = r3[r7]
            int r3 = r3.mo5674a()
            float r3 = (float) r3
            float r9 = r9 + r3
        L_0x03e5:
            r3 = r8
        L_0x03e6:
            if (r3 == 0) goto L_0x044c
            p.f.a.h.d[] r6 = r3.f3739i0
            r6 = r6[r2]
            if (r6 != 0) goto L_0x03f4
            if (r3 != r4) goto L_0x03f1
            goto L_0x03f4
        L_0x03f1:
            r8 = 8
            goto L_0x044a
        L_0x03f4:
            if (r2 != 0) goto L_0x03fb
            int r8 = r3.mo5705j()
            goto L_0x03ff
        L_0x03fb:
            int r8 = r3.mo5696d()
        L_0x03ff:
            float r8 = (float) r8
            if (r3 == r10) goto L_0x040c
            p.f.a.h.c[] r11 = r3.f3696A
            r11 = r11[r7]
            int r11 = r11.mo5674a()
            float r11 = (float) r11
            float r9 = r9 + r11
        L_0x040c:
            p.f.a.h.c[] r11 = r3.f3696A
            r11 = r11[r7]
            p.f.a.h.j r11 = r11.f3669a
            p.f.a.h.j r12 = r0.f3806f
            r11.mo5726a(r12, r9)
            p.f.a.h.c[] r11 = r3.f3696A
            r11 = r11[r18]
            p.f.a.h.j r11 = r11.f3669a
            p.f.a.h.j r12 = r0.f3806f
            float r14 = r9 + r8
            r11.mo5726a(r12, r14)
            p.f.a.h.c[] r11 = r3.f3696A
            r11 = r11[r7]
            p.f.a.h.j r11 = r11.f3669a
            r11.mo5725a(r13)
            p.f.a.h.c[] r11 = r3.f3696A
            r11 = r11[r18]
            p.f.a.h.j r11 = r11.f3669a
            r11.mo5725a(r13)
            p.f.a.h.c[] r3 = r3.f3696A
            r3 = r3[r18]
            int r3 = r3.mo5674a()
            float r3 = (float) r3
            float r8 = r8 + r3
            float r9 = r9 + r8
            if (r6 == 0) goto L_0x03f1
            int r3 = r6.f3720Y
            r8 = 8
            if (r3 == r8) goto L_0x044a
            float r9 = r9 + r1
        L_0x044a:
            r3 = r6
            goto L_0x03e6
        L_0x044c:
            r14 = r5
            goto L_0x044f
        L_0x044e:
            r14 = 0
        L_0x044f:
            r0 = r27
            if (r14 != 0) goto L_0x0461
            r1 = r24
            goto L_0x045e
        L_0x0456:
            r13 = r1
            r16 = r5
            r22 = r6
            r23 = r8
            r1 = r9
        L_0x045e:
            m2506a(r0, r13, r2, r7, r1)
        L_0x0461:
            int r8 = r23 + 1
            r1 = r13
            r5 = r16
            r6 = r22
            r3 = 2
            goto L_0x0015
        L_0x046b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p127k.C1061o.m2505a(p.f.a.h.e, p.f.a.e, int):void");
    }

    /* renamed from: a */
    public static void m2507a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m2508a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m2509a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: a */
    public static boolean m2510a(int i, Rect rect, Rect rect2) {
        boolean z = true;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                z = false;
            }
            return z;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m2512a(Rect rect, Rect rect2, int i) {
        boolean z = true;
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 <= i3 && rect.left < i3) || rect.left <= rect2.left) {
                z = false;
            }
            return z;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 <= i5 && rect.top < i5) || rect.top <= rect2.top) {
                z = false;
            }
            return z;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 >= i7 && rect.right > i7) || rect.right >= rect2.right) {
                z = false;
            }
            return z;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 >= i9 && rect.bottom > i9) || rect.bottom >= rect2.bottom) {
                z = false;
            }
            return z;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: a */
    public static boolean m2515a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: a */
    public static boolean m2517a(C1337c[] cVarArr, C1337c[] cVarArr2) {
        if (cVarArr == null || cVarArr2 == null || cVarArr.length != cVarArr2.length) {
            return false;
        }
        for (int i = 0; i < cVarArr.length; i++) {
            if (cVarArr[i].f4039a != cVarArr2[i].f4039a || cVarArr[i].f4040b.length != cVarArr2[i].f4040b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static float[] m2518a(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i < 0 || i > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = i2 - i;
            int min = Math.min(i3, length - i);
            float[] fArr2 = new float[i3];
            System.arraycopy(fArr, i, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static C1337c[] m2519a(C1337c[] cVarArr) {
        if (cVarArr == null) {
            return null;
        }
        C1337c[] cVarArr2 = new C1337c[cVarArr.length];
        for (int i = 0; i < cVarArr.length; i++) {
            cVarArr2[i] = new C1337c(cVarArr[i]);
        }
        return cVarArr2;
    }

    /* renamed from: b */
    public static int m2521b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m2515a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: b */
    public static int m2523b(C0099a0 a0Var, C1606t tVar, View view, View view2, C0120o oVar, boolean z) {
        if (oVar.mo1222d() == 0 || a0Var.mo1135a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return a0Var.mo1135a();
        }
        return (int) ((((float) (tVar.mo6355a(view2) - tVar.mo6362d(view))) / ((float) (Math.abs(oVar.mo1237i(view) - oVar.mo1237i(view2)) + 1))) * ((float) a0Var.mo1135a()));
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: b */
    public static <T> T m2524b(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: b */
    public static <T> T m2525b(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: b */
    public static String m2526b(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unknown status code: ");
                sb.append(i);
                return sb.toString();
        }
    }

    /* renamed from: b */
    public static String m2527b(Context context, ComponentName componentName) {
        PackageManager packageManager = context.getPackageManager();
        int i = VERSION.SDK_INT;
        int i2 = 640;
        int i3 = VERSION.SDK_INT;
        if (i3 >= 29) {
            i2 = 269222528;
        } else if (i3 >= 24) {
            i2 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i2);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("android.support.PARENT_ACTIVITY");
        if (string == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(string);
            string = sb.toString();
        }
        return string;
    }

    /* renamed from: b */
    public static String m2528b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: b */
    public static String m2529b(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static void m2530b(Parcel parcel, int i, int i2) {
        int k = m2563k(parcel, i);
        if (k != i2) {
            String hexString = Integer.toHexString(k);
            StringBuilder sb = new StringBuilder(C1965a.m4743a(hexString, 46));
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(k);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C2259b(sb.toString(), parcel);
        }
    }

    /* renamed from: b */
    public static <T extends Parcelable> void m2531b(Parcel parcel, int i, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                m2541c(parcel, i, 0);
            }
            return;
        }
        int m = m2565m(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m2491a(parcel, (T) parcelable, 0);
            }
        }
        m2566n(parcel, m);
    }

    /* renamed from: b */
    public static void m2532b(TextView textView, int i) {
        m2431a(i);
        FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: b */
    public static void m2533b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public static void m2534b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @TargetApi(20)
    /* renamed from: b */
    public static boolean m2535b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f2796j == null) {
            f2796j = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f2796j.booleanValue();
    }

    /* renamed from: b */
    public static byte[] m2536b(Parcel parcel, int i) {
        int k = m2563k(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (k == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + k);
        return createByteArray;
    }

    /* renamed from: b */
    public static <T> T[] m2537b(Parcel parcel, int i, Creator<T> creator) {
        int k = m2563k(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (k == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + k);
        return createTypedArray;
    }

    /* renamed from: c */
    public static int m2538c(int i, Rect rect, Rect rect2) {
        int height;
        int i2;
        int height2;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = (rect.width() / 2) + rect.left;
            i2 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - ((height2 / 2) + i2));
        }
        height = (rect.height() / 2) + rect.top;
        i2 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - ((height2 / 2) + i2));
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m2539c(Parcel parcel, int i, Creator<T> creator) {
        int k = m2563k(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (k == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + k);
        return createTypedArrayList;
    }

    /* renamed from: c */
    public static C1784a m2540c(int i) {
        if (i == 0) {
            return C1784a.EXPONENTIAL;
        }
        if (i == 1) {
            return C1784a.LINEAR;
        }
        throw new IllegalArgumentException(C1965a.m4762b("Could not convert ", i, " to BackoffPolicy"));
    }

    /* renamed from: c */
    public static void m2541c(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: c */
    public static void m2542c(TextView textView, int i) {
        m2431a(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: c */
    public static void m2543c(Object obj) {
        String str = "ResourcesFlusher";
        if (!f2790d) {
            try {
                f2789c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e(str, "Could not find ThemedResourceCache class", e);
            }
            f2790d = true;
        }
        Class<?> cls = f2789c;
        if (cls != null) {
            if (!f2792f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f2791e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e(str, "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f2792f = true;
            }
            Field field = f2791e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e(str, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }

    /* renamed from: c */
    public static void m2544c(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: c */
    public static boolean m2546c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: c */
    public static int[] m2547c(Parcel parcel, int i) {
        int k = m2563k(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (k == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + k);
        return createIntArray;
    }

    /* renamed from: d */
    public static String m2548d(Parcel parcel, int i) {
        int k = m2563k(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (k == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + k);
        return readString;
    }

    /* renamed from: d */
    public static C1802m m2549d(int i) {
        if (i == 0) {
            return C1802m.NOT_REQUIRED;
        }
        if (i == 1) {
            return C1802m.CONNECTED;
        }
        if (i == 2) {
            return C1802m.UNMETERED;
        }
        if (i == 3) {
            return C1802m.NOT_ROAMING;
        }
        if (i == 4) {
            return C1802m.METERED;
        }
        throw new IllegalArgumentException(C1965a.m4762b("Could not convert ", i, " to NetworkType"));
    }

    /* renamed from: d */
    public static C2254m m2550d(Object obj) {
        return new C2254m(obj, null);
    }

    /* renamed from: d */
    public static void m2551d(Parcel parcel, int i, int i2) {
        if (i != i2) {
            String hexString = Integer.toHexString(i);
            StringBuilder sb = new StringBuilder(C1965a.m4743a(hexString, 46));
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(i);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C2259b(sb.toString(), parcel);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        if (r13 == 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008c, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0097 A[Catch:{ NumberFormatException -> 0x00bc }, LOOP:3: B:26:0x006c->B:46:0x0097, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0096 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p124p.p150h.p154f.C1337c[] m2552d(java.lang.String r17) {
        /*
            r0 = r17
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 1
            r4 = r3
            r3 = r2
        L_0x000f:
            int r5 = r17.length()
            if (r4 >= r5) goto L_0x00e3
        L_0x0015:
            int r5 = r17.length()
            r6 = 69
            r7 = 101(0x65, float:1.42E-43)
            if (r4 >= r5) goto L_0x0039
            char r5 = r0.charAt(r4)
            int r8 = r5 + -65
            int r9 = r5 + -90
            int r9 = r9 * r8
            if (r9 <= 0) goto L_0x0031
            int r8 = r5 + -97
            int r9 = r5 + -122
            int r9 = r9 * r8
            if (r9 > 0) goto L_0x0036
        L_0x0031:
            if (r5 == r7) goto L_0x0036
            if (r5 == r6) goto L_0x0036
            goto L_0x0039
        L_0x0036:
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0039:
            java.lang.String r2 = r0.substring(r2, r4)
            java.lang.String r2 = r2.trim()
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x00d9
            char r5 = r2.charAt(r3)
            r8 = 122(0x7a, float:1.71E-43)
            if (r5 == r8) goto L_0x00cb
            char r5 = r2.charAt(r3)
            r8 = 90
            if (r5 != r8) goto L_0x0059
            goto L_0x00cb
        L_0x0059:
            int r5 = r2.length()     // Catch:{ NumberFormatException -> 0x00bc }
            float[] r5 = new float[r5]     // Catch:{ NumberFormatException -> 0x00bc }
            int r8 = r2.length()     // Catch:{ NumberFormatException -> 0x00bc }
            r9 = 1
            r10 = r9
            r9 = r3
        L_0x0066:
            if (r10 >= r8) goto L_0x00b1
            r11 = r3
            r12 = r11
            r13 = r12
            r14 = r10
        L_0x006c:
            int r15 = r2.length()     // Catch:{ NumberFormatException -> 0x00bc }
            if (r14 >= r15) goto L_0x009a
            char r15 = r2.charAt(r14)     // Catch:{ NumberFormatException -> 0x00bc }
            r7 = 32
            if (r15 == r7) goto L_0x0090
            r7 = 101(0x65, float:1.42E-43)
            if (r15 == r6) goto L_0x008e
            if (r15 == r7) goto L_0x008e
            switch(r15) {
                case 44: goto L_0x0092;
                case 45: goto L_0x0088;
                case 46: goto L_0x0084;
                default: goto L_0x0083;
            }     // Catch:{ NumberFormatException -> 0x00bc }
        L_0x0083:
            goto L_0x0093
        L_0x0084:
            if (r12 != 0) goto L_0x008c
            r12 = 1
            goto L_0x0093
        L_0x0088:
            if (r14 == r10) goto L_0x0093
            if (r13 != 0) goto L_0x0093
        L_0x008c:
            r11 = 1
            goto L_0x0092
        L_0x008e:
            r13 = 1
            goto L_0x0094
        L_0x0090:
            r7 = 101(0x65, float:1.42E-43)
        L_0x0092:
            r3 = 1
        L_0x0093:
            r13 = 0
        L_0x0094:
            if (r3 == 0) goto L_0x0097
            goto L_0x009a
        L_0x0097:
            int r14 = r14 + 1
            goto L_0x006c
        L_0x009a:
            if (r10 >= r14) goto L_0x00a9
            int r3 = r9 + 1
            java.lang.String r10 = r2.substring(r10, r14)     // Catch:{ NumberFormatException -> 0x00bc }
            float r10 = java.lang.Float.parseFloat(r10)     // Catch:{ NumberFormatException -> 0x00bc }
            r5[r9] = r10     // Catch:{ NumberFormatException -> 0x00bc }
            r9 = r3
        L_0x00a9:
            if (r11 == 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            int r14 = r14 + 1
        L_0x00ae:
            r10 = r14
            r3 = 0
            goto L_0x0066
        L_0x00b1:
            float[] r3 = m2518a(r5, r3, r9)     // Catch:{ NumberFormatException -> 0x00bc }
            r5 = 0
            r16 = r5
            r5 = r3
            r3 = r16
            goto L_0x00cd
        L_0x00bc:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r3 = "error in parsing \""
            java.lang.String r4 = "\""
            java.lang.String r2 = p213q.p214a.p215a.p216a.C1965a.m4752a(r3, r2, r4)
            r1.<init>(r2, r0)
            throw r1
        L_0x00cb:
            float[] r5 = new float[r3]
        L_0x00cd:
            char r2 = r2.charAt(r3)
            p.h.f.c r3 = new p.h.f.c
            r3.<init>(r2, r5)
            r1.add(r3)
        L_0x00d9:
            int r2 = r4 + 1
            r3 = 0
            r16 = r4
            r4 = r2
            r2 = r16
            goto L_0x000f
        L_0x00e3:
            int r4 = r4 - r2
            r3 = 1
            if (r4 != r3) goto L_0x00fc
            int r3 = r17.length()
            if (r2 >= r3) goto L_0x00fc
            char r0 = r0.charAt(r2)
            r2 = 0
            float[] r2 = new float[r2]
            p.h.f.c r3 = new p.h.f.c
            r3.<init>(r0, r2)
            r1.add(r3)
        L_0x00fc:
            int r0 = r1.size()
            p.h.f.c[] r0 = new p124p.p150h.p154f.C1337c[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            p.h.f.c[] r0 = (p124p.p150h.p154f.C1337c[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p127k.C1061o.m2552d(java.lang.String):p.h.f.c[]");
    }

    /* renamed from: e */
    public static Path m2553e(String str) {
        Path path = new Path();
        C1337c[] d = m2552d(str);
        if (d == null) {
            return null;
        }
        try {
            C1337c.m3392a(d, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException(C1965a.m4751a("Error in parsing ", str), e);
        }
    }

    /* renamed from: e */
    public static ArrayList<String> m2554e(Parcel parcel, int i) {
        int k = m2563k(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (k == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + k);
        return createStringArrayList;
    }

    /* renamed from: e */
    public static C1816t m2555e(int i) {
        if (i == 0) {
            return C1816t.ENQUEUED;
        }
        if (i == 1) {
            return C1816t.RUNNING;
        }
        if (i == 2) {
            return C1816t.SUCCEEDED;
        }
        if (i == 3) {
            return C1816t.FAILED;
        }
        if (i == 4) {
            return C1816t.BLOCKED;
        }
        if (i == 5) {
            return C1816t.CANCELLED;
        }
        throw new IllegalArgumentException(C1965a.m4762b("Could not convert ", i, " to State"));
    }

    /* renamed from: f */
    public static String m2556f(String str) {
        return C1965a.m4751a("TransportRuntime.", str);
    }

    /* renamed from: f */
    public static void m2557f(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new C2259b(sb.toString(), parcel);
        }
    }

    /* renamed from: f */
    public static boolean m2558f(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: g */
    public static boolean m2559g(Parcel parcel, int i) {
        m2530b(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: h */
    public static IBinder m2560h(Parcel parcel, int i) {
        int k = m2563k(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (k == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + k);
        return readStrongBinder;
    }

    /* renamed from: i */
    public static int m2561i(Parcel parcel, int i) {
        m2530b(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: j */
    public static long m2562j(Parcel parcel, int i) {
        m2530b(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: k */
    public static int m2563k(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    /* renamed from: l */
    public static void m2564l(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m2563k(parcel, i));
    }

    /* renamed from: m */
    public static int m2565m(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: n */
    public static void m2566n(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = dataPosition - i;
        parcel.setDataPosition(i - 4);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: b */
    public static int m2520b(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i3 = rect.left;
            i2 = rect2.right;
        } else if (i == 33) {
            i3 = rect.top;
            i2 = rect2.bottom;
        } else if (i == 66) {
            i3 = rect2.left;
            i2 = rect.right;
        } else if (i == 130) {
            i3 = rect2.top;
            i2 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i3 - i2);
    }

    @TargetApi(26)
    /* renamed from: c */
    public static boolean m2545c(Context context) {
        if (m2535b(context)) {
            if (VERSION.SDK_INT >= 24) {
                if (f2797k == null) {
                    f2797k = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
                }
                if (!f2797k.booleanValue() || C2286e.m5333e()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m2522b(Parcel parcel) {
        int readInt = parcel.readInt();
        int k = m2563k(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((65535 & readInt) != 20293) {
            String str = "Expected object header. Got 0x";
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new C2259b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), parcel);
        }
        int i = k + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new C2259b(sb.toString(), parcel);
    }

    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r21v1 */
    /* JADX WARNING: type inference failed for: r4v9, types: [p.f.a.g] */
    /* JADX WARNING: type inference failed for: r21v2 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11, types: [p.f.a.g] */
    /* JADX WARNING: type inference failed for: r4v42 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r2.f3731e0 == 2) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
        if (r2.f3733f0 == 2) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
        r5 = false;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x047e  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0501  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0526  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0532  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x03e1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0169  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2506a(p124p.p144f.p145a.p146h.C1280e r33, p124p.p144f.p145a.C1267e r34, int r35, int r36, p124p.p144f.p145a.p146h.C1273b r37) {
        /*
            r0 = r33
            r9 = r34
            r1 = r37
            p.f.a.h.d r10 = r1.f3652a
            p.f.a.h.d r11 = r1.f3654c
            p.f.a.h.d r12 = r1.f3653b
            p.f.a.h.d r13 = r1.f3655d
            p.f.a.h.d r2 = r1.f3656e
            float r3 = r1.f3662k
            p.f.a.h.d$a[] r4 = r0.f3698C
            r4 = r4[r35]
            p.f.a.h.d$a r5 = p124p.p144f.p145a.p146h.C1278d.C1279a.WRAP_CONTENT
            r7 = 1
            if (r4 != r5) goto L_0x001d
            r4 = r7
            goto L_0x001e
        L_0x001d:
            r4 = 0
        L_0x001e:
            r5 = 2
            if (r35 != 0) goto L_0x0034
            int r8 = r2.f3731e0
            if (r8 != 0) goto L_0x0027
            r8 = r7
            goto L_0x0028
        L_0x0027:
            r8 = 0
        L_0x0028:
            int r14 = r2.f3731e0
            if (r14 != r7) goto L_0x002e
            r14 = r7
            goto L_0x002f
        L_0x002e:
            r14 = 0
        L_0x002f:
            int r15 = r2.f3731e0
            if (r15 != r5) goto L_0x0048
            goto L_0x0046
        L_0x0034:
            int r8 = r2.f3733f0
            if (r8 != 0) goto L_0x003a
            r8 = r7
            goto L_0x003b
        L_0x003a:
            r8 = 0
        L_0x003b:
            int r14 = r2.f3733f0
            if (r14 != r7) goto L_0x0041
            r14 = r7
            goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            int r15 = r2.f3733f0
            if (r15 != r5) goto L_0x0048
        L_0x0046:
            r5 = r7
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            r7 = r10
            r15 = r14
            r14 = r8
            r8 = 0
        L_0x004d:
            r21 = 0
            if (r8 != 0) goto L_0x0120
            p.f.a.h.c[] r6 = r7.f3696A
            r6 = r6[r36]
            if (r4 != 0) goto L_0x005d
            if (r5 == 0) goto L_0x005a
            goto L_0x005d
        L_0x005a:
            r23 = 4
            goto L_0x005f
        L_0x005d:
            r23 = 1
        L_0x005f:
            int r24 = r6.mo5674a()
            r25 = r3
            p.f.a.h.c r3 = r6.f3672d
            if (r3 == 0) goto L_0x0071
            if (r7 == r10) goto L_0x0071
            int r3 = r3.mo5674a()
            int r24 = r3 + r24
        L_0x0071:
            r3 = r24
            if (r5 == 0) goto L_0x007f
            if (r7 == r10) goto L_0x007f
            if (r7 == r12) goto L_0x007f
            r24 = r8
            r23 = r15
            r8 = 6
            goto L_0x008f
        L_0x007f:
            if (r14 == 0) goto L_0x0089
            if (r4 == 0) goto L_0x0089
            r24 = r8
            r23 = r15
            r8 = 4
            goto L_0x008f
        L_0x0089:
            r24 = r8
            r8 = r23
            r23 = r15
        L_0x008f:
            p.f.a.h.c r15 = r6.f3672d
            if (r15 == 0) goto L_0x00b8
            if (r7 != r12) goto L_0x00a2
            r26 = r14
            p.f.a.g r14 = r6.f3677i
            p.f.a.g r15 = r15.f3677i
            r27 = r2
            r2 = 5
            r9.mo5655b(r14, r15, r3, r2)
            goto L_0x00ae
        L_0x00a2:
            r27 = r2
            r26 = r14
            p.f.a.g r2 = r6.f3677i
            p.f.a.g r14 = r15.f3677i
            r15 = 6
            r9.mo5655b(r2, r14, r3, r15)
        L_0x00ae:
            p.f.a.g r2 = r6.f3677i
            p.f.a.h.c r6 = r6.f3672d
            p.f.a.g r6 = r6.f3677i
            r9.mo5641a(r2, r6, r3, r8)
            goto L_0x00bc
        L_0x00b8:
            r27 = r2
            r26 = r14
        L_0x00bc:
            if (r4 == 0) goto L_0x00ef
            int r2 = r7.f3720Y
            r3 = 8
            if (r2 == r3) goto L_0x00de
            p.f.a.h.d$a[] r2 = r7.f3698C
            r2 = r2[r35]
            p.f.a.h.d$a r3 = p124p.p144f.p145a.p146h.C1278d.C1279a.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x00de
            p.f.a.h.c[] r2 = r7.f3696A
            int r3 = r36 + 1
            r3 = r2[r3]
            p.f.a.g r3 = r3.f3677i
            r2 = r2[r36]
            p.f.a.g r2 = r2.f3677i
            r6 = 5
            r8 = 0
            r9.mo5655b(r3, r2, r8, r6)
            goto L_0x00df
        L_0x00de:
            r8 = 0
        L_0x00df:
            p.f.a.h.c[] r2 = r7.f3696A
            r2 = r2[r36]
            p.f.a.g r2 = r2.f3677i
            p.f.a.h.c[] r3 = r0.f3696A
            r3 = r3[r36]
            p.f.a.g r3 = r3.f3677i
            r6 = 6
            r9.mo5655b(r2, r3, r8, r6)
        L_0x00ef:
            p.f.a.h.c[] r2 = r7.f3696A
            int r3 = r36 + 1
            r2 = r2[r3]
            p.f.a.h.c r2 = r2.f3672d
            if (r2 == 0) goto L_0x010e
            p.f.a.h.d r2 = r2.f3670b
            p.f.a.h.c[] r3 = r2.f3696A
            r6 = r3[r36]
            p.f.a.h.c r6 = r6.f3672d
            if (r6 == 0) goto L_0x010e
            r3 = r3[r36]
            p.f.a.h.c r3 = r3.f3672d
            p.f.a.h.d r3 = r3.f3670b
            if (r3 == r7) goto L_0x010c
            goto L_0x010e
        L_0x010c:
            r21 = r2
        L_0x010e:
            if (r21 == 0) goto L_0x0115
            r7 = r21
            r8 = r24
            goto L_0x0116
        L_0x0115:
            r8 = 1
        L_0x0116:
            r15 = r23
            r3 = r25
            r14 = r26
            r2 = r27
            goto L_0x004d
        L_0x0120:
            r27 = r2
            r25 = r3
            r26 = r14
            r23 = r15
            if (r13 == 0) goto L_0x014a
            p.f.a.h.c[] r2 = r11.f3696A
            int r3 = r36 + 1
            r6 = r2[r3]
            p.f.a.h.c r6 = r6.f3672d
            if (r6 == 0) goto L_0x014a
            p.f.a.h.c[] r6 = r13.f3696A
            r6 = r6[r3]
            p.f.a.g r7 = r6.f3677i
            r2 = r2[r3]
            p.f.a.h.c r2 = r2.f3672d
            p.f.a.g r2 = r2.f3677i
            int r3 = r6.mo5674a()
            int r3 = -r3
            r6 = 5
            r9.mo5658c(r7, r2, r3, r6)
            goto L_0x014b
        L_0x014a:
            r6 = 5
        L_0x014b:
            if (r4 == 0) goto L_0x0165
            p.f.a.h.c[] r0 = r0.f3696A
            int r2 = r36 + 1
            r0 = r0[r2]
            p.f.a.g r0 = r0.f3677i
            p.f.a.h.c[] r3 = r11.f3696A
            r4 = r3[r2]
            p.f.a.g r4 = r4.f3677i
            r2 = r3[r2]
            int r2 = r2.mo5674a()
            r3 = 6
            r9.mo5655b(r0, r4, r2, r3)
        L_0x0165:
            java.util.ArrayList<p.f.a.h.d> r0 = r1.f3659h
            if (r0 == 0) goto L_0x028d
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x028d
            boolean r4 = r1.f3665n
            if (r4 == 0) goto L_0x017c
            boolean r4 = r1.f3667p
            if (r4 != 0) goto L_0x017c
            int r4 = r1.f3661j
            float r4 = (float) r4
            goto L_0x017e
        L_0x017c:
            r4 = r25
        L_0x017e:
            r7 = 0
            r15 = r7
            r14 = r21
            r8 = 0
        L_0x0183:
            if (r8 >= r2) goto L_0x028d
            java.lang.Object r16 = r0.get(r8)
            r3 = r16
            p.f.a.h.d r3 = (p124p.p144f.p145a.p146h.C1278d) r3
            float[] r6 = r3.f3735g0
            r6 = r6[r35]
            int r24 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r24 >= 0) goto L_0x01b9
            boolean r6 = r1.f3667p
            if (r6 == 0) goto L_0x01b1
            p.f.a.h.c[] r3 = r3.f3696A
            int r6 = r36 + 1
            r6 = r3[r6]
            p.f.a.g r6 = r6.f3677i
            r3 = r3[r36]
            p.f.a.g r3 = r3.f3677i
            r20 = r0
            r0 = 0
            r7 = 4
            r9.mo5641a(r6, r3, r0, r7)
            r24 = r7
            r6 = 6
            r7 = r0
            goto L_0x01d3
        L_0x01b1:
            r20 = r0
            r24 = 4
            r0 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01be
        L_0x01b9:
            r20 = r0
            r24 = 4
            r0 = 0
        L_0x01be:
            int r25 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r25 != 0) goto L_0x01dd
            p.f.a.h.c[] r0 = r3.f3696A
            int r3 = r36 + 1
            r3 = r0[r3]
            p.f.a.g r3 = r3.f3677i
            r0 = r0[r36]
            p.f.a.g r0 = r0.f3677i
            r6 = 6
            r7 = 0
            r9.mo5641a(r3, r0, r7, r6)
        L_0x01d3:
            r29 = r2
            r33 = r4
            r17 = r6
            r30 = 0
            goto L_0x027d
        L_0x01dd:
            r0 = 0
            r17 = 6
            if (r14 == 0) goto L_0x0272
            p.f.a.h.c[] r14 = r14.f3696A
            r0 = r14[r36]
            p.f.a.g r0 = r0.f3677i
            int r28 = r36 + 1
            r14 = r14[r28]
            p.f.a.g r14 = r14.f3677i
            p.f.a.h.c[] r7 = r3.f3696A
            r29 = r2
            r2 = r7[r36]
            p.f.a.g r2 = r2.f3677i
            r7 = r7[r28]
            p.f.a.g r7 = r7.f3677i
            r28 = r3
            p.f.a.b r3 = r34.mo5653b()
            r1 = 0
            r3.f3607b = r1
            int r30 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r30 == 0) goto L_0x0253
            int r30 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r30 != 0) goto L_0x020e
            goto L_0x0253
        L_0x020e:
            r30 = 0
            int r31 = (r15 > r30 ? 1 : (r15 == r30 ? 0 : -1))
            if (r31 != 0) goto L_0x0223
            p.f.a.a r2 = r3.f3609d
            r7 = 1065353216(0x3f800000, float:1.0)
            r2.mo5628a(r0, r7)
            p.f.a.a r0 = r3.f3609d
            r0.mo5628a(r14, r1)
        L_0x0220:
            r33 = r4
            goto L_0x026e
        L_0x0223:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r25 != 0) goto L_0x0234
            p.f.a.a r0 = r3.f3609d
            r0.mo5628a(r2, r1)
            p.f.a.a r0 = r3.f3609d
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.mo5628a(r7, r1)
            goto L_0x0220
        L_0x0234:
            float r15 = r15 / r4
            float r25 = r6 / r4
            float r15 = r15 / r25
            r33 = r4
            p.f.a.a r4 = r3.f3609d
            r4.mo5628a(r0, r1)
            p.f.a.a r0 = r3.f3609d
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.mo5628a(r14, r4)
            p.f.a.a r0 = r3.f3609d
            r0.mo5628a(r7, r15)
            p.f.a.a r0 = r3.f3609d
            float r1 = -r15
            r0.mo5628a(r2, r1)
            goto L_0x026e
        L_0x0253:
            r33 = r4
            r30 = 0
            r4 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            p.f.a.a r15 = r3.f3609d
            r15.mo5628a(r0, r1)
            p.f.a.a r0 = r3.f3609d
            r0.mo5628a(r14, r4)
            p.f.a.a r0 = r3.f3609d
            r0.mo5628a(r7, r1)
            p.f.a.a r0 = r3.f3609d
            r0.mo5628a(r2, r4)
        L_0x026e:
            r9.mo5646a(r3)
            goto L_0x027a
        L_0x0272:
            r29 = r2
            r28 = r3
            r33 = r4
            r30 = 0
        L_0x027a:
            r15 = r6
            r14 = r28
        L_0x027d:
            int r8 = r8 + 1
            r4 = r33
            r1 = r37
            r0 = r20
            r2 = r29
            r7 = r30
            r3 = 1
            r6 = 5
            goto L_0x0183
        L_0x028d:
            r17 = 6
            r24 = 4
            if (r12 == 0) goto L_0x02f1
            if (r12 == r13) goto L_0x0297
            if (r5 == 0) goto L_0x02f1
        L_0x0297:
            p.f.a.h.c[] r0 = r10.f3696A
            r1 = r0[r36]
            p.f.a.h.c[] r2 = r11.f3696A
            int r3 = r36 + 1
            r2 = r2[r3]
            r4 = r0[r36]
            p.f.a.h.c r4 = r4.f3672d
            if (r4 == 0) goto L_0x02af
            r0 = r0[r36]
            p.f.a.h.c r0 = r0.f3672d
            p.f.a.g r0 = r0.f3677i
            r4 = r0
            goto L_0x02b1
        L_0x02af:
            r4 = r21
        L_0x02b1:
            p.f.a.h.c[] r0 = r11.f3696A
            r5 = r0[r3]
            p.f.a.h.c r5 = r5.f3672d
            if (r5 == 0) goto L_0x02c1
            r0 = r0[r3]
            p.f.a.h.c r0 = r0.f3672d
            p.f.a.g r0 = r0.f3677i
            r5 = r0
            goto L_0x02c3
        L_0x02c1:
            r5 = r21
        L_0x02c3:
            if (r12 != r13) goto L_0x02cb
            p.f.a.h.c[] r0 = r12.f3696A
            r1 = r0[r36]
            r2 = r0[r3]
        L_0x02cb:
            if (r4 == 0) goto L_0x0512
            if (r5 == 0) goto L_0x0512
            r0 = r27
            if (r35 != 0) goto L_0x02d6
            float r0 = r0.f3717V
            goto L_0x02d8
        L_0x02d6:
            float r0 = r0.f3718W
        L_0x02d8:
            r6 = r0
            int r3 = r1.mo5674a()
            int r7 = r2.mo5674a()
            p.f.a.g r1 = r1.f3677i
            p.f.a.g r8 = r2.f3677i
            r10 = 5
            r0 = r34
            r2 = r4
            r4 = r6
            r6 = r8
            r8 = r10
            r0.mo5649a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0512
        L_0x02f1:
            if (r26 == 0) goto L_0x03e9
            if (r12 == 0) goto L_0x03e9
            r0 = r37
            int r1 = r0.f3661j
            if (r1 <= 0) goto L_0x0302
            int r0 = r0.f3660i
            if (r0 != r1) goto L_0x0302
            r19 = 1
            goto L_0x0304
        L_0x0302:
            r19 = 0
        L_0x0304:
            r14 = r12
            r15 = r14
        L_0x0306:
            if (r14 == 0) goto L_0x0512
            p.f.a.h.d[] r0 = r14.f3739i0
            r0 = r0[r35]
            r8 = r0
        L_0x030d:
            if (r8 == 0) goto L_0x031a
            int r0 = r8.f3720Y
            r6 = 8
            if (r0 != r6) goto L_0x031c
            p.f.a.h.d[] r0 = r8.f3739i0
            r8 = r0[r35]
            goto L_0x030d
        L_0x031a:
            r6 = 8
        L_0x031c:
            if (r8 != 0) goto L_0x0329
            if (r14 != r13) goto L_0x0321
            goto L_0x0329
        L_0x0321:
            r16 = r8
            r18 = r17
            r17 = r24
            goto L_0x03da
        L_0x0329:
            p.f.a.h.c[] r0 = r14.f3696A
            r0 = r0[r36]
            p.f.a.g r1 = r0.f3677i
            p.f.a.h.c r2 = r0.f3672d
            if (r2 == 0) goto L_0x0336
            p.f.a.g r2 = r2.f3677i
            goto L_0x0338
        L_0x0336:
            r2 = r21
        L_0x0338:
            if (r15 == r14) goto L_0x0343
            p.f.a.h.c[] r2 = r15.f3696A
            int r3 = r36 + 1
            r2 = r2[r3]
        L_0x0340:
            p.f.a.g r2 = r2.f3677i
            goto L_0x0356
        L_0x0343:
            if (r14 != r12) goto L_0x0356
            if (r15 != r14) goto L_0x0356
            p.f.a.h.c[] r2 = r10.f3696A
            r3 = r2[r36]
            p.f.a.h.c r3 = r3.f3672d
            if (r3 == 0) goto L_0x0354
            r2 = r2[r36]
            p.f.a.h.c r2 = r2.f3672d
            goto L_0x0340
        L_0x0354:
            r2 = r21
        L_0x0356:
            int r0 = r0.mo5674a()
            p.f.a.h.c[] r3 = r14.f3696A
            int r4 = r36 + 1
            r3 = r3[r4]
            int r3 = r3.mo5674a()
            if (r8 == 0) goto L_0x0378
            p.f.a.h.c[] r5 = r8.f3696A
            r5 = r5[r36]
            p.f.a.g r7 = r5.f3677i
            p.f.a.h.c[] r6 = r14.f3696A
            r6 = r6[r4]
            p.f.a.g r6 = r6.f3677i
            r32 = r7
            r7 = r6
            r6 = r32
            goto L_0x038b
        L_0x0378:
            p.f.a.h.c[] r5 = r11.f3696A
            r5 = r5[r4]
            p.f.a.h.c r5 = r5.f3672d
            if (r5 == 0) goto L_0x0383
            p.f.a.g r6 = r5.f3677i
            goto L_0x0385
        L_0x0383:
            r6 = r21
        L_0x0385:
            p.f.a.h.c[] r7 = r14.f3696A
            r7 = r7[r4]
            p.f.a.g r7 = r7.f3677i
        L_0x038b:
            if (r5 == 0) goto L_0x0392
            int r5 = r5.mo5674a()
            int r3 = r3 + r5
        L_0x0392:
            if (r15 == 0) goto L_0x039d
            p.f.a.h.c[] r5 = r15.f3696A
            r5 = r5[r4]
            int r5 = r5.mo5674a()
            int r0 = r0 + r5
        L_0x039d:
            if (r1 == 0) goto L_0x0321
            if (r2 == 0) goto L_0x0321
            if (r6 == 0) goto L_0x0321
            if (r7 == 0) goto L_0x0321
            if (r14 != r12) goto L_0x03af
            p.f.a.h.c[] r0 = r12.f3696A
            r0 = r0[r36]
            int r0 = r0.mo5674a()
        L_0x03af:
            r5 = r0
            if (r14 != r13) goto L_0x03bd
            p.f.a.h.c[] r0 = r13.f3696A
            r0 = r0[r4]
            int r0 = r0.mo5674a()
            r16 = r0
            goto L_0x03bf
        L_0x03bd:
            r16 = r3
        L_0x03bf:
            if (r19 == 0) goto L_0x03c4
            r20 = r17
            goto L_0x03c6
        L_0x03c4:
            r20 = r24
        L_0x03c6:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r34
            r3 = r5
            r5 = r6
            r18 = r17
            r17 = r24
            r6 = r7
            r7 = r16
            r16 = r8
            r8 = r20
            r0.mo5649a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x03da:
            int r0 = r14.f3720Y
            r8 = 8
            if (r0 == r8) goto L_0x03e1
            r15 = r14
        L_0x03e1:
            r14 = r16
            r24 = r17
            r17 = r18
            goto L_0x0306
        L_0x03e9:
            r0 = r37
            r18 = r17
            r17 = r24
            r8 = 8
            if (r23 == 0) goto L_0x0512
            if (r12 == 0) goto L_0x0512
            int r1 = r0.f3661j
            if (r1 <= 0) goto L_0x0400
            int r0 = r0.f3660i
            if (r0 != r1) goto L_0x0400
            r19 = 1
            goto L_0x0402
        L_0x0400:
            r19 = 0
        L_0x0402:
            r14 = r12
            r15 = r14
        L_0x0404:
            if (r14 == 0) goto L_0x04b4
            p.f.a.h.d[] r0 = r14.f3739i0
            r0 = r0[r35]
        L_0x040a:
            if (r0 == 0) goto L_0x0415
            int r1 = r0.f3720Y
            if (r1 != r8) goto L_0x0415
            p.f.a.h.d[] r0 = r0.f3739i0
            r0 = r0[r35]
            goto L_0x040a
        L_0x0415:
            if (r14 == r12) goto L_0x04a5
            if (r14 == r13) goto L_0x04a5
            if (r0 == 0) goto L_0x04a5
            if (r0 != r13) goto L_0x0420
            r7 = r21
            goto L_0x0421
        L_0x0420:
            r7 = r0
        L_0x0421:
            p.f.a.h.c[] r0 = r14.f3696A
            r0 = r0[r36]
            p.f.a.g r1 = r0.f3677i
            p.f.a.h.c r2 = r0.f3672d
            if (r2 == 0) goto L_0x042d
            p.f.a.g r2 = r2.f3677i
        L_0x042d:
            p.f.a.h.c[] r2 = r15.f3696A
            int r3 = r36 + 1
            r2 = r2[r3]
            p.f.a.g r2 = r2.f3677i
            int r0 = r0.mo5674a()
            p.f.a.h.c[] r4 = r14.f3696A
            r4 = r4[r3]
            int r4 = r4.mo5674a()
            if (r7 == 0) goto L_0x0451
            p.f.a.h.c[] r5 = r7.f3696A
            r5 = r5[r36]
            p.f.a.g r6 = r5.f3677i
            p.f.a.h.c r8 = r5.f3672d
            if (r8 == 0) goto L_0x044e
            goto L_0x0462
        L_0x044e:
            r8 = r21
            goto L_0x0464
        L_0x0451:
            p.f.a.h.c[] r5 = r14.f3696A
            r5 = r5[r3]
            p.f.a.h.c r5 = r5.f3672d
            if (r5 == 0) goto L_0x045c
            p.f.a.g r6 = r5.f3677i
            goto L_0x045e
        L_0x045c:
            r6 = r21
        L_0x045e:
            p.f.a.h.c[] r8 = r14.f3696A
            r8 = r8[r3]
        L_0x0462:
            p.f.a.g r8 = r8.f3677i
        L_0x0464:
            if (r5 == 0) goto L_0x046e
            int r5 = r5.mo5674a()
            int r5 = r5 + r4
            r20 = r5
            goto L_0x0470
        L_0x046e:
            r20 = r4
        L_0x0470:
            p.f.a.h.c[] r4 = r15.f3696A
            r3 = r4[r3]
            int r3 = r3.mo5674a()
            int r3 = r3 + r0
            if (r19 == 0) goto L_0x047e
            r22 = r18
            goto L_0x0480
        L_0x047e:
            r22 = r17
        L_0x0480:
            if (r1 == 0) goto L_0x049c
            if (r2 == 0) goto L_0x049c
            if (r6 == 0) goto L_0x049c
            if (r8 == 0) goto L_0x049c
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r34
            r5 = r6
            r6 = r8
            r16 = r7
            r7 = r20
            r20 = r15
            r15 = 8
            r8 = r22
            r0.mo5649a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04a2
        L_0x049c:
            r16 = r7
            r20 = r15
            r15 = 8
        L_0x04a2:
            r0 = r16
            goto L_0x04a8
        L_0x04a5:
            r20 = r15
            r15 = r8
        L_0x04a8:
            int r1 = r14.f3720Y
            if (r1 == r15) goto L_0x04ad
            goto L_0x04af
        L_0x04ad:
            r14 = r20
        L_0x04af:
            r8 = r15
            r15 = r14
            r14 = r0
            goto L_0x0404
        L_0x04b4:
            p.f.a.h.c[] r0 = r12.f3696A
            r0 = r0[r36]
            p.f.a.h.c[] r1 = r10.f3696A
            r1 = r1[r36]
            p.f.a.h.c r1 = r1.f3672d
            p.f.a.h.c[] r2 = r13.f3696A
            int r3 = r36 + 1
            r10 = r2[r3]
            p.f.a.h.c[] r2 = r11.f3696A
            r2 = r2[r3]
            p.f.a.h.c r14 = r2.f3672d
            if (r1 == 0) goto L_0x0501
            if (r12 == r13) goto L_0x04db
            p.f.a.g r2 = r0.f3677i
            p.f.a.g r1 = r1.f3677i
            int r0 = r0.mo5674a()
            r15 = 5
            r9.mo5641a(r2, r1, r0, r15)
            goto L_0x0502
        L_0x04db:
            r15 = 5
            if (r14 == 0) goto L_0x0502
            p.f.a.g r2 = r0.f3677i
            p.f.a.g r3 = r1.f3677i
            int r4 = r0.mo5674a()
            r5 = 1056964608(0x3f000000, float:0.5)
            p.f.a.g r6 = r10.f3677i
            p.f.a.g r7 = r14.f3677i
            int r8 = r10.mo5674a()
            r16 = 5
            r0 = r34
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r16
            r0.mo5649a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0502
        L_0x0501:
            r15 = 5
        L_0x0502:
            if (r14 == 0) goto L_0x0512
            if (r12 == r13) goto L_0x0512
            p.f.a.g r0 = r10.f3677i
            p.f.a.g r1 = r14.f3677i
            int r2 = r10.mo5674a()
            int r2 = -r2
            r9.mo5641a(r0, r1, r2, r15)
        L_0x0512:
            if (r26 != 0) goto L_0x0516
            if (r23 == 0) goto L_0x0574
        L_0x0516:
            if (r12 == 0) goto L_0x0574
            p.f.a.h.c[] r0 = r12.f3696A
            r0 = r0[r36]
            p.f.a.h.c[] r1 = r13.f3696A
            int r2 = r36 + 1
            r1 = r1[r2]
            p.f.a.h.c r3 = r0.f3672d
            if (r3 == 0) goto L_0x0529
            p.f.a.g r3 = r3.f3677i
            goto L_0x052b
        L_0x0529:
            r3 = r21
        L_0x052b:
            p.f.a.h.c r4 = r1.f3672d
            if (r4 == 0) goto L_0x0532
            p.f.a.g r4 = r4.f3677i
            goto L_0x0534
        L_0x0532:
            r4 = r21
        L_0x0534:
            if (r11 == r13) goto L_0x0545
            p.f.a.h.c[] r4 = r11.f3696A
            r4 = r4[r2]
            p.f.a.h.c r4 = r4.f3672d
            if (r4 == 0) goto L_0x0542
            p.f.a.g r4 = r4.f3677i
            r21 = r4
        L_0x0542:
            r5 = r21
            goto L_0x0546
        L_0x0545:
            r5 = r4
        L_0x0546:
            if (r12 != r13) goto L_0x0553
            p.f.a.h.c[] r0 = r12.f3696A
            r1 = r0[r36]
            r0 = r0[r2]
            r32 = r1
            r1 = r0
            r0 = r32
        L_0x0553:
            if (r3 == 0) goto L_0x0574
            if (r5 == 0) goto L_0x0574
            r4 = 1056964608(0x3f000000, float:0.5)
            int r6 = r0.mo5674a()
            p.f.a.h.c[] r7 = r13.f3696A
            r2 = r7[r2]
            int r7 = r2.mo5674a()
            p.f.a.g r2 = r0.f3677i
            p.f.a.g r8 = r1.f3677i
            r10 = 5
            r0 = r34
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.mo5649a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0574:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p127k.C1061o.m2506a(p.f.a.h.e, p.f.a.e, int, int, p.f.a.h.b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r10.right <= r12.left) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r10.top >= r12.bottom) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (r10.left >= r12.right) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L_0x0028;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m2511a(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = m2510a(r9, r10, r11)
            boolean r1 = m2510a(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L_0x007e
            if (r0 != 0) goto L_0x000f
            goto L_0x007e
        L_0x000f:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L_0x0040
            if (r9 == r3) goto L_0x0039
            if (r9 == r4) goto L_0x0032
            if (r9 != r1) goto L_0x002c
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L_0x002a
        L_0x0028:
            r7 = r6
            goto L_0x0047
        L_0x002a:
            r7 = r2
            goto L_0x0047
        L_0x002c:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x0032:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L_0x002a
            goto L_0x0028
        L_0x0039:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L_0x002a
            goto L_0x0028
        L_0x0040:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L_0x002a
            goto L_0x0028
        L_0x0047:
            if (r7 != 0) goto L_0x004a
            return r6
        L_0x004a:
            if (r9 == r5) goto L_0x007d
            if (r9 != r4) goto L_0x004f
            goto L_0x007d
        L_0x004f:
            int r11 = m2520b(r9, r10, r11)
            if (r9 == r5) goto L_0x0070
            if (r9 == r3) goto L_0x006b
            if (r9 == r4) goto L_0x0066
            if (r9 != r1) goto L_0x0060
            int r9 = r12.bottom
            int r10 = r10.bottom
            goto L_0x0074
        L_0x0060:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x0066:
            int r9 = r12.right
            int r10 = r10.right
            goto L_0x0074
        L_0x006b:
            int r9 = r10.top
            int r10 = r12.top
            goto L_0x0074
        L_0x0070:
            int r9 = r10.left
            int r10 = r12.left
        L_0x0074:
            int r9 = r9 - r10
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L_0x007c
            r2 = r6
        L_0x007c:
            return r2
        L_0x007d:
            return r6
        L_0x007e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p127k.C1061o.m2511a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d A[SYNTHETIC, Splitter:B:25:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0061 A[SYNTHETIC, Splitter:B:36:0x0061] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:29:0x0055=Splitter:B:29:0x0055, B:15:0x003a=Splitter:B:15:0x003a} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p124p.p199y.C1790d m2474a(byte[] r7) {
        /*
            p.y.d r0 = new p.y.d
            r0.<init>()
            if (r7 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0044, all -> 0x0040 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0044, all -> 0x0040 }
            int r7 = r2.readInt()     // Catch:{ IOException -> 0x003e }
        L_0x0017:
            if (r7 <= 0) goto L_0x0032
            java.lang.String r3 = r2.readUTF()     // Catch:{ IOException -> 0x003e }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ IOException -> 0x003e }
            boolean r4 = r2.readBoolean()     // Catch:{ IOException -> 0x003e }
            p.y.d$a r5 = new p.y.d$a     // Catch:{ IOException -> 0x003e }
            r5.<init>(r3, r4)     // Catch:{ IOException -> 0x003e }
            java.util.Set<p.y.d$a> r3 = r0.f5260a     // Catch:{ IOException -> 0x003e }
            r3.add(r5)     // Catch:{ IOException -> 0x003e }
            int r7 = r7 + -1
            goto L_0x0017
        L_0x0032:
            r2.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            r7 = move-exception
            r7.printStackTrace()
        L_0x003a:
            r1.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005d
        L_0x003e:
            r7 = move-exception
            goto L_0x0048
        L_0x0040:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L_0x005f
        L_0x0044:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L_0x0048:
            r7.printStackTrace()     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x0055
            r2.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0055
        L_0x0051:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0055:
            r1.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r7 = move-exception
            r7.printStackTrace()
        L_0x005d:
            return r0
        L_0x005e:
            r7 = move-exception
        L_0x005f:
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch:{ IOException -> 0x0065 }
            goto L_0x0069
        L_0x0065:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0069:
            r1.close()     // Catch:{ IOException -> 0x006d }
            goto L_0x0071
        L_0x006d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0071:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p127k.C1061o.m2474a(byte[]):p.y.d");
    }

    /* renamed from: a */
    public static void m2497a(String str) {
        if (!(Looper.getMainLooper() == Looper.myLooper())) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    public static int m2433a(Context context, String str) {
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String permissionToOp = AppOpsManager.permissionToOp(str);
        if (permissionToOp != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if (((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName) != 0) {
                return -2;
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0014 A[SYNTHETIC, Splitter:B:13:0x0014] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m2513a(java.io.File r0, android.content.res.Resources r1, int r2) {
        /*
            java.io.InputStream r1 = r1.openRawResource(r2)     // Catch:{ all -> 0x0010 }
            boolean r0 = m2514a(r0, r1)     // Catch:{ all -> 0x000e }
            if (r1 == 0) goto L_0x000d
            r1.close()     // Catch:{ IOException -> 0x000d }
        L_0x000d:
            return r0
        L_0x000e:
            r0 = move-exception
            goto L_0x0012
        L_0x0010:
            r0 = move-exception
            r1 = 0
        L_0x0012:
            if (r1 == 0) goto L_0x0017
            r1.close()     // Catch:{ IOException -> 0x0017 }
        L_0x0017:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p127k.C1061o.m2513a(java.io.File, android.content.res.Resources, int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0047 A[SYNTHETIC, Splitter:B:25:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0050 A[SYNTHETIC, Splitter:B:31:0x0050] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m2514a(java.io.File r5, java.io.InputStream r6) {
        /*
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskWrites()
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x002a }
            r3.<init>(r5, r1)     // Catch:{ IOException -> 0x002a }
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
        L_0x000f:
            int r2 = r6.read(r5)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            r4 = -1
            if (r2 == r4) goto L_0x001a
            r3.write(r5, r1, r2)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            goto L_0x000f
        L_0x001a:
            r5 = 1
            r3.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            android.os.StrictMode.setThreadPolicy(r0)
            return r5
        L_0x0022:
            r5 = move-exception
            r2 = r3
            goto L_0x004e
        L_0x0025:
            r5 = move-exception
            r2 = r3
            goto L_0x002b
        L_0x0028:
            r5 = move-exception
            goto L_0x004e
        L_0x002a:
            r5 = move-exception
        L_0x002b:
            java.lang.String r6 = "TypefaceCompatUtil"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r3.<init>()     // Catch:{ all -> 0x0028 }
            java.lang.String r4 = "Error copying resource contents to temp file: "
            r3.append(r4)     // Catch:{ all -> 0x0028 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0028 }
            r3.append(r5)     // Catch:{ all -> 0x0028 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x0028 }
            android.util.Log.e(r6, r5)     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x004a
            r2.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L_0x004e:
            if (r2 == 0) goto L_0x0053
            r2.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            android.os.StrictMode.setThreadPolicy(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p127k.C1061o.m2514a(java.io.File, java.io.InputStream):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r15v16, types: [android.animation.AnimatorSet] */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x030a  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.Animator m2444a(android.content.Context r22, android.content.res.Resources r23, android.content.res.Resources.Theme r24, org.xmlpull.v1.XmlPullParser r25, android.util.AttributeSet r26, android.animation.AnimatorSet r27, int r28, float r29) {
        /*
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r27
            int r12 = r25.getDepth()
            r0 = 0
            r1 = 0
            r13 = r1
        L_0x000f:
            int r1 = r25.next()
            r2 = 3
            r14 = 0
            if (r1 != r2) goto L_0x001d
            int r3 = r25.getDepth()
            if (r3 <= r12) goto L_0x0331
        L_0x001d:
            r3 = 1
            if (r1 == r3) goto L_0x0331
            r4 = 2
            if (r1 == r4) goto L_0x0024
            goto L_0x000f
        L_0x0024:
            java.lang.String r1 = r25.getName()
            java.lang.String r5 = "objectAnimator"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0046
            android.animation.ObjectAnimator r7 = new android.animation.ObjectAnimator
            r7.<init>()
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r26
            r4 = r7
            r5 = r29
            r6 = r25
            m2448a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x005f
        L_0x0046:
            java.lang.String r5 = "animator"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0064
            r4 = 0
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r26
            r5 = r29
            r6 = r25
            android.animation.ValueAnimator r7 = m2448a(r0, r1, r2, r3, r4, r5, r6)
        L_0x005f:
            r0 = r7
            r19 = r12
            goto L_0x0304
        L_0x0064:
            java.lang.String r5 = "set"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x009b
            android.animation.AnimatorSet r15 = new android.animation.AnimatorSet
            r15.<init>()
            int[] r0 = p124p.p192v.p193a.p194a.C1746a.f5093h
            r7 = r26
            android.content.res.TypedArray r6 = m2453a(r8, r9, r7, r0)
            java.lang.String r0 = "ordering"
            int r16 = m2521b(r6, r10, r0, r14, r14)
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r15
            r17 = r6
            r6 = r16
            r7 = r29
            m2444a(r0, r1, r2, r3, r4, r5, r6, r7)
            r17.recycle()
            r19 = r12
            r0 = r15
            goto L_0x0304
        L_0x009b:
            java.lang.String r5 = "propertyValuesHolder"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x031a
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r25)
            r6 = 0
            r21 = r14
            r14 = r3
            r3 = r21
        L_0x00ad:
            int r7 = r25.getEventType()
            if (r7 == r2) goto L_0x02e0
            if (r7 == r14) goto L_0x02e0
            if (r7 == r4) goto L_0x00bb
            r25.next()
            goto L_0x00ad
        L_0x00bb:
            java.lang.String r7 = r25.getName()
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x02cb
            int[] r3 = p124p.p192v.p193a.p194a.C1746a.f5094i
            android.content.res.TypedArray r3 = m2453a(r8, r9, r1, r3)
            java.lang.String r7 = "propertyName"
            java.lang.String r7 = m2466a(r3, r10, r7, r2)
            r14 = 4
            java.lang.String r15 = "valueType"
            int r4 = m2521b(r3, r10, r15, r4, r14)
            r14 = 0
            r16 = r1
            r15 = r4
        L_0x00dc:
            int r1 = r25.next()
            if (r1 == r2) goto L_0x01d0
            r17 = r2
            r2 = 1
            if (r1 == r2) goto L_0x01d0
            java.lang.String r1 = r25.getName()
            java.lang.String r2 = "keyframe"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x01c6
            java.lang.String r1 = "value"
            r2 = 4
            if (r15 != r2) goto L_0x0127
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r25)
            int[] r15 = p124p.p192v.p193a.p194a.C1746a.f5095j
            android.content.res.TypedArray r2 = m2453a(r8, r9, r2, r15)
            boolean r15 = m2515a(r10, r1)
            if (r15 != 0) goto L_0x010a
            r15 = 0
            goto L_0x010f
        L_0x010a:
            r15 = 0
            android.util.TypedValue r15 = r2.peekValue(r15)
        L_0x010f:
            if (r15 == 0) goto L_0x0114
            r18 = 1
            goto L_0x0116
        L_0x0114:
            r18 = 0
        L_0x0116:
            if (r18 == 0) goto L_0x0123
            int r15 = r15.type
            boolean r15 = m2558f(r15)
            if (r15 == 0) goto L_0x0123
            r15 = r17
            goto L_0x0124
        L_0x0123:
            r15 = 0
        L_0x0124:
            r2.recycle()
        L_0x0127:
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r25)
            r18 = r5
            int[] r5 = p124p.p192v.p193a.p194a.C1746a.f5095j
            android.content.res.TypedArray r2 = m2453a(r8, r9, r2, r5)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.String r8 = "fraction"
            r9 = 3
            float r5 = m2430a(r2, r10, r8, r9, r5)
            boolean r8 = m2515a(r10, r1)
            if (r8 != 0) goto L_0x0144
            r8 = 0
            goto L_0x0149
        L_0x0144:
            r8 = 0
            android.util.TypedValue r8 = r2.peekValue(r8)
        L_0x0149:
            if (r8 == 0) goto L_0x014d
            r9 = 1
            goto L_0x014e
        L_0x014d:
            r9 = 0
        L_0x014e:
            r19 = r12
            r12 = 4
            if (r15 != r12) goto L_0x0161
            if (r9 == 0) goto L_0x015f
            int r8 = r8.type
            boolean r8 = m2558f(r8)
            if (r8 == 0) goto L_0x015f
            r8 = 3
            goto L_0x0162
        L_0x015f:
            r8 = 0
            goto L_0x0162
        L_0x0161:
            r8 = r15
        L_0x0162:
            if (r9 == 0) goto L_0x0183
            if (r8 == 0) goto L_0x0178
            r9 = 1
            if (r8 == r9) goto L_0x016e
            r9 = 3
            if (r8 == r9) goto L_0x016e
            r1 = 0
            goto L_0x018e
        L_0x016e:
            r8 = 0
            int r1 = m2521b(r2, r10, r1, r8, r8)
            android.animation.Keyframe r1 = android.animation.Keyframe.ofInt(r5, r1)
            goto L_0x018e
        L_0x0178:
            r8 = 0
            r9 = 0
            float r1 = m2430a(r2, r10, r1, r8, r9)
            android.animation.Keyframe r1 = android.animation.Keyframe.ofFloat(r5, r1)
            goto L_0x018e
        L_0x0183:
            if (r8 != 0) goto L_0x018a
            android.animation.Keyframe r1 = android.animation.Keyframe.ofFloat(r5)
            goto L_0x018e
        L_0x018a:
            android.animation.Keyframe r1 = android.animation.Keyframe.ofInt(r5)
        L_0x018e:
            java.lang.String r5 = "interpolator"
            boolean r5 = m2515a(r10, r5)
            if (r5 != 0) goto L_0x0198
            r5 = 0
            goto L_0x019e
        L_0x0198:
            r5 = 0
            r8 = 1
            int r5 = r2.getResourceId(r8, r5)
        L_0x019e:
            r8 = r22
            if (r5 <= 0) goto L_0x01a9
            android.view.animation.Interpolator r5 = android.view.animation.AnimationUtils.loadInterpolator(r8, r5)
            r1.setInterpolator(r5)
        L_0x01a9:
            r2.recycle()
            if (r1 == 0) goto L_0x01b8
            if (r14 != 0) goto L_0x01b5
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x01b5:
            r14.add(r1)
        L_0x01b8:
            r25.next()
            r2 = 3
            r8 = r23
            r9 = r24
            r5 = r18
            r12 = r19
            goto L_0x00dc
        L_0x01c6:
            r8 = r22
            r8 = r23
            r9 = r24
            r2 = r17
            goto L_0x00dc
        L_0x01d0:
            r8 = r22
            r18 = r5
            r19 = r12
            if (r14 == 0) goto L_0x02ac
            int r1 = r14.size()
            if (r1 <= 0) goto L_0x02ac
            r2 = 0
            java.lang.Object r2 = r14.get(r2)
            android.animation.Keyframe r2 = (android.animation.Keyframe) r2
            int r5 = r1 + -1
            java.lang.Object r5 = r14.get(r5)
            android.animation.Keyframe r5 = (android.animation.Keyframe) r5
            float r9 = r5.getFraction()
            r12 = 1065353216(0x3f800000, float:1.0)
            int r17 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r17 >= 0) goto L_0x020e
            r17 = 0
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 >= 0) goto L_0x0201
            r5.setFraction(r12)
            goto L_0x020e
        L_0x0201:
            int r9 = r14.size()
            android.animation.Keyframe r5 = m2445a(r5, r12)
            r14.add(r9, r5)
            int r1 = r1 + 1
        L_0x020e:
            float r5 = r2.getFraction()
            r9 = 0
            int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x0229
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 >= 0) goto L_0x021f
            r2.setFraction(r9)
            goto L_0x0229
        L_0x021f:
            android.animation.Keyframe r2 = m2445a(r2, r9)
            r5 = 0
            r14.add(r5, r2)
            int r1 = r1 + 1
        L_0x0229:
            android.animation.Keyframe[] r2 = new android.animation.Keyframe[r1]
            r14.toArray(r2)
            r5 = 0
        L_0x022f:
            if (r5 >= r1) goto L_0x029e
            r9 = r2[r5]
            float r12 = r9.getFraction()
            r14 = 0
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L_0x0248
            if (r5 != 0) goto L_0x023f
            goto L_0x0245
        L_0x023f:
            int r12 = r1 + -1
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r5 != r12) goto L_0x024b
        L_0x0245:
            r9.setFraction(r14)
        L_0x0248:
            r17 = r1
            goto L_0x0297
        L_0x024b:
            int r9 = r5 + 1
            r14 = r5
        L_0x024e:
            if (r9 >= r12) goto L_0x0265
            r17 = r2[r9]
            float r17 = r17.getFraction()
            r20 = 0
            int r17 = (r17 > r20 ? 1 : (r17 == r20 ? 0 : -1))
            if (r17 < 0) goto L_0x025d
            goto L_0x0265
        L_0x025d:
            int r14 = r9 + 1
            r21 = r14
            r14 = r9
            r9 = r21
            goto L_0x024e
        L_0x0265:
            int r9 = r14 + 1
            r9 = r2[r9]
            float r9 = r9.getFraction()
            int r12 = r5 + -1
            r12 = r2[r12]
            float r12 = r12.getFraction()
            float r9 = r9 - r12
            int r12 = r14 - r5
            int r12 = r12 + 2
            float r12 = (float) r12
            float r9 = r9 / r12
            r12 = r5
        L_0x027d:
            if (r12 > r14) goto L_0x0248
            r17 = r1
            r1 = r2[r12]
            int r20 = r12 + -1
            r20 = r2[r20]
            float r20 = r20.getFraction()
            float r8 = r20 + r9
            r1.setFraction(r8)
            int r12 = r12 + 1
            r8 = r22
            r1 = r17
            goto L_0x027d
        L_0x0297:
            int r5 = r5 + 1
            r8 = r22
            r1 = r17
            goto L_0x022f
        L_0x029e:
            r1 = 2
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofKeyframe(r7, r2)
            r5 = 3
            if (r15 != r5) goto L_0x02af
            p.v.a.a.e r8 = p124p.p192v.p193a.p194a.C1753e.f5110a
            r2.setEvaluator(r8)
            goto L_0x02af
        L_0x02ac:
            r5 = 3
            r1 = 2
            r2 = 0
        L_0x02af:
            r8 = 0
            r14 = 1
            if (r2 != 0) goto L_0x02b7
            android.animation.PropertyValuesHolder r2 = m2447a(r3, r4, r8, r14, r7)
        L_0x02b7:
            if (r2 == 0) goto L_0x02c4
            if (r6 != 0) goto L_0x02c1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6 = r4
        L_0x02c1:
            r6.add(r2)
        L_0x02c4:
            r3.recycle()
            r4 = r1
            r2 = r5
            r3 = r8
            goto L_0x02d1
        L_0x02cb:
            r16 = r1
            r18 = r5
            r19 = r12
        L_0x02d1:
            r25.next()
            r8 = r23
            r9 = r24
            r1 = r16
            r5 = r18
            r12 = r19
            goto L_0x00ad
        L_0x02e0:
            r19 = r12
            if (r6 == 0) goto L_0x02f7
            int r1 = r6.size()
            android.animation.PropertyValuesHolder[] r2 = new android.animation.PropertyValuesHolder[r1]
        L_0x02ea:
            if (r3 >= r1) goto L_0x02f8
            java.lang.Object r4 = r6.get(r3)
            android.animation.PropertyValuesHolder r4 = (android.animation.PropertyValuesHolder) r4
            r2[r3] = r4
            int r3 = r3 + 1
            goto L_0x02ea
        L_0x02f7:
            r2 = 0
        L_0x02f8:
            if (r2 == 0) goto L_0x0304
            boolean r1 = r0 instanceof android.animation.ValueAnimator
            if (r1 == 0) goto L_0x0304
            r1 = r0
            android.animation.ValueAnimator r1 = (android.animation.ValueAnimator) r1
            r1.setValues(r2)
        L_0x0304:
            if (r11 == 0) goto L_0x0312
            if (r14 != 0) goto L_0x0312
            if (r13 != 0) goto L_0x030f
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x030f:
            r13.add(r0)
        L_0x0312:
            r8 = r23
            r9 = r24
            r12 = r19
            goto L_0x000f
        L_0x031a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unknown animator name: "
            java.lang.StringBuilder r1 = p213q.p214a.p215a.p216a.C1965a.m4756a(r1)
            java.lang.String r2 = r25.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0331:
            if (r11 == 0) goto L_0x035a
            if (r13 == 0) goto L_0x035a
            int r1 = r13.size()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            java.util.Iterator r2 = r13.iterator()
        L_0x033f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0351
            java.lang.Object r3 = r2.next()
            android.animation.Animator r3 = (android.animation.Animator) r3
            int r4 = r14 + 1
            r1[r14] = r3
            r14 = r4
            goto L_0x033f
        L_0x0351:
            if (r28 != 0) goto L_0x0357
            r11.playTogether(r1)
            goto L_0x035a
        L_0x0357:
            r11.playSequentially(r1)
        L_0x035a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p127k.C1061o.m2444a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* JADX WARNING: type inference failed for: r8v16, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d3  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m2452a(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) {
        /*
            r0 = r19
            r1 = r20
            java.lang.String r2 = r18.getName()
            java.lang.String r3 = "selector"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0105
            int r2 = r18.getDepth()
            r3 = 1
            int r2 = r2 + r3
            r4 = 20
            int[][] r5 = new int[r4][]
            int[] r4 = new int[r4]
            r6 = 0
            r7 = r6
        L_0x001e:
            int r8 = r18.next()
            if (r8 == r3) goto L_0x00f5
            int r9 = r18.getDepth()
            if (r9 >= r2) goto L_0x002d
            r10 = 3
            if (r8 == r10) goto L_0x00f5
        L_0x002d:
            r10 = 2
            if (r8 != r10) goto L_0x00f0
            if (r9 > r2) goto L_0x00f0
            java.lang.String r8 = r18.getName()
            java.lang.String r9 = "item"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x0040
            goto L_0x00f0
        L_0x0040:
            int[] r8 = p124p.p150h.C1308c.ColorStateListItem
            if (r1 != 0) goto L_0x004b
            r9 = r17
            android.content.res.TypedArray r8 = r9.obtainAttributes(r0, r8)
            goto L_0x0051
        L_0x004b:
            r9 = r17
            android.content.res.TypedArray r8 = r1.obtainStyledAttributes(r0, r8, r6, r6)
        L_0x0051:
            int r10 = p124p.p150h.C1308c.ColorStateListItem_android_color
            r11 = -65281(0xffffffffffff00ff, float:NaN)
            int r10 = r8.getColor(r10, r11)
            r11 = 1065353216(0x3f800000, float:1.0)
            int r12 = p124p.p150h.C1308c.ColorStateListItem_android_alpha
            boolean r12 = r8.hasValue(r12)
            if (r12 == 0) goto L_0x0067
            int r12 = p124p.p150h.C1308c.ColorStateListItem_android_alpha
            goto L_0x0071
        L_0x0067:
            int r12 = p124p.p150h.C1308c.ColorStateListItem_alpha
            boolean r12 = r8.hasValue(r12)
            if (r12 == 0) goto L_0x0075
            int r12 = p124p.p150h.C1308c.ColorStateListItem_alpha
        L_0x0071:
            float r11 = r8.getFloat(r12, r11)
        L_0x0075:
            r8.recycle()
            int r8 = r19.getAttributeCount()
            int[] r12 = new int[r8]
            r13 = r6
            r14 = r13
        L_0x0080:
            if (r13 >= r8) goto L_0x00a5
            int r15 = r0.getAttributeNameResource(r13)
            r3 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r15 == r3) goto L_0x00a1
            r3 = 16843551(0x101031f, float:2.3695797E-38)
            if (r15 == r3) goto L_0x00a1
            int r3 = p124p.p150h.C1306a.alpha
            if (r15 == r3) goto L_0x00a1
            int r3 = r14 + 1
            boolean r16 = r0.getAttributeBooleanValue(r13, r6)
            if (r16 == 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            int r15 = -r15
        L_0x009e:
            r12[r14] = r15
            r14 = r3
        L_0x00a1:
            int r13 = r13 + 1
            r3 = 1
            goto L_0x0080
        L_0x00a5:
            int[] r3 = android.util.StateSet.trimStateSet(r12, r14)
            int r8 = android.graphics.Color.alpha(r10)
            float r8 = (float) r8
            float r8 = r8 * r11
            int r8 = java.lang.Math.round(r8)
            r11 = 16777215(0xffffff, float:2.3509886E-38)
            r10 = r10 & r11
            int r8 = r8 << 24
            r8 = r8 | r10
            int r10 = r7 + 1
            int r11 = r4.length
            r12 = 8
            r13 = 4
            if (r10 <= r11) goto L_0x00ce
            if (r7 > r13) goto L_0x00c6
            r11 = r12
            goto L_0x00c8
        L_0x00c6:
            int r11 = r7 * 2
        L_0x00c8:
            int[] r11 = new int[r11]
            java.lang.System.arraycopy(r4, r6, r11, r6, r7)
            r4 = r11
        L_0x00ce:
            r4[r7] = r8
            int r8 = r5.length
            if (r10 <= r8) goto L_0x00ea
            java.lang.Class r8 = r5.getClass()
            java.lang.Class r8 = r8.getComponentType()
            if (r7 > r13) goto L_0x00de
            goto L_0x00e0
        L_0x00de:
            int r12 = r7 * 2
        L_0x00e0:
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r8, r12)
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            java.lang.System.arraycopy(r5, r6, r8, r6, r7)
            r5 = r8
        L_0x00ea:
            r5[r7] = r3
            int[][] r5 = (int[][]) r5
            r7 = r10
            goto L_0x00f2
        L_0x00f0:
            r9 = r17
        L_0x00f2:
            r3 = 1
            goto L_0x001e
        L_0x00f5:
            int[] r0 = new int[r7]
            int[][] r1 = new int[r7][]
            java.lang.System.arraycopy(r4, r6, r0, r6, r7)
            java.lang.System.arraycopy(r5, r6, r1, r6, r7)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L_0x0105:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r18.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = ": invalid color state list tag "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p127k.C1061o.m2452a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* renamed from: a */
    public static void m2504a(C1280e eVar) {
        if ((eVar.f3764C0 & 32) != 32) {
            eVar.f3779w0.clear();
            eVar.f3779w0.add(0, new C1281f(eVar.f3827k0));
            return;
        }
        eVar.f3765D0 = true;
        eVar.f3780x0 = false;
        eVar.f3781y0 = false;
        eVar.f3782z0 = false;
        ArrayList<C1278d> arrayList = eVar.f3827k0;
        List<C1281f> list = eVar.f3779w0;
        boolean z = eVar.mo5698e() == C1279a.WRAP_CONTENT;
        boolean z2 = eVar.mo5704i() == C1279a.WRAP_CONTENT;
        boolean z3 = z || z2;
        list.clear();
        for (C1278d dVar : arrayList) {
            dVar.f3746p = null;
            dVar.f3729d0 = false;
            dVar.mo5672m();
        }
        for (C1278d dVar2 : arrayList) {
            if (dVar2.f3746p == null) {
                C1281f fVar = new C1281f(new ArrayList(), true);
                list.add(fVar);
                if (!m2516a(dVar2, fVar, list, z3)) {
                    eVar.f3779w0.clear();
                    eVar.f3779w0.add(0, new C1281f(eVar.f3827k0));
                    eVar.f3765D0 = false;
                    return;
                }
            }
        }
        int i = 0;
        int i2 = 0;
        for (C1281f fVar2 : list) {
            i = Math.max(i, m2442a(fVar2, 0));
            i2 = Math.max(i2, m2442a(fVar2, 1));
        }
        if (z) {
            eVar.mo5686a(C1279a.FIXED);
            eVar.mo5701f(i);
            eVar.f3780x0 = true;
            eVar.f3781y0 = true;
            eVar.f3762A0 = i;
        }
        if (z2) {
            eVar.mo5691b(C1279a.FIXED);
            eVar.mo5699e(i2);
            eVar.f3780x0 = true;
            eVar.f3782z0 = true;
            eVar.f3763B0 = i2;
        }
        m2502a(list, 0, eVar.mo5705j());
        m2502a(list, 1, eVar.mo5696d());
    }

    /* renamed from: a */
    public static int m2442a(C1281f fVar, int i) {
        int i2 = i * 2;
        List<C1278d> list = null;
        if (fVar != null) {
            if (i == 0) {
                list = fVar.f3788f;
            } else if (i == 1) {
                list = fVar.f3789g;
            }
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                C1278d dVar = (C1278d) list.get(i4);
                C1274c[] cVarArr = dVar.f3696A;
                int i5 = i2 + 1;
                i3 = Math.max(i3, m2441a(dVar, i, cVarArr[i5].f3672d == null || !(cVarArr[i2].f3672d == null || cVarArr[i5].f3672d == null), 0));
            }
            fVar.f3787e[i] = i3;
            return i3;
        }
        throw null;
    }

    /* renamed from: a */
    public static int m2441a(C1278d dVar, int i, boolean z, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int j;
        int i8;
        int i9;
        C1278d dVar2 = dVar;
        int i10 = i;
        boolean z2 = z;
        int i11 = 0;
        if (!dVar2.f3725b0) {
            return 0;
        }
        boolean z3 = dVar2.f3753w.f3672d != null && i10 == 1;
        if (z2) {
            i6 = dVar2.f3712Q;
            i5 = dVar.mo5696d() - dVar2.f3712Q;
            i4 = i10 * 2;
            i3 = i4 + 1;
        } else {
            int d = dVar.mo5696d();
            i5 = dVar2.f3712Q;
            i6 = d - i5;
            i3 = i10 * 2;
            i4 = i3 + 1;
        }
        C1274c[] cVarArr = dVar2.f3696A;
        if (cVarArr[i3].f3672d == null || cVarArr[i4].f3672d != null) {
            i7 = 1;
        } else {
            i7 = -1;
            int i12 = i3;
            i3 = i4;
            i4 = i12;
        }
        int a = m2440a(dVar, i) + (dVar2.f3696A[i4].mo5674a() * i7);
        int i13 = (z3 ? i2 - i6 : i2) + a;
        int j2 = (i10 == 0 ? dVar.mo5705j() : dVar.mo5696d()) * i7;
        Iterator it = dVar2.f3696A[i4].f3669a.f3815a.iterator();
        while (it.hasNext()) {
            i11 = Math.max(i11, m2441a(((C1285j) ((C1287l) it.next())).f3803c.f3670b, i10, z2, i13));
        }
        Iterator it2 = dVar2.f3696A[i3].f3669a.f3815a.iterator();
        int i14 = 0;
        while (it2.hasNext()) {
            Iterator it3 = it2;
            i14 = Math.max(i14, m2441a(((C1285j) ((C1287l) it2.next())).f3803c.f3670b, i10, z2, j2 + i13));
            it2 = it3;
        }
        if (z3) {
            i11 -= i6;
            j = i14 + i5;
        } else {
            j = i14 + ((i10 == 0 ? dVar.mo5705j() : dVar.mo5696d()) * i7);
        }
        if (i10 == 1) {
            Iterator it4 = dVar2.f3753w.f3669a.f3815a.iterator();
            int i15 = 0;
            while (it4.hasNext()) {
                Iterator it5 = it4;
                int i16 = i3;
                i15 = Math.max(i15, m2441a(((C1285j) ((C1287l) it4.next())).f3803c.f3670b, i10, z2, i7 == 1 ? i6 + i13 : (i5 * i7) + i13));
                it4 = it5;
                i3 = i16;
            }
            i8 = i3;
            i9 = (dVar2.f3753w.f3669a.f3815a.size() <= 0 || z3) ? i15 : i7 == 1 ? i15 + i6 : i15 - i5;
        } else {
            i8 = i3;
            i9 = 0;
        }
        int max = Math.max(i11, Math.max(j, i9)) + a;
        int i17 = j2 + i13;
        if (i7 == -1) {
            int i18 = i17;
            i17 = i13;
            i13 = i18;
        }
        if (z2) {
            C1284i.m3322a(dVar2, i10, i13);
            dVar2.mo5682a(i13, i17, i10);
        } else {
            dVar2.f3746p.mo5721a(dVar2, i10);
            if (i10 == 0) {
                dVar2.f3706K = i13;
            } else if (i10 == 1) {
                dVar2.f3707L = i13;
            }
        }
        if (dVar.mo5688b(i) == C1279a.MATCH_CONSTRAINT && dVar2.f3702G != 0.0f) {
            dVar2.f3746p.mo5721a(dVar2, i10);
        }
        C1274c[] cVarArr2 = dVar2.f3696A;
        if (!(cVarArr2[i4].f3672d == null || cVarArr2[i8].f3672d == null)) {
            C1278d dVar3 = dVar2.f3699D;
            if (cVarArr2[i4].f3672d.f3670b == dVar3 && cVarArr2[i8].f3672d.f3670b == dVar3) {
                dVar2.f3746p.mo5721a(dVar2, i10);
            }
        }
        return max;
    }

    /* renamed from: a */
    public static C1326a m2471a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme, String str, int i, int i2) {
        C1326a aVar;
        if (m2515a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new C1326a(null, null, typedValue.data);
            }
            try {
                aVar = C1326a.m3379a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                aVar = null;
            }
            if (aVar != null) {
                return aVar;
            }
        }
        return new C1326a(null, null, i2);
    }

    /* renamed from: a */
    public static PropertyValuesHolder m2447a(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i4 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i5 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((!z || !m2558f(i4)) && (!z2 || !m2558f(i5))) ? 0 : 3;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder3 = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C1337c[] d = m2552d(string);
            C1337c[] d2 = m2552d(string2);
            if (d == null && d2 == null) {
                return null;
            }
            if (d != null) {
                C1752d dVar = new C1752d();
                if (d2 == null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, dVar, new Object[]{d});
                } else if (m2517a(d, d2)) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, dVar, new Object[]{d, d2});
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(" Can't morph from ");
                    sb.append(string);
                    sb.append(" to ");
                    sb.append(string2);
                    throw new InflateException(sb.toString());
                }
                return propertyValuesHolder2;
            } else if (d2 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, new C1752d(), new Object[]{d2});
            }
        } else {
            TypeEvaluator typeEvaluator = i == 3 ? C1753e.f5110a : null;
            if (z3) {
                if (z) {
                    float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                    if (z2) {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f)});
                    } else {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{dimension});
                    }
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f)});
                }
            } else if (z) {
                int i6 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : m2558f(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
                if (z2) {
                    int i7 = i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m2558f(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{i6, i7});
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{i6});
                }
            } else {
                if (z2) {
                    int i8 = i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m2558f(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{i8});
                }
                if (propertyValuesHolder3 == null && typeEvaluator != null) {
                    propertyValuesHolder3.setEvaluator(typeEvaluator);
                    return propertyValuesHolder3;
                }
            }
            propertyValuesHolder3 = propertyValuesHolder;
            return propertyValuesHolder3 == null ? propertyValuesHolder3 : propertyValuesHolder3;
        }
    }

    /* renamed from: a */
    public static Intent m2449a(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String b = m2527b((Context) activity, activity.getComponentName());
            if (b == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, b);
            try {
                return m2527b((Context) activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (NameNotFoundException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("getParentActivityIntent: bad parentActivityName '");
                sb.append(b);
                sb.append("' in manifest");
                Log.e("NavUtils", sb.toString());
                return null;
            }
        } catch (NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if (r7 != 2) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (r5 != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p124p.p150h.p160j.C1371b.C1372a m2473a(android.widget.TextView r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0010
            p.h.j.b$a r0 = new p.h.j.b$a
            android.text.PrecomputedText$Params r7 = r7.getTextMetricsParams()
            r0.<init>(r7)
            return r0
        L_0x0010:
            android.text.TextPaint r0 = new android.text.TextPaint
            android.text.TextPaint r2 = r7.getPaint()
            r0.<init>(r2)
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            int r2 = r7.getBreakStrategy()
            int r3 = r7.getHyphenationFrequency()
            android.text.method.TransformationMethod r4 = r7.getTransformationMethod()
            boolean r4 = r4 instanceof android.text.method.PasswordTransformationMethod
            if (r4 == 0) goto L_0x002e
        L_0x002b:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LTR
            goto L_0x0077
        L_0x002e:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 0
            r6 = 1
            if (r4 < r1) goto L_0x0059
            int r1 = r7.getInputType()
            r1 = r1 & 15
            r4 = 3
            if (r1 != r4) goto L_0x0059
            java.util.Locale r7 = r7.getTextLocale()
            android.icu.text.DecimalFormatSymbols r7 = android.icu.text.DecimalFormatSymbols.getInstance(r7)
            java.lang.String[] r7 = r7.getDigitStrings()
            r7 = r7[r5]
            int r7 = r7.codePointAt(r5)
            byte r7 = java.lang.Character.getDirectionality(r7)
            if (r7 == r6) goto L_0x006f
            r1 = 2
            if (r7 != r1) goto L_0x002b
            goto L_0x006f
        L_0x0059:
            int r1 = r7.getLayoutDirection()
            if (r1 != r6) goto L_0x0060
            r5 = r6
        L_0x0060:
            int r7 = r7.getTextDirection()
            switch(r7) {
                case 2: goto L_0x0072;
                case 3: goto L_0x002b;
                case 4: goto L_0x006f;
                case 5: goto L_0x006c;
                case 6: goto L_0x0075;
                case 7: goto L_0x0069;
                default: goto L_0x0067;
            }
        L_0x0067:
            if (r5 == 0) goto L_0x0075
        L_0x0069:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L_0x0077
        L_0x006c:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LOCALE
            goto L_0x0077
        L_0x006f:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.RTL
            goto L_0x0077
        L_0x0072:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            goto L_0x0077
        L_0x0075:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
        L_0x0077:
            p.h.j.b$a r1 = new p.h.j.b$a
            r1.<init>(r0, r7, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p127k.C1061o.m2473a(android.widget.TextView):p.h.j.b$a");
    }

    /* renamed from: a */
    public static ValueAnimator m2448a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray typedArray;
        ValueAnimator valueAnimator2;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        Resources resources2 = resources;
        Theme theme2 = theme;
        AttributeSet attributeSet2 = attributeSet;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        TypedArray a = m2453a(resources2, theme2, attributeSet2, C1746a.f5092g);
        TypedArray a2 = m2453a(resources2, theme2, attributeSet2, C1746a.f5096k);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        long b = (long) m2521b(a, xmlPullParser2, "duration", 1, 300);
        int i = 0;
        long b2 = (long) m2521b(a, xmlPullParser2, "startOffset", 2, 0);
        int b3 = m2521b(a, xmlPullParser2, "valueType", 7, 4);
        if (m2515a(xmlPullParser2, "valueFrom") && m2515a(xmlPullParser2, "valueTo")) {
            if (b3 == 4) {
                TypedValue peekValue = a.peekValue(5);
                boolean z = peekValue != null;
                int i2 = z ? peekValue.type : 0;
                TypedValue peekValue2 = a.peekValue(6);
                boolean z2 = peekValue2 != null;
                b3 = ((!z || !m2558f(i2)) && (!z2 || !m2558f(z2 ? peekValue2.type : 0))) ? 0 : 3;
            }
            PropertyValuesHolder a3 = m2447a(a, b3, 5, 6, Objects.EMPTY_STRING);
            if (a3 != null) {
                valueAnimator4.setValues(new PropertyValuesHolder[]{a3});
            }
        }
        valueAnimator4.setDuration(b);
        valueAnimator4.setStartDelay(b2);
        valueAnimator4.setRepeatCount(m2521b(a, xmlPullParser2, "repeatCount", 3, 0));
        valueAnimator4.setRepeatMode(m2521b(a, xmlPullParser2, "repeatMode", 4, 1));
        if (a2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String a4 = m2466a(a2, xmlPullParser2, "pathData", 1);
            if (a4 != null) {
                String a5 = m2466a(a2, xmlPullParser2, "propertyXName", 2);
                String a6 = m2466a(a2, xmlPullParser2, "propertyYName", 3);
                if (a5 == null && a6 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(a2.getPositionDescription());
                    sb.append(" propertyXName or propertyYName is needed for PathData");
                    throw new InflateException(sb.toString());
                }
                Path e = m2553e(a4);
                float f2 = 0.5f * f;
                PathMeasure pathMeasure = new PathMeasure(e, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f3 = 0.0f;
                while (true) {
                    f3 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f3));
                    if (!pathMeasure.nextContour()) {
                        break;
                    }
                }
                PathMeasure pathMeasure2 = new PathMeasure(e, false);
                int min = Math.min(100, ((int) (f3 / f2)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f4 = f3 / ((float) (min - 1));
                valueAnimator2 = valueAnimator4;
                typedArray = a;
                int i3 = 0;
                float f5 = 0.0f;
                while (true) {
                    propertyValuesHolder = null;
                    if (i >= min) {
                        break;
                    }
                    int i4 = min;
                    pathMeasure2.getPosTan(f5 - ((Float) arrayList.get(i3)).floatValue(), fArr3, null);
                    fArr[i] = fArr3[0];
                    fArr2[i] = fArr3[1];
                    f5 += f4;
                    int i5 = i3 + 1;
                    if (i5 < arrayList.size() && f5 > ((Float) arrayList.get(i5)).floatValue()) {
                        pathMeasure2.nextContour();
                        i3 = i5;
                    }
                    i++;
                    min = i4;
                }
                PropertyValuesHolder ofFloat = a5 != null ? PropertyValuesHolder.ofFloat(a5, fArr) : null;
                if (a6 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(a6, fArr2);
                }
                if (ofFloat == null) {
                    i = 0;
                    objectAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
                } else {
                    i = 0;
                    if (propertyValuesHolder == null) {
                        objectAnimator.setValues(new PropertyValuesHolder[]{ofFloat});
                    } else {
                        objectAnimator.setValues(new PropertyValuesHolder[]{ofFloat, propertyValuesHolder});
                    }
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray = a;
                objectAnimator.setPropertyName(m2466a(a2, xmlPullParser2, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator4;
            typedArray = a;
        }
        if (!m2515a(xmlPullParser2, "interpolator")) {
            typedArray2 = typedArray;
        } else {
            typedArray2 = typedArray;
            i = typedArray2.getResourceId(i, i);
        }
        if (i > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (a2 != null) {
            a2.recycle();
        }
        return valueAnimator3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a2, code lost:
        if (r10 != null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
        if (r10 != null) goto L_0x00a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m2455a(android.content.Context r16, int r17, android.util.TypedValue r18, int r19, p124p.p150h.p152e.p153b.C1332g r20, android.os.Handler r21, boolean r22) {
        /*
            r9 = r17
            r0 = r18
            r5 = r19
            r10 = r20
            r11 = r21
            android.content.res.Resources r3 = r16.getResources()
            r1 = 1
            r3.getValue(r9, r0, r1)
            java.lang.String r12 = "ResourcesCompat"
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L_0x00c9
            java.lang.String r13 = r1.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r13.startsWith(r0)
            r14 = 0
            r15 = -3
            if (r0 != 0) goto L_0x002a
            if (r10 == 0) goto L_0x00a7
            goto L_0x00a4
        L_0x002a:
            p.e.f<java.lang.String, android.graphics.Typeface> r0 = p124p.p150h.p154f.C1338d.f4042b
            java.lang.String r1 = p124p.p150h.p154f.C1338d.m3396a(r3, r9, r5)
            java.lang.Object r0 = r0.mo5525a(r1)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x0040
            if (r10 == 0) goto L_0x003d
            r10.mo5793a(r0, r11)
        L_0x003d:
            r14 = r0
            goto L_0x00a7
        L_0x0040:
            java.lang.String r0 = r13.toLowerCase()     // Catch:{ XmlPullParserException -> 0x008d, IOException -> 0x0084 }
            java.lang.String r1 = ".xml"
            boolean r0 = r0.endsWith(r1)     // Catch:{ XmlPullParserException -> 0x008d, IOException -> 0x0084 }
            if (r0 == 0) goto L_0x0072
            android.content.res.XmlResourceParser r0 = r3.getXml(r9)     // Catch:{ XmlPullParserException -> 0x008d, IOException -> 0x0084 }
            p.h.e.b.b r2 = m2472a(r0, r3)     // Catch:{ XmlPullParserException -> 0x008d, IOException -> 0x0084 }
            if (r2 != 0) goto L_0x0061
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r12, r0)     // Catch:{ XmlPullParserException -> 0x008d, IOException -> 0x0084 }
            if (r10 == 0) goto L_0x00a7
            r10.mo5792a(r15, r11)     // Catch:{ XmlPullParserException -> 0x008d, IOException -> 0x0084 }
            goto L_0x00a7
        L_0x0061:
            r1 = r16
            r4 = r17
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r14 = p124p.p150h.p154f.C1338d.m3395a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x008d, IOException -> 0x0084 }
            goto L_0x00a7
        L_0x0072:
            r0 = r16
            android.graphics.Typeface r0 = p124p.p150h.p154f.C1338d.m3393a(r0, r3, r9, r13, r5)     // Catch:{ XmlPullParserException -> 0x008d, IOException -> 0x0084 }
            if (r10 == 0) goto L_0x003d
            if (r0 == 0) goto L_0x0080
            r10.mo5793a(r0, r11)     // Catch:{ XmlPullParserException -> 0x008d, IOException -> 0x0084 }
            goto L_0x003d
        L_0x0080:
            r10.mo5792a(r15, r11)     // Catch:{ XmlPullParserException -> 0x008d, IOException -> 0x0084 }
            goto L_0x003d
        L_0x0084:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            goto L_0x0095
        L_0x008d:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
        L_0x0095:
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r12, r1, r0)
            if (r10 == 0) goto L_0x00a7
        L_0x00a4:
            r10.mo5792a(r15, r11)
        L_0x00a7:
            if (r14 != 0) goto L_0x00c8
            if (r10 == 0) goto L_0x00ac
            goto L_0x00c8
        L_0x00ac:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.String r1 = "Font resource ID #0x"
            java.lang.StringBuilder r1 = p213q.p214a.p215a.p216a.C1965a.m4756a(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r17)
            r1.append(r2)
            java.lang.String r2 = " could not be retrieved."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c8:
            return r14
        L_0x00c9:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.String r2 = "Resource \""
            java.lang.StringBuilder r2 = p213q.p214a.p215a.p216a.C1965a.m4756a(r2)
            java.lang.String r3 = r3.getResourceName(r9)
            r2.append(r3)
            java.lang.String r3 = "\" ("
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r17)
            r2.append(r3)
            java.lang.String r3 = ") is not a Font: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p127k.C1061o.m2455a(android.content.Context, int, android.util.TypedValue, int, p.h.e.b.g, android.os.Handler, boolean):android.graphics.Typeface");
    }

    /* renamed from: a */
    public static C1327b m2472a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        Resources resources2 = resources;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String str = "font-family";
            xmlPullParser.require(2, null, str);
            if (xmlPullParser.getName().equals(str)) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C1308c.FontFamily);
                String string = obtainAttributes.getString(C1308c.FontFamily_fontProviderAuthority);
                String string2 = obtainAttributes.getString(C1308c.FontFamily_fontProviderPackage);
                String string3 = obtainAttributes.getString(C1308c.FontFamily_fontProviderQuery);
                int resourceId = obtainAttributes.getResourceId(C1308c.FontFamily_fontProviderCerts, 0);
                int integer = obtainAttributes.getInteger(C1308c.FontFamily_fontProviderFetchStrategy, 1);
                int integer2 = obtainAttributes.getInteger(C1308c.FontFamily_fontProviderFetchTimeout, 500);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if (xmlPullParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C1308c.FontFamilyFont);
                                int i = obtainAttributes2.getInt(obtainAttributes2.hasValue(C1308c.FontFamilyFont_fontWeight) ? C1308c.FontFamilyFont_fontWeight : C1308c.FontFamilyFont_android_fontWeight, 400);
                                boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(C1308c.FontFamilyFont_fontStyle) ? C1308c.FontFamilyFont_fontStyle : C1308c.FontFamilyFont_android_fontStyle, 0);
                                int i2 = obtainAttributes2.hasValue(C1308c.FontFamilyFont_ttcIndex) ? C1308c.FontFamilyFont_ttcIndex : C1308c.FontFamilyFont_android_ttcIndex;
                                String string4 = obtainAttributes2.getString(obtainAttributes2.hasValue(C1308c.FontFamilyFont_fontVariationSettings) ? C1308c.FontFamilyFont_fontVariationSettings : C1308c.FontFamilyFont_android_fontVariationSettings);
                                int i3 = obtainAttributes2.getInt(i2, 0);
                                int i4 = obtainAttributes2.hasValue(C1308c.FontFamilyFont_font) ? C1308c.FontFamilyFont_font : C1308c.FontFamilyFont_android_font;
                                int resourceId2 = obtainAttributes2.getResourceId(i4, 0);
                                String string5 = obtainAttributes2.getString(i4);
                                obtainAttributes2.recycle();
                                while (xmlPullParser.next() != 3) {
                                    m2503a(xmlPullParser);
                                }
                                C1329d dVar = new C1329d(string5, i, z, string4, i3, resourceId2);
                                arrayList.add(dVar);
                            } else {
                                m2503a(xmlPullParser);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    return new C1328c((C1329d[]) arrayList.toArray(new C1329d[arrayList.size()]));
                }
                while (xmlPullParser.next() != 3) {
                    m2503a(xmlPullParser);
                }
                return new C1330e(new C1354a(string, string2, string3, m2469a(resources2, resourceId)), integer, integer2);
            }
            m2503a(xmlPullParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: a */
    public static List<List<byte[]>> m2469a(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m2470a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m2470a(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m2463a(int i, TInput tinput, C1998c<TInput, TResult, TException> cVar, C2042a<TInput, TResult> aVar) {
        TResult a;
        if (i < 1) {
            return cVar.mo6991a(tinput);
        }
        do {
            a = cVar.mo6991a(tinput);
            TInput tinput2 = null;
            if (((C1999d) aVar) != null) {
                C2001a aVar2 = (C2001a) tinput;
                C2002b bVar = (C2002b) a;
                URL url = bVar.f5748b;
                if (url != null) {
                    m2499a("CctTransportBackend", "Following redirect to: %s", (Object) url);
                    tinput2 = new C2001a(bVar.f5748b, aVar2.f5745b, aVar2.f5746c);
                }
                tinput = tinput2;
                if (tinput == null) {
                    break;
                }
                i--;
            } else {
                throw null;
            }
        } while (i >= 1);
        return a;
    }

    /* renamed from: a */
    public static void m2502a(List<C1281f> list, int i, int i2) {
        int c;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            C1281f fVar = (C1281f) list.get(i3);
            HashSet<C1278d> hashSet = null;
            if (fVar != null) {
                if (i == 0) {
                    hashSet = fVar.f3790h;
                } else if (i == 1) {
                    hashSet = fVar.f3791i;
                }
                for (C1278d dVar : hashSet) {
                    if (dVar.f3725b0) {
                        int i4 = i * 2;
                        C1274c[] cVarArr = dVar.f3696A;
                        C1274c cVar = cVarArr[i4];
                        C1274c cVar2 = cVarArr[i4 + 1];
                        if ((cVar.f3672d == null || cVar2.f3672d == null) ? false : true) {
                            c = cVar.mo5674a() + m2440a(dVar, i);
                        } else if (dVar.f3702G == 0.0f || dVar.mo5688b(i) != C1279a.MATCH_CONSTRAINT) {
                            int i5 = i == 0 ? dVar.f3706K : i == 1 ? dVar.f3707L : 0;
                            int i6 = i2 - i5;
                            c = i6 - dVar.mo5693c(i);
                            dVar.mo5682a(c, i6, i);
                        } else {
                            int a = m2439a(dVar);
                            int i7 = (int) dVar.f3696A[i4].f3669a.f3807g;
                            int i8 = i7 + a;
                            C1285j jVar = cVar2.f3669a;
                            jVar.f3806f = cVar.f3669a;
                            jVar.f3807g = (float) a;
                            jVar.f3816b = 1;
                            dVar.mo5682a(i7, i8, i);
                        }
                        C1284i.m3322a(dVar, i, c);
                    }
                }
                i3++;
            } else {
                throw null;
            }
        }
    }

    /* renamed from: a */
    public static void m2494a(TextView textView, C1371b bVar) {
        if (VERSION.SDK_INT < 29) {
            m2473a(textView);
            if (bVar != null) {
                throw null;
            }
            throw null;
        } else if (bVar != null) {
            textView.setText(null);
        } else {
            throw null;
        }
    }

    /* renamed from: a */
    public static <TResult> void m2495a(Status status, TResult tresult, C3257j<TResult> jVar) {
        if (status.mo1523c()) {
            jVar.f8128a.mo8930a(tresult);
            return;
        }
        jVar.f8128a.mo8929a((Exception) new C2147b(status));
    }

    /* renamed from: a */
    public static void m2492a(View view, CharSequence charSequence) {
        if (VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        C1222x0 x0Var = C1222x0.f3485n;
        if (x0Var != null && x0Var.f3487e == view) {
            C1222x0.m3080a((C1222x0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C1222x0 x0Var2 = C1222x0.f3486o;
            if (x0Var2 != null && x0Var2.f3487e == view) {
                x0Var2.mo5397b();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new C1222x0(view, charSequence);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0185, code lost:
        if (r3.f3670b == r4) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x012c, code lost:
        if (r3.f3670b == r4) goto L_0x012e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01c9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m2516a(p124p.p144f.p145a.p146h.C1278d r9, p124p.p144f.p145a.p146h.C1281f r10, java.util.List<p124p.p144f.p145a.p146h.C1281f> r11, boolean r12) {
        /*
            r0 = 1
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            r9.f3727c0 = r1
            p.f.a.h.d r2 = r9.f3699D
            p.f.a.h.e r2 = (p124p.p144f.p145a.p146h.C1280e) r2
            p.f.a.h.f r3 = r9.f3746p
            if (r3 != 0) goto L_0x0204
            r9.f3725b0 = r0
            java.util.List<p.f.a.h.d> r3 = r10.f3783a
            r3.add(r9)
            r9.f3746p = r10
            p.f.a.h.c r3 = r9.f3749s
            p.f.a.h.c r3 = r3.f3672d
            if (r3 != 0) goto L_0x0045
            p.f.a.h.c r3 = r9.f3751u
            p.f.a.h.c r3 = r3.f3672d
            if (r3 != 0) goto L_0x0045
            p.f.a.h.c r3 = r9.f3750t
            p.f.a.h.c r3 = r3.f3672d
            if (r3 != 0) goto L_0x0045
            p.f.a.h.c r3 = r9.f3752v
            p.f.a.h.c r3 = r3.f3672d
            if (r3 != 0) goto L_0x0045
            p.f.a.h.c r3 = r9.f3753w
            p.f.a.h.c r3 = r3.f3672d
            if (r3 != 0) goto L_0x0045
            p.f.a.h.c r3 = r9.f3756z
            p.f.a.h.c r3 = r3.f3672d
            if (r3 != 0) goto L_0x0045
            r10.f3786d = r1
            r2.f3765D0 = r1
            r9.f3725b0 = r1
            if (r12 == 0) goto L_0x0045
            return r1
        L_0x0045:
            p.f.a.h.c r3 = r9.f3750t
            p.f.a.h.c r3 = r3.f3672d
            if (r3 == 0) goto L_0x0078
            p.f.a.h.c r3 = r9.f3752v
            p.f.a.h.c r3 = r3.f3672d
            if (r3 == 0) goto L_0x0078
            p.f.a.h.d$a r3 = r2.mo5704i()
            p.f.a.h.d$a r4 = p124p.p144f.p145a.p146h.C1278d.C1279a.WRAP_CONTENT
            if (r12 == 0) goto L_0x0060
            r10.f3786d = r1
            r2.f3765D0 = r1
            r9.f3725b0 = r1
            return r1
        L_0x0060:
            p.f.a.h.c r3 = r9.f3750t
            p.f.a.h.c r3 = r3.f3672d
            p.f.a.h.d r3 = r3.f3670b
            p.f.a.h.d r4 = r9.f3699D
            if (r3 != r4) goto L_0x0072
            p.f.a.h.c r3 = r9.f3752v
            p.f.a.h.c r3 = r3.f3672d
            p.f.a.h.d r3 = r3.f3670b
            if (r3 == r4) goto L_0x0078
        L_0x0072:
            r10.f3786d = r1
            r2.f3765D0 = r1
            r9.f3725b0 = r1
        L_0x0078:
            p.f.a.h.c r3 = r9.f3749s
            p.f.a.h.c r3 = r3.f3672d
            if (r3 == 0) goto L_0x00ab
            p.f.a.h.c r3 = r9.f3751u
            p.f.a.h.c r3 = r3.f3672d
            if (r3 == 0) goto L_0x00ab
            p.f.a.h.d$a r3 = r2.mo5698e()
            p.f.a.h.d$a r4 = p124p.p144f.p145a.p146h.C1278d.C1279a.WRAP_CONTENT
            if (r12 == 0) goto L_0x0093
            r10.f3786d = r1
            r2.f3765D0 = r1
            r9.f3725b0 = r1
            return r1
        L_0x0093:
            p.f.a.h.c r3 = r9.f3749s
            p.f.a.h.c r3 = r3.f3672d
            p.f.a.h.d r3 = r3.f3670b
            p.f.a.h.d r4 = r9.f3699D
            if (r3 != r4) goto L_0x00a5
            p.f.a.h.c r3 = r9.f3751u
            p.f.a.h.c r3 = r3.f3672d
            p.f.a.h.d r3 = r3.f3670b
            if (r3 == r4) goto L_0x00ab
        L_0x00a5:
            r10.f3786d = r1
            r2.f3765D0 = r1
            r9.f3725b0 = r1
        L_0x00ab:
            p.f.a.h.d$a r3 = r9.mo5698e()
            p.f.a.h.d$a r4 = p124p.p144f.p145a.p146h.C1278d.C1279a.MATCH_CONSTRAINT
            if (r3 != r4) goto L_0x00b5
            r3 = r0
            goto L_0x00b6
        L_0x00b5:
            r3 = r1
        L_0x00b6:
            p.f.a.h.d$a r4 = r9.mo5704i()
            p.f.a.h.d$a r5 = p124p.p144f.p145a.p146h.C1278d.C1279a.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x00c0
            r4 = r0
            goto L_0x00c1
        L_0x00c0:
            r4 = r1
        L_0x00c1:
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x00cf
            float r3 = r9.f3702G
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x00cf
            m2439a(r9)
            goto L_0x00e8
        L_0x00cf:
            p.f.a.h.d$a r3 = r9.mo5698e()
            p.f.a.h.d$a r4 = p124p.p144f.p145a.p146h.C1278d.C1279a.MATCH_CONSTRAINT
            if (r3 == r4) goto L_0x00df
            p.f.a.h.d$a r3 = r9.mo5704i()
            p.f.a.h.d$a r4 = p124p.p144f.p145a.p146h.C1278d.C1279a.MATCH_CONSTRAINT
            if (r3 != r4) goto L_0x00e8
        L_0x00df:
            r10.f3786d = r1
            r2.f3765D0 = r1
            r9.f3725b0 = r1
            if (r12 == 0) goto L_0x00e8
            return r1
        L_0x00e8:
            p.f.a.h.c r3 = r9.f3749s
            p.f.a.h.c r3 = r3.f3672d
            if (r3 != 0) goto L_0x00f4
            p.f.a.h.c r3 = r9.f3751u
            p.f.a.h.c r3 = r3.f3672d
            if (r3 == 0) goto L_0x012e
        L_0x00f4:
            p.f.a.h.c r3 = r9.f3749s
            p.f.a.h.c r3 = r3.f3672d
            if (r3 == 0) goto L_0x0106
            p.f.a.h.d r3 = r3.f3670b
            p.f.a.h.d r4 = r9.f3699D
            if (r3 != r4) goto L_0x0106
            p.f.a.h.c r3 = r9.f3751u
            p.f.a.h.c r3 = r3.f3672d
            if (r3 == 0) goto L_0x012e
        L_0x0106:
            p.f.a.h.c r3 = r9.f3751u
            p.f.a.h.c r3 = r3.f3672d
            if (r3 == 0) goto L_0x0118
            p.f.a.h.d r3 = r3.f3670b
            p.f.a.h.d r4 = r9.f3699D
            if (r3 != r4) goto L_0x0118
            p.f.a.h.c r3 = r9.f3749s
            p.f.a.h.c r3 = r3.f3672d
            if (r3 == 0) goto L_0x012e
        L_0x0118:
            p.f.a.h.c r3 = r9.f3749s
            p.f.a.h.c r3 = r3.f3672d
            if (r3 == 0) goto L_0x0141
            p.f.a.h.d r3 = r3.f3670b
            p.f.a.h.d r4 = r9.f3699D
            if (r3 != r4) goto L_0x0141
            p.f.a.h.c r3 = r9.f3751u
            p.f.a.h.c r3 = r3.f3672d
            if (r3 == 0) goto L_0x0141
            p.f.a.h.d r3 = r3.f3670b
            if (r3 != r4) goto L_0x0141
        L_0x012e:
            p.f.a.h.c r3 = r9.f3756z
            p.f.a.h.c r3 = r3.f3672d
            if (r3 != 0) goto L_0x0141
            boolean r3 = r9 instanceof p124p.p144f.p145a.p146h.C1282g
            if (r3 != 0) goto L_0x0141
            boolean r3 = r9 instanceof p124p.p144f.p145a.p146h.C1283h
            if (r3 != 0) goto L_0x0141
            java.util.List<p.f.a.h.d> r3 = r10.f3788f
            r3.add(r9)
        L_0x0141:
            p.f.a.h.c r3 = r9.f3750t
            p.f.a.h.c r3 = r3.f3672d
            if (r3 != 0) goto L_0x014d
            p.f.a.h.c r3 = r9.f3752v
            p.f.a.h.c r3 = r3.f3672d
            if (r3 == 0) goto L_0x0187
        L_0x014d:
            p.f.a.h.c r3 = r9.f3750t
            p.f.a.h.c r3 = r3.f3672d
            if (r3 == 0) goto L_0x015f
            p.f.a.h.d r3 = r3.f3670b
            p.f.a.h.d r4 = r9.f3699D
            if (r3 != r4) goto L_0x015f
            p.f.a.h.c r3 = r9.f3752v
            p.f.a.h.c r3 = r3.f3672d
            if (r3 == 0) goto L_0x0187
        L_0x015f:
            p.f.a.h.c r3 = r9.f3752v
            p.f.a.h.c r3 = r3.f3672d
            if (r3 == 0) goto L_0x0171
            p.f.a.h.d r3 = r3.f3670b
            p.f.a.h.d r4 = r9.f3699D
            if (r3 != r4) goto L_0x0171
            p.f.a.h.c r3 = r9.f3750t
            p.f.a.h.c r3 = r3.f3672d
            if (r3 == 0) goto L_0x0187
        L_0x0171:
            p.f.a.h.c r3 = r9.f3750t
            p.f.a.h.c r3 = r3.f3672d
            if (r3 == 0) goto L_0x01a0
            p.f.a.h.d r3 = r3.f3670b
            p.f.a.h.d r4 = r9.f3699D
            if (r3 != r4) goto L_0x01a0
            p.f.a.h.c r3 = r9.f3752v
            p.f.a.h.c r3 = r3.f3672d
            if (r3 == 0) goto L_0x01a0
            p.f.a.h.d r3 = r3.f3670b
            if (r3 != r4) goto L_0x01a0
        L_0x0187:
            p.f.a.h.c r3 = r9.f3756z
            p.f.a.h.c r3 = r3.f3672d
            if (r3 != 0) goto L_0x01a0
            p.f.a.h.c r3 = r9.f3753w
            p.f.a.h.c r3 = r3.f3672d
            if (r3 != 0) goto L_0x01a0
            boolean r3 = r9 instanceof p124p.p144f.p145a.p146h.C1282g
            if (r3 != 0) goto L_0x01a0
            boolean r3 = r9 instanceof p124p.p144f.p145a.p146h.C1283h
            if (r3 != 0) goto L_0x01a0
            java.util.List<p.f.a.h.d> r3 = r10.f3789g
            r3.add(r9)
        L_0x01a0:
            boolean r3 = r9 instanceof p124p.p144f.p145a.p146h.C1283h
            if (r3 == 0) goto L_0x01c3
            r10.f3786d = r1
            r2.f3765D0 = r1
            r9.f3725b0 = r1
            if (r12 == 0) goto L_0x01ad
            return r1
        L_0x01ad:
            r3 = r9
            p.f.a.h.h r3 = (p124p.p144f.p145a.p146h.C1283h) r3
            r4 = r1
        L_0x01b1:
            int r5 = r3.f3801l0
            if (r4 >= r5) goto L_0x01c3
            p.f.a.h.d[] r5 = r3.f3800k0
            r5 = r5[r4]
            boolean r5 = m2516a(r5, r10, r11, r12)
            if (r5 != 0) goto L_0x01c0
            return r1
        L_0x01c0:
            int r4 = r4 + 1
            goto L_0x01b1
        L_0x01c3:
            p.f.a.h.c[] r3 = r9.f3696A
            int r3 = r3.length
            r4 = r1
        L_0x01c7:
            if (r4 >= r3) goto L_0x0203
            p.f.a.h.c[] r5 = r9.f3696A
            r5 = r5[r4]
            p.f.a.h.c r6 = r5.f3672d
            if (r6 == 0) goto L_0x0200
            p.f.a.h.d r7 = r6.f3670b
            p.f.a.h.d r8 = r9.f3699D
            if (r7 == r8) goto L_0x0200
            p.f.a.h.c$c r7 = r5.f3671c
            p.f.a.h.c$c r8 = p124p.p144f.p145a.p146h.C1274c.C1277c.CENTER
            if (r7 != r8) goto L_0x01e6
            r10.f3786d = r1
            r2.f3765D0 = r1
            r9.f3725b0 = r1
            if (r12 == 0) goto L_0x01f5
            return r1
        L_0x01e6:
            p.f.a.h.j r7 = r5.f3669a
            if (r6 == 0) goto L_0x01f5
            p.f.a.h.c r8 = r6.f3672d
            if (r8 == r5) goto L_0x01f5
            p.f.a.h.j r6 = r6.f3669a
            java.util.HashSet<p.f.a.h.l> r6 = r6.f3815a
            r6.add(r7)
        L_0x01f5:
            p.f.a.h.c r5 = r5.f3672d
            p.f.a.h.d r5 = r5.f3670b
            boolean r5 = m2516a(r5, r10, r11, r12)
            if (r5 != 0) goto L_0x0200
            return r1
        L_0x0200:
            int r4 = r4 + 1
            goto L_0x01c7
        L_0x0203:
            return r0
        L_0x0204:
            if (r3 == r10) goto L_0x0243
            java.util.List<p.f.a.h.d> r12 = r10.f3783a
            java.util.List<p.f.a.h.d> r2 = r3.f3783a
            r12.addAll(r2)
            java.util.List<p.f.a.h.d> r12 = r10.f3788f
            p.f.a.h.f r2 = r9.f3746p
            java.util.List<p.f.a.h.d> r2 = r2.f3788f
            r12.addAll(r2)
            java.util.List<p.f.a.h.d> r12 = r10.f3789g
            p.f.a.h.f r2 = r9.f3746p
            java.util.List<p.f.a.h.d> r2 = r2.f3789g
            r12.addAll(r2)
            p.f.a.h.f r12 = r9.f3746p
            boolean r12 = r12.f3786d
            if (r12 != 0) goto L_0x0227
            r10.f3786d = r1
        L_0x0227:
            p.f.a.h.f r12 = r9.f3746p
            r11.remove(r12)
            p.f.a.h.f r9 = r9.f3746p
            java.util.List<p.f.a.h.d> r9 = r9.f3783a
            java.util.Iterator r9 = r9.iterator()
        L_0x0234:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0243
            java.lang.Object r11 = r9.next()
            p.f.a.h.d r11 = (p124p.p144f.p145a.p146h.C1278d) r11
            r11.f3746p = r10
            goto L_0x0234
        L_0x0243:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p127k.C1061o.m2516a(p.f.a.h.d, p.f.a.h.f, java.util.List, boolean):boolean");
    }
}
