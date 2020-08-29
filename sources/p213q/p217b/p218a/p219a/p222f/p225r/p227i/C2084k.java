package p213q.p217b.p218a.p219a.p222f.p225r.p227i;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p124p.p126b.p127k.C1061o;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p219a.C1966a;
import p213q.p217b.p218a.p219a.p222f.C2003a;
import p213q.p217b.p218a.p219a.p222f.C2003a.C2005b;
import p213q.p217b.p218a.p219a.p222f.C2006b;
import p213q.p217b.p218a.p219a.p222f.C2006b.C2008b;
import p213q.p217b.p218a.p219a.p222f.C2012e;
import p213q.p217b.p218a.p219a.p222f.C2013f;
import p213q.p217b.p218a.p219a.p222f.C2013f.C2014a;
import p213q.p217b.p218a.p219a.p222f.C2018i;
import p213q.p217b.p218a.p219a.p222f.C2018i.C2019a;
import p213q.p217b.p218a.p219a.p222f.p228s.C2096a;
import p213q.p217b.p218a.p219a.p222f.p228s.C2097b;
import p213q.p217b.p218a.p219a.p222f.p228s.C2097b.C2098a;
import p213q.p217b.p218a.p219a.p222f.p229t.C2099a;
import p213q.p217b.p218a.p219a.p222f.p230u.C2104a;

/* renamed from: q.b.a.a.f.r.i.k */
public class C2084k implements C2076c, C2097b {

    /* renamed from: i */
    public static final C1966a f5922i = new C1966a("proto");

    /* renamed from: e */
    public final C2093q f5923e;

    /* renamed from: f */
    public final C2099a f5924f;

    /* renamed from: g */
    public final C2099a f5925g;

    /* renamed from: h */
    public final C2077d f5926h;

    /* renamed from: q.b.a.a.f.r.i.k$b */
    public interface C2086b<T, U> {
        /* renamed from: a */
        U mo7064a(T t);
    }

    /* renamed from: q.b.a.a.f.r.i.k$c */
    public static class C2087c {

        /* renamed from: a */
        public final String f5927a;

        /* renamed from: b */
        public final String f5928b;

        public /* synthetic */ C2087c(String str, String str2, C2085a aVar) {
            this.f5927a = str;
            this.f5928b = str2;
        }
    }

    public C2084k(C2099a aVar, C2099a aVar2, C2077d dVar, C2093q qVar) {
        this.f5923e = qVar;
        this.f5924f = aVar;
        this.f5925g = aVar2;
        this.f5926h = dVar;
    }

    /* renamed from: a */
    public static /* synthetic */ Long m4847a(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0);
    }

    /* renamed from: a */
    public static <T> T m4850a(Cursor cursor, C2086b<Cursor, T> bVar) {
        try {
            return bVar.mo7064a(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Object m4852a(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 10").execute();
        return null;
    }

    /* renamed from: a */
    public static /* synthetic */ Object m4853a(Throwable th) {
        throw new C2096a("Timed out while trying to acquire the lock.", th);
    }

    /* renamed from: a */
    public static /* synthetic */ Object m4854a(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C2087c(cursor.getString(1), cursor.getString(2), null));
        }
        return null;
    }

    /* renamed from: b */
    public static /* synthetic */ SQLiteDatabase m4856b(Throwable th) {
        throw new C2096a("Timed out while trying to open db.", th);
    }

    /* renamed from: b */
    public static /* synthetic */ Long m4857b(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* renamed from: d */
    public static /* synthetic */ byte[] m4862d(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* renamed from: a */
    public SQLiteDatabase mo7065a() {
        C2093q qVar = this.f5923e;
        qVar.getClass();
        long a = this.f5925g.mo7076a();
        while (true) {
            try {
                return qVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f5925g.mo7076a() < ((long) ((C2073a) this.f5926h).f5910d) + a) {
                    SystemClock.sleep(50);
                } else {
                    m4856b((Throwable) e);
                    throw null;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo7057a(Iterable<C2081h> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder a = C1965a.m4756a("DELETE FROM events WHERE _id in ");
            a.append(m4860c(iterable));
            mo7065a().compileStatement(a.toString()).execute();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public long mo7059b(C2018i iVar) {
        Cursor rawQuery = mo7065a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{((C2006b) iVar).f5762a, String.valueOf(C2104a.m4891a(((C2006b) iVar).f5764c))});
        try {
            Long a = m4847a(rawQuery);
            rawQuery.close();
            return a.longValue();
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public int mo7061c() {
        long a = this.f5924f.mo7076a() - ((C2073a) this.f5926h).f5911e;
        SQLiteDatabase a2 = mo7065a();
        a2.beginTransaction();
        try {
            Integer a3 = Integer.valueOf(a2.delete("events", "timestamp_ms < ?", new String[]{String.valueOf(a)}));
            a2.setTransactionSuccessful();
            a2.endTransaction();
            return a3.intValue();
        } catch (Throwable th) {
            a2.endTransaction();
            throw th;
        }
    }

    public void close() {
        this.f5923e.close();
    }

    /* renamed from: j */
    public Iterable<C2018i> mo7063j() {
        SQLiteDatabase a = mo7065a();
        a.beginTransaction();
        try {
            List b = m4858b(a);
            a.setTransactionSuccessful();
            return b;
        } finally {
            a.endTransaction();
        }
    }

    /* renamed from: a */
    public final Long mo7066a(SQLiteDatabase sQLiteDatabase, C2018i iVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        C2006b bVar = (C2006b) iVar;
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{((C2006b) iVar).f5762a, String.valueOf(C2104a.m4891a(bVar.f5764c))}));
        if (bVar.f5763b != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bVar.f5763b, 0));
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return m4857b(query);
        } finally {
            query.close();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public boolean mo7062c(C2018i iVar) {
        SQLiteDatabase a = mo7065a();
        a.beginTransaction();
        try {
            Boolean a2 = m4845a(this, iVar, a);
            a.setTransactionSuccessful();
            a.endTransaction();
            return a2.booleanValue();
        } catch (Throwable th) {
            a.endTransaction();
            throw th;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ List m4858b(SQLiteDatabase sQLiteDatabase) {
        return (List) m4850a(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), (C2086b<Cursor, T>) C2082i.f5920a);
    }

    /* renamed from: b */
    public static /* synthetic */ List m4859b(C2084k kVar, C2018i iVar, SQLiteDatabase sQLiteDatabase) {
        C2084k kVar2 = kVar;
        C2018i iVar2 = iVar;
        if (kVar2 != null) {
            ArrayList arrayList = new ArrayList();
            Long a = kVar.mo7066a(sQLiteDatabase, iVar);
            if (a != null) {
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                Cursor query = sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{a.toString()}, null, null, null, String.valueOf(((C2073a) kVar2.f5926h).f5909c));
                try {
                    m4855a(kVar, (List) arrayList, iVar, query);
                    query.close();
                } catch (Throwable th) {
                    Throwable th2 = th;
                    query.close();
                    throw th2;
                }
            }
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder("event_id IN (");
            for (int i = 0; i < arrayList.size(); i++) {
                sb.append(((C2075b) ((C2081h) arrayList.get(i))).f5913a);
                if (i < arrayList.size() - 1) {
                    sb.append(',');
                }
            }
            sb.append(')');
            SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase;
            Cursor query2 = sQLiteDatabase3.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
            try {
                m4854a((Map) hashMap, query2);
                query2.close();
                ListIterator listIterator = arrayList.listIterator();
                while (listIterator.hasNext()) {
                    C2075b bVar = (C2075b) ((C2081h) listIterator.next());
                    if (hashMap.containsKey(Long.valueOf(bVar.f5913a))) {
                        C2014a a2 = bVar.f5915c.mo7012a();
                        for (C2087c cVar : (Set) hashMap.get(Long.valueOf(bVar.f5913a))) {
                            a2.mo7014a(cVar.f5927a, cVar.f5928b);
                        }
                        listIterator.set(new C2075b(bVar.f5913a, bVar.f5914b, a2.mo7000a()));
                    }
                }
                return arrayList;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                query2.close();
                throw th4;
            }
        } else {
            throw null;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ List m4861c(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            C2019a a = C2018i.m4802a();
            a.mo7005a(cursor.getString(1));
            a.mo7006a(C2104a.m4892a(cursor.getInt(2)));
            String string = cursor.getString(3);
            C2008b bVar = (C2008b) a;
            bVar.f5766b = string == null ? null : Base64.decode(string, 0);
            arrayList.add(bVar.mo7007a());
        }
        return arrayList;
    }

    /* renamed from: c */
    public static String m4860c(Iterable<C2081h> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C2075b) ((C2081h) it.next())).f5913a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: a */
    public static /* synthetic */ Boolean m4845a(C2084k kVar, C2018i iVar, SQLiteDatabase sQLiteDatabase) {
        Long a = kVar.mo7066a(sQLiteDatabase, iVar);
        if (a == null) {
            return Boolean.valueOf(false);
        }
        return (Boolean) m4850a(kVar.mo7065a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{a.toString()}), (C2086b<Cursor, T>) C2083j.f5921a);
    }

    /* renamed from: a */
    public static /* synthetic */ Object m4855a(C2084k kVar, List list, C2018i iVar, Cursor cursor) {
        C1966a aVar;
        C1966a aVar2;
        Cursor cursor2 = cursor;
        while (cursor.moveToNext()) {
            long j = cursor2.getLong(0);
            boolean z = cursor2.getInt(7) != 0;
            C2005b bVar = new C2005b();
            bVar.f5761f = new HashMap();
            bVar.mo6998a(cursor2.getString(1));
            bVar.mo6997a(cursor2.getLong(2));
            bVar.mo7002b(cursor2.getLong(3));
            if (z) {
                String string = cursor2.getString(4);
                if (string == null) {
                    aVar2 = f5922i;
                } else {
                    aVar2 = new C1966a(string);
                }
                bVar.mo6999a(new C2012e(aVar2, cursor2.getBlob(5)));
            } else {
                String string2 = cursor2.getString(4);
                if (string2 == null) {
                    aVar = f5922i;
                } else {
                    aVar = new C1966a(string2);
                }
                Cursor query = kVar.mo7065a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                try {
                    byte[] d = m4862d(query);
                    query.close();
                    bVar.mo6999a(new C2012e(aVar, d));
                } catch (Throwable th) {
                    Throwable th2 = th;
                    query.close();
                    throw th2;
                }
            }
            if (!cursor2.isNull(6)) {
                bVar.f5757b = Integer.valueOf(cursor2.getInt(6));
            }
            list.add(new C2075b(j, iVar, bVar.mo7000a()));
        }
        return null;
    }

    /* renamed from: a */
    public static /* synthetic */ Long m4848a(C2084k kVar, C2018i iVar, C2013f fVar, SQLiteDatabase sQLiteDatabase) {
        long j;
        int i = ((kVar.mo7065a().compileStatement("PRAGMA page_size").simpleQueryForLong() * kVar.mo7065a().compileStatement("PRAGMA page_count").simpleQueryForLong()) > ((C2073a) kVar.f5926h).f5908b ? 1 : ((kVar.mo7065a().compileStatement("PRAGMA page_size").simpleQueryForLong() * kVar.mo7065a().compileStatement("PRAGMA page_count").simpleQueryForLong()) == ((C2073a) kVar.f5926h).f5908b ? 0 : -1));
        Integer valueOf = Integer.valueOf(0);
        if (i >= 0) {
            return Long.valueOf(-1);
        }
        Long a = kVar.mo7066a(sQLiteDatabase, iVar);
        if (a != null) {
            j = a.longValue();
        } else {
            ContentValues contentValues = new ContentValues();
            C2006b bVar = (C2006b) iVar;
            contentValues.put("backend_name", bVar.f5762a);
            contentValues.put("priority", Integer.valueOf(C2104a.m4891a(bVar.f5764c)));
            contentValues.put("next_request_ms", valueOf);
            byte[] bArr = bVar.f5763b;
            if (bArr != null) {
                contentValues.put("extras", Base64.encodeToString(bArr, 0));
            }
            j = sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        int i2 = ((C2073a) kVar.f5926h).f5912f;
        C2003a aVar = (C2003a) fVar;
        byte[] bArr2 = aVar.f5752c.f5781b;
        boolean z = bArr2.length <= i2;
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(j));
        contentValues2.put("transport_name", aVar.f5750a);
        contentValues2.put("timestamp_ms", Long.valueOf(aVar.f5753d));
        contentValues2.put("uptime_ms", Long.valueOf(aVar.f5754e));
        contentValues2.put("payload_encoding", aVar.f5752c.f5780a.f5630a);
        contentValues2.put("code", aVar.f5751b);
        contentValues2.put("num_attempts", valueOf);
        contentValues2.put("inline", Boolean.valueOf(z));
        contentValues2.put("payload", z ? bArr2 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues2);
        String str = "event_id";
        if (!z) {
            int ceil = (int) Math.ceil(((double) bArr2.length) / ((double) i2));
            for (int i3 = 1; i3 <= ceil; i3++) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i3 - 1) * i2, Math.min(i3 * i2, bArr2.length));
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put(str, Long.valueOf(insert));
                contentValues3.put("sequence_num", Integer.valueOf(i3));
                contentValues3.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues3);
            }
        }
        for (Entry entry : Collections.unmodifiableMap(aVar.f5755f).entrySet()) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put(str, Long.valueOf(insert));
            contentValues4.put("name", (String) entry.getKey());
            contentValues4.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues4);
        }
        return Long.valueOf(insert);
    }

    /* renamed from: b */
    public void mo7060b(Iterable<C2081h> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder a = C1965a.m4756a("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            a.append(m4860c(iterable));
            String sb = a.toString();
            SQLiteDatabase a2 = mo7065a();
            a2.beginTransaction();
            try {
                m4852a(sb, a2);
                a2.setTransactionSuccessful();
            } finally {
                a2.endTransaction();
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Object m4849a(long j, C2018i iVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        C2006b bVar = (C2006b) iVar;
        String str = "transport_contexts";
        if (sQLiteDatabase.update(str, contentValues, "backend_name = ? and priority = ?", new String[]{((C2006b) iVar).f5762a, String.valueOf(C2104a.m4891a(bVar.f5764c))}) < 1) {
            contentValues.put("backend_name", bVar.f5762a);
            contentValues.put("priority", Integer.valueOf(C2104a.m4891a(bVar.f5764c)));
            sQLiteDatabase.insert(str, null, contentValues);
        }
        return null;
    }

    /* renamed from: a */
    public Iterable<C2081h> mo7055a(C2018i iVar) {
        SQLiteDatabase a = mo7065a();
        a.beginTransaction();
        try {
            List b = m4859b(this, iVar, a);
            a.setTransactionSuccessful();
            return b;
        } finally {
            a.endTransaction();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public C2081h mo7056a(C2018i iVar, C2013f fVar) {
        C1061o.m2501a("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", ((C2006b) iVar).f5764c, ((C2003a) fVar).f5750a, ((C2006b) iVar).f5762a);
        SQLiteDatabase a = mo7065a();
        a.beginTransaction();
        try {
            Long a2 = m4848a(this, iVar, fVar, a);
            a.setTransactionSuccessful();
            a.endTransaction();
            long longValue = a2.longValue();
            if (longValue < 1) {
                return null;
            }
            return new C2075b(longValue, iVar, fVar);
        } catch (Throwable th) {
            a.endTransaction();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo7058a(C2018i iVar, long j) {
        SQLiteDatabase a = mo7065a();
        a.beginTransaction();
        try {
            m4849a(j, iVar, a);
            a.setTransactionSuccessful();
        } finally {
            a.endTransaction();
        }
    }

    /* renamed from: a */
    public <T> T mo7067a(C2098a<T> aVar) {
        SQLiteDatabase a = mo7065a();
        long a2 = this.f5925g.mo7076a();
        while (true) {
            try {
                a.beginTransaction();
                try {
                    T f = aVar.mo7031f();
                    a.setTransactionSuccessful();
                    return f;
                } finally {
                    a.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f5925g.mo7076a() < ((long) ((C2073a) this.f5926h).f5910d) + a2) {
                    SystemClock.sleep(50);
                } else {
                    m4853a((Throwable) e);
                    throw null;
                }
            }
        }
    }
}
