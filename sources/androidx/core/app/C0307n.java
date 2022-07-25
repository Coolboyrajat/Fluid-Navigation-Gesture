package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.C0311a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.n */
public final class C0307n implements Iterable<Intent> {

    /* renamed from: f */
    private final ArrayList<Intent> f1532f = new ArrayList<>();

    /* renamed from: g */
    private final Context f1533g;

    /* renamed from: androidx.core.app.n$a */
    public interface C0308a {
        /* renamed from: i */
        Intent mo123i();
    }

    private C0307n(Context context) {
        this.f1533g = context;
    }

    /* renamed from: a */
    public static C0307n m1509a(Context context) {
        return new C0307n(context);
    }

    /* renamed from: a */
    public C0307n mo1942a(Activity activity) {
        Intent i = activity instanceof C0308a ? ((C0308a) activity).mo123i() : null;
        if (i == null) {
            i = C0290f.m1445a(activity);
        }
        if (i != null) {
            ComponentName component = i.getComponent();
            if (component == null) {
                component = i.resolveActivity(this.f1533g.getPackageManager());
            }
            mo1943a(component);
            mo1944a(i);
        }
        return this;
    }

    /* renamed from: a */
    public C0307n mo1943a(ComponentName componentName) {
        int size = this.f1532f.size();
        try {
            Context context = this.f1533g;
            while (true) {
                Intent a = C0290f.m1446a(context, componentName);
                if (a == null) {
                    return this;
                }
                this.f1532f.add(size, a);
                context = this.f1533g;
                componentName = a.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public C0307n mo1944a(Intent intent) {
        this.f1532f.add(intent);
        return this;
    }

    /* renamed from: a */
    public void mo1945a() {
        mo1946a((Bundle) null);
    }

    /* renamed from: a */
    public void mo1946a(Bundle bundle) {
        if (!this.f1532f.isEmpty()) {
            ArrayList<Intent> arrayList = this.f1532f;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C0311a.m1530a(this.f1533g, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f1533g.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1532f.iterator();
    }
}
