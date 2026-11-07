package com.ayah.feature.miniplayer;

import C4.g;
import W1.i;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.ayah.R;
import p035d3.l;
import p035d3.v;
import p074h0.d;
import p126m5.b;
import p136n5.e;
import p144o3.h;
import p146o5.a;
import p150o9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class MiniPlayerWrapper extends Hilt_MiniPlayerWrapper {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f13811v = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public e f13812t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a f13813u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MiniPlayerWrapper(Context context) {
        this(context, null, 0, 14);
        j.e(context, "context");
    }

    public final a getAudioPlayerPresenter() {
        a aVar = this.f13813u;
        if (aVar != null) {
            return aVar;
        }
        j.k("audioPlayerPresenter");
        throw null;
    }

    public final e getPlaybackControls() {
        e eVar = this.f13812t;
        if (eVar != null) {
            return eVar;
        }
        j.k("playbackControls");
        throw null;
    }

    public final void setAudioPlayerPresenter(a aVar) {
        j.e(aVar, "<set-?>");
        this.f13813u = aVar;
    }

    public final void setPlaybackControls(e eVar) {
        j.e(eVar, "<set-?>");
        this.f13812t = eVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MiniPlayerWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        j.e(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MiniPlayerWrapper(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 8);
        j.e(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MiniPlayerWrapper(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10, 0);
        c cVar = null;
        Object[] objArr = 0;
        int i12 = 0;
        if (!isInEditMode() && !this.f13810s) {
            this.f13810s = true;
            v vVar = (v) ((b) c());
            l lVar = vVar.f15685c;
            this.f13812t = new p183s6.b(lVar.f15617a, (p144o3.a) lVar.f15618b.f15647F.get());
            this.f13813u = (a) vVar.f15683a.R.get();
        }
        a audioPlayerPresenter = getAudioPlayerPresenter();
        h hVar = audioPlayerPresenter.f20332b;
        H2.j jVar = new H2.j(new g(hVar.f20328a.f4311e, hVar, 19), audioPlayerPresenter.f20331a.f20301c, new i(3, cVar, 4));
        ComposeView composeView = new ComposeView(context, objArr == true ? 1 : 0, 6, i12);
        composeView.setContent(new d(412262744, new p126m5.a(jVar, this, 0), true));
        composeView.setTag(R.id.consume_window_insets_tag, Boolean.FALSE);
        addView(composeView, new FrameLayout.LayoutParams(-2, -2));
    }
}
