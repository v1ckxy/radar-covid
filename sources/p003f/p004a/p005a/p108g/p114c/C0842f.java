package p003f.p004a.p005a.p108g.p114c;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import java.util.List;
import p392u.C4557i;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.g.c.f */
public final class C0842f implements SpinnerAdapter, ListAdapter {

    /* renamed from: e */
    public final int f2408e;

    /* renamed from: f */
    public final SpinnerAdapter f2409f;

    /* renamed from: g */
    public final LayoutInflater f2410g;

    /* renamed from: h */
    public final View f2411h;

    /* renamed from: i */
    public final String f2412i;

    /* renamed from: j */
    public final int f2413j;

    public C0842f(Context context, String str, int i, List<? extends Object> list) {
        if (context == null) {
            C4638h.m10271a("context");
            throw null;
        } else if (str == null) {
            C4638h.m10271a("hintText");
            throw null;
        } else if (list != null) {
            this.f2412i = str;
            this.f2413j = i;
            this.f2408e = 1;
            this.f2409f = new ArrayAdapter(context, this.f2413j, list);
            LayoutInflater from = LayoutInflater.from(context);
            C4638h.m10270a((Object) from, "LayoutInflater.from(context)");
            this.f2410g = from;
            this.f2411h = new View(context);
        } else {
            C4638h.m10271a("objects");
            throw null;
        }
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    public int getCount() {
        int count = this.f2409f.getCount();
        if (count == 0) {
            return 0;
        }
        return count + this.f2408e;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return i == 0 ? this.f2411h : this.f2409f.getDropDownView(i - this.f2408e, null, viewGroup);
    }

    public Object getItem(int i) {
        if (i == 0) {
            return null;
        }
        return this.f2409f.getItem(i - this.f2408e);
    }

    public long getItemId(int i) {
        int i2 = this.f2408e;
        return i >= i2 ? this.f2409f.getItemId(i - i2) : (long) (i - i2);
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        String str;
        View view2;
        if (i == 0) {
            view2 = this.f2410g.inflate(this.f2413j, viewGroup, false);
            if (view2 != null) {
                ((TextView) view2).setText(this.f2412i);
                str = "layoutInflater.inflate(d… = hintText\n            }";
            } else {
                throw new C4557i("null cannot be cast to non-null type android.widget.TextView");
            }
        } else {
            view2 = this.f2409f.getView(i - this.f2408e, null, viewGroup);
            str = "adapter.getView(position - EXTRA, null, parent)";
        }
        C4638h.m10270a((Object) view2, str);
        return view2;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean hasStableIds() {
        return this.f2409f.hasStableIds();
    }

    public boolean isEmpty() {
        return this.f2409f.isEmpty();
    }

    public boolean isEnabled(int i) {
        return i != 0;
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f2409f.registerDataSetObserver(dataSetObserver);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f2409f.unregisterDataSetObserver(dataSetObserver);
    }
}
