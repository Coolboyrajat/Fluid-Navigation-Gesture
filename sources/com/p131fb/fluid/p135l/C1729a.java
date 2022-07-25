package com.p131fb.fluid.p135l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import com.p131fb.fluid.data.C1702a;
import com.p131fb.fluid.p135l.p139p.C1776l;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.android.BuildConfig;

/* renamed from: com.fb.fluid.l.a */
public final class C1729a {

    /* renamed from: a */
    public static final C1730a f5027a = new C1730a((C3366g) null);

    /* renamed from: com.fb.fluid.l.a$a */
    public static final class C1730a {
        private C1730a() {
        }

        public /* synthetic */ C1730a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1702a mo6465a(Context context, Intent intent) {
            C3370k.m12227b(context, "context");
            C3370k.m12227b(intent, "data");
            try {
                Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.shortcut.INTENT");
                if (intent2 == null) {
                    return null;
                }
                String uri = intent2.toUri(0);
                String stringExtra = intent.getStringExtra("android.intent.extra.shortcut.NAME");
                String str = BuildConfig.FLAVOR;
                if (stringExtra == null) {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        ComponentName component = intent2.getComponent();
                        if (component == null) {
                            component = new ComponentName(str, str);
                        }
                        stringExtra = packageManager.getActivityInfo(component, 0).loadLabel(packageManager).toString();
                    } catch (Exception unused) {
                        stringExtra = str;
                    }
                }
                Bitmap bitmap = (Bitmap) intent.getParcelableExtra("android.intent.extra.shortcut.ICON");
                if (bitmap != null) {
                    C1730a aVar = C1729a.f5027a;
                    C3370k.m12223a((Object) uri, "uri");
                    aVar.mo6466a(context, bitmap, "shortcuts", uri);
                }
                Intent.ShortcutIconResource shortcutIconResource = (Intent.ShortcutIconResource) intent.getParcelableExtra("android.intent.extra.shortcut.ICON_RESOURCE");
                C3370k.m12223a((Object) uri, "uri");
                if (shortcutIconResource != null) {
                    str = shortcutIconResource.resourceName;
                }
                C3370k.m12223a((Object) str, "if (iconResource != null…urce.resourceName else \"\"");
                return new C1702a(uri, str, stringExtra);
            } catch (Exception e) {
                C1776l.m7478a("installShortcutPreOreo.failed: " + e.getMessage(), (String) null, 1, (Object) null);
                return null;
            }
        }

        /* renamed from: a */
        public final void mo6466a(Context context, Bitmap bitmap, String str, String str2) {
            C3370k.m12227b(context, "context");
            C3370k.m12227b(bitmap, "image");
            C3370k.m12227b(str, "directory");
            C3370k.m12227b(str2, "name");
            try {
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                File file = new File(context.getFilesDir() + File.separator + str, str2 + ".png");
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                bitmap.compress(compressFormat, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Exception e) {
                C1776l.m7478a("fail-save: " + e.getMessage(), (String) null, 1, (Object) null);
            }
        }

        /* renamed from: a */
        public final void mo6467a(Context context, C1702a aVar) {
            String str;
            C3370k.m12227b(context, "context");
            if (aVar != null) {
                try {
                    str = aVar.mo6434r();
                    if (str != null) {
                        mo6468a(context, "shortcuts", str);
                    }
                } catch (Exception e) {
                    C1776l.m7478a("uninstallShortcut: " + e.getMessage(), (String) null, 1, (Object) null);
                    return;
                }
            }
            str = BuildConfig.FLAVOR;
            mo6468a(context, "shortcuts", str);
        }

        /* renamed from: a */
        public final void mo6468a(Context context, String str, String str2) {
            C3370k.m12227b(context, "context");
            C3370k.m12227b(str, "directory");
            C3370k.m12227b(str2, "name");
            try {
                File file = new File(context.getFilesDir() + File.separator + str, str2 + ".png");
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                file.delete();
            } catch (Exception e) {
                C1776l.m7478a("fail-delete: " + e.getMessage(), (String) null, 1, (Object) null);
            }
        }

        /* renamed from: b */
        public final BitmapDrawable mo6469b(Context context, String str, String str2) {
            C3370k.m12227b(context, "context");
            C3370k.m12227b(str, "parent");
            C3370k.m12227b(str2, "child");
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap decodeFile = BitmapFactory.decodeFile(new File(context.getFilesDir() + File.separator + str, str2 + ".png").getPath(), options);
                if (decodeFile != null) {
                    return new BitmapDrawable(context.getResources(), decodeFile);
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }
}
