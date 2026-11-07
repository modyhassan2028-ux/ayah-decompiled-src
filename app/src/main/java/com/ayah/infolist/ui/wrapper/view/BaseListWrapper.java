package com.ayah.feature.infolist.ui.wrapper.view;

import A.C0040q0;
import E2.C0138o;
import K9.AbstractC0405x;
import O4.b;
import P9.d;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ayah.R;
import java.util.List;
import p025c4.a;
import p120l9.r;
import p150o9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseListWrapper extends FrameLayout {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public d f13778r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b f13779s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RecyclerView f13780t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List f13781u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public K4.d f13782v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a f13783w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseListWrapper(Context context) {
        super(context);
        j.e(context, "context");
        this.f13781u = r.f19440r;
    }

    public abstract Object a(C0040q0 c0040q0);

    public final void b(b bVar) {
        this.f13779s = bVar;
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        b bVar2 = this.f13779s;
        if (bVar2 == null) {
            j.k("recyclerViewAdapter");
            throw null;
        }
        recyclerView.setAdapter(bVar2);
        C0138o c0138o = new C0138o();
        c0138o.g = false;
        recyclerView.setItemAnimator(c0138o);
        this.f13780t = recyclerView;
        addView(recyclerView, -1, -1);
        Resources resources = getResources();
        ThreadLocal threadLocal = p244z1.j.f24770a;
        setBackgroundColor(resources.getColor(R.color.background, null));
        Drawable drawable = getResources().getDrawable(R.drawable.fast_scroll_track, null);
        Drawable drawable2 = getResources().getDrawable(R.drawable.fast_scroll_thumb, null);
        j.c(drawable2, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
        StateListDrawable stateListDrawable = (StateListDrawable) drawable2;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.fastscroll_default_thickness);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.fastscroll_minimum_range);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.fastscroll_margin);
        RecyclerView recyclerView2 = this.f13780t;
        if (recyclerView2 != null) {
            new P4.a(recyclerView2, stateListDrawable, drawable, stateListDrawable, drawable, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3);
        } else {
            j.k("recyclerView");
            throw null;
        }
    }

    public abstract H2.j d();

    public final a getDrawerVisibilityModel() {
        a aVar = this.f13783w;
        if (aVar != null) {
            return aVar;
        }
        j.k("drawerVisibilityModel");
        throw null;
    }

    public final K4.d getPresenter() {
        K4.d dVar = this.f13782v;
        if (dVar != null) {
            return dVar;
        }
        j.k("presenter");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d dVarD = AbstractC0405x.d();
        this.f13778r = dVarD;
        AbstractC0405x.x(dVarD, null, new C0040q0(this, (c) null, 12), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        d dVar = this.f13778r;
        if (dVar == null) {
            j.k("scope");
            throw null;
        }
        AbstractC0405x.h(dVar, null);
        super.onDetachedFromWindow();
    }

    public final void setDrawerVisibilityModel(a aVar) {
        j.e(aVar, "<set-?>");
        this.f13783w = aVar;
    }

    public final void setPresenter(K4.d dVar) {
        j.e(dVar, "<set-?>");
        this.f13782v = dVar;
    }
}
