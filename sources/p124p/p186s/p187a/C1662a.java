package p124p.p186s.p187a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p124p.p143e.C1251c;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p301c.p302a.C3499a;
import p213q.p217b.p301c.p302a.C3503c;
import p213q.p217b.p301c.p302a.C3562h;
import p213q.p217b.p301c.p302a.C3587j;
import p213q.p217b.p301c.p302a.p304d0.C3534a;
import p213q.p217b.p301c.p302a.p307g0.p308a.C3555a;
import p213q.p217b.p301c.p302a.p307g0.p308a.C3555a.C3557b;
import p213q.p217b.p301c.p302a.p315m0.C3802h;

/* renamed from: p.s.a.a */
public final class C1662a implements SharedPreferences {

    /* renamed from: a */
    public final SharedPreferences f4898a;

    /* renamed from: b */
    public final List<OnSharedPreferenceChangeListener> f4899b = new ArrayList();

    /* renamed from: c */
    public final String f4900c;

    /* renamed from: d */
    public final C3499a f4901d;

    /* renamed from: e */
    public final C3503c f4902e;

    /* renamed from: p.s.a.a$a */
    public static final class C1663a implements Editor {

        /* renamed from: a */
        public final C1662a f4903a;

        /* renamed from: b */
        public final Editor f4904b;

        /* renamed from: c */
        public final List<String> f4905c;

        /* renamed from: d */
        public AtomicBoolean f4906d = new AtomicBoolean(false);

        public C1663a(C1662a aVar, Editor editor) {
            this.f4903a = aVar;
            this.f4904b = editor;
            this.f4905c = new CopyOnWriteArrayList();
        }

        /* renamed from: a */
        public final void mo6477a() {
            if (this.f4906d.getAndSet(false)) {
                for (String str : ((HashMap) this.f4903a.getAll()).keySet()) {
                    if (!this.f4905c.contains(str) && !this.f4903a.mo6465c(str)) {
                        this.f4904b.remove(this.f4903a.mo6463a(str));
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo6478a(String str, byte[] bArr) {
            if (!this.f4903a.mo6465c(str)) {
                this.f4905c.add(str);
                if (str == null) {
                    str = "__NULL__";
                }
                try {
                    C1662a aVar = this.f4903a;
                    String a = aVar.mo6463a(str);
                    Pair pair = new Pair(a, C3802h.m9145a(aVar.f4901d.mo9453a(bArr, a.getBytes(StandardCharsets.UTF_8))));
                    this.f4904b.putString((String) pair.first, (String) pair.second);
                } catch (GeneralSecurityException e) {
                    StringBuilder a2 = C1965a.m4756a("Could not encrypt data: ");
                    a2.append(e.getMessage());
                    throw new SecurityException(a2.toString(), e);
                }
            } else {
                throw new SecurityException(C1965a.m4751a(str, " is a reserved key for the encryption keyset."));
            }
        }

        public void apply() {
            mo6477a();
            this.f4904b.apply();
            mo6480b();
        }

        /* renamed from: b */
        public final void mo6480b() {
            for (OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f4903a.f4899b) {
                for (String onSharedPreferenceChanged : this.f4905c) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f4903a, onSharedPreferenceChanged);
                }
            }
        }

        public Editor clear() {
            this.f4906d.set(true);
            return this;
        }

        public boolean commit() {
            mo6477a();
            try {
                return this.f4904b.commit();
            } finally {
                mo6480b();
                this.f4905c.clear();
            }
        }

        public Editor putBoolean(String str, boolean z) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(C1664b.BOOLEAN.f4914e);
            allocate.put(z ? (byte) 1 : 0);
            mo6478a(str, allocate.array());
            return this;
        }

        public Editor putFloat(String str, float f) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(C1664b.FLOAT.f4914e);
            allocate.putFloat(f);
            mo6478a(str, allocate.array());
            return this;
        }

        public Editor putInt(String str, int i) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(C1664b.INT.f4914e);
            allocate.putInt(i);
            mo6478a(str, allocate.array());
            return this;
        }

        public Editor putLong(String str, long j) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(C1664b.LONG.f4914e);
            allocate.putLong(j);
            mo6478a(str, allocate.array());
            return this;
        }

        public Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(C1664b.STRING.f4914e);
            allocate.putInt(length);
            allocate.put(bytes);
            mo6478a(str, allocate.array());
            return this;
        }

        /* JADX WARNING: type inference failed for: r6v1, types: [java.util.Set] */
        /* JADX WARNING: type inference failed for: r6v6 */
        /*  JADX ERROR: UnsupportedOperationException in pass: LoopRegionVisitor
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:438)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.fixIterableType(LoopRegionVisitor.java:334)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkIterableForEach(LoopRegionVisitor.java:270)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:75)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:59)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:56)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:57)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:57)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:18)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:53)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
            */
        /* JADX WARNING: Multi-variable type inference failed */
        public android.content.SharedPreferences.Editor putStringSet(java.lang.String r5, java.util.Set<java.lang.String> r6) {
            /*
                r4 = this;
                if (r6 != 0) goto L_0x000c
                p.e.c r6 = new p.e.c
                r6.<init>()
                java.lang.String r0 = "__NULL__"
                r6.add(r0)
            L_0x000c:
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r6.size()
                r0.<init>(r1)
                int r1 = r6.size()
                int r1 = r1 * 4
                java.util.Iterator r6 = r6.iterator()
            L_0x001f:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L_0x0037
                java.lang.Object r2 = r6.next()
                java.lang.String r2 = (java.lang.String) r2
                java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
                byte[] r2 = r2.getBytes(r3)
                r0.add(r2)
                int r2 = r2.length
                int r1 = r1 + r2
                goto L_0x001f
            L_0x0037:
                int r1 = r1 + 4
                java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r1)
                p.s.a.a$b r1 = p124p.p186s.p187a.C1662a.C1664b.STRING_SET
                int r1 = r1.f4914e
                r6.putInt(r1)
                java.util.Iterator r0 = r0.iterator()
            L_0x0048:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x005c
                java.lang.Object r1 = r0.next()
                byte[] r1 = (byte[]) r1
                int r2 = r1.length
                r6.putInt(r2)
                r6.put(r1)
                goto L_0x0048
            L_0x005c:
                byte[] r6 = r6.array()
                r4.mo6478a(r5, r6)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p124p.p186s.p187a.C1662a.C1663a.putStringSet(java.lang.String, java.util.Set):android.content.SharedPreferences$Editor");
        }

        public Editor remove(String str) {
            if (!this.f4903a.mo6465c(str)) {
                this.f4904b.remove(this.f4903a.mo6463a(str));
                this.f4905c.remove(str);
                return this;
            }
            throw new SecurityException(C1965a.m4751a(str, " is a reserved key for the encryption keyset."));
        }
    }

    /* renamed from: p.s.a.a$b */
    public enum C1664b {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);
        

        /* renamed from: e */
        public final int f4914e;

        /* access modifiers changed from: public */
        C1664b(int i) {
            this.f4914e = i;
        }

        /* renamed from: a */
        public static C1664b m4213a(int i) {
            if (i == 0) {
                return STRING;
            }
            if (i == 1) {
                return STRING_SET;
            }
            if (i == 2) {
                return INT;
            }
            if (i == 3) {
                return LONG;
            }
            if (i == 4) {
                return FLOAT;
            }
            if (i != 5) {
                return null;
            }
            return BOOLEAN;
        }
    }

    /* renamed from: p.s.a.a$c */
    public enum C1665c {
        AES256_SIV(C3562h.m8091a("type.googleapis.com/google.crypto.tink.AesSivKey", r2.toByteArray(), r1));
        

        /* renamed from: e */
        public final C3562h f4917e;

        /* access modifiers changed from: public */
        C1665c(C3562h hVar) {
            this.f4917e = hVar;
        }
    }

    /* renamed from: p.s.a.a$d */
    public enum C1666d {
        AES256_GCM(C3562h.m8091a("type.googleapis.com/google.crypto.tink.AesGcmKey", r2.toByteArray(), r1));
        

        /* renamed from: e */
        public final C3562h f4920e;

        /* access modifiers changed from: public */
        C1666d(C3562h hVar) {
            this.f4920e = hVar;
        }
    }

    public C1662a(String str, String str2, SharedPreferences sharedPreferences, C3499a aVar, C3503c cVar) {
        this.f4900c = str;
        this.f4898a = sharedPreferences;
        this.f4901d = aVar;
        this.f4902e = cVar;
    }

    @Deprecated
    /* renamed from: a */
    public static SharedPreferences m4206a(String str, String str2, Context context, C1665c cVar, C1666d dVar) {
        C3534a.m8046a();
        Context applicationContext = context.getApplicationContext();
        C3557b bVar = new C3557b();
        bVar.f8941e = cVar.f4917e;
        bVar.mo9475a(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str);
        StringBuilder sb = new StringBuilder();
        String str3 = "android-keystore://";
        sb.append(str3);
        sb.append(str2);
        String sb2 = sb.toString();
        String str4 = "key URI must start with android-keystore://";
        if (sb2.startsWith(str3)) {
            bVar.f8939c = sb2;
            C3587j a = new C3555a(bVar, null).mo9472a();
            C3557b bVar2 = new C3557b();
            bVar2.f8941e = dVar.f4920e;
            bVar2.mo9475a(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(str2);
            String sb4 = sb3.toString();
            if (sb4.startsWith(str3)) {
                bVar2.f8939c = sb4;
                C3499a aVar = (C3499a) new C3555a(bVar2, null).mo9472a().mo9483a(C3499a.class);
                String str5 = str;
                String str6 = str2;
                C1662a aVar2 = new C1662a(str5, str6, applicationContext.getSharedPreferences(str, 0), aVar, (C3503c) a.mo9483a(C3503c.class));
                return aVar2;
            }
            throw new IllegalArgumentException(str4);
        }
        throw new IllegalArgumentException(str4);
    }

    /* renamed from: a */
    public String mo6463a(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return C3802h.m9145a(this.f4902e.mo9455a(str.getBytes(StandardCharsets.UTF_8), this.f4900c.getBytes()));
        } catch (GeneralSecurityException e) {
            StringBuilder a = C1965a.m4756a("Could not encrypt key. ");
            a.append(e.getMessage());
            throw new SecurityException(a.toString(), e);
        }
    }

    /* renamed from: b */
    public final Object mo6464b(String str) {
        if (!mo6465c(str)) {
            String str2 = "__NULL__";
            if (str == null) {
                str = str2;
            }
            try {
                String a = mo6463a(str);
                String string = this.f4898a.getString(a, null);
                if (string == null) {
                    return null;
                }
                boolean z = false;
                ByteBuffer wrap = ByteBuffer.wrap(this.f4901d.mo9454b(C3802h.m9146a(string, 0), a.getBytes(StandardCharsets.UTF_8)));
                wrap.position(0);
                int ordinal = C1664b.m4213a(wrap.getInt()).ordinal();
                if (ordinal == 0) {
                    int i = wrap.getInt();
                    ByteBuffer slice = wrap.slice();
                    wrap.limit(i);
                    String charBuffer = StandardCharsets.UTF_8.decode(slice).toString();
                    if (charBuffer.equals(str2)) {
                        return null;
                    }
                    return charBuffer;
                } else if (ordinal == 1) {
                    C1251c cVar = new C1251c();
                    while (wrap.hasRemaining()) {
                        int i2 = wrap.getInt();
                        ByteBuffer slice2 = wrap.slice();
                        slice2.limit(i2);
                        wrap.position(wrap.position() + i2);
                        cVar.add(StandardCharsets.UTF_8.decode(slice2).toString());
                    }
                    if (cVar.f3551g != 1 || !str2.equals(cVar.f3550f[0])) {
                        return cVar;
                    }
                    return null;
                } else if (ordinal == 2) {
                    return Integer.valueOf(wrap.getInt());
                } else {
                    if (ordinal == 3) {
                        return Long.valueOf(wrap.getLong());
                    }
                    if (ordinal == 4) {
                        return Float.valueOf(wrap.getFloat());
                    }
                    if (ordinal != 5) {
                        return null;
                    }
                    if (wrap.get() != 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            } catch (GeneralSecurityException e) {
                StringBuilder a2 = C1965a.m4756a("Could not decrypt value. ");
                a2.append(e.getMessage());
                throw new SecurityException(a2.toString(), e);
            }
        } else {
            throw new SecurityException(C1965a.m4751a(str, " is a reserved key for the encryption keyset."));
        }
    }

    /* renamed from: c */
    public boolean mo6465c(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public boolean contains(String str) {
        if (!mo6465c(str)) {
            return this.f4898a.contains(mo6463a(str));
        }
        throw new SecurityException(C1965a.m4751a(str, " is a reserved key for the encryption keyset."));
    }

    public Editor edit() {
        return new C1663a(this, this.f4898a.edit());
    }

    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f4898a.getAll().entrySet()) {
            if (!mo6465c((String) entry.getKey())) {
                try {
                    String str = new String(this.f4902e.mo9456b(C3802h.m9146a((String) entry.getKey(), 0), this.f4900c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    hashMap.put(str, mo6464b(str));
                } catch (GeneralSecurityException e) {
                    StringBuilder a = C1965a.m4756a("Could not decrypt key. ");
                    a.append(e.getMessage());
                    throw new SecurityException(a.toString(), e);
                }
            }
        }
        return hashMap;
    }

    public boolean getBoolean(String str, boolean z) {
        Object b = mo6464b(str);
        return (b == null || !(b instanceof Boolean)) ? z : ((Boolean) b).booleanValue();
    }

    public float getFloat(String str, float f) {
        Object b = mo6464b(str);
        return (b == null || !(b instanceof Float)) ? f : ((Float) b).floatValue();
    }

    public int getInt(String str, int i) {
        Object b = mo6464b(str);
        return (b == null || !(b instanceof Integer)) ? i : ((Integer) b).intValue();
    }

    public long getLong(String str, long j) {
        Object b = mo6464b(str);
        return (b == null || !(b instanceof Long)) ? j : ((Long) b).longValue();
    }

    public String getString(String str, String str2) {
        Object b = mo6464b(str);
        return (b == null || !(b instanceof String)) ? str2 : (String) b;
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        Object b = mo6464b(str);
        Set cVar = b instanceof Set ? (Set) b : new C1251c();
        return cVar.size() > 0 ? cVar : set;
    }

    public void registerOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f4899b.add(onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f4899b.remove(onSharedPreferenceChangeListener);
    }
}
