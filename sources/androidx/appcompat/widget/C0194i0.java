package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

/* renamed from: androidx.appcompat.widget.i0 */
class C0194i0 extends Resources {

    /* renamed from: a */
    private final Resources f977a;

    public C0194i0(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f977a = resources;
    }

    public XmlResourceParser getAnimation(int i) {
        return this.f977a.getAnimation(i);
    }

    public boolean getBoolean(int i) {
        return this.f977a.getBoolean(i);
    }

    public int getColor(int i) {
        return this.f977a.getColor(i);
    }

    public ColorStateList getColorStateList(int i) {
        return this.f977a.getColorStateList(i);
    }

    public Configuration getConfiguration() {
        return this.f977a.getConfiguration();
    }

    public float getDimension(int i) {
        return this.f977a.getDimension(i);
    }

    public int getDimensionPixelOffset(int i) {
        return this.f977a.getDimensionPixelOffset(i);
    }

    public int getDimensionPixelSize(int i) {
        return this.f977a.getDimensionPixelSize(i);
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f977a.getDisplayMetrics();
    }

    public Drawable getDrawable(int i) {
        return this.f977a.getDrawable(i);
    }

    public Drawable getDrawable(int i, Resources.Theme theme) {
        return this.f977a.getDrawable(i, theme);
    }

    public Drawable getDrawableForDensity(int i, int i2) {
        return this.f977a.getDrawableForDensity(i, i2);
    }

    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.f977a.getDrawableForDensity(i, i2, theme);
    }

    public float getFraction(int i, int i2, int i3) {
        return this.f977a.getFraction(i, i2, i3);
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.f977a.getIdentifier(str, str2, str3);
    }

    public int[] getIntArray(int i) {
        return this.f977a.getIntArray(i);
    }

    public int getInteger(int i) {
        return this.f977a.getInteger(i);
    }

    public XmlResourceParser getLayout(int i) {
        return this.f977a.getLayout(i);
    }

    public Movie getMovie(int i) {
        return this.f977a.getMovie(i);
    }

    public String getQuantityString(int i, int i2) {
        return this.f977a.getQuantityString(i, i2);
    }

    public String getQuantityString(int i, int i2, Object... objArr) {
        return this.f977a.getQuantityString(i, i2, objArr);
    }

    public CharSequence getQuantityText(int i, int i2) {
        return this.f977a.getQuantityText(i, i2);
    }

    public String getResourceEntryName(int i) {
        return this.f977a.getResourceEntryName(i);
    }

    public String getResourceName(int i) {
        return this.f977a.getResourceName(i);
    }

    public String getResourcePackageName(int i) {
        return this.f977a.getResourcePackageName(i);
    }

    public String getResourceTypeName(int i) {
        return this.f977a.getResourceTypeName(i);
    }

    public String getString(int i) {
        return this.f977a.getString(i);
    }

    public String getString(int i, Object... objArr) {
        return this.f977a.getString(i, objArr);
    }

    public String[] getStringArray(int i) {
        return this.f977a.getStringArray(i);
    }

    public CharSequence getText(int i) {
        return this.f977a.getText(i);
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        return this.f977a.getText(i, charSequence);
    }

    public CharSequence[] getTextArray(int i) {
        return this.f977a.getTextArray(i);
    }

    public void getValue(int i, TypedValue typedValue, boolean z) {
        this.f977a.getValue(i, typedValue, z);
    }

    public void getValue(String str, TypedValue typedValue, boolean z) {
        this.f977a.getValue(str, typedValue, z);
    }

    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.f977a.getValueForDensity(i, i2, typedValue, z);
    }

    public XmlResourceParser getXml(int i) {
        return this.f977a.getXml(i);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f977a.obtainAttributes(attributeSet, iArr);
    }

    public TypedArray obtainTypedArray(int i) {
        return this.f977a.obtainTypedArray(i);
    }

    public InputStream openRawResource(int i) {
        return this.f977a.openRawResource(i);
    }

    public InputStream openRawResource(int i, TypedValue typedValue) {
        return this.f977a.openRawResource(i, typedValue);
    }

    public AssetFileDescriptor openRawResourceFd(int i) {
        return this.f977a.openRawResourceFd(i);
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.f977a.parseBundleExtra(str, attributeSet, bundle);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.f977a.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f977a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }
}
