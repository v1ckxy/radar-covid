package p213q.p217b.p218a.p271c.p295x;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.C3356h;
import p213q.p217b.p218a.p271c.C3369j;

/* renamed from: q.b.a.c.x.e */
public class C3467e extends BaseAdapter {

    /* renamed from: h */
    public static final int f8834h = (VERSION.SDK_INT >= 26 ? 4 : 1);

    /* renamed from: e */
    public final Calendar f8835e;

    /* renamed from: f */
    public final int f8836f;

    /* renamed from: g */
    public final int f8837g = this.f8835e.getFirstDayOfWeek();

    public C3467e() {
        Calendar c = C2286e.m5311c();
        this.f8835e = c;
        this.f8836f = c.getMaximum(7);
    }

    public int getCount() {
        return this.f8836f;
    }

    public Object getItem(int i) {
        int i2 = this.f8836f;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f8837g;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C3356h.mtrl_calendar_day_of_week, viewGroup, false);
        }
        Calendar calendar = this.f8835e;
        int i2 = i + this.f8837g;
        int i3 = this.f8836f;
        if (i2 > i3) {
            i2 -= i3;
        }
        calendar.set(7, i2);
        textView.setText(this.f8835e.getDisplayName(7, f8834h, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C3369j.mtrl_picker_day_of_week_column_header), new Object[]{this.f8835e.getDisplayName(7, 2, Locale.getDefault())}));
        return textView;
    }
}
