package com.ayah.common.ui.bookmarklist.view.wrapper;

import O3.d;
import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import p025c4.a;
import p035d3.u;
import p035d3.v;
import p218w3.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class BookmarkListWrapper extends Hilt_BookmarkListWrapper {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f13703v = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f13704t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a f13705u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookmarkListWrapper(Context context) {
        super(context);
        j.e(context, "context");
        if (!isInEditMode() && !this.f13707s) {
            this.f13707s = true;
            v vVar = (v) ((Q3.d) c());
            u uVar = vVar.f15683a;
            this.f13704t = new d((p198u3.d) uVar.f15678v.get(), u.a(), (c) uVar.f15642A.get());
            this.f13705u = (a) vVar.f15683a.f15645D.get();
        }
        ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setContent(new p074h0.d(-1631225735, new Q3.a(this, 0), true));
        addView(composeView, -1, -1);
    }

    public final a getDrawerVisibilityModel() {
        a aVar = this.f13705u;
        if (aVar != null) {
            return aVar;
        }
        j.k("drawerVisibilityModel");
        throw null;
    }

    public final d getPresenter() {
        d dVar = this.f13704t;
        if (dVar != null) {
            return dVar;
        }
        j.k("presenter");
        throw null;
    }

    public final void setDrawerVisibilityModel(a aVar) {
        j.e(aVar, "<set-?>");
        this.f13705u = aVar;
    }

    public final void setPresenter(d dVar) {
        j.e(dVar, "<set-?>");
        this.f13704t = dVar;
    }
}
