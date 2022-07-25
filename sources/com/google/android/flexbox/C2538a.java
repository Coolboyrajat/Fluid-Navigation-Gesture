package com.google.android.flexbox;

import android.view.View;
import java.util.List;

/* renamed from: com.google.android.flexbox.a */
interface C2538a {
    /* renamed from: a */
    int mo7560a(int i, int i2, int i3);

    /* renamed from: a */
    int mo7561a(View view);

    /* renamed from: a */
    int mo7562a(View view, int i, int i2);

    /* renamed from: a */
    View mo7563a(int i);

    /* renamed from: a */
    void mo7564a(int i, View view);

    /* renamed from: a */
    void mo7565a(View view, int i, int i2, C2540c cVar);

    /* renamed from: a */
    void mo7566a(C2540c cVar);

    /* renamed from: a */
    boolean mo7567a();

    /* renamed from: b */
    int mo7569b(int i, int i2, int i3);

    /* renamed from: b */
    View mo7570b(int i);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<C2540c> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    void setFlexLines(List<C2540c> list);
}
