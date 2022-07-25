package com.afollestad.materialdialogs.color.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import java.util.ArrayList;
import java.util.List;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.p060q.C1076h;
import p054c.p055a.p056a.p066v.C1103e;
import p190io.objectbox.android.BuildConfig;

public final class SeekBarGroupLayout extends RelativeLayout {

    /* renamed from: f */
    private final int f4648f;

    /* renamed from: g */
    private List<? extends SeekBar> f4649g;

    /* renamed from: h */
    private SeekBar f4650h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SeekBarGroupLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3370k.m12227b(context, "context");
        this.f4648f = C1103e.f3789a.mo5163a(this, C1076h.seekbar_grouplayout_tolerance);
        this.f4649g = C3284j.m12068a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SeekBarGroupLayout(Context context, AttributeSet attributeSet, int i, C3366g gVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: a */
    private final float m6932a(View view) {
        return view.getY() + (((float) view.getMeasuredHeight()) / 2.0f);
    }

    /* renamed from: a */
    private final SeekBar m6933a(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        String str = null;
        SeekBar seekBar = null;
        int i = -1;
        for (SeekBar seekBar2 : this.f4649g) {
            int abs = (int) Math.abs(y - m6932a((View) seekBar2));
            m6935a("Diff from " + m6934a(seekBar2) + " = " + abs + ", tolerance = " + this.f4648f);
            if (abs <= this.f4648f && (i == -1 || abs < i)) {
                m6935a("New closest: " + m6934a(seekBar2));
                seekBar = seekBar2;
                i = abs;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Final closest: ");
        if (seekBar != null) {
            str = m6934a(seekBar);
        }
        sb.append(str);
        m6935a(sb.toString());
        return seekBar;
    }

    /* renamed from: a */
    private final String m6934a(SeekBar seekBar) {
        if (seekBar == null) {
            return BuildConfig.FLAVOR;
        }
        String resourceEntryName = seekBar.getResources().getResourceEntryName(seekBar.getId());
        C3370k.m12223a((Object) resourceEntryName, "this.resources.getResourceEntryName(this.id)");
        return resourceEntryName;
    }

    /* renamed from: a */
    private final void m6935a(String str) {
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof SeekBar)) {
                childAt = null;
            }
            SeekBar seekBar = (SeekBar) childAt;
            if (seekBar != null) {
                arrayList.add(seekBar);
            }
        }
        this.f4649g = arrayList;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        SeekBar seekBar;
        C3370k.m12227b(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            SeekBar a = m6933a(motionEvent);
            if (a != null) {
                m6935a("Grabbed: " + m6934a(a));
                this.f4650h = a;
                a.dispatchTouchEvent(motionEvent);
                return true;
            }
        } else if (actionMasked != 1) {
            if (actionMasked == 2 && (seekBar = this.f4650h) != null) {
                if (seekBar != null) {
                    seekBar.dispatchTouchEvent(motionEvent);
                    return true;
                }
                C3370k.m12221a();
                throw null;
            }
        } else if (this.f4650h != null) {
            m6935a("Released: " + m6934a(this.f4650h));
            SeekBar seekBar2 = this.f4650h;
            if (seekBar2 != null) {
                seekBar2.dispatchTouchEvent(motionEvent);
                this.f4650h = null;
                return true;
            }
            C3370k.m12221a();
            throw null;
        }
        return super.onTouchEvent(motionEvent);
    }
}
