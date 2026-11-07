package com.ayah.feature.ayahmenu.ui.wrapper;

import android.widget.FrameLayout;
import p030c9.f;
import p051e9.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class Hilt_AyahMenuWrapper extends FrameLayout implements b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f f13766r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13767s;

    @Override // p051e9.b
    public final Object c() {
        if (this.f13766r == null) {
            this.f13766r = new f(this);
        }
        return this.f13766r.c();
    }
}
