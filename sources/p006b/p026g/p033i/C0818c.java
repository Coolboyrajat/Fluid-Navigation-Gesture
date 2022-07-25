package p006b.p026g.p033i;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p006b.p026g.p034j.C0832c;

/* renamed from: b.g.i.c */
public class C0818c implements Spannable {

    /* renamed from: f */
    private final Spannable f3221f;

    /* renamed from: g */
    private final C0819a f3222g;

    /* renamed from: b.g.i.c$a */
    public static final class C0819a {

        /* renamed from: a */
        private final TextPaint f3223a;

        /* renamed from: b */
        private final TextDirectionHeuristic f3224b;

        /* renamed from: c */
        private final int f3225c;

        /* renamed from: d */
        private final int f3226d;

        /* renamed from: e */
        final PrecomputedText.Params f3227e = null;

        /* renamed from: b.g.i.c$a$a */
        public static class C0820a {

            /* renamed from: a */
            private final TextPaint f3228a;

            /* renamed from: b */
            private TextDirectionHeuristic f3229b;

            /* renamed from: c */
            private int f3230c;

            /* renamed from: d */
            private int f3231d;

            public C0820a(TextPaint textPaint) {
                this.f3228a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f3230c = 1;
                    this.f3231d = 1;
                } else {
                    this.f3231d = 0;
                    this.f3230c = 0;
                }
                this.f3229b = Build.VERSION.SDK_INT >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            /* renamed from: a */
            public C0820a mo4530a(int i) {
                this.f3230c = i;
                return this;
            }

            /* renamed from: a */
            public C0820a mo4531a(TextDirectionHeuristic textDirectionHeuristic) {
                this.f3229b = textDirectionHeuristic;
                return this;
            }

            /* renamed from: a */
            public C0819a mo4532a() {
                return new C0819a(this.f3228a, this.f3229b, this.f3230c, this.f3231d);
            }

            /* renamed from: b */
            public C0820a mo4533b(int i) {
                this.f3231d = i;
                return this;
            }
        }

        public C0819a(PrecomputedText.Params params) {
            this.f3223a = params.getTextPaint();
            this.f3224b = params.getTextDirection();
            this.f3225c = params.getBreakStrategy();
            this.f3226d = params.getHyphenationFrequency();
        }

        C0819a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f3223a = textPaint;
            this.f3224b = textDirectionHeuristic;
            this.f3225c = i;
            this.f3226d = i2;
        }

        /* renamed from: a */
        public int mo4522a() {
            return this.f3225c;
        }

        /* renamed from: a */
        public boolean mo4523a(C0819a aVar) {
            PrecomputedText.Params params = this.f3227e;
            if (params != null) {
                return params.equals(aVar.f3227e);
            }
            if ((Build.VERSION.SDK_INT >= 23 && (this.f3225c != aVar.mo4522a() || this.f3226d != aVar.mo4524b())) || this.f3223a.getTextSize() != aVar.mo4526d().getTextSize() || this.f3223a.getTextScaleX() != aVar.mo4526d().getTextScaleX() || this.f3223a.getTextSkewX() != aVar.mo4526d().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f3223a.getLetterSpacing() != aVar.mo4526d().getLetterSpacing() || !TextUtils.equals(this.f3223a.getFontFeatureSettings(), aVar.mo4526d().getFontFeatureSettings()))) || this.f3223a.getFlags() != aVar.mo4526d().getFlags()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f3223a.getTextLocales().equals(aVar.mo4526d().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f3223a.getTextLocale().equals(aVar.mo4526d().getTextLocale())) {
                return false;
            }
            return this.f3223a.getTypeface() == null ? aVar.mo4526d().getTypeface() == null : this.f3223a.getTypeface().equals(aVar.mo4526d().getTypeface());
        }

        /* renamed from: b */
        public int mo4524b() {
            return this.f3226d;
        }

        /* renamed from: c */
        public TextDirectionHeuristic mo4525c() {
            return this.f3224b;
        }

        /* renamed from: d */
        public TextPaint mo4526d() {
            return this.f3223a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0819a)) {
                return false;
            }
            C0819a aVar = (C0819a) obj;
            if (!mo4523a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.f3224b == aVar.mo4525c();
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return C0832c.m4524a(Float.valueOf(this.f3223a.getTextSize()), Float.valueOf(this.f3223a.getTextScaleX()), Float.valueOf(this.f3223a.getTextSkewX()), Float.valueOf(this.f3223a.getLetterSpacing()), Integer.valueOf(this.f3223a.getFlags()), this.f3223a.getTextLocales(), this.f3223a.getTypeface(), Boolean.valueOf(this.f3223a.isElegantTextHeight()), this.f3224b, Integer.valueOf(this.f3225c), Integer.valueOf(this.f3226d));
            } else if (i >= 21) {
                return C0832c.m4524a(Float.valueOf(this.f3223a.getTextSize()), Float.valueOf(this.f3223a.getTextScaleX()), Float.valueOf(this.f3223a.getTextSkewX()), Float.valueOf(this.f3223a.getLetterSpacing()), Integer.valueOf(this.f3223a.getFlags()), this.f3223a.getTextLocale(), this.f3223a.getTypeface(), Boolean.valueOf(this.f3223a.isElegantTextHeight()), this.f3224b, Integer.valueOf(this.f3225c), Integer.valueOf(this.f3226d));
            } else if (i >= 18) {
                return C0832c.m4524a(Float.valueOf(this.f3223a.getTextSize()), Float.valueOf(this.f3223a.getTextScaleX()), Float.valueOf(this.f3223a.getTextSkewX()), Integer.valueOf(this.f3223a.getFlags()), this.f3223a.getTextLocale(), this.f3223a.getTypeface(), this.f3224b, Integer.valueOf(this.f3225c), Integer.valueOf(this.f3226d));
            } else if (i >= 17) {
                return C0832c.m4524a(Float.valueOf(this.f3223a.getTextSize()), Float.valueOf(this.f3223a.getTextScaleX()), Float.valueOf(this.f3223a.getTextSkewX()), Integer.valueOf(this.f3223a.getFlags()), this.f3223a.getTextLocale(), this.f3223a.getTypeface(), this.f3224b, Integer.valueOf(this.f3225c), Integer.valueOf(this.f3226d));
            } else {
                return C0832c.m4524a(Float.valueOf(this.f3223a.getTextSize()), Float.valueOf(this.f3223a.getTextScaleX()), Float.valueOf(this.f3223a.getTextSkewX()), Integer.valueOf(this.f3223a.getFlags()), this.f3223a.getTypeface(), this.f3224b, Integer.valueOf(this.f3225c), Integer.valueOf(this.f3226d));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x00e3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "{"
                r0.<init>(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "textSize="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f3223a
                float r2 = r2.getTextSize()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textScaleX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f3223a
                float r2 = r2.getTextScaleX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textSkewX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f3223a
                float r2 = r2.getTextSkewX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 21
                if (r1 < r2) goto L_0x008f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", letterSpacing="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f3223a
                float r2 = r2.getLetterSpacing()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", elegantTextHeight="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f3223a
                boolean r2 = r2.isElegantTextHeight()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L_0x008f:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 24
                java.lang.String r3 = ", textLocale="
                if (r1 < r2) goto L_0x00b0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                android.text.TextPaint r2 = r4.f3223a
                android.os.LocaleList r2 = r2.getTextLocales()
            L_0x00a5:
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                goto L_0x00c3
            L_0x00b0:
                r2 = 17
                if (r1 < r2) goto L_0x00c3
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                android.text.TextPaint r2 = r4.f3223a
                java.util.Locale r2 = r2.getTextLocale()
                goto L_0x00a5
            L_0x00c3:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", typeface="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f3223a
                android.graphics.Typeface r2 = r2.getTypeface()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 26
                if (r1 < r2) goto L_0x00fd
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", variationSettings="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f3223a
                java.lang.String r2 = r2.getFontVariationSettings()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L_0x00fd:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textDir="
                r1.append(r2)
                android.text.TextDirectionHeuristic r2 = r4.f3224b
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", breakStrategy="
                r1.append(r2)
                int r2 = r4.f3225c
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", hyphenationFrequency="
                r1.append(r2)
                int r2 = r4.f3226d
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p006b.p026g.p033i.C0818c.C0819a.toString():java.lang.String");
        }
    }

    /* renamed from: a */
    public C0819a mo4510a() {
        return this.f3222g;
    }

    public char charAt(int i) {
        return this.f3221f.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f3221f.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f3221f.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f3221f.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return this.f3221f.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f3221f.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f3221f.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            this.f3221f.removeSpan(obj);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            this.f3221f.setSpan(obj, i, i2, i3);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f3221f.subSequence(i, i2);
    }

    public String toString() {
        return this.f3221f.toString();
    }
}
