package p213q.p217b.p218a.p231b.p239d.p246q;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewParent;
import com.google.crypto.tink.proto.EcPointFormat;
import com.google.crypto.tink.proto.EcdsaParams;
import com.google.crypto.tink.proto.EcdsaSignatureEncoding;
import com.google.crypto.tink.proto.EciesAeadHkdfParams;
import com.google.crypto.tink.proto.EllipticCurveType;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.RsaSsaPkcs1Params;
import com.google.crypto.tink.proto.RsaSsaPssParams;
import com.google.gson.Gson;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p003f.p004a.p005a.p108g.p109a.C0708g;
import p119o.p120a.C0915a0;
import p119o.p120a.C0916a1;
import p119o.p120a.C0922c0;
import p119o.p120a.C0924d;
import p119o.p120a.C0926d1;
import p119o.p120a.C0931f0;
import p119o.p120a.C0937g0;
import p119o.p120a.C0941h1;
import p119o.p120a.C0943i0;
import p119o.p120a.C0946j0;
import p119o.p120a.C0961n1;
import p119o.p120a.C0975s;
import p119o.p120a.C1006x;
import p119o.p120a.p121a.C0890a;
import p119o.p120a.p121a.C0897e;
import p124p.p126b.p127k.C1061o;
import p124p.p126b.p128l.p129a.C1070a;
import p124p.p126b.p136q.C1213u0;
import p124p.p150h.p154f.C1335a;
import p124p.p150h.p162l.C1404o;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.C2129i;
import p213q.p217b.p218a.p231b.p239d.C2130j;
import p213q.p217b.p218a.p231b.p239d.C2131k;
import p213q.p217b.p218a.p231b.p239d.p248r.C2293a;
import p213q.p217b.p218a.p231b.p239d.p248r.C2294b;
import p213q.p217b.p218a.p231b.p251g.p256e.C2362b5;
import p213q.p217b.p218a.p231b.p251g.p256e.C2387c9;
import p213q.p217b.p218a.p231b.p251g.p256e.C2435f5;
import p213q.p217b.p218a.p231b.p251g.p256e.C2455g8;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6;
import p213q.p217b.p218a.p231b.p251g.p256e.C2512j6;
import p213q.p217b.p218a.p231b.p251g.p256e.C2544l4;
import p213q.p217b.p218a.p231b.p251g.p256e.C2546l6;
import p213q.p217b.p218a.p231b.p251g.p256e.C2618p6;
import p213q.p217b.p218a.p231b.p251g.p256e.C2619p7;
import p213q.p217b.p218a.p231b.p251g.p256e.C2635q6;
import p213q.p217b.p218a.p231b.p251g.p256e.C2653r8;
import p213q.p217b.p218a.p231b.p251g.p256e.C2663s2;
import p213q.p217b.p218a.p231b.p251g.p256e.C2678t1;
import p213q.p217b.p218a.p231b.p251g.p256e.C2679t2;
import p213q.p217b.p218a.p231b.p251g.p256e.C2684t7;
import p213q.p217b.p218a.p231b.p251g.p256e.C2685t8;
import p213q.p217b.p218a.p231b.p251g.p256e.C2695u2;
import p213q.p217b.p218a.p231b.p251g.p256e.C2776z3;
import p213q.p217b.p218a.p231b.p251g.p257f.C2802d2;
import p213q.p217b.p218a.p231b.p259h.p261b.C2908b4;
import p213q.p217b.p218a.p231b.p259h.p261b.C3010ja;
import p213q.p217b.p218a.p231b.p262i.p263b.C3192b;
import p213q.p217b.p218a.p231b.p262i.p263b.C3192b.C3193a;
import p213q.p217b.p218a.p231b.p262i.p263b.C3192b.C3194b;
import p213q.p217b.p218a.p231b.p270l.C3243c;
import p213q.p217b.p218a.p231b.p270l.C3247e;
import p213q.p217b.p218a.p231b.p270l.C3249f;
import p213q.p217b.p218a.p231b.p270l.C3250f0;
import p213q.p217b.p218a.p231b.p270l.C3255i;
import p213q.p217b.p218a.p231b.p270l.C3258j0;
import p213q.p217b.p218a.p231b.p270l.C3259k;
import p213q.p217b.p218a.p231b.p270l.C3261l;
import p213q.p217b.p218a.p231b.p270l.C3262m;
import p213q.p217b.p218a.p231b.p270l.C3263n;
import p213q.p217b.p218a.p271c.p278g0.C3334d;
import p213q.p217b.p218a.p271c.p278g0.C3335e;
import p213q.p217b.p218a.p271c.p278g0.C3337g;
import p213q.p217b.p218a.p271c.p278g0.C3337g.C3339b;
import p213q.p217b.p218a.p271c.p278g0.C3341i;
import p213q.p217b.p218a.p271c.p293w.C3454c;
import p213q.p217b.p218a.p271c.p293w.C3454c.C3456b;
import p213q.p217b.p218a.p271c.p293w.C3454c.C3457c;
import p213q.p217b.p218a.p271c.p293w.C3454c.C3459e;
import p213q.p217b.p218a.p271c.p296y.C3495a;
import p213q.p217b.p301c.p302a.C3855z;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3591a0;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3603i;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3612e;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3623g;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3625g1;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3645j0;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3656k;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3680n1;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3681o;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3700r1;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3717u0;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3727x;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z;
import p213q.p217b.p301c.p302a.p315m0.C3778a0;
import p213q.p217b.p301c.p302a.p315m0.C3790c0;
import p213q.p217b.p301c.p302a.p315m0.C3838w;
import p213q.p217b.p301c.p302a.p315m0.C3839x;
import p213q.p217b.p301c.p302a.p315m0.C3840y;
import p213q.p217b.p317d.p321g.C3883c;
import p213q.p217b.p317d.p321g.C3884d;
import p213q.p217b.p317d.p321g.C3884d.C3886b;
import p213q.p217b.p317d.p321g.C3890h;
import p213q.p217b.p317d.p322h.p323e.p326k.C3965o0;
import p213q.p217b.p317d.p322h.p323e.p326k.C3968p0;
import p213q.p217b.p317d.p354p.C4312a;
import p213q.p217b.p317d.p354p.C4316e;
import p369s.p370a.p371a.p374b.C4445l;
import p369s.p370a.p371a.p376d.C4453a;
import p369s.p370a.p371a.p376d.C4455b;
import p369s.p370a.p371a.p376d.C4457d;
import p369s.p370a.p371a.p377e.C4459b;
import p369s.p370a.p371a.p377e.C4462e;
import p369s.p370a.p371a.p378f.p388h.C4535b;
import p392u.C4554g;
import p392u.C4554g.C4555a;
import p392u.C4557i;
import p392u.C4560l;
import p392u.p393n.C4562a;
import p392u.p393n.C4570i;
import p392u.p395p.C4580d;
import p392u.p395p.C4583f;
import p392u.p395p.C4587g;
import p392u.p395p.C4588h;
import p392u.p395p.p396j.C4591b;
import p392u.p395p.p396j.C4592c;
import p392u.p395p.p397k.p398a.C4593a;
import p392u.p399q.C4604b;
import p392u.p401r.p402b.C4607a;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p402b.C4622p;
import p392u.p401r.p403c.C4633c;
import p392u.p401r.p403c.C4638h;
import p392u.p406t.C4655c;
import p392u.p407u.C4658b;
import p392u.p408v.C4665a;
import p392u.p408v.C4669d;
import p392u.p408v.C4670e;
import p392u.p408v.C4672g;
import p425x.p482c.p483a.C5244a;

/* renamed from: q.b.a.b.d.q.e */
public final class C2286e {

    /* renamed from: a */
    public static Boolean f6252a;

    /* renamed from: b */
    public static Context f6253b;

    /* renamed from: c */
    public static Boolean f6254c;

    /* renamed from: d */
    public static C3010ja f6255d;

    /* renamed from: e */
    public static volatile C4459b<? super Throwable> f6256e;

    /* renamed from: a */
    public static double m5140a(byte[] bArr, int i) {
        return Double.longBitsToDouble(m5307c(bArr, i));
    }

    /* renamed from: a */
    public static float m5141a(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    /* renamed from: a */
    public static float m5142a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: a */
    public static final int m5143a(int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        StringBuilder a = C1965a.m4757a("radix ", i, " was not in valid range ");
        a.append(new C4655c(2, 36));
        throw new IllegalArgumentException(a.toString());
    }

    /* renamed from: a */
    public static final int m5144a(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    /* renamed from: a */
    public static int m5146a(int i, byte[] bArr, int i2, int i3, C2362b5 b5Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m5274b(bArr, i2, b5Var);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m5166a(bArr, i2, b5Var) + b5Var.f6329a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m5166a(bArr, i2, b5Var);
                    i6 = b5Var.f6329a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m5146a(i6, bArr, i2, i3, b5Var);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw C2618p6.m6294e();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw C2618p6.m6292c();
            }
        } else {
            throw C2618p6.m6292c();
        }
    }

    /* renamed from: a */
    public static int m5147a(int i, byte[] bArr, int i2, int i3, C2635q6<?> q6Var, C2362b5 b5Var) {
        C2512j6 j6Var = (C2512j6) q6Var;
        int a = m5166a(bArr, i2, b5Var);
        while (true) {
            j6Var.mo7797f(b5Var.f6329a);
            if (a >= i3) {
                break;
            }
            int a2 = m5166a(bArr, a, b5Var);
            if (i != b5Var.f6329a) {
                break;
            }
            a = m5166a(bArr, a2, b5Var);
        }
        return a;
    }

    /* renamed from: a */
    public static int m5148a(int i, byte[] bArr, int i2, int i3, C2685t8 t8Var, C2362b5 b5Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int b = m5274b(bArr, i2, b5Var);
                t8Var.mo8033a(i, Long.valueOf(b5Var.f6330b));
                return b;
            } else if (i4 == 1) {
                t8Var.mo8033a(i, Long.valueOf(m5343g(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int a = m5166a(bArr, i2, b5Var);
                int i5 = b5Var.f6329a;
                if (i5 < 0) {
                    throw C2618p6.m6291b();
                } else if (i5 <= bArr.length - a) {
                    t8Var.mo8033a(i, i5 == 0 ? C2435f5.f6525f : C2435f5.m5807a(bArr, a, i5));
                    return a + i5;
                } else {
                    throw C2618p6.m6290a();
                }
            } else if (i4 == 3) {
                C2685t8 b2 = C2685t8.m6439b();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a2 = m5166a(bArr, i2, b5Var);
                    int i8 = b5Var.f6329a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = a2;
                        break;
                    }
                    int a3 = m5148a(i7, bArr, a2, i3, b2, b5Var);
                    i7 = i8;
                    i2 = a3;
                }
                if (i2 > i3 || i7 != i6) {
                    throw C2618p6.m6294e();
                }
                t8Var.mo8033a(i, b2);
                return i2;
            } else if (i4 == 5) {
                t8Var.mo8033a(i, Integer.valueOf(m5336f(bArr, i2)));
                return i2 + 4;
            } else {
                throw C2618p6.m6292c();
            }
        } else {
            throw C2618p6.m6292c();
        }
    }

    /* renamed from: a */
    public static int m5149a(int i, byte[] bArr, int i2, int i3, C3603i<?> iVar, C3612e eVar) {
        C3591a0 a0Var = (C3591a0) iVar;
        int d = m5322d(bArr, i2, eVar);
        while (true) {
            a0Var.mo9517e(eVar.f8999a);
            if (d >= i3) {
                break;
            }
            int d2 = m5322d(bArr, d, eVar);
            if (i != eVar.f8999a) {
                break;
            }
            d = m5322d(bArr, d2, eVar);
        }
        return d;
    }

    /* renamed from: a */
    public static int m5150a(int i, byte[] bArr, int i2, int i3, C3612e eVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m5329e(bArr, i2, eVar);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m5322d(bArr, i2, eVar) + eVar.f8999a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m5322d(bArr, i2, eVar);
                    i6 = eVar.f8999a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m5150a(i6, bArr, i2, i3, eVar);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw C3606c0.m8180g();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw C3606c0.m8175b();
            }
        } else {
            throw C3606c0.m8175b();
        }
    }

    /* renamed from: a */
    public static int m5151a(int i, byte[] bArr, int i2, int i3, C3680n1 n1Var, C3612e eVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int e = m5329e(bArr, i2, eVar);
                n1Var.mo9859a(i, (Object) Long.valueOf(eVar.f9000b));
                return e;
            } else if (i4 == 1) {
                n1Var.mo9859a(i, (Object) Long.valueOf(m5307c(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int d = m5322d(bArr, i2, eVar);
                int i5 = eVar.f8999a;
                if (i5 < 0) {
                    throw C3606c0.m8179f();
                } else if (i5 <= bArr.length - d) {
                    n1Var.mo9859a(i, (Object) i5 == 0 ? C3635j.f9034f : C3635j.m8389a(bArr, d, i5));
                    return d + i5;
                } else {
                    throw C3606c0.m8181h();
                }
            } else if (i4 == 3) {
                C3680n1 c = C3680n1.m8772c();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int d2 = m5322d(bArr, i2, eVar);
                    int i8 = eVar.f8999a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = d2;
                        break;
                    }
                    int a = m5151a(i7, bArr, d2, i3, c, eVar);
                    i7 = i8;
                    i2 = a;
                }
                if (i2 > i3 || i7 != i6) {
                    throw C3606c0.m8180g();
                }
                n1Var.mo9859a(i, (Object) c);
                return i2;
            } else if (i4 == 5) {
                n1Var.mo9859a(i, (Object) Integer.valueOf(m5273b(bArr, i2)));
                return i2 + 4;
            } else {
                throw C3606c0.m8175b();
            }
        } else {
            throw C3606c0.m8175b();
        }
    }

    /* renamed from: a */
    public static int m5152a(int i, byte[] bArr, int i2, C2362b5 b5Var) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i4 = b << 7;
        } else {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                b5Var.f6329a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            b5Var.f6329a = i7 | i3;
            return i8;
        }
        b5Var.f6329a = i5 | i4;
        return i6;
    }

    /* renamed from: a */
    public static int m5153a(int i, byte[] bArr, int i2, C3612e eVar) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i4 = b << 7;
        } else {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] < 0) {
                                i8 = i10;
                            } else {
                                eVar.f8999a = i9;
                                return i10;
                            }
                        }
                    }
                }
            }
            eVar.f8999a = i7 | i3;
            return i8;
        }
        eVar.f8999a = i5 | i4;
        return i6;
    }

    /* renamed from: a */
    public static int m5154a(Context context, int i, int i2) {
        TypedValue b = m5278b(context, i);
        return b != null ? b.data : i2;
    }

    /* renamed from: a */
    public static int m5155a(Context context, int i, String str) {
        TypedValue b = m5278b(context, i);
        if (b != null) {
            return b.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    /* renamed from: a */
    public static final <T extends Comparable<?>> int m5157a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    /* renamed from: a */
    public static int m5159a(Set<?> set) {
        int i = 0;
        for (Object next : set) {
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* renamed from: a */
    public static int m5160a(C2455g8<?> g8Var, int i, byte[] bArr, int i2, int i3, C2635q6<?> q6Var, C2362b5 b5Var) {
        int a = m5162a((C2455g8) g8Var, bArr, i2, i3, b5Var);
        while (true) {
            q6Var.add(b5Var.f6331c);
            if (a >= i3) {
                break;
            }
            int a2 = m5166a(bArr, a, b5Var);
            if (i != b5Var.f6329a) {
                break;
            }
            a = m5162a((C2455g8) g8Var, bArr, a2, i3, b5Var);
        }
        return a;
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [int] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m5162a(p213q.p217b.p218a.p231b.p251g.p256e.C2455g8 r6, byte[] r7, int r8, int r9, p213q.p217b.p218a.p231b.p251g.p256e.C2362b5 r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m5152a(r8, r7, r0, r10)
            int r8 = r10.f6329a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo7679a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo7681a(r1, r2, r3, r4, r5)
            r6.mo7685c(r9)
            r10.f6331c = r9
            return r8
        L_0x0025:
            q.b.a.b.g.e.p6 r6 = p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6290a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5162a(q.b.a.b.g.e.g8, byte[], int, int, q.b.a.b.g.e.b5):int");
    }

    /* renamed from: a */
    public static int m5163a(C3625g1<?> g1Var, int i, byte[] bArr, int i2, int i3, C3603i<?> iVar, C3612e eVar) {
        int a = m5165a((C3625g1) g1Var, bArr, i2, i3, eVar);
        while (true) {
            iVar.add(eVar.f9001c);
            if (a >= i3) {
                break;
            }
            int d = m5322d(bArr, a, eVar);
            if (i != eVar.f8999a) {
                break;
            }
            a = m5165a((C3625g1) g1Var, bArr, d, i3, eVar);
        }
        return a;
    }

    /* renamed from: a */
    public static int m5164a(C3625g1 g1Var, byte[] bArr, int i, int i2, int i3, C3612e eVar) {
        C3717u0 u0Var = (C3717u0) g1Var;
        Object a = u0Var.mo9642a();
        int a2 = u0Var.mo9935a(a, bArr, i, i2, i3, eVar);
        u0Var.mo9643a(a);
        eVar.f9001c = a;
        return a2;
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [int] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m5165a(p213q.p217b.p301c.p302a.p311j0.p312a.C3625g1 r6, byte[] r7, int r8, int r9, p213q.p217b.p301c.p302a.p311j0.p312a.C3612e r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m5153a(r8, r7, r0, r10)
            int r8 = r10.f8999a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo9642a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo9647a(r1, r2, r3, r4, r5)
            r6.mo9643a(r9)
            r10.f9001c = r9
            return r8
        L_0x0025:
            q.b.c.a.j0.a.c0 r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0.m8181h()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5165a(q.b.c.a.j0.a.g1, byte[], int, int, q.b.c.a.j0.a.e):int");
    }

    /* renamed from: a */
    public static int m5166a(byte[] bArr, int i, C2362b5 b5Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m5152a((int) b, bArr, i2, b5Var);
        }
        b5Var.f6329a = b;
        return i2;
    }

    /* renamed from: a */
    public static int m5167a(byte[] bArr, int i, C2635q6<?> q6Var, C2362b5 b5Var) {
        C2512j6 j6Var = (C2512j6) q6Var;
        int a = m5166a(bArr, i, b5Var);
        int i2 = b5Var.f6329a + a;
        while (a < i2) {
            a = m5166a(bArr, a, b5Var);
            j6Var.mo7797f(b5Var.f6329a);
        }
        if (a == i2) {
            return a;
        }
        throw C2618p6.m6290a();
    }

    /* renamed from: a */
    public static int m5168a(byte[] bArr, int i, C3603i<?> iVar, C3612e eVar) {
        C3623g gVar = (C3623g) iVar;
        int d = m5322d(bArr, i, eVar);
        int i2 = eVar.f8999a + d;
        while (d < i2) {
            d = m5329e(bArr, d, eVar);
            gVar.mo9624a(eVar.f9000b != 0);
        }
        if (d == i2) {
            return d;
        }
        throw C3606c0.m8181h();
    }

    /* renamed from: a */
    public static int m5169a(byte[] bArr, int i, C3612e eVar) {
        int d = m5322d(bArr, i, eVar);
        int i2 = eVar.f8999a;
        if (i2 < 0) {
            throw C3606c0.m8179f();
        } else if (i2 > bArr.length - d) {
            throw C3606c0.m8181h();
        } else if (i2 == 0) {
            eVar.f9001c = C3635j.f9034f;
            return d;
        } else {
            eVar.f9001c = C3635j.m8389a(bArr, d, i2);
            return d + i2;
        }
    }

    /* renamed from: a */
    public static long m5171a(byte[] bArr, int i, int i2) {
        return (m5330e(bArr, i) >> i2) & 67108863;
    }

    /* renamed from: a */
    public static Animator m5172a(C3454c cVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, C3457c.f8809a, C3456b.f8807b, new C3459e[]{new C3459e(f, f2, f3)});
        C3459e revealInfo = cVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f, (int) f2, revealInfo.f8813c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* renamed from: a */
    public static ColorStateList m5173a(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = C1070a.m2601a(context, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return typedArray.getColorStateList(i);
    }

    /* renamed from: a */
    public static Mode m5175a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    public static PorterDuffColorFilter m5176a(Drawable drawable, ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    /* renamed from: a */
    public static <T> T m5178a(Bundle bundle, String str, Class<T> cls, T t) {
        T t2 = bundle.get(str);
        if (t2 == null) {
            return t;
        }
        if (cls.isAssignableFrom(t2.getClass())) {
            return t2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, cls.getCanonicalName(), t2.getClass().getCanonicalName()}));
    }

    /* renamed from: a */
    public static <T> T m5179a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: a */
    public static Object m5180a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    /* renamed from: a */
    public static <T> T m5181a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static <T> T m5182a(T t, String str, Object obj) {
        if (t != null) {
            return t;
        }
        String str2 = "%s";
        if (!str.contains(str2)) {
            throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
        } else if (str.indexOf(str2) == str.lastIndexOf(str2)) {
            throw new NullPointerException(str.replace(str2, obj instanceof Class ? ((Class) obj).getCanonicalName() : String.valueOf(obj)));
        } else {
            throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
        }
    }

    /* renamed from: a */
    public static final <T> Object m5183a(Object obj, C4580d<? super T> dVar) {
        return obj instanceof C0975s ? m5184a(((C0975s) obj).f2591a) : obj;
    }

    /* renamed from: a */
    public static <V> V m5185a(C2678t1<V> t1Var) {
        long clearCallingIdentity;
        try {
            return t1Var.mo7963a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a = t1Var.mo7963a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    /* renamed from: a */
    public static String m5188a(int i, int i2, @NullableDecl String str) {
        if (i < 0) {
            return m5190a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return m5190a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static String m5191a(String str, String[] strArr, String[] strArr2) {
        C1061o.m2524b(strArr);
        C1061o.m2524b(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            boolean z = (str == null && str2 == null) ? true : str == null ? false : str.equals(str2);
            if (z) {
                return strArr2[i];
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m5195a(C3790c0 c0Var) {
        int ordinal = c0Var.ordinal();
        if (ordinal == 0) {
            return "SHA-1";
        }
        if (ordinal == 1) {
            return "SHA-256";
        }
        if (ordinal == 2) {
            return "SHA-384";
        }
        if (ordinal == 3) {
            return "SHA-512";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported hash ");
        sb.append(c0Var);
        throw new GeneralSecurityException(sb.toString());
    }

    /* renamed from: a */
    public static ECPrivateKey m5198a(C3838w wVar, byte[] bArr) {
        return (ECPrivateKey) ((KeyFactory) C3778a0.f9328k.mo10023a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), m5287b(wVar)));
    }

    /* renamed from: a */
    public static ECPublicKey m5199a(C3838w wVar, byte[] bArr, byte[] bArr2) {
        ECParameterSpec b = m5287b(wVar);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        m5242a(eCPoint, b.getCurve());
        return (ECPublicKey) ((KeyFactory) C3778a0.f9328k.mo10023a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, b));
    }

    /* renamed from: a */
    public static ECParameterSpec m5200a(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    /* renamed from: a */
    public static Calendar m5201a(Calendar calendar) {
        Calendar b = m5289b(calendar);
        Calendar c = m5311c();
        c.set(b.get(1), b.get(2), b.get(5));
        return c;
    }

    /* renamed from: a */
    public static Set<String> m5205a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery(C1965a.m4745a(C1965a.m4743a(str, 22), "SELECT * FROM ", str, " LIMIT 0"), null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    /* renamed from: a */
    public static TimeZone m5206a() {
        return TimeZone.getTimeZone("UTC");
    }

    /* renamed from: a */
    public static <T> C2663s2<T> m5208a(C2663s2<T> s2Var) {
        return ((s2Var instanceof C2679t2) || (s2Var instanceof C2695u2)) ? s2Var : s2Var instanceof Serializable ? new C2695u2(s2Var) : new C2679t2(s2Var);
    }

    /* renamed from: a */
    public static C3255i<Void> m5210a(Collection<? extends C3255i<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return m5291b((TResult) null);
        }
        for (C3255i iVar : collection) {
            if (iVar == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        C3250f0 f0Var = new C3250f0();
        C3263n nVar = new C3263n(collection.size(), f0Var);
        for (C3255i a : collection) {
            m5247a(a, (C3261l) nVar);
        }
        return f0Var;
    }

    /* renamed from: a */
    public static <TResult> C3255i<TResult> m5211a(Executor executor, Callable<TResult> callable) {
        C1061o.m2525b(executor, (Object) "Executor must not be null");
        C1061o.m2525b(callable, (Object) "Callback must not be null");
        C3250f0 f0Var = new C3250f0();
        executor.execute(new C3258j0(f0Var, callable));
        return f0Var;
    }

    /* renamed from: a */
    public static C3790c0 m5212a(HashType hashType) {
        int ordinal = hashType.ordinal();
        if (ordinal == 2) {
            return C3790c0.SHA384;
        }
        if (ordinal == 3) {
            return C3790c0.SHA256;
        }
        if (ordinal == 4) {
            return C3790c0.SHA512;
        }
        StringBuilder a = C1965a.m4756a("unsupported hash type: ");
        a.append(hashType.name());
        throw new GeneralSecurityException(a.toString());
    }

    /* renamed from: a */
    public static C3838w m5213a(EllipticCurveType ellipticCurveType) {
        int ordinal = ellipticCurveType.ordinal();
        if (ordinal == 1) {
            return C3838w.NIST_P256;
        }
        if (ordinal == 2) {
            return C3838w.NIST_P384;
        }
        if (ordinal == 3) {
            return C3838w.NIST_P521;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unknown curve type: ");
        sb.append(ellipticCurveType);
        throw new GeneralSecurityException(sb.toString());
    }

    /* renamed from: a */
    public static C3839x m5214a(EcdsaSignatureEncoding ecdsaSignatureEncoding) {
        int ordinal = ecdsaSignatureEncoding.ordinal();
        if (ordinal == 1) {
            return C3839x.IEEE_P1363;
        }
        if (ordinal == 2) {
            return C3839x.DER;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unknown ECDSA encoding: ");
        sb.append(ecdsaSignatureEncoding);
        throw new GeneralSecurityException(sb.toString());
    }

    /* renamed from: a */
    public static C3840y m5215a(EcPointFormat ecPointFormat) {
        int ordinal = ecPointFormat.ordinal();
        if (ordinal == 1) {
            return C3840y.UNCOMPRESSED;
        }
        if (ordinal == 2) {
            return C3840y.COMPRESSED;
        }
        if (ordinal == 3) {
            return C3840y.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unknown point format: ");
        sb.append(ecPointFormat);
        throw new GeneralSecurityException(sb.toString());
    }

    /* renamed from: a */
    public static C4445l m5217a(C4462e<C4445l> eVar) {
        try {
            return (C4445l) Objects.requireNonNull(eVar.get(), "Scheduler Supplier result can't be null");
        } catch (Throwable th) {
            throw C4535b.m10204a(th);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m5223a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!m5326d(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m5326d(b3) && !m5326d(b4)) {
                byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((b5 >>> 10) + 55232);
                cArr[i + 1] = (char) ((b5 & 1023) + 56320);
                return;
            }
        }
        throw C3606c0.m8176c();
    }

    /* renamed from: a */
    public static void m5226a(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m5188a(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m5188a(i2, i3, "end index");
            } else {
                str = m5190a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: a */
    public static void m5227a(AnimatorSet animatorSet, List<Animator> list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    /* renamed from: a */
    public static void m5228a(Bundle bundle, Object obj) {
        String str = "value";
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else {
            bundle.putString(str, obj.toString());
        }
    }

    /* renamed from: a */
    public static void m5231a(EcdsaParams ecdsaParams) {
        EcdsaSignatureEncoding encoding = ecdsaParams.getEncoding();
        HashType hashType = ecdsaParams.getHashType();
        EllipticCurveType curve = ecdsaParams.getCurve();
        int ordinal = encoding.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            int ordinal2 = curve.ordinal();
            String str = "Invalid ECDSA parameters";
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    if (ordinal2 != 3) {
                        throw new GeneralSecurityException(str);
                    } else if (hashType != HashType.SHA512) {
                        throw new GeneralSecurityException(str);
                    }
                } else if (hashType != HashType.SHA384 && hashType != HashType.SHA512) {
                    throw new GeneralSecurityException(str);
                }
            } else if (hashType != HashType.SHA256) {
                throw new GeneralSecurityException(str);
            }
        } else {
            throw new GeneralSecurityException("unsupported signature encoding");
        }
    }

    /* renamed from: a */
    public static void m5232a(EciesAeadHkdfParams eciesAeadHkdfParams) {
        m5287b(m5213a(eciesAeadHkdfParams.getKemParams().getCurveType()));
        m5282b(eciesAeadHkdfParams.getKemParams().getHkdfHashType());
        if (eciesAeadHkdfParams.getEcPointFormat() != EcPointFormat.UNKNOWN_FORMAT) {
            C3855z.m9224b(eciesAeadHkdfParams.getDemParams().getAeadDem());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    /* renamed from: a */
    public static void m5233a(RsaSsaPkcs1Params rsaSsaPkcs1Params) {
        m5212a(rsaSsaPkcs1Params.getHashType());
    }

    /* renamed from: a */
    public static void m5234a(RsaSsaPssParams rsaSsaPssParams) {
        m5212a(rsaSsaPssParams.getSigHash());
        if (rsaSsaPssParams.getSigHash() != rsaSsaPssParams.getMgf1Hash()) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
    }

    /* renamed from: a */
    public static final void m5235a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                m5240a(th, th2);
            }
        }
    }

    /* renamed from: a */
    public static <T> void m5237a(T t, Class<T> cls) {
        if (t == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getCanonicalName());
            sb.append(" must be set");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m5238a(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(valueOf);
            throw new NullPointerException(sb.toString());
        } else if (obj2 == null) {
            String valueOf2 = String.valueOf(obj);
            throw new NullPointerException(C1965a.m4745a(valueOf2.length() + 26, "null value in entry: ", valueOf2, "=null"));
        }
    }

    /* renamed from: a */
    public static final void m5241a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    /* renamed from: a */
    public static void m5247a(C3255i<?> iVar, C3261l lVar) {
        iVar.mo8926a(C3259k.f8132b, (C3249f<? super TResult>) lVar);
        iVar.mo8925a(C3259k.f8132b, (C3247e) lVar);
        iVar.mo8923a(C3259k.f8132b, (C3243c) lVar);
    }

    /* renamed from: a */
    public static void m5251a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m5252a(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m5253a(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) ((int) (255 & j));
            i2++;
            j >>= 8;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m5256a(byte b) {
        return b >= 0;
    }

    /* renamed from: a */
    public static final boolean m5257a(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* renamed from: a */
    public static final boolean m5258a(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        return Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    /* renamed from: a */
    public static synchronized boolean m5259a(Context context) {
        Boolean valueOf;
        synchronized (C2286e.class) {
            Context applicationContext = context.getApplicationContext();
            if (f6253b == null || f6254c == null || f6253b != applicationContext) {
                f6254c = null;
                if (m5333e()) {
                    valueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f6254c = Boolean.valueOf(true);
                    } catch (ClassNotFoundException unused) {
                        valueOf = Boolean.valueOf(false);
                    }
                    f6253b = applicationContext;
                    boolean booleanValue = f6254c.booleanValue();
                    return booleanValue;
                }
                f6254c = valueOf;
                f6253b = applicationContext;
                boolean booleanValue2 = f6254c.booleanValue();
                return booleanValue2;
            }
            boolean booleanValue3 = f6254c.booleanValue();
            return booleanValue3;
        }
    }

    /* renamed from: a */
    public static boolean m5261a(Context context, int i, boolean z) {
        TypedValue b = m5278b(context, i);
        return (b == null || b.type != 18) ? z : b.data != 0;
    }

    /* renamed from: a */
    public static boolean m5262a(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static byte[] m5265a(BigInteger bigInteger, int i) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i) {
            return byteArray;
        }
        int i2 = i + 1;
        String str = "integer too large";
        if (byteArray.length > i2) {
            throw new GeneralSecurityException(str);
        } else if (byteArray.length != i2) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, 0, bArr, i - byteArray.length, byteArray.length);
            return bArr;
        } else if (byteArray[0] == 0) {
            return Arrays.copyOfRange(byteArray, 1, byteArray.length);
        } else {
            throw new GeneralSecurityException(str);
        }
    }

    /* renamed from: a */
    public static byte[] m5266a(byte[] bArr) {
        if (bArr.length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr, 16);
            copyOf[bArr.length] = Byte.MIN_VALUE;
            return copyOf;
        }
        throw new IllegalArgumentException("x must be smaller than a block.");
    }

    /* renamed from: a */
    public static byte[] m5267a(byte[] bArr, int i, C3790c0 c0Var) {
        MessageDigest messageDigest = (MessageDigest) C3778a0.f9326i.mo10023a(m5195a(c0Var));
        int digestLength = messageDigest.getDigestLength();
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 <= (i - 1) / digestLength; i3++) {
            messageDigest.reset();
            messageDigest.update(bArr);
            messageDigest.update(m5265a(BigInteger.valueOf((long) i3), 4));
            byte[] digest = messageDigest.digest();
            System.arraycopy(digest, 0, bArr2, i2, Math.min(digest.length, i - i2));
            i2 += digest.length;
        }
        return bArr2;
    }

    /* renamed from: a */
    public static final byte[] m5268a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i3 < 0 || bArr.length - i3 < i || bArr2.length - i3 < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
        }
        return bArr3;
    }

    /* renamed from: a */
    public static byte[] m5270a(byte[]... bArr) {
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte[] bArr2 = bArr[i];
            if (i2 <= Integer.MAX_VALUE - bArr2.length) {
                i2 += bArr2.length;
                i++;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr3 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i3, bArr4.length);
            i3 += bArr4.length;
        }
        return bArr3;
    }

    /* renamed from: b */
    public static int m5272b(int i, int i2) {
        String str;
        if (i >= 0 && i < i2) {
            return i;
        }
        String str2 = "index";
        if (i < 0) {
            str = m5190a("%s (%s) must not be negative", str2, Integer.valueOf(i));
        } else if (i2 < 0) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            str = m5190a("%s (%s) must be less than size (%s)", str2, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str);
    }

    /* renamed from: b */
    public static int m5273b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: b */
    public static int m5274b(byte[] bArr, int i, C2362b5 b5Var) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            b5Var.f6330b = j;
            return i2;
        }
        long j2 = j & 127;
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j3 = j2 | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j3 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        b5Var.f6330b = j3;
        return i3;
    }

    /* renamed from: b */
    public static int m5275b(byte[] bArr, int i, C3603i<?> iVar, C3612e eVar) {
        C3681o oVar = (C3681o) iVar;
        int d = m5322d(bArr, i, eVar);
        int i2 = eVar.f8999a + d;
        while (d < i2) {
            oVar.mo9865a(m5140a(bArr, d));
            d += 8;
        }
        if (d == i2) {
            return d;
        }
        throw C3606c0.m8181h();
    }

    /* renamed from: b */
    public static int m5276b(byte[] bArr, int i, C3612e eVar) {
        int d = m5322d(bArr, i, eVar);
        int i2 = eVar.f8999a;
        if (i2 < 0) {
            throw C3606c0.m8179f();
        } else if (i2 == 0) {
            eVar.f9001c = p116io.jsonwebtoken.lang.Objects.EMPTY_STRING;
            return d;
        } else {
            eVar.f9001c = new String(bArr, d, i2, C3594b0.f8972a);
            return d + i2;
        }
    }

    /* renamed from: b */
    public static Drawable m5277b(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                Drawable b = C1070a.m2602b(context, resourceId);
                if (b != null) {
                    return b;
                }
            }
        }
        return typedArray.getDrawable(i);
    }

    /* renamed from: b */
    public static TypedValue m5278b(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static <T> T m5279b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    @NullableDecl
    /* renamed from: b */
    public static <T> Object m5280b(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* renamed from: b */
    public static String m5282b(HashType hashType) {
        int ordinal = hashType.ordinal();
        if (ordinal == 1) {
            return "HmacSha1";
        }
        if (ordinal == 3) {
            return "HmacSha256";
        }
        if (ordinal == 4) {
            return "HmacSha512";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("hash unsupported for HMAC: ");
        sb.append(hashType);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    /* renamed from: b */
    public static final String m5283b(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static final String m5286b(C4580d<?> dVar) {
        Object obj;
        if (dVar instanceof C0931f0) {
            return dVar.toString();
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(dVar);
            sb.append('@');
            sb.append(m5323d((Object) dVar));
            obj = sb.toString();
            C4554g.m10210a(obj);
        } catch (Throwable th) {
            obj = m5184a(th);
        }
        if (C4554g.m10211b(obj) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(dVar.getClass().getName());
            sb2.append('@');
            sb2.append(m5323d((Object) dVar));
            obj = sb2.toString();
        }
        return (String) obj;
    }

    /* renamed from: b */
    public static Calendar m5288b() {
        return m5201a(Calendar.getInstance());
    }

    /* renamed from: b */
    public static Calendar m5289b(Calendar calendar) {
        Calendar instance = Calendar.getInstance(m5206a());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    /* renamed from: b */
    public static <TResult> C3255i<TResult> m5291b(TResult tresult) {
        C3250f0 f0Var = new C3250f0();
        f0Var.mo8930a(tresult);
        return f0Var;
    }

    /* renamed from: b */
    public static C3334d m5292b(int i) {
        if (i == 0) {
            return new C3341i();
        }
        if (i != 1) {
            return new C3341i();
        }
        return new C3335e();
    }

    /* renamed from: b */
    public static C3838w m5293b(EllipticCurveType ellipticCurveType) {
        int ordinal = ellipticCurveType.ordinal();
        if (ordinal == 1) {
            return C3838w.NIST_P256;
        }
        if (ordinal == 2) {
            return C3838w.NIST_P384;
        }
        if (ordinal == 3) {
            return C3838w.NIST_P521;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unknown curve type: ");
        sb.append(ellipticCurveType);
        throw new GeneralSecurityException(sb.toString());
    }

    /* renamed from: b */
    public static final void m5297b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m5297b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Entry b2 : ((Map) obj).entrySet()) {
                m5297b(sb, i, str, (Object) b2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            String str2 = ": \"";
            if (obj instanceof String) {
                sb.append(str2);
                sb.append(m5193a(C2435f5.m5806a((String) obj)));
                sb.append('\"');
            } else if (obj instanceof C2435f5) {
                sb.append(str2);
                sb.append(m5193a((C2435f5) obj));
                sb.append('\"');
            } else {
                boolean z = obj instanceof C2490i6;
                String str3 = p116io.jsonwebtoken.lang.Objects.ARRAY_END;
                String str4 = "\n";
                String str5 = " {";
                if (z) {
                    sb.append(str5);
                    m5244a((C2619p7) (C2490i6) obj, sb, i + 2);
                    sb.append(str4);
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                    sb.append(str3);
                } else if (obj instanceof Entry) {
                    sb.append(str5);
                    Entry entry = (Entry) obj;
                    int i4 = i + 2;
                    m5297b(sb, i4, "key", entry.getKey());
                    m5297b(sb, i4, "value", entry.getValue());
                    sb.append(str4);
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                    sb.append(str3);
                } else {
                    sb.append(": ");
                    sb.append(obj.toString());
                }
            }
        }
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m5299b(byte b) {
        return b < -32;
    }

    /* renamed from: b */
    public static final boolean m5301b(byte[] bArr, byte[] bArr2) {
        boolean z = false;
        if (!(bArr == null || bArr2 == null)) {
            if (bArr.length != bArr2.length) {
                return false;
            }
            byte b = 0;
            for (int i = 0; i < bArr.length; i++) {
                b |= bArr[i] ^ bArr2[i];
            }
            if (b == 0) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public static byte[] m5302b(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i = 0; i < 16; i++) {
                bArr2[i] = (byte) ((bArr[i] << 1) & 254);
                if (i < 15) {
                    bArr2[i] = (byte) (bArr2[i] | ((byte) ((bArr[i + 1] >> 7) & 1)));
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }

    /* renamed from: c */
    public static int m5303c(int i, int i2) {
        if (i2 <= 1073741823) {
            return Math.min(Math.max(i, i2), 1073741823);
        }
        throw new IllegalArgumentException(m5190a("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i2), Integer.valueOf(1073741823)));
    }

    /* renamed from: c */
    public static int m5304c(byte[] bArr, int i, C2362b5 b5Var) {
        int a = m5166a(bArr, i, b5Var);
        int i2 = b5Var.f6329a;
        if (i2 < 0) {
            throw C2618p6.m6291b();
        } else if (i2 == 0) {
            b5Var.f6331c = p116io.jsonwebtoken.lang.Objects.EMPTY_STRING;
            return a;
        } else {
            b5Var.f6331c = new String(bArr, a, i2, C2546l6.f6704a);
            return a + i2;
        }
    }

    /* renamed from: c */
    public static int m5305c(byte[] bArr, int i, C3603i<?> iVar, C3612e eVar) {
        C3591a0 a0Var = (C3591a0) iVar;
        int d = m5322d(bArr, i, eVar);
        int i2 = eVar.f8999a + d;
        while (d < i2) {
            a0Var.mo9517e(m5273b(bArr, d));
            d += 4;
        }
        if (d == i2) {
            return d;
        }
        throw C3606c0.m8181h();
    }

    /* renamed from: c */
    public static int m5306c(byte[] bArr, int i, C3612e eVar) {
        int d = m5322d(bArr, i, eVar);
        int i2 = eVar.f8999a;
        if (i2 < 0) {
            throw C3606c0.m8179f();
        } else if (i2 == 0) {
            eVar.f9001c = p116io.jsonwebtoken.lang.Objects.EMPTY_STRING;
            return d;
        } else {
            eVar.f9001c = C3700r1.m8887b(bArr, d, i2);
            return d + i2;
        }
    }

    /* renamed from: c */
    public static long m5307c(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: c */
    public static String m5308c(HashType hashType) {
        int ordinal = hashType.ordinal();
        if (ordinal == 1) {
            return "HmacSha1";
        }
        if (ordinal == 3) {
            return "HmacSha256";
        }
        if (ordinal == 4) {
            return "HmacSha512";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("hash unsupported for HMAC: ");
        sb.append(hashType);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    /* renamed from: c */
    public static final String m5309c(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: c */
    public static String m5310c(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            byte b2 = b & 255;
            String str = "0123456789abcdef";
            sb.append(str.charAt(b2 / 16));
            sb.append(str.charAt(b2 % 16));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static Calendar m5311c() {
        return m5289b((Calendar) null);
    }

    /* renamed from: c */
    public static void m5312c(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m5313c(byte b) {
        return b < -16;
    }

    /* renamed from: c */
    public static final boolean m5314c(int i) {
        return i == 1;
    }

    /* renamed from: c */
    public static byte[] m5315c(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                int digit = Character.digit(str.charAt(i2), 16);
                int digit2 = Character.digit(str.charAt(i2 + 1), 16);
                if (digit == -1 || digit2 == -1) {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
                bArr[i] = (byte) ((digit * 16) + digit2);
            }
            return bArr;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }

    /* renamed from: c */
    public static final byte[] m5316c(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return m5268a(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    /* renamed from: d */
    public static float m5317d(byte[] bArr, int i) {
        return Float.intBitsToFloat(m5273b(bArr, i));
    }

    /* renamed from: d */
    public static final int m5318d(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: d */
    public static int m5319d(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m5188a(i, i2, "index"));
    }

    /* renamed from: d */
    public static int m5320d(byte[] bArr, int i, C2362b5 b5Var) {
        int a = m5166a(bArr, i, b5Var);
        int i2 = b5Var.f6329a;
        if (i2 < 0) {
            throw C2618p6.m6291b();
        } else if (i2 == 0) {
            b5Var.f6331c = p116io.jsonwebtoken.lang.Objects.EMPTY_STRING;
            return a;
        } else {
            b5Var.f6331c = C2387c9.f6419a.mo7543a(bArr, a, i2);
            return a + i2;
        }
    }

    /* renamed from: d */
    public static int m5321d(byte[] bArr, int i, C3603i<?> iVar, C3612e eVar) {
        C3645j0 j0Var = (C3645j0) iVar;
        int d = m5322d(bArr, i, eVar);
        int i2 = eVar.f8999a + d;
        while (d < i2) {
            j0Var.mo9679a(m5307c(bArr, d));
            d += 8;
        }
        if (d == i2) {
            return d;
        }
        throw C3606c0.m8181h();
    }

    /* renamed from: d */
    public static int m5322d(byte[] bArr, int i, C3612e eVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m5153a((int) b, bArr, i2, eVar);
        }
        eVar.f8999a = b;
        return i2;
    }

    /* renamed from: d */
    public static final String m5323d(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: d */
    public static final String m5324d(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static boolean m5325d() {
        try {
            Class.forName("android.app.Application", false, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m5326d(byte b) {
        return b > -65;
    }

    /* renamed from: e */
    public static int m5327e(byte[] bArr, int i, C2362b5 b5Var) {
        int a = m5166a(bArr, i, b5Var);
        int i2 = b5Var.f6329a;
        if (i2 < 0) {
            throw C2618p6.m6291b();
        } else if (i2 > bArr.length - a) {
            throw C2618p6.m6290a();
        } else if (i2 == 0) {
            b5Var.f6331c = C2435f5.f6525f;
            return a;
        } else {
            b5Var.f6331c = C2435f5.m5807a(bArr, a, i2);
            return a + i2;
        }
    }

    /* renamed from: e */
    public static int m5328e(byte[] bArr, int i, C3603i<?> iVar, C3612e eVar) {
        C3727x xVar = (C3727x) iVar;
        int d = m5322d(bArr, i, eVar);
        int i2 = eVar.f8999a + d;
        while (d < i2) {
            xVar.mo9983a(m5317d(bArr, d));
            d += 4;
        }
        if (d == i2) {
            return d;
        }
        throw C3606c0.m8181h();
    }

    /* renamed from: e */
    public static int m5329e(byte[] bArr, int i, C3612e eVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            eVar.f9000b = j;
            return i2;
        }
        long j2 = j & 127;
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j3 = j2 | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j3 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        eVar.f9000b = j3;
        return i3;
    }

    /* renamed from: e */
    public static long m5330e(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    /* renamed from: e */
    public static <K, V> LinkedHashMap<K, V> m5331e(int i) {
        int i2 = i < 3 ? i + 1 : i < 1073741824 ? (int) ((((float) i) / 0.75f) + 1.0f) : Integer.MAX_VALUE;
        return new LinkedHashMap<>(i2);
    }

    /* renamed from: e */
    public static final <T> List<T> m5332e(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C4638h.m10270a((Object) singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    /* renamed from: e */
    public static boolean m5333e() {
        return VERSION.SDK_INT >= 26;
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m5334e(byte b) {
        return b >= 0;
    }

    /* renamed from: f */
    public static int m5335f(int i) {
        if (i >= 200 && i <= 299) {
            return 0;
        }
        if (i < 300 || i > 399) {
            return (i < 400 || i > 499) ? 1 : 0;
        }
        return 1;
    }

    /* renamed from: f */
    public static int m5336f(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: f */
    public static int m5337f(byte[] bArr, int i, C3603i<?> iVar, C3612e eVar) {
        C3591a0 a0Var = (C3591a0) iVar;
        int d = m5322d(bArr, i, eVar);
        int i2 = eVar.f8999a + d;
        while (d < i2) {
            d = m5322d(bArr, d, eVar);
            a0Var.mo9517e(C3656k.m8448e(eVar.f8999a));
        }
        if (d == i2) {
            return d;
        }
        throw C3606c0.m8181h();
    }

    /* renamed from: f */
    public static final void m5338f() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* renamed from: f */
    public static final void m5339f(Object obj) {
        if (obj instanceof C4555a) {
            throw ((C4555a) obj).f10768e;
        }
    }

    /* renamed from: f */
    public static boolean m5340f(byte b) {
        return b > -65;
    }

    /* renamed from: g */
    public static int m5341g(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }

    /* renamed from: g */
    public static int m5342g(byte[] bArr, int i, C3603i<?> iVar, C3612e eVar) {
        C3645j0 j0Var = (C3645j0) iVar;
        int d = m5322d(bArr, i, eVar);
        int i2 = eVar.f8999a + d;
        while (d < i2) {
            d = m5329e(bArr, d, eVar);
            j0Var.mo9679a(C3656k.m8444a(eVar.f9000b));
        }
        if (d == i2) {
            return d;
        }
        throw C3606c0.m8181h();
    }

    /* renamed from: g */
    public static long m5343g(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: g */
    public static final String m5344g(Object obj) {
        if (obj == null) {
            return p116io.jsonwebtoken.lang.Objects.EMPTY_STRING;
        }
        String a = new Gson().mo3078a(obj);
        C4638h.m10270a((Object) a, "Gson().toJson(this)");
        return a;
    }

    /* renamed from: h */
    public static double m5345h(byte[] bArr, int i) {
        return Double.longBitsToDouble(m5343g(bArr, i));
    }

    /* renamed from: h */
    public static int m5346h(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: h */
    public static int m5347h(byte[] bArr, int i, C3603i<?> iVar, C3612e eVar) {
        C3591a0 a0Var = (C3591a0) iVar;
        int d = m5322d(bArr, i, eVar);
        int i2 = eVar.f8999a + d;
        while (d < i2) {
            d = m5322d(bArr, d, eVar);
            a0Var.mo9517e(eVar.f8999a);
        }
        if (d == i2) {
            return d;
        }
        throw C3606c0.m8181h();
    }

    /* renamed from: h */
    public static final <T> Object m5348h(Object obj) {
        Throwable b = C4554g.m10211b(obj);
        return b == null ? obj : new C0975s(b, false, 2);
    }

    /* renamed from: i */
    public static float m5349i(byte[] bArr, int i) {
        return Float.intBitsToFloat(m5336f(bArr, i));
    }

    /* renamed from: i */
    public static int m5350i(@NullableDecl Object obj) {
        return m5346h(obj == null ? 0 : obj.hashCode());
    }

    /* renamed from: i */
    public static int m5351i(byte[] bArr, int i, C3603i<?> iVar, C3612e eVar) {
        C3645j0 j0Var = (C3645j0) iVar;
        int d = m5322d(bArr, i, eVar);
        int i2 = eVar.f8999a + d;
        while (d < i2) {
            d = m5329e(bArr, d, eVar);
            j0Var.mo9679a(eVar.f9000b);
        }
        if (d == i2) {
            return d;
        }
        throw C3606c0.m8181h();
    }

    @NonNullDecl
    /* renamed from: j */
    public static <T> T m5352j(@NonNullDecl T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: a */
    public static /* synthetic */ void m5225a(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m5326d(b2)) {
            throw C3606c0.m8176c();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: a */
    public static /* synthetic */ void m5224a(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (m5326d(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m5326d(b3)))) {
            throw C3606c0.m8176c();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* renamed from: b */
    public static final String m5284b(String str, String str2) {
        if (str2 != null) {
            if (str != null) {
                if (!(str.length() == 0)) {
                    return str;
                }
            }
            return str2;
        }
        C4638h.m10271a("default");
        throw null;
    }

    /* renamed from: a */
    public static final <T> boolean m5263a(Collection<? super T> collection, Iterable<? extends T> iterable) {
        if (collection == null) {
            C4638h.m10271a("$this$addAll");
            throw null;
        } else if (iterable == null) {
            C4638h.m10271a("elements");
            throw null;
        } else if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        } else {
            boolean z = false;
            for (Object add : iterable) {
                if (collection.add(add)) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* renamed from: b */
    public static ECParameterSpec m5287b(C3838w wVar) {
        int ordinal = wVar.ordinal();
        if (ordinal == 0) {
            return m5200a("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
        }
        if (ordinal == 1) {
            return m5200a("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
        }
        if (ordinal == 2) {
            return m5200a("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("curve not implemented:");
        sb.append(wVar);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    /* renamed from: a */
    public static final void m5240a(Throwable th, Throwable th2) {
        if (th == null) {
            C4638h.m10271a("$this$addSuppressed");
            throw null;
        } else if (th2 != null) {
            C4604b.f10817a.mo10925a(th, th2);
        } else {
            C4638h.m10271a("exception");
            throw null;
        }
    }

    /* renamed from: a */
    public static final <T> void m5236a(Appendable appendable, T t, C4618l<? super T, ? extends CharSequence> lVar) {
        CharSequence valueOf;
        if (appendable != null) {
            if (lVar != null) {
                t = lVar.mo3153b(t);
            } else {
                if (!(t != null ? t instanceof CharSequence : true)) {
                    if (t instanceof Character) {
                        appendable.append(((Character) t).charValue());
                        return;
                    }
                    valueOf = String.valueOf(t);
                    appendable.append(valueOf);
                    return;
                }
            }
            valueOf = (CharSequence) t;
            appendable.append(valueOf);
            return;
        }
        C4638h.m10271a("$this$appendElement");
        throw null;
    }

    /* renamed from: a */
    public static final <T> List<T> m5204a(T[] tArr) {
        if (tArr != null) {
            List<T> asList = Arrays.asList(tArr);
            C4638h.m10270a((Object) asList, "ArraysUtilJVM.asList(this)");
            return asList;
        }
        C4638h.m10271a("$this$asList");
        throw null;
    }

    /* renamed from: b */
    public static void m5298b(Throwable th) {
        C4459b<? super Throwable> bVar = f6256e;
        if (th == null) {
            th = C4535b.m10203a("onError called with a null Throwable.");
        } else {
            boolean z = true;
            if (!(th instanceof C4455b) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof C4453a)) {
                z = false;
            }
            if (!z) {
                th = new C4457d(th);
            }
        }
        if (bVar != null) {
            try {
                bVar.mo3749a(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
            }
        }
        th.printStackTrace();
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    /* renamed from: a */
    public static final <T> C4669d<T> m5221a(Iterator<? extends T> it) {
        if (it != null) {
            C4670e eVar = new C4670e(it);
            return eVar instanceof C4665a ? eVar : new C4665a(eVar);
        }
        C4638h.m10271a("$this$asSequence");
        throw null;
    }

    /* renamed from: a */
    public static final <T> void m5250a(C4618l<? super T, C4560l> lVar, C4618l<? super Throwable, C4560l> lVar2, C4607a<? extends C5244a<? extends Throwable, ? extends T>> aVar) {
        if (lVar == null) {
            C4638h.m10271a("onSuccess");
            throw null;
        } else if (lVar2 == null) {
            C4638h.m10271a("onError");
            throw null;
        } else if (aVar != null) {
            C4583f a = C0946j0.m2119a();
            if (a.get(C0916a1.f2512d) == null) {
                a = a.plus(new C0926d1(null));
            }
            C0897e eVar = new C0897e(a);
            C0708g gVar = new C0708g(aVar, lVar, lVar2, null);
            C4588h hVar = C4588h.f10792e;
            C0922c0 c0Var = C0922c0.DEFAULT;
            C4583f a2 = C1006x.m2303a(eVar, hVar);
            if (c0Var != null) {
                C0924d h1Var = c0Var == C0922c0.LAZY ? new C0941h1(a2, gVar) : new C0961n1(a2, true);
                h1Var.mo4218a(c0Var, h1Var, gVar);
                return;
            }
            throw null;
        } else {
            C4638h.m10271a("body");
            throw null;
        }
    }

    /* renamed from: b */
    public static final <T> List<T> m5290b(T[] tArr) {
        if (tArr != null) {
            return new ArrayList(new C4562a(tArr, false));
        }
        C4638h.m10271a("$this$toMutableList");
        throw null;
    }

    /* renamed from: b */
    public static final String m5285b(Date date) {
        if (date != null) {
            String format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS z", Locale.getDefault()).format(date);
            C4638h.m10270a((Object) format, "SimpleDateFormat(DATE_FO…etDefault()).format(this)");
            return format;
        }
        C4638h.m10271a("$this$toTimeStamp");
        throw null;
    }

    @TargetApi(19)
    /* renamed from: b */
    public static boolean m5300b(Context context, int i, String str) {
        C2293a b = C2294b.m5363b(context);
        if (b != null) {
            try {
                ((AppOpsManager) b.f6270a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            throw null;
        }
    }

    /* renamed from: b */
    public static <TResult> TResult m5281b(C3255i<TResult> iVar) {
        if (iVar.mo8936d()) {
            return iVar.mo8931b();
        }
        if (((C3250f0) iVar).f8123d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(iVar.mo8920a());
    }

    /* renamed from: b */
    public static /* synthetic */ void m5294b(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!m5340f(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m5340f(b3) && !m5340f(b4)) {
                byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((b5 >>> 10) + 55232);
                cArr[i + 1] = (char) ((b5 & 1023) + 56320);
                return;
            }
        }
        throw C2618p6.m6295f();
    }

    /* renamed from: b */
    public static /* synthetic */ void m5295b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (m5340f(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m5340f(b3)))) {
            throw C2618p6.m6295f();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* renamed from: a */
    public static <TResult> TResult m5186a(C3255i<TResult> iVar) {
        C1061o.m2544c("Must not be called on the main application thread");
        C1061o.m2525b(iVar, (Object) "Task must not be null");
        if (iVar.mo8935c()) {
            return m5281b(iVar);
        }
        C3262m mVar = new C3262m(null);
        m5247a(iVar, (C3261l) mVar);
        mVar.f8134a.await();
        return m5281b(iVar);
    }

    /* renamed from: b */
    public static /* synthetic */ void m5296b(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m5340f(b2)) {
            throw C2618p6.m6295f();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: a */
    public static <TResult> TResult m5187a(C3255i<TResult> iVar, long j, TimeUnit timeUnit) {
        C1061o.m2544c("Must not be called on the main application thread");
        C1061o.m2525b(iVar, (Object) "Task must not be null");
        C1061o.m2525b(timeUnit, (Object) "TimeUnit must not be null");
        if (iVar.mo8935c()) {
            return m5281b(iVar);
        }
        C3262m mVar = new C3262m(null);
        m5247a(iVar, (C3261l) mVar);
        if (mVar.f8134a.await(j, timeUnit)) {
            return m5281b(iVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: a */
    public static ExecutorService m5207a(String str) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new C3965o0(str, new AtomicLong(1)));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Runtime runtime = Runtime.getRuntime();
        C3968p0 p0Var = new C3968p0(str, newSingleThreadExecutor, 2, timeUnit);
        runtime.addShutdownHook(new Thread(p0Var, C1965a.m4751a("Crashlytics Shutdown Hook for ", str)));
        return newSingleThreadExecutor;
    }

    /* renamed from: a */
    public static void m5242a(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            BigInteger p = ((ECFieldFp) field).getP();
            BigInteger affineX = eCPoint.getAffineX();
            BigInteger affineY = eCPoint.getAffineY();
            if (affineX == null || affineY == null) {
                throw new GeneralSecurityException("point is at infinity");
            } else if (affineX.signum() == -1 || affineX.compareTo(p) >= 0) {
                throw new GeneralSecurityException("x is out of range");
            } else if (affineY.signum() == -1 || affineY.compareTo(p) >= 0) {
                throw new GeneralSecurityException("y is out of range");
            } else if (!affineY.multiply(affineY).mod(p).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(p))) {
                throw new GeneralSecurityException("Point is not on curve");
            }
        } else {
            throw new GeneralSecurityException("Only curves over prime order fields are supported");
        }
    }

    /* renamed from: a */
    public static final <T> int m5158a(Iterable<? extends T> iterable, int i) {
        if (iterable != null) {
            return iterable instanceof Collection ? ((Collection) iterable).size() : i;
        }
        C4638h.m10271a("$this$collectionSizeOrDefault");
        throw null;
    }

    /* renamed from: a */
    public static byte[] m5269a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            long a = m5171a(bArr3, 0, 0) & 67108863;
            int i = 2;
            long a2 = m5171a(bArr3, 3, 2) & 67108611;
            long a3 = m5171a(bArr3, 6, 4) & 67092735;
            long a4 = m5171a(bArr3, 9, 6) & 66076671;
            long a5 = m5171a(bArr3, 12, 8) & 1048575;
            long j = a2 * 5;
            long j2 = a3 * 5;
            long j3 = a4 * 5;
            long j4 = a5 * 5;
            int i2 = 17;
            byte[] bArr5 = new byte[17];
            long j5 = 0;
            int i3 = 0;
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            while (i3 < bArr4.length) {
                int min = Math.min(16, bArr4.length - i3);
                System.arraycopy(bArr4, i3, bArr5, 0, min);
                bArr5[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr5, min + 1, i2, 0);
                }
                long a6 = m5171a(bArr5, 0, 0) + j9;
                long a7 = m5171a(bArr5, 3, i) + j5;
                long a8 = m5171a(bArr5, 6, 4) + j6;
                long a9 = m5171a(bArr5, 9, 6) + j7;
                long a10 = j8 + (m5171a(bArr5, 12, 8) | ((long) (bArr5[16] << 24)));
                long j10 = (a10 * j) + (a9 * j2) + (a8 * j3) + (a7 * j4) + (a6 * a);
                long j11 = (a10 * j2) + (a9 * j3) + (a8 * j4) + (a7 * a) + (a6 * a2);
                long j12 = (a10 * j3) + (a9 * j4) + (a8 * a) + (a7 * a2) + (a6 * a3);
                long j13 = (a9 * a) + (a8 * a2) + (a7 * a3) + (a6 * a4);
                long j14 = a8 * a3;
                long j15 = a9 * a2;
                long j16 = a10 * a;
                long j17 = j16 + j15 + j14 + (a7 * a4) + (a6 * a5);
                long j18 = j11 + (j10 >> 26);
                long j19 = j12 + (j18 >> 26);
                long j20 = (a10 * j4) + j13 + (j19 >> 26);
                long j21 = j17 + (j20 >> 26);
                long j22 = j21 >> 26;
                j8 = j21 & 67108863;
                long j23 = (j22 * 5) + (j10 & 67108863);
                long j24 = (j18 & 67108863) + (j23 >> 26);
                i3 += 16;
                j6 = j19 & 67108863;
                j7 = j20 & 67108863;
                i2 = 17;
                i = 2;
                j9 = j23 & 67108863;
                j5 = j24;
            }
            long j25 = j6 + (j5 >> 26);
            long j26 = j25 & 67108863;
            long j27 = j7 + (j25 >> 26);
            long j28 = j27 & 67108863;
            long j29 = j8 + (j27 >> 26);
            long j30 = j29 & 67108863;
            long j31 = ((j29 >> 26) * 5) + j9;
            long j32 = j31 >> 26;
            long j33 = j31 & 67108863;
            long j34 = (j5 & 67108863) + j32;
            long j35 = j33 + 5;
            long j36 = j35 & 67108863;
            long j37 = (j35 >> 26) + j34;
            long j38 = j26 + (j37 >> 26);
            long j39 = j38 >> 26;
            long j40 = j38 & 67108863;
            long j41 = j28 + j39;
            long j42 = j41 & 67108863;
            long j43 = (j30 + (j41 >> 26)) - 67108864;
            long j44 = j37 & 67108863;
            long j45 = j43 >> 63;
            long j46 = j33 & j45;
            long j47 = j34 & j45;
            long j48 = j26 & j45;
            long j49 = j28 & j45;
            long j50 = j30 & j45;
            long j51 = ~j45;
            long j52 = j47 | (j44 & j51);
            long j53 = j48 | (j40 & j51);
            long j54 = j49 | (j42 & j51);
            long j55 = (j46 | (j36 & j51) | (j52 << 26)) & 4294967295L;
            long j56 = ((j52 >> 6) | (j53 << 20)) & 4294967295L;
            long j57 = ((j53 >> 12) | (j54 << 14)) & 4294967295L;
            long j58 = ((j54 >> 18) | ((j50 | (j43 & j51)) << 8)) & 4294967295L;
            long e = m5330e(bArr3, 16) + j55;
            long e2 = m5330e(bArr3, 20) + j56 + (e >> 32);
            long j59 = e2 & 4294967295L;
            long e3 = m5330e(bArr3, 24) + j57 + (e2 >> 32);
            long j60 = e3 & 4294967295L;
            long e4 = (m5330e(bArr3, 28) + j58 + (e3 >> 32)) & 4294967295L;
            byte[] bArr6 = new byte[16];
            m5253a(bArr6, e & 4294967295L, 0);
            m5253a(bArr6, j59, 4);
            m5253a(bArr6, j60, 8);
            m5253a(bArr6, e4, 12);
            return bArr6;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }

    /* renamed from: a */
    public static /* synthetic */ Object[] m5271a(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        if (objArr == null) {
            C4638h.m10271a("$this$copyInto");
            throw null;
        } else if (objArr2 != null) {
            System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
            return objArr2;
        } else {
            C4638h.m10271a("destination");
            throw null;
        }
    }

    /* renamed from: a */
    public static C3884d<?> m5216a(String str, String str2) {
        C4312a aVar = new C4312a(str, str2);
        C3886b a = C3884d.m9271a(C4316e.class);
        a.f9509d = 1;
        a.mo10080a((C3890h<T>) new C3883c<T>(aVar));
        return a.mo10082a();
    }

    /* renamed from: a */
    public static final <R, T> C4580d<C4560l> m5219a(C4622p<? super R, ? super C4580d<? super T>, ? extends Object> pVar, R r, C4580d<? super T> dVar) {
        if (pVar == null) {
            C4638h.m10271a("$this$createCoroutineUnintercepted");
            throw null;
        } else if (dVar == null) {
            C4638h.m10271a("completion");
            throw null;
        } else if (pVar instanceof C4593a) {
            return ((C4593a) pVar).mo3782a(r, dVar);
        } else {
            C4583f b = dVar.mo4219b();
            if (b == C4588h.f10792e) {
                return new C4591b(dVar, dVar, pVar, r);
            }
            C4592c cVar = new C4592c(dVar, b, dVar, b, pVar, r);
            return cVar;
        }
    }

    /* renamed from: a */
    public static final Object m5184a(Throwable th) {
        if (th != null) {
            return new C4555a(th);
        }
        C4638h.m10271a("exception");
        throw null;
    }

    /* renamed from: a */
    public static String m5194a(C3635j jVar) {
        String str;
        StringBuilder sb = new StringBuilder(jVar.size());
        for (int i = 0; i < jVar.size(); i++) {
            int e = jVar.mo9664e(i);
            if (e == 34) {
                str = "\\\"";
            } else if (e == 39) {
                str = "\\'";
            } else if (e != 92) {
                switch (e) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (e < 32 || e > 126) {
                            sb.append('\\');
                            sb.append((char) (((e >>> 6) & 3) + 48));
                            sb.append((char) (((e >>> 3) & 7) + 48));
                            e = (e & 7) + 48;
                        }
                        sb.append((char) e);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static /* synthetic */ void m5254a(Object[] objArr, Object obj, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        if (objArr != null) {
            Arrays.fill(objArr, i, i2, obj);
        } else {
            C4638h.m10271a("$this$fill");
            throw null;
        }
    }

    /* renamed from: a */
    public static final String m5192a(Date date) {
        if (date != null) {
            String format = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(date);
            C4638h.m10270a((Object) format, "SimpleDateFormat(DATE_FO…etDefault()).format(this)");
            return format;
        }
        C4638h.m10271a("$this$format");
        throw null;
    }

    /* renamed from: a */
    public static KeyPair m5197a(C3838w wVar) {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) C3778a0.f9327j.mo10023a("EC");
        keyPairGenerator.initialize(m5287b(wVar));
        return keyPairGenerator.generateKeyPair();
    }

    /* renamed from: a */
    public static int m5156a(View view, int i) {
        return m5155a(view.getContext(), i, view.getClass().getCanonicalName());
    }

    /* renamed from: a */
    public static ColorStateList m5174a(Context context, C1213u0 u0Var, int i) {
        if (u0Var.f3426b.hasValue(i)) {
            int resourceId = u0Var.f3426b.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = C1070a.m2601a(context, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return u0Var.mo5314a(i);
    }

    /* renamed from: a */
    public static final <T> Class<T> m5177a(C4658b<T> bVar) {
        if (bVar != null) {
            Class a = ((C4633c) bVar).mo10931a();
            if (!a.isPrimitive()) {
                return a;
            }
            String name = a.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        a = Double.class;
                        break;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        a = Integer.class;
                        break;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        a = Byte.class;
                        break;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        a = Character.class;
                        break;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        a = Long.class;
                        break;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        a = Void.class;
                        break;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        a = Boolean.class;
                        break;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        a = Float.class;
                        break;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        a = Short.class;
                        break;
                    }
                    break;
            }
            return a;
        }
        C4638h.m10271a("$this$javaObjectType");
        throw null;
    }

    /* renamed from: a */
    public static final void m5249a(C4583f fVar, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) fVar.get(CoroutineExceptionHandler.f2460c);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(fVar, th);
            } else {
                C0915a0.m2011a(fVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                Throwable runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                m5240a(runtimeException, th);
                th = runtimeException;
            }
            C0915a0.m2011a(fVar, th);
        }
    }

    /* renamed from: a */
    public static final <T> int m5170a(T[] tArr, T t) {
        if (tArr != null) {
            int i = 0;
            if (t == null) {
                int length = tArr.length;
                while (i < length) {
                    if (tArr[i] == null) {
                        return i;
                    }
                    i++;
                }
            } else {
                int length2 = tArr.length;
                while (i < length2) {
                    if (C4638h.m10272a((Object) t, (Object) tArr[i])) {
                        return i;
                    }
                    i++;
                }
            }
            return -1;
        }
        C4638h.m10271a("$this$indexOf");
        throw null;
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r2v2, types: [u.p.d<T>] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r2 != 0) goto L_0x0028;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=u.p.d<? super T>, code=u.p.d, for r2v0, types: [u.p.d<? super T>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> p392u.p395p.C4580d<T> m5218a(p392u.p395p.C4580d r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x002b
            boolean r1 = r2 instanceof p392u.p395p.p397k.p398a.C4595c
            if (r1 != 0) goto L_0x0008
            goto L_0x0009
        L_0x0008:
            r0 = r2
        L_0x0009:
            u.p.k.a.c r0 = (p392u.p395p.p397k.p398a.C4595c) r0
            if (r0 == 0) goto L_0x002a
            u.p.d<java.lang.Object> r2 = r0.f10807f
            if (r2 == 0) goto L_0x0012
            goto L_0x002a
        L_0x0012:
            u.p.f r2 = r0.mo4219b()
            u.p.e$a r1 = p392u.p395p.C4581e.f10789b
            u.p.f$a r2 = r2.get(r1)
            u.p.e r2 = (p392u.p395p.C4581e) r2
            if (r2 == 0) goto L_0x0027
            u.p.d r2 = r2.mo4366b(r0)
            if (r2 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r2 = r0
        L_0x0028:
            r0.f10807f = r2
        L_0x002a:
            return r2
        L_0x002b:
            java.lang.String r2 = "$this$intercepted"
            p392u.p401r.p403c.C4638h.m10271a(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5218a(u.p.d):u.p.d");
    }

    /* renamed from: a */
    public static boolean m5260a(Context context, int i) {
        String str = "com.google.android.gms";
        boolean z = false;
        if (!m5300b(context, i, str)) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            C2130j a = C2130j.m4929a(context);
            if (a != null) {
                if (packageInfo != null) {
                    if (!C2130j.m4931a(packageInfo, false)) {
                        if (C2130j.m4931a(packageInfo, true)) {
                            if (!C2129i.m4928c(a.f6005a)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    z = true;
                }
                return z;
            }
            throw null;
        } catch (NameNotFoundException unused) {
            String str2 = "UidVerifier";
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ String m5196a(C4669d dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C4618l lVar, int i2) {
        if ((i2 & 1) != 0) {
            charSequence = p116io.jsonwebtoken.lang.Objects.ARRAY_ELEMENT_SEPARATOR;
        }
        int i3 = i2 & 2;
        CharSequence charSequence5 = p116io.jsonwebtoken.lang.Objects.EMPTY_STRING;
        if (i3 != 0) {
            charSequence2 = charSequence5;
        }
        if ((i2 & 4) != 0) {
            charSequence3 = charSequence5;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        if (dVar == null) {
            C4638h.m10271a("$this$joinToString");
            throw null;
        } else if (charSequence == null) {
            C4638h.m10271a("separator");
            throw null;
        } else if (charSequence2 == null) {
            C4638h.m10271a("prefix");
            throw null;
        } else if (charSequence3 == null) {
            C4638h.m10271a("postfix");
            throw null;
        } else if (charSequence4 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence2);
            int i4 = 0;
            for (Object next : dVar) {
                i4++;
                if (i4 > 1) {
                    sb.append(charSequence);
                }
                if (i >= 0 && i4 > i) {
                    break;
                }
                m5236a((Appendable) sb, (T) next, lVar);
            }
            if (i >= 0 && i4 > i) {
                sb.append(charSequence4);
            }
            sb.append(charSequence3);
            String sb2 = sb.toString();
            C4638h.m10270a((Object) sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
            return sb2;
        } else {
            C4638h.m10271a("truncated");
            throw null;
        }
    }

    /* renamed from: a */
    public static int m5145a(int i, int i2, float f) {
        return C1335a.m3387a(C1335a.m3389b(i2, Math.round(((float) Color.alpha(i2)) * f)), i);
    }

    /* renamed from: a */
    public static final <T, R> C4669d<R> m5222a(C4669d<? extends T> dVar, C4618l<? super T, ? extends R> lVar) {
        if (dVar == null) {
            C4638h.m10271a("$this$map");
            throw null;
        } else if (lVar != null) {
            return new C4672g(dVar, lVar);
        } else {
            C4638h.m10271a("transform");
            throw null;
        }
    }

    /* renamed from: a */
    public static final <T> List<T> m5202a(List<? extends T> list) {
        if (list != null) {
            int size = list.size();
            if (size != 0) {
                return size != 1 ? list : m5332e((T) list.get(0));
            }
            return C4570i.f10779e;
        }
        C4638h.m10271a("$this$optimizeReadOnlyList");
        throw null;
    }

    /* renamed from: a */
    public static C4583f m5220a(C4583f fVar, C4583f fVar2) {
        if (fVar2 != null) {
            return fVar2 == C4588h.f10792e ? fVar : (C4583f) fVar2.fold(fVar, C4587g.f10791f);
        }
        C4638h.m10271a("context");
        throw null;
    }

    /* renamed from: a */
    public static final void m5239a(StringBuilder sb, int i, String str, Object obj) {
        String a;
        if (obj instanceof List) {
            for (Object a2 : (List) obj) {
                m5239a(sb, i, str, a2);
            }
        } else if (obj instanceof Map) {
            for (Entry a3 : ((Map) obj).entrySet()) {
                m5239a(sb, i, str, (Object) a3);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            String str2 = ": \"";
            if (obj instanceof String) {
                sb.append(str2);
                a = m5194a(C3635j.m8387a((String) obj));
            } else if (obj instanceof C3635j) {
                sb.append(str2);
                a = m5194a((C3635j) obj);
            } else {
                boolean z = obj instanceof C3731z;
                String str3 = p116io.jsonwebtoken.lang.Objects.ARRAY_END;
                String str4 = "\n";
                String str5 = " {";
                if (z) {
                    sb.append(str5);
                    m5248a((C3706s0) (C3731z) obj, sb, i + 2);
                    sb.append(str4);
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else if (obj instanceof Entry) {
                    sb.append(str5);
                    Entry entry = (Entry) obj;
                    int i4 = i + 2;
                    m5239a(sb, i4, "key", entry.getKey());
                    m5239a(sb, i4, "value", entry.getValue());
                    sb.append(str4);
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else {
                    sb.append(": ");
                    sb.append(obj.toString());
                }
                sb.append(str3);
            }
            sb.append(a);
            sb.append('\"');
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01cb, code lost:
        if (((java.lang.Integer) r4).intValue() == 0) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01dc, code lost:
        if (((java.lang.Float) r4).floatValue() == 0.0f) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ee, code lost:
        if (((java.lang.Double) r4).doubleValue() == 0.0d) goto L_0x021e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m5248a(p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0 r13, java.lang.StringBuilder r14, int r15) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>()
            java.lang.Class r3 = r13.getClass()
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            int r4 = r3.length
            r5 = 0
            r6 = r5
        L_0x001a:
            java.lang.String r7 = "get"
            if (r6 >= r4) goto L_0x0049
            r8 = r3[r6]
            java.lang.String r9 = r8.getName()
            r1.put(r9, r8)
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r9 = r9.length
            if (r9 != 0) goto L_0x0046
            java.lang.String r9 = r8.getName()
            r0.put(r9, r8)
            java.lang.String r9 = r8.getName()
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto L_0x0046
            java.lang.String r7 = r8.getName()
            r2.add(r7)
        L_0x0046:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x0049:
            java.util.Iterator r2 = r2.iterator()
        L_0x004d:
            boolean r3 = r2.hasNext()
            r4 = 3
            if (r3 == 0) goto L_0x023d
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r6 = r3.startsWith(r7)
            if (r6 == 0) goto L_0x0065
            java.lang.String r6 = r3.substring(r4)
            goto L_0x0066
        L_0x0065:
            r6 = r3
        L_0x0066:
            java.lang.String r8 = "List"
            boolean r9 = r6.endsWith(r8)
            r10 = 1
            if (r9 == 0) goto L_0x00be
            java.lang.String r9 = "OrBuilderList"
            boolean r9 = r6.endsWith(r9)
            if (r9 != 0) goto L_0x00be
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x00be
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r6.substring(r5, r10)
            java.lang.String r9 = r9.toLowerCase()
            r8.append(r9)
            int r9 = r6.length()
            int r9 = r9 + -4
            java.lang.String r9 = r6.substring(r10, r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object r9 = r0.get(r3)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto L_0x00be
            java.lang.Class r11 = r9.getReturnType()
            java.lang.Class<java.util.List> r12 = java.util.List.class
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00be
            java.lang.String r3 = m5283b(r8)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.invokeOrDie(r9, r13, r4)
            goto L_0x0238
        L_0x00be:
            java.lang.String r8 = "Map"
            boolean r9 = r6.endsWith(r8)
            if (r9 == 0) goto L_0x0121
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x0121
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r6.substring(r5, r10)
            java.lang.String r9 = r9.toLowerCase()
            r8.append(r9)
            int r9 = r6.length()
            int r9 = r9 - r4
            java.lang.String r4 = r6.substring(r10, r9)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x0121
            java.lang.Class r8 = r3.getReturnType()
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0121
            java.lang.Class<java.lang.Deprecated> r8 = java.lang.Deprecated.class
            boolean r8 = r3.isAnnotationPresent(r8)
            if (r8 != 0) goto L_0x0121
            int r8 = r3.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)
            if (r8 == 0) goto L_0x0121
            java.lang.String r4 = m5283b(r4)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.invokeOrDie(r3, r13, r6)
            m5239a(r14, r15, r4, r3)
            goto L_0x004d
        L_0x0121:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "set"
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r1.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 != 0) goto L_0x013c
            goto L_0x004d
        L_0x013c:
            java.lang.String r3 = "Bytes"
            boolean r3 = r6.endsWith(r3)
            if (r3 == 0) goto L_0x0161
            java.lang.StringBuilder r3 = p213q.p214a.p215a.p216a.C1965a.m4756a(r7)
            int r4 = r6.length()
            int r4 = r4 + -5
            java.lang.String r4 = r6.substring(r5, r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            boolean r3 = r0.containsKey(r3)
            if (r3 == 0) goto L_0x0161
            goto L_0x004d
        L_0x0161:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r6.substring(r5, r10)
            java.lang.String r4 = r4.toLowerCase()
            r3.append(r4)
            java.lang.String r4 = r6.substring(r10)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.Object r4 = r0.get(r4)
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "has"
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            java.lang.Object r6 = r0.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r4 == 0) goto L_0x004d
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.invokeOrDie(r4, r13, r8)
            if (r6 != 0) goto L_0x0226
            boolean r6 = r4 instanceof java.lang.Boolean
            if (r6 == 0) goto L_0x01c0
            r6 = r4
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r6 = r6 ^ r10
            goto L_0x0221
        L_0x01c0:
            boolean r6 = r4 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x01ce
            r6 = r4
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L_0x0220
            goto L_0x021e
        L_0x01ce:
            boolean r6 = r4 instanceof java.lang.Float
            if (r6 == 0) goto L_0x01df
            r6 = r4
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x0220
            goto L_0x021e
        L_0x01df:
            boolean r6 = r4 instanceof java.lang.Double
            if (r6 == 0) goto L_0x01f1
            r6 = r4
            java.lang.Double r6 = (java.lang.Double) r6
            double r8 = r6.doubleValue()
            r11 = 0
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x0220
            goto L_0x021e
        L_0x01f1:
            boolean r6 = r4 instanceof java.lang.String
            if (r6 == 0) goto L_0x01f8
            java.lang.String r6 = ""
            goto L_0x01fe
        L_0x01f8:
            boolean r6 = r4 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3635j
            if (r6 == 0) goto L_0x0203
            q.b.c.a.j0.a.j r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3635j.f9034f
        L_0x01fe:
            boolean r6 = r4.equals(r6)
            goto L_0x0221
        L_0x0203:
            boolean r6 = r4 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0
            if (r6 == 0) goto L_0x0211
            r6 = r4
            q.b.c.a.j0.a.s0 r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0) r6
            q.b.c.a.j0.a.s0 r6 = r6.getDefaultInstanceForType()
            if (r4 != r6) goto L_0x0220
            goto L_0x021e
        L_0x0211:
            boolean r6 = r4 instanceof java.lang.Enum
            if (r6 == 0) goto L_0x0220
            r6 = r4
            java.lang.Enum r6 = (java.lang.Enum) r6
            int r6 = r6.ordinal()
            if (r6 != 0) goto L_0x0220
        L_0x021e:
            r6 = r10
            goto L_0x0221
        L_0x0220:
            r6 = r5
        L_0x0221:
            if (r6 != 0) goto L_0x0224
            goto L_0x0232
        L_0x0224:
            r10 = r5
            goto L_0x0232
        L_0x0226:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.invokeOrDie(r6, r13, r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r10 = r6.booleanValue()
        L_0x0232:
            if (r10 == 0) goto L_0x004d
            java.lang.String r3 = m5283b(r3)
        L_0x0238:
            m5239a(r14, r15, r3, r4)
            goto L_0x004d
        L_0x023d:
            boolean r0 = r13 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3734c
            if (r0 == 0) goto L_0x0272
            r0 = r13
            q.b.c.a.j0.a.z$c r0 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3734c) r0
            q.b.c.a.j0.a.v<q.b.c.a.j0.a.z$e> r0 = r0.f9286e
            java.util.Iterator r0 = r0.mo9970c()
        L_0x024a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0272
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r2 = "["
            java.lang.StringBuilder r2 = p213q.p214a.p215a.p216a.C1965a.m4756a(r2)
            java.lang.Object r3 = r1.getKey()
            q.b.c.a.j0.a.z$e r3 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3736e) r3
            int r3 = r3.f9288f
            java.lang.String r6 = "]"
            java.lang.String r2 = p213q.p214a.p215a.p216a.C1965a.m4753a(r2, r3, r6)
            java.lang.Object r1 = r1.getValue()
            m5239a(r14, r15, r2, r1)
            goto L_0x024a
        L_0x0272:
            q.b.c.a.j0.a.z r13 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3731z) r13
            q.b.c.a.j0.a.n1 r13 = r13.unknownFields
            if (r13 == 0) goto L_0x028f
        L_0x0278:
            int r0 = r13.f9118a
            if (r5 >= r0) goto L_0x028f
            int[] r0 = r13.f9119b
            r0 = r0[r5]
            int r0 = r0 >>> r4
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object[] r1 = r13.f9120c
            r1 = r1[r5]
            m5239a(r14, r15, r0, r1)
            int r5 = r5 + 1
            goto L_0x0278
        L_0x028f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5248a(q.b.c.a.j0.a.s0, java.lang.StringBuilder, int):void");
    }

    /* renamed from: a */
    public static final <T> void m5243a(C0943i0<? super T> i0Var, C4580d<? super T> dVar, int i) {
        Object c = i0Var.mo4240c();
        Throwable th = null;
        C0975s sVar = (C0975s) (!(c instanceof C0975s) ? null : c);
        Throwable th2 = sVar != null ? sVar.f2591a : null;
        if (th2 != null) {
            th = th2;
        }
        Object a = th != null ? m5184a(th) : i0Var.mo4281b(c);
        if (i == 0) {
            dVar.mo4217a(a);
        } else if (i == 1) {
            C0937g0.m2094a(dVar, a);
        } else if (i != 2) {
            throw new IllegalStateException(C1965a.m4761b("Invalid mode ", i).toString());
        } else if (dVar != null) {
            C0931f0 f0Var = (C0931f0) dVar;
            C4583f b = f0Var.mo4219b();
            Object b2 = C0890a.m1971b(b, f0Var.f2536j);
            try {
                f0Var.f2538l.mo4217a(a);
            } finally {
                C0890a.m1970a(b, b2);
            }
        } else {
            throw new C4557i("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
        }
    }

    /* renamed from: a */
    public static void m5229a(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C3337g) {
            C3337g gVar = (C3337g) background;
            C3339b bVar = gVar.f8365e;
            if (bVar.f8401o != f) {
                bVar.f8401o = f;
                gVar.mo9086j();
            }
        }
    }

    /* renamed from: a */
    public static void m5230a(View view, C3337g gVar) {
        C3495a aVar = gVar.f8365e.f8388b;
        if (aVar != null && aVar.f8896a) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f += C1404o.m3547h((View) parent);
            }
            C3339b bVar = gVar.f8365e;
            if (bVar.f8400n != f) {
                bVar.f8400n = f;
                gVar.mo9086j();
            }
        }
    }

    /* renamed from: a */
    public static final char m5139a(char[] cArr) {
        if (cArr != null) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            } else if (length == 1) {
                return cArr[0];
            } else {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        } else {
            C4638h.m10271a("$this$single");
            throw null;
        }
    }

    /* renamed from: a */
    public static final <T> void m5255a(T[] tArr, Comparator<? super T> comparator) {
        if (tArr == null) {
            C4638h.m10271a("$this$sortWith");
            throw null;
        } else if (comparator == null) {
            C4638h.m10271a("comparator");
            throw null;
        } else if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    /* renamed from: a */
    public static final <T> List<T> m5203a(C4669d<? extends T> dVar) {
        if (dVar != null) {
            ArrayList arrayList = new ArrayList();
            for (Object add : dVar) {
                arrayList.add(add);
            }
            return m5202a((List<? extends T>) arrayList);
        }
        C4638h.m10271a("$this$toList");
        throw null;
    }

    /* renamed from: a */
    public static int m5161a(C2455g8 g8Var, byte[] bArr, int i, int i2, int i3, C2362b5 b5Var) {
        C2684t7 t7Var = (C2684t7) g8Var;
        Object a = t7Var.f6888l.mo8062a(t7Var.f6881e);
        int a2 = t7Var.mo8016a(a, bArr, i, i2, i3, b5Var);
        t7Var.mo7685c(a);
        b5Var.f6331c = a;
        return a2;
    }

    /* renamed from: a */
    public static C3192b m5209a(Context context, C2802d2 d2Var) {
        Uri uri;
        C2802d2 d2Var2 = d2Var;
        long j = d2Var2.f7024e;
        int i = d2Var2.f7025f;
        if (i != 1) {
            String str = "NearbyConnections";
            if (i == 2) {
                String str2 = d2Var2.f7028i;
                Uri uri2 = d2Var2.f7031l;
                String str3 = "Cannot create Payload.File from null ParcelFileDescriptor.";
                if (str2 == null || uri2 == null) {
                    ParcelFileDescriptor parcelFileDescriptor = d2Var2.f7027h;
                    C1061o.m2525b(parcelFileDescriptor, (Object) str3);
                    C3193a aVar = new C3193a(null, parcelFileDescriptor, parcelFileDescriptor.getStatSize(), null);
                    C3192b bVar = new C3192b(j, 2, null, aVar, null);
                    return bVar;
                }
                try {
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri2, "r");
                    File file = new File(str2);
                    long j2 = d2Var2.f7029j;
                    C1061o.m2525b(file, (Object) "Cannot create Payload.File from null java.io.File.");
                    C1061o.m2525b(openFileDescriptor, (Object) str3);
                    C1061o.m2525b(uri2, (Object) "Cannot create Payload.File from null Uri");
                    C3193a aVar2 = new C3193a(file, openFileDescriptor, j2, uri2);
                    r0 = r0;
                    uri = uri2;
                    try {
                        C3192b bVar2 = new C3192b(j, 2, null, aVar2, null);
                        return bVar2;
                    } catch (FileNotFoundException e) {
                        e = e;
                        Log.w(str, String.format("Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s.", new Object[]{uri, str2}), e);
                        return null;
                    }
                } catch (FileNotFoundException e2) {
                    e = e2;
                    uri = uri2;
                    Log.w(str, String.format("Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s.", new Object[]{uri, str2}), e);
                    return null;
                }
            } else if (i != 3) {
                Log.w(str, String.format("Incoming ParcelablePayload %d has unknown type %d", new Object[]{Long.valueOf(j), Integer.valueOf(d2Var2.f7025f)}));
                return null;
            } else {
                ParcelFileDescriptor parcelFileDescriptor2 = d2Var2.f7027h;
                C1061o.m2525b(parcelFileDescriptor2, (Object) "Cannot create Payload.Stream from null ParcelFileDescriptor.");
                C3192b bVar3 = new C3192b(j, 3, null, null, new C3194b(parcelFileDescriptor2, null));
                return bVar3;
            }
        } else {
            C3192b bVar4 = new C3192b(j, 1, d2Var2.f7026g, null, null);
            return bVar4;
        }
    }

    /* renamed from: a */
    public static String m5189a(Context context, String str) {
        try {
            C1061o.m2524b(context);
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier(str, "string", resources.getResourcePackageName(C2131k.common_google_play_services_unknown_issue));
            if (identifier == 0) {
                return null;
            }
            return resources.getString(identifier);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m5193a(C2435f5 f5Var) {
        String str;
        C2653r8 r8Var = new C2653r8(f5Var);
        StringBuilder sb = new StringBuilder(r8Var.f6848a.mo7640a());
        for (int i = 0; i < r8Var.f6848a.mo7640a(); i++) {
            int a = r8Var.f6848a.mo7639a(i);
            if (a == 34) {
                str = "\\\"";
            } else if (a == 39) {
                str = "\\'";
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (a < 32 || a > 126) {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            a = (a & 7) + 48;
                        }
                        sb.append((char) a);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m5190a(@NullableDecl String str, @NullableDecl Object... objArr) {
        String str2;
        String valueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                str2 = p116io.jsonwebtoken.lang.Objects.NULL_STRING;
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(C1965a.m4743a(hexString, name.length() + 1));
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String sb2 = sb.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String str3 = "Exception during lenientFormat for ";
                    String valueOf2 = String.valueOf(sb2);
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3), e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb3 = new StringBuilder(name2.length() + C1965a.m4743a(sb2, 9));
                    sb3.append("<");
                    sb3.append(sb2);
                    sb3.append(" threw ");
                    sb3.append(name2);
                    sb3.append(">");
                    str2 = sb3.toString();
                }
            }
            objArr[i2] = str2;
        }
        StringBuilder sb4 = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i3 = 0;
        while (i < objArr.length) {
            int indexOf = valueOf.indexOf("%s", i3);
            if (indexOf == -1) {
                break;
            }
            sb4.append(valueOf, i3, indexOf);
            int i4 = i + 1;
            sb4.append(objArr[i]);
            int i5 = i4;
            i3 = indexOf + 2;
            i = i5;
        }
        sb4.append(valueOf, i3, valueOf.length());
        if (i < objArr.length) {
            sb4.append(" [");
            int i6 = i + 1;
            sb4.append(objArr[i]);
            while (i6 < objArr.length) {
                sb4.append(p116io.jsonwebtoken.lang.Objects.ARRAY_ELEMENT_SEPARATOR);
                int i7 = i6 + 1;
                sb4.append(objArr[i6]);
                i6 = i7;
            }
            sb4.append(']');
        }
        return sb4.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01e5, code lost:
        if (((java.lang.Boolean) r4).booleanValue() == false) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01f7, code lost:
        if (((java.lang.Integer) r4).intValue() == 0) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0208, code lost:
        if (((java.lang.Float) r4).floatValue() == 0.0f) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x021a, code lost:
        if (((java.lang.Double) r4).doubleValue() == 0.0d) goto L_0x01e7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x024e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m5244a(p213q.p217b.p218a.p231b.p251g.p256e.C2619p7 r13, java.lang.StringBuilder r14, int r15) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>()
            java.lang.Class r3 = r13.getClass()
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            int r4 = r3.length
            r5 = 0
            r6 = r5
        L_0x001a:
            java.lang.String r7 = "get"
            if (r6 >= r4) goto L_0x0049
            r8 = r3[r6]
            java.lang.String r9 = r8.getName()
            r1.put(r9, r8)
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r9 = r9.length
            if (r9 != 0) goto L_0x0046
            java.lang.String r9 = r8.getName()
            r0.put(r9, r8)
            java.lang.String r9 = r8.getName()
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto L_0x0046
            java.lang.String r7 = r8.getName()
            r2.add(r7)
        L_0x0046:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x0049:
            java.util.Iterator r2 = r2.iterator()
        L_0x004d:
            boolean r3 = r2.hasNext()
            r4 = 3
            if (r3 == 0) goto L_0x0264
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r6 = r3.startsWith(r7)
            if (r6 == 0) goto L_0x0065
            java.lang.String r6 = r3.substring(r4)
            goto L_0x0066
        L_0x0065:
            r6 = r3
        L_0x0066:
            java.lang.String r8 = "List"
            boolean r9 = r6.endsWith(r8)
            r10 = 1
            if (r9 == 0) goto L_0x00ca
            java.lang.String r9 = "OrBuilderList"
            boolean r9 = r6.endsWith(r9)
            if (r9 != 0) goto L_0x00ca
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x00ca
            java.lang.String r8 = r6.substring(r5, r10)
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r6.length()
            int r9 = r9 + -4
            java.lang.String r9 = r6.substring(r10, r9)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r11 = r9.length()
            if (r11 == 0) goto L_0x00a2
            java.lang.String r8 = r8.concat(r9)
            goto L_0x00a8
        L_0x00a2:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r8)
            r8 = r9
        L_0x00a8:
            java.lang.Object r9 = r0.get(r3)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto L_0x00ca
            java.lang.Class r11 = r9.getReturnType()
            java.lang.Class<java.util.List> r12 = java.util.List.class
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00ca
            java.lang.String r3 = m5324d(r8)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.m5943a(r9, r13, r4)
        L_0x00c6:
            m5297b(r14, r15, r3, r4)
            goto L_0x004d
        L_0x00ca:
            java.lang.String r8 = "Map"
            boolean r9 = r6.endsWith(r8)
            if (r9 == 0) goto L_0x0136
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x0136
            java.lang.String r8 = r6.substring(r5, r10)
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r6.length()
            int r9 = r9 - r4
            java.lang.String r4 = r6.substring(r10, r9)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r9 = r4.length()
            if (r9 == 0) goto L_0x00fc
            java.lang.String r4 = r8.concat(r4)
            goto L_0x0101
        L_0x00fc:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r8)
        L_0x0101:
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x0136
            java.lang.Class r8 = r3.getReturnType()
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0136
            java.lang.Class<java.lang.Deprecated> r8 = java.lang.Deprecated.class
            boolean r8 = r3.isAnnotationPresent(r8)
            if (r8 != 0) goto L_0x0136
            int r8 = r3.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)
            if (r8 == 0) goto L_0x0136
            java.lang.String r4 = m5324d(r4)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.m5943a(r3, r13, r6)
            m5297b(r14, r15, r4, r3)
            goto L_0x004d
        L_0x0136:
            java.lang.String r3 = "set"
            int r4 = r6.length()
            if (r4 == 0) goto L_0x0143
            java.lang.String r3 = r3.concat(r6)
            goto L_0x0149
        L_0x0143:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L_0x0149:
            java.lang.Object r3 = r1.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x004d
            java.lang.String r3 = "Bytes"
            boolean r3 = r6.endsWith(r3)
            if (r3 == 0) goto L_0x017d
            int r3 = r6.length()
            int r3 = r3 + -5
            java.lang.String r3 = r6.substring(r5, r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x0172
            java.lang.String r3 = r7.concat(r3)
            goto L_0x0177
        L_0x0172:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r7)
        L_0x0177:
            boolean r3 = r0.containsKey(r3)
            if (r3 != 0) goto L_0x004d
        L_0x017d:
            java.lang.String r3 = r6.substring(r5, r10)
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = r6.substring(r10)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r8 = r4.length()
            if (r8 == 0) goto L_0x019c
            java.lang.String r3 = r3.concat(r4)
            goto L_0x01a2
        L_0x019c:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L_0x01a2:
            int r4 = r6.length()
            if (r4 == 0) goto L_0x01ad
            java.lang.String r4 = r7.concat(r6)
            goto L_0x01b2
        L_0x01ad:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r7)
        L_0x01b2:
            java.lang.Object r4 = r0.get(r4)
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r8 = "has"
            int r9 = r6.length()
            if (r9 == 0) goto L_0x01c5
            java.lang.String r6 = r8.concat(r6)
            goto L_0x01ca
        L_0x01c5:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
        L_0x01ca:
            java.lang.Object r6 = r0.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r4 == 0) goto L_0x004d
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.m5943a(r4, r13, r8)
            if (r6 != 0) goto L_0x0250
            boolean r6 = r4 instanceof java.lang.Boolean
            if (r6 == 0) goto L_0x01ec
            r6 = r4
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x01ea
        L_0x01e7:
            r6 = r10
            goto L_0x024b
        L_0x01ea:
            r6 = r5
            goto L_0x024b
        L_0x01ec:
            boolean r6 = r4 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x01fa
            r6 = r4
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L_0x01ea
            goto L_0x01e7
        L_0x01fa:
            boolean r6 = r4 instanceof java.lang.Float
            if (r6 == 0) goto L_0x020b
            r6 = r4
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x01ea
            goto L_0x01e7
        L_0x020b:
            boolean r6 = r4 instanceof java.lang.Double
            if (r6 == 0) goto L_0x021d
            r6 = r4
            java.lang.Double r6 = (java.lang.Double) r6
            double r8 = r6.doubleValue()
            r11 = 0
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x01ea
            goto L_0x01e7
        L_0x021d:
            boolean r6 = r4 instanceof java.lang.String
            if (r6 == 0) goto L_0x0228
            java.lang.String r6 = ""
        L_0x0223:
            boolean r6 = r4.equals(r6)
            goto L_0x024b
        L_0x0228:
            boolean r6 = r4 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2435f5
            if (r6 == 0) goto L_0x022f
            q.b.a.b.g.e.f5 r6 = p213q.p217b.p218a.p231b.p251g.p256e.C2435f5.f6525f
            goto L_0x0223
        L_0x022f:
            boolean r6 = r4 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2619p7
            if (r6 == 0) goto L_0x023d
            r6 = r4
            q.b.a.b.g.e.p7 r6 = (p213q.p217b.p218a.p231b.p251g.p256e.C2619p7) r6
            q.b.a.b.g.e.p7 r6 = r6.mo7764c()
            if (r4 != r6) goto L_0x01ea
            goto L_0x01e7
        L_0x023d:
            boolean r6 = r4 instanceof java.lang.Enum
            if (r6 == 0) goto L_0x01ea
            r6 = r4
            java.lang.Enum r6 = (java.lang.Enum) r6
            int r6 = r6.ordinal()
            if (r6 != 0) goto L_0x01ea
            goto L_0x01e7
        L_0x024b:
            if (r6 != 0) goto L_0x024e
            goto L_0x025c
        L_0x024e:
            r10 = r5
            goto L_0x025c
        L_0x0250:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r6 = p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.m5943a(r6, r13, r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r10 = r6.booleanValue()
        L_0x025c:
            if (r10 == 0) goto L_0x004d
            java.lang.String r3 = m5324d(r3)
            goto L_0x00c6
        L_0x0264:
            boolean r0 = r13 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2492b
            if (r0 == 0) goto L_0x028a
            r0 = r13
            q.b.a.b.g.e.i6$b r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2492b) r0
            q.b.a.b.g.e.x5<q.b.a.b.g.e.i6$e> r0 = r0.zzc
            java.util.Iterator r0 = r0.mo8095b()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x0278
            goto L_0x028a
        L_0x0278:
            java.lang.Object r13 = r0.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r13 = r13.getKey()
            q.b.a.b.g.e.i6$e r13 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2495e) r13
            java.lang.NoSuchMethodError r13 = new java.lang.NoSuchMethodError
            r13.<init>()
            throw r13
        L_0x028a:
            q.b.a.b.g.e.i6 r13 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r13
            q.b.a.b.g.e.t8 r13 = r13.zzb
            if (r13 == 0) goto L_0x02a7
        L_0x0290:
            int r0 = r13.f6894a
            if (r5 >= r0) goto L_0x02a7
            int[] r0 = r13.f6895b
            r0 = r0[r5]
            int r0 = r0 >>> r4
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object[] r1 = r13.f6896c
            r1 = r1[r5]
            m5297b(r14, r15, r0, r1)
            int r5 = r5 + 1
            goto L_0x0290
        L_0x02a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5244a(q.b.a.b.g.e.p7, java.lang.StringBuilder, int):void");
    }

    /* renamed from: a */
    public static void m5245a(C2908b4 b4Var, SQLiteDatabase sQLiteDatabase) {
        if (b4Var != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                b4Var.f7156i.mo8432a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                b4Var.f7156i.mo8432a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                b4Var.f7156i.mo8432a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                b4Var.f7156i.mo8432a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    /* renamed from: a */
    public static void m5246a(C2908b4 b4Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        boolean z;
        if (b4Var != null) {
            Cursor cursor = null;
            try {
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                Cursor query = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                z = query.moveToFirst();
                query.close();
            } catch (SQLiteException e) {
                b4Var.f7156i.mo8434a("Error querying for table", str, e);
                if (cursor != null) {
                    cursor.close();
                }
                z = false;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            if (!z) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                Set a = m5205a(sQLiteDatabase, str);
                String[] split = str3.split(",");
                int length = split.length;
                int i = 0;
                while (i < length) {
                    String str4 = split[i];
                    if (((HashSet) a).remove(str4)) {
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(str4).length());
                        sb.append("Table ");
                        sb.append(str);
                        sb.append(" is missing required column: ");
                        sb.append(str4);
                        throw new SQLiteException(sb.toString());
                    }
                }
                if (strArr != null) {
                    for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                        if (!((HashSet) a).remove(strArr[i2])) {
                            sQLiteDatabase.execSQL(strArr[i2 + 1]);
                        }
                    }
                }
                if (!((HashSet) a).isEmpty()) {
                    b4Var.f7156i.mo8434a("Table has extra columns. table, columns", str, TextUtils.join(p116io.jsonwebtoken.lang.Objects.ARRAY_ELEMENT_SEPARATOR, a));
                }
            } catch (SQLiteException e2) {
                b4Var.f7153f.mo8433a("Failed to verify columns on table that was just created", str);
                throw e2;
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }

    /* renamed from: a */
    public static boolean m5264a(Comparator<?> comparator, Iterable<?> iterable) {
        Object obj;
        if (comparator == null) {
            throw null;
        } else if (iterable != null) {
            if (iterable instanceof SortedSet) {
                obj = ((SortedSet) iterable).comparator();
                if (obj == null) {
                    obj = C2776z3.f7006e;
                }
            } else if (!(iterable instanceof C2544l4)) {
                return false;
            } else {
                obj = ((C2544l4) iterable).comparator();
            }
            return comparator.equals(obj);
        } else {
            throw null;
        }
    }
}
