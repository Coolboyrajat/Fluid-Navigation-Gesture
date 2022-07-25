package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import p006b.p026g.p034j.C0833d;
import p006b.p026g.p035k.C0838a;
import p006b.p026g.p035k.C0890v;
import p006b.p026g.p035k.p036e0.C0857c;
import p054c.p083e.p084a.p085a.C1173f;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: f */
    private final Calendar f6814f;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    class C2599a extends C0838a {
        C2599a(MaterialCalendarGridView materialCalendarGridView) {
        }

        /* renamed from: a */
        public void mo2093a(View view, C0857c cVar) {
            super.mo2093a(view, cVar);
            cVar.mo4587a((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6814f = Calendar.getInstance();
        if (C2621i.m10298b(getContext())) {
            setNextFocusLeftId(C1173f.cancel_button);
            setNextFocusRightId(C1173f.confirm_button);
        }
        C0890v.m4752a((View) this, (C0838a) new C2599a(this));
    }

    /* renamed from: a */
    private static int m10246a(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: a */
    private void m10247a(int i, Rect rect) {
        int a;
        if (i == 33) {
            a = getAdapter().mo8273b();
        } else if (i == 130) {
            a = getAdapter().mo8271a();
        } else {
            super.onFocusChanged(true, i, rect);
            return;
        }
        setSelection(a);
    }

    /* renamed from: a */
    private static boolean m10248a(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    public C2624k getAdapter() {
        return (C2624k) super.getAdapter();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C2624k adapter = getAdapter();
        C2606e<?> eVar = adapter.f6879g;
        C2604c cVar = adapter.f6880h;
        Long item = adapter.getItem(adapter.mo8271a());
        Long item2 = adapter.getItem(adapter.mo8273b());
        for (C0833d next : eVar.mo8241o()) {
            F f = next.f3245a;
            if (f != null) {
                if (next.f3246b == null) {
                    continue;
                } else {
                    long longValue = ((Long) f).longValue();
                    long longValue2 = ((Long) next.f3246b).longValue();
                    if (!m10248a(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        if (longValue < item.longValue()) {
                            i2 = adapter.mo8271a();
                            i = adapter.mo8274b(i2) ? 0 : materialCalendarGridView.getChildAt(i2 - 1).getRight();
                        } else {
                            materialCalendarGridView.f6814f.setTimeInMillis(longValue);
                            i2 = adapter.mo8272a(materialCalendarGridView.f6814f.get(5));
                            i = m10246a(materialCalendarGridView.getChildAt(i2));
                        }
                        if (longValue2 > item2.longValue()) {
                            i4 = adapter.mo8273b();
                            i3 = adapter.mo8275c(i4) ? getWidth() : materialCalendarGridView.getChildAt(i4).getRight();
                        } else {
                            materialCalendarGridView.f6814f.setTimeInMillis(longValue2);
                            i4 = adapter.mo8272a(materialCalendarGridView.f6814f.get(5));
                            i3 = m10246a(materialCalendarGridView.getChildAt(i4));
                        }
                        int itemId = (int) adapter.getItemId(i2);
                        int itemId2 = (int) adapter.getItemId(i4);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            canvas.drawRect((float) (numColumns > i2 ? 0 : i), (float) (childAt.getTop() + cVar.f6827a.mo8238b()), (float) (i4 > numColumns2 ? getWidth() : i3), (float) (childAt.getBottom() - cVar.f6827a.mo8236a()), cVar.f6834h);
                            itemId++;
                            materialCalendarGridView = this;
                        }
                    } else {
                        return;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            m10247a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo8271a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().mo8271a());
        return true;
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C2624k) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), C2624k.class.getCanonicalName()}));
        }
    }

    public void setSelection(int i) {
        if (i < getAdapter().mo8271a()) {
            i = getAdapter().mo8271a();
        }
        super.setSelection(i);
    }
}
