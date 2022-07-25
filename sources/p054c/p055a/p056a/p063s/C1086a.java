package p054c.p055a.p056a.p063s;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.C1055m;
import p054c.p055a.p056a.p057n.C1057a;
import p054c.p055a.p056a.p058o.C1058a;
import p054c.p055a.p056a.p062r.C1084a;
import p054c.p055a.p056a.p066v.C1103e;
import p190io.objectbox.android.BuildConfig;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: c.a.a.s.a */
public final class C1086a {

    /* renamed from: c.a.a.s.a$a */
    static final class C1087a extends C3371l implements C3350b<C1041c, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1041c f3773g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1087a(C1041c cVar) {
            super(1);
            this.f3773g = cVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo5155a((C1041c) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo5155a(C1041c cVar) {
            C3370k.m12227b(cVar, "it");
            C1091b.m5487a(this.f3773g);
        }
    }

    /* renamed from: c.a.a.s.a$b */
    static final class C1088b extends C3371l implements C3350b<C1041c, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1041c f3774g;

        /* renamed from: h */
        final /* synthetic */ C3351c f3775h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1088b(C1041c cVar, C3351c cVar2) {
            super(1);
            this.f3774g = cVar;
            this.f3775h = cVar2;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo5156a((C1041c) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo5156a(C1041c cVar) {
            C3370k.m12227b(cVar, "it");
            C3351c cVar2 = this.f3775h;
            C1041c cVar3 = this.f3774g;
            Object text = C1086a.m5472a(cVar3).getText();
            if (text == null) {
                text = BuildConfig.FLAVOR;
            }
            cVar2.mo6125a(cVar3, text);
        }
    }

    /* renamed from: c.a.a.s.a$c */
    static final class C1089c extends C3371l implements C3350b<CharSequence, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1041c f3776g;

        /* renamed from: h */
        final /* synthetic */ boolean f3777h;

        /* renamed from: i */
        final /* synthetic */ Integer f3778i;

        /* renamed from: j */
        final /* synthetic */ boolean f3779j;

        /* renamed from: k */
        final /* synthetic */ C3351c f3780k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1089c(C1041c cVar, boolean z, Integer num, boolean z2, C3351c cVar2) {
            super(1);
            this.f3776g = cVar;
            this.f3777h = z;
            this.f3778i = num;
            this.f3779j = z2;
            this.f3780k = cVar2;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo5157a((CharSequence) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo5157a(CharSequence charSequence) {
            C3351c cVar;
            C3370k.m12227b(charSequence, "it");
            if (!this.f3777h) {
                C1057a.m5383a(this.f3776g, C1055m.POSITIVE, charSequence.length() > 0);
            }
            Integer num = this.f3778i;
            if (num != null) {
                num.intValue();
                C1091b.m5488a(this.f3776g, this.f3777h);
            }
            if (!this.f3779j && (cVar = this.f3780k) != null) {
                cVar.mo6125a(this.f3776g, charSequence);
            }
        }
    }

    /* renamed from: c.a.a.s.a$d */
    static final class C1090d extends C3371l implements C3350b<C1041c, Unit> {

        /* renamed from: g */
        final /* synthetic */ EditText f3781g;

        /* renamed from: h */
        final /* synthetic */ CharSequence f3782h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1090d(EditText editText, CharSequence charSequence) {
            super(1);
            this.f3781g = editText;
            this.f3782h = charSequence;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo5158a((C1041c) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo5158a(C1041c cVar) {
            C3370k.m12227b(cVar, "it");
            this.f3781g.setSelection(this.f3782h.length());
        }
    }

    /* renamed from: a */
    public static final EditText m5472a(C1041c cVar) {
        C3370k.m12227b(cVar, "$this$getInputField");
        EditText editText = m5477b(cVar).getEditText();
        if (editText != null) {
            return editText;
        }
        throw new IllegalStateException("You have not setup this dialog as an input dialog.");
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    public static final C1041c m5473a(C1041c cVar, String str, Integer num, CharSequence charSequence, Integer num2, int i, Integer num3, boolean z, boolean z2, C3351c<? super C1041c, ? super CharSequence, Unit> cVar2) {
        C1041c cVar3 = cVar;
        boolean z3 = z2;
        C3351c<? super C1041c, ? super CharSequence, Unit> cVar4 = cVar2;
        C3370k.m12227b(cVar, "$this$input");
        C1084a.m5469a(cVar, Integer.valueOf(C1095e.md_dialog_stub_input), (View) null, false, false, false, false, 62, (Object) null);
        C1058a.m5388b(cVar, new C1087a(cVar));
        if (!C1057a.m5384a(cVar)) {
            C1041c.m5352b(cVar, 17039370, (CharSequence) null, (C3350b) null, 6, (Object) null);
        }
        if (cVar4 != null && z) {
            C1041c.m5352b(cVar, (Integer) null, (CharSequence) null, new C1088b(cVar, cVar4), 3, (Object) null);
        }
        CharSequence charSequence2 = charSequence;
        m5475a(cVar, charSequence, num2, z3);
        String str2 = str;
        Integer num4 = num;
        m5476a(cVar, str, num, i);
        if (num3 != null) {
            TextInputLayout b = m5477b(cVar);
            b.setCounterEnabled(true);
            b.setCounterMaxLength(num3.intValue());
            C1091b.m5488a(cVar, z3);
        }
        C1103e.f3789a.mo5172a(m5472a(cVar), (C3350b<? super CharSequence, Unit>) new C1089c(cVar, z2, num3, z, cVar2));
        return cVar3;
    }

    /* renamed from: a */
    public static /* synthetic */ C1041c m5474a(C1041c cVar, String str, Integer num, CharSequence charSequence, Integer num2, int i, Integer num3, boolean z, boolean z2, C3351c cVar2, int i2, Object obj) {
        int i3 = i2;
        C3351c cVar3 = null;
        String str2 = (i3 & 1) != 0 ? null : str;
        Integer num4 = (i3 & 2) != 0 ? null : num;
        CharSequence charSequence2 = (i3 & 4) != 0 ? null : charSequence;
        Integer num5 = (i3 & 8) != 0 ? null : num2;
        boolean z3 = true;
        int i4 = (i3 & 16) != 0 ? 1 : i;
        Integer num6 = (i3 & 32) != 0 ? null : num3;
        if ((i3 & 64) == 0) {
            z3 = z;
        }
        boolean z4 = (i3 & PropertyFlags.ID_SELF_ASSIGNABLE) != 0 ? false : z2;
        if ((i3 & PropertyFlags.INDEX_PARTIAL_SKIP_NULL) == 0) {
            cVar3 = cVar2;
        }
        m5473a(cVar, str2, num4, charSequence2, num5, i4, num6, z3, z4, cVar3);
        return cVar;
    }

    /* renamed from: a */
    private static final void m5475a(C1041c cVar, CharSequence charSequence, Integer num, boolean z) {
        Resources resources = cVar.mo5117i().getResources();
        EditText a = m5472a(cVar);
        if (charSequence == null) {
            charSequence = num != null ? resources.getString(num.intValue()) : BuildConfig.FLAVOR;
            C3370k.m12223a((Object) charSequence, "if (prefillRes != null) …tring(prefillRes) else \"\"");
        }
        boolean z2 = true;
        if (charSequence.length() > 0) {
            a.setText(charSequence);
            C1058a.m5389c(cVar, new C1090d(a, charSequence));
        }
        C1055m mVar = C1055m.POSITIVE;
        if (!z) {
            if (!(charSequence.length() > 0)) {
                z2 = false;
            }
        }
        C1057a.m5383a(cVar, mVar, z2);
    }

    /* renamed from: a */
    private static final void m5476a(C1041c cVar, String str, Integer num, int i) {
        Resources resources = cVar.mo5117i().getResources();
        EditText a = m5472a(cVar);
        if (str == null) {
            str = num != null ? resources.getString(num.intValue()) : null;
        }
        a.setHint(str);
        a.setInputType(i);
        C1103e.f3789a.mo5173a((TextView) a, cVar.mo5117i(), Integer.valueOf(C1093c.md_color_content), Integer.valueOf(C1093c.md_color_hint));
        Typeface b = cVar.mo5108b();
        if (b != null) {
            a.setTypeface(b);
        }
    }

    /* renamed from: b */
    public static final TextInputLayout m5477b(C1041c cVar) {
        C3370k.m12227b(cVar, "$this$getInputLayout");
        Object obj = cVar.mo5111d().get("[custom_view_input_layout]");
        if (!(obj instanceof TextInputLayout)) {
            obj = null;
        }
        TextInputLayout textInputLayout = (TextInputLayout) obj;
        if (textInputLayout != null) {
            return textInputLayout;
        }
        TextInputLayout c = m5478c(cVar);
        cVar.mo5111d().put("[custom_view_input_layout]", c);
        return c;
    }

    /* renamed from: c */
    private static final TextInputLayout m5478c(C1041c cVar) {
        View findViewById = C1084a.m5467a(cVar).findViewById(C1094d.md_input_layout);
        if (!(findViewById instanceof TextInputLayout)) {
            findViewById = null;
        }
        TextInputLayout textInputLayout = (TextInputLayout) findViewById;
        if (textInputLayout != null) {
            return textInputLayout;
        }
        throw new IllegalStateException("You have not setup this dialog as an input dialog.");
    }
}
