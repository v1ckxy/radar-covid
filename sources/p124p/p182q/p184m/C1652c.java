package p124p.p182q.p184m;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p124p.p188t.p189a.C1669b;
import p124p.p188t.p189a.p190f.C1676a;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.q.m.c */
public class C1652c {

    /* renamed from: a */
    public final String f4869a;

    /* renamed from: b */
    public final Map<String, C1653a> f4870b;

    /* renamed from: c */
    public final Set<C1654b> f4871c;

    /* renamed from: d */
    public final Set<C1656d> f4872d;

    /* renamed from: p.q.m.c$a */
    public static class C1653a {

        /* renamed from: a */
        public final String f4873a;

        /* renamed from: b */
        public final String f4874b;

        /* renamed from: c */
        public final int f4875c;

        /* renamed from: d */
        public final boolean f4876d;

        /* renamed from: e */
        public final int f4877e;

        /* renamed from: f */
        public final String f4878f;

        /* renamed from: g */
        public final int f4879g;

        public C1653a(String str, String str2, boolean z, int i, String str3, int i2) {
            this.f4873a = str;
            this.f4874b = str2;
            this.f4876d = z;
            this.f4877e = i;
            int i3 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i3 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i3 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.f4875c = i3;
            this.f4878f = str3;
            this.f4879g = i2;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C1653a.class != obj.getClass()) {
                return false;
            }
            C1653a aVar = (C1653a) obj;
            if (this.f4877e != aVar.f4877e || !this.f4873a.equals(aVar.f4873a) || this.f4876d != aVar.f4876d) {
                return false;
            }
            if (this.f4879g == 1 && aVar.f4879g == 2) {
                String str = this.f4878f;
                if (str != null && !str.equals(aVar.f4878f)) {
                    return false;
                }
            }
            if (this.f4879g == 2 && aVar.f4879g == 1) {
                String str2 = aVar.f4878f;
                if (str2 != null && !str2.equals(this.f4878f)) {
                    return false;
                }
            }
            int i = this.f4879g;
            if (i != 0 && i == aVar.f4879g) {
                String str3 = this.f4878f;
                if (str3 == null ? aVar.f4878f != null : !str3.equals(aVar.f4878f)) {
                    return false;
                }
            }
            if (this.f4875c != aVar.f4875c) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (((((this.f4873a.hashCode() * 31) + this.f4875c) * 31) + (this.f4876d ? 1231 : 1237)) * 31) + this.f4877e;
        }

        public String toString() {
            StringBuilder a = C1965a.m4756a("Column{name='");
            a.append(this.f4873a);
            a.append('\'');
            a.append(", type='");
            a.append(this.f4874b);
            a.append('\'');
            a.append(", affinity='");
            a.append(this.f4875c);
            a.append('\'');
            a.append(", notNull=");
            a.append(this.f4876d);
            a.append(", primaryKeyPosition=");
            a.append(this.f4877e);
            a.append(", defaultValue='");
            a.append(this.f4878f);
            a.append('\'');
            a.append('}');
            return a.toString();
        }
    }

    /* renamed from: p.q.m.c$b */
    public static class C1654b {

        /* renamed from: a */
        public final String f4880a;

        /* renamed from: b */
        public final String f4881b;

        /* renamed from: c */
        public final String f4882c;

        /* renamed from: d */
        public final List<String> f4883d;

        /* renamed from: e */
        public final List<String> f4884e;

        public C1654b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f4880a = str;
            this.f4881b = str2;
            this.f4882c = str3;
            this.f4883d = Collections.unmodifiableList(list);
            this.f4884e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1654b.class != obj.getClass()) {
                return false;
            }
            C1654b bVar = (C1654b) obj;
            if (this.f4880a.equals(bVar.f4880a) && this.f4881b.equals(bVar.f4881b) && this.f4882c.equals(bVar.f4882c) && this.f4883d.equals(bVar.f4883d)) {
                return this.f4884e.equals(bVar.f4884e);
            }
            return false;
        }

        public int hashCode() {
            return this.f4884e.hashCode() + ((this.f4883d.hashCode() + ((this.f4882c.hashCode() + ((this.f4881b.hashCode() + (this.f4880a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            StringBuilder a = C1965a.m4756a("ForeignKey{referenceTable='");
            a.append(this.f4880a);
            a.append('\'');
            a.append(", onDelete='");
            a.append(this.f4881b);
            a.append('\'');
            a.append(", onUpdate='");
            a.append(this.f4882c);
            a.append('\'');
            a.append(", columnNames=");
            a.append(this.f4883d);
            a.append(", referenceColumnNames=");
            a.append(this.f4884e);
            a.append('}');
            return a.toString();
        }
    }

    /* renamed from: p.q.m.c$c */
    public static class C1655c implements Comparable<C1655c> {

        /* renamed from: e */
        public final int f4885e;

        /* renamed from: f */
        public final int f4886f;

        /* renamed from: g */
        public final String f4887g;

        /* renamed from: h */
        public final String f4888h;

        public C1655c(int i, int i2, String str, String str2) {
            this.f4885e = i;
            this.f4886f = i2;
            this.f4887g = str;
            this.f4888h = str2;
        }

        public int compareTo(Object obj) {
            C1655c cVar = (C1655c) obj;
            int i = this.f4885e - cVar.f4885e;
            return i == 0 ? this.f4886f - cVar.f4886f : i;
        }
    }

    /* renamed from: p.q.m.c$d */
    public static class C1656d {

        /* renamed from: a */
        public final String f4889a;

        /* renamed from: b */
        public final boolean f4890b;

        /* renamed from: c */
        public final List<String> f4891c;

        public C1656d(String str, boolean z, List<String> list) {
            this.f4889a = str;
            this.f4890b = z;
            this.f4891c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1656d.class != obj.getClass()) {
                return false;
            }
            C1656d dVar = (C1656d) obj;
            if (this.f4890b != dVar.f4890b || !this.f4891c.equals(dVar.f4891c)) {
                return false;
            }
            String str = "index_";
            return this.f4889a.startsWith(str) ? dVar.f4889a.startsWith(str) : this.f4889a.equals(dVar.f4889a);
        }

        public int hashCode() {
            return this.f4891c.hashCode() + ((((this.f4889a.startsWith("index_") ? -1184239155 : this.f4889a.hashCode()) * 31) + (this.f4890b ? 1 : 0)) * 31);
        }

        public String toString() {
            StringBuilder a = C1965a.m4756a("Index{name='");
            a.append(this.f4889a);
            a.append('\'');
            a.append(", unique=");
            a.append(this.f4890b);
            a.append(", columns=");
            a.append(this.f4891c);
            a.append('}');
            return a.toString();
        }
    }

    public C1652c(String str, Map<String, C1653a> map, Set<C1654b> set, Set<C1656d> set2) {
        this.f4869a = str;
        this.f4870b = Collections.unmodifiableMap(map);
        this.f4871c = Collections.unmodifiableSet(set);
        this.f4872d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    /* renamed from: a */
    public static List<C1655c> m4198a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C1655c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public static C1656d m4199a(C1669b bVar, String str, boolean z) {
        Cursor b = ((C1676a) bVar).mo6493b(C1965a.m4752a("PRAGMA index_xinfo(`", str, "`)"));
        try {
            int columnIndex = b.getColumnIndex("seqno");
            int columnIndex2 = b.getColumnIndex("cid");
            int columnIndex3 = b.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (b.moveToNext()) {
                        if (b.getInt(columnIndex2) >= 0) {
                            int i = b.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i), b.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    C1656d dVar = new C1656d(str, z, arrayList);
                    b.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            b.close();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static C1652c m4200a(C1669b bVar, String str) {
        int i;
        int i2;
        List list;
        int i3;
        String str2 = str;
        String str3 = "`)";
        C1676a aVar = (C1676a) bVar;
        Cursor b = aVar.mo6493b(C1965a.m4752a("PRAGMA table_info(`", str2, str3));
        HashMap hashMap = new HashMap();
        try {
            String str4 = "name";
            if (b.getColumnCount() > 0) {
                int columnIndex = b.getColumnIndex(str4);
                int columnIndex2 = b.getColumnIndex("type");
                int columnIndex3 = b.getColumnIndex("notnull");
                int columnIndex4 = b.getColumnIndex("pk");
                int columnIndex5 = b.getColumnIndex("dflt_value");
                while (b.moveToNext()) {
                    String string = b.getString(columnIndex);
                    int i4 = columnIndex;
                    C1653a aVar2 = r12;
                    C1653a aVar3 = new C1653a(string, b.getString(columnIndex2), b.getInt(columnIndex3) != 0, b.getInt(columnIndex4), b.getString(columnIndex5), 2);
                    hashMap.put(string, aVar2);
                    columnIndex = i4;
                }
            }
            b.close();
            HashSet hashSet = new HashSet();
            StringBuilder sb = new StringBuilder();
            sb.append("PRAGMA foreign_key_list(`");
            sb.append(str2);
            sb.append(str3);
            Cursor b2 = aVar.mo6493b(sb.toString());
            try {
                int columnIndex6 = b2.getColumnIndex("id");
                int columnIndex7 = b2.getColumnIndex("seq");
                int columnIndex8 = b2.getColumnIndex("table");
                int columnIndex9 = b2.getColumnIndex("on_delete");
                int columnIndex10 = b2.getColumnIndex("on_update");
                List a = m4198a(b2);
                int count = b2.getCount();
                int i5 = 0;
                while (i5 < count) {
                    b2.moveToPosition(i5);
                    if (b2.getInt(columnIndex7) != 0) {
                        i = columnIndex6;
                        i3 = columnIndex7;
                        list = a;
                        i2 = count;
                    } else {
                        int i6 = b2.getInt(columnIndex6);
                        i = columnIndex6;
                        ArrayList arrayList = new ArrayList();
                        i3 = columnIndex7;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = ((ArrayList) a).iterator();
                        while (it.hasNext()) {
                            List list2 = a;
                            C1655c cVar = (C1655c) it.next();
                            int i7 = count;
                            if (cVar.f4885e == i6) {
                                arrayList.add(cVar.f4887g);
                                arrayList2.add(cVar.f4888h);
                            }
                            a = list2;
                            count = i7;
                        }
                        list = a;
                        i2 = count;
                        C1654b bVar2 = new C1654b(b2.getString(columnIndex8), b2.getString(columnIndex9), b2.getString(columnIndex10), arrayList, arrayList2);
                        hashSet.add(bVar2);
                    }
                    i5++;
                    columnIndex6 = i;
                    columnIndex7 = i3;
                    a = list;
                    count = i2;
                }
                b2.close();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("PRAGMA index_list(`");
                sb2.append(str2);
                sb2.append(str3);
                Cursor b3 = aVar.mo6493b(sb2.toString());
                try {
                    int columnIndex11 = b3.getColumnIndex(str4);
                    int columnIndex12 = b3.getColumnIndex("origin");
                    int columnIndex13 = b3.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1) {
                        if (columnIndex13 != -1) {
                            HashSet hashSet3 = new HashSet();
                            while (b3.moveToNext()) {
                                if ("c".equals(b3.getString(columnIndex12))) {
                                    String string2 = b3.getString(columnIndex11);
                                    boolean z = true;
                                    if (b3.getInt(columnIndex13) != 1) {
                                        z = false;
                                    }
                                    C1656d a2 = m4199a(aVar, string2, z);
                                    if (a2 != null) {
                                        hashSet3.add(a2);
                                    }
                                }
                            }
                            b3.close();
                            hashSet2 = hashSet3;
                            return new C1652c(str2, hashMap, hashSet, hashSet2);
                        }
                    }
                    return new C1652c(str2, hashMap, hashSet, hashSet2);
                } finally {
                    b3.close();
                }
            } catch (Throwable th) {
                b2.close();
                throw th;
            }
        } catch (Throwable th2) {
            b.close();
            throw th2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1652c.class != obj.getClass()) {
            return false;
        }
        C1652c cVar = (C1652c) obj;
        String str = this.f4869a;
        if (str == null ? cVar.f4869a != null : !str.equals(cVar.f4869a)) {
            return false;
        }
        Map<String, C1653a> map = this.f4870b;
        if (map == null ? cVar.f4870b != null : !map.equals(cVar.f4870b)) {
            return false;
        }
        Set<C1654b> set = this.f4871c;
        if (set == null ? cVar.f4871c != null : !set.equals(cVar.f4871c)) {
            return false;
        }
        Set<C1656d> set2 = this.f4872d;
        if (set2 != null) {
            Set<C1656d> set3 = cVar.f4872d;
            if (set3 != null) {
                return set2.equals(set3);
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.f4869a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, C1653a> map = this.f4870b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<C1654b> set = this.f4871c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("TableInfo{name='");
        a.append(this.f4869a);
        a.append('\'');
        a.append(", columns=");
        a.append(this.f4870b);
        a.append(", foreignKeys=");
        a.append(this.f4871c);
        a.append(", indices=");
        a.append(this.f4872d);
        a.append('}');
        return a.toString();
    }
}
