package p213q.p217b.p317d.p322h.p323e.p328m.p329x;

import android.util.Base64;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4022a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4046c;
import p213q.p217b.p317d.p322h.p323e.p328m.C4050e;
import p213q.p217b.p317d.p322h.p323e.p328m.C4069m;
import p213q.p217b.p317d.p322h.p323e.p328m.C4071n;
import p213q.p217b.p317d.p322h.p323e.p328m.C4075p;
import p213q.p217b.p317d.p322h.p323e.p328m.C4077q.C4079b;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4092b;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4093c.C4094a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4104a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4106c;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4108e;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4108e.C4109a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4119w;
import p213q.p217b.p317d.p342i.C4190a;
import p213q.p217b.p317d.p342i.p344i.C4202d;
import p213q.p217b.p317d.p342i.p344i.C4203e;

/* renamed from: q.b.d.h.e.m.x.f */
public class C4125f {

    /* renamed from: a */
    public static final C4190a f9986a;

    /* renamed from: q.b.d.h.e.m.x.f$a */
    public interface C4126a<T> {
        /* renamed from: a */
        T mo10323a(JsonReader jsonReader);
    }

    static {
        C4203e eVar = new C4203e();
        ((C4022a) C4022a.f9818a).mo10224a(eVar);
        eVar.f10141d = true;
        f9986a = new C4202d(eVar);
    }

    /* renamed from: a */
    public static /* synthetic */ C4094a m9534a(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        byte[] bArr = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -734768633) {
                if (hashCode == -567321830 && nextName.equals("contents")) {
                    c = 1;
                }
            } else if (nextName.equals("filename")) {
                c = 0;
            }
            if (c == 0) {
                str = jsonReader.nextString();
                if (str == null) {
                    throw new NullPointerException("Null filename");
                }
            } else if (c != 1) {
                jsonReader.skipValue();
            } else {
                bArr = Base64.decode(jsonReader.nextString(), 2);
                if (bArr == null) {
                    throw new NullPointerException("Null contents");
                }
            }
        }
        jsonReader.endObject();
        String str2 = str == null ? " filename" : Objects.EMPTY_STRING;
        if (bArr == null) {
            str2 = C1965a.m4751a(str2, " contents");
        }
        if (str2.isEmpty()) {
            return new C4050e(str, bArr, null);
        }
        throw new IllegalStateException(C1965a.m4751a("Missing required properties:", str2));
    }

    /* renamed from: b */
    public static /* synthetic */ C4092b m9536b(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 106079) {
                if (hashCode == 111972721 && nextName.equals("value")) {
                    c = 1;
                }
            } else if (nextName.equals("key")) {
                c = 0;
            }
            if (c == 0) {
                str = jsonReader.nextString();
                if (str == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (c != 1) {
                jsonReader.skipValue();
            } else {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    throw new NullPointerException("Null value");
                }
            }
        }
        jsonReader.endObject();
        String str3 = str == null ? " key" : Objects.EMPTY_STRING;
        if (str2 == null) {
            str3 = C1965a.m4751a(str3, " value");
        }
        if (str3.isEmpty()) {
            return new C4046c(str, str2, null);
        }
        throw new IllegalStateException(C1965a.m4751a("Missing required properties:", str3));
    }

    /* renamed from: c */
    public static /* synthetic */ C4108e m9537c(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Integer num = null;
        C4119w wVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -1266514778) {
                if (hashCode != 3373707) {
                    if (hashCode == 2125650548 && nextName.equals("importance")) {
                        c = 0;
                    }
                } else if (nextName.equals("name")) {
                    c = 1;
                }
            } else if (nextName.equals("frames")) {
                c = 2;
            }
            if (c == 0) {
                num = Integer.valueOf(jsonReader.nextInt());
            } else if (c == 1) {
                str = jsonReader.nextString();
                if (str == null) {
                    throw new NullPointerException("Null name");
                }
            } else if (c != 2) {
                jsonReader.skipValue();
            } else {
                wVar = m9535a(jsonReader, C4124e.f9985a);
                if (wVar == null) {
                    throw new NullPointerException("Null frames");
                }
            }
        }
        jsonReader.endObject();
        String str2 = str == null ? " name" : Objects.EMPTY_STRING;
        if (num == null) {
            str2 = C1965a.m4751a(str2, " importance");
        }
        if (wVar == null) {
            str2 = C1965a.m4751a(str2, " frames");
        }
        if (str2.isEmpty()) {
            return new C4075p(str, num.intValue(), wVar, null);
        }
        throw new IllegalStateException(C1965a.m4751a("Missing required properties:", str2));
    }

    /* renamed from: d */
    public static /* synthetic */ C4104a m9538d(JsonReader jsonReader) {
        jsonReader.beginObject();
        Long l = null;
        Long l2 = null;
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                str = jsonReader.nextString();
                if (str == null) {
                    throw new NullPointerException("Null name");
                }
            } else if (c == 1) {
                l = Long.valueOf(jsonReader.nextLong());
            } else if (c == 2) {
                l2 = Long.valueOf(jsonReader.nextLong());
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                str2 = new String(Base64.decode(jsonReader.nextString(), 2), C4090v.f9975a);
            }
        }
        jsonReader.endObject();
        String str3 = l == null ? " baseAddress" : Objects.EMPTY_STRING;
        if (l2 == null) {
            str3 = C1965a.m4751a(str3, " size");
        }
        if (str == null) {
            str3 = C1965a.m4751a(str3, " name");
        }
        if (str3.isEmpty()) {
            C4069m mVar = new C4069m(l.longValue(), l2.longValue(), str, str2, null);
            return mVar;
        }
        throw new IllegalStateException(C1965a.m4751a("Missing required properties:", str3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:157:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x028c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d m9539e(android.util.JsonReader r21) {
        /*
            r0 = r21
            q.b.d.h.e.m.j$b r1 = new q.b.d.h.e.m.j$b
            r1.<init>()
            r21.beginObject()
        L_0x000a:
            boolean r2 = r21.hasNext()
            if (r2 == 0) goto L_0x034f
            java.lang.String r2 = r21.nextName()
            int r3 = r2.hashCode()
            r4 = 4
            r5 = 2
            r6 = 1
            r7 = 3
            r8 = -1
            switch(r3) {
                case -1335157162: goto L_0x0049;
                case 96801: goto L_0x003f;
                case 107332: goto L_0x0035;
                case 3575610: goto L_0x002b;
                case 55126294: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0053
        L_0x0021:
            java.lang.String r3 = "timestamp"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0053
            r2 = 0
            goto L_0x0054
        L_0x002b:
            java.lang.String r3 = "type"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0053
            r2 = r6
            goto L_0x0054
        L_0x0035:
            java.lang.String r3 = "log"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0053
            r2 = r4
            goto L_0x0054
        L_0x003f:
            java.lang.String r3 = "app"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0053
            r2 = r5
            goto L_0x0054
        L_0x0049:
            java.lang.String r3 = "device"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0053
            r2 = r7
            goto L_0x0054
        L_0x0053:
            r2 = r8
        L_0x0054:
            if (r2 == 0) goto L_0x0343
            if (r2 == r6) goto L_0x0331
            java.lang.String r3 = ""
            java.lang.String r9 = "Missing required properties:"
            r10 = 0
            if (r2 == r5) goto L_0x0178
            if (r2 == r7) goto L_0x00bf
            if (r2 == r4) goto L_0x0067
            r21.skipValue()
            goto L_0x000a
        L_0x0067:
            r21.beginObject()
            r2 = r10
        L_0x006b:
            boolean r4 = r21.hasNext()
            if (r4 == 0) goto L_0x009f
            java.lang.String r4 = r21.nextName()
            int r5 = r4.hashCode()
            r6 = 951530617(0x38b73479, float:8.735894E-5)
            if (r5 == r6) goto L_0x007f
            goto L_0x0089
        L_0x007f:
            java.lang.String r5 = "content"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0089
            r4 = 0
            goto L_0x008a
        L_0x0089:
            r4 = r8
        L_0x008a:
            if (r4 == 0) goto L_0x0090
            r21.skipValue()
            goto L_0x006b
        L_0x0090:
            java.lang.String r2 = r21.nextString()
            if (r2 == 0) goto L_0x0097
            goto L_0x006b
        L_0x0097:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null content"
            r0.<init>(r1)
            throw r0
        L_0x009f:
            r21.endObject()
            if (r2 != 0) goto L_0x00a6
            java.lang.String r3 = " content"
        L_0x00a6:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x00b5
            q.b.d.h.e.m.s r3 = new q.b.d.h.e.m.s
            r3.<init>(r2, r10)
            r1.f9915e = r3
            goto L_0x000a
        L_0x00b5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4751a(r9, r3)
            r0.<init>(r1)
            throw r0
        L_0x00bf:
            q.b.d.h.e.m.r$b r2 = new q.b.d.h.e.m.r$b
            r2.<init>()
            r21.beginObject()
        L_0x00c7:
            boolean r3 = r21.hasNext()
            if (r3 == 0) goto L_0x016d
            java.lang.String r3 = r21.nextName()
            int r9 = r3.hashCode()
            r10 = 5
            switch(r9) {
                case -1708606089: goto L_0x010c;
                case -1455558134: goto L_0x0102;
                case -1439500848: goto L_0x00f8;
                case 279795450: goto L_0x00ee;
                case 976541947: goto L_0x00e4;
                case 1516795582: goto L_0x00da;
                default: goto L_0x00d9;
            }
        L_0x00d9:
            goto L_0x0116
        L_0x00da:
            java.lang.String r9 = "proximityOn"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x0116
            r3 = r7
            goto L_0x0117
        L_0x00e4:
            java.lang.String r9 = "ramUsed"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x0116
            r3 = r10
            goto L_0x0117
        L_0x00ee:
            java.lang.String r9 = "diskUsed"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x0116
            r3 = r5
            goto L_0x0117
        L_0x00f8:
            java.lang.String r9 = "orientation"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x0116
            r3 = r4
            goto L_0x0117
        L_0x0102:
            java.lang.String r9 = "batteryVelocity"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x0116
            r3 = r6
            goto L_0x0117
        L_0x010c:
            java.lang.String r9 = "batteryLevel"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x0116
            r3 = 0
            goto L_0x0117
        L_0x0116:
            r3 = r8
        L_0x0117:
            if (r3 == 0) goto L_0x0161
            if (r3 == r6) goto L_0x0155
            if (r3 == r5) goto L_0x0149
            if (r3 == r7) goto L_0x013d
            if (r3 == r4) goto L_0x0132
            if (r3 == r10) goto L_0x0127
            r21.skipValue()
            goto L_0x00c7
        L_0x0127:
            long r9 = r21.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r2.f9963e = r3
            goto L_0x00c7
        L_0x0132:
            int r3 = r21.nextInt()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.f9962d = r3
            goto L_0x00c7
        L_0x013d:
            boolean r3 = r21.nextBoolean()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.f9961c = r3
            goto L_0x00c7
        L_0x0149:
            long r9 = r21.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r2.f9964f = r3
            goto L_0x00c7
        L_0x0155:
            int r3 = r21.nextInt()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.f9960b = r3
            goto L_0x00c7
        L_0x0161:
            double r9 = r21.nextDouble()
            java.lang.Double r3 = java.lang.Double.valueOf(r9)
            r2.f9959a = r3
            goto L_0x00c7
        L_0x016d:
            r21.endObject()
            q.b.d.h.e.m.v$d$d$c r2 = r2.mo10285a()
            r1.f9914d = r2
            goto L_0x000a
        L_0x0178:
            r21.beginObject()
            r2 = r10
            r12 = r2
            r13 = r12
            r14 = r13
        L_0x017f:
            boolean r4 = r21.hasNext()
            if (r4 == 0) goto L_0x0301
            java.lang.String r4 = r21.nextName()
            int r11 = r4.hashCode()
            switch(r11) {
                case -1332194002: goto L_0x01af;
                case -1090974952: goto L_0x01a5;
                case 555169704: goto L_0x019b;
                case 928737948: goto L_0x0191;
                default: goto L_0x0190;
            }
        L_0x0190:
            goto L_0x01b9
        L_0x0191:
            java.lang.String r11 = "uiOrientation"
            boolean r4 = r4.equals(r11)
            if (r4 == 0) goto L_0x01b9
            r4 = r6
            goto L_0x01ba
        L_0x019b:
            java.lang.String r11 = "customAttributes"
            boolean r4 = r4.equals(r11)
            if (r4 == 0) goto L_0x01b9
            r4 = r7
            goto L_0x01ba
        L_0x01a5:
            java.lang.String r11 = "execution"
            boolean r4 = r4.equals(r11)
            if (r4 == 0) goto L_0x01b9
            r4 = r5
            goto L_0x01ba
        L_0x01af:
            java.lang.String r11 = "background"
            boolean r4 = r4.equals(r11)
            if (r4 == 0) goto L_0x01b9
            r4 = 0
            goto L_0x01ba
        L_0x01b9:
            r4 = r8
        L_0x01ba:
            if (r4 == 0) goto L_0x02f6
            if (r4 == r6) goto L_0x02ed
            if (r4 == r5) goto L_0x01cd
            if (r4 == r7) goto L_0x01c6
            r21.skipValue()
            goto L_0x017f
        L_0x01c6:
            q.b.d.h.e.m.x.a r4 = p213q.p217b.p317d.p322h.p323e.p328m.p329x.C4120a.f9981a
            q.b.d.h.e.m.w r13 = m9535a(r0, r4)
            goto L_0x017f
        L_0x01cd:
            q.b.d.h.e.m.l$b r4 = new q.b.d.h.e.m.l$b
            r4.<init>()
            r21.beginObject()
        L_0x01d5:
            boolean r11 = r21.hasNext()
            if (r11 == 0) goto L_0x02e5
            java.lang.String r11 = r21.nextName()
            int r12 = r11.hashCode()
            switch(r12) {
                case -1337936983: goto L_0x0205;
                case -902467928: goto L_0x01fb;
                case 937615455: goto L_0x01f1;
                case 1481625679: goto L_0x01e7;
                default: goto L_0x01e6;
            }
        L_0x01e6:
            goto L_0x020f
        L_0x01e7:
            java.lang.String r12 = "exception"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x020f
            r11 = r6
            goto L_0x0210
        L_0x01f1:
            java.lang.String r12 = "binaries"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x020f
            r11 = r7
            goto L_0x0210
        L_0x01fb:
            java.lang.String r12 = "signal"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x020f
            r11 = r5
            goto L_0x0210
        L_0x0205:
            java.lang.String r12 = "threads"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x020f
            r11 = 0
            goto L_0x0210
        L_0x020f:
            r11 = r8
        L_0x0210:
            if (r11 == 0) goto L_0x02da
            if (r11 == r6) goto L_0x02d3
            if (r11 == r5) goto L_0x0225
            if (r11 == r7) goto L_0x021c
            r21.skipValue()
            goto L_0x01d5
        L_0x021c:
            q.b.d.h.e.m.x.c r11 = p213q.p217b.p317d.p322h.p323e.p328m.p329x.C4122c.f9983a
            q.b.d.h.e.m.w r11 = m9535a(r0, r11)
            r4.f9927d = r11
            goto L_0x01d5
        L_0x0225:
            r21.beginObject()
            r7 = r10
            r16 = r7
            r17 = r16
        L_0x022d:
            boolean r11 = r21.hasNext()
            if (r11 == 0) goto L_0x029b
            java.lang.String r11 = r21.nextName()
            int r12 = r11.hashCode()
            r15 = -1147692044(0xffffffffbb979bf4, float:-0.0046267454)
            if (r12 == r15) goto L_0x025f
            r15 = 3059181(0x2eaded, float:4.286826E-39)
            if (r12 == r15) goto L_0x0255
            r15 = 3373707(0x337a8b, float:4.72757E-39)
            if (r12 == r15) goto L_0x024b
            goto L_0x0269
        L_0x024b:
            java.lang.String r12 = "name"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0269
            r11 = 0
            goto L_0x026a
        L_0x0255:
            java.lang.String r12 = "code"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0269
            r11 = r6
            goto L_0x026a
        L_0x025f:
            java.lang.String r12 = "address"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0269
            r11 = r5
            goto L_0x026a
        L_0x0269:
            r11 = r8
        L_0x026a:
            if (r11 == 0) goto L_0x028c
            if (r11 == r6) goto L_0x027d
            if (r11 == r5) goto L_0x0274
            r21.skipValue()
            goto L_0x022d
        L_0x0274:
            long r11 = r21.nextLong()
            java.lang.Long r7 = java.lang.Long.valueOf(r11)
            goto L_0x022d
        L_0x027d:
            java.lang.String r17 = r21.nextString()
            if (r17 == 0) goto L_0x0284
            goto L_0x022d
        L_0x0284:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null code"
            r0.<init>(r1)
            throw r0
        L_0x028c:
            java.lang.String r16 = r21.nextString()
            if (r16 == 0) goto L_0x0293
            goto L_0x022d
        L_0x0293:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null name"
            r0.<init>(r1)
            throw r0
        L_0x029b:
            r21.endObject()
            if (r16 != 0) goto L_0x02a3
            java.lang.String r11 = " name"
            goto L_0x02a4
        L_0x02a3:
            r11 = r3
        L_0x02a4:
            if (r17 != 0) goto L_0x02ac
            java.lang.String r12 = " code"
            java.lang.String r11 = p213q.p214a.p215a.p216a.C1965a.m4751a(r11, r12)
        L_0x02ac:
            if (r7 != 0) goto L_0x02b4
            java.lang.String r12 = " address"
            java.lang.String r11 = p213q.p214a.p215a.p216a.C1965a.m4751a(r11, r12)
        L_0x02b4:
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x02c9
            q.b.d.h.e.m.o r11 = new q.b.d.h.e.m.o
            long r18 = r7.longValue()
            r20 = 0
            r15 = r11
            r15.<init>(r16, r17, r18, r20)
            r4.f9926c = r11
            goto L_0x02e2
        L_0x02c9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4751a(r9, r11)
            r0.<init>(r1)
            throw r0
        L_0x02d3:
            q.b.d.h.e.m.v$d$d$a$a$c r7 = m9540f(r21)
            r4.f9925b = r7
            goto L_0x02e2
        L_0x02da:
            q.b.d.h.e.m.x.b r7 = p213q.p217b.p317d.p322h.p323e.p328m.p329x.C4121b.f9982a
            q.b.d.h.e.m.w r7 = m9535a(r0, r7)
            r4.f9924a = r7
        L_0x02e2:
            r7 = 3
            goto L_0x01d5
        L_0x02e5:
            r21.endObject()
            q.b.d.h.e.m.v$d$d$a$a r12 = r4.mo10265a()
            goto L_0x02fe
        L_0x02ed:
            int r2 = r21.nextInt()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x02fe
        L_0x02f6:
            boolean r4 = r21.nextBoolean()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r4)
        L_0x02fe:
            r7 = 3
            goto L_0x017f
        L_0x0301:
            r21.endObject()
            if (r12 != 0) goto L_0x0308
            java.lang.String r3 = " execution"
        L_0x0308:
            if (r2 != 0) goto L_0x0310
            java.lang.String r4 = " uiOrientation"
            java.lang.String r3 = p213q.p214a.p215a.p216a.C1965a.m4751a(r3, r4)
        L_0x0310:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0327
            q.b.d.h.e.m.k r3 = new q.b.d.h.e.m.k
            int r15 = r2.intValue()
            r16 = 0
            r11 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            r1.mo10257a(r3)
            goto L_0x000a
        L_0x0327:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4751a(r9, r3)
            r0.<init>(r1)
            throw r0
        L_0x0331:
            java.lang.String r2 = r21.nextString()
            if (r2 == 0) goto L_0x033b
            r1.f9912b = r2
            goto L_0x000a
        L_0x033b:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null type"
            r0.<init>(r1)
            throw r0
        L_0x0343:
            long r2 = r21.nextLong()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.f9911a = r2
            goto L_0x000a
        L_0x034f:
            r21.endObject()
            q.b.d.h.e.m.v$d$d r0 = r1.mo10258a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p322h.p323e.p328m.p329x.C4125f.m9539e(android.util.JsonReader):q.b.d.h.e.m.v$d$d");
    }

    /* renamed from: f */
    public static C4106c m9540f(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        String str = null;
        String str2 = null;
        C4119w wVar = null;
        C4106c cVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 1;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 3;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 0;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                cVar = m9540f(jsonReader);
            } else if (c == 1) {
                wVar = m9535a(jsonReader, C4123d.f9984a);
            } else if (c == 2) {
                num = Integer.valueOf(jsonReader.nextInt());
            } else if (c == 3) {
                str = jsonReader.nextString();
                if (str == null) {
                    throw new NullPointerException("Null type");
                }
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                str2 = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        String str3 = str == null ? " type" : Objects.EMPTY_STRING;
        if (wVar == null) {
            str3 = C1965a.m4751a(str3, " frames");
        }
        if (num == null) {
            str3 = C1965a.m4751a(str3, " overflowCount");
        }
        if (str3.isEmpty()) {
            C4071n nVar = new C4071n(str, str2, wVar, cVar, num.intValue(), null);
            return nVar;
        }
        throw new IllegalStateException(C1965a.m4751a("Missing required properties:", str3));
    }

    /* renamed from: g */
    public static C4109a m9541g(JsonReader jsonReader) {
        C4079b bVar = new C4079b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c = 2;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                bVar.f9952e = Integer.valueOf(jsonReader.nextInt());
            } else if (c == 1) {
                bVar.f9950c = jsonReader.nextString();
            } else if (c == 2) {
                bVar.f9951d = Long.valueOf(jsonReader.nextLong());
            } else if (c == 3) {
                bVar.f9948a = Long.valueOf(jsonReader.nextLong());
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                String nextString = jsonReader.nextString();
                if (nextString != null) {
                    bVar.f9949b = nextString;
                } else {
                    throw new NullPointerException("Null symbol");
                }
            }
        }
        jsonReader.endObject();
        return bVar.mo10281a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00bb  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p213q.p217b.p317d.p322h.p323e.p328m.C4090v m9542h(android.util.JsonReader r25) {
        /*
            q.b.d.h.e.m.v$a r0 = p213q.p217b.p317d.p322h.p323e.p328m.C4090v.m9515b()
            r25.beginObject()
        L_0x0007:
            boolean r1 = r25.hasNext()
            if (r1 == 0) goto L_0x0528
            java.lang.String r1 = r25.nextName()
            int r2 = r1.hashCode()
            r3 = 2
            java.lang.String r4 = "displayVersion"
            java.lang.String r5 = "platform"
            java.lang.String r6 = "installationUuid"
            java.lang.String r7 = "buildVersion"
            r8 = 1
            r9 = 0
            switch(r2) {
                case -2118372775: goto L_0x0062;
                case -1962630338: goto L_0x0058;
                case -911706486: goto L_0x0050;
                case 344431858: goto L_0x0046;
                case 719853845: goto L_0x003e;
                case 1874684019: goto L_0x0036;
                case 1975623094: goto L_0x002e;
                case 1984987798: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x006c
        L_0x0024:
            java.lang.String r2 = "session"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x006c
            r1 = 6
            goto L_0x006d
        L_0x002e:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x006c
            r1 = 5
            goto L_0x006d
        L_0x0036:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x006c
            r1 = r3
            goto L_0x006d
        L_0x003e:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x006c
            r1 = 3
            goto L_0x006d
        L_0x0046:
            java.lang.String r2 = "gmpAppId"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x006c
            r1 = r8
            goto L_0x006d
        L_0x0050:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x006c
            r1 = 4
            goto L_0x006d
        L_0x0058:
            java.lang.String r2 = "sdkVersion"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x006c
            r1 = r9
            goto L_0x006d
        L_0x0062:
            java.lang.String r2 = "ndkPayload"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x006c
            r1 = 7
            goto L_0x006d
        L_0x006c:
            r1 = -1
        L_0x006d:
            java.lang.String r2 = ""
            java.lang.String r10 = "Missing required properties:"
            java.lang.String r11 = "Null buildVersion"
            r12 = 0
            switch(r1) {
                case 0: goto L_0x0513;
                case 1: goto L_0x04fe;
                case 2: goto L_0x04ef;
                case 3: goto L_0x04da;
                case 4: goto L_0x04c7;
                case 5: goto L_0x04b2;
                case 6: goto L_0x00fe;
                case 7: goto L_0x007b;
                default: goto L_0x0077;
            }
        L_0x0077:
            r25.skipValue()
            goto L_0x0007
        L_0x007b:
            r25.beginObject()
            r1 = r12
            r3 = r1
        L_0x0080:
            boolean r4 = r25.hasNext()
            if (r4 == 0) goto L_0x00db
            java.lang.String r4 = r25.nextName()
            int r5 = r4.hashCode()
            r6 = 97434231(0x5ceba77, float:1.9440643E-35)
            if (r5 == r6) goto L_0x00a3
            r6 = 106008351(0x6518f1f, float:3.941368E-35)
            if (r5 == r6) goto L_0x0099
            goto L_0x00ad
        L_0x0099:
            java.lang.String r5 = "orgId"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00ad
            r4 = r8
            goto L_0x00ae
        L_0x00a3:
            java.lang.String r5 = "files"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00ad
            r4 = r9
            goto L_0x00ae
        L_0x00ad:
            r4 = -1
        L_0x00ae:
            if (r4 == 0) goto L_0x00bb
            if (r4 == r8) goto L_0x00b6
            r25.skipValue()
            goto L_0x0080
        L_0x00b6:
            java.lang.String r3 = r25.nextString()
            goto L_0x0080
        L_0x00bb:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r25.beginArray()
        L_0x00c3:
            boolean r4 = r25.hasNext()
            if (r4 == 0) goto L_0x00d1
            q.b.d.h.e.m.v$c$a r4 = m9534a(r25)
            r1.add(r4)
            goto L_0x00c3
        L_0x00d1:
            r25.endArray()
            q.b.d.h.e.m.w r4 = new q.b.d.h.e.m.w
            r4.<init>(r1)
            r1 = r4
            goto L_0x0080
        L_0x00db:
            r25.endObject()
            if (r1 != 0) goto L_0x00e2
            java.lang.String r2 = " files"
        L_0x00e2:
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x00f4
            q.b.d.h.e.m.d r2 = new q.b.d.h.e.m.d
            r2.<init>(r1, r3, r12)
            r1 = r0
            q.b.d.h.e.m.b$b r1 = (p213q.p217b.p317d.p322h.p323e.p328m.C4043b.C4045b) r1
            r1.f9854h = r2
            goto L_0x0007
        L_0x00f4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4751a(r10, r2)
            r0.<init>(r1)
            throw r0
        L_0x00fe:
            q.b.d.h.e.m.f$b r1 = new q.b.d.h.e.m.f$b
            r1.<init>()
            r1.mo10242a(r9)
            r25.beginObject()
        L_0x0109:
            boolean r9 = r25.hasNext()
            if (r9 == 0) goto L_0x04a4
            java.lang.String r9 = r25.nextName()
            int r12 = r9.hashCode()
            java.lang.String r13 = "identifier"
            switch(r12) {
                case -2128794476: goto L_0x0184;
                case -1618432855: goto L_0x017c;
                case -1606742899: goto L_0x0172;
                case -1335157162: goto L_0x0167;
                case -1291329255: goto L_0x015c;
                case 3556: goto L_0x0152;
                case 96801: goto L_0x0148;
                case 3599307: goto L_0x013e;
                case 286956243: goto L_0x0134;
                case 1025385094: goto L_0x012a;
                case 2047016109: goto L_0x011e;
                default: goto L_0x011c;
            }
        L_0x011c:
            goto L_0x018e
        L_0x011e:
            java.lang.String r12 = "generatorType"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x018e
            r9 = 10
            goto L_0x018f
        L_0x012a:
            java.lang.String r12 = "crashed"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x018e
            r9 = 4
            goto L_0x018f
        L_0x0134:
            java.lang.String r12 = "generator"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x018e
            r9 = 0
            goto L_0x018f
        L_0x013e:
            java.lang.String r12 = "user"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x018e
            r9 = 5
            goto L_0x018f
        L_0x0148:
            java.lang.String r12 = "app"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x018e
            r9 = 6
            goto L_0x018f
        L_0x0152:
            java.lang.String r12 = "os"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x018e
            r9 = 7
            goto L_0x018f
        L_0x015c:
            java.lang.String r12 = "events"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x018e
            r9 = 9
            goto L_0x018f
        L_0x0167:
            java.lang.String r12 = "device"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x018e
            r9 = 8
            goto L_0x018f
        L_0x0172:
            java.lang.String r12 = "endedAt"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x018e
            r9 = 3
            goto L_0x018f
        L_0x017c:
            boolean r9 = r9.equals(r13)
            if (r9 == 0) goto L_0x018e
            r9 = r8
            goto L_0x018f
        L_0x0184:
            java.lang.String r12 = "startedAt"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x018e
            r9 = r3
            goto L_0x018f
        L_0x018e:
            r9 = -1
        L_0x018f:
            java.lang.String r12 = "Null version"
            java.lang.String r15 = "version"
            java.lang.String r14 = "Null identifier"
            java.lang.String r17 = " identifier"
            switch(r9) {
                case 0: goto L_0x0490;
                case 1: goto L_0x047e;
                case 2: goto L_0x0473;
                case 3: goto L_0x0468;
                case 4: goto L_0x0460;
                case 5: goto L_0x040a;
                case 6: goto L_0x035b;
                case 7: goto L_0x02d2;
                case 8: goto L_0x01cd;
                case 9: goto L_0x01ab;
                case 10: goto L_0x019f;
                default: goto L_0x019a;
            }
        L_0x019a:
            r25.skipValue()
            goto L_0x04a1
        L_0x019f:
            int r8 = r25.nextInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r1.f9882k = r8
            goto L_0x04a1
        L_0x01ab:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r25.beginArray()
        L_0x01b3:
            boolean r9 = r25.hasNext()
            if (r9 == 0) goto L_0x01c1
            q.b.d.h.e.m.v$d$d r9 = m9539e(r25)
            r8.add(r9)
            goto L_0x01b3
        L_0x01c1:
            r25.endArray()
            q.b.d.h.e.m.w r9 = new q.b.d.h.e.m.w
            r9.<init>(r8)
            r1.f9881j = r9
            goto L_0x04a1
        L_0x01cd:
            q.b.d.h.e.m.i$b r9 = new q.b.d.h.e.m.i$b
            r9.<init>()
            r25.beginObject()
        L_0x01d5:
            boolean r12 = r25.hasNext()
            if (r12 == 0) goto L_0x02c7
            java.lang.String r12 = r25.nextName()
            int r13 = r12.hashCode()
            switch(r13) {
                case -1981332476: goto L_0x0238;
                case -1969347631: goto L_0x022e;
                case 112670: goto L_0x0224;
                case 3002454: goto L_0x021a;
                case 81784169: goto L_0x0210;
                case 94848180: goto L_0x0206;
                case 104069929: goto L_0x01fc;
                case 109757585: goto L_0x01f2;
                case 2078953423: goto L_0x01e7;
                default: goto L_0x01e6;
            }
        L_0x01e6:
            goto L_0x0242
        L_0x01e7:
            java.lang.String r13 = "modelClass"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0242
            r12 = 8
            goto L_0x0243
        L_0x01f2:
            java.lang.String r13 = "state"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0242
            r12 = 6
            goto L_0x0243
        L_0x01fc:
            java.lang.String r13 = "model"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0242
            r12 = r8
            goto L_0x0243
        L_0x0206:
            java.lang.String r13 = "cores"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0242
            r12 = r3
            goto L_0x0243
        L_0x0210:
            java.lang.String r13 = "diskSpace"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0242
            r12 = 4
            goto L_0x0243
        L_0x021a:
            java.lang.String r13 = "arch"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0242
            r12 = 0
            goto L_0x0243
        L_0x0224:
            java.lang.String r13 = "ram"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0242
            r12 = 3
            goto L_0x0243
        L_0x022e:
            java.lang.String r13 = "manufacturer"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0242
            r12 = 7
            goto L_0x0243
        L_0x0238:
            java.lang.String r13 = "simulator"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0242
            r12 = 5
            goto L_0x0243
        L_0x0242:
            r12 = -1
        L_0x0243:
            switch(r12) {
                case 0: goto L_0x02bb;
                case 1: goto L_0x02a9;
                case 2: goto L_0x029d;
                case 3: goto L_0x0291;
                case 4: goto L_0x0285;
                case 5: goto L_0x0279;
                case 6: goto L_0x026d;
                case 7: goto L_0x025b;
                case 8: goto L_0x024a;
                default: goto L_0x0246;
            }
        L_0x0246:
            r25.skipValue()
            goto L_0x01d5
        L_0x024a:
            java.lang.String r12 = r25.nextString()
            if (r12 == 0) goto L_0x0253
            r9.f9905i = r12
            goto L_0x01d5
        L_0x0253:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null modelClass"
            r0.<init>(r1)
            throw r0
        L_0x025b:
            java.lang.String r12 = r25.nextString()
            if (r12 == 0) goto L_0x0265
            r9.f9904h = r12
            goto L_0x01d5
        L_0x0265:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null manufacturer"
            r0.<init>(r1)
            throw r0
        L_0x026d:
            int r12 = r25.nextInt()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r9.f9903g = r12
            goto L_0x01d5
        L_0x0279:
            boolean r12 = r25.nextBoolean()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r9.f9902f = r12
            goto L_0x01d5
        L_0x0285:
            long r12 = r25.nextLong()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r9.f9901e = r12
            goto L_0x01d5
        L_0x0291:
            long r12 = r25.nextLong()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r9.f9900d = r12
            goto L_0x01d5
        L_0x029d:
            int r12 = r25.nextInt()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r9.f9899c = r12
            goto L_0x01d5
        L_0x02a9:
            java.lang.String r12 = r25.nextString()
            if (r12 == 0) goto L_0x02b3
            r9.f9898b = r12
            goto L_0x01d5
        L_0x02b3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null model"
            r0.<init>(r1)
            throw r0
        L_0x02bb:
            int r12 = r25.nextInt()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r9.f9897a = r12
            goto L_0x01d5
        L_0x02c7:
            r25.endObject()
            q.b.d.h.e.m.v$d$c r8 = r9.mo10253a()
            r1.f9880i = r8
            goto L_0x04a1
        L_0x02d2:
            q.b.d.h.e.m.t$b r9 = new q.b.d.h.e.m.t$b
            r9.<init>()
            r25.beginObject()
        L_0x02da:
            boolean r13 = r25.hasNext()
            if (r13 == 0) goto L_0x0350
            java.lang.String r13 = r25.nextName()
            int r14 = r13.hashCode()
            switch(r14) {
                case -911706486: goto L_0x0306;
                case -293026577: goto L_0x02fc;
                case 351608024: goto L_0x02f4;
                case 1874684019: goto L_0x02ec;
                default: goto L_0x02eb;
            }
        L_0x02eb:
            goto L_0x030e
        L_0x02ec:
            boolean r13 = r13.equals(r5)
            if (r13 == 0) goto L_0x030e
            r13 = 0
            goto L_0x030f
        L_0x02f4:
            boolean r13 = r13.equals(r15)
            if (r13 == 0) goto L_0x030e
            r13 = r8
            goto L_0x030f
        L_0x02fc:
            java.lang.String r14 = "jailbroken"
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x030e
            r13 = 3
            goto L_0x030f
        L_0x0306:
            boolean r13 = r13.equals(r7)
            if (r13 == 0) goto L_0x030e
            r13 = r3
            goto L_0x030f
        L_0x030e:
            r13 = -1
        L_0x030f:
            if (r13 == 0) goto L_0x0345
            if (r13 == r8) goto L_0x0336
            if (r13 == r3) goto L_0x0327
            r14 = 3
            if (r13 == r14) goto L_0x031c
            r25.skipValue()
            goto L_0x02da
        L_0x031c:
            boolean r13 = r25.nextBoolean()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r9.f9973d = r13
            goto L_0x02da
        L_0x0327:
            java.lang.String r13 = r25.nextString()
            if (r13 == 0) goto L_0x0330
            r9.f9972c = r13
            goto L_0x02da
        L_0x0330:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r11)
            throw r0
        L_0x0336:
            java.lang.String r13 = r25.nextString()
            if (r13 == 0) goto L_0x033f
            r9.f9971b = r13
            goto L_0x02da
        L_0x033f:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r12)
            throw r0
        L_0x0345:
            int r13 = r25.nextInt()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r9.f9970a = r13
            goto L_0x02da
        L_0x0350:
            r25.endObject()
            q.b.d.h.e.m.v$d$e r8 = r9.mo10292a()
            r1.f9879h = r8
            goto L_0x04a1
        L_0x035b:
            r25.beginObject()
            r9 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = r16
            r21 = r18
            r23 = r19
            r19 = r9
        L_0x036d:
            boolean r9 = r25.hasNext()
            if (r9 == 0) goto L_0x03da
            java.lang.String r9 = r25.nextName()
            int r16 = r9.hashCode()
            switch(r16) {
                case -1618432855: goto L_0x0397;
                case 351608024: goto L_0x038f;
                case 719853845: goto L_0x0387;
                case 1975623094: goto L_0x037f;
                default: goto L_0x037e;
            }
        L_0x037e:
            goto L_0x039f
        L_0x037f:
            boolean r9 = r9.equals(r4)
            if (r9 == 0) goto L_0x039f
            r9 = r3
            goto L_0x03a0
        L_0x0387:
            boolean r9 = r9.equals(r6)
            if (r9 == 0) goto L_0x039f
            r9 = 3
            goto L_0x03a0
        L_0x038f:
            boolean r9 = r9.equals(r15)
            if (r9 == 0) goto L_0x039f
            r9 = r8
            goto L_0x03a0
        L_0x0397:
            boolean r9 = r9.equals(r13)
            if (r9 == 0) goto L_0x039f
            r9 = 0
            goto L_0x03a0
        L_0x039f:
            r9 = -1
        L_0x03a0:
            if (r9 == 0) goto L_0x03ca
            if (r9 == r8) goto L_0x03bb
            r8 = 3
            if (r9 == r3) goto L_0x03b4
            if (r9 == r8) goto L_0x03ad
            r25.skipValue()
            goto L_0x03d2
        L_0x03ad:
            java.lang.String r8 = r25.nextString()
            r23 = r8
            goto L_0x03d2
        L_0x03b4:
            java.lang.String r8 = r25.nextString()
            r21 = r8
            goto L_0x03d2
        L_0x03bb:
            java.lang.String r8 = r25.nextString()
            if (r8 == 0) goto L_0x03c4
            r20 = r8
            goto L_0x03d2
        L_0x03c4:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r12)
            throw r0
        L_0x03ca:
            java.lang.String r8 = r25.nextString()
            if (r8 == 0) goto L_0x03d4
            r19 = r8
        L_0x03d2:
            r8 = 1
            goto L_0x036d
        L_0x03d4:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r14)
            throw r0
        L_0x03da:
            r25.endObject()
            if (r19 != 0) goto L_0x03e2
            r8 = r17
            goto L_0x03e3
        L_0x03e2:
            r8 = r2
        L_0x03e3:
            if (r20 != 0) goto L_0x03eb
            java.lang.String r9 = " version"
            java.lang.String r8 = p213q.p214a.p215a.p216a.C1965a.m4751a(r8, r9)
        L_0x03eb:
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x0400
            q.b.d.h.e.m.g r8 = new q.b.d.h.e.m.g
            r22 = 0
            r24 = 0
            r18 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r1.f9877f = r8
            goto L_0x04a1
        L_0x0400:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4751a(r10, r8)
            r0.<init>(r1)
            throw r0
        L_0x040a:
            r25.beginObject()
            r8 = 0
        L_0x040e:
            boolean r9 = r25.hasNext()
            if (r9 == 0) goto L_0x043e
            java.lang.String r9 = r25.nextName()
            int r12 = r9.hashCode()
            r15 = -1618432855(0xffffffff9f88aca9, float:-5.788388E-20)
            if (r12 == r15) goto L_0x0422
            goto L_0x042a
        L_0x0422:
            boolean r9 = r9.equals(r13)
            if (r9 == 0) goto L_0x042a
            r9 = 0
            goto L_0x042b
        L_0x042a:
            r9 = -1
        L_0x042b:
            if (r9 == 0) goto L_0x0431
            r25.skipValue()
            goto L_0x040e
        L_0x0431:
            java.lang.String r8 = r25.nextString()
            if (r8 == 0) goto L_0x0438
            goto L_0x040e
        L_0x0438:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r14)
            throw r0
        L_0x043e:
            r25.endObject()
            if (r8 != 0) goto L_0x0446
            r9 = r17
            goto L_0x0447
        L_0x0446:
            r9 = r2
        L_0x0447:
            boolean r12 = r9.isEmpty()
            if (r12 == 0) goto L_0x0456
            q.b.d.h.e.m.u r9 = new q.b.d.h.e.m.u
            r12 = 0
            r9.<init>(r8, r12)
            r1.f9878g = r9
            goto L_0x04a1
        L_0x0456:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4751a(r10, r9)
            r0.<init>(r1)
            throw r0
        L_0x0460:
            boolean r8 = r25.nextBoolean()
            r1.mo10242a(r8)
            goto L_0x04a1
        L_0x0468:
            long r8 = r25.nextLong()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r1.f9875d = r8
            goto L_0x04a1
        L_0x0473:
            long r8 = r25.nextLong()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r1.f9874c = r8
            goto L_0x04a1
        L_0x047e:
            java.lang.String r8 = r25.nextString()
            byte[] r8 = android.util.Base64.decode(r8, r3)
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r12 = p213q.p217b.p317d.p322h.p323e.p328m.C4090v.f9975a
            r9.<init>(r8, r12)
            r1.f9873b = r9
            goto L_0x04a1
        L_0x0490:
            java.lang.String r8 = r25.nextString()
            if (r8 == 0) goto L_0x0499
            r1.f9872a = r8
            goto L_0x04a1
        L_0x0499:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null generator"
            r0.<init>(r1)
            throw r0
        L_0x04a1:
            r8 = 1
            goto L_0x0109
        L_0x04a4:
            r25.endObject()
            q.b.d.h.e.m.v$d r1 = r1.mo10243a()
            r2 = r0
            q.b.d.h.e.m.b$b r2 = (p213q.p217b.p317d.p322h.p323e.p328m.C4043b.C4045b) r2
            r2.f9853g = r1
            goto L_0x0007
        L_0x04b2:
            java.lang.String r1 = r25.nextString()
            r2 = r0
            q.b.d.h.e.m.b$b r2 = (p213q.p217b.p317d.p322h.p323e.p328m.C4043b.C4045b) r2
            if (r1 == 0) goto L_0x04bf
            r2.f9852f = r1
            goto L_0x0007
        L_0x04bf:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null displayVersion"
            r0.<init>(r1)
            throw r0
        L_0x04c7:
            java.lang.String r1 = r25.nextString()
            r2 = r0
            q.b.d.h.e.m.b$b r2 = (p213q.p217b.p317d.p322h.p323e.p328m.C4043b.C4045b) r2
            if (r1 == 0) goto L_0x04d4
            r2.f9851e = r1
            goto L_0x0007
        L_0x04d4:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r11)
            throw r0
        L_0x04da:
            java.lang.String r1 = r25.nextString()
            r2 = r0
            q.b.d.h.e.m.b$b r2 = (p213q.p217b.p317d.p322h.p323e.p328m.C4043b.C4045b) r2
            if (r1 == 0) goto L_0x04e7
            r2.f9850d = r1
            goto L_0x0007
        L_0x04e7:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null installationUuid"
            r0.<init>(r1)
            throw r0
        L_0x04ef:
            int r1 = r25.nextInt()
            r2 = r0
            q.b.d.h.e.m.b$b r2 = (p213q.p217b.p317d.p322h.p323e.p328m.C4043b.C4045b) r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.f9849c = r1
            goto L_0x0007
        L_0x04fe:
            java.lang.String r1 = r25.nextString()
            r2 = r0
            q.b.d.h.e.m.b$b r2 = (p213q.p217b.p317d.p322h.p323e.p328m.C4043b.C4045b) r2
            if (r1 == 0) goto L_0x050b
            r2.f9848b = r1
            goto L_0x0007
        L_0x050b:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null gmpAppId"
            r0.<init>(r1)
            throw r0
        L_0x0513:
            java.lang.String r1 = r25.nextString()
            r2 = r0
            q.b.d.h.e.m.b$b r2 = (p213q.p217b.p317d.p322h.p323e.p328m.C4043b.C4045b) r2
            if (r1 == 0) goto L_0x0520
            r2.f9847a = r1
            goto L_0x0007
        L_0x0520:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null sdkVersion"
            r0.<init>(r1)
            throw r0
        L_0x0528:
            r25.endObject()
            q.b.d.h.e.m.v r0 = r0.mo10229a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p322h.p323e.p328m.p329x.C4125f.m9542h(android.util.JsonReader):q.b.d.h.e.m.v");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0016 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p213q.p217b.p317d.p322h.p323e.p328m.C4090v mo10325a(java.lang.String r3) {
        /*
            r2 = this;
            android.util.JsonReader r0 = new android.util.JsonReader     // Catch:{ IllegalStateException -> 0x0017 }
            java.io.StringReader r1 = new java.io.StringReader     // Catch:{ IllegalStateException -> 0x0017 }
            r1.<init>(r3)     // Catch:{ IllegalStateException -> 0x0017 }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x0017 }
            q.b.d.h.e.m.v r3 = m9542h(r0)     // Catch:{ all -> 0x0012 }
            r0.close()     // Catch:{ IllegalStateException -> 0x0017 }
            return r3
        L_0x0012:
            r3 = move-exception
            r0.close()     // Catch:{ all -> 0x0016 }
        L_0x0016:
            throw r3     // Catch:{ IllegalStateException -> 0x0017 }
        L_0x0017:
            r3 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p322h.p323e.p328m.p329x.C4125f.mo10325a(java.lang.String):q.b.d.h.e.m.v");
    }

    /* renamed from: a */
    public static <T> C4119w<T> m9535a(JsonReader jsonReader, C4126a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.mo10323a(jsonReader));
        }
        jsonReader.endArray();
        return new C4119w<>(arrayList);
    }

    /* renamed from: a */
    public String mo10324a(C4090v vVar) {
        C4202d dVar = (C4202d) f9986a;
        if (dVar != null) {
            StringWriter stringWriter = new StringWriter();
            try {
                dVar.mo10390a(vVar, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
        throw null;
    }
}
