package com.afollestad.materialdialogs.internal.button;

import p054c.p055a.p056a.p066v.C1107f;

/* renamed from: com.afollestad.materialdialogs.internal.button.a */
public final class C1594a {
    /* renamed from: a */
    public static final boolean m6942a(DialogActionButtonLayout dialogActionButtonLayout) {
        if (dialogActionButtonLayout == null) {
            return false;
        }
        return ((dialogActionButtonLayout.getVisibleButtons().length == 0) ^ true) || C1107f.m5547c(dialogActionButtonLayout.getCheckBoxPrompt());
    }
}
