package com.ayah.feature.audioconfig;

import A4.n;
import C4.i;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import java.text.NumberFormat;
import p035d3.u;
import p035d3.v;
import p074h0.d;
import p144o3.a;
import p144o3.b;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class AudioConfigWrapper extends Hilt_AudioConfigWrapper {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f13759u = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i f13760t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioConfigWrapper(Context context) {
        this(context, null, 0, 14);
        j.e(context, "context");
    }

    public final i getAudioConfigPresenter() {
        i iVar = this.f13760t;
        if (iVar != null) {
            return iVar;
        }
        j.k("audioConfigPresenter");
        throw null;
    }

    public final void setAudioConfigPresenter(i iVar) {
        j.e(iVar, "<set-?>");
        this.f13760t = iVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioConfigWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        j.e(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioConfigWrapper(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 8);
        j.e(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioConfigWrapper(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10, 0);
        AttributeSet attributeSet2 = null;
        int i12 = 0;
        if (!isInEditMode() && !this.f13762s) {
            this.f13762s = true;
            u uVar = ((v) ((n) c())).f15683a;
            this.f13760t = new i((a) uVar.f15647F.get(), (p218w3.j) uVar.f15681y.get(), u.a(), (b) uVar.f15653L.get());
        }
        NumberFormat numberFormat = p125m4.b.f19615b;
        ComposeView composeView = new ComposeView(context, attributeSet2, 6, i12);
        composeView.setContent(new d(-1570553174, new A4.a(this, numberFormat, context, 0), true));
        addView(composeView, new FrameLayout.LayoutParams(-1, -2));
    }
}
