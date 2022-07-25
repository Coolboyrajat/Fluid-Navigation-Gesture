package com.p131fb.fluid.p135l.p139p;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.l.p.e */
public final class C1769e {
    /* renamed from: a */
    public static final ContentObserver m7458a(ContentObserver contentObserver, Context context, Uri uri, boolean z) {
        C3370k.m12227b(contentObserver, "$this$register");
        C3370k.m12227b(context, "context");
        C3370k.m12227b(uri, "uri");
        context.getContentResolver().registerContentObserver(uri, z, contentObserver);
        return contentObserver;
    }

    /* renamed from: a */
    public static /* synthetic */ ContentObserver m7459a(ContentObserver contentObserver, Context context, Uri uri, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        m7458a(contentObserver, context, uri, z);
        return contentObserver;
    }

    /* renamed from: a */
    public static final void m7460a(ContentObserver contentObserver, Context context) {
        C3370k.m12227b(contentObserver, "$this$dispose");
        C3370k.m12227b(context, "context");
        context.getContentResolver().unregisterContentObserver(contentObserver);
    }
}
