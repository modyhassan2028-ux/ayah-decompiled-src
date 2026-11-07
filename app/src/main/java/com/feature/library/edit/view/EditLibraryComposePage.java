package com.ayah.feature.library.edit.view;

import K9.AbstractC0405x;
import P9.d;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import p035d3.u;
import p035d3.v;
import p090i5.b;
import p097j5.a;
import p174r3.c;
import p174r3.l;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class EditLibraryComposePage extends Hilt_EditLibraryComposePage {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f13797v = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f13798t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f13799u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditLibraryComposePage(Context context) {
        super(context);
        j.e(context, "context");
        if (!isInEditMode() && !this.f13801s) {
            this.f13801s = true;
            u uVar = ((v) ((p097j5.b) c())).f15683a;
            this.f13799u = new b((c) uVar.f15667k.get(), (l) uVar.f15674r.get());
        }
        this.f13798t = AbstractC0405x.d();
        int i10 = 0;
        ComposeView composeView = new ComposeView(context, null, 6, i10);
        composeView.setContent(new p074h0.d(-2021717876, new a(this, context, i10), true));
        addView(composeView, new FrameLayout.LayoutParams(-1, -1));
    }

    public final b getEditLibraryPagePresenter() {
        b bVar = this.f13799u;
        if (bVar != null) {
            return bVar;
        }
        j.k("editLibraryPagePresenter");
        throw null;
    }

    public final void setEditLibraryPagePresenter(b bVar) {
        j.e(bVar, "<set-?>");
        this.f13799u = bVar;
    }
}
