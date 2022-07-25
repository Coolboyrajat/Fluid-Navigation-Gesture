package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0099o;
import androidx.appcompat.widget.C0217r0;
import p006b.p007a.C0654a;
import p006b.p007a.C0659f;
import p006b.p007a.C0660g;
import p006b.p007a.C0663j;
import p006b.p026g.p035k.C0890v;

public class ListMenuItemView extends LinearLayout implements C0099o.C0100a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: f */
    private C0086j f322f;

    /* renamed from: g */
    private ImageView f323g;

    /* renamed from: h */
    private RadioButton f324h;

    /* renamed from: i */
    private TextView f325i;

    /* renamed from: j */
    private CheckBox f326j;

    /* renamed from: k */
    private TextView f327k;

    /* renamed from: l */
    private ImageView f328l;

    /* renamed from: m */
    private ImageView f329m;

    /* renamed from: n */
    private LinearLayout f330n;

    /* renamed from: o */
    private Drawable f331o;

    /* renamed from: p */
    private int f332p;

    /* renamed from: q */
    private Context f333q;

    /* renamed from: r */
    private boolean f334r;

    /* renamed from: s */
    private Drawable f335s;

    /* renamed from: t */
    private boolean f336t;

    /* renamed from: u */
    private LayoutInflater f337u;

    /* renamed from: v */
    private boolean f338v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0654a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0217r0 a = C0217r0.m1054a(getContext(), attributeSet, C0663j.MenuView, i, 0);
        this.f331o = a.mo1535b(C0663j.MenuView_android_itemBackground);
        this.f332p = a.mo1544g(C0663j.MenuView_android_itemTextAppearance, -1);
        this.f334r = a.mo1532a(C0663j.MenuView_preserveIconSpacing, false);
        this.f333q = context;
        this.f335s = a.mo1535b(C0663j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, C0654a.dropDownListViewStyle, 0);
        this.f336t = obtainStyledAttributes.hasValue(0);
        a.mo1531a();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m343a(View view) {
        m344a(view, -1);
    }

    /* renamed from: a */
    private void m344a(View view, int i) {
        LinearLayout linearLayout = this.f330n;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: b */
    private void m345b() {
        this.f326j = (CheckBox) getInflater().inflate(C0660g.abc_list_menu_item_checkbox, this, false);
        m343a(this.f326j);
    }

    /* renamed from: c */
    private void m346c() {
        this.f323g = (ImageView) getInflater().inflate(C0660g.abc_list_menu_item_icon, this, false);
        m344a((View) this.f323g, 0);
    }

    /* renamed from: d */
    private void m347d() {
        this.f324h = (RadioButton) getInflater().inflate(C0660g.abc_list_menu_item_radio, this, false);
        m343a(this.f324h);
    }

    private LayoutInflater getInflater() {
        if (this.f337u == null) {
            this.f337u = LayoutInflater.from(getContext());
        }
        return this.f337u;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f328l;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public void mo289a(C0086j jVar, int i) {
        this.f322f = jVar;
        setVisibility(jVar.isVisible() ? 0 : 8);
        setTitle(jVar.mo522a((C0099o.C0100a) this));
        setCheckable(jVar.isCheckable());
        mo316a(jVar.mo558m(), jVar.mo530d());
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.getContentDescription());
    }

    /* renamed from: a */
    public void mo316a(boolean z, char c) {
        int i = (!z || !this.f322f.mo558m()) ? 8 : 0;
        if (i == 0) {
            this.f327k.setText(this.f322f.mo532e());
        }
        if (this.f327k.getVisibility() != i) {
            this.f327k.setVisibility(i);
        }
    }

    /* renamed from: a */
    public boolean mo290a() {
        return false;
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f329m;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f329m.getLayoutParams();
            rect.top += this.f329m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public C0086j getItemData() {
        return this.f322f;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C0890v.m4751a((View) this, this.f331o);
        this.f325i = (TextView) findViewById(C0659f.title);
        int i = this.f332p;
        if (i != -1) {
            this.f325i.setTextAppearance(this.f333q, i);
        }
        this.f327k = (TextView) findViewById(C0659f.shortcut);
        this.f328l = (ImageView) findViewById(C0659f.submenuarrow);
        ImageView imageView = this.f328l;
        if (imageView != null) {
            imageView.setImageDrawable(this.f335s);
        }
        this.f329m = (ImageView) findViewById(C0659f.group_divider);
        this.f330n = (LinearLayout) findViewById(C0659f.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f323g != null && this.f334r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f323g.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f324h != null || this.f326j != null) {
            if (this.f322f.mo550i()) {
                if (this.f324h == null) {
                    m347d();
                }
                compoundButton2 = this.f324h;
                compoundButton = this.f326j;
            } else {
                if (this.f326j == null) {
                    m345b();
                }
                compoundButton2 = this.f326j;
                compoundButton = this.f324h;
            }
            if (z) {
                compoundButton2.setChecked(this.f322f.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f326j;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f324h;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f322f.mo550i()) {
            if (this.f324h == null) {
                m347d();
            }
            compoundButton = this.f324h;
        } else {
            if (this.f326j == null) {
                m345b();
            }
            compoundButton = this.f326j;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f338v = z;
        this.f334r = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f329m;
        if (imageView != null) {
            imageView.setVisibility((this.f336t || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f322f.mo557l() || this.f338v;
        if (!z && !this.f334r) {
            return;
        }
        if (this.f323g != null || drawable != null || this.f334r) {
            if (this.f323g == null) {
                m346c();
            }
            if (drawable != null || this.f334r) {
                ImageView imageView = this.f323g;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f323g.getVisibility() != 0) {
                    this.f323g.setVisibility(0);
                    return;
                }
                return;
            }
            this.f323g.setVisibility(8);
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i;
        if (charSequence != null) {
            this.f325i.setText(charSequence);
            if (this.f325i.getVisibility() != 0) {
                textView = this.f325i;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (this.f325i.getVisibility() != 8) {
                textView = this.f325i;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }
}
