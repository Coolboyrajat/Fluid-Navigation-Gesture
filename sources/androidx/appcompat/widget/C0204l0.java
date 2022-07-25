package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0311a;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p006b.p007a.C0654a;
import p006b.p007a.C0659f;
import p006b.p037h.p038a.C0911c;
import p190io.objectbox.android.BuildConfig;
import p190io.objectbox.model.PropertyFlags;

@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.widget.l0 */
class C0204l0 extends C0911c implements View.OnClickListener {

    /* renamed from: A */
    private int f1010A = -1;

    /* renamed from: B */
    private int f1011B = -1;

    /* renamed from: C */
    private int f1012C = -1;

    /* renamed from: D */
    private int f1013D = -1;

    /* renamed from: q */
    private final SearchView f1014q;

    /* renamed from: r */
    private final SearchableInfo f1015r;

    /* renamed from: s */
    private final Context f1016s;

    /* renamed from: t */
    private final WeakHashMap<String, Drawable.ConstantState> f1017t;

    /* renamed from: u */
    private final int f1018u;

    /* renamed from: v */
    private boolean f1019v = false;

    /* renamed from: w */
    private int f1020w = 1;

    /* renamed from: x */
    private ColorStateList f1021x;

    /* renamed from: y */
    private int f1022y = -1;

    /* renamed from: z */
    private int f1023z = -1;

    /* renamed from: androidx.appcompat.widget.l0$a */
    private static final class C0205a {

        /* renamed from: a */
        public final TextView f1024a;

        /* renamed from: b */
        public final TextView f1025b;

        /* renamed from: c */
        public final ImageView f1026c;

        /* renamed from: d */
        public final ImageView f1027d;

        /* renamed from: e */
        public final ImageView f1028e;

        public C0205a(View view) {
            this.f1024a = (TextView) view.findViewById(16908308);
            this.f1025b = (TextView) view.findViewById(16908309);
            this.f1026c = (ImageView) view.findViewById(16908295);
            this.f1027d = (ImageView) view.findViewById(16908296);
            this.f1028e = (ImageView) view.findViewById(C0659f.edit_query);
        }
    }

    public C0204l0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        SearchManager searchManager = (SearchManager) this.f3350i.getSystemService("search");
        this.f1014q = searchView;
        this.f1015r = searchableInfo;
        this.f1018u = searchView.getSuggestionCommitIconResId();
        this.f1016s = context;
        this.f1017t = weakHashMap;
    }

    /* renamed from: a */
    private Drawable m998a(ComponentName componentName) {
        String nameNotFoundException;
        PackageManager packageManager = this.f3350i.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, PropertyFlags.ID_SELF_ASSIGNABLE);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            nameNotFoundException = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
            Log.w("SuggestionsAdapter", nameNotFoundException);
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            nameNotFoundException = e.toString();
        }
    }

    /* renamed from: a */
    private Drawable m999a(String str) {
        Drawable.ConstantState constantState = this.f1017t.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: a */
    private static String m1000a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m1001a(Cursor cursor, String str) {
        return m1000a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private void m1002a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: a */
    private void m1003a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* renamed from: a */
    private void m1004a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1017t.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: b */
    private Drawable m1005b(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f1017t.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f1017t.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f1016s.getResources());
        }
        Drawable a = m998a(componentName);
        if (a != null) {
            constantState = a.getConstantState();
        }
        this.f1017t.put(flattenToShortString, constantState);
        return a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m1006b(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r7 = r6.mo1484a((android.net.Uri) r7)     // Catch:{ NotFoundException -> 0x0016 }
            return r7
        L_0x0016:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x002d:
            android.content.Context r3 = r6.f1016s     // Catch:{ FileNotFoundException -> 0x0085 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.io.InputStream r3 = r3.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x006e
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2)     // Catch:{ all -> 0x0055 }
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0054
        L_0x0041:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0054:
            return r4
        L_0x0055:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x006d
        L_0x005a:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006d:
            throw r4     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r0.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0204l0.m1006b(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: b */
    private Drawable m1007b(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1016s.getPackageName() + "/" + parseInt;
            Drawable a = m999a(str2);
            if (a != null) {
                return a;
            }
            Drawable c = C0311a.m1534c(this.f1016s, parseInt);
            m1004a(str2, c);
            return c;
        } catch (NumberFormatException unused) {
            Drawable a2 = m999a(str);
            if (a2 != null) {
                return a2;
            }
            Drawable b = m1006b(Uri.parse(str));
            m1004a(str, b);
            return b;
        } catch (Resources.NotFoundException unused2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    /* renamed from: b */
    private CharSequence m1008b(CharSequence charSequence) {
        if (this.f1021x == null) {
            TypedValue typedValue = new TypedValue();
            this.f3350i.getTheme().resolveAttribute(C0654a.textColorSearchUrl, typedValue, true);
            this.f1021x = this.f3350i.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f1021x, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: d */
    private Drawable m1009d(Cursor cursor) {
        Drawable b = m1005b(this.f1015r.getSearchActivity());
        return b != null ? b : this.f3350i.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: e */
    private Drawable m1010e(Cursor cursor) {
        int i = this.f1011B;
        if (i == -1) {
            return null;
        }
        Drawable b = m1007b(cursor.getString(i));
        return b != null ? b : m1009d(cursor);
    }

    /* renamed from: f */
    private Drawable m1011f(Cursor cursor) {
        int i = this.f1012C;
        if (i == -1) {
            return null;
        }
        return m1007b(cursor.getString(i));
    }

    /* renamed from: g */
    private void m1012g(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Cursor mo1482a(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(BuildConfig.FLAVOR).fragment(BuildConfig.FLAVOR);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f3350i.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    /* renamed from: a */
    public Cursor mo1483a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? BuildConfig.FLAVOR : charSequence.toString();
        if (this.f1014q.getVisibility() == 0 && this.f1014q.getWindowVisibility() == 0) {
            try {
                Cursor a = mo1482a(this.f1015r, charSequence2, 50);
                if (a != null) {
                    a.getCount();
                    return a;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Drawable mo1484a(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f3350i.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* renamed from: a */
    public CharSequence mo1485a(Cursor cursor) {
        String a;
        String a2;
        if (cursor == null) {
            return null;
        }
        String a3 = m1001a(cursor, "suggest_intent_query");
        if (a3 != null) {
            return a3;
        }
        if (this.f1015r.shouldRewriteQueryFromData() && (a2 = m1001a(cursor, "suggest_intent_data")) != null) {
            return a2;
        }
        if (!this.f1015r.shouldRewriteQueryFromText() || (a = m1001a(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return a;
    }

    /* renamed from: a */
    public void mo1486a(int i) {
        this.f1020w = i;
    }

    /* renamed from: a */
    public void mo1487a(View view, Context context, Cursor cursor) {
        C0205a aVar = (C0205a) view.getTag();
        int i = this.f1013D;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f1024a != null) {
            m1003a(aVar.f1024a, (CharSequence) m1000a(cursor, this.f1022y));
        }
        if (aVar.f1025b != null) {
            String a = m1000a(cursor, this.f1010A);
            CharSequence b = a != null ? m1008b((CharSequence) a) : m1000a(cursor, this.f1023z);
            if (TextUtils.isEmpty(b)) {
                TextView textView = aVar.f1024a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1024a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1024a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1024a.setMaxLines(1);
                }
            }
            m1003a(aVar.f1025b, b);
        }
        ImageView imageView = aVar.f1026c;
        if (imageView != null) {
            m1002a(imageView, m1010e(cursor), 4);
        }
        ImageView imageView2 = aVar.f1027d;
        if (imageView2 != null) {
            m1002a(imageView2, m1011f(cursor), 8);
        }
        int i3 = this.f1020w;
        if (i3 == 2 || (i3 == 1 && (i2 & 1) != 0)) {
            aVar.f1028e.setVisibility(0);
            aVar.f1028e.setTag(aVar.f1024a.getText());
            aVar.f1028e.setOnClickListener(this);
            return;
        }
        aVar.f1028e.setVisibility(8);
    }

    /* renamed from: b */
    public View mo1488b(Context context, Cursor cursor, ViewGroup viewGroup) {
        View b = super.mo1488b(context, cursor, viewGroup);
        b.setTag(new C0205a(b));
        ((ImageView) b.findViewById(C0659f.edit_query)).setImageResource(this.f1018u);
        return b;
    }

    /* renamed from: b */
    public void mo1489b(Cursor cursor) {
        if (this.f1019v) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo1489b(cursor);
            if (cursor != null) {
                this.f1022y = cursor.getColumnIndex("suggest_text_1");
                this.f1023z = cursor.getColumnIndex("suggest_text_2");
                this.f1010A = cursor.getColumnIndex("suggest_text_2_url");
                this.f1011B = cursor.getColumnIndex("suggest_icon_1");
                this.f1012C = cursor.getColumnIndex("suggest_icon_2");
                this.f1013D = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View a = mo4709a(this.f3350i, this.f3349h, viewGroup);
            if (a != null) {
                ((C0205a) a.getTag()).f1024a.setText(e.toString());
            }
            return a;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View b = mo1488b(this.f3350i, this.f3349h, viewGroup);
            if (b != null) {
                ((C0205a) b.getTag()).f1024a.setText(e.toString());
            }
            return b;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m1012g(mo4708a());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m1012g(mo4708a());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1014q.mo934a((CharSequence) tag);
        }
    }
}
