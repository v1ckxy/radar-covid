package p124p.p165i.p166a;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import p124p.p126b.p136q.C1200o0;

/* renamed from: p.i.a.b */
public class C1455b extends Filter {

    /* renamed from: a */
    public C1456a f4269a;

    /* renamed from: p.i.a.b$a */
    public interface C1456a {
    }

    public C1455b(C1456a aVar) {
        this.f4269a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return ((C1200o0) this.f4269a).mo5279b((Cursor) obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        /*
            r4 = this;
            p.i.a.b$a r0 = r4.f4269a
            p.b.q.o0 r0 = (p124p.p126b.p136q.C1200o0) r0
            r1 = 0
            if (r0 == 0) goto L_0x004e
            if (r5 != 0) goto L_0x000c
            java.lang.String r5 = ""
            goto L_0x0010
        L_0x000c:
            java.lang.String r5 = r5.toString()
        L_0x0010:
            androidx.appcompat.widget.SearchView r2 = r0.f3381p
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0037
            androidx.appcompat.widget.SearchView r2 = r0.f3381p
            int r2 = r2.getWindowVisibility()
            if (r2 == 0) goto L_0x0021
            goto L_0x0037
        L_0x0021:
            android.app.SearchableInfo r2 = r0.f3382q     // Catch:{ RuntimeException -> 0x002f }
            r3 = 50
            android.database.Cursor r5 = r0.mo5273a(r2, r5, r3)     // Catch:{ RuntimeException -> 0x002f }
            if (r5 == 0) goto L_0x0037
            r5.getCount()     // Catch:{ RuntimeException -> 0x002f }
            goto L_0x0038
        L_0x002f:
            r5 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r2 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r2, r5)
        L_0x0037:
            r5 = r1
        L_0x0038:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r5 == 0) goto L_0x0048
            int r1 = r5.getCount()
            r0.count = r1
            r0.values = r5
            goto L_0x004d
        L_0x0048:
            r5 = 0
            r0.count = r5
            r0.values = r1
        L_0x004d:
            return r0
        L_0x004e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p165i.p166a.C1455b.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public void publishResults(CharSequence charSequence, FilterResults filterResults) {
        C1456a aVar = this.f4269a;
        Cursor cursor = ((C1452a) aVar).f4261g;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((C1200o0) aVar).mo5277a((Cursor) obj);
        }
    }
}
