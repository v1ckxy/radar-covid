package p002es.gob.radarcovid.common.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import es.gob.radarcovid.R;
import java.util.ArrayList;
import java.util.HashMap;
import p003f.p004a.p005a.C0699d;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.p136q.C1167f0;
import p392u.C4560l;
import p392u.p393n.C4568g;
import p392u.p401r.p402b.C4607a;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;

/* renamed from: es.gob.radarcovid.common.view.CodeEditText */
public final class CodeEditText extends C1167f0 {

    /* renamed from: t */
    public DeleteDetectionEditText[] f1708t;

    /* renamed from: u */
    public C4618l<? super String, C4560l> f1709u;

    /* renamed from: v */
    public String f1710v;

    /* renamed from: w */
    public HashMap f1711w;

    /* renamed from: es.gob.radarcovid.common.view.CodeEditText$a */
    public static final class C0386a implements TextWatcher {

        /* renamed from: e */
        public final /* synthetic */ DeleteDetectionEditText f1712e;

        /* renamed from: f */
        public final /* synthetic */ int f1713f;

        /* renamed from: g */
        public final /* synthetic */ CodeEditText f1714g;

        public C0386a(DeleteDetectionEditText deleteDetectionEditText, int i, CodeEditText codeEditText) {
            this.f1712e = deleteDetectionEditText;
            this.f1713f = i;
            this.f1714g = codeEditText;
        }

        public void afterTextChanged(Editable editable) {
            if (editable != null) {
                String str = "-";
                if (C4638h.m10272a((Object) editable.toString(), (Object) str)) {
                    this.f1712e.setText(Objects.EMPTY_STRING);
                } else if (editable.length() == 1) {
                    int i = this.f1713f;
                    DeleteDetectionEditText[] deleteDetectionEditTextArr = this.f1714g.f1708t;
                    if (i < deleteDetectionEditTextArr.length - 1) {
                        deleteDetectionEditTextArr[i + 1].requestFocus();
                    }
                }
                if ((!C4638h.m10272a((Object) editable.toString(), (Object) str)) && (!C4638h.m10272a((Object) this.f1714g.getText(), (Object) this.f1714g.getPreviousText()))) {
                    CodeEditText codeEditText = this.f1714g;
                    codeEditText.setPreviousText(codeEditText.getText());
                    C4618l textChangedListener = this.f1714g.getTextChangedListener();
                    if (textChangedListener != null) {
                        C4560l lVar = (C4560l) textChangedListener.mo3153b(this.f1714g.getText());
                    }
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: es.gob.radarcovid.common.view.CodeEditText$b */
    public static final class C0387b extends C4639i implements C4607a<C4560l> {

        /* renamed from: f */
        public final /* synthetic */ int f1715f;

        /* renamed from: g */
        public final /* synthetic */ DeleteDetectionEditText f1716g;

        /* renamed from: h */
        public final /* synthetic */ CodeEditText f1717h;

        public C0387b(int i, DeleteDetectionEditText deleteDetectionEditText, CodeEditText codeEditText) {
            this.f1715f = i;
            this.f1716g = deleteDetectionEditText;
            this.f1717h = codeEditText;
            super(0);
        }

        /* renamed from: c */
        public Object mo3123c() {
            if (this.f1715f > 0) {
                Editable text = this.f1716g.getText();
                String str = Objects.EMPTY_STRING;
                if (text != null) {
                    if (text.length() == 0) {
                        DeleteDetectionEditText deleteDetectionEditText = this.f1717h.f1708t[this.f1715f - 1];
                        deleteDetectionEditText.setText(str);
                        deleteDetectionEditText.requestFocus();
                    }
                }
                this.f1716g.setText(str);
            }
            return C4560l.f10773a;
        }
    }

    /* renamed from: es.gob.radarcovid.common.view.CodeEditText$c */
    public static final class C0388c implements OnTouchListener {

        /* renamed from: e */
        public final /* synthetic */ CodeEditText f1718e;

        public C0388c(CodeEditText codeEditText) {
            this.f1718e = codeEditText;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            CodeEditText.m1301a(this.f1718e);
            return true;
        }
    }

    /* renamed from: es.gob.radarcovid.common.view.CodeEditText$d */
    public static final class C0389d implements OnClickListener {

        /* renamed from: e */
        public final /* synthetic */ CodeEditText f1719e;

        public C0389d(CodeEditText codeEditText) {
            this.f1719e = codeEditText;
        }

        public final void onClick(View view) {
            CodeEditText.m1301a(this.f1719e);
        }
    }

    /* renamed from: es.gob.radarcovid.common.view.CodeEditText$e */
    public static final class C0390e implements InputFilter {
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            return (charSequence == null || !TextUtils.isDigitsOnly(charSequence)) ? "-" : charSequence;
        }
    }

    public CodeEditText(Context context) {
        this(context, null, 0, 6, null);
    }

    public CodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CodeEditText(Context context, AttributeSet attributeSet, int i) {
        if (context != null) {
            super(context, attributeSet, i);
            this.f1710v = Objects.EMPTY_STRING;
            LayoutInflater.from(context).inflate(R.layout.view_code_edittext, this);
            DeleteDetectionEditText deleteDetectionEditText = (DeleteDetectionEditText) mo3114b(C0699d.editTextCode1);
            C4638h.m10270a((Object) deleteDetectionEditText, "editTextCode1");
            DeleteDetectionEditText deleteDetectionEditText2 = (DeleteDetectionEditText) mo3114b(C0699d.editTextCode2);
            C4638h.m10270a((Object) deleteDetectionEditText2, "editTextCode2");
            DeleteDetectionEditText deleteDetectionEditText3 = (DeleteDetectionEditText) mo3114b(C0699d.editTextCode3);
            C4638h.m10270a((Object) deleteDetectionEditText3, "editTextCode3");
            DeleteDetectionEditText deleteDetectionEditText4 = (DeleteDetectionEditText) mo3114b(C0699d.editTextCode4);
            C4638h.m10270a((Object) deleteDetectionEditText4, "editTextCode4");
            DeleteDetectionEditText deleteDetectionEditText5 = (DeleteDetectionEditText) mo3114b(C0699d.editTextCode5);
            C4638h.m10270a((Object) deleteDetectionEditText5, "editTextCode5");
            DeleteDetectionEditText deleteDetectionEditText6 = (DeleteDetectionEditText) mo3114b(C0699d.editTextCode6);
            C4638h.m10270a((Object) deleteDetectionEditText6, "editTextCode6");
            DeleteDetectionEditText deleteDetectionEditText7 = (DeleteDetectionEditText) mo3114b(C0699d.editTextCode7);
            C4638h.m10270a((Object) deleteDetectionEditText7, "editTextCode7");
            DeleteDetectionEditText deleteDetectionEditText8 = (DeleteDetectionEditText) mo3114b(C0699d.editTextCode8);
            C4638h.m10270a((Object) deleteDetectionEditText8, "editTextCode8");
            DeleteDetectionEditText deleteDetectionEditText9 = (DeleteDetectionEditText) mo3114b(C0699d.editTextCode9);
            C4638h.m10270a((Object) deleteDetectionEditText9, "editTextCode9");
            DeleteDetectionEditText deleteDetectionEditText10 = (DeleteDetectionEditText) mo3114b(C0699d.editTextCode10);
            C4638h.m10270a((Object) deleteDetectionEditText10, "editTextCode10");
            DeleteDetectionEditText deleteDetectionEditText11 = (DeleteDetectionEditText) mo3114b(C0699d.editTextCode11);
            C4638h.m10270a((Object) deleteDetectionEditText11, "editTextCode11");
            DeleteDetectionEditText deleteDetectionEditText12 = (DeleteDetectionEditText) mo3114b(C0699d.editTextCode12);
            C4638h.m10270a((Object) deleteDetectionEditText12, "editTextCode12");
            this.f1708t = new DeleteDetectionEditText[]{deleteDetectionEditText, deleteDetectionEditText2, deleteDetectionEditText3, deleteDetectionEditText4, deleteDetectionEditText5, deleteDetectionEditText6, deleteDetectionEditText7, deleteDetectionEditText8, deleteDetectionEditText9, deleteDetectionEditText10, deleteDetectionEditText11, deleteDetectionEditText12};
            setOnClickListener(new C0389d(this));
            DeleteDetectionEditText[] deleteDetectionEditTextArr = this.f1708t;
            int length = deleteDetectionEditTextArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                DeleteDetectionEditText deleteDetectionEditText13 = deleteDetectionEditTextArr[i2];
                int i4 = i3 + 1;
                deleteDetectionEditText13.setFilters(new InputFilter[]{new C0390e(), new LengthFilter(1)});
                deleteDetectionEditText13.addTextChangedListener(new C0386a(deleteDetectionEditText13, i3, this));
                deleteDetectionEditText13.setOnDeleteButtonClickListener(new C0387b(i3, deleteDetectionEditText13, this));
                deleteDetectionEditText13.setOnTouchListener(new C0388c(this));
                i2++;
                i3 = i4;
            }
            return;
        }
        C4638h.m10271a("context");
        throw null;
    }

    public /* synthetic */ CodeEditText(Context context, AttributeSet attributeSet, int i, int i2, C4636f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a A[LOOP:0: B:1:0x0005->B:20:0x003a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0038 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void m1301a(p002es.gob.radarcovid.common.view.CodeEditText r9) {
        /*
            es.gob.radarcovid.common.view.DeleteDetectionEditText[] r0 = r9.f1708t
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x0005:
            r4 = 1
            r5 = 0
            if (r3 >= r1) goto L_0x003d
            r6 = r0[r3]
            android.text.Editable r7 = r6.getText()
            if (r7 == 0) goto L_0x001a
            int r7 = r7.length()
            if (r7 != 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r7 = r2
            goto L_0x001b
        L_0x001a:
            r7 = r4
        L_0x001b:
            if (r7 != 0) goto L_0x0035
            es.gob.radarcovid.common.view.DeleteDetectionEditText[] r7 = r9.f1708t
            int r7 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5170a((T[]) r7, r6)
            es.gob.radarcovid.common.view.DeleteDetectionEditText[] r8 = r9.f1708t
            if (r8 == 0) goto L_0x002f
            int r5 = r8.length
            int r5 = r5 + -1
            if (r7 != r5) goto L_0x002d
            goto L_0x0035
        L_0x002d:
            r5 = r2
            goto L_0x0036
        L_0x002f:
            java.lang.String r9 = "$this$lastIndex"
            p392u.p401r.p403c.C4638h.m10271a(r9)
            throw r5
        L_0x0035:
            r5 = r4
        L_0x0036:
            if (r5 == 0) goto L_0x003a
            r5 = r6
            goto L_0x003d
        L_0x003a:
            int r3 = r3 + 1
            goto L_0x0005
        L_0x003d:
            if (r5 == 0) goto L_0x005d
            r5.requestFocus()
            android.content.Context r9 = r9.getContext()
            java.lang.String r0 = "context"
            p392u.p401r.p403c.C4638h.m10270a(r9, r0)
            java.lang.String r0 = "input_method"
            java.lang.Object r9 = r9.getSystemService(r0)
            android.view.inputmethod.InputMethodManager r9 = (android.view.inputmethod.InputMethodManager) r9
            if (r9 == 0) goto L_0x005d
            android.os.IBinder r0 = r5.getWindowToken()
            r1 = 2
            r9.toggleSoftInputFromWindow(r0, r1, r4)
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.common.view.CodeEditText.m1301a(es.gob.radarcovid.common.view.CodeEditText):void");
    }

    /* renamed from: b */
    public View mo3114b(int i) {
        if (this.f1711w == null) {
            this.f1711w = new HashMap();
        }
        View view = (View) this.f1711w.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f1711w.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final String getPreviousText() {
        return this.f1710v;
    }

    public final String getText() {
        DeleteDetectionEditText[] deleteDetectionEditTextArr = this.f1708t;
        ArrayList arrayList = new ArrayList(deleteDetectionEditTextArr.length);
        for (DeleteDetectionEditText text : deleteDetectionEditTextArr) {
            arrayList.add(text.getText());
        }
        String str = Objects.EMPTY_STRING;
        String str2 = "...";
        if (str == null) {
            C4638h.m10271a("prefix");
            throw null;
        } else if (str == null) {
            C4638h.m10271a("postfix");
            throw null;
        } else if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            C4568g.m10213a(arrayList, sb, Objects.EMPTY_STRING, str, str, -1, str2, null);
            String sb2 = sb.toString();
            C4638h.m10270a((Object) sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
            return sb2;
        } else {
            C4638h.m10271a("truncated");
            throw null;
        }
    }

    public final C4618l<String, C4560l> getTextChangedListener() {
        return this.f1709u;
    }

    public final void setPreviousText(String str) {
        if (str != null) {
            this.f1710v = str;
        } else {
            C4638h.m10271a("<set-?>");
            throw null;
        }
    }

    public final void setTextChangedListener(C4618l<? super String, C4560l> lVar) {
        this.f1709u = lVar;
    }
}
