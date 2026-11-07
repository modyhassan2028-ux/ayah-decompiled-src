package com.ayah.feature.quran.view;

import A.C0030l0;
import G5.j;
import H5.h;
import H7.M;
import K9.AbstractC0405x;
import K9.H;
import N9.U;
import N9.Y;
import N9.k0;
import P9.d;
import W3.e;
import X3.i;
import X3.k;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.ayah.MainActivity;
import com.ayah.feature.quran.view.QuranPage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000a.a;
import p035d3.u;
import p035d3.v;
import p120l9.r;
import p185s8.u0;
import p189t3.b;
import p218w3.f;
import p248z6.c;
import z3.g;

/* JADX INFO: loaded from: classes.dex */
public final class QuranPage extends Hilt_QuranPage {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f13836z = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final QuranPageViewGroup f13837t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public d f13838u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13839v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f13840w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public MainActivity f13841x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public j f13842y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuranPage(Context context) {
        super(context);
        p251z9.j.e(context, "context");
        if (!isInEditMode() && !this.f13832s) {
            this.f13832s = true;
            v vVar = (v) ((h) c());
            u uVar = vVar.f15683a;
            this.f13842y = new j(uVar.f15659a.f1940a, (f) uVar.f15680x.get(), (z3.f) vVar.f15684b.f15631f.get(), (p218w3.h) uVar.f15643B.get(), (p218w3.j) uVar.f15681y.get(), (b) uVar.f15657P.get());
        }
        QuranPageViewGroup quranPageViewGroup = new QuranPageViewGroup(context, null, 0);
        u0.u(quranPageViewGroup);
        this.f13837t = quranPageViewGroup;
        this.f13838u = a.a();
        this.f13839v = -1;
        addView(quranPageViewGroup);
        final c cVar = new c(getContext(), new e(new C6.b(1, this)));
        quranPageViewGroup.setTouchListenerOnCorrectView(new View.OnTouchListener() { // from class: H5.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i10 = QuranPage.f13836z;
                boolean zOnTouchEvent = ((GestureDetector) cVar.f24847s).onTouchEvent(motionEvent);
                int action = motionEvent.getAction();
                QuranPage quranPage = this;
                X3.e eVar = X3.e.f9936a;
                if (action == 1) {
                    view.performClick();
                    quranPage.a(eVar);
                    return zOnTouchEvent;
                }
                if (motionEvent.getAction() == 3) {
                    quranPage.a(eVar);
                }
                return zOnTouchEvent;
            }
        });
    }

    public final void a(k kVar) {
        List listA;
        Object next;
        List listA2;
        j presenter = getPresenter();
        U u8 = presenter.f2908i;
        Y y10 = presenter.j;
        p218w3.h hVar = presenter.f2904d;
        p124m3.a aVar = null;
        Object obj = null;
        jVar = null;
        p124m3.j jVar = null;
        aVar = null;
        aVar = null;
        if (kVar instanceof X3.f) {
            hVar.a(((X3.f) kVar).f9937a, false);
        } else if (kVar instanceof i) {
            hVar.a(((i) kVar).f9940a, false);
        } else if (kVar.equals(X3.e.f9936a) || kVar.equals(X3.h.f9939a)) {
            k0 k0Var = hVar.f23673c;
            k0Var.getClass();
            g gVar = g.f24791a;
            k0Var.n(null, gVar);
            k0 k0Var2 = hVar.f23672b;
            k0Var2.getClass();
            k0Var2.n(null, gVar);
        } else if (kVar instanceof X3.g) {
            hVar.b(((X3.g) kVar).f9938a, false);
        } else {
            if (!(kVar instanceof X3.j)) {
                throw new A6.a();
            }
            hVar.b(((X3.j) kVar).f9941a, false);
        }
        if (kVar instanceof i) {
            p124m3.d dVar = (p124m3.d) u8.f6130r.getValue();
            if (dVar != null && (listA2 = dVar.a()) != null) {
                for (Object obj2 : listA2) {
                    if (((p124m3.j) obj2).f19585a == ((i) kVar).f9940a) {
                        obj = obj2;
                        break;
                    }
                }
                jVar = (p124m3.j) obj;
            }
            if (jVar != null) {
                y10.g(new X3.b(jVar));
                return;
            }
            return;
        }
        if (!(kVar instanceof X3.j)) {
            if (kVar instanceof X3.h) {
                y10.g(X3.a.f9933b);
                return;
            }
            return;
        }
        p124m3.d dVar2 = (p124m3.d) u8.f6130r.getValue();
        if (dVar2 != null && (listA = dVar2.a()) != null) {
            Iterator it = listA.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((p124m3.j) next).f19595m != ((X3.j) kVar).f9941a);
            p124m3.j jVar2 = (p124m3.j) next;
            if (jVar2 != null) {
                aVar = jVar2.f19596n;
            }
        }
        if (aVar != null) {
            y10.g(new X3.c(aVar));
        }
    }

    public final j getPresenter() {
        j jVar = this.f13842y;
        if (jVar != null) {
            return jVar;
        }
        p251z9.j.k("presenter");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        d dVarA = a.a();
        this.f13838u = dVarA;
        Aa.a aVar = new Aa.a();
        aVar.f555s = new M();
        aVar.f557u = new M();
        aVar.f556t = new ArrayList();
        aVar.f554r = new A8.c(9);
        aVar.b(this.f13837t);
        AbstractC0405x.x(dVarA, null, new C0030l0(this, (p150o9.c) null, 14), 3);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AbstractC0405x.h(this.f13838u, null);
        QuranPageViewGroup quranPageViewGroup = this.f13837t;
        QuranPageImageView quranPageImageView = quranPageViewGroup.f13846s;
        Drawable[] drawableArr = quranPageImageView.f13844s;
        ArrayList arrayList = new ArrayList();
        for (Drawable drawable : drawableArr) {
            if (drawable instanceof BitmapDrawable) {
                arrayList.add(drawable);
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((BitmapDrawable) obj).getBitmap().recycle();
        }
        quranPageImageView.f13844s = new Drawable[0];
        quranPageViewGroup.setAccessoryViews(r.f19440r);
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f13837t.layout(0, 0, i12 - i10, i13 - i11);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        QuranPageViewGroup quranPageViewGroup = this.f13837t;
        quranPageViewGroup.measure(i10, i11);
        setMeasuredDimension(quranPageViewGroup.getMeasuredWidth(), quranPageViewGroup.getMeasuredHeight());
    }

    public final void setPage(int i10) {
        if (this.f13839v != i10) {
            j presenter = getPresenter();
            d dVar = presenter.f2911m;
            R9.e eVar = H.f5322a;
            AbstractC0405x.x(dVar, R9.d.f7436t, new F.u(i10, 3, presenter, null), 2);
            this.f13839v = i10;
            this.f13840w = true;
        }
    }

    public final void setPresenter(j jVar) {
        p251z9.j.e(jVar, "<set-?>");
        this.f13842y = jVar;
    }
}
