package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.widget.f */
public class C0260f extends View {

    /* renamed from: f */
    private int f1359f;

    /* renamed from: g */
    private View f1360g;

    /* renamed from: h */
    private int f1361h;

    /* renamed from: a */
    public void mo1763a(ConstraintLayout constraintLayout) {
        if (this.f1360g != null) {
            ConstraintLayout.C0250a aVar = (ConstraintLayout.C0250a) getLayoutParams();
            ConstraintLayout.C0250a aVar2 = (ConstraintLayout.C0250a) this.f1360g.getLayoutParams();
            aVar2.f1241k0.mo4381n(0);
            aVar.f1241k0.mo4383o(aVar2.f1241k0.mo4390s());
            aVar.f1241k0.mo4367g(aVar2.f1241k0.mo4370i());
            aVar2.f1241k0.mo4381n(8);
        }
    }

    /* renamed from: b */
    public void mo1764b(ConstraintLayout constraintLayout) {
        if (this.f1359f == -1 && !isInEditMode()) {
            setVisibility(this.f1361h);
        }
        this.f1360g = constraintLayout.findViewById(this.f1359f);
        View view = this.f1360g;
        if (view != null) {
            ((ConstraintLayout.C0250a) view.getLayoutParams()).f1219Z = true;
            this.f1360g.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f1360g;
    }

    public int getEmptyVisibility() {
        return this.f1361h;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f1359f != i) {
            View view = this.f1360g;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.C0250a) this.f1360g.getLayoutParams()).f1219Z = false;
                this.f1360g = null;
            }
            this.f1359f = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f1361h = i;
    }
}
