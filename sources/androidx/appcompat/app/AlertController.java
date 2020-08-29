package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p124p.p126b.C1018a;
import p124p.p126b.C1027j;
import p124p.p126b.p127k.C1059n;

public class AlertController {

    /* renamed from: A */
    public NestedScrollView f21A;

    /* renamed from: B */
    public int f22B = 0;

    /* renamed from: C */
    public Drawable f23C;

    /* renamed from: D */
    public ImageView f24D;

    /* renamed from: E */
    public TextView f25E;

    /* renamed from: F */
    public TextView f26F;

    /* renamed from: G */
    public View f27G;

    /* renamed from: H */
    public ListAdapter f28H;

    /* renamed from: I */
    public int f29I = -1;

    /* renamed from: J */
    public int f30J;

    /* renamed from: K */
    public int f31K;

    /* renamed from: L */
    public int f32L;

    /* renamed from: M */
    public int f33M;

    /* renamed from: N */
    public int f34N;

    /* renamed from: O */
    public int f35O;

    /* renamed from: P */
    public boolean f36P;

    /* renamed from: Q */
    public int f37Q = 0;

    /* renamed from: R */
    public Handler f38R;

    /* renamed from: S */
    public final OnClickListener f39S = new C0006a();

    /* renamed from: a */
    public final Context f40a;

    /* renamed from: b */
    public final C1059n f41b;

    /* renamed from: c */
    public final Window f42c;

    /* renamed from: d */
    public final int f43d;

    /* renamed from: e */
    public CharSequence f44e;

    /* renamed from: f */
    public CharSequence f45f;

    /* renamed from: g */
    public ListView f46g;

    /* renamed from: h */
    public View f47h;

    /* renamed from: i */
    public int f48i;

    /* renamed from: j */
    public int f49j;

    /* renamed from: k */
    public int f50k;

    /* renamed from: l */
    public int f51l;

    /* renamed from: m */
    public int f52m;

    /* renamed from: n */
    public boolean f53n = false;

    /* renamed from: o */
    public Button f54o;

    /* renamed from: p */
    public CharSequence f55p;

    /* renamed from: q */
    public Message f56q;

    /* renamed from: r */
    public Drawable f57r;

    /* renamed from: s */
    public Button f58s;

    /* renamed from: t */
    public CharSequence f59t;

    /* renamed from: u */
    public Message f60u;

    /* renamed from: v */
    public Drawable f61v;

    /* renamed from: w */
    public Button f62w;

    /* renamed from: x */
    public CharSequence f63x;

    /* renamed from: y */
    public Message f64y;

    /* renamed from: z */
    public Drawable f65z;

    public static class RecycleListView extends ListView {

        /* renamed from: e */
        public final int f66e;

        /* renamed from: f */
        public final int f67f;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1027j.RecycleListView);
            this.f67f = obtainStyledAttributes.getDimensionPixelOffset(C1027j.RecycleListView_paddingBottomNoButtons, -1);
            this.f66e = obtainStyledAttributes.getDimensionPixelOffset(C1027j.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    public class C0006a implements OnClickListener {
        public C0006a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
            if (r0 != null) goto L_0x000a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
            r3 = android.os.Message.obtain(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
            if (r0 != null) goto L_0x000a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f54o
                if (r3 != r1) goto L_0x000f
                android.os.Message r0 = r0.f56q
                if (r0 == 0) goto L_0x000f
            L_0x000a:
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L_0x002a
            L_0x000f:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f58s
                if (r3 != r1) goto L_0x001a
                android.os.Message r0 = r0.f60u
                if (r0 == 0) goto L_0x001a
                goto L_0x000a
            L_0x001a:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f62w
                if (r3 != r1) goto L_0x0029
                android.os.Message r3 = r0.f64y
                if (r3 == 0) goto L_0x0029
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x002f
                r3.sendToTarget()
            L_0x002f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f38R
                r1 = 1
                p.b.k.n r3 = r3.f41b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0006a.onClick(android.view.View):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    public static class C0007b {

        /* renamed from: a */
        public final Context f69a;

        /* renamed from: b */
        public final LayoutInflater f70b;

        /* renamed from: c */
        public int f71c = 0;

        /* renamed from: d */
        public Drawable f72d;

        /* renamed from: e */
        public int f73e = 0;

        /* renamed from: f */
        public CharSequence f74f;

        /* renamed from: g */
        public View f75g;

        /* renamed from: h */
        public CharSequence f76h;

        /* renamed from: i */
        public CharSequence f77i;

        /* renamed from: j */
        public DialogInterface.OnClickListener f78j;

        /* renamed from: k */
        public boolean f79k;

        /* renamed from: l */
        public OnCancelListener f80l;

        /* renamed from: m */
        public OnDismissListener f81m;

        /* renamed from: n */
        public OnKeyListener f82n;

        /* renamed from: o */
        public ListAdapter f83o;

        /* renamed from: p */
        public DialogInterface.OnClickListener f84p;

        /* renamed from: q */
        public int f85q;

        /* renamed from: r */
        public View f86r;

        /* renamed from: s */
        public boolean f87s = false;

        /* renamed from: t */
        public boolean f88t;

        /* renamed from: u */
        public int f89u = -1;

        public C0007b(Context context) {
            this.f69a = context;
            this.f79k = true;
            this.f70b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    public static final class C0008c extends Handler {

        /* renamed from: a */
        public WeakReference<DialogInterface> f90a;

        public C0008c(DialogInterface dialogInterface) {
            this.f90a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f90a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    public static class C0009d extends ArrayAdapter<CharSequence> {
        public C0009d(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C1059n nVar, Window window) {
        this.f40a = context;
        this.f41b = nVar;
        this.f42c = window;
        this.f38R = new C0008c(nVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C1027j.AlertDialog, C1018a.alertDialogStyle, 0);
        this.f30J = obtainStyledAttributes.getResourceId(C1027j.AlertDialog_android_layout, 0);
        this.f31K = obtainStyledAttributes.getResourceId(C1027j.AlertDialog_buttonPanelSideLayout, 0);
        this.f32L = obtainStyledAttributes.getResourceId(C1027j.AlertDialog_listLayout, 0);
        this.f33M = obtainStyledAttributes.getResourceId(C1027j.AlertDialog_multiChoiceItemLayout, 0);
        this.f34N = obtainStyledAttributes.getResourceId(C1027j.AlertDialog_singleChoiceItemLayout, 0);
        this.f35O = obtainStyledAttributes.getResourceId(C1027j.AlertDialog_listItemLayout, 0);
        this.f36P = obtainStyledAttributes.getBoolean(C1027j.AlertDialog_showTitle, true);
        this.f43d = obtainStyledAttributes.getDimensionPixelSize(C1027j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        nVar.mo4522a().mo4462a(1);
    }

    /* renamed from: a */
    public static void m12a(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static boolean m13a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m13a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final ViewGroup mo13a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: a */
    public void mo14a(int i) {
        this.f23C = null;
        this.f22B = i;
        ImageView imageView = this.f24D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f24D.setImageResource(this.f22B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: a */
    public void mo15a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f38R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f63x = charSequence;
            this.f64y = message;
            this.f65z = drawable;
        } else if (i == -2) {
            this.f59t = charSequence;
            this.f60u = message;
            this.f61v = drawable;
        } else if (i == -1) {
            this.f55p = charSequence;
            this.f56q = message;
            this.f57r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: a */
    public final void mo16a(Button button) {
        LayoutParams layoutParams = (LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }
}
